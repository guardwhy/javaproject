## 1-SpringCloud入门

### 1.1 什么是SpringCloud？

Spring官网:[https://spring.io/](https://spring.io/)

【**维基百科**】Spring Cloud是一系列框架的有序集合。它利用Spring Boot的开发便利性巧妙地简化了分布式系统基础设施的开发，如服务发现注册、配置中心、消息总线、负载均衡、断路器、数据监控等，都可以用 Spring Boot的开发风格做到一键启动和部署。Spring Cloud并没有重复制造轮子，它只是将目前各家公司开发的比较成熟、经得起实际考验的服务框架组合起来，通过Spring Boot风格进行再封装屏蔽掉了复杂的配置和实现原理，最终给开发者留出了一套简单易懂、易部署和易维护的分布式系统开发工具包。

Spring Cloud是一系列框架的有序集合（Spring Cloud是一个规范）开发服务发现注册、配置中心、消息总线、负载均衡、断路器、数据监控等。利用Spring Boot的开发便利性简化了微服务架构的开发(自动装配)。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210519165058.png)

需要注意的是，Spring Cloud是一套用于构建微服务架构的规范，而不是一个可以拿来即用的框架(所谓规范就是应该有哪些功能组件，然后组件之间怎么配合，共同完成什么事情)。在这个规范之下第三方的Netflix搞了一套 ，简称SCN。 Spring Cloud 吸收了Netflix公司的产品基础之上自己也搞了几个组件，阿里巴巴在之前的基础上搞出了一堆微服务组件,Spring Cloud Alibaba（SCA)，这些才是Spring Cloud规范的实现。

### 1.2 SpringCloud和SpringBoot关系

- SpringBoot: 专注于快速方便的开发单个个体微服务。
- SpringCloud: 是关注全局的微服务协调整理治理框架，它将SpringBoot开发的一个个单体微服务整合并管理起来，为各个微服务之间提供：配置管理，服务发现，断路器，路由，微代理，事件总线，全局锁，决策竞选，分布式会话等等集成服务。
- SpringBoot可以离开SpringClooud独立使用，开发项目，但是SpringCloud离不开SpringBoot，属于依赖关系SpringBoot专注于快速、方便的开发单个个体微服务，SpringCloud关注全局的服务治理框架。

### 1.3 Spring Cloud 架构

Spring Cloud是一个微服务相关规范，这个规范意图为搭建微服务架构提供一站式服务，采用组件(框架)化机制定义一系列组件，各类组件针对性的处理微服务中的特定问题，这些组件共同来构成==Spring Cloud微服务技术栈==。

#### 1.3.1 Spring Cloud 核心组件

Spring Cloud 生态圈中的组件，按照发展可以分为第一代 Spring Cloud组件和第二代 SpringCloud组件。

| 组件           | 第一代 Spring Cloud（Netflix，SCN）                        | 第二代 Spring Cloud（主要就是SpringCloud Alibaba，SCA） |
| -------------- | ---------------------------------------------------------- | ------------------------------------------------------- |
| 注册中心       | Netflix Eureka                                             | 阿里巴巴 Nacos                                          |
| 客户端负载均衡 | Netflix Ribbon                                             | 阿里巴巴 Dubbo LB、Spring Cloud<br/>Loadbalancer        |
| 熔断器         | Netflix Hystrix                                            | 阿里巴巴 Sentinel                                       |
| 网关           | Netflix Zuul：性能一般，未来将退出<br/>Spring Cloud 生态圈 | 官方 Spring Cloud Gateway                               |
| 配置中心       | 官方 Spring Cloud Config                                   | 阿里巴巴 Nacos                                          |
| 服务调用       | Netflix Feign                                              |                                                         |
| 消息驱动       | 官方 Spring Cloud Stream                                   |                                                         |
| 链路追踪       | 官方 Spring Cloud Sleuth/Zipkin                            |                                                         |

#### 1.3.2 Spring Cloud 体系结构

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210519171555.png" style="zoom:80%;" />

Spring Cloud中的各组件协同工作，才能够支持一个完整的微服务架构。比如

- [ ] 注册中心负责服务的注册与发现，很好将各服务连接起来。
- [ ] API网关负责转发所有外来的请求。
- [ ] 断路器负责监控服务之间的调用情况，连续多次失败进行熔断保护。
- [ ] 配置中心提供了统一的配置信息管理服务,可以实时的通知各个服务获取最新的配置信息

### 1.4 Dubbo和SpringCloud对比

Dubbo是阿里巴巴公司开源的一个高性能优秀的服务框架，基于RPC调用，对于目前使用率较高的Spring Cloud Netflix来说，它是基于HTTP的，所以效率上没有Dubbo高，但问题在于Dubbo体系的组件不全，不能够提供一站式解决方案，比如服务注册与发现需要借助于Zookeeper等实现，而SpringCloud Netflix则是真正的提供了一站式服务化解决方案，且有Spring大家族背景。

| 组件         | Dubbo         | Spring Cloud                 |
| ------------ | ------------- | ---------------------------- |
| 服务注册中心 | Zookeeper     | Spring Cloud Netfilx Eureka  |
| 服务调用方式 | RPC           | REST API                     |
| 服务监控     | Dubbo-monitor | Spring Boot Admin            |
| 断路器       | 不完善        | Spring Cloud Netflix Hystrix |
| 服务网关     | /             | Spring Cloud Netflix Zuul    |
| 分布式配置   | /             | Spring Cloud Config          |
| 服务跟踪     | /             | Spring Cloud Sleuth          |
| 消息总线     | /             | Spring Cloud Bus             |
| 数据流       | /             | Spring Cloud Stream          |
| 批量任务     | /             | Spring Cloud Task            |

最大区别：==SpringCloud抛弃了Dubbo的RPC通信，采用的是基于HTTP的REST方式==。

严格来说，这两种方式各有优劣。虽然从一定程度上来说，后者牺牲了服务调用的性能，但也避免了上面提到的原生RPC带来的问题。而且REST相比RPC更为灵活，服务提供方和调用方的依赖只依靠一纸契约，不存在代码级别的强依赖，这在强调快速演化的微服务环境下，显得更加合适。

**解决的问题域不一样**：==Dubbo的定位是一款RPC框架，Spring Cloud的目标是微服务架构下的一站式解决方案==。

## 2- Rest微服务构建

### 2.1 总体介绍

1、项目会使用一个Dept部门模块做一个微服务通用案例
Consumer消费者（Client）通过REST调用Provider提供者（Server）提供的服务。

Maven的分包分模块架构

```xml
一个简单的Maven模块结构是这样的：
-- app-parent：一个父项目（app-parent）聚合很多子项目（app-util，app-dao，app-web...）
|-- pom.xml
|
|-- app-core
||----pom.xml
|
|-- app-web
||----pom.xml
......
```

一个父工程带着多个子Module子模块，SpringCloud父工程（Project）下初次带着3个子模块(Module)

- springcloud-api 【封装的整体pojo / 接口 / 公共配置等】。
- springcloud-provider-dept-8001【服务提供者】。
- springcloud-consumer-dept-80【服务消费者】

2、创建数据库`db_springclound`

```sql
-- 创建数据库
create database db_springclound1;

-- 使用数据库
use db_springclound1;

-- 创建员工表
create table dept(
	deptno bigint not null primary key auto_increment,
	dname varchar(60),
	db_source varchar(60)
);
-- 插入数据
insert into dept(dname,db_source) values('开发部',database());
insert into dept(dname,db_source) values('人事部',database());
insert into dept(dname,db_source) values('财务部',database());
insert into dept(dname,db_source) values('市场部',database());
insert into dept(dname,db_source) values('运维部',database());
insert into dept(dname,db_source) values('后勤部',database());
```

### 2.2 创建父工程

新建父工程Maven项目 `springcloud-parent`，==切记Packageing是pom模式==，倒入相关依赖。

