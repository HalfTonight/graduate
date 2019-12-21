package ll.p3143.entity;

import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class Product implements Serializable {

    private String thumbnail;   //缩略图

    private String productName; //产品名称

    private int itemNo;      //货号

    private int price;       //单价

    private String units;          //单位

    private int isBoutique;     //是否精品

    private int isNewProduct;   //是否新品

    private int isHotSell;   //是否热销

    private int repertory;   //库存

    public Product() {
    }

    public Product(String thumbnail, String productName, int itemNo, int price, String units,
                   int isBoutique, int isNewProduct, int isHotSell, int repertory) {
        this.thumbnail = thumbnail;
        this.productName = productName;

        this.isHotSell = isHotSell;
        this.repertory = repertory;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getItemNo() {
        return itemNo;
    }

    public void setItemNo(int itemNo) {
        this.itemNo = itemNo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public int getIsBoutique() {
        return isBoutique;
    }

    public void setIsBoutique(int isBoutique) {
        this.isBoutique = isBoutique;
    }

    public int getIsNewProduct() {
        return isNewProduct;
    }

    public void setIsNewProduct(int isNewProduct) {
        this.isNewProduct = isNewProduct;
    }

    public int getIsHotSell() {
        return isHotSell;
    }

    public void setIsHotSell(int isHotSell) {
        this.isHotSell = isHotSell;
    }

    public int getRepertory() {
        return repertory;
    }

    public void setRepertory(int repertory) {
        this.repertory = repertory;
    }

    @Override
    public String toString() {
        return "Product{" +
                "thumbnail='" + thumbnail + '\'' +
                ", productName='" + productName + '\'' +
                ", itemNo='" + itemNo + '\'' +
                ", price=" + price +
                ", units='" + units + '\'' +
                ", isBoutique=" + isBoutique +
                ", isNewProduct=" + isNewProduct +
                ", isHotSell='" + isHotSell +
                ", repertory='" + repertory + '\'' +
                '}';
    }
}
