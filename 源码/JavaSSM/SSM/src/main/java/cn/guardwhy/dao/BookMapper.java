package cn.guardwhy.dao;

import cn.guardwhy.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    // 1.增加一个Book
    int addBook(Books book);
    // 2.根据id删除一个Book
    int deleteBookById(@Param("bookID")int id);
    // 3.更新Book
    int updateBook(Books books);
    // 4.根据id查询，返回一个Book
    Books queryBookById(@Param("bookID") int id);
    // 5.查询全部Book,返回list集合
    List<Books> queryAllBook();
    // 6.根据id 查询返回一个Book
    Books queryBookName( String bookName);
}
