package com.jkt.reimbursement.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users {
	
	@Id
	@Column(name="username")
	private String id;
	
	private String first_name;
	private String last_name;
	 private String password;
	 private String email;
	private char enabled;                                   
	private String updated_by ;              
	Timestamp updated_date;
	
	@Column(name="department_id")
	private int departId;
	
	private String base_location;            
	private String emp_category;            
	private String lineManager;              
	private String workingStatus;            
	private int isLineManager;           
	private int skillset_email_reminder ; 
	private int defaulter_email_reminder;
	 Date createdDate;             
	Date joiningDate;                     
	Date deactivatedDate;         
	Date updatedCV_date;           
	Date lastMailSent;             
	String resume_status;            
	String manager_notes;            
	String mobile_attendance;
	
	public Users()
	{
		
	}

	public Users(String id, String first_name, String last_name, String password, String email, char enabled,
			String updated_by, Timestamp updated_date, int departId, String base_location, String emp_category,
			String lineManager, String workingStatus, int isLineManager, int skillset_email_reminder,
			int defaulter_email_reminder, Date createdDate, Date joiningDate, Date deactivatedDate, Date updatedCV_date,
			Date lastMailSent, String resume_status, String manager_notes, String mobile_attendance) {
		
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.password = password;
		this.email = email;
		this.enabled = enabled;
		this.updated_by = updated_by;
		this.updated_date = updated_date;
		this.departId = departId;
		this.base_location = base_location;
		this.emp_category = emp_category;
		this.lineManager = lineManager;
		this.workingStatus = workingStatus;
		this.isLineManager = isLineManager;
		this.skillset_email_reminder = skillset_email_reminder;
		this.defaulter_email_reminder = defaulter_email_reminder;
		this.createdDate = createdDate;
		this.joiningDate = joiningDate;
		this.deactivatedDate = deactivatedDate;
		this.updatedCV_date = updatedCV_date;
		this.lastMailSent = lastMailSent;
		this.resume_status = resume_status;
		this.manager_notes = manager_notes;
		this.mobile_attendance = mobile_attendance;
	}
	public Users(String id)
	{
		this.id=id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getEnabled() {
		return enabled;
	}

	public void setEnabled(char enabled) {
		this.enabled = enabled;
	}

	public String getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}

	public Timestamp getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(Timestamp updated_date) {
		this.updated_date = updated_date;
	}
	
	public int getDepartId() {
		return departId;
	}

	public void setDepartId(int departId) {
		this.departId = departId;
	}

	public String getBase_location() {
		return base_location;
	}

	public void setBase_location(String base_location) {
		this.base_location = base_location;
	}

	public String getEmp_category() {
		return emp_category;
	}

	public void setEmp_category(String emp_category) {
		this.emp_category = emp_category;
	}

	public String getLineManager() {
		return lineManager;
	}

	public void setLineManager(String lineManager) {
		this.lineManager = lineManager;
	}

	public String getWorkingStatus() {
		return workingStatus;
	}

	public void setWorkingStatus(String workingStatus) {
		this.workingStatus = workingStatus;
	}

	public int getIsLineManager() {
		return isLineManager;
	}

	public void setIsLineManager(int isLineManager) {
		this.isLineManager = isLineManager;
	}

	public int getSkillset_email_reminder() {
		return skillset_email_reminder;
	}

	public void setSkillset_email_reminder(int skillset_email_reminder) {
		this.skillset_email_reminder = skillset_email_reminder;
	}

	public int getDefaulter_email_reminder() {
		return defaulter_email_reminder;
	}

	public void setDefaulter_email_reminder(int defaulter_email_reminder) {
		this.defaulter_email_reminder = defaulter_email_reminder;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Date getDeactivatedDate() {
		return deactivatedDate;
	}

	public void setDeactivatedDate(Date deactivatedDate) {
		this.deactivatedDate = deactivatedDate;
	}

	public Date getUpdatedCV_date() {
		return updatedCV_date;
	}

	public void setUpdatedCV_date(Date updatedCV_date) {
		this.updatedCV_date = updatedCV_date;
	}

	public Date getLastMailSent() {
		return lastMailSent;
	}

	public void setLastMailSent(Date lastMailSent) {
		this.lastMailSent = lastMailSent;
	}

	public String getResume_status() {
		return resume_status;
	}

	public void setResume_status(String resume_status) {
		this.resume_status = resume_status;
	}

	public String getManager_notes() {
		return manager_notes;
	}

	public void setManager_notes(String manager_notes) {
		this.manager_notes = manager_notes;
	}

	public String getMobile_attendance() {
		return mobile_attendance;
	}

	public void setMobile_attendance(String mobile_attendance) {
		this.mobile_attendance = mobile_attendance;
	}
	
}
