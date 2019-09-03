package cn.lee.jason.dubbo.api.util;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.Optional;

public class PageDefault extends PageRequest implements Pageable {

    public PageDefault() {
        super(0,10);
    }

    public boolean isPaged() {
        return false;
    }

    public boolean isUnpaged() {
        return false;
    }

    public Sort getSortOr(Sort sort) {
        return null;
    }

    public Optional<Pageable> toOptional() {
        return Optional.empty();
    }

}
