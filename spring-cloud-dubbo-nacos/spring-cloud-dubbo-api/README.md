### 样例接口

```java
public interface UserService {

    boolean save(User user);

    boolean remove(Long userId);

    Collection<User> findAll();

    Page<User> findPage(Pageable pageable, Map params);
}

```
最主要的是实现Page。