**springcloud-parent pom.xml**

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>cn.guardwhy</groupId>
    <artifactId>springcloud-parent</artifactId>
    <version>1.0-SNAPSHOT</version>
    <packaging>pom</packaging>

    <properties>
        <maven.compiler.source>8</maven.compiler.source>
        <maven.compiler.target>8</maven.compiler.target>
        <junit.version>4.12</junit.version>
        <log4j.version>1.2.17</log4j.version>
        <lombok.version>1.16.18</lombok.version>
    </properties>

    <dependencyManagement>
        <dependencies>
        <!-- spring-cloud的依赖 -->
            <dependency>
                <groupId>org.springframework.cloud</groupId>
                <artifactId>spring-cloud-dependencies</artifactId>
                <version>Hoxton.SR4</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
            <!-- spring-boot依赖 -->
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-dependencies</artifactId>
                <version>2.2.1.RELEASE</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
            <!-- 数据库 -->
            <dependency>
                <groupId>mysql</groupId>
                <artifactId>mysql-connector-java</artifactId>
                <version>5.1.47</version>
            </dependency>
            <!--数据源druid-->
            <dependency>
                <groupId>com.alibaba</groupId>
                <artifactId>druid</artifactId>
                <version>1.1.6</version>
            </dependency>
            <!-- mybatis-spring-boot启动器-->
            <dependency>
                <groupId>org.mybatis.spring.boot</groupId>
                <artifactId>mybatis-spring-boot-starter</artifactId>
                <version>1.3.0</version>
            </dependency>
            <dependency>
                <groupId>ch.qos.logback</groupId>
                <artifactId>logback-core</artifactId>
                <version>1.2.3</version>
            </dependency>
            <dependency>
                <groupId>junit</groupId>
                <artifactId>junit</artifactId>
                <version>${junit.version}</version>
            </dependency>
            <dependency>
                <groupId>log4j</groupId>
                <artifactId>log4j</artifactId>
                <version>${log4j.version}</version>
            </dependency>
            <dependency>
                <groupId>org.projectlombok</groupId>
                <artifactId>lombok</artifactId>
                <version>${lombok.version}</version>
            </dependency>
        </dependencies>
    </dependencyManagement>
</project>
```

### 2.2 创建api公共模块

> **新建springcloud-api模块**

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210519192939.png)

1、导入springcloud-api 的 pom.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <artifactId>springcloud-parent</artifactId>
        <groupId>cn.guardwhy</groupId>
        <version>1.0-SNAPSHOT</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>

    <artifactId>springcloud-api</artifactId>

    <properties>
        <maven.compiler.source>8</maven.compiler.source>
        <maven.compiler.target>8</maven.compiler.target>
    </properties>

    <!--当前Module需要到的jar包，按自己需求添加，如果父项目已经包含了，可以不用写版本号-->
    <dependencies>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
        </dependency>
    </dependencies>
</project>
```

2、编写部门实体类

==注意: 实体类需要实例化==

```java
package cn.guardwhy.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
// Dept实体类
public class Dept implements Serializable {
    // 主键
    private Long deptno;
    // 部门名称
    private String dname;
    // 来自哪个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存到多个不同的数据库
    private String db_source;
}
```

### 2.3 创建provider模块

> **新建springcloud-provider-dept-8001模块**

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210519193150.png)

1、导入springcloud-provider-dept-8001的pom.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <artifactId>springcloud-parent</artifactId>
        <groupId>cn.guardwhy</groupId>
        <version>1.0-SNAPSHOT</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>

    <artifactId>springcloud-provider-dept-8001</artifactId>

    <properties>
        <maven.compiler.source>8</maven.compiler.source>
        <maven.compiler.target>8</maven.compiler.target>
    </properties>
    <dependencies>
        <!--引入自定义的模块，我们就可以使用这个模块中的类了-->
        <dependency>
            <groupId>cn.guardwhy</groupId>
            <artifactId>springcloud-api</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
        </dependency>
        <!--数据库连接-->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
        </dependency>
        <!-- druid数据源 -->
        <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>druid</artifactId>
        </dependency>
        <dependency>
            <groupId>ch.qos.logback</groupId>
            <artifactId>logback-core</artifactId>
        </dependency>
        <!-- mybatis-spring-boot启动器-->
        <dependency>
            <groupId>org.mybatis.spring.boot</groupId>
            <artifactId>mybatis-spring-boot-starter</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-jetty</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-test</artifactId>
        </dependency>
        <!-- spring-boot-devtools -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
        </dependency>
    </dependencies>
</project>
```

2、编辑 application.yml

```yaml
server:
  port: 8001

