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
