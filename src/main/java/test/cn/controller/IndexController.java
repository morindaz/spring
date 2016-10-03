package test.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 69059 on 2016/10/3.
 */
@Controller
@RequestMapping
public class IndexController {
    @RequestMapping(value = "submit",method = RequestMethod.POST)
    public String home(){
        return ("submit");
    }

    @RequestMapping(value="logintwice",method = RequestMethod.POST)
    public ModelAndView submitinfo(@RequestParam String username, @RequestParam String password){
        ModelAndView userinfo =new ModelAndView();
        if(username.equals("maoshunyi")&&password.equals("123")) {

            userinfo.addObject("username",username);
            userinfo.addObject("password",password);
            userinfo.setViewName("result");
        }
        else 
        userinfo.setViewName( "submit");
        return userinfo;
    }


}