# mybatis的配置
mybatis:
  type-aliases-package: cn.guardwhy.springcloud.pojo
  config-location: classpath:mybatis/mybatis-config.xml
  mapper-locations: classpath:mybatis/cn/guardwhy/mapper/*.xml
  
#spring的相关配置
spring:
  application:
    name: springcloud-provider-dept
  datasource:
    type: com.alibaba.druid.pool.DruidDataSource  # 数据源
    driver-class-name: org.gjt.mm.mysql.Driver   # mysql驱动
    url: jdbc:mysql://localhost:3306/db_springclound?useUnicode=true&characterEncoding=utf8&useSSL=false #数据库名称
    username: root
    password: root
    dbcp2:
      min-idle: 5  #数据库连接池的最小维持连接数
      initial-size: 5 #初始化连接数
      max-total: 5  #最大连接数
      max-wait-millis: 200 #等待连接获取的最大超时时间
```

3、编辑mybatis-config.xml文件

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE configuration
        PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-config.dtd">
<configuration>
    <settings>
        <!--开启二级缓存-->
        <setting name="cacheEnabled" value="true"/>
    </settings>
</configuration>
```

4、编写部门的dao接口

```java
package cn.guardwhy.springcloud.dao;

import cn.guardwhy.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface DeptDao {
    // 1.添加一个部门
    boolean addDept(Dept dept);
    // 2.根据id查询部门
    Dept queryById(Long id);
    // 3.查询所有的部门
    List<Dept> queryAll();
}
```

5、编写对应的DeptDaoMapper.xml文件

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<!--
实体类的映射文件: namespace 指定接口的类全名
-->
<mapper namespace="cn.guardwhy.springcloud.dao.DeptDao">
    <!--1.添加一个部门-->
    <insert id="addDept" parameterType="Dept">
        insert into dept(dname,db_source) values (#{dname}, DATABASE())
    </insert>

    <!--2.根据id查询部门-->
    <select id="queryById" resultType="Dept" parameterType="Long">
        select deptno,dname,db_source from dept where deptno = #{deptno};
    </select>

    <!--3.查询所有部门-->
    <select id="queryAll" resultType="Dept">
        select * from dept;
    </select>
</mapper>
```

6、创建对应的Service服务层

```java
package cn.guardwhy.springcloud.service;

import cn.guardwhy.springcloud.pojo.Dept;

import java.util.List;

public interface DeptService {
    // 1.添加一个部门
    boolean addDept(Dept dept);
    // 2.根据id查询部门
    Dept queryById(Long id);
    // 3.查询所有的部门
    List<Dept> queryAll();
}
```

7、ServiceImpl实现类

```java
package cn.guardwhy.springcloud.service.impl;

import cn.guardwhy.springcloud.dao.DeptDao;
import cn.guardwhy.springcloud.pojo.Dept;
import cn.guardwhy.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptServiceImpl implements DeptService {
    // 1.自动注入
    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept queryById(Long id) {
        return deptDao.queryById(id);
    }

    @Override
    public List<Dept> queryAll() {
        return deptDao.queryAll();
    }
}
```

8、创建对应的DeptController

```java
package cn.guardwhy.springcloud.controller;

import cn.guardwhy.springcloud.pojo.Dept;
import cn.guardwhy.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// 提供Restful服务！！
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @PostMapping("/dept/add")
    public boolean addDept(Dept dept){
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return deptService.queryById(id);
    }

    @PostMapping("/dept/list")
    public List<Dept> queryAll(){
        return deptService.queryAll();
    }
}
```

9、编写DeptProvider的主启动类

```java
package cn.guardwhy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeptProvider8001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001.class, args);
    }
}
```

10、启动项目，查看执行结果。

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210519192624.png)

### 2.4 创建consumer模块

新建springcloud-consumer-dept-80模块

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210519214054.png)

1、导入相关依赖支持

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <artifactId>springcloud-parent</artifactId>
        <groupId>cn.guardwhy</groupId>
        <version>1.0-SNAPSHOT</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>

    <artifactId>springcloud-consumer-dept-80</artifactId>

    <properties>
        <maven.compiler.source>8</maven.compiler.source>
        <maven.compiler.target>8</maven.compiler.target>
    </properties>

    <dependencies>
        <!--实体类+web-->
        <dependency>
          <groupId>cn.guardwhy</groupId>
          <artifactId>springcloud-api</artifactId>
          <version>1.0-SNAPSHOT</version>
        </dependency>
        <dependency>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <!--热部署-->
        <dependency>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-devtools</artifactId>
        </dependency>
    </dependencies>
</project>
```

2、application.yml 

```yaml
server:
  port: 80
```

3、创建一个`ConfigBean`配置类注入 `RestTemplate`

RestTemplate提供了多种便捷访问远程Http服务的方法，是一种简单便捷的访问restful服务模板类，是Spring提供的用于访问Rest服务的客户端模板工具集。

使用RestTemplate访问restful接口非常的简单(url，requsetMap，ResponseBean.class) 这三个参数分别代表==REST请求地址，请求参数，Http响应转换被转换成的对象类型==。

```java
package cn.guardwhy.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {   // @Configuration -- spring applicationContext.xml
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
```

4、创建对应的controller

```java
package cn.guardwhy.springcloud.controller;

import cn.guardwhy.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumerController {
    // RestTemplate: 直接调用就可以了,直接注册到Spring中
    //(url, 实体：map, Class<T> responseType)这三个参数分别代表REST请求地址，请求参数，Http响应转换被转换成的对象类型
    @Autowired
    private RestTemplate restTemplate; // 提供多种便捷访问远程http服务的方法,简单的Restful服务模板！！
    // 1.定义成常量
    private static final String REST_URL_PREFIX = "http://localhost:8001";

    @PostMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept,Boolean.class);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX +"/dept/get/"+ id,Dept.class);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list(){
        return restTemplate.getForObject(REST_URL_PREFIX +"/dept/list", List.class);
    }
}
```

5、创建主启动类

```java
package cn.guardwhy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeptConsumer80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80.class,args);
    }
}
```

6、分别启动`provider模块`和`consumer模块`，查看执行结果。

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210519215731.png)

## 3- SpringCloud Eureka

### 3.1 Eureka服务注册中心

> **基本概念**

Eureka是Netflix的一个子模块，也是核心模块之一。Eureka是一个基于REST的服务，用于定位服务，以实现云端中间层服务发现和故障转移，服务注册与发现对于微服务来说是非常重要的，有了服务发现与注册，只需要使用服务的标识符，就可以访问到服务，而不需要修改服务调用的配置文件了，==功能类似于Dubbo的注册中心Zookeeper==。

> **Eureka的基本架构**

SpringCloud 封装了NetFlix公司开发的Eureka模块来实现服务注册和发现Eureka采用了C-S的架构设计，EurekaServer 作为服务注册功能的服务器，它是服务注册中心而系统中的其他微服务。使用Eureka的客户端连接到EurekaServer并维持心跳连接。这样系统的维护人员就可以通过EurekaServer来监控系统中各个微服务是否正常运行，SpringCloud的一些其他模块（比如Zuul）就可以通过EurekaServer来发现系统中的其他微服务，并执行相关的逻辑。

> **SpringCloud架构对比Dubbo架构**

1、Dubbo架构

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210518194124.png" style="zoom:80%;" />

2、SpringCloud架构

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210520114425.png)

Eureka 包含两个组件：==Eureka Server 和 Eureka Client==，Eureka Server 提供服务注册服务，各个节点启动后，会在EurekaServer中进行注册，这样Eureka
Server中的服务注册表中将会存储所有可用服务节点的信息，服务节点的信息可以在界面中直观的看到。

Eureka Client是一个Java客户端，用于简化EurekaServer的交互，客户端同时也具备一个内置的，使用轮询负载算法的负载均衡器。在应用启动后，将会向EurekaServer发送心跳（默认周期为30秒）。如果Eureka Server在多个心跳周期内没有接收到某个节点的心跳，EurekaServer将会从服务注册表中把这
个服务节点移除掉（默认周期为90秒)。

> **角色作用**

- Eureka Server：提供服务的注册于发现。
- Service Provider：将自身服务注册到Eureka中，从而使消费方能够找到。
- Service Consumer：服务消费方从Eureka中获取注册服务列表，从而找到消费服务。

### 3.2 创建eureka模块

> **新建立springcloud-eureka-7001模块**

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210520160948.png)

1、导入相关依赖

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <artifactId>springcloud-parent</artifactId>
        <groupId>cn.guardwhy</groupId>
        <version>1.0-SNAPSHOT</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>

    <artifactId>springcloud-eureka-7001</artifactId>

    <properties>
        <maven.compiler.source>8</maven.compiler.source>
        <maven.compiler.target>8</maven.compiler.target>
    </properties>

    <dependencies>
        <!-- eureka-server服务端 -->
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-eureka-server</artifactId>
            <version>1.4.7.RELEASE</version>
        </dependency>
        <!--热部署-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
        </dependency>
    </dependencies>
</project>
```

2、application.yml

```yaml
server:
  port: 7001

#Eureka配置
eureka:
  instance:
    hostname: localhost #Eureka服务端的实例名称
  client:
    register-with-eureka: false #表示是否向Eureka注册中心注册自己
    fetch-registry: false #fetch-registry如果为false,则表示自己为注册中心
    service-url: # 监控页面
      defaultZone: "http://${eureka.instance.hostname}:${server.port}/eureka/"
```

3、编写主启动类

```java
package cn.guardwhy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // 服务端的启动类，可以接受别人注册进来~
public class EurekaServer7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001.class,args);
    }
}
```

4、启动eureka模块，查看执行结果！！！

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210520162632.png" style="zoom:80%;" />

### 3.3 Service Provider

1、将 8001的服务入驻到 7001的eureka中，修改8001服务的pom文件，增加eureka的支持。

```xml
<!--将服务的provider注册到eureka中-->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-eureka</artifactId>
    <version>1.4.7.RELEASE</version>
</dependency>
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-config</artifactId>
</dependency>
```

2、yaml 中配置添加对eureka 的支持

```yaml
#Eureka的信息，服务注册到哪里
eureka:
  client:
    service-url:
      defaultZone: http://localhost:7001/eureka
  instance:
    instance-id: springcloud-provider-dept8001 #修改eureka上的默认描述
```

3、修改8001主启动类

```java
package cn.guardwhy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // 开启服务后会自动注册进Eureka中
public class DeptProvider8001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001.class, args);
    }
}
```

4、配置服务加载的信息

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210520172641.png)

5、点击info，出现ERROR页面

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210520190410.png)

> **Info内容构建**

1、修改springcloud-provider-dept-8001模块的pom.xml，新增actuator依赖。

```xml
<!--actuator完善监控信息-->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
```

2、修改8001的`application.yml`配置文件，增加info配置

```yaml
#info 配置
info:
  app.name: guardwhy-springcloud
  company.name: www.guardwhy.cn
  build.artifactId: ${project.artifactId}
  build.version: ${project.version}
```

3、重新启动7001、8001模块，查看执行结果

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210520205747.png)

### 3.4 Eureka的自我保护机制

某时刻某一个微服务不可以用了，eureka不会立刻清理，依旧会对该微服务的信息进行保存。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210520210028.png)

默认情况下，如果EurekaServer在一定时间内没有接收到某个微服务实例的心跳，EurekaServer将会注销该实例（默认90秒）。但是当网络分区故障发生时，微服务与Eureka之间无法正常通行，以上行为可能变得非常危险了。因为微服务本身其实是健康的，此时本不应该注销这个服务。Eureka通过自我保护机制来解决这个问题，当EurekaServer节点在短时间内丢失过多客户端时，那么这个节点就会进入自我保护模式。一旦进入该模式，EurekaServer就会保护服务注册表中的
信息，不再删除服务注册表中的数据（也就是不会注销任何微服务）。当网络故障恢复后，该EurekaServer节点会自动退出自我保护模式。

在自我保护模式中，EurekaServer会保护服务注册表中的信息，不再注销任何服务实例。当它收到的心跳数重新恢复到阈值以上时，该EurekaServer节点就会自动退出自我保护模式。==它的设计哲学就是宁可保留错误的服务注册信息，也不盲目注销任何可能健康的服务实例==。

### 3.5 Eureka集群配置

1、新建模块springcloud-eureka-7002、springcloud-eureka-7003。

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210520225212.png)

2、分别给7002的pom.xml、7003的pom.xml添加以下依赖！！！

```xml
<dependencies>
    <!-- eureka-server服务端 -->
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-eureka-server</artifactId>
        <version>1.4.7.RELEASE</version>
    </dependency>
    <!--热部署-->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-devtools</artifactId>
    </dependency>
</dependencies>
```

3、分别创建7002和7003的主启动类。

4、修改映射配置 , windows域名映射。

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210520231241.png" style="zoom:80%;" />

5、修改3个EurekaServer的`application.yml`文件

7001

```yaml
server:
  port: 7001

#Eureka配置
eureka:
  instance:
    hostname: localhost #Eureka服务端的实例名称
  client:
    register-with-eureka: false #表示是否向Eureka注册中心注册自己
    fetch-registry: false #fetch-registry如果为false,则表示自己为注册中心
    service-url: # 监控页面
      defaultZone: http://eureka7002.com:7002/eureka/,http://eureka7003.com:7003/eureka/
```

7002

```yaml
server:
  port: 7002

#Eureka配置
eureka:
  instance:
    hostname: localhost #Eureka服务端的实例名称
  client:
    register-with-eureka: false #表示是否向Eureka注册中心注册自己
    fetch-registry: false #fetch-registry如果为false,则表示自己为注册中心
    service-url: # 监控页面
      defaultZone: http://eureka7001.com:7001/eureka/,http://eureka7003.com:7003/eureka/
```

7003 

```yaml
server:
  port: 7003

#Eureka配置
eureka:
  instance:
    hostname: localhost #Eureka服务端的实例名称
  client:
    register-with-eureka: false #表示是否向Eureka注册中心注册自己
    fetch-registry: false #fetch-registry如果为false,则表示自己为注册中心
    service-url: # 监控页面
      defaultZone: http://eureka7001.com:7001/eureka/,http://eureka7002.com:7002/eureka/
```

6，将8001微服务发布到Eureka集群配置中，修改8001模块的`application.yml`。

```yaml
#Eureka的信息，服务注册到哪里
eureka:
  client:
    service-url:
      defaultZone: http://eureka7001.com:7001/eureka/,http://eureka7002.com:7002/eureka/,http://eureka7003.com:7003/eureka/
  instance:
    instance-id: springcloud-provider-dept8001 #修改eureka上的默认描述
```

7、启动集群测试，查看执行结果！！！

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210521171917.png)

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210521130120.png)

### 3.6 Eureka和Zookeeper区别

> 回顾CAP原则

RDBMS (Mysql、Oracle、sqlServer) ==>ACID

NoSQL(redis、mongdb） == >> CAP

> ACID是什么？

- A (Atomicity）原子性
- C (Consistency） 一致性
- I (Isolation）隔离性
- D (Durability）持久性

> CAP是什么？

- C (Consistency）强一致性。
- A (Availability）可用性。
- P (Partition tolerance）分区容错性。

> CAP理论的核心

一个分布式系统不可能同时很好的满足一致性，可用性和分区容错性这三个需求，根据CAP原理，将NoSQL数据库分成了满足CA原则，满足CP原则和满足AP原则。

- CA：单点集群，满足一致性，可用性的系统，通常可扩展性较差。
- CP：满足一致性，分区容错性的系统，通常性能不是特别高。
- AP：满足可用性，分区容错性的系统，通常可能对一致性要求低一些。

> Eureka与Zookeeper对比

著名的CAP理论指出，一个分布式系统不可能同时满足C（一致性）、A（可用性）、P（容错性）。
由于分区容错性P在分布式系统中是必须要保证的，因此我们只能在A和C之间进行权衡。Zookeeper保证的是CP，Eureka保证的是AP。

**Zookeeper保证的是CP**

当向注册中心查询服务列表时，可以容忍注册中心返回的是几分钟以前的注册信息，但不能接受服务直接down掉不可用。也就是说，服务注册功能对可用性的要求要高于一致性。但是zk会出现这样一种情况，当master节点因为网络故障与其他节点失去联系时，剩余节点会重新进行leader选举。问题在于，选举leader的时间太长，30~120s，且选举期间整个zk集群都是不可用的，这就导致在选举期间注册服务瘫痪。在云部署的环境下，因为网络问题使得zk集群失去master节点是较大概率会发生的事件，虽然服务最终能够恢复，但是漫长的选举时间导致的注册长期不可用是不能容忍的。

**Eureka保证的是AP**

Eureka看明白了这一点，因此在设计时就优先保证可用性。Eureka各个节点都是平等的，几个节点挂掉不会影响正常节点的工作，剩余的节点依然可以提供注册和查询服务。而Eureka的客户端在向某个Eureka注册时，如果发现连接失败，则会自动切换至其他节点，只要有一台Eureka还在，就能保住注册服务的可用性，只不过查到的信息可能不是最新的，除此之外，Eureka还有一种自我保护机制，如果在15分钟内超过85%的节点都没有正常的心跳，那么Eureka就认为客户端与注册中心出现了网络故障，此时会出现以下几种情况

- Eureka不再从注册列表中移除因为长时间没收到心跳而应该过期的服务。
- Eureka仍然能够接受新服务的注册和查询请求，但是不会被同步到其他节点上(即保证当前节点依然可用）。
- 当网络稳定时，当前实例新的注册信息会被同步到其他节点中。

**结论**：Eureka可以很好的应对因网络故障导致部分节点失去联系的情况，而不会像zookeeper那样使整个注册服务瘫痪。

## 4- Springcloud Ribbon

### 4.1 什么是Ribbon？

Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端负载均衡的工具，负载均衡一般分为==服务器端负载均衡==和==客户端负载均衡==。

**所谓服务器端负载均衡**：比如Nginx、F5这些，请求到达服务器之后由这些负载均衡器根据一定的算法将请求路由到目标服务器处理。

**所谓客户端负载均衡**：比如我们要说的Ribbon，服务消费者客户端会有一个服务器地址列表，调用方在请求前通过一定的负载均衡算法选择一个服务器进行访问，负载均衡算法的执行是在请求客户端进行。

Ribbon是Netflix发布的负载均衡器。Eureka一般配合Ribbon进行使用，Ribbon利用从Eureka中读取到服务信息，在调用服务提供者提供的服务时，会根据一定的算法进行负载。

### 4.2 Ribbon配置初步

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210521191429.png)

1、修改springcloud-consumer-dept-80的pom.xml配置，添加Ribbon相关的配置。

```xml
<!--eureka-->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-eureka</artifactId>
    <version>1.4.7.RELEASE</version>
</dependency>
<!--ribbon-->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-ribbon</artifactId>
    <version>1.4.7.RELEASE</version>
</dependency>
```

2、修改application.yml ， 追加Eureka的服务注册地址。

```yaml
server:
  port: 80

#Eureka配置
eureka:
  client:
    service-url:
      defaultZone: http://eureka7001.com:7001/eureka/,http://eureka7002.com:7002/eureka/,http://eureka7003.com:7003/eureka/
```

3、修改ConfigBean方法，在该类加上注解@LoadBalanced。

```java
package cn.guardwhy.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {   // @Configuration -- spring applicationContext.xml
    // 配置负载均衡实现RestTemplate
    @Bean
    @LoadBalanced // Ribbon
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
```

4、修改DeptConsumerController，动态的通过服务名来访问！！！

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210521192336.png)

```java
//private static final String REST_URL_PREFIX = "http://localhost:8001";
 // Ribbon，这里的地址。应该是一个变量，通过服务名来访问。
private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-DEPT";
```

5、在主启动类上添加`@EnableEurekaClient`

```java
package cn.guardwhy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeptConsumer80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80.class,args);
    }
}
```

6、先启动3个Eureka集群，然后再启动8001模块并且注册进eureka，最后启动80模块，查看查看执行结果！！！

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210521193303.png)

7、结论：Ribbon和Eureka整合后Consumer可以直接调用服务而不用再关心地址和端口号！

### 4.3 Ribbon负载均衡

1、Ribbon负载均衡架构实现

- 先选择==EurekaServer==，它优先选择在同一个区域内负载均衡较少的Server。
- 在根据用户指定的策略，在从server去到的服务注册列表中选择一个地址。
- Ribbon提供了多种策略，比如轮询(默认)，随机和根据响应时间加权重。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210522085231.png)

2、新建`db_springclound2`和`db_springclound3`数据库，复制`db_springclound1`数据库里面的内容。

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210522090800.png)

3、参考8001模块，新建8002,8003模块，复制完毕后，修改启动类和端口号名称！！

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210522092138.png)

4、修改8002/8003模块各自的`yaml`文件

- 端口
- 数据库连接
- 实例名也需要修改

```yaml
instance:
    instance-id: springcloud-provider-dept8003 #修改eureka上的描述
```

对外暴露的统一的服务实例名【三个服务名字必须一致】

```yaml
application:
    name: springcloud-provider-dept
```

5、先启动3个Eureka集群配置区，再启动3个dept微服务，然后查看执行结果！！！

[http://localhost:8001/dept/list](http://localhost:8001/dept/list)

[http://localhost:8002/dept/list](http://localhost:8002/dept/list)

[http://localhost:8002/dept/list](http://localhost:8002/dept/list)

6、然后再启动80模块，客户端通过Ribbon完成负载均衡并访问上一步的dept微服务。

[http://localhost/consumer/dept/list](http://localhost/consumer/dept/list)

多次刷新，查看执行结果！！！

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210522104420.png" style="zoom:80%;" />

7、Ribbon负载均衡总结

Ribbon其实就是一个软负载均衡的客户端组件，他可以和其他所需请求的客户端结合使用，和Eureka结合只是其中的一个实例。

### 4.4 自定义负载均衡算法

> Ribbon核心组件是IRule。

IRule：根据特定算法从服务列表中选取一个要访问的服务。

```java
package com.netflix.loadbalancer;

public interface IRule{

    public Server choose(Object key);
    
    public void setLoadBalancer(ILoadBalancer lb);
    
    public ILoadBalancer getLoadBalancer();    
}
```

> 具体实现类

**RoundRobinRule** ：轮询算法

**RandomRule**：随机算法

**AvailabilityFilterRule**：会先过滤掉由于多次访问故障而处于断路器跳闸的服务，还有并发的连接数量超过阈值的服务，然后对剩余的服务列表按照轮询策略进行访问。

**WeightedResponseTimeRule**：根据平均响应时间计算所有服务的权重，响应时间越快服务权重越大，被选中的概率越高。启动时如果统计信息不足，则使用RoundRobinRule策略，等待统计信息足够，会切换到WeightedResponseTimeRule。

**RetryRule**：先按照RoundRobinRule的策略获取服务，如果获取服务失败，则在指定时间内会进行重试，获取可用的服务。

**BestAvailableRule**：会先过滤掉由于多次访问故障而处于断路器跳闸状态的服务，然后选择一个并发量最小的服务。

**ZoneAvoidanceRule**：默认规则，复合判断server所在区域的性能和server的可用性选择服务器。

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210522160022.png)

> RoundRobinRule(轮询)源码分析

```java
public Server choose(ILoadBalancer lb, Object key) {
    if (lb == null) {
        // 如果为空，则不存在负载均衡
        log.warn("no load balancer");
        return null;
    }

    Server server = null;
    int count = 0;
    while (server == null && count++ < 10) {
        // 获取可以获的服务
        List<Server> reachableServers = lb.getReachableServers();
        // 获取所有的服务
        List<Server> allServers = lb.getAllServers();
        int upCount = reachableServers.size();
        int serverCount = allServers.size();

        if ((upCount == 0) || (serverCount == 0)) {
            log.warn("No up servers available from load balancer: " + lb);
            return null;
        }

        int nextServerIndex = incrementAndGetModulo(serverCount);
        // 执行轮询操作
        server = allServers.get(nextServerIndex);

        if (server == null) {
            /* Transient. */
            Thread.yield();
            continue;
        }

        if (server.isAlive() && (server.isReadyToServe())) {
            return (server);
        }

        // Next.
        server = null;
    }

    if (count >= 10) {
        log.warn("No available alive servers after 10 tries from load balancer: "
                 + lb);
    }
    return server;
}
```

> 自定义RandomRule(随机算法)

1、建立一个包 com.guardwhy.myrule

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210522195318.png)

2、新建一个自定义规则的GuardwhyRule类

```java
package cn.guardwhy.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GuardwhyRule {
    @Bean
    public IRule myRule(){
        return new RandomRule(); // 默认是轮询
    }
}
```

3、修改80模块，给主启动类添加`@RibbonClient`注解。

```java
package cn.guardwhy.springcloud;

