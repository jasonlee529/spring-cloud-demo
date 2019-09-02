package cn.lee.jason.api.service;

import cn.lee.jason.api.entity.User;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;
@Service()
public interface UserService {

    boolean save(User user);

    boolean remove(Long userId);

    List<User> findAll();

    Page<User> findPage(Pageable pageable, Map params);
}
