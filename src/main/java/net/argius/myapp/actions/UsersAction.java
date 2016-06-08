package net.argius.myapp.actions;

import java.util.List;
import net.argius.myapp.models.*;
import org.apache.struts2.convention.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.opensymphony.xwork2.ActionSupport;

public final class UsersAction {

    @Autowired
    private UserMapper userMapper;

    private String result;

    @Action(value = "/users", results = { @Result(location = "/WEB-INF/jsp/users.jsp") })
    public String showUsers() {
        List<User> users = userMapper.getAllUsers();
        setResult(String.format("result: users=%s", users));
        return ActionSupport.SUCCESS;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

}
