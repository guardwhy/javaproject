package cn.guardwhy.service.impl;

import cn.guardwhy.dao.BookMapper;
import cn.guardwhy.pojo.Books;
import cn.guardwhy.service.BookService;

import java.util.List;
/*
* 业务层实现类
*/
public class BookServiceImpl implements BookService {
    // 1.调用Dao层
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    @Override
    public Books queryBookName(String bookName) {
        return bookMapper.queryBookName(bookName);
    }
}
