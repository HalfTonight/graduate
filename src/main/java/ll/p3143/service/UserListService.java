package ll.p3143.service;

import ll.p3143.entity.User;

import ll.p3143.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserListService {

    @Autowired
    UserMapper userMappper;
    public List<User> selAllUser(int pageNum ,String memberAccount,String phoneNumber,String email){

        List<User> users = userMappper.selAllUser(pageNum,memberAccount,phoneNumber,email);
        return users;
    }
}
