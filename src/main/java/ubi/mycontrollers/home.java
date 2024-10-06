package ubi.mycontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ubi.dbclasses.StudentException;
import ubi.dbclasses.StudentNotFound;
import ubi.dbclasses.StudentRep;
import ubi.dbclasses.student;

@Controller
public class home {
	
@Autowired	
StudentRep rep;	

@GetMapping("/login")	
public String login(Model m)
{
	
	student stud=new student();
	
	m.addAttribute("stud", stud);
	
	student stu=new student();
	stu.setEmail("@vasu");
	stu.setPassword("Srinu");
	stu.setPhone("9538044118");
	stu.setStatus("Y");
	stu.setStudentname("srinu");
	
	rep.save(stu);
	
	
	return "login";
}

@GetMapping("/registration")	
public String registration()
{
	return "reg";
}


@RequestMapping("/process")	
@ResponseBody
public student process(@ModelAttribute("stud") student stud)
{	
	student student=null;
	

	
	return student;
}
	

}