import cn.guardwhy.myrule.GuardwhyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
// 在微服务启动的时候就能去加载自定义的Ribbon类
@RibbonClient(name = "SPRINGCLOUD-PROVIDER-DEPT", configuration = GuardwhyRule.class)
public class DeptConsumer80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80.class,args);
    }
}
```

4、解析`RandomRule.java`的源码

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210522180756.png)	

```java
package com.netflix.loadbalancer;

import com.netflix.client.config.IClientConfig;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class RandomRule extends AbstractLoadBalancerRule {

    @edu.umd.cs.findbugs.annotations.SuppressWarnings(value = "RCN_REDUNDANT_NULLCHECK_OF_NULL_VALUE")
    //ILoadBalancer选择的随机算法
    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        }
        Server server = null;

        while (server == null) {
            // 查看线程是否中断
            if (Thread.interrupted()) {
                return null;
            }
            List<Server> upList = lb.getReachableServers(); // 获取活着的服务！！
            List<Server> allList = lb.getAllServers(); // 拿到所有的服务

            int serverCount = allList.size();
            if (serverCount == 0) {
                return null;
            }

            int index = chooseRandomInt(serverCount); // 生成区间的随机数
            server = upList.get(index);	// 从活着的服务中，随机取出一个

            if (server == null) {
                Thread.yield();
                continue;
            }

            if (server.isAlive()) {
                return (server);
            }

            // Shouldn't actually happen.. but must be transient or a bug.
            server = null;
            Thread.yield();
        }

        return server;

    }
	
    // 随机
    protected int chooseRandomInt(int serverCount) {
        return ThreadLocalRandom.current().nextInt(serverCount);
    }

	@Override
	public Server choose(Object key) {
		return choose(getLoadBalancer(), key);
	}

	@Override
	public void initWithNiwsConfig(IClientConfig clientConfig) {
		// TODO Auto-generated method stub
		
	}
}
```

5、新建一个`GuardwhyRandomRule`类继承`AbstractLoadBalancerRule`核心类

```java
package cn.guardwhy.myrule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class GuardwhyRandomRule extends AbstractLoadBalancerRule {
    // 自定义条件: 每个服务访问5次，然后就换下一个服务！！！
    /*
    *  total=0, 默认=0， 如果total=5,则指向下一个服务点
    *  index=0, 默认为0， 如果total=5, index+1
    */
    private int total = 0; // 被调用的次数
    private int currentIndex = 0; // 当前是谁在提供服务

    //ILoadBalancer选择的随机算法
    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        }
        Server server = null;

        while (server == null) {
            //查看线程是否中断了
            if (Thread.interrupted()) {
                return null;
            }
            List<Server> upList = lb.getReachableServers(); // 获取活的服务！！
            List<Server> allList = lb.getAllServers(); // 拿到所有的服务

            int serverCount = allList.size();
            if (serverCount == 0) {
                /*
                 * No servers. End regardless of pass, because subsequent passes
                 * only get more restrictive.
                 */
                return null;
            }

            // int index = chooseRandomInt(serverCount);
            // server = upList.get(index);

            // 条件判断
            if(total < 5){
                server = upList.get(currentIndex);
                total++;
            }else {
                total = 0;
                currentIndex++;
                if(currentIndex>= upList.size()){
                    currentIndex = 0;
                }
                server = upList.get(currentIndex);
            }

            if (server == null) {
                /*
                 * The only time this should happen is if the server list were
                 * somehow trimmed. This is a transient condition. Retry after
                 * yielding.
                 */
                Thread.yield();
                continue;
            }

            if (server.isAlive()) {
                return (server);
            }

            // Shouldn't actually happen.. but must be transient or a bug.
            server = null;
            Thread.yield();
        }

        return server;

    }

    protected int chooseRandomInt(int serverCount) {
        return ThreadLocalRandom.current().nextInt(serverCount);
    }

    @Override
    public Server choose(Object key) {
        return choose(getLoadBalancer(), key);
    }

    @Override
    public void initWithNiwsConfig(IClientConfig clientConfig) {
        // TODO Auto-generated method stub

    }
}
```

6、调用自定义的IRule方法中返回刚才写好的随机算法类。

```java
package cn.guardwhy.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GuardwhyRule {
    @Bean
    public IRule myRule(){
        return new GuardwhyRandomRule(); // Ribbon默认是轮询，自定义随机算法
    }
}
```

启动项目，查看执行结果，执行成功！！！

## 5- Springcloud Feign

### 5.1 什么是Feign

Feign是Netflix开发的一个轻量级RESTful的HTTP服务客户端（用它来发起请求，远程调用的），是以Java接口注解的方式调用Http请求，而不用像Java中通过封装HTTP请求报文的方式直接调用，Feign被广泛应用在Spring Cloud 的解决方案中。

Feign类似于Dubbo，服务消费者拿到服务提供者的接口，然后像调用本地接口方法一样去调用，实际发出的是远程的请求。

- Feign可帮助我们更加便捷，优雅的调用HTTP API：不需要我们去拼接url然后呢调用restTemplate的api，在SpringCloud中，使用Feign非常简单，创建一个接口（在消费者--服务调用方这一端），并在接口上添加一些注解，代码就完成了。
- SpringCloud对Feign进行了增强，使Feign支持了SpringMVC注解（OpenFeign）

**Feign集成了Ribbon**

利用Ribbon维护了springcloud-Dept的服务列表信息，并且通过轮询实现了客户端的负载均衡，而与Ribbon不同的是，通过Feign只需要定义服务绑定接口且以声明式的方法，优雅而且简单的实现了服务调用。

### 5.2 Feign使用步骤

1、修改springcloud-api工程

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210523094121.png)

- pom.xml添加feign的支持。

```xml
<!--Feign相关依赖-->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-feign</artifactId>
    <version>1.4.7.RELEASE</version>
