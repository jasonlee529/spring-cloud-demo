package cn.lee.jason.dubbo.api.service;

import cn.lee.jason.dubbo.api.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

public interface UserService {

    boolean save(User user);

    User save(Long id, String name);

    boolean remove(Long userId);

    List<User> findAll();

    Page<User> findPage(Pageable pageable, Map params);

    Page<User> findPage(Pageable pageable);

    Page<User> findPage(Map params);
}
