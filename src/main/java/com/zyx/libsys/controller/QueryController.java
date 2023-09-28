package com.zyx.libsys.controller;

import com.zyx.libsys.domain.BookStatus;
import com.zyx.libsys.domain.Books;
import com.zyx.libsys.domain.BorrowingRecords;
import com.zyx.libsys.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/select")
public class QueryController {
    @Autowired
    private QueryService queryService;

    @GetMapping("/title/{title}")
    public Result selectByname(@PathVariable String title)
    {
        Books books=queryService.selectByname(title);
        Integer code=books != null ? Code.GET_OK:Code.GET_ERR;
        String message=books != null ? "":"您查找的这本书不存在！";
        return new Result(code,books,message);
    }

    @GetMapping("/author/{author}")
    public Result selectByauthor(@PathVariable String author)
    {
        Books books=queryService.selectByauthor(author);
        Integer code=books !=null ? Code.GET_OK : Code.GET_ERR;
        String message=books !=null ?"":"您查找的作者不存在！";
        return new Result(code,books,message);
    }
    @GetMapping("/{title}/{author}")
    public Result selectBynameAndauthor(@PathVariable String title,@PathVariable String author)
    {
        Books books=queryService.selectBynameAndauthor(title,author);
        Integer code=books !=null ? Code.GET_OK :Code.GET_ERR;
        String message=books!=null ? "":"您输入的信息有误，请重新输入!";
        return new Result(code,books,message);
    }
    @GetMapping("/isbn/{isbn}")
    public Result selectByisbn(@PathVariable String isbn)
    {
        Books books=queryService.selectByisbn(isbn);
        Integer code=books!= null ? Code.GET_OK:Code.GET_ERR;
        String message= books!=null ?"":"您输入的isbn号有误,请重新输入！";
        return new Result(code,books,message);
    }
    @GetMapping("/date/{date}")
    public Result selectBydate(@PathVariable String date)
    {
        Books books=queryService.selectBydate(date);
        Integer code=books!=null ? Code.GET_OK: Code.GET_ERR;
        String message=books!= null ?"":"您输入的日期有误,请重新输入!";
        return new Result(code,books,message);
    }
    @GetMapping("/className/{className}")
    public Result selectByclass(@PathVariable String className)
    {
        List<Books> books=queryService.selectByclass(className);
        Integer code=books!=null ?Code.GET_OK:Code.GET_ERR;
        String message=books!=null ?"":"没有这种种类的图书,请重新输入!";
        return new Result(code,books,message);
    }
    @GetMapping("/status/{isbn}")
    public Result selectStatus(String isbn)
    {
        BookStatus stat=queryService.selectStatus(isbn);
        Integer code=stat!=null ?Code.GET_OK:Code.GET_ERR;
        String message=stat!=null ?"":"查询不到图书当前状态！";
        return new Result(code,stat,message);
    }
    @GetMapping("/borrow/{isbn}")
    public Result selectRecord(String isbn)
    {
        List<BorrowingRecords> records=queryService.selectRecord(isbn);
        Integer code=records!=null ?Code.GET_OK:Code.GET_ERR;
        String message=records!=null ?"":"当前图书没有借阅记录！";
        return new Result(code,records,message);
    }

}