</dependency>
```

- 编写接口 DeptClientService，并增加新的注解`@FeignClient`。

```java
package cn.guardwhy.springcloud.service;

import cn.guardwhy.springcloud.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Component
@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT")
public interface DeptClientService {
    @GetMapping("/dept/get/{id}")
    public Dept queryById(@PathVariable("id") Long id); //根据id查询部门

    @GetMapping("/dept/list")
    public List<Dept> queryAll(); //查询所有部门

    @PostMapping("/dept/add")
    public boolean addDept(Dept dept); //添加一个部门
}
```

2、新建springcloud-consumer-dept-feign-80模块，项目目录。

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210523093118.png)

2、添加Feign依赖的支持！！

```xml
<!--Feign相关依赖-->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-feign</artifactId>
    <version>1.4.7.RELEASE</version>
</dependency>
```

3、springcloud-consumer-dept-feign-80模块controller、ConfigBean编写。

 **ConfigBean.java**

```java
package cn.guardwhy.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {   // @Configuration -- spring applicationContext.xml
    // 配置负载均衡实现RestTemplate
    @Bean
    @LoadBalanced // Ribbon
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
```

**DeptConsumerController.java**

```java
package cn.guardwhy.springcloud.controller;
import cn.guardwhy.springcloud.pojo.Dept;
import cn.guardwhy.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptConsumerController {
    @Autowired
    private DeptClientService service = null;

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        return this.service.addDept(dept);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return this.service.queryById(id);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list(){
        return  this.service.queryAll();
    }
}
```

4、修改主启动类，开启Feign使用！！

```java
package cn.guardwhy.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"cn.guardwhy.springcloud"})
public class FeignDeptConsumer80 {
    public static void main(String[] args) {
        SpringApplication.run(FeignDeptConsumer80.class,args);
    }
}
```

5、启动eureka集群，启动(8001，8002，8003)，然后启动feign客户端，测试： [http://localhost/consumer/dept/list](http://localhost/consumer/dept/list)。

小结：Feign自带负载均衡配置项！！！

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210523095403.png)

### 5.3 Feign总结

- Feign通过接口的方法调用Rest服务 (之前是Ribbon+RestTemplate)，通过Feign直接找到服务接口，由于在进行服务调用的时候融合了Ribbon技术，所以也支持负载均衡作用！
- feign其实不是做负载均衡的，负载均衡是ribbon的功能，feign只是集成了ribbon而已，但是负载均衡的功能还是feign内置的ribbon再做，而不是feign。
- feign的作用的替代RestTemplate性能比较低，但是可以使代码可读性很强。

## 6- Hystrix熔断器

### 6.1 什么是Hystrix？

Hystrix是一个用于处理分布式系统的延迟和容错的开源库，在分布式系统里，许多依赖不可避免的会调用失败，比如超时，异常等，Hystrix能够保证在一个依赖出问题的情况下，不会导致整体服务失败，避免级联故障，以提高分布式系统的弹性。“断路器” 本身是一种开关装置，当某个服务单元发生故障之后，通过断路器的故障监控（类似熔断保险丝），向调用方返回一个服务预期的，可处理的备选响应（FallBack），而不是长时间的等待或者抛出调用方法无法处理的异常，这样就可以保证了服务调用方的线程不会被长时间，不必要的占用，从而避免了故障在分布式系统中的蔓延，乃至雪崩。

### 6.2 Hystrix的作用是什么？

Hystrix旨在执行以下操作：

- 提供保护并控制延迟和失败，以及通过第三方客户端库（通常是通过网络）访问的依赖项的失败。
- 停止复杂的分布式系统中的级联故障。
- 快速失败并快速恢复。
- 回退并在可能的情况下正常降级。
- 启用近乎实时的监视，警报和操作控制。

### 6.3 Hystrix解决什么问题？

复杂的分布式体系结构中的应用程序具有数十种依赖关系，每种依赖关系不可避免地会在某个时刻失败。如果主机应用程序未与这些外部故障隔离开来，则可能会被淘汰。

> **当一切正常时，请求流如下所示**

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210523184558.png)

> **当许多后端系统之一变得潜在时，它可以阻止整个用户请求**

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210523184807.png)

> **服务雪崩**

多个微服务之间调用的时候，假设微服务A调用微服务B和微服务C，微服务B 和微服务C又调用其他的微服务，这就是所谓的 “扇出”、如果扇出的链路上某个微服务的调用响应时间过长或者不可用，对微服务A的调用就会占用越来越多的系统资源，进而引起系统崩溃，所谓的 “雪崩效应”。对于高流量的应用来说，单一的后端依赖可能会导致所有服务器上的所有资源都在几秒中内饱和。比失败更糟糕的是，这些应用程序还可能导致服务之间的延迟增加，备份队列，线程和其他系统资源紧张，导致整个系统发生更多的级联故障，这些都表示需要对故障和延迟进行隔离和管理，以便单个依赖关系的失败，不能取消整个应用程序或系统。这个时候就需要==弃车保帅==。

**Hystrix的工作原理**

- 防止任何单个依赖项耗尽所有容器（例如Tomcat）用户线程。
- 减少负载并快速失败，而不是排队。
- 在可行的情况下提供备用，以保护用户免受故障的影响。
- 使用隔离技术（例如隔板，泳道和断路器模式）来限制任何一种依赖关系的影响。
- 通过近实时指标，监视和警报优化发现时间
- 通过在Hystrix的大多数方面中以低延迟传播配置更改来优化恢复时间，并支持动态属性更改，这使您可以通过低延迟反馈回路进行实时操作修改。
- 防止整个依赖项客户端执行失败，而不仅仅是网络流量失败。

### 6.4 服务熔断

1、基本概念

熔断机制是对应雪崩效应的一种微服务链路保护机制。当扇出链路的某个微服务不可用或者响应时间太长时，会进行服务的降级，进而熔断该节点微服务的调
用，快速返回 错误的响应信息。当检测到该节点微服务调用响应正常后恢复调用链路。在SpringCloud框架里熔断机制通过Hystrix实现。Hystrix会监控微服务间调用的状况，当失败的调用到一定阈值，缺省是5秒内20次调用失败就会启动熔断机制。

熔断机制的注解是 `@HystrixCommand`。

2、新建springcloud-provider-dept-hystrix-8001模块，将8001的所有东西拷贝一份。

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210523185655.png)

**修改pom文件，添加Hystrix的依赖**。

```xml
<!--Hystrix-->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-hystrix</artifactId>
    <version>1.4.7.RELEASE</version>
