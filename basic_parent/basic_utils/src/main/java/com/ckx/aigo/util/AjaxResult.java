package com.ckx.aigo.util;

public class AjaxResult {

    private  boolean success = true;

    private  String message = "成功";

    private  Object resultobj;

    public String getMessage() {
        return message;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public boolean getSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return  this;
    }

    public Object getResultobj() {
        return resultobj;
    }

    public AjaxResult setResultobj(Object resultobj) {
        this.resultobj = resultobj;
        return this;
    }

    public static AjaxResult me(){
        return new AjaxResult();
    }
}
