package cn.guardwhy.springcloud;

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
        return new Dept().setDeptno(id).setDname("该id："+id+"没有对应的信息，null--@hystrixGet").setDb_source("no this database in MySQL");
    }
}
