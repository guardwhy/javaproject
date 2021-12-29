## 1-框架概念

程序开发中的框架往往是对常见功能的封装，程序框架理解为基础或者机械标准件(例如螺丝螺母标准的机械部件)。

假如你要造一辆马车，在没有框架的情况下，你需要自己去伐木，去把木头做成木板，木棍，然后组成轮子，门，等部件，然后组装起来。但如果你用了框架，就相当于你有现成的轮子，门等部件，你只需要组装一下就可以了。一个框架是一组可复用的设计构件。

**框架(Framework)**是整个或者部分系统的可重用设计，是JavaEE底层技术的封装。框架是可以被开发者定制的应用骨架。框架是一个半成品，软件是成品。

## 2-三层结构

### 2.1分层方式

一个中大型软件开发需要有明确分层。

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se1/16-javase.png" style="zoom: 80%;" />

| **分层包**          | **功能描述**                      | **作用**                                         |
| ------------------- | --------------------------------- | ------------------------------------------------ |
| cn.guardwhy.view    | 表示层 View                       | 面向客户，用于处理客户的输入和输出，前端的代码。 |
| cn.guardwhy.service | 业务层 Service                    | 处理业务逻辑代码，如：登录，转账，挂号           |
| cn.guardwhy.dao     | 数据访问层 DAO Data Access Object | 也叫持久层。面向数据库，实现对数据库增删改查操作 |

### 2.2 分层的优缺点

> **优点**：

- 降低了代码的耦合度，降低类与类之间关系。有利于团队的开发。
- 项目的可扩展性更好，可维护性更好。
- 可重用性更好，同一个方法可以由多个类去调用。

>  **缺点**：
>

- 执行效率更低，开发工作量更大
- 会导致级联的修改，如果修改一个功能，导致三层都要进行修改。

## 3-mybatis简介

### 3.1 什么是Mybatis

- MyBatis 是一款优秀的持久层框架。
- MyBatis 避免了几乎所有的 JDBC 代码和手动设置参数以及获取结果集的过程。
- MyBatis 可以使用简单的 XML 或注解来配置和映射原生信息，将接口和 Java 的 实体类 【Plain Old Java Objects,普通的 Java对象】映射成数据库中的记录。
- MyBatis 本是apache的一个开源项目ibatis, 2010年这个项目由apache 迁移到了google code，并且改名为MyBatis 。2013年11月迁移到Github。

### 3.2 持久化

> 持久化是将程序数据在持久状态和瞬时状态间转换的机制。

即把数据（如内存中的对象）保存到可永久保存的存储设备中（如磁盘）。持久化的主要应用是将内存中的对象存储在数据库中，或者存储在磁盘文件中、XML数据文件中等等。JDBC就是一种持久化机制。文件IO也是一种持久化机制。

> 为什么需要持久化服务呢？

- 有一些对象，不能让它消失。
- 内存价格昂贵。

> 持久层

- 完成持久化工作的代码块 . ----> dao层 （DAO (Data Access Object) 数据访问对象）
- 大多数情况下，数据持久化往往也就意味着将内存中的数据保存到磁盘上加以固化，而==持久化的实现过程则大多通过各种关系数据库来完成==。
- 与系统其他部分相对而言，这个层面应该具有一个较为清晰和严格的逻辑边界。 说白了就是用来操作数据库的。

### 3.3 mybatis的优缺点

> 优点

- 简单易学：mybatis本身就很小且简单。没有任何第三方依赖，最简单安装只要两个jar文件+配置几个SQL映射文件即可。  
- 使用灵活：Mybatis不会对应用程序或者数据库的现有设计强加任何影响。SQL语句写在XML里，便于统一管理和优化。
- 解除SQL与程序代码的耦合：通过提供DAO层，将业务逻辑和数据访问逻辑分离，使系统的设计更清晰，更易维护，更易进行单元测试。

> 缺点

- 编写SQL语句时工作量很大，尤其是字段多、关联表多时，更是如此。
- SQL语句依赖于数据库，导致数据库移植性差，不能更换数据库。
- 框架还是比较简陋，功能尚有缺失，二级缓存机制不佳。

### 3.4 ORM的概念

> Object Relational Mapping 对象关系映射

1. 在Java中编程：使用的是面向对象的开发方式。
2. 在MySQL中写的SQL语句：使用的是关系型的数据库将表中的数据映射成一个对象，对象关系映射。

> mybatis的两种映射方式 

1. 通过XML的配置文件。
2. 通过注解的方式

### 3.5 下载安装

> 官网下载

Mybatis官方地址: [http://www.mybatis.org/mybatis-3/](http://www.mybatis.org/mybatis-3/)

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210309161548.png" style="zoom:80%;" />

> github下载

github地址: [https://github.com/mybatis/mybatis-3/releases](https://github.com/mybatis/mybatis-3/releases)

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210309161749.png)

## 4- Mybatis入门

### 4.1 项目准备

#### 4.1.1项目目录

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210310152737.png" style="zoom:80%;" />

> **导入相关依赖**

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>cn.guardwhy</groupId>
    <artifactId>Mybatis</artifactId>
    <version>1.0-SNAPSHOT</version>
    <packaging>jar</packaging>

    <!--倒入项目所需依赖-->
    <dependencies>
        <!-- mybatis相关依赖-->
        <dependency>
            <groupId>org.mybatis</groupId>
            <artifactId>mybatis</artifactId>
            <version>3.5.2</version>
        </dependency>
         <!-- mysql数据库相关依赖-->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>5.1.47</version>
        </dependency>
         <!-- 日志相关依赖-->
        <dependency>
            <groupId>log4j</groupId>
            <artifactId>log4j</artifactId>
            <version>1.2.17</version>
        </dependency>
         <!-- 测试相关依赖-->
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
        </dependency>
        <!--lombok插件-->
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.18.16</version>
        </dependency>
    </dependencies>
</project>
```

>  **Sql基本结构**

```sql
-- 创建数据库
create database db_mybatis;

-- 创建数据表
create table user (
  id int primary key auto_increment,
  username varchar(20) not null,
  birthday date,
  sex char(1) default '男',
  address varchar(50)
);

-- 插入数据
insert into user values (null, '侯大利','1980-10-24','男','江州');
insert into user values (null, '田甜','1992-11-12','女','扬州');
insert into user values (null, '王永强','1983-05-20','男','扬州');
insert into user values (null, '杨红','1995-03-22','女','秦阳');

select * from user;
```

>  **log4j.properties**

```properties
### 设置Logger输出级别和输出目的地 ###
log4j.rootLogger=debug, stdout

### 把日志信息输出到控制台 ###
log4j.appender.stdout=org.apache.log4j.ConsoleAppender
log4j.appender.stdout.Target=System.out
log4j.appender.stdout.layout=org.apache.log4j.SimpleLayout
```

> **db.properties**

编写数据库连接属性资源文件<font color = red>**（db.properties)**，</font>放在resources资源文件下。

```properties
jdbc.driver=com.mysql.jdbc.Driver
jdbc.url=jdbc:mysql://localhost:3306/db_mybatis
jdbc.username=root
jdbc.password=root
```

加载db.properties属性文件

```xml
<!--在内部配置属性：先读取内部的属性,再读取外部的属性,外部的会覆盖内部的,最后外部的属性起作用-->
<properties resource="db.properties">
    <property name="jdbc.username" value="root"/>
    <property name="jdbc.password" value="root"/>
</properties>
```

#### 4.1.2 User实体类

```java
package cn.guardwhy.domain;
/**
 * 实体类
 */
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;
    private String username;
    private Date birthday;
    private String sex;
    private String address;
    }
}
```

#### 4.1.3 UserMapper接口

这个接口其实就是数据访问层：DAO层

```java
package cn.guardwhy.dao;

import cn.guardwhy.enty.User;

import java.util.List;

/**
 * 数据访问层方法
 */
public interface UserMapper {
    // 查找所有用户
    List<User> findAllUsers();
}
```

#### 4.1.4 UserMapper.xml

- 接口映射文件：UserMapper.xml编写SQL语句。
- 在resources中创建**<font color=red>cn/guardwhy/dao文件夹</font>**，在目录中创建UserMapper.xml映射文件。


```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<!--
实体类的映射文件: namespace 指定接口的类全名
-->
<mapper namespace="cn.guardwhy.dao.UserMapper">
    <!--
    查询语句id: 接口中方法的名字, resultType：返回的实体类的类型类全名, parameterType: 参数的类型
    -->
    <select id="findAllUsers" resultType="cn.guardwhy.enty.User">
        select * from user
    </select>
</mapper>
```

#### 4.1.5 sqlMapConfig.xml

==sqlMapConfig.xml 是 mybatis 框架的核心配置文件, sqlMapConfig.xml 配置连接数据库参数==。

| **properties**    | **外部的可替代的属性，可以从 Java 属性配置文件中读取。**     |
| ----------------- | ------------------------------------------------------------ |
| **settings**      | **mybatis 全局的配置参数**                                   |
| **typeAliases**   | **给 Java 类型定义别名**                                     |
| **typeHandlers**  | **类型处理器，将结果集中的值以合适的方式转换成 Java 类型**   |
| **objectFactory** | **可以指定用于创建结果对象的对象工厂**                       |
| **plugins**       | **允许使用插件来拦截 mybatis 中一些方法的调用**              |
| **environments**  | 配置多种环境，可以将 SQL 映射应用于多种数据库之中。<br/><font color=red>**transactionManager**</font> ,  两种事务管理器类型。<br/><font color=red>**dataSource**</font> 指定数据源的类型 |
| **mappers**       | 定义SQL映射语句的配置文件                                    |

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE configuration
        PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-config.dtd">
<configuration>
    
     <!--在内部配置属性：先读取内部的属性,再读取外部的属性,外部的会覆盖内部的,最后外部的属性起作用-->
    <properties resource="db.properties">
        <property name="jdbc.username" value="root"/>
        <property name="jdbc.password" value="root"/>
    </properties>

    <!-- 一个核心配置文件，可以配置多个运行环境，default默认使用哪个运行环境 -->
    <environments default="default">
        <!-- 其中的一个运行环境，通过id来进行标识-->
        <environment id="default">
            <!--事务管理器 -->
            <transactionManager type="JDBC"/>
            <!--数据源 -->
            <dataSource type="POOLED">
                <property name="driver" value="${jdbc.driver}"/>
                <property name="url" value="${jdbc.url}"/>
                <property name="username" value="${jdbc.username}"/>
                <property name="password" value="${jdbc.password}"/>
            </dataSource>
        </environment>
    </environments>

    <!-- 加载其他的映射文件 -->
    <mappers>
        <mapper resource="cn/guardwhy/dao/UserMapper.xml"/>
    </mappers>
</configuration>
```

### 4.2 测试类实现

#### 4.2.1 Mybatis三大对象

> 在mybatis中一个会话相当于一次访问数据库的过程，一个会话对象类似于一个Connection连接对象。

- SqlSessionFactoryBuilder：通过这个工厂建造类来创建一个会话工厂。
- SqlSessionFactory：从一个工厂类中得到一个会话对象，通过会话工厂对象来创建会话对象。
- SqlSession： 每次访问数据库都需要创建一个会话对象，这个会话对象不能共享。访问完成以后会话需要关闭。                   

#### 4.2.2 实现步骤



​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/mybatis/6-Mybatis.png" style="zoom:80%;" />

- 通过框架提供的Resources类，加载sqlMapConfig.xml，得到文件输入流InputStream对象 
- 实例化会话工厂创建类SqlSessionFactoryBuilder。
- 通过上面的SqlSessionFactoryBuilder对象，读取核心配置文件的输入流，得到会话工厂SqlSessionFactory类
- 使用SqlSessionFactory对象，创建SqlSession对象

```xml
它相当于JDBC中的Connection对象，提供了操作数据库的CRUD方法,它提供了一个getMapper()方法，获取接口的实现对象。
```

- 获取接口的对象UserMapper，得到接口的代理对象

- 执行数据库的查询操作，输出用户信息
- 关闭会话，释放资源。

#### 4.2.3 代码示例

> **工具类代码**

```java
package cn.guardwhy.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtils {
    // 1.声明一个工厂对象
    private static SqlSessionFactory factory;
    // 2.在静态代码块中创建会话工厂
    static {
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        // 得到输入流
        try(InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");){
            factory = builder.build(inputStream);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    // 3.静态方法得到会话工厂
    public static SqlSessionFactory getSessionFactory(){
        return factory;
    }

    // 4.得到会话对象
    public static SqlSession getSession(){
        // 自动提交事务
        return factory.openSession(true);
    }
}
```

> **测试类代码**

```java
package cn.guardwhy.test;

import cn.guardwhy.dao.UserMapper;
import cn.guardwhy.enty.User;
import cn.guardwhy.utils.MybatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 使用db_mybatis数据库
 */
public class TestUserMapper {
    @Test
    /*
    * 查询所有用户
    */
    public void selectUser(){
        // 1.通过工具类得到会话对象
        SqlSession session = MybatisUtils.getSession();
        // 2.会话对象的得到UserMapper接口代理对象
        UserMapper userMapper = session.getMapper(UserMapper.class);
        // 3.生成了代理对象
        System.out.println(userMapper);
        // 4.执行查询操作
        List<User> users = userMapper.findAllUsers();
        // 5.遍历
        users.forEach(System.out::println);
        // 6.关闭会话
        session.close();
    }
}
```

## 5-Mapper封装数据类

### 5.1 项目准备

> **mybatis框架分析**

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se1/17-javase.png"  />

#### 5.1.1 项目环境

1. sqlMapConfig.xml核心配置文件，去掉DTD约束。因为dom4j会上网去找dtd文件。
2. UserMapper.xml映射配置文件，去掉DTD约束。
3. UserMapper接口。
4. User实体类。

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/mybatis/7-Mybatis.png"  />

> **导入相关jar包**

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/mybatis/9-jarTest.png"  />

>  **UserMapper.xml**

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/mybatis/10-Mybatis.png" style="zoom:80%;" />

#### 5.1.2 代码实现

- 创建包cn.guardwhy.framework。
- 创建实体类：Mapper包含4个属性：namespace,id,resultType,sql。
- 重写toString()方法，方便后期测试看到封装的结果。
- 生成get和set方法，一个Mapper对象代表一条要操作的查询语句对象。

```java
package cn.guardwhy.framework;
/**
 * 封装UserMapper.xml属性
 */
public class Mapper {
    private String namespace; // 封装接口名
    private String id; // 方法名
    private String resultType; // 返回实体类类型
    private String sql; // 要执行的SQL语句

    /**
     * get.set方法
     * @return
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    @Override
    public String toString() {
        return "Mapper{" +
                "namespace='" + namespace + '\'' +
                ", id='" + id + '\'' +
                ", resultType='" + resultType + '\'' +
                ", sql='" + sql + '\'' +
                '}';
    }
}
```

