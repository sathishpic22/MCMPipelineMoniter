package com.pipe.controller;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.pipe.model.User;
import com.pipe.repositary.PipelineRepositary;
import com.pipe.repositary.UserRepositary;
import com.pipe.service.PipelineService;
@Controller
public class MainController {
	@Autowired
	PipelineRepositary pipelinerepositery;
	@Autowired
	UserRepositary userrepositery;
	@Autowired
	PipelineService pipelineservice;
	
	@RequestMapping("/" )
public ModelAndView index() {

	return new ModelAndView("index");
		
	}	
@RequestMapping("/login")
public ModelAndView logins(
		@RequestParam("username") String username,
		@RequestParam("password") String password, Model m)  {
	
	
	List<User> userlist=(List<User>) userrepositery.findAll();
	Iterator<User> i=userlist.iterator();
	
	
	while(i.hasNext()) {
		User users=i.next();
	if(users.getUsername().equalsIgnoreCase(username)&&users.getPassword().equalsIgnoreCase(password)&&users.getUserType().equalsIgnoreCase("user")) {
		return new ModelAndView("loginsuccess");
		
	}
	else if(users.getUsername().equalsIgnoreCase(username)&&users.getPassword().equalsIgnoreCase(password)&&users.getUserType().equalsIgnoreCase("user")) {
		
	}
	
	}
	
	String message="The Username or Passwod entered wrong";
	m.addAttribute("errormessage",message);
	
	return new ModelAndView( "index");
}
@RequestMapping("/newpipeline")
public ModelAndView newPipeline() {
	return new ModelAndView( "newpipeline");
}
@RequestMapping("/newenquiry")
	public ModelAndView newPipeline(
			@RequestParam("pipelineid") long pipelineid,
			@RequestParam("customername") String customername,
			@RequestParam("channel") String channel,
			@RequestParam("status") String status,
			@RequestParam("ordervalue") long ordervalue,
			@RequestParam("location") String location,
			@RequestParam("phone") long phone,
			@RequestParam("instaid") String instaid,
			@RequestParam("dateofenquiry") @DateTimeFormat(pattern="yyyy-MM-dd") Date enquirydate,
			@RequestParam("lastfollowed") @DateTimeFormat(pattern="yyyy-MM-dd") Date lastfollowed,
			@RequestParam("nextfollowdate") @DateTimeFormat(pattern="yyyy-MM-dd") Date  nextfollowdate,
			@RequestParam("email") String email,
			@RequestParam("ordertype") String ordertype) {
	ModelAndView newpipelineview=new ModelAndView();
newpipelineview.setViewName("newpipeline");
	
if(pipelineservice.newPipeline(pipelineid, customername, channel, status, ordervalue, location, phone, instaid, 
		enquirydate, email, ordertype, lastfollowed, nextfollowdate)!=null){
			newpipelineview.addObject("success", "New Pipeline Added Successfully");
		}
	  
	  
 

return newpipelineview;
		
	}
@RequestMapping("/statusupdateview")
public ModelAndView statusUpdateView() {
	return new ModelAndView( "statusupdate");
}

@RequestMapping("/statusupdate")
public ModelAndView StatusUpdate(@RequestParam("pipelineid") long pipelineid,
		@RequestParam("statusmsg") String statusmsg) {

ModelAndView statusview=new ModelAndView();
statusview.setViewName("statusupdate");

	
	if(pipelineservice.updateStatus(pipelineid, statusmsg)==true){
	
		statusview.addObject("Success", "Status Updated successfully");
		}
	else {
		statusview.addObject("ErrorMessage", "Enter Valid PipelineId");
	}
	return statusview;
}
@RequestMapping("/lastfollowedview")
public ModelAndView lastFollowedView() {
	return new ModelAndView("lastfollowdate");
	
}
@RequestMapping("lastfollowdateform")
public ModelAndView lastFollowForm(@RequestParam("pipelineid") long pipelineid,
		@RequestParam("lastfollowed") @DateTimeFormat(pattern="yyyy-MM-dd") Date lastfollowed,
		@RequestParam("nextfollowdate") @DateTimeFormat(pattern="yyyy-MM-dd") Date  nextfollowdate) {
	
	ModelAndView statusview=new ModelAndView();
	statusview.setViewName("lastfollowdate");
	if(pipelineservice.updateLastFollowDate(pipelineid, lastfollowed, nextfollowdate)==true) {
		
		statusview.addObject("Success", "LastFollowDate Updated Successfully");
}
else {
statusview.addObject("ErrorMessage", "Enter Valid PipelineId");
}

return statusview;
	
}
@RequestMapping("/salesupdateview")
public ModelAndView salesUpdateView() {
	return new ModelAndView("saleupdate");
	
}
@RequestMapping("saleupdate")
public ModelAndView salesUpdate(@RequestParam("pipelineid") Long pipelineid,
		@RequestParam("saledate") @DateTimeFormat(pattern="yyyy-MM-dd") Date saledate,
		@RequestParam("paymentmode") String paymentmode) {
	
	ModelAndView statusview=new ModelAndView();
	statusview.setViewName("saleupdate");
	if(pipelineservice.saleUpdate(pipelineid,saledate,paymentmode)==true) {
		
		statusview.addObject("Success", "Sale Updated Successfully");
}
else {
statusview.addObject("ErrorMessage", "Enter Valid PipelineId");
}

return statusview;
	
}
@RequestMapping("logout")
public ModelAndView logout() {
	ModelAndView logoutview=new ModelAndView();
	logoutview.addObject("logoutmessage", "Logout Successfull");
	logoutview.setViewName("index");
	return logoutview;
	
}



}
