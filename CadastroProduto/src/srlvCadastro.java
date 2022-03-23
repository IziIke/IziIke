

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pjAula03.Contato;

@WebServlet("/srlvCadastro")
public class srlvCadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public srlvCadastro() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	Contato novo = new Contato();
	
	novo.setCodproduto(request.getParameter("Codproduto"));
	novo.setDescricao(request.getParameter("Descricao"));
	novo.setUnidademed(request.getParameter("Unidademed"));
	novo.setLocal(request.getParameter("Local"));
	novo.setPreco(request.getParameter("Preco"));
	novo.setData(request.getParameter("Data"));
	novo.setDepart(request.getParameter("Depart"));
	

	
	novo.setObserv(request.getParameter("Observ"));
	System.out.println(novo);
	response.getWriter().append("<html></head>");
	response.getWriter().append("<body> Ação Realizada com Sucesso!</body>");
	response.getWriter().append("</html>");
	}
}	

