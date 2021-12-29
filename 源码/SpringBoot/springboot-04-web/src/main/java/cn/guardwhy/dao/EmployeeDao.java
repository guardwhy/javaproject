package cn.guardwhy.dao;

import cn.guardwhy.pojo.Department;
import cn.guardwhy.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeDao {
    // 1.模拟数据库中的数据
    private static Map<Integer, Employee> employees = null;
    // 2.员工有所属的部门
    @Autowired
    private DepartmentDao departmentDao;
    static {
        // 3.创建一个员工表
        employees = new HashMap<Integer, Employee>();
        employees.put(1001, new Employee(1001, "kobe","1234678@qq.com", 1, new Department(101,"后勤部")));
        employees.put(1002, new Employee(1002, "james","1234678@qq.com", 1, new Department(102,"市场部")));
        employees.put(1003, new Employee(1003, "xiao hong","1234678@qq.com", 0, new Department(103,"教学部")));
        employees.put(1004, new Employee(1004, "harden","1234678@qq.com", 1, new Department(104,"运营部")));
        employees.put(1005, new Employee(1005, "guardwhy","1234678@qq.com", 1, new Department(105,"教研部")));
    }
    // 3.主键自增
    private static Integer initId = 1006;
    // 4.增加一个员工
    public void add(Employee employee){
        // 条件判断
        if(employee.getId() == null){
            employee.setId(initId++);
        }
        employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));
        employees.put(employee.getId(), employee);
    }
    // 5.查询全部员工的信息
    public Collection<Employee> getAll(){
        return employees.values();
    }
    // 6.通过id查询员工
    public Employee getEmployeeById(Integer id){
        return employees.get(id);
    }
    // 7.通过id删除员工
    public void delete(Integer id){
        employees.remove(id);
    }
}
