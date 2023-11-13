package tr.com.huseyinaydin.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value="/Home", method=RequestMethod.GET)
	public String home(HttpServletRequest request, HttpServletResponse response) throws IOException{
		return "page-home";
	}
	
	@RequestMapping(value={"/Login","/"}, method=RequestMethod.GET)
	public String login(HttpServletRequest request, HttpServletResponse response) throws IOException{
		return "page-login";
	}
	
	@RequestMapping(value={"/Login","/"}, method=RequestMethod.POST)
	public String login(){
		return "page-products";
	}
	
	@RequestMapping(value={"/FacebookLogin"}, method=RequestMethod.POST)
	public String facebookLoginPost(HttpServletRequest request, HttpServletResponse response){
		return "page-login";
	}
	
	@RequestMapping(value={"/FacebookLogin"}, method=RequestMethod.GET)
	public String facebookLoginGet(HttpServletRequest request, HttpServletResponse response){
		return "page-login";
	}
	
	@RequestMapping(value={"/TwitterLogin"}, method=RequestMethod.POST)
	public String twitterLoginPost(HttpServletRequest request, HttpServletResponse response){
		return "page-login";}
	
	@RequestMapping(value={"/TwitterLogin"}, method=RequestMethod.GET)
	public String twitterLoginGet(HttpServletRequest request, HttpServletResponse response){
		return "page-login";
	}
	
	@RequestMapping(value={"/GoogleLogin"}, method=RequestMethod.POST)
	public String googleLoginPost(HttpServletRequest request, HttpServletResponse response){
		return "page-login";
	}
	
	@RequestMapping(value={"/GoogleLogin"}, method=RequestMethod.GET)
	public String googleLoginGet(HttpServletRequest request, HttpServletResponse response){
		return "page-login";
	}
	
	@RequestMapping(value={"/LinkedInLogin"}, method=RequestMethod.POST)
	public String LinkedInLoginPost(HttpServletRequest request, HttpServletResponse response){
		return "page-login";
	}
	
	@RequestMapping(value={"/LinkedInLogin"}, method=RequestMethod.GET)
	public String LinkedInLoginGet(HttpServletRequest request, HttpServletResponse response){
		return "page-login";
	}
	
}