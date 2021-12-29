package cn.guardwhy.config;

import cn.guardwhy.pojo.User;
import cn.guardwhy.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRealm extends AuthorizingRealm {
    @Autowired
    UserService userService;
    // 授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        System.out.println("执行了=>授权doGetAuthorizationInfo");
        // 给资源进行授权
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        // 获取当前对象
        Subject subject = SecurityUtils.getSubject();
        // 拿到User对象
        User currentUser = (User) subject.getPrincipal();
        // 设置权限
        info.addStringPermission(currentUser.getPerms());
        return info;
    }
      // 认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        // 1.输出结果
        System.out.println("执行了=>认证doGetAuthenticationInfo");
        UsernamePasswordToken userToken = (UsernamePasswordToken) token;
        // 2.连接真实的数据库
        User user = userService.queryUserByName(userToken.getUsername());
        // 3.条件判断
        if(user ==null){ // 不存在该用户
            //shiro底层就会抛出 UnknownAccountException
            return null;
        }
        Subject subject = SecurityUtils.getSubject();
        subject.getSession().setAttribute("loginUser",user);
        // 4.密码认证,shiro替我们做了,加密了
        return new SimpleAuthenticationInfo(user, user.getPwd(), "");
    }
}
