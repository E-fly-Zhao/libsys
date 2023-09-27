package com.zyx.libsys.controller;

import com.zyx.libsys.domain.Users;
import com.zyx.libsys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
// TODO @CrossOrigin(origins = "*")配置能够使外部页面访问该接口
@CrossOrigin(origins = "*")
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{user_id}/{password}")
    public Result getByUserId(@PathVariable Integer user_id, @PathVariable String password) {
        Users users = userService.login(user_id, password);
        Integer code = users != null ? Code.GET_OK : Code.GET_ERR;
        String message = users != null ? "" : "数据查询失败，请重试！";
        return new Result(code, users, message);
    }
}
