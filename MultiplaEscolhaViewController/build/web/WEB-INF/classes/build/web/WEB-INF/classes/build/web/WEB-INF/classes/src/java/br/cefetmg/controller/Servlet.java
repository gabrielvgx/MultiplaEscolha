package br.cefetmg.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jaops
 */
public class Servlet extends HttpServlet {
    private String jsp = "";
    
    @Override
    protected void service (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String acao = request.getParameter("acao");
        if(acao.equals("Logar")){ 
            jsp = Login.execute(request);
        }
        if(acao.equals("GravarUsuario")){
        // Tem que ter uma classe suporte que grava o usuario no BD com o nome "insereUsuario"
            //jsp = insereUsuario.execute(request);
        }
        
        RequestDispatcher rd = request.getRequestDispatcher(jsp);
        rd.forward(request, response);
    }


}

