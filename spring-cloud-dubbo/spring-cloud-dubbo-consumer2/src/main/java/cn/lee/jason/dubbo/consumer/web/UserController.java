package cn.lee.jason.dubbo.consumer.web;

import cn.lee.jason.dubbo.api.entity.User;
import cn.lee.jason.dubbo.api.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController {
    @Reference(version = "1.j")
    private UserService userService;


    @PutMapping()
    public boolean save(@RequestBody User user) {
        userService.save(user);
        return true;
    }

    @DeleteMapping("{userId}")
    public boolean remove(@PathVariable Long userId) {
        userService.remove(userId);
        return true;
    }

    @GetMapping("list")
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("page")
    public Page<User> findPage(HttpServletRequest request) {
        PageRequest pageable = PageRequest.of(1, 10);
        Map params = WebUtils.getParametersStartingWith(request, "");
        return userService.findPage(pageable, params);
    }


}