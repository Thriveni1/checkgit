package com.hms;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("stringData") //endpoint1
	public String exposrString(){
		return "i am a normal  string value";
	}
	@RequestMapping("htmlData") //endpoint1
	public String exposrHtml(){
		return "<h1>i am a normal  string value</h1>";
	}
	
	@RequestMapping("jsonData") //endpoint1
	public Product exposejson(){
		Product p=new Product(1001,"tc",19000);
		return p;
	}
	@RequestMapping("allJsonData") //endpoint1
	public List<Product> exposeAlljson(){
		Product p1=new Product(1001,"tv",19000);
		Product p2=new Product(1002,"fridge",19000);
		Product p3=new Product(1003,"ac",19000);
		ArrayList<Product> pList=new ArrayList<>();
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		return pList;
	}
}