</dependency>
```

3、修改`application.yml`中的eureka实例的id。

```yaml
#Eureka的信息，服务注册到哪里
eureka:
  client:
    service-url:
      defaultZone: http://eureka7001.com:7001/eureka/,http://eureka7002.com:7002/eureka/,http://eureka7003.com:7003/eureka/
  instance:
    instance-id: springcloud-provider-dept-8001 #修改eureka上的默认描述
```

4、修改实体类

```java
package cn.guardwhy.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
// Dept实体类
public class Dept implements Serializable {
    // 主键
    private Long deptno;
    // 部门名称
    private String dname;
    // 来自哪个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存到多个不同的数据库
    private String db_source;
}
```

5、修改DeptController

```java
package cn.guardwhy.springcloud.controller;

import cn.guardwhy.springcloud.pojo.Dept;
import cn.guardwhy.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// 提供Restful服务！！
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @GetMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "hystrixGet")
    public Dept get(@PathVariable("id") Long id){
        Dept dept = deptService.queryById(id);
        // 条件判断
        if(dept == null){
            throw new RuntimeException("id=>" +id+",不存在该用户，或者信息无法找到~~");
        }
        return dept;
    }

    // 备选方案
    public Dept hystrixGet(@PathVariable("id") Long id){
        return new Dept()
            .setDeptno(id)
            .setDname("该id："+id+"没有对应的信息，null--@hystrixGet")
            .setDb_source("no this database in MySQL");
    }
}
```

6、修改主启动类添加新注解 @EnableCircuitBreaker

```java
package cn.guardwhy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // 开启服务后会自动注册进Eureka中
@EnableDiscoveryClient // 服务发现
@EnableCircuitBreaker // 添加对熔断的支持
public class DeptProviderHystrix_8001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProviderHystrix_8001.class, args);
    }
}
```

7、测试项目

- 启动Eureka集群。

- 启动springcloud-provider-dept-hystrix-8001

- 启动springcloud-consumer-dept-80。

- 访问：[http://localhost/consumer/dept/get/22](http://localhost/consumer/dept/get/22)

  ![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210523190645.png)	

### 6.5 服务降级

1、基本概念

通俗讲就是整体资源不够用了，先将一些不关紧的服务停掉（调用我的时候，给你返回一个预留的值，也叫做兜底数据），待渡过难关高峰过去，再把那些服务打开。服务降级一般是从整体考虑，就是当某个服务熔断之后，服务器将不再被调用，此刻客户端可以自己准备一个本地的fallback回调，返回一个缺省值，这样做，虽然服务水平下降，但好歹可用，比直接挂掉要强。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210523205400.png)

2、新建一个实现了FallbackFactory接口的类`DeptClientServiceFallbackFactory`。

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210523231948.png)

==注意: 这个类上需要@Component注解!!!==

```java
package cn.guardwhy.springcloud.service;

import cn.guardwhy.springcloud.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory {
    @Override
    public Object create(Throwable throwable) {
        return new DeptClientService(){

            @Override
            public Dept queryById(Long id) {
                return new Dept()
                        .setDeptno(id)
                        .setDname("该id=>"+id+"没有对应的信息,客户端提供了降级信息,这个服务现在已经被关闭！！！")
                        .setDb_source("没有数据！！");
            }

            @Override
            public List<Dept> queryAll() {
                return null;
            }

            @Override
            public boolean addDept(Dept dept) {
                return false;
            }
        };
    }
}
```

3、==服务降级处理是在客户端实现完成的，与服务端没有关系==，修改springcloud-api工程中的DeptClientService接口。

```java
package cn.guardwhy.springcloud.service;

