package ll.p3143.service;

import ll.p3143.entity.Product;
import ll.p3143.mapper.ProductMappper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductListService {
    @Autowired
    ProductMappper productMappper;
    public List<Product> sellAll(int pageNum,String productName,String mPrice, String isHotSell){

        List<Product> list = productMappper.selAllProduct(pageNum,productName,mPrice,isHotSell);
        return list ;
    }
    public void delProduct(String productName){
        productMappper.delProductByProductName(productName);

    }
}
