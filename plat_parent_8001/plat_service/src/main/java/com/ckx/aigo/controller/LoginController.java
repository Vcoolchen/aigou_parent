package com.ckx.aigo.controller;

import com.ckx.aigo.domain.Employee;
import com.ckx.aigo.util.AjaxResult;
import org.springframework.web.bind.annotation.*;

@RestController()
public class LoginController {

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        if ("陈柯希".equals(employee.getUsername())&&"123456".equals(employee.getPassword()))
            return AjaxResult.me();
        return AjaxResult.me().setSuccess(false).setMessage("登录失败");
    }

    @RequestMapping(value = "login02",method = RequestMethod.GET)
    @ResponseBody
    public AjaxResult login02(@RequestParam String username){
        System.out.println(username);
        return  AjaxResult.me().setSuccess(false).setMessage("获取到前端数据，验证失败了").setResultobj("奈斯");
    }
}