import cn.guardwhy.springcloud.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Component
@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT", fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {
    @GetMapping("/dept/get/{id}")
    public Dept queryById(@PathVariable("id") Long id); //根据id查询部门

    @GetMapping("/dept/list")
    public List<Dept> queryAll(); //查询所有部门

    @PostMapping("/dept/add")
    public boolean addDept(Dept dept); //添加一个部门
}
```

4、修改springcloud-consumer-dept-feign-80模块中的`application.yaml`文件

```yaml
server:
  port: 80

## 开启降级feign.hystrix
feign:
  hystrix:
    enabled: true
#Eureka配置
eureka:
  client:
    service-url:
      defaultZone: http://eureka7001.com:7001/eureka/,http://eureka7002.com:7002/eureka/,http://eureka7003.com:7003/eureka/
```

5、测试项目

- 启动eureka集群。
- 启动springcloud-provider-dept-8001模块
- 启动springcloud-consumer-dept-feign-80模块
- 正常访问: [http://localhost/consumer/dept/get/1](http://localhost/consumer/dept/get/1)

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210523233305.png)	

- 关闭springcloud-provider-dept-8001模块，访问[http://localhost/consumer/dept/get/1](http://localhost/consumer/dept/get/1)

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210523233520.png)

此时服务端provider已经崩了，但是由于项目做了服务降级处理，让客户端在服务端不可用也会获得提示信息而不会挂起耗死服务器。

6、小结

**服务熔断**

服务端~ 某个服务器超时或者异常，引起熔断类似现实世界中的 “保险丝” ， 当某个异常条件被触发，直接熔断整个服务，而不是一直等到此服务超时。

**服务降级**

客户端~ 所谓降级，一般是从整体负荷考虑，就是当某个服务熔断之后，服务器将不再被调用，此时客户端可以自己准备一个本地的`FallbackFactory`回调，返回一个缺省值。虽然服务水平下降，但好歹可用，比直接挂掉要强。

## 7- 服务监控

### 7.1 hystrixDashboard

Hystrix提供了准实时的调用监控（Hystrix Dashboard），Hystrix会持续地记录所有通过Hystrix发起的请求的执行信息，并以统计报表和图形的形式展示给用户，包括每秒执行多少请求，多少成功，多少失败等等。Netflix通过hystrix-metrics-event-stream项目实现了对以上指标的监控，SpringCloud也提供了Hystrix
Dashboard的整合，对监控内容转化成可视化界面。

### 7.2 服务监控实现

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210524123235.png)

1、新建springcloud-consumer-hystrix-dashboard-9001项目，添加相关依赖。

**pom.xml**

```xml
<dependencies>
    <!--实体类+web-->
    <dependency>
        <groupId>cn.guardwhy</groupId>
        <artifactId>springcloud-api</artifactId>
        <version>1.0-SNAPSHOT</version>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <!--热部署-->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-devtools</artifactId>
    </dependency>
    <!--eureka-->
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-eureka</artifactId>
        <version>1.4.7.RELEASE</version>
    </dependency>
    <!--Feign相关依赖-->
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-feign</artifactId>
        <version>1.4.7.RELEASE</version>
    </dependency>
    <!--Hystrix-->
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-hystrix</artifactId>
        <version>1.4.7.RELEASE</version>
    </dependency>
    <!--监控-->
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-hystrix-dashboard</artifactId>
        <version>1.4.7.RELEASE</version>
    </dependency>
</dependencies>
```

2、添加application.yaml配置

```yaml
server:
  port: 9001
```

3、修改主启动类

```java
package cn.guardwhy.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumerDashboard_9001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerDashboard_9001.class,args);
    }
}
```

4、给springcloud-provider-dept-hystrix-8001添加监控依赖

```xml
<!--actuator完善监控信息-->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
<!--Hystrix-->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-hystrix</artifactId>
    <version>1.4.7.RELEASE</version>
</dependency>
```

5、启动9001项目，该服务监控消费端。

相关链接: [http://localhost:9001/hystrix](http://localhost:9001/hystrix)

**Delay** 

该参数用来控制服务器上轮询监控信息的延迟时间，默认为2000毫秒，可以通过配置。
该属性来降低客户端的网络和CPU消耗。

**Title**

 该参数对应了头部标题HystrixStream之后的内容，默认会使用具体监控实例URL。

 可以通过配置该信息来展示更合适的标题。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210524124147.png)

### 7.3 查看测试结果

1、启动eureka集群。

2、启动springcloud-consumer-hystrix-dashboard-9001工程。

3、修改springcloud-provider-dept-hystrix-8001的主启动类，添加一个bean。

```java
package cn.guardwhy.springcloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient // 开启服务后会自动注册进Eureka中
@EnableDiscoveryClient // 服务发现
@EnableCircuitBreaker // 添加对熔断的支持
public class DeptProviderHystrix_8001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProviderHystrix_8001.class, args);
    }

    // 增加一个Servlet
    @Bean
    public ServletRegistrationBean hystrixMetricsStreamServlet(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new HystrixMetricsStreamServlet());
        registrationBean.addUrlMappings("/actuator/hystrix.stream");
        return registrationBean;
    }
}
```

4、启动springcloud-provider-dept-hystrix-8001

> **测试链接**

[http://localhost:8001/dept/get/2](http://localhost:8001/dept/get/2)

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210524134128.png)

http://localhost:8001/actuator/hystrix.stream【查看数据流】

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210524134224.png)

> **监控测试**

多次刷新： [http://localhost:8001/dept/get/1](http://localhost:8001/dept/get/1)

**监控结果**

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210524134436.png)

5、查看监控图

**实心圆**

公有两种含义，他通过颜色的变化代表了实例的健康程度它的健康程度从绿色<黄色<橙色<红色 递减
该实心圆除了颜色的变化之外，它的大小也会根据实例的请求流量发生变化，流量越大，该实心圆就越大，所以通过该实心圆的展示，就可以在大量的实例中快速发现故障实例和高压力实例。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210524141528.png)

**曲线**

用来记录2分钟内流量的相对变化，可以通过它来观察到流量的上升和下降趋势。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210524141741.png)

**整图说明**

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210524142051.png)

## 8- 路由网关

### 8.1 Zuul路由网关

#### 8.1.1 什么是Zuul？

官方文档：https://github.com/Netflix/zuul

- Zuul包含了对请求的路由和过滤两个最主要的功能：路由功能负责将外部请求转发到具体的微服务实例上，是实现外部访问统一入口的基础，而过滤器
  功能则负责对请求的处理过程进行干预，是实现请求校验，服务聚合等功能的基础。Zuul和Eureka进行整合，将Zuul自身注册为Eureka服务治理下的应用，同时从Eureka中获得其他微服务的消息，也即以后的访问微服务都是通过Zuul跳转后获得。
- Zuul服务最终还是会注册进Eureka。
- 提供：代理 + 路由 + 过滤 三大功能。

#### 8.1.2 Zuul的基本配置

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210524171430.png)

1、添加Eureka和zuul相关依赖

```xml
<dependencies>
    <!--实体类+web-->
    <dependency>
        <groupId>cn.guardwhy</groupId>
        <artifactId>springcloud-api</artifactId>
        <version>1.0-SNAPSHOT</version>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <!--热部署-->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-devtools</artifactId>
    </dependency>
    <!--eureka-->
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-eureka</artifactId>
        <version>1.4.7.RELEASE</version>
    </dependency>
    <!--Feign相关依赖-->
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-feign</artifactId>
        <version>1.4.7.RELEASE</version>
    </dependency>
    <!--Hystrix-->
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-hystrix</artifactId>
        <version>1.4.7.RELEASE</version>
    </dependency>
    <!--监控-->
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-hystrix-dashboard</artifactId>
        <version>1.4.7.RELEASE</version>
    </dependency>
    <!--Zuul相关依赖-->
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-zuul</artifactId>
        <version>1.4.7.RELEASE</version>
    </dependency>
</dependencies>
```

2、配置application.yaml

```yaml
server:
  port: 9527
  
#spring的相关配置
spring:
  application:
    name: springcloud-zuul

#Eureka的信息，服务注册到哪里
eureka:
  client:
    service-url:
      defaultZone: http://eureka7001.com:7001/eureka/,http://eureka7002.com:7002/eureka/,http://eureka7003.com:7003/eureka/
  instance:
    instance-id: zuul9527.com
    prefer-ip-address: true

#info 配置
info:
  app.name: guardwhy-springcloud
  company.name: www.guardwhy.cn
  build.artifactId: ${project.artifactId}
  build.version: ${project.version}
