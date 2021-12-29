package cn.guardwhy.controller;

import cn.guardwhy.dao.DepartmentDao;
import cn.guardwhy.dao.EmployeeDao;
import cn.guardwhy.pojo.Department;
import cn.guardwhy.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Collection;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    DepartmentDao departmentDao;

    @RequestMapping("/emps")
    public String list(Model model){
    // 1.获得所有员工
        Collection<Employee> employees = employeeDao.getAll();
        model.addAttribute("emps", employees);
        return "emp/list";
    }

    //2.员工添加页面
    @GetMapping("/emp")
    public String toAddpage(Model model){
        // 查询所有部门的信息
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("departments", departments);
        return "emp/add";
    }

    // 3.员工添加功能
    @PostMapping("/emp")
    public String addEmp(Employee employee){
        // 3.1调用底层方法保存员工信息
        employeeDao.add(employee);
        // 3.2 返回员工列表页面
        return "redirect:/emps";
    }

    // 4、员工修改页面
    @GetMapping("/emp/{id}")
    public String toUpdateEmp(@PathVariable("id") Integer id, Model model){
        // 4.1 查出原来的数据
        Employee employee = employeeDao.getEmployeeById(id);
        model.addAttribute("emp", employee);
        // 4.2 查出所有部门的信息
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("departments", departments);
        // 4.3 返回数据
        return "emp/update";
    }

    // 5.回到员工列表页面
    @PostMapping("/updateEmp")
    public String updateEmp(Employee employee){
        // 5.1 添加操作
        employeeDao.add(employee);
        return "redirect:/emps";
    }

    // 6.删除员工
    @GetMapping("/delemp/{id}")
    public String deleteEmp(@PathVariable("id")int id){
        // 调用底层
        employeeDao.delete(id);
        return "redirect:/emps";
    }

    // 7.注销用户
    @RequestMapping("/user/logout")
    public String logout(HttpSession session){
        // 7.1 注销
        session.invalidate();
        // 7.2 返回到首页
        return "redirect:/index.html";
    }
}
