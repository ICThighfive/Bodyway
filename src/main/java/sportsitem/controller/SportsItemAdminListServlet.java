package sportsitem.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sportsitem.model.service.SportsItemService;
import sportsitem.model.vo.SportsItem;

/**
 * Servlet implementation class SportsItemAdminListServlet
 */
@WebServlet("/silist.ad")
public class SportsItemAdminListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SportsItemAdminListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// �����ڿ� ���ǰ ��Ϻ��� ó���� ��Ʈ�ѷ�

				ArrayList<SportsItem> list = new SportsItemService().selectList();

				RequestDispatcher view = null;
				if (list.size() > 0) {
					view = request.getRequestDispatcher("views/sportsitem/sportsitemAdminListView.jsp");
					request.setAttribute("list", list);
					view.forward(request, response);
				} else {
					view = request.getRequestDispatcher("views/common/error.jsp");
					request.setAttribute("message", "���ǰ ��� ��ȸ ����!");
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
