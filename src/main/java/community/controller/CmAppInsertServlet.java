package community.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import community.model.vo.Community;

/**
 * Servlet implementation class CmAppInsertServlet
 */
@WebServlet("/capinsert")
public class CmAppInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CmAppInsertServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 모임 신청서 등록 처리용 컨트롤러

		
		
		
		
		// 강사님꺼 코드! 수정하기!!!! ********************************
		
		// 파일업로드가 있는 전송인 경우임

		// 1. multipart 방식으로 인코딩되어서 전송왔는지 ★반드시 확인, 아니면 에러 페이지를 내보냄
		RequestDispatcher view = null;
		if (!ServletFileUpload.isMultipartContent(request)) {
			view = request.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("message", "form 의 enctype='multipart/form-data' 속성 누락됨.");
			view.forward(request, response);
		}

		// 2. 업로드할 파일의 용량제한 : 10Mbyte(메가바이트)로 제한 한다면
		int maxSize = 1024 * 1024 * 10;

		// 3. 업로드되는 파일의 저장 폴더 지정
		String savePath = request.getSession().getServletContext().getRealPath("/resources/community_upfiles");

		// 4. request 를 MultipartRequest 로 변환해야 함.
		// cos.jar 가 제공하는 클래스를 사용
		// MultipartRequest 객체가 생성되면, 자동으로 폴더에 파일이 저장됨.
		MultipartRequest mrequest = new MultipartRequest(request, savePath, maxSize, "UTF-8",
				new DefaultFileRenamePolicy());

		// 5. 데이터베이스 community 테이블에 기록할 값 추출
		// mrequest 사용해야 함 (MultipRtRequest로 바꿨기 때문에 request 사용 못 함)
		Community community = new Community();

		community.setCommunityId(mrequest.getParameter("cmid"));
		community.(mrequest.getParameter("cmname"));
		community.(mrequest.getParameter("cmintro"));
		community.(mrequest.getParameter("cpctmin"));
		community.(mrequest.getParameter("cpctmax"));
		community.(mrequest.getParameter("interests"));
		community.(mrequest.getParameter("etctext"));	//기타 check시 활성화되는 text
		community.(mrequest.getParameter("originname"));
		community.(mrequest.getParameter(""));
		community.(mrequest.getParameter(""));
		community.(mrequest.getParameter(""));
		community.(mrequest.getParameter(""));
		

		// 업로드 된 원본 파일이름 추출
		String originalFileName = mrequest.getFilesystemName("ofile");
		notice.setOriginalFilepath(originalFileName);

		// 저장된 원본 파일의 이름 바꾸기 하려면 (→첨부된 파일이 있을 때만 해당 : if 사용),
		// 저장 폴더에 같은 이름의 파일이 있을 경우를 대비하기 위함!
		// "년월일시분초.확장자" 형식으로 변경해 봄
		if (originalFileName != null) {
			// 업로드 된 파일이 있을 경우에만 파일명 바꾸기 함

			// 바꿀 파일명에 대한 문자열 만들기

			// 공지글 등록 요청 시점의 날짜정보를 이용함 (대소문자 지켜주기↓)
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

			// 변경할 파일명 만들기
			String renameFileName = sdf.format(new java.sql.Date(System.currentTimeMillis()));

			// 원본 파일의 확장자를 추출해서, 변경 파일명에 붙여줌
			renameFileName += "." + originalFileName.substring(originalFileName.lastIndexOf(".") + 1);

			// 파일명 바꾸기 실행함 : java.io.File 을 이용함
			File originFile = new File(savePath + "\\" + originalFileName);
			File renameFile = new File(savePath + "\\" + renameFileName);

			if (!originFile.renameTo(renameFile)) {
				// renameTo() 메소드가 실패한 경우(false) : 직접 수동으로 바꾸기 함.
				// ⇒ 원본파일 읽어서 파일 복사 후, 원본 파일 삭제로 처리

				FileInputStream fin = new FileInputStream(originFile);
				FileOutputStream fout = new FileOutputStream(renameFile);

				int data = -1; // 결과가 -1 return 이면 끝
				byte[] buffer = new byte[1024];

				while ((data = fin.read(buffer, 0, buffer.length)) != -1) {
					fout.write(buffer, 0, buffer.length);
				}

				fin.close();
				fout.close();
				originFile.delete(); // 원본 파일 삭제
			} // ← renameTo()가 실패했을 경우, 직접 이름 바꾸는 작업

			notice.setRenameFilepath(renameFileName);	//여기에서 저장!!!!!!

		} // ← 업로드 된 파일이 있을 경우

		// 6. 서비스 메소드로 전달하고 결과받기
		int result = new NoticeService().insertNotice(notice);	//드디어 서비스가 작성되기 시작한다! 그리고나서 dao작성한다!

		// 7. 받은 결과로 성공/실패 페이지 내보내기
		if (result > 0) {
			response.sendRedirect("nlist.ad");
		} else {
			view = request.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("message", "새 공지글 등록 실패!!!");
			view.forward(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
