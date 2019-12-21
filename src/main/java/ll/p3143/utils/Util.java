package ll.p3143.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;


import javax.servlet.http.HttpServletRequest;
@Service
public class Util {
    @Autowired
    HttpServletRequest request;

    public int getPageNum() {
        String pageNumStr = request.getParameter("pageNum");
        int pageNum = 0;
        if (pageNumStr != null) {
            pageNum = Integer.parseInt(pageNumStr);
        }
        return pageNum;
    }
    //Order
    public String getNum(){
        String num = request.getParameter("num");
        return num;
    };
    public String getPname(){
        String pname = request.getParameter("pname");
        return pname;
    };
    public String getPtel(){
        String ptel = request.getParameter("ptel");
        return ptel;
    };
    //Product
    public String getProductName(){
        String productName = request.getParameter("qProductName");
        return productName;
    };
    public String getMPrice(){
        String mPrice = request.getParameter("qMPrice");
        return mPrice;
    };
    public String getIsHotSell(){
        String isHotSell = request.getParameter("qIsHotSell");
        return isHotSell;
    };

    //User
    public String getMemberAccount(){
        String memberAccount = request.getParameter("memberAccount");
        return memberAccount;
    };

    public String getPhoneNumber(){
        String phoneNumber = request.getParameter("phoneNumber");
        return phoneNumber;
    };

    public String getEmail(){
        String email = request.getParameter("email");
        return email;
    };


    public void addPageNum(Model model, int pageNum){
        model.addAttribute("pageNum",pageNum);
    }

}
