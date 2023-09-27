package com.zyx.libsys.service.impl;

import com.zyx.libsys.controller.Code;
import com.zyx.libsys.dao.UserDao;
import com.zyx.libsys.domain.Users;
import com.zyx.libsys.exception.BusinessException;
import com.zyx.libsys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public Users login(Integer user_id, String password) {

        if (user_id < 0){
            throw new BusinessException(Code.BUSINESS_ERR, "非法数据!");
        }

        return userDao.login(user_id, password);
    }
}
