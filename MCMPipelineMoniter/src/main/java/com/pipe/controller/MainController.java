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
	@RequestMapping("/" )
public String index() {
		
	return "newpipeline.jsp";
		
}	

}
