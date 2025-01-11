package com.softpro.SITP.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.softpro.SITP.Dto.AdminInfoDto;
import com.softpro.SITP.Dto.StudentInfoDto;
import com.softpro.SITP.Repository.AdminInfoRepo;
import com.softpro.SITP.Repository.StudentInfoRepo;
import com.softpro.SITP.model.AdminInfo;
import com.softpro.SITP.model.StudentInfo;

import jakarta.servlet.http.HttpSession;

@Controller
@CrossOrigin(origins = "*")
public class MainController {
	
	@Autowired
	AdminInfoRepo adrepo;
	
	@Autowired
	StudentInfoRepo stdrepo;
	

	@GetMapping("/")
	public String ShowIndex(Model model)
	{
		model.addAttribute("active1", "active nav-link");
		return "index";
	}
	
//	@GetMapping("/aboutus")
//	public String ShowAboutUs(Model model)
//	{
//		model.addAttribute("active2", "active nav-link");
//		return "aboutus";
//	}
	
	@GetMapping("/adminlogin")
	public String ShowAdminLogin(Model model)
	{
		AdminInfoDto dto = new AdminInfoDto();
		model.addAttribute("dto", dto);
		model.addAttribute("active3", "active nav-link");
		return "adminlogin";
	}
	
	@PostMapping("/adminlogin")
	public String AdminLogin(@ModelAttribute AdminInfoDto dto, RedirectAttributes attributes, HttpSession session)
	{
		try {
			AdminInfo adinfo = adrepo.getById(dto.getUserid());
			if(adinfo.getPassword().equals(dto.getPassword()))
			{
				session.setAttribute("admin", dto.getUserid());
				return "redirect:/admin/adhome";
			}
			else
			{
				attributes.addFlashAttribute("msg","Invalid User!");
				return "redirect:/adminlogin";
			}
			
		} catch (Exception e) {
			attributes.addFlashAttribute("msg","User does not Exists!");
			return "redirect:/adminlogin";
		}
	}
	
	@GetMapping("/studentlogin")
	public String ShowStudentLogin(Model model)
	{	
		return "studentlogin";
	}
	
	//Student Login Through Modal
	@PostMapping("/studentlogin")
	public ResponseEntity<String> login(@RequestBody StudentInfoDto dto, HttpSession session) {
		// Optional<StudentInfo> userOptional = stdrepo.findByUserId(dto.getEmail());
		StudentInfo stdinfo = stdrepo.findByEmail(dto.getEmail());
		if (stdinfo != null) {
			// StudentInfo stdinfo = userOptional.get();
			if (stdinfo.getPassword().equals(dto.getPassword())) {
				if(stdinfo.getStatus().equals("true"))
				{
					session.setAttribute("student", stdinfo.getEmail());
					return ResponseEntity.ok("Login successful!");
				}
				else {
					return ResponseEntity.status(401).body("Login Disabled! wait for Admin Approval!");
				}
			} else {
				return ResponseEntity.status(401).body("Invalid password.");
			}
		} else {
			return ResponseEntity.status(404).body("User not found.");
		}
	}
	
}
