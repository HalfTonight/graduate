package ll.p3143.controller;

import ll.p3143.entity.User;
import ll.p3143.service.UserListService;
import ll.p3143.utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserListService userListService;

    @Autowired
    Util util;
    @RequestMapping("/userList")
    public String selUsers(Model model){
        int pageNum = util.getPageNum();
        String phoneNumber = util.getPhoneNumber();
        String memberAccount = util.getMemberAccount();
        String email = util.getEmail();
        List<User> users = userListService.selAllUser(pageNum,memberAccount,phoneNumber,email);
        model.addAttribute("users",users);
        util.addPageNum(model,pageNum);
        return "user_list";
    }
}
