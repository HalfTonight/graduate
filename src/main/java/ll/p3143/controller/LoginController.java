package ll.p3143.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;


@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login()
    {
        System.out.println();
        return "login";
    }

    @RequestMapping("/myIndex")
    public String index(Map<String,Object> map, HttpServletRequest request, HttpSession session){
        ModelAndView mv=new ModelAndView();
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if("admin".equals(username)&&"970215".equals(password)){
            session.setAttribute("loginUser",username);
            return "index";

        }else{
            map.put("msg","用户名或密码错误");
            return "login";
        }
    }


}
