package cn.lee.jason.api.service;

import cn.lee.jason.api.entity.User;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.Collection;
import java.util.Map;

public interface UserService {

    boolean save(User user);

    boolean remove(Long userId);

    Collection<User> findAll();

    Page<User> findPage(Pageable pageable, Map params);
}