### 5.2 dom4j方法

> **得到XML文档对象**

解析XML文件，得到Document对象

```java
1. 得到输入流InputStream
2. new SAXReader().read(输入流) 返回Document对象
```

>  **Document常用方法**

| 方法名                                | 说明                                             |
| ------------------------------------- | ------------------------------------------------ |
| Element getRootElement()              | 得到XML中根元素(标签)                            |
| List\<Node> selectNodes(String xpath) | 通过xpath查询多个节点Node, Node是Element的父接口 |
| Node selectSingleNode(String xpath)   | 通过xpath得到一个节点                            |
| **Element element(String  name)**     | 通过元素的名字得到它的一个子元素                 |

> **属性文本相关方法**

| 方法名                             | 功能说明                               |
| ---------------------------------- | -------------------------------------- |
| String attributeValue(String name) | 通过标签的属性名字，得到属性的值       |
| String getTextTrim()               | 得到标签中文本内容，并且去掉前后的空格 |

### 5.3 核心配置文件

> **封装核心配置文件：sqlMapConfig.xml文件**

1. 创建driver,url, username,password四个属性
2. 实例化1个空的Map集合：封装其它映射文件的XML信息
3. 声明数据源对象DataSource
4. 生成get和set方法，生成toString()方法

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/mybatis/11-Mybatis.png" style="zoom: 80%;" />

> **loadSqlMapConfig()方法**

1、创建loadSqlMapConfig()方法，它的作用

```xml
解析sqlMapConfig.xml配置文件，给Configuration中的属性赋值。
解析UserMapper.xml配置文件，给Mapper中的属性赋值                           
```

2、在构造方法中调用方法: loadSqlMapConfig( )

#### 5.3.1 代码实现

**核心配置文件**

```java
package cn.guardwhy.framework;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import javax.sql.DataSource;
import javax.xml.parsers.SAXParser;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  解析XML文件：sqlMapConfig.xml, UserMapper.xml
 */
public class Configuration {
    // 1.创建连接池的属性
    private String driver;
    private String url;
    private String username;
    private String password;
    // 2.定义连接池
    private DataSource dataSource;

    // 3.实例化1个空的Map集合:封装其它映射文件的XML信息
    private Map<String, Mapper> mappers = new HashMap<>();

    // 4.在构造方法中调用方法: loadSqlMapConfig()
    public Configuration() {
        try {
            loadSqlMapConfig();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // 5.解析配置文件方法
    private void loadSqlMapConfig() throws DocumentException {
        // 5.1. 从类路径加载/sqlMapConfig.xml配置文件，创建输入流
        InputStream inputStream = Configuration.class.getResourceAsStream("/sqlMapConfig.xml");
        // 5.2. 使用dom4j得到文档对象
        Document document = new SAXReader().read(inputStream);
        // 5.3. 使用XPath读取所有property元素
        List<Node> nodes = document.selectNodes("//property");
        // 5.4. 遍历每个property元素，读取它的name和value属性值
        for(Node node : nodes){
            Element propertyElement = (Element) node;
            // 得到name属性
            String name = propertyElement.attributeValue("name");
            // 得到value属性
            String value = propertyElement.attributeValue("value");

            // 6.判断name的字符串，如果与类中的属性名相同，则赋值到相应属性中
            switch (name){
                case "driver":
                    this.driver = value;
                    break;
                case "url":
                    this.url = value;
                    break;
                case "username":
                    this.username = value;
                    break;
                case "password":
                    this.password = value;
                    break;
            }
        }

    }

    /***
     * set.get方法
     * @return
     */
    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Map<String, Mapper> getMappers() {
        return mappers;
    }

    public void setMappers(Map<String, Mapper> mappers) {
        this.mappers = mappers;
    }

    @Override
    public String toString() {
        return "Configuration{" +
                "driver='" + driver + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", dataSource=" + dataSource +
                ", mappers=" + mappers +
                '}';
    }
}
```

**测试代码**

```java
package cn.guardwhy.test;

import cn.guardwhy.framework.Configuration;

public class TestFramework {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        System.out.println(configuration);
    }
}
```

### 5.4 实体类映射文件

> **生成步骤**

解析UserMapper.xml并且封装到Mapper类中

1. 创建新的方法loadMapper(Document document)，将当前的文档对象传递给方法
2. 读取\<mapper>中的resource属性值
3. 通过resource读取它对应的XML文件
4. 得到namespace,id,resultType,sql的值，封装成Mapper对象
5. 在loadSqlMapConfig()中调用此方法

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/mybatis/12-Mybatis.png"  />

#### 5.4.3 代码实现

**解析配置文件**

```java
// 解析配置文件方法
private void loadSqlMapConfig() throws DocumentException {
    // 解析UserMapper.xml文件
    loadMapper(document);
}

/**
     * 解析xml实体类映射文件
     * @param document
     */
private void loadMapper(Document document) throws DocumentException{
    // 1.读取mapper中的resource属性值
    // 1.1 读取mapper元素
    List<Node> nodes = document.selectNodes("//mapper");
    // 1.2 遍历每个mapper元素
    for (Node node : nodes){
        Element mapperElement = (Element) node;
        // 1.3 读取mapper的resource属性值
        String resource = mapperElement.attributeValue("resource");
        // 2.解析这个XML文件,得到namespace,id,resultType,sql的值

        // 2.1 使用类对象,读取输入流下面的resource.
        InputStream inputStream = Configuration.class.getResourceAsStream("/" + resource);
        // 2.2 创建文档对象
        Document doc = new SAXReader().read(inputStream);
        // 2.3 得到根元素
        Element rootElement = doc.getRootElement();
        // 2.4 得到namespace属性
        String namespace = rootElement.attributeValue("namespace");
        // 2.5 读取根元素下的一个select标签
        Element selectElement = rootElement.element("select");
        // 2.6 得到id属性
        String id = selectElement.attributeValue("id");
        // 2.7 resultType属性
        String resultType = selectElement.attributeValue("resultType");
        // 2.8 SQL属性
        String sql = selectElement.getTextTrim();

        // 3.封装成Mapper对象
        // 3.1 创建一个自定义的Mapper对象,封装上面的三个属性
        Mapper mapper = new Mapper();
        mapper.setId(id);
        mapper.setResultType(resultType);
        mapper.setSql(sql);
        // 3.2 再封装namespace属性
        mapper.setNamespace(namespace);
        // 3.3 将封装好的mapper对象添加到this的mappers属性中,其中键是namespace+"."+id,值是自定义的mapper对象。
        String key = namespace + "." + id;
        this.mappers.put(key, mapper);
    }

}
```

**测试代码**

```java
package cn.guardwhy.test;

import cn.guardwhy.framework.Configuration;

public class TestFramework {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        System.out.println(configuration);
    }
}
```

### 5.5 创建数据源

1. 创建c3p0的数据源，数据源类：ComboPooledDataSource。
2. 设置数据库有关的属性：driver, url,username,password。
3. 将this的dataSource设置为上面创建好的数据源对象。

#### 5.5.2 代码实现

```java
/**
* 4.在构造方法中调用方法: 
*  loadSqlMapConfig()
*  调用createDataSource()方法
*/
public Configuration() {
    try {
        loadSqlMapConfig();
        createDataSource();  //创建数据源
    } catch (Exception e) {
        e.printStackTrace();
    }
}

/**
  创建数据源
*/
private void createDataSource() throws PropertyVetoException {
    //使用c3p0连接池
    ComboPooledDataSource ds = new ComboPooledDataSource();
    //在代码中设置连接池的属性
    ds.setUser(this.username);
    ds.setPassword(this.password);
    ds.setJdbcUrl(this.url);
    ds.setDriverClass(this.driver);
    //创建好的数据源赋值给成员变量
    this.dataSource = ds;
}
```

### 5.6 核心组件SqlSession

> **生成步骤**

1. 编写SqlSession类，提供一个getMapper()方法，获取接口的实现对象(代理对象）。
2. 测试：调用接口中的方法，其中查询数据库的方法，先不从数据库查，而是将模拟的数据写在代码中。

>  **JDK动态代理好处**

1. 接口的代理对象由程序在执行的过程中动态生成，不用我们自己去写一个类实现接口中所有的方法

2. 可以动态生成任意接口的对象

>  **Proxy 类中的方法**

**Proxy.newProxyInstance( )** ：创建UserMapper接口的动态代理对象。

**参数列表** : static Object newProxyInstance(ClassLoader loader, Class[] interfaces, InvocationHandler h)
**作用** : 动态生成代理对象。

| loader     | 与真实对象相同的类加载器                                     |
| ---------- | ------------------------------------------------------------ |
| interfaces | 代理类所有实现的接口                                         |
| h          | 调用代理对象的接口，使用时传入一个实现类。<br/>需要重写接口中的方法，实现真实对象中每个方法的调用。 |
| 返回       | 生成代理对象                                                 |

**InvocationHandler接口**

Object invoke(Object proxy, Method method, Object[] args)
作用：接口中这个方法会调用多次，真实对象中的每个被代理的方法都会调用一次

| proxy  | 动态生成的代理对象，不要在方法中直接调用，不然会出现递归死循环的调用。 |
| ------ | ------------------------------------------------------------ |
| method | 真实对象的方法                                               |
| args   | 代理对象调用方法时传递的参数                                 |
| 返回   | 方法的返回值                                                 |

**invoke() 方法**

| method.invoke(Object obj, Object[] args) | 通过反射调用真实对象中的每个方法 |
| ---------------------------------------- | -------------------------------- |
| Object obj                               | 真实对象                         |
| Object[] args                            | 调用真实的方法时传递的参数       |

**方法签名**

```java
public <T> T getMapper(Class<T> type) 
```

>  **InvocationHandler匿名类**

**分析图解**

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se1/18-javase.png" style="zoom: 80%;" />

**基本功能**

- 通过键得到Mapper对象。
- 从Mapper对象中得到SQL语句执行，并且封装成对象返回。

**生成步骤**

- 实例化Configuration对象，通过类全名+"."+方法名得到键。
- 通过键得到值Mapper对象，得到要执行的sql语句和返回的实体类型。
- 通过数据源得到连接对象，执行数据库操作，通过反射封装结果集并且返回。

#### 5.6.1 SqlSession类

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se1/19-javase.png" style="zoom:80%;" />

> **得到SQL语句和返回类型**

- 得到Configuration中Map集合


```xml
实例化Configuration对象
通过Configuration得到Mapper对象的集合
```

- 得到Map中的键：类全名.方法名


```xml
通过方法对象->得到声明的接口->得到名称：即类全名 com.itheima.dao.UserMapper
获取当前执行的方法名称：findAllUsers
通过类全名+方法名得到键
```

- 得到Mapper中相应的属性


```xml
通过类全名+"."+方法名，从mappers中得到映射的mapper对象
从mapper中获取查询的sql语句
从mapper中获取返回值类型resultType
通过反射将上面的resultType字符串转成类对象，供后面的方法使用
```

> **对象访问数据库**

- 通过Configuration得到数据源，通过数据源得到连接对象
- 调用List queryForList(Connection connection, String sql, Class clazz)方法

```xml
1. 使用JDBC从数据库中查询数据
2. 使用反射来实例化clazz对象，并且封装所有的属性，添加到集合中。
```

图示:

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/mybatis/14-Mybatis.png)

#### 5.6.2 JDBC访问数据库

```xml
创建集合List封装结果集，未使用泛型
通过Connection连接对象创建预编译的语句对象
执行查询，得到结果集ResultSet
```

> **封装数据成List 对象**

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/mybatis/15-Mybatis.png)

#### 5.6.3 代码示例

> **Session会话类**

```java
package cn.guardwhy.framework;

import javax.sql.DataSource;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 会话类
 */
public class SqlSession {
    /**
     * 创建UserMapper接口的代理对象
     * @param mapperClass 接口类对象
     * @param <T>
     * @return
     */
    public <T> T getMapper(Class<T> mapperClass){
        return (T) Proxy.newProxyInstance(SqlSession.class.getClassLoader(), new Class[]{mapperClass}, new InvocationHandler() {
            /***
             *
             * @param proxy 生成的代理对象
             * @param method   要调用的方法
             * @param args 方法的参数
             * @return 返回值:方法的返回值
             * @throws Throwable
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                // 1.创建Configuration对象
                Configuration configuration = new Configuration();
                // 2.得到方法的名字
                String id = method.getName();
                // 3.得到接口的名字
                String namespace = method.getDeclaringClass().getName();
                // 4.得到key值
                String key = namespace + "." + id;
                // 5.得到值
                Map<String, Mapper> mappers = configuration.getMappers();
                Mapper mapper = mappers.get(key);
                // 6.SQL语句
                String sql = mapper.getSql();
                // 7.得到返回数据类型
                String resultType = mapper.getResultType();
                // 8.得到它的类对象
                Class objClass = Class.forName(resultType);
                // 9.访问数据库需要Connection对象
                DataSource dataSource = configuration.getDataSource();
                Connection connection = dataSource.getConnection();

                // 使用JDBC来访问数据库,并且封装成List<User>
                List list = queryForList(connection, sql, objClass);
                return list;
            }
        });
    }

    /**
    使用JDBC来访问数据库，并且封装成List<User>
     */
    private List queryForList(Connection connection, String sql, Class clazz) throws Exception{
        List users = new ArrayList<>();
        // 1.通过连接对象得到预编译的语句对象
        PreparedStatement ps = connection.prepareStatement(sql);
        // 2.执行SQL语句,得到结果集
        ResultSet rs = ps.executeQuery();
        // 3.遍历结果集,将每一行记录封装成一个User对象
        while (rs.next()){
            Object user = clazz.getConstructor().newInstance();
            // 得到类中的所有成员变量
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields){
                // 得到成员变量的名字
                String name = field.getName();
                // 遍历成员变量给每个成员变量赋值
                field.setAccessible(true);
                // 从结果集取出所有的数据
                field.set(user, rs.getObject(name));
            }
            // 4.添加到集合中
            users.add(user);
        }

        rs.close();
        ps.close();
        connection.close();
        // 5.返回集合
        return users;
    }
}
```

**测试类**

