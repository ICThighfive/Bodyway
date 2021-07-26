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
		// ���� ��û�� ��� ó���� ��Ʈ�ѷ�

		
		
		
		
		// ����Բ� �ڵ�! �����ϱ�!!!! ********************************
		
		// ���Ͼ��ε尡 �ִ� ������ �����

		// 1. multipart ������� ���ڵ��Ǿ ���ۿԴ��� �ڹݵ�� Ȯ��, �ƴϸ� ���� �������� ������
		RequestDispatcher view = null;
		if (!ServletFileUpload.isMultipartContent(request)) {
			view = request.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("message", "form �� enctype='multipart/form-data' �Ӽ� ������.");
			view.forward(request, response);
		}

		// 2. ���ε��� ������ �뷮���� : 10Mbyte(�ް�����Ʈ)�� ���� �Ѵٸ�
		int maxSize = 1024 * 1024 * 10;

		// 3. ���ε�Ǵ� ������ ���� ���� ����
		String savePath = request.getSession().getServletContext().getRealPath("/resources/community_upfiles");

		// 4. request �� MultipartRequest �� ��ȯ�ؾ� ��.
		// cos.jar �� �����ϴ� Ŭ������ ���
		// MultipartRequest ��ü�� �����Ǹ�, �ڵ����� ������ ������ �����.
		MultipartRequest mrequest = new MultipartRequest(request, savePath, maxSize, "UTF-8",
				new DefaultFileRenamePolicy());

		// 5. �����ͺ��̽� community ���̺� ����� �� ����
		// mrequest ����ؾ� �� (MultipRtRequest�� �ٲ�� ������ request ��� �� ��)
		Community community = new Community();

		community.setCommunityId(mrequest.getParameter("cmid"));
		community.(mrequest.getParameter("cmname"));
		community.(mrequest.getParameter("cmintro"));
		community.(mrequest.getParameter("cpctmin"));
		community.(mrequest.getParameter("cpctmax"));
		community.(mrequest.getParameter("interests"));
		community.(mrequest.getParameter("etctext"));	//��Ÿ check�� Ȱ��ȭ�Ǵ� text
		community.(mrequest.getParameter("originname"));
		community.(mrequest.getParameter(""));
		community.(mrequest.getParameter(""));
		community.(mrequest.getParameter(""));
		community.(mrequest.getParameter(""));
		

		// ���ε� �� ���� �����̸� ����
		String originalFileName = mrequest.getFilesystemName("ofile");
		notice.setOriginalFilepath(originalFileName);

		// ����� ���� ������ �̸� �ٲٱ� �Ϸ��� (��÷�ε� ������ ���� ���� �ش� : if ���),
		// ���� ������ ���� �̸��� ������ ���� ��츦 ����ϱ� ����!
		// "����Ͻú���.Ȯ����" �������� ������ ��
		if (originalFileName != null) {
			// ���ε� �� ������ ���� ��쿡�� ���ϸ� �ٲٱ� ��

			// �ٲ� ���ϸ� ���� ���ڿ� �����

			// ������ ��� ��û ������ ��¥������ �̿��� (��ҹ��� �����ֱ��)
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

			// ������ ���ϸ� �����
			String renameFileName = sdf.format(new java.sql.Date(System.currentTimeMillis()));

			// ���� ������ Ȯ���ڸ� �����ؼ�, ���� ���ϸ� �ٿ���
			renameFileName += "." + originalFileName.substring(originalFileName.lastIndexOf(".") + 1);

			// ���ϸ� �ٲٱ� ������ : java.io.File �� �̿���
			File originFile = new File(savePath + "\\" + originalFileName);
			File renameFile = new File(savePath + "\\" + renameFileName);

			if (!originFile.renameTo(renameFile)) {
				// renameTo() �޼ҵ尡 ������ ���(false) : ���� �������� �ٲٱ� ��.
				// �� �������� �о ���� ���� ��, ���� ���� ������ ó��

				FileInputStream fin = new FileInputStream(originFile);
				FileOutputStream fout = new FileOutputStream(renameFile);

				int data = -1; // ����� -1 return �̸� ��
				byte[] buffer = new byte[1024];

				while ((data = fin.read(buffer, 0, buffer.length)) != -1) {
					fout.write(buffer, 0, buffer.length);
				}

				fin.close();
				fout.close();
				originFile.delete(); // ���� ���� ����
			} // �� renameTo()�� �������� ���, ���� �̸� �ٲٴ� �۾�

			notice.setRenameFilepath(renameFileName);	//���⿡�� ����!!!!!!

		} // �� ���ε� �� ������ ���� ���

		// 6. ���� �޼ҵ�� �����ϰ� ����ޱ�
		int result = new NoticeService().insertNotice(notice);	//���� ���񽺰� �ۼ��Ǳ� �����Ѵ�! �׸����� dao�ۼ��Ѵ�!

		// 7. ���� ����� ����/���� ������ ��������
		if (result > 0) {
			response.sendRedirect("nlist.ad");
		} else {
			view = request.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("message", "�� ������ ��� ����!!!");
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
