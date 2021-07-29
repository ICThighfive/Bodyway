package user.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import user.model.service.UserService;
import user.model.vo.User;

public class LoginAccessSevlet {
	/**
	 * Servlet implementation class LoginAccessServlet
	 */
	@WebServlet("/loginok")
	public class LoginAccessServlet extends HttpServlet {
		private static final long serialVersionUID = 1L;
	       
	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public LoginAccessServlet() {
	        super();
	        // TODO Auto-generated constructor stub
	    }

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// 로그인 접속 제한/해제 처리용 컨트롤러
			
			String userid = request.getParameter("userid");
			String ok = request.getParameter("ok");
			
			String loginok = null;
			if(ok.equals("true")) {
				loginok = "Y";
			}else {
				loginok = "N";
			}
			
			UserService uservice = new UserService();
			//login_ok 컬럼값 수정처리하고 나서, 성공하면
			int result = uservice.updateLoginOK(userid, loginok);
			
			//회원전체 조회를 다시 실행해서, memberListView.jsp 에
			//list 정보를 다시 보냄 (브라우저 페이지는 새로고침됨)
			ArrayList<User> list = null;
			if(result > 0) {
				list = uservice.selectList();
			}
			
			RequestDispatcher view = null;
			if(result > 0 && list.size() > 0) {
				view = request.getRequestDispatcher("index.jsp");
				request.setAttribute("list", list);
				view.forward(request, response);
			}else {
				view = request.getRequestDispatcher(
						"views/common/error.jsp");
				request.setAttribute("message", 
						userid + " 회원의 로그인 제한/해제 처리 실패!");
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
