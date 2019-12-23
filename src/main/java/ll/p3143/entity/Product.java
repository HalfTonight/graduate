package ll.p3143.entity;

import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class Product implements Serializable {
    private int id;             //自增主键

    private String brand;       //品牌

    private String classify;    //分类

    private String recommend;    //推荐

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

    public Product(int id, String brand, String classify, String recommend, String thumbnail, String productName, int itemNo,
                   int price, String units, int isBoutique, int isNewProduct, int isHotSell, int repertory) {
        this.id = id;
        this.brand = brand;
        this.classify = classify;
        this.recommend = recommend;
        this.thumbnail = thumbnail;
        this.productName = productName;
        this.itemNo = itemNo;
        this.price = price;
        this.units = units;
        this.isBoutique = isBoutique;
        this.isNewProduct = isNewProduct;
        this.isHotSell = isHotSell;
        this.repertory = repertory;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
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
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", classify='" + classify + '\'' +
                ", recommend='" + recommend + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", productName='" + productName + '\'' +
                ", itemNo=" + itemNo +
                ", price=" + price +
                ", units='" + units + '\'' +
                ", isBoutique=" + isBoutique +
                ", isNewProduct=" + isNewProduct +
                ", isHotSell=" + isHotSell +
                ", repertory=" + repertory +
                '}';
    }
}
