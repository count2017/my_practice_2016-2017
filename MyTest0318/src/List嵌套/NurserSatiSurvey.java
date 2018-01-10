package List嵌套;

import java.util.Date;

public class NurserSatiSurvey {
	private String surveyId;
	private String reportYear;
	private String reportSeason;
	private String createUser;
	private Date createDate;
	public NurserSatiSurvey() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NurserSatiSurvey(String reportYear, String reportSeason, String createUser, Date createDate) {
		super();
		this.reportYear = reportYear;
		this.reportSeason = reportSeason;
		this.createUser = createUser;
		this.createDate = createDate;
	}
	public String getReportYear() {
		return reportYear;
	}
	public void setReportYear(String reportYear) {
		this.reportYear = reportYear;
	}
	public String getReportSeason() {
		return reportSeason;
	}
	public void setReportSeason(String reportSeason) {
		this.reportSeason = reportSeason;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getSurveyId() {
		return surveyId;
	}
	public void setSurveyId(String surveyId) {
		this.surveyId = surveyId;
	}
	
	
}
