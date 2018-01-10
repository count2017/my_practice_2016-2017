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
          methodName="您成功执行了addUser()操作";
          return "add";
    }
    public  String  deleteUser(){
          methodName="您成功执行了deleteUser()操作";
          return "delete";
    }
    //省略其他业务逻辑操作方法代码，以及methodName属性的getter方法
}

