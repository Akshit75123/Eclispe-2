package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {
	//name of the view
	//video - 5
	@RequestMapping(path = "/home", method = RequestMethod.GET) //video - 9
	public String home(Model model) { //video - 6 (Model)
		System.out.println("this is home url");
		//sending data to view with model
		model.addAttribute("name","akshit");
		model.addAttribute("num",12);
		
		List<String> friends = new ArrayList<>();
		friends.add("Vandana");
		friends.add("Roshni");
		friends.add("abc");
		model.addAttribute("f",friends);
		
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about page");
		return "about";
	} 
	
	//video - 7 (ModelAndView)
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("help page print");
		
		ModelAndView mv = new ModelAndView();
		//setting the data
		mv.addObject("name","akshit panwar");
		
		//video - 8 (JSTL)
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(2121);
		list.add(232);
		list.add(2322);
		mv.addObject("list",list);
		
		//setting the view page
		mv.setViewName("help");
		return mv;
	}
}
