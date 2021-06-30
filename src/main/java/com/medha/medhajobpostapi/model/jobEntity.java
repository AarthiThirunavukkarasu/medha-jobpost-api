package com.medha.medhajobpostapi.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@Document(collection="job_s")
public class jobEntity {
	
	public jobEntity(String id, String job_ID, String job_Name, String job_Title, String job_Desc, String job_Function,
			String job_Location, String job_Country, String job_Status, String optional_Desc, String number_of_years, String salary,
			String key_Responsibilities, String qualification, String company_info, String create_date, String createdBy, String modify_date) {
		

this.id=id;
this.job_ID=job_ID;
this.job_Name=job_Name;
this.job_Title=job_Title;
this.job_Desc=job_Desc;
this.job_Function=job_Function;
this.job_Location=job_Location;
this.job_Country=job_Country;
this.job_Status=job_Status;
this.optional_Desc=optional_Desc;
this.number_of_years=number_of_years;
this.salary=salary;
this.key_Responsibilities=key_Responsibilities;
this.qualification=qualification;
this.company_info=company_info;
this.createdate=create_date;
this.createdBy=createdBy;
this.modifydate=modify_date;
	}
	public jobEntity() {
		// TODO Auto-generated constructor stub
	}
	@Id
	private String id;
	
	@Field(name="job")
	private String job_ID;
	
	@Field(name="job_Name")
	private String job_Name;
	
	@Field(name="job_Title")
	private String job_Title;
	
	@Field(name="job_Desc")
	private String job_Desc;
	
	@Field(name="job_Function")
	private String job_Function;
	
	@Field(name="job_Location")
	private String job_Location;
	
	@Field(name="job_Country")
	private String job_Country;
	
	@Field(name="job_Status")
	private String job_Status;
	
	@Field(name="optional_Desc")
	private String optional_Desc;
	
	@Field(name="number_of_years")
	private String number_of_years;
	
	@Field(name="salary")
	private String salary;
	
	@Field(name="key_Responsiblities")
	private String key_Responsibilities;
	
	@Field(name="qualification")
	private String qualification;
	
	@Field(name="company_info")
	private String company_info;
	
	@Field(name="createdate")
	private String createdate;
	
	@Field(name="createdBy")
	private String createdBy;
	
	@Field(name="modifydate")
	private String modifydate;

	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getJob_ID() {
		return job_ID;
	}
	public void setJob_ID(String job_ID) {
		this.job_ID = job_ID;
	}
	public String getJob_Name() {
		return job_Name;
	}
	public void setJob_Name(String job_Name) {
		this.job_Name = job_Name;
	}
	public String getJob_Title() {
		return job_Title;
	}
	public void setJob_Title(String job_Title) {
		this.job_Title = job_Title;
	}
	public String getJob_Desc() {
		return job_Desc;
	}
	public void setJob_Desc(String job_Desc) {
		this.job_Desc = job_Desc;
	}
	public String getJob_Function() {
		return job_Function;
	}
	public void setJob_Function(String job_Function) {
		this.job_Function = job_Function;
	}
	public String getJob_Location() {
		return job_Location;
	}
	public void setJob_Location(String job_Location) {
		this.job_Location = job_Location;
	}
	public String getJob_Country() {
		return job_Country;
	}
	public void setJob_Country(String job_Country) {
		this.job_Country = job_Country;
	}
	public String getJob_Status() {
		return job_Status;
	}
	public void setJob_Status(String job_Status) {
		this.job_Status = job_Status;
	}
	
	public String getOptional_Desc() {
		return optional_Desc;
	}
	public void setOptional_Desc(String optional_Desc) {
		this.optional_Desc = optional_Desc;
	}
	
	public String getNumber_of_years() {
		return number_of_years;
	}
	public void setNumber_of_years(String number_of_years) {
		this.number_of_years = number_of_years;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	public String getKey_Responsibilities() {
		return key_Responsibilities;
	}
	public void setKey_Responsibilities(String key_Responsibilities) {
		this.key_Responsibilities = key_Responsibilities;
	}
	
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getCompany_info() {
		return company_info;
	}
	public void setCompany_info(String company_info) {
		this.company_info = company_info;
	}
	public String getCreatedate() {
		return createdate;
	}
	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getModifydate() {
		return modifydate;
	}
	public void setModifydate(String modifydate) {
		this.modifydate = modifydate;
	}


	
	
}
