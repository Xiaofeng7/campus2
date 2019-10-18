package com.gkk.action;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.gkk.service.AcademyInterface;
import com.gkk.service.AccountInterface;
import com.gkk.service.CathedraInterface;
import com.gkk.service.ClubInterface;
import com.gkk.service.CompetitionInterface;
import com.gkk.service.NotificationInterface;
import com.gkk.service.TipsInterface;
import com.opensymphony.xwork2.ActionSupport;

public class AccountAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName;
	private String passWord;
	private String nickName;//昵称
	private String birthday;//生日2018-02-15
	private String tel;
	private String email;
	private String address;
	private String studentNumber;//学号
	private String university;//学校
	private String academy;//学院
	private String profession;//专业
	private String grade;//年级
	private AccountInterface accountService;        
	private AcademyInterface academyService;
	private TipsInterface tipsService;
	private ClubInterface clubService;
	private CathedraInterface cathedraService;
	private CompetitionInterface competitionService;
	private NotificationInterface notificationService;

	public String login() {
		//System.out.println("................................"+userName);
		if (accountService.login(userName, passWord)) {
			//System.out.println("................................"+userName+"........OK!");
			tipsService.getAllTips();
			competitionService.getAllCompetition();
			academyService.getAllAcademy();
			clubService.getAllClub();
			notificationService.getAllNotification();
			cathedraService.getAllCathedra();
			return SUCCESS;
		}
		this.addActionError("用户名或密码错误！");
		return LOGIN;
	}
	public String register() {
		Integer gradeInteger = Integer.parseInt(grade);
		DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
		try {
			java.util.Date day = dateFormat1.parse(birthday);
			Date date = Date.valueOf(dateFormat1.format(day));
			java.util.Date now = new java.util.Date();
			String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(now);
			Timestamp register = Timestamp.valueOf(time);//注册时间
			if(accountService.register(userName, passWord, nickName, date, tel, email, address, studentNumber, university, academy, profession, gradeInteger, register)) {
				return SUCCESS;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return INPUT;	
	}
	public String second() {
		tipsService.getAllTips();
		competitionService.getAllCompetition();
		academyService.getAllAcademy();
		clubService.getAllClub();
		notificationService.getAllNotification();
		cathedraService.getAllCathedra();
		return SUCCESS;
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
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
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
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public AccountInterface getAccountService() {
		return accountService;
	}
	public void setAccountService(AccountInterface accountService) {
		this.accountService = accountService;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public AcademyInterface getAcademyService() {
		return academyService;
	}
	public void setAcademyService(AcademyInterface academyService) {
		this.academyService = academyService;
	}
	public TipsInterface getTipsService() {
		return tipsService;
	}
	public void setTipsService(TipsInterface tipsService) {
		this.tipsService = tipsService;
	}
	public ClubInterface getClubService() {
		return clubService;
	}
	public void setClubService(ClubInterface clubService) {
		this.clubService = clubService;
	}
	public CathedraInterface getCathedraService() {
		return cathedraService;
	}
	public void setCathedraService(CathedraInterface cathedraService) {
		this.cathedraService = cathedraService;
	}
	public CompetitionInterface getCompetitionService() {
		return competitionService;
	}
	public void setCompetitionService(CompetitionInterface competitionService) {
		this.competitionService = competitionService;
	}
	public NotificationInterface getNotificationService() {
		return notificationService;
	}
	public void setNotificationService(NotificationInterface notificationService) {
		this.notificationService = notificationService;
	}
}
