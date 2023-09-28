package com.zyx.libsys.service.impl;

import com.zyx.libsys.dao.QueryDao;
import com.zyx.libsys.domain.BookStatus;
import com.zyx.libsys.domain.Books;
import com.zyx.libsys.domain.BorrowingRecords;
import com.zyx.libsys.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class QueryServiceImpl implements QueryService
{
    @Autowired
    private QueryDao queryDao;

    @Override
    public Books selectByname(String title)
    {
        return queryDao.selectByname(title);
    }
    @Override
    public Books selectByauthor(String author){return queryDao.selectByauthor(author);}
    @Override
    public Books selectBynameAndauthor(String title,String author){return queryDao.selectBynameAndauthor(title,author);}
    @Override
    public Books selectByisbn(String isbn){return queryDao.selectByisbn(isbn);}
    @Override
    public Books selectBydate(String date){return queryDao.selectBydate(date);}
    @Override
    public List<Books> selectByclass(String className){return queryDao.selectByclass(className);}
    @Override
    public BookStatus selectStatus(String isbn){return queryDao.selectStatus(isbn);}
    @Override
    public List<BorrowingRecords> selectRecord(String isbn){return queryDao.selectRecord(isbn);}
}
