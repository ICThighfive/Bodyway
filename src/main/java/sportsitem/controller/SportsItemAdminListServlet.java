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
		// �����ڿ� ���ǰ ��Ϻ��� ó���� ��Ʈ�ѷ� + ����¡

//				ArrayList<SportsItem> list = new SportsItemService().selectList();
//
//				RequestDispatcher view = null;
//				if (list.size() > 0) {
//					view = request.getRequestDispatcher("views/sportsitem/sportsitemAdminListView.jsp");
//					request.setAttribute("list", list);
//					view.forward(request, response);
//				} else {
//					view = request.getRequestDispatcher("views/common/error.jsp");
//					request.setAttribute("message", "���ǰ ��� ��ȸ ����!");
//					view.forward(request, response);
//				}
		//����� ������ ����
				int currentPage = 1;
				//���� �� ������ ���� �ִٸ� ������
				if(request.getParameter("page") != null) {
					currentPage = Integer.parseInt(request.getParameter("page"));
				}
				
				//�� �������� ����� ��� ���� ����
				int limit = 10;
				
				//��ȸ�� ���� ��ü ����
				SportsItemService siservice = new SportsItemService();
				
				//�� ������ �� ����� ���� ��� ���� ��ȸ
				int listCount = siservice.getListCount();
				System.out.println("�� ��� ���� : " + listCount);
				
				//��û�� �������� ��µ� ����� �� ��ȣ�� ���
				//�� �������� ����� ��� ������ 10���� ���
				//3page �� ��û�Ǿ��ٸ� ���ȣ�� 21 ~ 30����.
				int startRow = (currentPage - 1) * limit + 1;
				int endRow = startRow + limit - 1;
				
				//���񽺷� �ش� �������� ����� �Խñ۸� ��ȸ�� ��
				ArrayList<SportsItem> list = siservice.selectList(startRow, endRow);
				
				//�� �������� ���� ������ ������ ���� ���� ��� ó��
				//�� ������ �� : �� ����� 21���� ���
				//�� �������� ����� ����� 10���̸�, �������� 3�� 
				int maxPage = (int)((double)listCount / limit + 0.9);
				
				//�信 ����� �������׷��� ���� ������ ����
				//�� ��� �Ʒ��ʿ� ������ ���ڸ� 10���� ����Ѵٸ�...
				//���� �������� 3�������̸�, ������ �׷��� 1 ~ 10 �� ��
				//���� �������� 15�������̸�, ������ �׷��� 11 ~ 20�� ��
				int startPage = (((int)((double)currentPage / limit + 0.9)) - 1) * limit + 1;
				int endPage = startPage + limit - 1;
				
				//�������� ���� ������ �׷��� ������ ���� ����
				if(maxPage < endPage) {
					endPage = maxPage;
				}
				
				//�� �����ؼ� ��������
				RequestDispatcher view = null;
				if(list.size() > 0) {
					view = request.getRequestDispatcher("views/sportsitem/sportsitemAdminListView.jsp");
					
					request.setAttribute("list", list);
					request.setAttribute("currentPage", currentPage);
					request.setAttribute("maxPage", maxPage);
					request.setAttribute("startPage", startPage);
					request.setAttribute("endPage", endPage);
					request.setAttribute("listCount", listCount);
					
					view.forward(request, response);
				}else {
					view = request.getRequestDispatcher("views/common/error.jsp");
					request.setAttribute("message", currentPage + " �������� ���� ��� ��ȸ ����!");
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
