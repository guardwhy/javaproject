package cn.guardwhy.controller;

import cn.guardwhy.pojo.Books;
import cn.guardwhy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("BookServiceImpl")
    // 调用service层
    private BookService bookService;

    // 查询全部的书籍,并且返回到一个书籍展示页面
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list",list);
        return "allBook";
    }
    // 3.跳转到增加书籍页面
    @RequestMapping("/toAddBook")
    public String toAddPaper(){
        return "addBook";
    }
    // 4.添加书籍的请求
    @RequestMapping("/addBook")
    public String addBook(Books books){
        System.out.println("addBook=>" + books);
        bookService.addBook(books);
        return "redirect:/book/allBook"; // 重定向到的@RequestMapping("/allBook")请求。
    }

    // 5.跳转到修改页面
    @RequestMapping("/toUpdate")
    public String toUpdatePaper(int id, Model model){
        Books books = bookService.queryBookById(id);
        model.addAttribute("QBook", books);
        return "updateBook";
    }
    // 6.修改书籍操作
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        System.out.println("updateBook=>" + books);
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }

    // 7.删除书籍
    @RequestMapping("/deleteBook")
    public String deleteBook(int id){
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }

    // 8.查询功能
    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName, Model model){
        System.out.println("要查询的书籍:"+queryBookName);
        Books books = bookService.queryBookName(queryBookName);
        System.err.println("queryBook=>" + books);
        // 遍历
        List<Books> list = new ArrayList<>();
        list.add(books);
        // 如果没有查出来书籍，则返回全部书籍列表
        if(books==null){
            list = bookService.queryAllBook();
            model.addAttribute("error","未搜索到");
        }
        model.addAttribute("list", list);
        return "allBook";
    }
}
