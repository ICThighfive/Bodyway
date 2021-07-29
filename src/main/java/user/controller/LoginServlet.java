package user.controller;

import java.io.IOException;
import java.security.MessageDigest;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import user.model.service.UserService;
import user.model.vo.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Ŭ���̾�Ʈ�� ��û�� �޴� �޼ҵ�
		// ���۹���� get ������� ��û�� ���� �� �ڵ� �����
		// System.out.println("get ������� ���� ��û��...");
		// response.getWriter().append("Served at: ").append(request.getContextPath());

		// request :
		// ����ڰ� input ���� �Է��� ��, ������Ʈ������ ������ ���� ������ ��
		// ���۹���� get �̸� request head �� ���۰��� ��ϵǼ� ��
		// url �� ������
		// ���۹���� post �̸� request body �� ���۰��� ��ϵǼ� ��
		// url �� �� ������

		// response : ���񽺸� ��û�� Ŭ���̾�Ʈ ������ ������ ����
		// url ip �ּ� ��
		// �������� Ŭ���̾�Ʈ�� ���� ���� request�� response�� ������
		// �Դٰ��� ��

		// 1. ���ۿ� ���� �ѱ��� �ִٸ� ���ڵ� ó����
		request.setCharacterEncoding("utf-8");

		// 2. ���ۿ� �� ������, ���� �Ǵ� ��ü�� ����ϱ�
		// String ���� = request.getParameter("input�� �̸�");
		String userid = request.getParameter("userid");
		String userpwd = request.getParameter("userpwd");
		// System.out.println(userid + ", " + userpwd);

//		// �������� �ܹ��� �˰��� ���� : SHA-512
//		// �ܹ��� : ��ȣȭ�� �ϰ�, ��ȣȭ�� �ȵǴ� �˰���
//		// java.security.MessageDigest Ŭ���� �̿���
//		String cryptoUserpwd = null;
//		try {
//			MessageDigest md = MessageDigest.getInstance("SHA-512");
//			// �н����� ���ڿ��� ��ȣ������ �ٲٷ���, btye[]�� ��ȯ�ؾ� ��
//			byte[] pwdValues = userpwd.getBytes(Charset.forName("UTF-8"));
//			// ��ȣ������ �ٲٱ�
//			md.update(pwdValues);
//			// ��ȣȭ�� btye[]�� String���� �ٲ� : ��ȣ�� ������
//			cryptoUserpwd = Base64.getEncoder().encodeToString(pwdValues);
//			// Ȯ��
//			System.out.println(cryptoUserpwd);
//			System.out.println(cryptoUserpwd.length());
//		} catch (NoSuchAlgorithmException e) {
//			e.printStackTrace();
//		}

		// 3. ���� �޼ҵ�� �����ؼ� �����ϰ� ����ޱ�
		// Member member = new MemberService().selectLogin(userid, userpwd);
		User user = new UserService().selectLogin(userid, userpwd);

		// 4. ���� ����� ���� ����/���� ������ ��������
		if (user != null) { // �α��� ����
			// �α��� Ȯ�ο� ���� ��ü ������
			HttpSession session = request.getSession();
			session.setMaxInactiveInterval(30 * 60); // 30��

			System.out.println("������ ���� ��ü�� id : " + session.getId());

			// �α����� ȸ���� ������ ���ǰ�ü�� ������
			session.setAttribute("loginUser", user);

			// �α��� ������ ������ ������ ����
			response.sendRedirect("index.jsp");

		} else { // �α��� ����
			// ��� ������ �޼��� ������ �� ���� ����

			// ����θ� ����� �� ����.
			// ��� ������ root ���� �����
			RequestDispatcher view = request.getRequestDispatcher("views/common/error.jsp");

			// ������ ��(error.jsp)�� ������ ���� �ִٸ�
			if (user == null) {
				request.setAttribute("message", "�α��� ����! ���̵� �Ǵ� ��ȣ�� �ٽ� Ȯ���ϰ� �α����ϼ���.");
			}

			// ��û�� Ŭ���̾�Ʈ�� ���� ó����
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
