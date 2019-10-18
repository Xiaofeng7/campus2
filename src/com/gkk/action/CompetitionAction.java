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

import com.gkk.beans.Competition;
import com.gkk.service.CompetitionInterface;
import com.opensymphony.xwork2.ActionSupport;

public class CompetitionAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private CompetitionInterface competitionService;
	private Integer fileId;
	private String name;
	private String content;
	private String accessory;
	private File uploadFile; //得到上传的文件
    private String uploadFileContentType; //得到文件的类型
    private String uploadFileFileName; //得到文件的名称
    private InputStream fileInputStream;
	private String filename;
	private Integer cid;
	
	public String setCompetition() {
		
		
		java.util.Date now = new java.util.Date();
		String timStringe = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(now);
		Timestamp time = Timestamp.valueOf(timStringe);//注册时间
		HttpSession httpSession = ServletActionContext.getRequest().getSession();
		int countId = (int) httpSession.getAttribute("accountId");
		String directory = ServletActionContext.getServletContext().getRealPath("/WEB-INF/competitionFiles");
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
			accessory = "/WEB-INF/competitionFiles/"+uploadFileFileName;
			Integer id = competitionService.setCompetition(name,content,countId,accessory,time);
			competitionService.getCompetition(id);
		}
		
		System.out.println(name+"..."+content+"..."+countId+"..."+accessory+"..."+time+"..,"+uploadFileFileName+"..,"+uploadFileContentType);
		return SUCCESS;
		
	}
	public String doloadAccessory() throws FileNotFoundException {
		competitionService.getCompetition(fileId);
		HttpSession httpSession = ServletActionContext.getRequest().getSession();
		Competition competition = (Competition) httpSession.getAttribute("getCompetition");
		String filePath = ServletActionContext.getServletContext().getRealPath(competition.getAccessory());
		fileInputStream = new FileInputStream(filePath);
		filename = FilenameUtils.getName(filePath);
		
		return SUCCESS;
		
	}

	public String getAllCompetition() {
		
		competitionService.getAllCompetition();
		return SUCCESS;
		
	}
	public String getCompetition() {
		
		competitionService.getCompetition(cid);
		return SUCCESS;
		
	}

	public CompetitionInterface getCompetitionService() {
		return competitionService;
	}

	public void setCompetitionService(CompetitionInterface competitionService) {
		this.competitionService = competitionService;
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
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	
}
