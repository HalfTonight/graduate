package ll.p3143.controller;

import ll.p3143.entity.Product;
import ll.p3143.utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@Service
public class SaveProduct {
    @Autowired
    Product pro;
    @Autowired
    Util util;
    @Autowired
    HttpServletRequest req;
    @RequestMapping("/saveProduct")
    public String saveProduct(HttpServletRequest req, Product product, Model model) {
        pro=product;
        String isBoutiqueBtn = req.getParameter("isBoutiqueBtn");
        String isNewProductBtn = req.getParameter("isNewProductBtn");
        String isHotSellBtn = req.getParameter("isHotSellBtn");

        if (isBoutiqueBtn != null && isBoutiqueBtn.equals("on")) {
            pro.setIsBoutique(1);
        } else {
            pro.setIsBoutique(0);
        }
        if (isHotSellBtn != null && isHotSellBtn.equals("on")) {
            pro.setIsHotSell(1);
        } else {
            pro.setIsHotSell(0);
        }
        if (isNewProductBtn != null && isNewProductBtn.equals("on")) {
            pro.setIsNewProduct(1);
        } else {
            pro.setIsNewProduct(0);
        }

        return "forward:/ProductList";
    }
    public Product getProduct()
    {


        return pro;
    }


}
