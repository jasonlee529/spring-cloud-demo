package cn.lee.jason.dubbo.api.service;

import cn.lee.jason.dubbo.api.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UserService {

    boolean save(User user);

    boolean remove(Long userId);

    List<User> findAll();

    Page<User> findPage(PageRequest pageable, Map params);
}
