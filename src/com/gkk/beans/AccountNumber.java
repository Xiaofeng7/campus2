package com.gkk.beans;

import java.sql.Date;
import java.sql.Timestamp;

public class AccountNumber {
	
	private Integer id;
	private String userName;//�û���
	private String passWord;//����
	private String nickName;//�ǳ�
	private Date birthday;//����2018-02-15
	private String tel;
	private String email;
	private String address;
	private String studentNumber;//ѧ��
	private String university;//ѧУ
	private String academy;//ѧԺ
	private String profession;//רҵ
	private Integer grade;//�꼶
	private Timestamp register;//ע��ʱ��
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getAcademy() {
		return academy;
	}
	public void setAcademy(String academy) {
		this.academy = academy;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public Timestamp getRegister() {
		return register;
	}
	public void setRegister(Timestamp register) {
		this.register = register;
	}
	@Override
	public String toString() {
		return "AccountNumber [id=" + id + ", userName=" + userName + ", passWord=" + passWord + ", nickName="
				+ nickName + ", birthday=" + birthday + ", tel=" + tel + ", email=" + email + ", address=" + address
				+ ", studentNumber=" + studentNumber + ", university=" + university + ", academy=" + academy
				+ ", profession=" + profession + ", grade=" + grade + ", register=" + register + "]";
	}

}
