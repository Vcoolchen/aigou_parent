package com.ckx.aigo.query;

import com.ckx.aigo.util.AjaxResult;

public class BaseQuery {

    public static void main(String[] args) {
        //链式编程
        AjaxResult.me().setSuccess(false).setMessage("失败;").setResultobj(new Object());

        System.out.println(AjaxResult.me().setSuccess(false).setMessage("失败;").setResultobj(new Object()).getSuccess());
    }
}
