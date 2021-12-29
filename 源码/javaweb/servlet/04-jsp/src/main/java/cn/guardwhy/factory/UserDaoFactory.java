package cn.guardwhy.factory;

import cn.guardwhy.dao.UserDao;
import cn.guardwhy.dao.impl.UserDaoImpl;

public class UserDaoFactory {
    /**
     * 通过静态工程方法模式来实现UserDao实现类对象的创建并返回
     * @return
     */
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
