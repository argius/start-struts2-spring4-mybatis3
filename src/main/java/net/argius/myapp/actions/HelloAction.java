package net.argius.myapp.actions;

import org.apache.struts2.convention.annotation.*;
import com.opensymphony.xwork2.ActionSupport;

public final class HelloAction {

    private String message;

    @Action(value = "/hello", results = { @Result(location = "/WEB-INF/jsp/hello.jsp") })
    public String hello() {
        setMessage("hello!");
        return ActionSupport.SUCCESS;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
