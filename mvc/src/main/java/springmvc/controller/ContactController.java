package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;

@Controller
public class ContactController {
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "Akshit");
		m.addAttribute("d","panwar");
	}
	
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	//video - 11 (RequestParam annotation)
	//@RequestMapping(path = "/processform", method = RequestMethod.POST)
	//public String handleForm(
			//@RequestParam("email") String email, 
			//@RequestParam("uname") String username,
			//@RequestParam("pass") String password, 
			//Model model ) {
		/*
		 * System.out.println(email + " " + username+" " + password);
		 * model.addAttribute("email",email); 
		 * model.addAttribute("uname",username);
		 * model.addAttribute("pass",password);
		 */
		
		//video - 12 (creating model(data) class for storing the request data in the object) 
		//User user = new User(email,username,password); //constructor entry
		//System.out.println(user);
		//model.addAttribute("user",user);
		
		//return "sucess";
	//}
	//video - 12 ModelAttribute annotation
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
		return "sucess";
	}	
	/*
	 * Model Attribute is doing three important tasks : -
	 * 1. Fetching the values from HttpServletRequest i.e. work of @RequestParam
	 * 2. Creating object of User model and adding the values of email,username and password in the email, uname and pass fields of the User class
	 * 3. Setting attributes of model and passing the data to the sucess.jsp. 
	*/
	
	
}
