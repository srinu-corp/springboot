package ubi.mycontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import ubi.dbclasses.StudentException;
import ubi.dbclasses.StudentNotFound;
import ubi.dbclasses.StudentRep;
import ubi.dbclasses.student;

@RestController
public class MyRestControllers 
{
	
@Autowired	
StudentRep rep;	

	
@PostMapping("/getStudent/{studentid}")	
public Object restStudent(@PathVariable Integer studentid)
{
	student stdd=rep.getstudent(studentid);

		if(stdd==null)
		{
			System.out.println("hai");
			throw new StudentException("Student not Found");
			
		}
	return stdd;
}
	
@ExceptionHandler
public ResponseEntity<StudentNotFound> studentException(StudentException se)
{

	StudentNotFound sn=new StudentNotFound();
	sn.setError_message(se.getMessage());
	
	return new ResponseEntity<>(sn,HttpStatus.NOT_FOUND);

}



}
