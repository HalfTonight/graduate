package ll.p3143.controller;

import ll.p3143.entity.Order;
import ll.p3143.service.OrderListService;
import ll.p3143.utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class OrderController {

    @Autowired
    OrderListService orderListService;

    @Autowired
    HttpServletRequest request;
    @Autowired
    Util util;

    @RequestMapping("/orderList")
    public String selAllOrder(Model model) {

        int pageNum = util.getPageNum();
        String num = util.getNum();
        String pname = util.getPname();
        String ptel = util.getPtel();
        List<Order> orders = orderListService.selAllOrder(pageNum, num, pname, ptel);
        model.addAttribute("orders", orders);
        util.addPageNum(model, pageNum);
        return "order_list";
    }

    @RequestMapping("/orderDetail")
    public String orderDetail(Model model, String orderNumber) {
        Order order = orderListService.selOne(orderNumber);
        model.addAttribute("order", order);
        return "/order_detail";

    }

    @RequestMapping("/orderDelete")

    public String deleteOrder(Model model,String orderNumber) {
        orderListService.delOne(orderNumber);
        return "forward:/orderList";
    }

}
