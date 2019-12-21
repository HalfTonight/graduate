package ll.p3143.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class SkipController {

    @RequestMapping("/{other}")
    public String index(Map<String,Object> map, HttpServletRequest request, HttpSession session, @PathVariable("other") String other){

        return other;
    }

    @RequestMapping("/favicon.ico")
    @ResponseBody
    public String favicon(){
        return "";
    }
    @RequestMapping("pageHelper")
    @ResponseBody
    public String page(){
        return "page";
    }
}
