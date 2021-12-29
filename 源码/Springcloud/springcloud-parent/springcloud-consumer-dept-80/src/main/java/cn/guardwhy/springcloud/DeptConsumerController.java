package cn.guardwhy.springcloud;

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
    // 1.Ribbon，这里的地址。应该是一个变量，通过服务名来访问。
    private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-DEPT";

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
