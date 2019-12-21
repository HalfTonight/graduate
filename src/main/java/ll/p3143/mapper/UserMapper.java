package ll.p3143.mapper;

import ll.p3143.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> selAllUser(int pageNum ,String memberAccount,String phoneNumber,String email);
}
