package ll.p3143.mapper;

import ll.p3143.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMappper {

    List<Product> selAllProduct(int pageNum,String productName,String mPrice, String isHotSell);
}
