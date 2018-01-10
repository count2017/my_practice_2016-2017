package List嵌套;

public class NurseSatiGroup {
	private String id;
	private String surveyId;
	private String groupNum;
	private String departmentId;
	private String createUser;
	public NurseSatiGroup() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NurseSatiGroup(String groupNum, String departmentId, String createUser) {
		super();
		this.groupNum = groupNum;
		this.departmentId = departmentId;
		this.createUser = createUser;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSurveyId() {
		return surveyId;
	}
	public void setSurveyId(String surveyId) {
		this.surveyId = surveyId;
	}
	public String getGroupNum() {
		return groupNum;
	}
	public void setGroupNum(String groupNum) {
		this.groupNum = groupNum;
	}
	public String getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	
	
	
}