```

3、**hosts修改**

路径：C:\Windows\System32\drivers\etc\hosts

```java
127.0.0.1 www.guardwhy.cn
```

4、添加主启动类

```java
package cn.guardwhy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy // 开启网关路由
public class ZuulApplication_9527 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication_9527.class, args);
    }
}
```

5、启动项目，查看执行结果！！！

- 启动Eureka集群
- 启动springcloud-provider-dept-hystrix-8001服务提供模块
- 启动springcloud-zuul-9527路由模块
- 访问连接：[http://localhost:7001/](http://localhost:7001/)

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210524181444.png)

**测试结果**

不使用路由链接:  [http://localhost:8001/dept/get/2](http://localhost:8001/dept/get/2)

使用路由链接： [http://www.guardwhy.cn:9527/springcloud-provider-dept/dept/get/2](http://www.guardwhy.cn:9527/springcloud-provider-dept/dept/get/2)

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210524181859.png)

#### 8.1.3 路由访问映射

1、使用路由链接：[http://www.guardwhy.cn:9527/springcloud-provider-dept/dept/get/2](http://www.guardwhy.cn:9527/springcloud-provider-dept/dept/get/2)，用户如果这样访问，会直接暴露真实的微服务名称。

2、修改：springcloud-zuul-9527工程的`application.yml`配置，增加Zuul路由映射！！！

```yaml
server:
  port: 9527
  
#spring的相关配置
spring:
  application:
    name: springcloud-zuul

#Eureka的信息，服务注册到哪里
eureka:
  client:
    service-url:
      defaultZone: http://eureka7001.com:7001/eureka/,http://eureka7002.com:7002/eureka/,http://eureka7003.com:7003/eureka/
  instance:
    instance-id: zuul9527.com
    prefer-ip-address: true

#info 配置
info:
  app.name: guardwhy-springcloud
  company.name: www.guardwhy.cn
  build.artifactId: ${project.artifactId}
  build.version: ${project.version}

## zuul配置
zuul:
  routes:
    mydept.serviceId: springcloud-provider-dept
    mydept.path: /mydept/**
```

配置路由映射前链接: [http://www.guardwhy.cn:9527/springcloud-provider-dept/dept/get/2](http://www.guardwhy.cn:9527/springcloud-provider-dept/dept/get/2)

配置路由映射后链接: [http://www.guardwhy.cn:9527/mydept/dept/get/1](http://www.guardwhy.cn:9527/mydept/dept/get/1)

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210524195425.png)

3、现在访问原路径依旧可以访问，这不是我们所希望的。。。所以需要设置设置统一公共前缀。

```yaml
## zuul配置
zuul:
  routes:
    mydept.serviceId: springcloud-provider-dept
    mydept.path: /mydept/**
  ignored-services: "*" # 不能使用这个路径访问，ignored: 忽略，隐藏全部的
  prefix: /guardwhy
```

设置公共前缀访问链接: [http://www.guardwhy.cn:9527/guardwhy/mydept/dept/get/1](http://www.guardwhy.cn:9527/guardwhy/mydept/dept/get/1)，加上统一的前缀！`/guardwhy`,否则的话访问失败！！

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210524201157.png)

## 9- config分布式配置

### 9.1 配置中心应用场景

> **单体应用架构**

配置信息的管理、维护并不会显得特别麻烦，手动操作就可以，因为就一个工程。

> **微服务架构**

分布式集群环境中可能有很多个微服务，不可能一个一个去修改配置然后重启生效，在一定场景下需要在运行期间动态调整配置信息，比如：根据各个微服务的负载情况，动态调整数据源连接池大小，我们希望配置内容发生变化的时候，微服务可以自动更新。

**场景总结如下**：

- 集中配置管理，一个微服务架构中可能有成百上千个微服务，所以集中配置管理是很重要的。(一次修改、到处生效）。
- 不同环境不同配置，比如数据源配置在不同环境(开发dev,测试test,生产prod)中是不同的。
- 运行期间可动态调整。例如，可根据各个微服务的负载情况，动态调整数据源连接池大小等配置修改后可自动更新。
- 如配置内容发生变化，微服务可以自动更新配置，我们就需要对配置文件进行集中式管理，这也是分布式配置中心的作用。

### 9.2 什么是Config

Spring Cloud Config为微服务架构中的微服务提供集中化的外部配置支持，配置服务器为==各个不同的微服务应用==的所有环节提供了==一个中心化的外部配置==。

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210524223251.png)

Spring Cloud Config是一个分布式配置管理方案，包含了 Server端和 Client端两个部分。

**服务端也称为分布式配置中心**

它是一个独立的微服务应用，用来连接配置服务器并为客户端提供了获取配置信息，加密，解密信息等访问接口。

**客户端则是通过指定的配置中心来管理应用资源**，

以及与业务相关的配置内容，并在启动的时候从配置中心获取和加载配置信息。配置服务器默认采用git来存储配置信息 ，这样就有助于对环境配置进行版本管理。并且可以通过git客户端工具来方便的管理和访问配置内容。

### 9.3 Config 具体使用

1、SpringCloud config分布式配置中心能干啥？

- 集中管理配置文件。不同环境，不同配置，动态化的配置更新，分环境部署，比如 `/dev /test /release`。
- 运行期间动态调整配置，不再需要在每个服务部署的机器上编写配置文件，服务会向配置中心统一拉取配置自己的信息。
- 当配置发生变动时，服务不需要重启，即可感知到配置的变化，并且应用新的配置。将配置信息以REST接口的形式暴露。

2、SpringCloud config分布式配置中心与码云整合

由于SpringCloud Config 默认使用Git来存储配置文件，可以通过http/https访问的形式。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210525000556.png)

3、克隆到`springcloud-config`项目中，创建`application.yml`文件，推送到远端！！！

```yaml
spring:
  profiles:
    active: dev

--- 
spring:
  profiles: dev
  application:
    name: springcloud-config-dev

---
spring:
  profiles: test
  application:
    name: springcloud-config-test
```

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210525002851.png)

### 9.4 服务端连接Git配置

1、新建springcloud-config-server-3344(服务端工程)

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210525095840.png)

2、添加相关依赖

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <!--actuator完善监控信息-->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-actuator</artifactId>
    </dependency>
    <!--服务端-->
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-config-server</artifactId>
        <version>2.2.0.RELEASE</version>
    </dependency>
</dependencies>
```

3、配置`application.yml`文件。

```yaml
server:
  port: 3344
  
#spring的相关配置
spring:
  application:
    name: springcloud-config-server
  ## 连接远程仓库
  cloud:
    config:
      server:
        git:
          uri: https://gitee.com/guardwhy/springcloud-config.git
```

4、创建主启动类

```java
package cn.guardwhy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServer {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer.class, args);
    }
}
```

5、执行结果，远程连接：[http://localhost:3344/aplication-dev.yaml](http://localhost:3344/aplication-dev.yaml)

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210525100551.png)

### 9.5 客户端连接服务端访问

1、创建`config-client.yml`文件，推送到远端。

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210525125000.png" style="zoom:80%;" />

```yaml
spring:
  profiles:
    active: dev
---
server:
  port: 8201
  
#spring的相关配置
spring:
  profiles: dev
  application:
    name: springcloud-provider-dept

#Eureka的信息，服务注册到哪里
eureka:
  client:
    service-url:
      defaultZone: http://eureka7001.com:7001/eureka/
---
server:
  port: 8202
  
#spring的相关配置
spring:
  profiles: test
  application:
    name: springcloud-provider-dept

#Eureka的信息，服务注册到哪里
eureka:
  client:
    service-url:
      defaultZone: http://eureka7001.com:7001/eureka/
```

2、新建springcloud-config-client-3355(客户端工程)

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210525123642.png)

3、添加相关依赖

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <!--actuator完善监控信息-->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-actuator</artifactId>
    </dependency>
    <!--客户端-->
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-config</artifactId>
        <version>2.2.0.RELEASE</version>
    </dependency>
</dependencies>
```

4、配置`application.yml`文件。

```yaml
## 用户级别的配置
spring:
  application:
    name: springcloud-config-client-3355
```

5、配置`bootstrap.yml`文件

```yaml
# 系统级别的配置
spring:
  cloud:
    config:
      name: config-client # 需要从git上读取资源名称，不需要后缀
      profile: dev
      label: master
      uri: http://localhost:3344
```

6、对应的`controller`实现

```java
package cn.guardwhy.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {
    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServer;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    public String getConfig(){
        return "applicationName:" +applicationName +
        "eurekaServer:"+eurekaServer +
        "port:" + port;
    }
}
```

7、编写主启动类`ConfigClient`

```java
package cn.guardwhy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigClient {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClient.class, args);
    }
}
```

8、启动3344和3355模块，查看执行结果！！！

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/SpringMVC/Test4/20210525130126.png)





