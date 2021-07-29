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
			// ?šŒ?› ê°??… ì²˜ë¦¬?š© ì»¨íŠ¸ë¡¤ëŸ¬
			//1. ? „?†¡?˜¨ ê°’ì— ?•œê¸??´ ?ˆ?‹¤ë©? ?¸ì½”ë”©ì²˜ë¦¬?•¨
			request.setCharacterEncoding("utf-8");
			
			//2. ? „?†¡?˜¨ ê°? êº¼ë‚´?„œ, ë³??ˆ˜ ?˜?Š” ê°ì²´?— ê¸°ë¡ ???¥
			User user = new User();
			
			user.setUser_id(request.getParameter("userid"));
			user.setUser_pwd(request.getParameter("username"));
			//member.setUserPwd(request.getParameter("userpwd"));
			user.setGender(request.getParameter("gender"));
			//user.setUser_age(Integer.parseInt(request.getParameter("user_age")));
			user.setUser_phone(request.getParameter("phone"));
			user.setUser_email(request.getParameter("email"));
			//user.setEtc(request.getParameter("etc"));
			
			//checkbox ? „?†¡?˜•?ƒœ : 
			//hobby=game&hobby=reading&hobby=cook
			String[] height = request.getParameterValues("height");
			//ë¬¸ì?—´ë°°ì—´?„ ?•˜?‚˜?˜ String ?œ¼ë¡? ë³??™˜?•¨, êµ¬ë¶„??Š” "," ?‚¬?š©?•œ?‹¤ë©?
		//	String user_height = String.join(",", user_height);
			user.setUser_height(user_height);
			
			//?Œ¨?Š¤?›Œ?“œ ?•”?˜¸?™” ì²˜ë¦¬ ? ?š© ---------------------------
			//?‰ë¬? ?ƒ?ƒœ?˜ ?šŒ?› ?Œ¨?Š¤?›Œ?“œ ì¶”ì¶œ
			String userpwd = request.getParameter("user_pwd");
			
			//?›¹?—?„œ?Š” ?‹¨ë°©í–¥ ?•Œê³ ë¦¬ì¦? ? ?š© : SHA-512
			//?‹¨ë°©í–¥ : ?•”?˜¸?™”ë§? ?•˜ê³?, ë³µí˜¸?™”ê°? ?•ˆ?˜?Š” ?•Œê³ ë¦¬ì¦?
			//java.security.MessageDigest ?´?˜?Š¤ ?´?š©?•¨
			String cryptoUserpwd = null;
			try {
				MessageDigest md = 
						MessageDigest.getInstance("SHA-512");
				//?Œ¨?Š¤?›Œ?“œ ë¬¸ì?—´?„ ?•”?˜¸ë¬¸ìœ¼ë¡? ë°”ê¾¸? ¤ë©?, btye[]ë¡? ë³??™˜?•´?•¼ ?•¨
				byte[] pwdValues = 
						userpwd.getBytes(Charset.forName("UTF-8"));
				//?•”?˜¸ë¬¸ìœ¼ë¡? ë°”ê¾¸ê¸?
				md.update(pwdValues);
				//?•”?˜¸?™”?œ btye[]?„ String?œ¼ë¡? ë°”ê¿ˆ : ?•”?˜¸ë¬? ?ƒ?ƒœ?„
				cryptoUserpwd = Base64.getEncoder()
								.encodeToString(pwdValues);
				//?™•?¸
				System.out.println(cryptoUserpwd);
				System.out.println(cryptoUserpwd.length());
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			}
			
			user.setUser_pwd(cryptoUserpwd);
			//--------------------------------------------------------
			
			//3. ?„œë¹„ìŠ¤ìª? ë©”ì†Œ?“œë¡? ê°? ? „?‹¬?•˜ë©´ì„œ ?‹¤?–‰?•˜ê³?, ê²°ê³¼ë°›ê¸°
			int result = new UserService().insertUser(user);
			
			//4. ë°›ì? ê²°ê³¼?— ?”°?¼ ?„±ê³?/?‹¤?Œ¨ ?˜?´ì§?ë¥? ?‚´ë³´ëƒ„
			if(result > 0) {
				//ë¡œê·¸?¸ ?˜?´ì§?ë¡? ?´?™ ì²˜ë¦¬
				response.sendRedirect("/bodyway/views/user/login.jsp");
			}else {
				//error.jsp ë¡? ?—?Ÿ¬ë©”ì„¸ì§?ë¥? ?‚´ë³´ëƒ„
				//?ƒ??ê²½ë¡œë§? ?‚¬?š©?•  ?ˆ˜ ?ˆ?Œ.
				RequestDispatcher view = 
						request.getRequestDispatcher("views/common/error.jsp");
				
				//ì§?? •?•œ ë·°ë¡œ ?‚´ë³´ë‚¼ ? •ë³´ë‚˜ ê°ì²´ê°? ?ˆ?‹¤ë©?
				//request ?— ê¸°ë¡?•¨ : setAttribute(String key, Object value)
				request.setAttribute("message", "?šŒ?› ê°??… ?‹¤?Œ¨!");
				
				//ë·? ?‚´ë³´ëƒ„
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
