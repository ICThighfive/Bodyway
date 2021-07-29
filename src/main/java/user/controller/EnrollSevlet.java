package user.controller;

import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import user.model.service.UserService;
import user.model.vo.User;

public class EnrollSevlet {

	/**
	 * Servlet implementation class EnrollServlet
	 */
	@WebServlet("/enroll")
	public class EnrollServlet extends HttpServlet {
		private static final long serialVersionUID = 1L;
		private String user_height;
	       
	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public EnrollServlet() {
	        super();
	        // TODO Auto-generated constructor stub
	    }

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// ?��?�� �??�� 처리?�� 컨트롤러
			//1. ?��?��?�� 값에 ?���??�� ?��?���? ?��코딩처리?��
			request.setCharacterEncoding("utf-8");
			
			//2. ?��?��?�� �? 꺼내?��, �??�� ?��?�� 객체?�� 기록 ???��
			User user = new User();
			
			user.setUser_id(request.getParameter("userid"));
			user.setUser_pwd(request.getParameter("username"));
			//member.setUserPwd(request.getParameter("userpwd"));
			user.setGender(request.getParameter("gender"));
			//user.setUser_age(Integer.parseInt(request.getParameter("user_age")));
			user.setUser_phone(request.getParameter("phone"));
			user.setUser_email(request.getParameter("email"));
			//user.setEtc(request.getParameter("etc"));
			
			//checkbox ?��?��?��?�� : 
			//hobby=game&hobby=reading&hobby=cook
			String[] height = request.getParameterValues("height");
			//문자?��배열?�� ?��?��?�� String ?���? �??��?��, 구분?��?�� "," ?��?��?��?���?
		//	String user_height = String.join(",", user_height);
			user.setUser_height(user_height);
			
			//?��?��?��?�� ?��?��?�� 처리 ?��?�� ---------------------------
			//?���? ?��?��?�� ?��?�� ?��?��?��?�� 추출
			String userpwd = request.getParameter("user_pwd");
			
			//?��?��?��?�� ?��방향 ?��고리�? ?��?�� : SHA-512
			//?��방향 : ?��?��?���? ?���?, 복호?���? ?��?��?�� ?��고리�?
			//java.security.MessageDigest ?��?��?�� ?��?��?��
			String cryptoUserpwd = null;
			try {
				MessageDigest md = 
						MessageDigest.getInstance("SHA-512");
				//?��?��?��?�� 문자?��?�� ?��?��문으�? 바꾸?���?, btye[]�? �??��?��?�� ?��
				byte[] pwdValues = 
						userpwd.getBytes(Charset.forName("UTF-8"));
				//?��?��문으�? 바꾸�?
				md.update(pwdValues);
				//?��?��?��?�� btye[]?�� String?���? 바꿈 : ?��?���? ?��?��?��
				cryptoUserpwd = Base64.getEncoder()
								.encodeToString(pwdValues);
				//?��?��
				System.out.println(cryptoUserpwd);
				System.out.println(cryptoUserpwd.length());
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			}
			
			user.setUser_pwd(cryptoUserpwd);
			//--------------------------------------------------------
			
			//3. ?��비스�? 메소?���? �? ?��?��?��면서 ?��?��?���?, 결과받기
			int result = new UserService().insertUser(user);
			
			//4. 받�? 결과?�� ?��?�� ?���?/?��?�� ?��?���?�? ?��보냄
			if(result > 0) {
				//로그?�� ?��?���?�? ?��?�� 처리
				response.sendRedirect("/bodyway/views/user/login.jsp");
			}else {
				//error.jsp �? ?��?��메세�?�? ?��보냄
				//?��??경로�? ?��?��?�� ?�� ?��?��.
				RequestDispatcher view = 
						request.getRequestDispatcher("views/common/error.jsp");
				
				//�??��?�� 뷰로 ?��보낼 ?��보나 객체�? ?��?���?
				//request ?�� 기록?�� : setAttribute(String key, Object value)
				request.setAttribute("message", "?��?�� �??�� ?��?��!");
				
				//�? ?��보냄
				view.forward(request, response);
			}
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doGet(request, response);
		}

	}

}