```java
package cn.guardwhy.test;

import cn.guardwhy.dao.UserMapper;
import cn.guardwhy.domain.User;
import cn.guardwhy.framework.Configuration;
import cn.guardwhy.framework.SqlSession;

import java.util.List;

public class TestFramework {
    public static void main(String[] args) {
        // 1.使用SqlSession类
        SqlSession session = new SqlSession();
        // 2.调用getMapper(UserMapper.class),返回的就是代理对象
        UserMapper userMapper = session.getMapper(UserMapper.class);
        System.out.println(userMapper.getClass());
        // 3.调用代理对象的方法,得到所有的用户
        List<User> users = userMapper.findAllUsers();
        // 4.输出user
        users.forEach(System.out::println);
    }
}
```

## 6- Mybatis CRUD

### 6.1 项目环境

> **SQL数据**

```mysql
-- 创建数据库
create database mybatis
-- 创建user表
create table user (
  id int primary key auto_increment,
  username varchar(20) not null,
  birthday date,
  sex char(1) default '男',
  address varchar(50)
);
-- 插入数据
insert into user values (null, '侯大利','1980-10-24','男','江州');
insert into user values (null, '田甜','1992-11-12','女','阳州');
insert into user values (null, '王永强','1983-05-20','男','阳州');
insert into user values (null, '杨红','1995-03-22','女','秦阳');
```

#### 6.1.1 项目目录

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210310162019.png)

> **添加依赖**

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>cn.guardwhy</groupId>
    <artifactId>03_Mybatis_CRUD</artifactId>
    <version>1.0-SNAPSHOT</version>
    <packaging>jar</packaging>

    <!--倒入项目所需依赖-->
    <dependencies>
        <!--mybatis依赖-->
        <dependency>
            <groupId>org.mybatis</groupId>
            <artifactId>mybatis</artifactId>
            <version>3.5.0</version>
        </dependency>
        <!--mysql连接依赖-->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>5.1.37</version>
        </dependency>
        <!--日志依赖-->
        <dependency>
            <groupId>log4j</groupId>
            <artifactId>log4j</artifactId>
            <version>1.2.17</version>
        </dependency>
        <!--测试依赖-->
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
        </dependency>
        <!--lombok插件-->
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.18.16</version>
        </dependency>
    </dependencies>
</project>
```

> **db.properties**

编写数据库连接属性资源文件<font color = red>**（db.properties)**，</font>放在resources资源文件下。

```properties
jdbc.driver=com.mysql.jdbc.Driver
jdbc.url=jdbc:mysql://localhost:3306/db_mybatis
jdbc.username=root
jdbc.password=root
```

> **sqlMapConfig.xml(核心配置文件)**

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE configuration
        PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-config.dtd">
<configuration>

    <!--在内部配置属性：先读取内部的属性,再读取外部的属性,外部的会覆盖内部的,最后外部的属性起作用-->
    <properties resource="db.properties">
        <property name="jdbc.username" value="root"/>
        <property name="jdbc.password" value="root"/>
    </properties>

    <!--定义实体类别名-->
    <typeAliases>
        <!--
        package指定包名
        1. 自动将这个包下所有的实体类定义别名，别名就是类的名字。(在日志输出中会有乱码，不用理会，不影响使用，这是mybatis的bug)
        2. 如果有多个子包，只需要指定父包即可。
        3. 可以使用多个package标签，指定不同的包名
        -->
        <package name="cn.guardwhy.domain"/>
    </typeAliases>

    <!-- 一个核心配置文件，可以配置多个运行环境，default默认使用哪个运行环境 -->
    <environments default="default">
        <!-- 其中的一个运行环境，通过id来进行标识-->
        <environment id="default">
            <!--
            事务管理器type的取值：
            1. JDBC：由JDBC进行事务的管理
            2. MANAGED：事务由容器来管理，后期学习Spring框架的时候，所有的事务由容器管理
            -->
            <transactionManager type="JDBC"/>
            <!--
            数据源：
            1. POOLED：使用mybatis创建的连接池
            2. UNPOOLED：不使用连接池，每次自己创建连接
            3. JNDI：由服务器提供连接池的资源，我们通过JNDI指定的名字去访问服务器中资源。
            -->
            <dataSource type="POOLED">
                <property name="driver" value="${jdbc.driver}"/>
                <property name="url" value="${jdbc.url}"/>
                <property name="username" value="${jdbc.username}"/>
                <property name="password" value="${jdbc.password}"/>
            </dataSource>
        </environment>
    </environments>

    <!--映射器-->
    <mappers>
        <!--
        package表示扫描这个包下所有的映射文件
        1. 接口与映射文件在要同一个目录下
        2. 接口的名字与映射文件名字要相同
        -->
        <package name="cn.guardwhy.dao"/>
    </mappers>
</configuration>
```

>  **log4j.properties(日志)**

```properties
### 设置Logger输出级别和输出目的地 ###
log4j.rootLogger=debug, stdout

### 把日志信息输出到控制台 ###
log4j.appender.stdout=org.apache.log4j.ConsoleAppender
log4j.appender.stdout.Target=System.out
log4j.appender.stdout.layout=org.apache.log4j.SimpleLayout
```

#### 6.1.2 实体类

> **User类**

```java
package cn.guardwhy.domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
/**
 * 用户实体类
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;
    private String username;
    private Date birthday;
    private String sex;
    private String address;
}
```

> **QueryVo类**

```java
package cn.guardwhy.domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 包装类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QueryVo {
    private User user; // 包含用户对象
    private String start; // 开始日期
    private String end; // 结束日期
}
```

### 6.2 查询用户(select)

#### 6.2.1 普通查询

> **通过id查询一个用户**

```java
package cn.guardwhy.dao;

import cn.guardwhy.domain.User;

/**
 * 1. 添加User findUserById(Integer id)方法
 * 2. 参数使用引用类型
 */
public interface UserMapper {
    /**
     *  通过id查询一个用户
     */
    User findUserById(Integer id);
}
```

> **UserMapper.xml**

1. 添加select查询标签，并且设置属性id、parameterType、resultType
2. 编写查询语句，使用占位符#{变量名}
3. <font color="red">**在resources资源下创建cn/guardwhy/dao目录**</font>

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">

<!--实体类的映射文件 namespace 指定接口的类全名-->
<mapper namespace="cn.guardwhy.dao.UserMapper">
    <!--
    查询语句id: 接口中方法的名字, resultType：返回的实体类的类型类全名, parameterType: 参数的类型
    -->
    <select id="findUserById" resultType="cn.guardwhy.domain.User" parameterType="java.lang.Integer">
        select * from user where id = #{id}
    </select>
</mapper>
```

> **测试代码**

```java
package cn.guardwhy.test;
/*
1. 声明静态成员变量：SqlSessionFactory
2. 成员变量：SqlSession
3. 成员变量：UserMapper
4. 在@BeforeClass中创建工厂对象
5. 在@Before中创建会话对象和userMapper对象
6. 在@Test中编写通过id查询用户的方法
*/
import cn.guardwhy.dao.UserMapper;
import cn.guardwhy.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.InputStream;

/**
 * 测试类
 */
public class TestUserDao {
    // 会话工厂
    private static SqlSessionFactory factory;
    // 会话
    private SqlSession session;
    // 接口
    private UserMapper userMapper;

    /**
     * 类加载的时候执行一次,创建会话工厂
     */
    @BeforeClass
    public static void init() throws Exception{
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        factory = builder.build(inputStream);
    }

    /**
     * 每个测试方法前都会执行的方法
     */
    @Before
    public void begin(){
        session = factory.openSession(true);	//true设置为自动提交
        // 创建代理对象
        userMapper = session.getMapper(UserMapper.class);
    }

    @Test
    public void testFindUserById(){
        User user = userMapper.findUserById(1);
        System.out.println(user);
    }
}
```

#### 6.2.2 模糊查询

> **typeAliases(别名)**

作用：给用户自定义的实体类定义别名

**单个别名配置**

```xml
<!--定义实体类单个别名-->
    <!--
    typeAlias:
        1.type：指定实体类全名
        2.alias: 指定别名，如果省略这个属性，默认使用类名字做为别名，别名不区分大小写，通常别名使用小写。
    -->
<typeAlias type="cn.guardwhy.domain.User"/>
```

**包扫描配置别名**

```xml
<!--定义实体类别名-->
<typeAliases>
    <!--
        package指定包名
        1. 自动将这个包下所有的实体类定义别名，别名就是类的名字。(在日志输出中会有乱码，不用理会，不影响使用，这是mybatis的bug)
        2. 如果有多个子包，只需要指定父包即可。
        3. 可以使用多个package标签，指定不同的包名
     -->
    <package name="cn.guardwhy.domain"/>
</typeAliases>
```

> **UserMapper.xml**

**加载单个映射文件mapper**

注：如果是多级目录，是/而不是点号

```xml
<!--
指定外面的实体类映射文件resource: 加载类路径下映射文件，不是点号，是/
url: 可以绝对路径的方式访问映射文件.
class: 导入接口类名，用于注解配置的方式 "cn.guardwhy.dao.UserMapper"    
-->
<mapper resource="cn/guardwhy/dao/UserMapper.xml"/>
```

**包扫描加载映射**

包扫描方式加载mapper映射文件：

- 要求mapper映射文件，与mapper接口要放在同一个目录
- 要求mapper映射文件的名称，与mapper接口的名称要一致

```xml
<!--
package表示扫描这个包下所有的映射文件
1. 接口与映射文件在要同一个目录下
2. 接口的名字与映射文件名字要相同
-->
<package name="cn.guardwhy.dao"/>
```

>  **通过用户名查询用户**

```java
List<User> findUsersByName(String username);
```

> **UserMapper.xml**

1. 使用字符串拼接符${value}拼接参数
2. 字符串的参数类型此处只能使用value名字
3. 模糊查询前后使用%，外面使用单引号

```xml
<!--
通过名字模糊查询
${value}: 字符串拼接，使用$. 如果是简单类型：(8种基本类型+String类型)，这里变量名只能是value
-->
<select id="findUsersByName" parameterType="String" resultType="user">
   select * from user where username like '%${value}%'
</select>
```

#### 6.2.3 测试代码

```java
package cn.guardwhy.test;

import cn.guardwhy.dao.UserMapper;
import cn.guardwhy.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * 测试类
 */
public class TestUserDao {
    // 会话工厂
    private static SqlSessionFactory factory;
    // 会话
    private SqlSession session;
    // 接口
    private UserMapper userMapper;

    /**
     * 类加载的时候执行一次,创建会话工厂
     */
    @BeforeClass
    public static void init() throws Exception{
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        factory = builder.build(inputStream);
    }

    /**
     * 每个测试方法前都会执行的方法
     */
    @Before
    public void begin(){
        session = factory.openSession();
        // 创建代理对象
        userMapper = session.getMapper(UserMapper.class);
    }

    //通过id查询1个用户
    @Test
    public void testFindUserById(){
        User user = userMapper.findUserById(1);
        System.out.println(user);
    }

    // 通过名字模糊查询
    @Test
    public void testFindUserByName(){
        List<User> users = userMapper.findUsersByName("%大%");
        users.forEach(System.out::println);
    }

    // 用完后关闭会话
    @After
    public void end(){
        session.close();
    }
}
```

### 6.4 新增用户(insert)

> **新增用户**

```java
 // 3.新增用户
int addUser(User user);
```

> **UserMapper.xml**

1. 新增用户使用insert标签
2. 放置新增sql语句，参数类型使用User
3. 占位符使用user对象的各个#{属性名}

```xml
<!--
 添加用户
 因为增删改没有查询的结果集，所以不用配置resultType。有返回值，返回影响的行数。
