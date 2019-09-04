package cn.lee.jason.dubbo.provider.service;

import cn.lee.jason.dubbo.api.entity.User;
import cn.lee.jason.dubbo.api.service.UserService;
import cn.lee.jason.dubbo.api.util.PageDefault;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service(version = "1.0")
public class UserServiceImpl implements UserService {
    public User save(Long id, String name) {
        User user = new User(id, name);
        return user;
    }

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

    public Page<User> findPage(Pageable pageable) {
        List<User> userList = findAll();
        Page<User> page = new PageImpl<User>(userList, pageable, 2L);
        return page;
    }

    public Page<User> findPage(Map params) {
        List<User> userList = findAll();
        Page<User> page = new PageImpl<User>(userList, new PageDefault(), 2L);
        return page;
    }
}
