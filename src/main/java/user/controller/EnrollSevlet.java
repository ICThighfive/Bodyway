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
			// ?? κ°?? μ²λ¦¬?© μ»¨νΈλ‘€λ¬
			//1. ? ?‘?¨ κ°μ ?κΈ??΄ ??€λ©? ?Έμ½λ©μ²λ¦¬?¨
			request.setCharacterEncoding("utf-8");
			
			//2. ? ?‘?¨ κ°? κΊΌλ΄?, λ³?? ?? κ°μ²΄? κΈ°λ‘ ???₯
			User user = new User();
			
			user.setUser_id(request.getParameter("userid"));
			user.setUser_pwd(request.getParameter("username"));
			//member.setUserPwd(request.getParameter("userpwd"));
			user.setGender(request.getParameter("gender"));
			//user.setUser_age(Integer.parseInt(request.getParameter("user_age")));
			user.setUser_phone(request.getParameter("phone"));
			user.setUser_email(request.getParameter("email"));
			//user.setEtc(request.getParameter("etc"));
			
			//checkbox ? ?‘?? : 
			//hobby=game&hobby=reading&hobby=cook
			String[] height = request.getParameterValues("height");
			//λ¬Έμ?΄λ°°μ΄? ??? String ?Όλ‘? λ³???¨, κ΅¬λΆ?? "," ?¬?©??€λ©?
		//	String user_height = String.join(",", user_height);
			user.setUser_height(user_height);
			
			//?¨?€?? ??Έ? μ²λ¦¬ ? ?© ---------------------------
			//?λ¬? ??? ?? ?¨?€?? μΆμΆ
			String userpwd = request.getParameter("user_pwd");
			
			//?Ή??? ?¨λ°©ν₯ ?κ³ λ¦¬μ¦? ? ?© : SHA-512
			//?¨λ°©ν₯ : ??Έ?λ§? ?κ³?, λ³΅νΈ?κ°? ??? ?κ³ λ¦¬μ¦?
			//java.security.MessageDigest ?΄??€ ?΄?©?¨
			String cryptoUserpwd = null;
			try {
				MessageDigest md = 
						MessageDigest.getInstance("SHA-512");
				//?¨?€?? λ¬Έμ?΄? ??Έλ¬ΈμΌλ‘? λ°κΎΈ? €λ©?, btye[]λ‘? λ³???΄?Ό ?¨
				byte[] pwdValues = 
						userpwd.getBytes(Charset.forName("UTF-8"));
				//??Έλ¬ΈμΌλ‘? λ°κΎΈκΈ?
				md.update(pwdValues);
				//??Έ?? btye[]? String?Όλ‘? λ°κΏ : ??Έλ¬? ???
				cryptoUserpwd = Base64.getEncoder()
								.encodeToString(pwdValues);
				//??Έ
				System.out.println(cryptoUserpwd);
				System.out.println(cryptoUserpwd.length());
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			}
			
			user.setUser_pwd(cryptoUserpwd);
			//--------------------------------------------------------
			
			//3. ?λΉμ€μͺ? λ©μ?λ‘? κ°? ? ?¬?λ©΄μ ?€??κ³?, κ²°κ³Όλ°κΈ°
			int result = new UserService().insertUser(user);
			
			//4. λ°μ? κ²°κ³Ό? ?°?Ό ?±κ³?/?€?¨ ??΄μ§?λ₯? ?΄λ³΄λ
			if(result > 0) {
				//λ‘κ·Έ?Έ ??΄μ§?λ‘? ?΄? μ²λ¦¬
				response.sendRedirect("/bodyway/views/user/login.jsp");
			}else {
				//error.jsp λ‘? ??¬λ©μΈμ§?λ₯? ?΄λ³΄λ
				//???κ²½λ‘λ§? ?¬?©?  ? ??.
				RequestDispatcher view = 
						request.getRequestDispatcher("views/common/error.jsp");
				
				//μ§?? ? λ·°λ‘ ?΄λ³΄λΌ ? λ³΄λ κ°μ²΄κ°? ??€λ©?
				//request ? κΈ°λ‘?¨ : setAttribute(String key, Object value)
				request.setAttribute("message", "?? κ°?? ?€?¨!");
				
				//λ·? ?΄λ³΄λ
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
