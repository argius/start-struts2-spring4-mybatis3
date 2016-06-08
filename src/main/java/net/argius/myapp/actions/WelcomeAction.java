package net.argius.myapp.actions;

import java.util.*;
import net.argius.myapp.services.*;
import org.apache.struts2.convention.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import com.opensymphony.xwork2.ActionSupport;

public final class WelcomeAction {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    @Qualifier("plus")
    private MyCalcComponent calcPlus;

    @Autowired
    @Qualifier("minus")
    private MyCalcComponent calcMinus;

    @Autowired
    private MyMessageService messageService;

    private String result;

    @Action(value = "/welcome", results = { @Result(location = "/WEB-INF/jsp/welcome.jsp") })
    public String welcome() {
        List<Map<String, Object>> usersData = jdbcTemplate.queryForList("select * from users");
        setResult(String.format(
            "users: %s, calc-plus: %s, calc-minus: %s, messageService: %s",
            usersData,
            calcPlus.calculate(3, 5),
            calcMinus.calculate(3, 5),
            messageService.getMessage()));
        return ActionSupport.SUCCESS;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

}
