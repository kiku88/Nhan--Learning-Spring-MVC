package vn.com.vti.springexam.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FortuneController {

	@RequestMapping(value="/fortune",
			produces = "text/html; charset = utf-8 ")
	@ResponseBody
	public String index() {
		Random rnd = new Random();
		int value = rnd.nextInt(3);  
		String text = "";
		switch (value){
			case 0:
				text = "Lucky";
				break;
			case 1:
				text = "Normal";
				break;
			case 2:
				text = "Bad";
				break;
		}
		
		String result ="";
		result += "<html>";
		result += "<head><meta charset= \"UTF-8\" ";
		result += "<body>";
		result += "<p>";
		result += text;
		result += "</p>";
		result += "</body>";
		result += "</html>";
		
		return result;
	}
	
	
}
