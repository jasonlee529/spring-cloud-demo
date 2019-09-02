package cn.lee.jason.dubbo.provider.service;

import cn.lee.jason.api.entity.User;
import cn.lee.jason.api.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService {

    public boolean save(User user) {
        return false;
    }

    public boolean remove(Long aLong) {
        return false;
    }

    public List<User> findAll() {
        List<User> userList = new ArrayList<User>() {{
            this.add(new User(1L, "abc"));
            this.add(new User(2L, "efg"));
        }};
        return userList;
    }

    public Page<User> findPage(Pageable pageable, Map map) {
        List<User> userList = findAll();
        Page<User> page = new PageImpl<User>(userList, pageable, 2L);
        return page;
    }

}
