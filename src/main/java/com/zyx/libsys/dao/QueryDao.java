package com.zyx.libsys.dao;
import com.zyx.libsys.domain.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

@Mapper
public interface QueryDao
{
    @Select("select * from books where title=#{title}")
    public Books selectByname(String title);//根据书名检索书籍
    @Select("select * from books where author=#{author}")
    public Books selectByauthor(String author);//根据作者名检索书籍
    @Select("select * from books where title=#{title} and author=#{author}")
    public Books selectBynameAndauthor(String title,String author);//根据书名和作者检索书籍
    @Select("select * from books where isbn=#{isbn}")//根据isbn检索书籍
    public Books selectByisbn(String isbn);
    @Select("select * from books where publication_date=#{date}")//根据出版日期检索书籍
    public Books selectBydate(String date);
    @Select("select * from books a,bookcategories b where a.category_id=b.category_id and category_name=#{className}")//根据分类名称检索书籍
    public List<Books> selectByclass(String className);
    @Select("select * from books a,bookstatus b where a.book_id=b.book_id and isbn=#{isbn}")//根据isbn号检索图书的状态，1表示借出，0表示没有借出
    public BookStatus selectStatus(String isbn);
    @Select("select * from borrowingrecords where book_id=(select book_id from books where isbn=#{isbn})")//根据isbn号查询某个书籍所有的借阅记录
    public List<BorrowingRecords> selectRecord(String isbn);
}
