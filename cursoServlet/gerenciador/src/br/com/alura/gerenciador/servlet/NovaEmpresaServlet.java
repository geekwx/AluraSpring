package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		System.out.println("Cadastrando um nova empresa");
		 String nomeEmpresa = req.getParameter("nome");
		PrintWriter out = resp.getWriter();
		out.println("<html lang=\"en\"><body><h3>Empresa "+nomeEmpresa + " Cadastrada com sucesso</h3>    </body></html>");
		
	}

}
