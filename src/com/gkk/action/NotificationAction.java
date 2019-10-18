package com.gkk.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.struts2.ServletActionContext;

import com.gkk.beans.Notification;
import com.gkk.service.NotificationInterface;
import com.opensymphony.xwork2.ActionSupport;

public class NotificationAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private NotificationInterface notificationService;
	private Integer fileId;
	private String name;
	private String content;
	private String accessory;
	private File uploadFile; //得到上传的文件
    private String uploadFileContentType; //得到文件的类型
    private String uploadFileFileName; //得到文件的名称
    private InputStream fileInputStream;
	private String filename;
	private Integer nid;
	
	public String setNotification() {
		
		java.util.Date now = new java.util.Date();
		String timStringe = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(now);
		Timestamp time = Timestamp.valueOf(timStringe);//注册时间
		HttpSession httpSession = ServletActionContext.getRequest().getSession();
		int countId = (int) httpSession.getAttribute("accountId");
		String directory = ServletActionContext.getServletContext().getRealPath("/WEB-INF/notificationFiles");
		System.out.println("保存的地址"+directory);
		File file = new File(directory);
		if(!file.exists()) {
			file.mkdirs();
		}
		
		if(uploadFile != null) {
			try {
	            //保存文件
	            FileUtils.copyFile(uploadFile, new File(file,uploadFileFileName));
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
			accessory = "/WEB-INF/notificationFiles/"+uploadFileFileName;
			Integer id = notificationService.setNotification(name,content,countId,accessory,time);
			notificationService.getNotification(id);
		}
		
		System.out.println(name+"..."+content+"..."+countId+"..."+accessory+"..."+time+"..,"+uploadFileFileName+"..,"+uploadFileContentType);
		return SUCCESS;
		
	}
	public String doloadAccessory() throws FileNotFoundException {
		notificationService.getNotification(fileId);
		HttpSession httpSession = ServletActionContext.getRequest().getSession();
		Notification Notification = (Notification) httpSession.getAttribute("getNotification");
		String filePath = ServletActionContext.getServletContext().getRealPath(Notification.getAccessory());
		fileInputStream = new FileInputStream(filePath);
		filename = FilenameUtils.getName(filePath);
		
		return SUCCESS;
		
	}

	public String getAllNotification() {
		
		notificationService.getAllNotification();
		return SUCCESS;
		
	}
	public String getNotification() {
		
		notificationService.getNotification(nid);
		return SUCCESS;
		
	}

	public NotificationInterface getNotificationService() {
		return notificationService;
	}
	public void setNotificationService(NotificationInterface notificationService) {
		this.notificationService = notificationService;
	}
	public String getAccessory() {
		return accessory;
	}

	public void setAccessory(String accessory) {
		this.accessory = accessory;
	}

	public File getUploadFile() {
		return uploadFile;
	}

	public void setUploadFile(File uploadFile) {
		this.uploadFile = uploadFile;
	}

	

	public String getUploadFileContentType() {
		return uploadFileContentType;
	}

	public void setUploadFileContentType(String uploadFileContentType) {
		this.uploadFileContentType = uploadFileContentType;
	}

	public String getUploadFileFileName() {
		return uploadFileFileName;
	}

	public void setUploadFileFileName(String uploadFileFileName) {
		this.uploadFileFileName = uploadFileFileName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Integer getFileId() {
		return fileId;
	}
	public void setFileId(Integer fileId) {
		this.fileId = fileId;
	}
	public InputStream getFileInputStream() {
		return fileInputStream;
	}
	public void setFileInputStream(InputStream fileInputStream) {
		this.fileInputStream = fileInputStream;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public Integer getNid() {
		return nid;
	}
	public void setNid(Integer nid) {
		this.nid = nid;
	}
	
}
