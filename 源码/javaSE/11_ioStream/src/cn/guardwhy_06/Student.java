package cn.guardwhy_06;

import java.io.Serializable;

/**
 * 学生类
 */
public class Student implements Serializable {

    // 序列化版本
    private static final long serialVersionUID = 1;
    // 成员变量
    private String loginName;
    private String userName;
    // 密码不参与序列化,不保存起来
    private transient String passWord;

    // 无参构造器
    public Student() {

    }

    // 带参构造器
    public Student(String loginName, String userName, String passWord) {
        this.loginName = loginName;
        this.userName = userName;
        this.passWord = passWord;
    }

    /**
     * get.set 方法
     */
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
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

    @Override
    public String toString() {
        return "Student{" +
                "loginName='" + loginName + '\'' +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
