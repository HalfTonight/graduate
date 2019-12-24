package ll.p3143.controller;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import ll.p3143.entity.Product;
import ll.p3143.service.ProductListService;
import ll.p3143.utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class ProductController {
    @Autowired
    ProductListService productListService;
    @Autowired
    Util util;
    @Autowired
    SaveProduct saveProduct;

    @RequestMapping("/productList")
    public String productList(Model model, HttpServletRequest req) {
        Product newProduct = saveProduct.getProduct();
        String isHotSell = util.getIsHotSell();
        System.out.println(isHotSell);
        String mPrice = util.getMPrice();
        String productName = util.getProductName();
        int pageNum = util.getPageNum();
        List<Product> products = productListService.sellAll(pageNum, productName, mPrice, isHotSell);
        model.addAttribute("products", products);
        util.addPageNum(model, pageNum);
        return "product_list";
    }



    @RequestMapping("/deleteProduct")
    public String delProduct(String productName) {
        productListService.delProduct(productName);
        return "forward:/productList";
    }

    @RequestMapping("/updateProduct")
    public String updProduct(Model model, String productName) {
        Product product = productListService.selProduct(productName);
        model.addAttribute("product", product);
        System.out.println(product.getClassify());
        return "/product_detail";
    }
}
