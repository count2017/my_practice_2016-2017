package action;

import com.opensymphony.xwork2.ActionSupport;

public  class  UserManagerAction extends ActionSupport{
    private  String  methodName;
    
    public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	public  String  addUser(){
          methodName="���ɹ�ִ����addUser()����";
          return "add";
    }
    public  String  deleteUser(){
          methodName="���ɹ�ִ����deleteUser()����";
          return "delete";
    }
    //ʡ������ҵ���߼������������룬�Լ�methodName���Ե�getter����
}

