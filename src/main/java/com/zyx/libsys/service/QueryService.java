package com.zyx.libsys.service;

import com.zyx.libsys.domain.BookStatus;
import com.zyx.libsys.domain.Books;
import com.zyx.libsys.domain.BorrowingRecords;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Transactional
public interface QueryService {
    //根据书名检索书籍
    public Books selectByname(String title);
    //根据作者名检索书籍
    public Books selectByauthor(String author);
    //根据书名和作者名一起检索书籍
    public Books selectBynameAndauthor(String title,String author);
    //根据isbn号检索书籍
    public Books selectByisbn(String isbn);
    //根据出版日期检索书籍
    public Books selectBydate(String date);
    //根据分类名称检索书籍
    public List<Books> selectByclass(String className);
    //根据书籍名称以及isbn检索书籍的状态
    public BookStatus selectStatus(String isbn);
    //根据isbn号查询图书的借阅记录
    public List<BorrowingRecords> selectRecord(String isbn);


}
