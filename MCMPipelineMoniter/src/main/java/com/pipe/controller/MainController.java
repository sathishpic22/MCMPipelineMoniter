package com.pipe.controller;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.pipe.model.PipelineMoniter;
import com.pipe.repositary.PipelineRepositary;
@Controller
public class MainController {
	@Autowired
	PipelineRepositary piperepo;
	
	@RequestMapping("/save" )

	public String index() {
		PipelineMoniter p=new PipelineMoniter();
		
		p.setPipelineId(120120211);
		p.setCustomerName("Sathish");
		p.setDateofEnquiry(new Date());
		
		System.out.println(piperepo.save(p));
		
		return "save.jsp";
		
		
	}
	@RequestMapping(value="/test" )
	public String login( Model m) {
		
List<PipelineMoniter> pllist = new ArrayList<>();

pllist=(List<PipelineMoniter>) piperepo.findAll();
m.addAttribute("plist", pllist);

	return  "login.jsp";
	}	

}
