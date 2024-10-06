package ubi.dbclasses;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRep extends JpaRepository<student, Integer>
{
	
@Query(value="select * from student where studentid=:i",nativeQuery = true)	
public student getstudent(Integer i);	

}
