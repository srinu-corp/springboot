package ubi.dbclasses;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class student 
{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer studentid;	
private String email;
private String password;
private String phone;
private String status;
private String studentname;
@CreationTimestamp
private LocalDateTime createdate;
@UpdateTimestamp
private LocalDateTime updatedate;
public student(String email, String password, String phone, String status, String studentname) {
	super();
	this.email = email;
	this.password = password;
	this.phone = phone;
	this.status = status;
	this.studentname = studentname;
}
public Integer getStudentid() {
	return studentid;
}
public void setStudentid(Integer studentid) {
	this.studentid = studentid;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public LocalDateTime getCreatedate() {
	return createdate;
}
public void setCreatedate(LocalDateTime createdate) {
	this.createdate = createdate;
}
public LocalDateTime getUpdatedate() {
	return updatedate;
}
public void setUpdatedate(LocalDateTime updatedate) {
	this.updatedate = updatedate;
}
public student() {
	super();
}



}
