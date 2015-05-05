package com.virtualobject.immo.ctrl;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//import com.virtualobject.services.AnnonceService;



@Configuration
@EnableAutoConfiguration
@ComponentScan
public class carteServlet  extends HttpServlet {

	private static final long serialVersionUID = -4560109588084187674L;

//	@Autowired
//	private AnnonceService annonceService;
	
	protected void doService(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {	
		
		//URL de test :
		//		http://localhost:8080/immo/carteServlet/
		// X,Y ou lattitude, longitude : 
		//		http://services.gisgraphy.com/geocoding/geocode?address=9+chemin+de+meaux+neuilly+plaisance&country=FR
		
//		List<AnnonceImmo> annonceList = annonceService.findAll();
//		AnnonceImmo annonce = (AnnonceImmo) annonceList.get(0);
//		double lattitude = annonce.getPointLocalisation().getX();
//		double longitude = annonce.getPointLocalisation().getY();
		
//		request.getSession().setAttribute("lattitude", String.valueOf(lattitude));
//		request.getSession().setAttribute("longitude", String.valueOf(longitude));
		
//		String nextStep = "http://www.openstreetmap.org?mlat="+lattitude+"&mlon="+longitude+"&zoom=17";
//		System.out.println("nextStep="+nextStep);
//		response.sendRedirect(nextStep);
//		
		
		/*
		String nextJSP = "/carte.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
		dispatcher.forward(request,response);
		*/
	}
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doService(request, response);
	}
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doService(request, response);
	}
	
	public carteServlet() {
	}

}
