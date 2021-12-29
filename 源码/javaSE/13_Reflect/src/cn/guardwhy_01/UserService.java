package cn.guardwhy_01;
/**
 程序的业务代码：就是需要被测试正确性的。
 */
public class UserService {
    public String login(String loginName , String passWord){
        if("admin".equals(loginName) && "003197".equals(passWord)){
            return "success";
        }else{
            return "error";
        }
    }

    public void chu(){
        int c = 10 / 2;
        System.out.println(c);
    }
}