-->
<insert id="addUser" parameterType="user">
    insert into user values (null, #{username},#{birthday},#{sex},#{address})
</insert>
```

#### 6.4.1 测试代码

插入新的记录

```java
/**
 添加1个用户
 在mybatis中增删改，默认是手动提交事务
 1. 设置成自动提交 factory.openSession(true);
 2. 自己手动提交 session.commit();
*/
@Test
public void testAddUser(){
    User user = new User(null, "老江", Date.valueOf("1975-03-10"),"男","江州");
    int row = userMapper.addUser(user);
    System.out.println("添加了" + row + "行");
}

// 用完后关闭会话
@After
public void end(){
    session.commit();	// 自己手动提交
    session.close();
}
```

#### 6.4.2 提交事务

==如果Java程序代码执行成功，但是数据库中并没有新增记录。原因是没有提交事务，在对数据库的更新操作中（增、删、改）要求提交事务==。

自动提交事务

```java
factory.openSession(true)
```

手动提交事务

```java
session.commit()
```

#### 6.4.3 查询新增记录主键值

> **子元素 selectKey **

| 属性        | 说明                                                         |
| ----------- | ------------------------------------------------------------ |
| keyColumn   | 主键在表中对应的列名                                         |
| keyProperty | 主键在实体类中对应的属性名                                   |
| resultType  | 主键的数据类型                                               |
| order       | BEFORE: 在添加语句前执行查询主键的语句<br />AFTER: 在添加语句后执行查询主键的语句 |

> **映射文件**

mysql中的函数：last_insert_id() 得到最后添加的主键

```xml
<!--
 添加用户
 因为增删改没有查询的结果集，所以不用配置resultType。有返回值，返回影响的行数。
-->
<insert id="addUser" parameterType="user">
    insert into user values (null, #{username},#{birthday},#{sex},#{address})
    <!--
        keyColumn:主键在表中对应的列名
        keyProperty:主键在实体类中对应的属性名
        resultType:主键的数据类型
          order:
            BEFORE: 在添加语句前执行查询主键的语句,AFTER: 在添加语句后执行查询主键的语句.
     -->
    <selectKey keyColumn="id" keyProperty="id" resultType="int" order="AFTER">
        select last_insert_id()
    </selectKey>
</insert>
```

> **UserMapper.xml**

==直接在insert标签中增加属性的方式，只适合于支持自动增长主键类型的数据库，比如MySQL或SQL Server==。

```xml
<insert id="addUser" parameterType="user" useGeneratedKeys="true" keyColumn="id" keyProperty="id">
  insert into user values (null,#{username},#{birthday},#{sex},#{address})
</insert>
```

**增加属性**

| 属性             | 说明                    |
| ---------------- | ----------------------- |
| useGeneratedKeys | true 使得自动生成的主键 |
| keyColumn        | 表中主键的列名          |
| keyProperty      | 实体类中主键的属性名    |

#### 6.4.4 测试代码

```java
/**
通过getId()得到新增的主键值
*/
@Test
public void testAddUser(){
    // 得到主键的值
    Integer id = user.getId();
    System.out.println("生成主键的值:" + id);
}
```

#### 6.4.5 万能的Map

> **假如实体类或者数据库的表，字段或者参数过多，应该适当的考虑使用Map！！！**

**新增用户**

```java
// 在接口方法中，参数直接传递Map
int addUser2(Map<String, Object> map);
```

**UserMapper.xml**

```xml
<!--
插入数据:编写sql语句的时候，需要传递参数类型，参数类型为map
-->
<insert id="addUser2" parameterType="map">
    insert into db_mybatis.user (id , username, birthday, sex, address) 
    values
    (#{userid1}, #{username1},#{birthday1},#{sex1},#{address1});
</insert>
```

**测试代码**

```java
@Test
public void addUser2(){
    // 1.创建map集合
    Map<String, Object> map = new HashMap<String, Object>();
    // 2.向集合中添加元素
    map.put("userid1", 11);
    map.put("username1","kobe");
    map.put("birthday1", Date.valueOf("1993-06-19"));
    map.put("sex1", "男");
    map.put("address1", "番禺区");
    // 3.插入数据
    int row = userMapper.addUser2(map);
    System.out.println("添加了" + row + "行");

}
```

> **总结：**

Map传递参数，直接在sql中取出key即可。【paramterType="map"】

对象传递参数，直接在sql中取对象的属性即可！【parameterType="Object"】

只有一个基本类型参数的情况下，可以直接在SQL中取得。

### 6.5 修改用户(update)

> 根据用户Id修改用户

```java
int updateUser(User user);
```

> 配置mapper映射文件

```xml
<!--
	1. 根据用户id修改用户其它属性
	2. 使用update标签：放置修改sql语句
	3. 占位符使用：#{属性名}
-->

<!--修改用户-->
<update id="updateUser" parameterType="user">
    update user set username=#{username}, birthday=#{birthday}, sex=#{sex}, address=#{address} where id = #{id}
</update>
```

#### 6.5.1 测试代码

1. 修改8号用户的名字，生日，性别，地址
2. 更新用户对象

```java
@Test
// 更新8号用户
public void testUpdateUser(){
    User user = new User(8, "田跃进", Date.valueOf("1976-05-10"), "男", "秦阳");
    int row = userMapper.updateUser(user);
    System.out.println("更新了" + row + "行");
}
```

### 6.6 删除用户(delete)

> 根据用户id删除用户

```java
int deleteUser(Integer id);
```

>  配置mapper映射文件

```xml
<!--
1. 根据用户Id删除用户
2. delete标签：放置删除sql语句
-->
<delete id="deleteUser" parameterType="int">
    delete from user where id = #{id}
</delete>
```

#### 6.1 测试代码

```java
// 删除用户
@Test
public void testDeleteUser(){
    int row = userMapper.deleteUser(12);
    System.out.println("删除了" + row + "行记录");
}
```

### 6.7 生命周期和作用域

> Mybatis的执行过程

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210317135230.png" style="zoom: 67%;" />

==生命周期和作用域，是至关重要的，因为错误的使用会导致非常严重的并发问题!!!==

> **SqlSessionFactoryBuilder** 

- 一旦创建了 SqlSessionFactory，就不需要它了。
- 局部变量。

> **SqlSessionFactory**

- 说白了可以把它想象为数据库连接池。
- ==SqlSessionFactory一旦被创建就应该在应用的运行期间一直存在, 没有任何理由丢弃它或重新创建另一个实例==。
- 因此SqlSessionFactory的最佳作用域是应用作用域。
- 最简单的就是使用==单例模式==或者静态单例模式。

> **SqlSession**

- 连接到连接池的一个请求。
- ==SqlSession的实例不是线程安全的，因此是不能被共享的，所以它的最佳的作用域是请求或方法作用域==。
- 用完之后需要赶紧关闭,否则资源被占用！！

**注意:** 这里面的每一个Mapper，就代表一个具体的业务。

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210310223447.png" style="zoom:80%;" />

## 7- Mybatis_Multitable

### 7.1 参数输入类型

> **简单类型**

Java简单类型(9种：8种基本+String)

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/mybatis/18-Mybatis.png)

>  **POJO类型**

POJO（Plain Ordinary Java Object）简单的Java对象，实际就是普通JavaBean，即我们前面封装数据使用的实体类。

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/mybatis/19-Mybatis.png)

> **POJO包装类型**

包装类型：就是在实体类中包含了其它的实体类。

```java
package cn.guardwhy.domain;
/**
 * 包装类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QueryVo {
    private User user; // 包含用户对象
    private String start; // 开始日期
    private String end; // 结束日期
}
```

### 7.2 多条件查询

> **UserMapper**

```java
// 使用POJO包装类型,根据用户名称模糊查询用户
List<User> findUsersByCondition(QueryVo queryVo);
```

> **UserMapper.xml**

```xml
<!--
    1. 使用POJO包装类型，根据用户名称模糊查询用户
    2. 在核心配置文件中已经定义了类的别名
    3. 占位符使用 '%${user.username}%'，user是QueryVo中的属性
    4. 占位符使用#{start}和#{end}
    5. 分别使用between和小于大于编写SQL语句
-->
<select id="findUsersByCondition" parameterType="queryVo" resultType="user">
    select * from user where username like '%${user.username}%' and birthday between #{start} and #{end}
</select>
```

#### 7.2.1 测试代码

1. 创建封装条件的对象QueryVo
2. 创建user实体类，设置用户名为"大"，设置user为QueryVo的属性
3. 设置开始日期和结束日期，为1980-1-1到1993-1-1之间出生的。
4. 将QueryVo对象做为查询条件

```java
// POJO多条件查询
@Test
public void testFindUsersByCondition(){
    QueryVo queryVo = new QueryVo();
    User user = new User();
    user.setUsername("大");
    queryVo.setUser(user);

    queryVo.setStart("1980-1-1");
    queryVo.setEnd("1993-1-1");
    List<User> userList = userMapper.findUsersByCondition(queryVo);
    userList.forEach(System.out::println);
}
```

### 7.3 resultType输出类型

输出结果resultType的两种类型

- 简单类型:8种基本类型+String类型
- POJO实体类型

> **UserMapper**

```java
 // 统计用户表中某种性别的数量
 int getAmountBySex(String sex);
```

> **UserMapper.xml**

统计用户表中的女生的用户数量 

```xml
<!--统计用户表中某种性别的数量-->
<select id="getAmountBySex" resultType="int" parameterType="String" >
    select count(*) from user where sex=#{sex};
</select>
```

#### 7.3.1 测试代码

```java
// 统计用户表某种性别的数量
@Test
public void testGetAmountBySex(){
    int amount = userMapper.getAmountBySex("女");
    System.out.println("女生的数量:" + amount);
}
```

### 7.4 resultMap输出映射

> **修改表结构**

```mysql
-- 复制user为user2新表，新复制的表没有主键约束，没有自增
create table user2 select * from user;

-- 添加主键约束
alter table user2 add primary key (id);

-- 增加自增功能
alter table user2 modify id int auto_increment;

-- 从100开始自增
alter table user2 auto_increment = 100;

-- 修改用户表结构，将用户名字段由username改成user_name
alter table user2 change username user_name varchar(20);

select * from user2;
```

> **查询结果**

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/mybatis/20-Mybatis.png)

#### 7.4.1 用户实体类

```java
package cn.guardwhy.domain;

import java.sql.Date;
/**
 * 用户实体类
*/
@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
    private Integer id;
    private String username;
    private Date birthday;
    private String sex;
    private String address;
}
```

> **UserMapper**

```java
// 8.通过id查询用户
User findUser2ById(Integer id);
```

> **UserMapper.xml**

```xml
<!--通过id查询user2表-->
<select id="findUser2ById" resultType="user" parameterType="int">
    select * from user2 where id = #{id}
</select>
```

> **查询结果(属性与列表不匹配)**

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/mybatis/21-Mybatis.png)

#### 7.4.2 解决方法

> **UserMapper.xml(定义别名)**

```xml
<!--通过id查询user2表-->
<select id="findUser2ById" resultType="user" parameterType="int">
    	<!--在SQL语句中定义别名 as username-->
    select id, user_name as username, birthday,sex, address from user2 where id = #{id}
</select>
```

> **查询结果**

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/mybatis/22-Mybatis.png)

> **使用resultMap实现**

resultMap用于配置sql语句中字段（列）的名称，与java对象中属性名称的对应关系。本质上还是要把执行结果映射到java对象上。

- 定义一个映射关系，指定它的id。
- 在查询的时候，将查询的结果指定为上面定义的映射。

> **UserMapper.xml**

1. 定义映射，指定id和type，type为实体类的别名。
2. id标签：映射主键字段，如果列名与属性名相同可以省略。
3. result标签：映射普通字段，指定哪个属性对应哪个列，这里只需映射username即可。
4. 在查询的结果中使用resultMap，为上面的映射id。

```xml
<!-- 
	结果集映射
	1. 定义映射 id: 映射的名字 type:实体类 
-->
<resultMap id="userMap" type="user">
    <!--id表示定义主键列 property: 实体类中属性名 column: 表中主键列 -->
    <id property="id" column="id"/>
    <!--
		column数据库中的字段,property实体类中的属性
	-->
    <result property="username" column="user_name"/>
</resultMap>
<!-- 2.通过id查询user2表-->
<select id="findUser2ById" resultMap="userMap" parameterType="int">
    select * from user2 where id = #{id}
</select>
```

#### 7.4.3  测试代码

```java
//通过id查询1个用户
@Test
public void testFindUser2ById(){
    User user = userMapper.findUser2ById(1);
    System.out.println(user);
}
```

#### 7.4.4 查询结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/mybatis/22-Mybatis.png)

#### 7.4.5 映射流程

**总结:**

resultMap元素是Mybatis中的最强大元素。

ResultMap的设计思想，对于简单的语句根本不需要配置显示的结果映射，而对于复杂一点的语句只需要描述他们的关系就行了。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/mybatis/23-Mybatis.png)

## 8- 分页操作

### 8.1 项目环境

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210311183924.png" style="zoom:80%;" />

### 8.2 limit实现分页

> 为什么需要分页？

在使用mybatis等持久层框架的时候，会经常对数据进行增删改查操作，使用最多的是对数据库进行查询操作，如果查询大量数据的时候，可以通过使用分页进行查询，也就是每次处理小部分数据，这样数据库压力就在可控范围内。

**使用Limit实现分页**

```sql
#级别语法
SELECT * FROM table LIMIT stratIndex，pageSize

# 检索记录行 6-15 
SELECT * FROM table LIMIT 5,10; 

#如果只给定一个参数，它表示返回最大的记录行数目：  
SELECT * FROM table LIMIT 5; //检索前 5 个记录行 

#换句话说，LIMIT n 等价于 LIMIT 0,n。 
```

> **UserMapper**

```java
// 分页查询
List<User> getUserByLimit(Map<String, Integer> map);
```

> **UserMapper.xml**

```xml
<!--分页操作-->
<select id="getUserByLimit" parameterType="map" resultType="user">
    select * from user limit #{startIndex},#{pageSize}
</select>
```

#### 8.2.1 代码示例

```java
/*
 *  分页测试
 */
@Test
public void getUserByLimit(){
    // 1.通过工具类得到会话对象
    SqlSession sqlSession = MybatisUtils.getSession();
    // 2.会话对象的得到mapper接口代理对象
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    // 3.创建Map集合
    HashMap<String, Integer> map = new HashMap<>();
    // 往集合中添加数据
    map.put("startIndex", 0);
    map.put("pageSize", 2);

    List<User> users = mapper.getUserByLimit(map);
    users.forEach(System.out::println);
}
```

#### 8.2.2 执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210311184908.png)

### 8.3 RowBounds分页

除了使用Limit在SQL层面实现分页，也可以使用RowBounds在Java代码层面实现分页。

> **UserMapper**

```java
// RowBounds分页(Java代码实现)
List<User> getUserByRowBounds();
```

> **UserMapper.xml**

```xml
<!--3.分页操作-->
<select id="getUserByRowBounds" resultType="user">
    select * from user
</select>
```

#### 8.3.1 代码示例

```java
/*
 *  RowBounds类(Java实现)
 */
@Test
public void getUserByRowBounds(){
    // 1.通过工具类得到会话对象
    SqlSession sqlSession = MybatisUtils.getSession();
    // 2.RowBounds类实现
    RowBounds rowBounds = new RowBounds(1, 2);
    // 3.通过Java代码层面实现分页
    List<User> users = sqlSession.selectList("cn.guardwhy.dao.UserMapper.getUserByRowBounds", null, rowBounds);

    users.forEach(System.out::println);
    // 4.关闭会话
    sqlSession.close();
}
```

#### 8.3.2 执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210311225400.png)

### 8.4 PageHelper插件

**PageHelper插件官方地址**: [https://pagehelper.github.io/](https://pagehelper.github.io/)

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210311225749.png)

**官方文档使用**: [https://pagehelper.github.io/docs/howtouse/](https://pagehelper.github.io/docs/howtouse/)

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210311230451.png" style="zoom: 80%;" />

## 9- 多表查询(xml)

### 9.1 数据库表关系介绍

**关系型数据库表关系分为**

```markdown
* 一对一关联关系
	人和身份证的关系。一个人只能有一张身份证，一张身份证只能属于一个人。双向【一对一】关联关系。
	
* 一对多关联关系
	一个用户可以有多个订单，从用户到订单是【一对多】关联关系。
	一个订单只能属于一个人，从订单到人是【一对一】的关联关系。
	【注意:】一个订单只从属于一个用户，所以mybatis将多对一看成了一对一
    
* 多对多关联关系
	举一个例子：业务系统中，用户和角色的关系。
	一个用户可以有多种角色：小明有可能是：经理，员工，总经理
	一种角色可以有多个用户：经理这个角色，有多个人：kobe , Curry。际项目中，多对多关系通过中间表，看成两个一对多关联关系。
```

### 9.2 SQL数据表结构

```mysql
-- drop table if exists use;

-- 创建用户基本表
create table user(
	id int primary key auto_increment, -- 主键自增长
	username varchar(20) not null,
	birthday date,
	sex char(1) default '男',
	address varchar(50)
)engine=innodb auto_increment=4 default charset=utf8;

insert into user3 values (null, '侯大利','1990-10-24','男','江州');
insert into user3 values (null, '王大青','1992-11-12','女','秦阳');
insert into user3 values (null, '朱琳','1983-05-20','男','江州');
insert into user3 values (null, '田大甜','1993-03-22','女','阳州');

-- 查询数据
select * from user;

-- 创建订单表
create table orders (
	id INT PRIMARY KEY auto_increment, -- 主键自增长
	ordertime varchar(100) , -- 订单时间
	total double, -- 订单总额
	oid int -- 外键
) engine=innodb auto_increment=4 default charset=utf8;

-- 添加外键约束
alter TABLE orders ADD constraint fk_ep_id FOREIGN KEY(oid) REFERENCES user(id);

-- 插入数据
insert into `orders` values ('1', '2020-2-12', '3000', '1');
insert into `orders` values ('2', '2020-12-1', '5000', '2');
insert into `orders` values ('3', '2020-5-12', '5600', '3');
insert into `orders` values ('4', '2020-4-1', '5600', '4');
insert into `orders` values ('5', '2020-8-11', '5600', '5');
insert into `orders` values ('6', '2020-1-29', '5600', '6');
```

### 9.3 一对一关联(多对一)

**一对一查询模型**
用户表和订单表的关系为，一个用户有多个订单，一个订单只从属于一个用户。
一对一查询的需求：查询所有订单，与此同时查询出每个订单所属的用户(==从订单的角度出发，一个订单只能有一个用户==)。

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210313203344.png)

**一对一查询语句**

```mysql
-- 查询数据
select * from orders o left join user u on o.oid =u.id
```

#### 9.3.1项目目录

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210313221518.png" style="zoom:80%;" />

#### 9.3.2 代码示例

> **User用户类**

```java
package cn.guardwhy.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
/*
* 用户类
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;
    private String username;
    private Date birthday;
    private String sex;
    private String address;
}

```

> **Orders订单类**

```java
package cn.guardwhy.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
*订单表
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
    private Integer id; // 订单id
    private String ordertime; // 订单时间
    private double money; // 总额

    // 表示当前订单属于哪个用户
    private User user;
}
```

> **sqlMapConfig.xml**

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE configuration
        PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-config.dtd">
<configuration>

    <!--在内部配置属性 -->
    <properties resource="db.properties">
        <property name="jdbc.username" value="root"/>
        <property name="jdbc.password" value="root"/>
    </properties>

    <!--标准的日志工厂实现-->
    <settings>
        <setting name="logImpl" value="LOG4J"/>
    </settings>

    <!--定义实体类别名-->
    <typeAliases>
        <package name="cn.guardwhy.domain"/>
    </typeAliases>

    <!-- 一个核心配置文件 -->
    <environments default="default">
        <!-- 其中的一个运行环境，通过id来进行标识-->
        <environment id="default">
            <!--事务管理器 -->
            <transactionManager type="JDBC"/>
            <!--数据源 -->
            <dataSource type="POOLED">
                <property name="driver" value="${jdbc.driver}"/>
                <property name="url" value="${jdbc.url}"/>
                <property name="username" value="${jdbc.username}"/>
                <property name="password" value="${jdbc.password}"/>
            </dataSource>
        </environment>
    </environments>

    <!--映射器-->
    <mappers>
        <package name="cn.guardwhy.dao"/>
    </mappers>
</configuration>
```

> **OrderMapper接口**

```java
package cn.guardwhy.dao;

import cn.guardwhy.domain.Orders;

import java.util.List;

// 订单接口
public interface OrderMapper {
    // 1.查找所有订单的信息
     List<Orders> findAllUser();
}
```

> **OrderMapper.xml映射**

==association标签：实现一对一关系==

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210313195508.png" style="zoom:80%;" />

| association标签的属性 | 说明                                           |
| --------------------- | ---------------------------------------------- |
| property              | 一对一对应的另一方实体类的属性名，如:Orders    |
| resultMap             | 指定另一方映射配置的id，如：用户扩展信息的映射 |

1. 定义User的映射**<font color = red>userMap</font>**，包含主键和所有的属性，无论属性名与列名是否相同。
2. 定义用户信息的映射**<font color= "#009999">OrdersMap</font>**，包含主键和所有的属性，无论属性名与列名是否相同。
3. **<font color=#333399>定义映射userAndOrderMap，extends继承于orderMap，同时必须指定type属性</font>**。
4. 使用association定义一对一关联映射，**<font color = #990099>指定：property、resultMap属性，将resultMap指定为userMap</font>**。
5. 使用表连接查询：通过用户id查询用户和对应的用户扩展信息，查询结果映射为userAndOrderMap。 

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">

<!-- 实体类接口的类全名 -->
<mapper namespace="cn.guardwhy.dao.OrderMapper">

    <!--1.创建User映射-->
    <resultMap id="userMap" type="user">
        <!--映射主键-->
        <id column="id" property="id"></id>
        <result column="user_name" property="username"></result>
        <result column="birthday" property="birthday"></result>
        <result column="sex" property="sex"></result>
        <result column="address" property="address"></result>
    </resultMap>

    <!--2.创建orders映射-->
    <resultMap id="orderMap" type="orders">
        <id column="oid" property="id"></id>
        <result column="ordertime" property="ordertime"></result>
        <result column="total" property="total"></result>
    </resultMap>

    <!--3.创建一对一关联extends, 将上面的映射关系复制过来-->
    <resultMap id="userAndOrderMap" type="orders" extends="orderMap">
        <!--一对一关联-->
        <association property="user" resultMap="userMap"></association>
    </resultMap>

    <!--4. 使用上面的1对1的映射-->
    <select id="findAllUser" resultMap="userAndOrderMap">
        select * from orders o left join user u on o.oid =u.id
    </select>
</mapper>
```

**一对一XML配置关系图**

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210314012012.png" style="zoom:80%;" />

#### 9.3.3 测试结果

查询输出用户和订单信息

```java
package cn.guardwhy.test;

import cn.guardwhy.dao.OrderMapper;
import cn.guardwhy.domain.Orders;
import cn.guardwhy.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

// 测试代码
public class MybatisTest {
    @Test
    public void testOrderWithUser(){
        // 1.通过工具类得到会话对象
        SqlSession sqlSession = MybatisUtils.getSession();
        // 2.会话对象的得到mapper接口代理对象
        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
        // 3.调用方法
        List<Orders> orders = mapper.findAllUser();
        // 4.遍历操作
        for (Orders order : orders) {
            System.out.println(order);
        }
    }
}
```

**执行结果**

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210313221705.png)

### 9.4  一对多关联

#### 9.4.1 基本介绍

> **一对多查询模型**

用户表和订单表的关系为，一个用户有多个订单，一个订单只从属于一个用户
一对多查询的需求：查询所有用户，与此同时查询出该用户具有的订单。(==从用户的角度出发,一个用户可以拥有多个订单==)

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210314004530.png" style="zoom:80%;" />

> **一对多查询语句**

```sql
select * from orders o right join user u on o.oid =u.id
```

#### 9.4.2 代码示例

> **User实体类**

```java
package cn.guardwhy.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/*
* 用户类
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;
    private String username;
    private Date birthday;
    private String sex;
    private String address;

    // 代表当前用户具备的订单列表
    private Lit<Orders> ordersList;
}
```

> **UserMapper接口**

```java
// 1.一对多关联查询:查询所有的用户,同时还要查询每个用户所关联的订单信息
List<User> findAllWithOrder();
```

> **UserMapper.xml**

==**collection标签**：用来配置1对多的关联映射==

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210314010821.png)

| collection的属性 | 说明                                |
| ---------------- | ----------------------------------- |
| property         | 多方属性的名字，如：orders          |
| javaType         | 多方的属性类型，可以省略。如：list  |
| ofType           | 集合中每个元素的类型，如：orderForm |
| resultMap        | 多方的映射，如：订单映射 orderMap   |

**步骤**

1. 定义订单的映射orderMap
2. 配置用户到订单的一对多关联关系userOrdersMap，继承于userMap
3. collection：配置一对多关联关系，指定property，ofType，resultMap为orderMap          
4. 查询某个用户，并且查询关联的多个订单信息，结果为userOrdersMap

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">

<!-- 实体类接口的类全名 -->
<mapper namespace="cn.guardwhy.dao.UserMapper">

    <!--1.创建User映射-->
    <resultMap id="userMap" type="user">
        <!--映射主键-->
        <id column="id" property="id"></id>
        <result column="user_name" property="username"></result>
        <result column="birthday" property="birthday"></result>
        <result column="sex" property="sex"></result>
        <result column="address" property="address"></result>
    </resultMap>

    <!--2.创建orders映射-->
    <resultMap id="orderMap" type="orders">
        <id column="oid" property="id"></id>
        <result column="ordertime" property="ordertime"></result>
        <result column="total" property="total"></result>
    </resultMap>

    <!--3.配置1对多的映射-->
    <resultMap id="userOrdersMap" type="user" extends="userMap">
        <!--
        property: 多方的属性名 javaType：多方的属性类型
        ofType: 集合中每个元素的类型 resultMap：多方映射
        -->
        <collection property="ordersList" javaType="List" ofType="Orders" resultMap="orderMap"></collection>
    </resultMap>

    <!--4.一对多关联查询-->
    <select id="findAllWithOrder" resultMap="userOrdersMap">
        select * from orders o right join user u on o.oid =u.id
    </select>
</mapper>
```

**一对多XML配置关系**

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210314012012.png" style="zoom:80%;" />

> **测试代码**

```java
@Test
public void testUserWithOrder(){
    // 1.通过工具类得到会话对象
    SqlSession sqlSession = MybatisUtils.getSession();
    // 2.会话对象的得到mapper接口代理对象
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    // 3.调用方法
    List<User> userList = mapper.findAllWithOrder();
    // 4.遍历操作
    for (User user : userList) {
        System.out.println(user);
    }
}
```

#### 9.4.3 测试结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210314011720.png)

### 9.5 多对多关联

#### 9.5.1 基本介绍

**多对多查询的模型**
==用户表和角色表的关系为，一个用户有多个角色，一个角色被多个用户使用==。
多对多查询的需求：查询所有用户同时查询出该用户的所有角色。

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210314154833.png" style="zoom:80%;" />

> **多对多查询语句**

```sql
-- 创建角色表
create table role(
	id int primary key auto_increment comment '角色id(主键)',
	role_name varchar(32) not null comment '角色名称',
	role_detail varchar(100) default null comment '角色描述'
);

-- 插入数据
insert into role(role_name, role_detail) values('普通刑警', '刑侦破案');
insert into role(role_name, role_detail) values('法医', '协助刑警破案');
insert into role(role_name, role_detail) values('犯罪嫌疑人', '驾校老板');
insert into role(role_name, role_detail) values('个体户', '私营企业老板');
insert into role(role_name, role_detail) values('特警', '重大刑事抓捕');
insert into role(role_name, role_detail) values('刑警支队长', '普通刑警管理者');

-- 角色中间表
create table user_role(
	user_id int not null comment '用户id',
	role_id int not null comment '角色id',
	primary key(user_id, role_id), -- 复合主键
	foreign key(user_id) references user(id),
	foreign key(role_id) references role(id)
);

-- 插入数据
insert into user_role(user_id,role_id) values(1,1);  -- 1号用户对应1号角色
insert into user_role(user_id,role_id) values(2,2);
insert into user_role(user_id,role_id) values(3,3);
insert into user_role(user_id,role_id) values(4,4);
insert into user_role(user_id,role_id) values(1,6);
insert into user_role(user_id,role_id) values(6,6);
insert into user_role(user_id,role_id) values(5,5);

select * from user_role;

-- 查询所有用户同时查询该用户的所有角色
select u.*, r.id rid, r.role_name, r.role_detail from user u left join user_role ur on u.id = ur.user_id
															 left join role r on ur.role_id = r.id
```

#### 9.5.2 代码示例

> **Role(角色实体类)**

```java
package cn.guardwhy.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
* 角色实体类
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    private Integer id;
    private String roleName; // 角色名称
    private String roleDetail; // 角色描述
}
```

> **User(创建多对多的关系)**

```java
package cn.guardwhy.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/*
* 用户类
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;
    private String username;
    private Date birthday;
    private String sex;
    private String address;

    // 代表当前用户具备的订单列表
    private List<Orders> ordersList;
    // 表示多方关系:代表了当前用户所具有的角色列表
    private List<Role> roleList;
}
```

> **用户接口类**

```java
// 多对多关联查询:查询所有的用户，同时还要查询出每个用户所关联的角色信息
List<User> findAllWithRole();
```

> **UserMapper.xml映射**

1. 定义User的映射配置userMap。
2. 定义角色的映射roleMap，配置主键和所有的属性。
3. 定义一个用户对象对应多个角色userAndRoleMap，继承于userMap。
4. 使用collection关联映射，指定property，javaType，ofType，resultMap为roleMap。
5. 定义查询findAllWithRole，映射结果是: userAndRoleMap。

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">

<!-- 实体类接口的类全名 -->
<mapper namespace="cn.guardwhy.dao.UserMapper">

    <!--1.1 创建User映射-->
    <resultMap id="userMap" type="user">
        <!--映射主键-->
        <id column="id" property="id"></id>
        <result column="user_name" property="username"></result>
        <result column="birthday" property="birthday"></result>
        <result column="sex" property="sex"></result>
        <result column="address" property="address"></result>
    </resultMap>

    <!--1.2 配置角色的映射-->
    <resultMap id="roleMap" type="role">
        <id property="id" column="id"></id>
        <id property="roleName" column="role_name"/>
        <id property="roleDetail" column="role_detail"/>
    </resultMap>

    <!--1.3配置多对多的映射-->
    <resultMap id="userAndRoleMap" type="user" extends="userMap">
        <!--
           property: 多方的属性名
           javaType：多方的属性类型
           ofType: 集合中每个元素的类型
           resultMap：多方映射
       -->
        <collection property="roleList" javaType="List" ofType="Role" resultMap="roleMap"/>
    </resultMap>
    <!--1.4 多对多的关联查询-->
    <select id="findAllWithRole" resultMap="userAndRoleMap">
        select u.*, r.id rid, r.role_name, r.role_detail from user u left join user_role ur on u.id = ur.user_id																                 left join role r on ur.role_id = r.id
    </select>
</mapper>
```

> **多对多XML配置关系**

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210314170300.png)

> **测试代码**

```java
// 多对多关联查询
 @Test
public void testUserWithRole(){
    SqlSession sqlSession = MybatisUtils.getSession();
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    List<User> userList = mapper.findAllWithRole();
    userList.forEach(System.out::println);
}
```

#### 9.5.3 测试结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210314165546.png)

## 10-嵌套查询

### 10.1 项目目录

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210315160022.png" style="zoom:80%;" />

### 10.2 什么是嵌套查询

==嵌套查询就是将原来多表查询中的联合查询语句拆成单个表的查询，再使用mybatis的语法嵌套在一起==。

**案例实现**

```sql
-- 需求：查询一个订单，与此同时查询出该订单所属的用户

# 1. 联合查询
select * from orders o left join user u on o.oid =u.id
#2. 嵌套查询
	#2.1先查询订单
		Select * from orders
	#2.2 再根据订单uid外键，查询用户
		select * from user where id = #{根据订单查询的oid}
	2.3 最后使用mybatis，将以上二步嵌套起来
...
```

### 10.3 一对一嵌套查询

#### 10.3.1 **基本介绍**

需求：查询一个订单，与此同时查询出该订单所属的用户

> **一对一查询语句**

```sql
-- 先查询订单
Select * from orders;
-- 再根据订单oid外键，查询用户
select * from user where id = #{根据订单查询的oid}
```

#### 10.2.2 代码实现

> **OrderMapper接口**

```java
// 1.查询所有的订单,与此同时还要查出每个订单所属的用户信息
List<Orders> findAllWithUser1();
```

> **OrderMapper.xml**

```xml
<!--1.1 orderMap映射-->
<resultMap id="orderMap1" type="orders">
    <id column="id" property="id"></id>
    <result column="ordertime" property="ordertime"></result>
    <result column="total" property="total"></result>
    <result column="oid" property="oid"></result>

    <association property="user" javaType="user" column="oid" select="cn.guardwhy.dao.UserMapper.findById"/>
</resultMap>
<!--1.2 一对一嵌套查询-->
<select id="findAllWithUser1" resultMap="orderMap1">
    select * from orders
</select>
```

> **UserMapper接口**

```java
// 根据ID查询用户
User findById(Integer id);
```

> **UserMapper.xml**

```xml
<!--1.1映射主键-->
<resultMap id="userMap1" type="user">
    <id column="id" property="id"></id>
    <result column="user_name" property="username"></result>
    <result column="birthday" property="birthday"></result>
    <result column="sex" property="sex"></result>
    <result column="address" property="address"></result>
</resultMap>
<!--1.2 根据id查询用户-->
<select id="findById" resultMap="userMap1">
    select * from user where id = #{oid}
</select>
```

> **测试代码**

```java
@Test
public void testOrderWithUser(){
    // 1.通过工具类得到会话对象
    SqlSession sqlSession = MybatisUtils.getSession();
    // 2.会话对象的得到mapper接口代理对象
    OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
    // 3.调用方法
    List<Orders> orders = mapper.findAllWithUser1();
    // 4.遍历操作
    for (Orders order : orders) {
        System.out.println(order);
    }
}
```

**执行结果**

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210315160917.png)

### 10.4 一对多嵌套查询

#### 10.4.1 基本介绍

需求：查询所有用户，与此同时查询出该用户具有的订单

> **一对多查询语句**

```sql
-- 先查询用户
Select * from user;
-- 再根据用户id主键，查询订单列表
select * from orders where oid = #{用户id}
```

#### 10.4.2 代码实现

> **UserMapper接口**

```java
// 查询所有的用户，同时还要查询出每个用户所关联的订单信息
List<User> findAllWithOrders();
```

> **UserMapper.xml**

```xml
<!--2.1映射主键-->
<resultMap id="userMap2" type="user">
    <id column="id" property="id"></id>
    <result column="user_name" property="username"></result>
    <result column="birthday" property="birthday"></result>
    <result column="sex" property="sex"></result>
    <result column="address" property="address"></result>
    <!--根据用户Id，查询订单表-->
    <collection property="ordersList" column="id" ofType="Orders" select="cn.guardwhy.dao.OrderMapper.findByUid"></collection>
</resultMap>
<!--一对多嵌套查询-->
<select id="findAllWithOrders" resultMap="userMap2">
    select * from user
</select>
```

> **OrderMapper接口**

```java
// 根据oid查询对应订单
List<Orders> findByUid(Integer oid);
```

> **OrderMapper.xml**

```xml
<!--一对多嵌套查询-->
<select id="findByUid" parameterType="int" resultType="orders">
    select * from orders where oid = #{oid}
</select>
```

> **测试代码**

```java
@Test
public void testUserWithOrder(){
    // 1.通过工具类得到会话对象
    SqlSession sqlSession = MybatisUtils.getSession();
    // 2.会话对象的得到mapper接口代理对象
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    // 3.调用方法
    List<User> userList = mapper.findAllWithOrders();
    // 4.遍历操作
    for (User user : userList) {
        System.out.println(user);
    }
}
```

**执行结果**

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210315164401.png)

### 10.5 多对多嵌套查询

#### 10.5.1 基本介绍

需求: 查询用户 同时查询出该用户的所有角色

**多对多查询语句**

```sql
-- 先查询用户
select * from user;
-- 再根据用户id主键，查询角色列表
 select * from role r inner join user_role ur on r.id = ur.user_id where ur.role_id = #{用户id};
```

#### 10.5.2 代码示例

> **UserMapper接口**

```java
// 查询所有的用户，同时还要查询出每个用户所关联的订单信息
List<User> findAllWithOrders();
```

> **UserMapper.xml**

```xml
<!--2.1映射主键-->
<resultMap id="userMap2" type="user">
    <id column="id" property="id"></id>
    <result column="user_name" property="username"></result>
    <result column="birthday" property="birthday"></result>
    <result column="sex" property="sex"></result>
    <result column="address" property="address"></result>
    <!--根据用户Id，查询订单表-->
    <collection property="ordersList" column="id" ofType="Orders" select="cn.guardwhy.dao.OrderMapper.findByUid"></collection>
</resultMap>
<!--一对多嵌套查询-->
<select id="findAllWithOrders" resultMap="userMap2">
    select * from user
</select>
```

> **RoleMapper接口**

```java
// 根据id查询角色
List<Role> findByOid(Integer id);
```

> **RoleMapper.xml**

```xml
<!--2.1 配置角色的映射-->
<resultMap id="roleMap" type="role">
    <id property="id" column="id"></id>
    <id property="roleName" column="role_name"/>
    <id property="roleDetail" column="role_detail"/>
</resultMap>
<!--2.2 多对多嵌入查询-->
<select id="findByOid" parameterType="int" resultMap="roleMap">
    select * from role r inner join user_role ur on r.id = ur.user_id where ur.role_id = #{oid}
</select>
```

> **测试代码**

```java
 @Test
public void testUserWithRole(){
    // 1.通过工具类得到会话对象
    SqlSession sqlSession = MybatisUtils.getSession();
    // 2.会话对象的得到mapper接口代理对象
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    // 3.调用方法
    List<User> list = mapper.findAllWithRole();
    // 4.遍历操作
    list.forEach(System.out::println);
}
```

**执行结果**

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210315193126.png)

## 11-动态SQL

### 11.1 项目目录

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210311141419.png" style="zoom:80%;" />

### 11.2 Log4j日志

> **简介：**

- Log4j是Apache的一个开源项目
- 通过使用Log4j，可以控制日志信息输送的目的地：控制台，文本，GUI组件，也可以控制每一条日志的输出格式。
- 通过定义每一条日志信息的级别，能够更加细致地控制日志的生成过程。通过一个配置文件来灵活地进行配置，而不需要修改应用的代码。

> **使用步骤:**

1、导入log4j的包

```xml
<dependency>
  <groupId>log4j</groupId>
  <artifactId>log4j</artifactId>
  <version>1.2.17</version>
</dependency>
```

2、配置文件编写

```properties
#将等级为DEBUG的日志信息输出到console和file这两个目的地，console和file的定义在下面的代码
log4j.rootLogger=DEBUG,console,file
#控制台输出的相关设置
log4j.appender.console = org.apache.log4j.ConsoleAppender
log4j.appender.console.Target = System.out
log4j.appender.console.Threshold=DEBUG
log4j.appender.console.layout = org.apache.log4j.PatternLayout
log4j.appender.console.layout.ConversionPattern=[%c]-%m%n
#文件输出的相关设置
log4j.appender.file = org.apache.log4j.RollingFileAppender
log4j.appender.file.File=./log/guardwhy.log
log4j.appender.file.MaxFileSize=10mb
log4j.appender.file.Threshold=DEBUG
log4j.appender.file.layout=org.apache.log4j.PatternLayout
log4j.appender.file.layout.ConversionPattern=[%p][%d{yy-MM-dd}][%c]%m%n
#日志输出级别
log4j.logger.org.mybatis=DEBUG
log4j.logger.java.sql=DEBUG
log4j.logger.java.sql.Statement=DEBUG
log4j.logger.java.sql.ResultSet=DEBUG
log4j.logger.java.sql.PreparedStatement=DEBUG
```

3、setting设置日志实现(在sqlMapConfig.xml设置)

```xml
<settings>
    <setting name="logImpl" value="LOG4J"/>
</settings>
```

4、在程序中使用Log4j进行输出！

```java
import org.apache.log4j.Logger;
public class TestUserDao {
    // 日志对象,参数为当前类的class
    static Logger logger = Logger.getLogger(TestUserDao.class);

    @Test
    public void testLog4j(){
        // 日志级别
        logger.info("infoL:进入了testLog4j");
        logger.debug("debug:进入了testLog4j");
        logger.debug("error:进入了testLog4j");
    }
}
```

5、执行结果

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210311141635.png" style="zoom: 67%;" />

### 11.3 IF标签

==作用：判断条件是否为真，如果为真则将if中字符串接近到SQL语句中==。

> **UserMapper接口**

```java
package cn.guardwhy.dao;

import cn.guardwhy.domain.User;

import java.util.List;

/**
 * 用户dao的接口
 */
public interface UserMapper {
    // 1.根据用户名称和性别查询用户
    List<User> findUserByNameAndSex(User user);
}
```

> **配置UserMapper.xml**

1. 根据用户名称和性别查询用户
2. if：判断用户名称不为空，且不为空字符串，则作为查询条件。
3. if：判断用户性别不为空，且不为空字符串，则作为查询条件。

```xml
<!--1.多条件查询-->
<select id="findUserByNameAndSex" resultType="user" parameterType="user">
    select * from user where
    <!-- 如果username不为空，而且不为空字符串，则做为查询的条件-->
    <if test="username!=null and username!=''">
        username like '%${username}%'
    </if>
    <if test="sex!=null and sex!=''">
        and sex= #{sex}
    </if>
</select>
```

### 11.4 Where标签

**基本作用**：

1. where标签就相当于SQL语句中where关键字
2. 去掉多余的and,or,where关键字

> **配置UserMapper.xml**

1. 根据用户名称和性别查询用户
2. if标签写在where标签内部
   - if：判断用户名称不为空，且不为空字符串，则作为查询条件。
   - if：判断用户性别不为空，且不为空字符串，则作为查询条件。

```xml
<!--1.多条件查询-->
<select id="findUserByNameAndSex" resultType="user" parameterType="user">
    select * from user
    <where>
        <!-- 如果username不为空，而且不为空字符串，则做为查询的条件-->
        <if test="username!=null and username!=''">
            username like '%${username}%'
        </if>
        <if test="sex!=null and sex!=''">
            and sex= #{sex}
        </if>
    </where>
</select>
```

> **测试代码**

通过用户名和性别查询多个用户，查询条件是"大"和"男"

```java
@Test
public void testFindUserByNameAndSex(){
    // 1.通过工具类得到会话对象
    SqlSession sqlSession = MybatisUtils.getSession();
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    // 2.创建对象
    User user = new User();
    user.setUsername("大");
    user.setSex("男");
    // 将元素添加到集合中
    List<User> list = mapper.findUserByNameAndSex(user);
    list.forEach(System.out::println);
    sqlSession.close();
}
```

> **执行结果**

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210315213317.png)

### 11.5 Set标签

==基本作用:更新用户信息的时候,有些表单项为空则不用更新==。

1. 用在update这个语句，相当于set关键字
2. 与if标签配合使用，对有值的字段进行更新，可以去掉多余的逗号。

> **UserMapper接口**

```java
// 2.更新用户
int updateUser(User user);
```

> **配置UserMapper.xml**

通过id来更新用户名或性别

- update标签更新用户数据
- 如果username不为空而且不为空串，则更新
- 如果sex不为空而且不为空串，则更新
- 最后加上where条件

```xml
<!--2.更新操作-->
<update id="updateUser" parameterType="user">
    update user
    <set>
        <if test="username!=null and username!=''">
            username = #{username},
        </if>
        <if test="sex!=null and sex!=''">
            sex=#{sex}
        </if>
    </set>
    where id=#{id}
</update>
```

> **测试代码**

```java
// 更新操作
@Test
public void testUpdateUser(){
    // 1.通过工具类得到会话对象
    SqlSession sqlSession = MybatisUtils.getSession();
    // 2.会话对象的得到mapper接口代理对象
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    // 3.创建对象
    User user = new User(6,"张佳丽",Date.valueOf("1989-11-6"),"女","江州");
    // 更新行数
    int row = mapper.updateUser(user);
    System.out.println("更新了" + row + "行");
}
```

> **查询结果**

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210315224937.png)

### 11.6 Foreach标签

#### 11.6.1 **参数类型集合**

拼接SQL语句，中间用到循环,有一段SQL语句出现多次。

>  **Mapper接口方法**

```java
// 批量添加用户
int addUsers(List<User> users);
```

> #### **配置UserMapper.xml**
>

批量新增用户，参数类型是: list

| foreach标签的属性 | 作用                                   |
| ----------------- | -------------------------------------- |
| collection        | 两个取值：list 表示集合 array 表示数组 |
| item              | 集合中每个变量名字                     |
| separator         | 每次遍历后添加分隔符                   |
| \#{变量名.属性}   | 引用每个属性                           |

```xml
<!--3.批量添加用户-->
<insert id="addUsers" parameterType="list">
    insert into user values
    <!--
        collection:两个取值：list 表示集合 array 表示数组
        item:集合中每个变量名字
        separator:每次遍历后添加分隔符
        -->
    <foreach collection="list" item="user" separator=",">
        (null,#{user.username},#{user.birthday}, #{user.sex}, #{user.address})
    </foreach>
</insert>
```

>  **测试代码**

```java
// 添加批量元素
@Test
public void testAddUsers(){
    // 1.通过工具类得到会话对象
    SqlSession sqlSession = MybatisUtils.getSession();
    // 2.会话对象的得到mapper接口代理对象
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    // 3.创建集合对象
    List<User> users = new ArrayList<>();
    users.add(new User(7,"王大辉", Date.valueOf("1988-01-30"),"男","岭西"));
    users.add(new User(8,"侯国龙", Date.valueOf("1975-05-08"),"男","江州"));
    users.add(new User(9,"杨红英", Date.valueOf("1993-11-01"),"女","江州"));
    int row = mapper.addUsers(users);
    System.out.println("添加了" + row + "行");
}
```

> **执行结果**

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210315230513.png)

#### 11.6.2 参数类型数组

> **mapper接口**

```java
// 批量删除用户
int deleteUsers(int[] ids);
```

> **配置UserMapper.xml**

==parameterType 因为内置别名中没有数组类型的参数，所以当参数传递的是list和数组，都写成list==。

```xml
<!--批量删除用户-->
<delete id="deleteUsers" parameterType="list">
    delete from user where id in
    <foreach collection="array" open="(" item="id" separator="," close=")">
        #{id}
    </foreach>
</delete>
```

>  **测试代码**

1. 删除多个用户
2. 返回影响的行数

```java
// 删除多个用户
@Test
public void testDeleteUsers(){
    // 1.通过工具类得到会话对象
    SqlSession sqlSession = MybatisUtils.getSession();
    // 2.会话对象的得到mapper接口代理对象
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    // 3.定义数组
    int[] arrays = {14,15,16};
    int row = mapper.deleteUsers(arrays);
    System.out.println("删除了" + row + "行");
}
```

> **查询结果**

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210315231248.png)

### 11.7 Sql和include标签

> **基本作用**

sql标签：定义一段可以重用的SQL语句。
include标签： 引用上面定义的SQL语句。

> **mapper接口**

```java
 // 根据条件查询多个用户
List<User> findUserByCondition(Map<String, Object> condition);

// 根据条件查询有多少用户
int findUserCount(Map<String, Object> condition);
```

> **配置UserMapper.xml**

```xml
<!--定义一个可以重用的代码块-->
<sql id="conditionSql">
    <where>
        <if test="username!=null and username!=''">
            username like '%${username}%'
        </if>
        <if test="minDate!=null and minDate!=''">
            and birthday &gt;= #{minDate}
        </if>
        <if test="maxDate!=null and maxDate!=''">
            and birthday &lt;= #{maxDate}
        </if>
    </where>
</sql>

<!--
    根据条件查询多个用户 map有三个键：username, minDate, maxDate
    -->
<select id="findUserByCondition" parameterType="map" resultType="user">
    select * from user
    <!-- 引用以上代码块-->
    <include refid="conditionSql"/>
</select>

<select id="findUserCount" parameterType="map" resultType="int">
    select count(*) from user
    <!-- 引用以上代码块-->
    <include refid="conditionSql"></include>
</select>
```

> **测试代码**

```java
  // 根据条件查询用户
@Test
public void testFindUserByCondition(){
    HashMap<String, Object> map = new HashMap<>();
    map.put("username", "候");
    map.put("minDate","1980-1-1");
    map.put("maxDate","1993-12-1");
    List<User> userList = userMapper.findUserByCondition(map);
    // 遍历集合
    userList.forEach(System.out::println);
}

// 根据条件查询用户的个数
@Test
public void testFindUserCount(){
    HashMap<String, Object> map = new HashMap<>();
    map.put("username", "候");
    map.put("minDate","1980-1-1");
    map.put("maxDate","1993-12-1");
    int count = userMapper.findUserCount(map);
    // 输出个数
    System.out.println("共有用户" + count + "个");
}
```

> **查询结果**

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/mybatis/29-Mybatis.png)

## 12- 延迟加载

### 12.1 什么是延迟加载

延迟加载又称为懒加载，按需加载。每次只查询1张表，当需要另一张关联表中的数据的时候，再发送一条SQL语句去查询另一张表中数据。

**案例说明**

```markdown
* 在一对多中，当我们有一个用户，它有个100个订单
    在查询用户的时候，要不要把关联的订单查出来？
    在查询订单的时候，要不要把关联的用户查出来？
* 回答
    在查询用户时，用户下的订单应该是，什么时候用，什么时候查询。
    在查询订单时，订单所属的用户信息应该是随着订单一起查询出来。
```

> 延迟加载特点

**优点：**

先从单表查询，需要时再从关联表去关联查询，大大提高数据库性能，因为查询单表要比关联查询多张表速度要快。

**缺点：**

因为只有当需要用到数据时，才会进行数据库查询，这样在大批量数据查询时，因为查询工作也要消耗时间，所以可能造成用户等待时间变长，造成用户体验下降。

**注意点：**

- ==在多表中：一对多，多对多：通常情况下采用延迟加载， 一对一（多对一）：通常情况下采用立即加载==。
- ==延迟加载是基于嵌套查询来实现的==。

### 12.2 项目目录

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210316110229.png" style="zoom:80%;" />

### 12.3 实现延迟加载

> **局部延迟加载**

==在association和collection标签中都有一个fetchType属性，通过修改它的值，可以修改局部的加载策略==。

**UserMapper.xml**

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">

<!-- 实体类接口的类全名 -->
<mapper namespace="cn.guardwhy.dao.UserMapper">
    <!--2.1映射主键-->
    <!-- 开启一对多 延迟加载 -->
    <resultMap id="userMap2" type="user">
        <id column="id" property="id"></id>
        <result column="user_name" property="username"></result>
        <result column="birthday" property="birthday"></result>
        <result column="sex" property="sex"></result>
        <result column="address" property="address"></result>
        <!--根据用户Id，查询订单表-->
        <!--
            fetchType="lazy" 懒加载策略
            fetchType="eager" 立即加载策略
        -->
        <collection property="ordersList" column="id" ofType="Orders" 
                    select="cn.guardwhy.dao.OrderMapper.findByUid" fetchType="lazy">
        </collection>
    </resultMap>
    <!--一对多嵌套查询-->
    <select id="findAllWithOrders" resultMap="userMap2">
        select * from user
    </select>
</mapper>
```

>  **设置触发延迟加载的方法**

**sqlMapConfig.xml**

配置了延迟加载策略后，在你调用当前对象的equals、clone、hashCode、toString方法时也会触发关联对象的查询。

可以在配置文件中使用lazyLoadTriggerMethods配置项覆盖掉上面四个方法。

```xml
<settings>
    <!--所有方法都会延迟加载-->
    <setting name="lazyLoadTriggerMethods" value="toString()"/>
</settings>
```

> **全局延迟加载**

在Mybatis的核心配置文件中可以使用setting标签修改全局的加载策略。

```xml
<settings>
    <!--开启全局延迟加载功能-->
    <setting name="lazyLoadingEnabled" value="true"/>
</settings>
```

> **注意点**

局部的加载策略优先级高于全局的加载策略。

## 13- Mybatis缓存机制

### 13.1 基本介绍

> **什么是缓存 [ Cache ]**

- 存在内存中的临时数据。
- 将用户经常查询的数据放在缓存(内存)中，用户去查询数据就不用从磁盘上(关系型数据库数据文件)查询,从缓存中查询，从而提高查询效率，解决了高并发系统的性能问题。

> **为什么使用缓存**

减少和数据库的交互次数，减少系统开销，提高系统效率。

> **什么样的数据能使用缓存**

经常查询并且不经常改变的数据。

### 13.2 Mybatis缓存

- MyBatis包含一个非常强大的查询缓存特性，它可以非常方便地定制和配置缓存。缓存可以极大的提升查询效率。
- MyBatis系统中默认定义了两级缓存：一级缓存和二级缓存。
  - ==默认情况下，只有一级缓存开启。（SqlSession级别的缓存，也称为本地缓存）==
  - ==二级缓存需要手动开启和配置，他是基于namespace级别的缓存==。
  - 为了提高扩展性，MyBatis定义了缓存接口Cache。我们可以通过实现Cache接口来自定义二级缓存

### 13.3 一级缓存

> **基本介绍**

一级缓存是SqlSession级别的缓存，是默认开启的。所以在参数和SQL完全一样的情况下，使用同一个SqlSession对象调用一个Mapper方法，往往
只执行一次SQL，因为使用SelSession第一次查询后，MyBatis会将其放在缓存中，以后再查询的时候，如果没有声明需要刷新，并且缓存没有超时的情况下，SqlSession都会取出当前缓存的数据，而不再次发送SQL到数据库。

**<font color = red>一级缓存的范围：</font>**在同一个会话中使用

> **一级缓存图**

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210316140154.png)

#### 13.3.1 代码示例

```java
 // 1.验证Mybatis一级缓存
@Test
public void testOneCache(){
    // 1.通过工具类得到会话对象
    SqlSession sqlSession = MybatisUtils.getSession();
    // 2.会话对象的得到mapper接口代理对象
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    // 根据id查询用户信息,第一次查询，查的是数据库
    User user1 = mapper.findById(1);
    System.out.println(user1);
    // 第二次查询,查询的是一级缓存
    User user2 = mapper.findById(1);
    System.out.println(user2);
    // 关闭会话对象
    sqlSession.close();
}
```

> **执行结果**

==上面的代码中我们查询了两次，但最后只执行了一次数据库操作，这就是Mybatis提供给我们的一级缓存在起作用了。因为一级缓存的存在，导致第二次查询id为1的记录时，并没有发出sql语句从数据库中查询数据，而是从一级缓存中查询==。

**分析结果**

一级缓存是SqlSession范围的缓存，执行SqlSession的C（增加）U（更新）D（删除）操作，或者调用clearCache()、commit()、close()方法，都会清空缓存。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210316154939.png)

```xml
1. 第一次发起查询用户id为1的用户信息，先去找缓存中是否有id为1的用户信息，如果没有，从数据库查询用户信息。

2. 得到用户信息，将用户信息存储到一级缓存中。

3. 如果sqlSession去执行commit操作（执行插入、更新、删除），清空SqlSession中的一级缓存，这样做的目的为了让缓存中存储的是最新的信息，避免脏读。

4. 第二次发起查询用户id为1的用户信息，先去找缓存中是否有id为1的用户信息，缓存中有，直接从缓存中获取用户信息。
```

> **清除缓存**

清空的方式：sqlSession 执行添加、修改、删除、提交、关闭等操作，清空 sqlSession 中的一级缓存数据。

清空的目的：为了让缓存中存放最新数据，避免脏读。

```java
// 1.验证Mybatis一级缓存
@Test
public void testOneCache(){
    // 1.通过工具类得到会话对象
    SqlSession sqlSession = MybatisUtils.getSession();
    // 2.会话对象的得到mapper接口代理对象
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    // 根据id查询用户信息,第一次查询，查的是数据库
    User user1 = mapper.findById(1);
    System.out.println(user1);
    
    // 调用sqlSession清除缓存的方法
    sqlSession.clearCache();
    
    // 第二次查询,查询的是一级缓存
    User user2 = mapper.findById(1);
    System.out.println(user2);
    // 关闭会话对象
    sqlSession.close();
}
```

> **UserMapper.xml**

```xml
 <!--1.1映射主键-->
<resultMap id="userMap1" type="user">
    <id column="id" property="id"></id>
    <result column="user_name" property="username"></result>
    <result column="birthday" property="birthday"></result>
    <result column="sex" property="sex"></result>
    <result column="address" property="address"></result>
</resultMap>
<!--1.2 根据id查询用户,每次查询时候，都会清除缓存-->
<select id="findById" resultMap="userMap1" flushCache="true">
    select * from user where id = #{oid}
</select>
```

### 13.4 二级缓存(XML方式)

> **基本介绍**

- 二级缓存是namspace级别（跨sqlSession）的缓存，是默认不开启的。==二级缓存的开启需要进行配置，实现二级缓存的时候POJO必须是可序列化的==。
- ==也就是要求实现Serializable接口，配置方法很简单，只需要在映射XML文件配置 <cache/> 就可以开启二级缓存了==。

> **缓存结构**

**二级缓存范围**：可以在不同的会话中使用

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210316170858.png)

> **\<cache>标签作用**

- 所有在映射文件里的 select 语句都将被缓存。所有在映射文件里 insert,update 和 delete 语句会清空缓存。
- 缓存使用“最近很少使用”算法来回。每个缓存可以存储 1024 个列表或对象的引用。
- 缓存获取的对象不是共享的且对调用者是安全的，不会有其它的调用者或线程潜在修改。

#### 13.4.1 代码示例

> **实体类序列化**

```java
package cn.guardwhy.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/*
* 用户类
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private Integer id;
    private String username;
    private Date birthday;
    private String sex;
    private String address;

    // 代表当前用户具备的订单列表
    private List<Orders> ordersList;
    // 表示多方关系:代表了当前用户所具有的角色列表
    private List<Role> roleList;
}
```

> **UserMapper接口**

```java
// 根据ID查询用户
User findById(Integer id);
```

> **sqlMapConfig.xml**

```xml
<!--开启二级缓存-->
<settings>
    <!--
    因为cacheEnabled的取值默认就为true，所以这一步可以省略不配置。
    为true代表开启二级缓存；为false代表不开启二级缓存。
  	-->
    <setting name="cacheEnabled" value="true"/>
</settings>
```

> **UserMapper.xml**

1. 开启二级缓存
2. 编写查询语句

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">

<!-- 实体类接口的类全名 -->
<mapper namespace="cn.guardwhy.dao.UserMapper">
    <!--1.1当前映射文件开启二级缓存-->
    <cache></cache>
    <!--1.2 根据id查询用户-->
    <select id="findById" resultType="User" parameterType="int" useCache="true">
        <!--
            <select>标签中设置useCache=”true”代表当前这个statement要使用二级缓存。
            如果不使用二级缓存可以设置为false
            注意：针对每次查询都需要最新的数据sql，要设置成useCache="false"，禁用二级缓存。
        -->
        select * from user where id = #{id}
    </select>
</mapper>
```

#### 12.2.6 测试代码

```java
@Test
public void testTwoCache() {
  SqlSession sqlSession1 = MyBatisUtils.openSession();
  UserMapper userMapper1 = sqlSession.getMapper(UserMapper.class);
  // 第一次查询
  User user1 = userMapper1.findById(1);
  System.out.println("第一次查询的用户：" + user);
  // 只有执行SqlSession.commit或者sqlSession.close,那么一级缓存中内容才会刷新到二级缓存。
  sqlSession.close();
    
  SqlSession sqlSession2 = MyBatisUtils.openSession();
  UserMapper userMapper2 = sqlSession1.getMapper(UserMapper.class);
  User user2 = userMapper2.findById(2);
  System.out.println(user2);
  sqlSession1.close();
}
```

> **结果分析**

二级缓存是mapper映射级别的缓存，多个SqlSession去操作同一个Mapper映射的sql语句，多个SqlSession可以共用二级缓存，二级缓存是跨SqlSession的。

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210316173942.png)

```xml
映射语句文件中的所有select语句将会被缓存。
映射语句文件中的所有insert、update和delete语句会刷新缓存。
```

**注意点(脏读问题)**

==mybatis的二级缓存因为是namespace级别，所以在进行多表查询时会产生脏读问题。==

> **总结**

mybatis的缓存，都不需要手动存储和获取数据。mybatis自动维护的。

mybatis开启了二级缓存后，那么查询顺序：二级缓存--》一级缓存--》数据库

注意：mybatis的二级缓存会存在脏读问题，需要使用第三方的缓存技术(redis)解决问题。

### 13.5 二级缓存(注解方式)

只需要在UserMapper接口上使用@CacheNamespace对接口中所有的查询方法使用二级缓存

#### 12.3.1 测试代码

```java
package cn.guardwhy.dao;

import cn.guardwhy.domain.OrderForm;
import cn.guardwhy.domain.User;
import cn.guardwhy.domain.UserInfo;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

/**
 * 持久化接口:UserMapper
 */
@CacheNamespace
public interface UserMapper {

    /**
     * 查询所有的用户拓展信息
    */
    @Select("select * from user_info")
    List<UserInfo> findAllUserInfo();
}
```

#### 12.3.2 二级缓存分析

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/mybatis/56-Mybatis.png" style="zoom:67%;" />

## 14- 注解方式

### 14.1 面向接口编程

- 真正的开发中，很多时候会选择面向接口编程根本原因 : ==解耦 , 可拓展 , 提高复用 , 分层开发中 , 上层不用管具体的实现 , 大家都遵守共同的标准, 使得开发变得容易 , 规范性更好==。
- 在一个面向对象的系统中，系统的各种功能是由许许多多的不同对象协作完成的。而各个对象之间的协作关系则成为系统设计的关键。小到不同类之间的通信，大到各模块之间的交互，在系统设计之初都是要着重考虑的。面向接口编程就是指按照这种思想来编程。

**关于接口的简单理解**

- 接口从更深层次的理解，应是定义(规范，约束）与实现(名实分离的原则）的分离。接口的本身反映了系统设计人员对系统的抽象理解。
- 接口应有两类：
  - 对一个个体的抽象，它可对应为一个抽象体(abstract class)。
  - 对一个个体某一方面的抽象，即形成一个抽象面（interface)。
- ==一个体有可能有多个抽象面。抽象体与抽象面是有区别的==。

**面向之三者区别**

- 面向对象是指，我们考虑问题时，以对象为单位，考虑它的属性及方法 。
- 面向过程是指，我们考虑问题时，以一个具体的流程（事务过程）为单位，考虑它的实现 。
- ==接口设计与非接口设计是针对复用技术而言的，与面向对象（过程）不是一个问题.更多的体现就是对系统整体的架构==。

### 14.2  项目目录

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210312091026.png" style="zoom:80%;" />

### 14.3 查询用户（select）

mybatis最初配置信息是基于 XML ,映射语句(SQL)也是定义在 XML 中的。而到MyBatis 3提供了新的基于注解的配置。

【注意】:注解开发不需要**UserMapper.xml**

| 注解     | 属性                    | 说明                         |
| -------- | ----------------------- | ---------------------------- |
| @Select  | value：查询SQL语句      | 查询的注解                   |
| @Results | value：是一个Result数组 | 定义映射关系                 |
| @Result  | column                  | 定义表中列                   |
|          | property                | 定义实体类中属性             |
|          | id                      | true 这是主键列，默认是false |

> **UserMapper**

```java
// 查询所有的用户
@Select("select * from user")    
List<User> findAllUsers();
```

**使用@Results和@Result属性**

> **UserMapper**

```java
// 查询所有的用户
@Select("select * from user")
@Results({
    @Result(column = "id", property = "id", id = true), // 映射注解
    @Result(column = "user_name", property = "username") // 映射普通列
})
List<User> findAllUsers();
```

> **在sqlMapConfig.xml文件中注入**

```xml
<!--映射器-->
<mappers>
    <package name="cn.guardwhy.dao"/>
</mappers>
```

#### 14.3.1 代码测试

```java

// 查询所有的用户
@Test
public void findAllUsers(){
    // 1.通过工具类得到会话对象
    SqlSession sqlSession = MybatisUtils.getSession();
    // 2.会话对象的得到usermapper接口代理对象
    UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
    List<User> users = userMapper.findAllUsers();
    users.forEach(System.out::println);
    // 3.关闭会话对象
    sqlSession.close;
}
```

#### 14.3.2 查看注解开发本质(Debug)

==本质上利用了jvm的动态代理机制==

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210312093948.png" style="zoom:80%;" />

### 14.4 修改用户(update)

> **UserMapper**

- 写修改方法
- 在方法上使用注解@Update("SQL语句")
- 占位符使用#{属性名}

```java
/**
 *  根据用户id修改用户
*/
@Update("update user set user_name=#{username}, address=#{address} where id=#{id}")
int updateUser(User user);
```

#### 14.4.1 代码测试

```java

// 更新操作
@Test
public void testUpdateUser(){
     // 1.通过工具类得到会话对象
    SqlSession sqlSession = MybatisUtils.getSession();
    // 2.会话对象的得到usermapper接口代理对象
   UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
    User user = new User();
    user.setUsername("张小欣");
    user.setAddress("广州");
    user.setId(12);
    int row = userMapper.updateUser(user);
    System.out.println("更新了" + row + "行");
}
```

### 14.5 删除用户(delete)

> **UserMapper**

==如果有外键约束，主表中记录不能删除==。

```java
/**
 * 编写删除方法
 * 使用注解@Delete("SQL")
 * 使用#{id}，删除指定的用户
*/
// 根据用户id删除用户
@Delete("delete from user where id=#{id}")
// 方法存在多个参数的情况下，所有参数面前必须加上@Param()
int deleteUser(@Param("id") int id);
```

#### 14.5.1 代码示例

```java
// 删除操作
@Test
public void deleteUser(){
    // 1.通过工具类得到会话对象
    SqlSession sqlSession = MybatisUtils.getSession();
    // 2.会话对象的得到usermapper接口代理对象
   	UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
    int row = userMapper.deleteUser(6);
    System.out.println("删除了:" + row + "行记录");
}
```

#### 14.5.2 注意点

> **关于@Param**

@Param注解用于给方法参数起一个名字。以下是总结的使用原则：

- 在方法只接受一个参数的情况下，可以不使用@Param。
- 在方法接受多个参数的情况下，建议一定要使用@Param注解给参数命名。
- 如果参数是 JavaBean ， 则不能使用@Param。不使用@Param注解时，参数只能有一个，并且是Javabean。

> **#与$的区别**

==#{} 的作用主要是替换预编译语句(PrepareStatement)中的占位符?== 

```sql
insert into user (name) values (#{name});
insert into user (name) values (?);
```

==${} 的作用是直接进行字符串替换。==

```sql
insert into user (name) values ('${name}');
insert into user (name) values ('guardwhy');
```

### 14.6 新增用户(insert)

> **UserMapper**

1. 在UserMapper接口中，增加新增用户方法
2. 使用注解@Insert("SQL语句")

```java
/**
 * 插入一条记录
*/
@Insert("insert into user values (null, #{username},#{birthday},#{sex},#{address})")
int addUser(User user);
```

**获取新增主键值**

得到自增长生成的主键值

| 属性        | 说明                 |
| ----------- | -------------------- |
| statement   | 获取主键的SQL语句    |
| keyProperty | 实体类中主键的属性名 |
| keyColumn   | 表中主键列的名字     |
| resultType  | 主键数据类型         |
| before      | false 之后 true之前  |

```java
// 插入一条记录
@Insert("insert into user values (null, #{username},#{birthday},#{sex},#{address})")
/**
 statement:获取主键的SQL语句
 keyProperty: 实体类中主键的属性名
 keyColumn:表中主键列的名字
 resultType:主键数据类型
 before: false 之后 true之前
*/
@SelectKey(statement = "select last_insert_id()", keyProperty = "id", keyColumn = "id", resultType = Integer.class, before = false)
int addUser(User user);
```

#### 14.6.1 测试代码

```java
// 添加操作
@Test
public void testAddUser(){
    // 1.通过工具类得到会话对象
    SqlSession sqlSession = MybatisUtils.getSession();
    // 2.会话对象的得到usermapper接口代理对象
   	UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
    User user = new User(null, "王永强", Date.valueOf("1990-2-10"), "男", "秦阳");
    int row = userMapper.addUser(user);
    System.out.println("添加了" + row + "条记录");
    System.out.println("生成的主键:" + user.getId());
}
```

## 15- 多表查询(注解)

### 15.1 项目目录

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210316235738.png" style="zoom:80%;" />

> **使用注解实现复杂映射开发**

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210317003228.png" style="zoom:80%;" />

### 15.2 一对一查询

**一对一查询语句**

```sql
-- 先查询订单
Select * from orders;
-- 再根据订单oid外键，查询用户
select * from user where id = #{根据订单查询的oid}
```

#### 15.2.1 代码示例

> **sqlMapConfig.xml**

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE configuration
        PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-config.dtd">
<configuration>

    <!--在内部配置属性 -->
    <properties resource="db.properties">
        <property name="jdbc.username" value="root"/>
        <property name="jdbc.password" value="root"/>
    </properties>

    <settings>
        <!--标准的日志工厂实现-->
        <setting name="logImpl" value="LOG4J"/>
        <!--开启全局延迟加载功能-->
        <setting name="lazyLoadingEnabled" value="true"/>
        <!--
        因为cacheEnabled的取值默认就为true，所以这一步可以省略不配置。
        为true代表开启二级缓存；为false代表不开启二级缓存。
        -->
        <setting name="cacheEnabled" value="true"/>
    </settings>

    <!--定义实体类别名-->
    <typeAliases>
        <package name="cn.guardwhy.domain"/>
    </typeAliases>

    <!-- 一个核心配置文件 -->
    <environments default="default">
        <!-- 其中的一个运行环境，通过id来进行标识-->
        <environment id="default">
            <!--事务管理器 -->
            <transactionManager type="JDBC"/>
            <!--数据源 -->
            <dataSource type="POOLED">
                <property name="driver" value="${jdbc.driver}"/>
                <property name="url" value="${jdbc.url}"/>
                <property name="username" value="${jdbc.username}"/>
                <property name="password" value="${jdbc.password}"/>
            </dataSource>
        </environment>
    </environments>

    <!--映射器-->
    <mappers>
        <package name="cn.guardwhy.dao"/>
    </mappers>
</configuration>
```

> **OrderMapper接口**

```java
@Select("select * from orders")
@Results({
    @Result(id = true, column = "id", property = "id"),
    @Result(column = "ordertime", property = "ordertime"),
    @Result(column = "total", property = "total"),
    @Result(column = "oid", property = "oid"),
    @Result(property = "user", javaType = User.class, column = "oid",
            one = @One(select = "cn.guardwhy.dao.UserMapper.findById", fetchType = FetchType.EAGER)) // 开启缓存
})
// 1.查询所有订单,同时查询订单所属的用户信息
List<Orders> findAllWithUser();
```

> **UserMapper接口**

```java
@Select("select * from user where id = #{id}")
@Results({
    @Result(column = "id", property = "id", id = true), // 映射主键
    @Result(column = "user_name", property = "username"),
    @Result(column = "birthday", property = "birthday"),
    @Result(column = "sex", property = "sex"),
    @Result(column = "address", property = "address")
})
// 1.通过id查询用户
User findById(Integer id);
```

> **测试代码**

```java
// 查询一个订单，与此同时查询出该订单所属的用户
@Test
public void testOrderWithUser(){
    // 1.通过工具类得到会话对象
    SqlSession sqlSession = MybatisUtils.getSession();
    // 2.会话对象的得到mapper接口代理对象
    OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
    // 3.调用方法
    List<Orders> list = mapper.findAllWithUser();
    for (Orders orders : list) {
        System.out.println(orders);
    }
    // 4.关闭会话
    sqlSession.close();
}
```

#### 15.2.2 执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210317000834.png)

### 15.3 一对多查询

**一对多查询语句**

```sql
-- 先查询用户
Select * from user;
-- 再根据用户id主键，查询订单列表
select * from orders where oid = #{用户id}
```

#### 15.3.1 代码示例

> **UserMapper接口**

```java
// 查询所有用户，及关联的订单信息
@Select("select * from user")
@Results({
    @Result(column = "id", property = "id", id = true), // 映射主键
    @Result(column = "user_name", property = "username"),
    @Result(column = "birthday", property = "birthday"),
    @Result(column = "sex", property = "sex"),
    @Result(column = "address", property = "address"),
    @Result(property = "ordersList", javaType = List.class, column = "id",
            many = @Many(select = "cn.guardwhy.dao.OrderMapper.findByOid"))
})
List<User> findAllWithOrders();
```

> **OrderMapper接口**

```java
// 根据传递过来的用户id，查询该用户所具有的订单信息
@Select("select * from orders where id = #{oid}")
List<Orders> findByOid(Integer oid);
```

> **测试代码**

```java
// 查询一个用户，与此同时查询出该用户具有的订单
@Test
public void testUserWithOrders(){
    // 1.通过工具类得到会话对象
    SqlSession sqlSession = MybatisUtils.getSession();
    // 2.会话对象的得到mapper接口代理对象
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    // 3.调用方法
    List<User> userList = mapper.findAllWithOrders();
    for (User user : userList) {
        System.out.println(user);
    }
}
```

#### 15.3.2 执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210317012934.png)

### 15.4 多对多查询

**多对多查询语句**

```sql
-- 先查询用户
select * from user;
-- 再根据用户id主键，查询角色列表
 select * from role r inner join user_role ur on r.id = ur.user_id where ur.role_id = #{用户id};
```

#### 15.4.1 代码示例

> **UserMapper接口**

```java
// 查询所有用户及关联的角色信息
@Select("select * from user")
@Results({
    @Result(column = "id", property = "id", id = true), // 映射主键
    @Result(column = "user_name", property = "username"),
    @Result(column = "birthday", property = "birthday"),
    @Result(column = "sex", property = "sex"),
    @Result(column = "address", property = "address"),
    @Result(property = "roleList", javaType = List.class, column = "id",
            many = @Many(select = "cn.guardwhy.dao.RoleMapper.findByOid"))
})
List<User> findAllWithRole();
```

> **RoleMapper接口**

```java
// 根据传递过来的用户id，查询该用户所具有的角色信息
@Select("select * from role r inner join user_role ur on r.id = ur.user_id where ur.role_id = #{id}")
@Results({
    @Result(id = true, column = "id", property = "id"),
    @Result(column = "role_name", property = "roleName"),
    @Result(column = "role_detail", property = "roleDetail")
})
List<Role> findByOid(Integer id);
```

> **测试代码**

```java
// 3.多对多查询
@Test
public void testUserWithRole(){
    // 1.通过工具类得到会话对象
    SqlSession sqlSession = MybatisUtils.getSession();
    // 2.会话对象的得到mapper接口代理对象
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    // 3.调用方法
    List<User> list = mapper.findAllWithRole();
    // 4.遍历操作
    for (User user : list) {
        System.out.println(user);
    }
}
```

#### 15.4.2 执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210317021147.png)