package com.zyx.libsys.service;

import com.zyx.libsys.domain.Users;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserService {

    /**
     * 根据user_id查询
     * @param user_id
     * @param password
     * @return
     */
    public Users login(Integer user_id, String password);
}
