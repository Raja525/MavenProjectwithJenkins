package controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Appcontroller {
	
	@RequestMapping("/")
	public void Home(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		res.sendRedirect("Home.jsp");
	}

}
