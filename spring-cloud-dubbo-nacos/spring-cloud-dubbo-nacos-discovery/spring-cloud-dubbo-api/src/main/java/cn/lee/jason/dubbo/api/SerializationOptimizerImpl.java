package cn.lee.jason.dubbo.api;

import cn.lee.jason.dubbo.api.entity.User;
import cn.lee.jason.dubbo.api.util.PageDefault;
import org.apache.dubbo.common.serialize.support.SerializationOptimizer;
import org.springframework.data.domain.PageImpl;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class SerializationOptimizerImpl implements SerializationOptimizer {

    public Collection<Class> getSerializableClasses() {
        List<Class> classes = new LinkedList<Class>();
        classes.add(PageImpl.class);
        classes.add(User.class);
        classes.add(PageDefault.class);
        return classes;
    }
}
