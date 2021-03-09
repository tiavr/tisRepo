package com.servlets;


import java.io.*;
import com.beans.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class OpenClassroom extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		/* Cr�ation et initialisation du message. */
		String paramAuteur = request.getParameter( "auteur" );
		String message = "Transmission de variables : OK ! " + paramAuteur;
			
		/* Cr�ation du bean */
		Coyote premierBean = new Coyote();
		/* Initialisation de ses propri�t�s */
		premierBean.setNom( "Coyote" );
		premierBean.setPrenom( "Wile E." );
			
		/* Stockage du message et du bean dans l'objet request */
		request.setAttribute( "test", message );
		request.setAttribute( "coyote", premierBean );
			
		/* Transmission de la paire d'objets request/response � notre JSP */
		this.getServletContext().getRequestDispatcher( "src/main/webapp/WEB-INF/index.jsp" ).forward( request, response );
}
}