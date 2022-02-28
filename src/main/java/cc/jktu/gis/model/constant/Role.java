package cc.jktu.gis.model.constant;

import com.baomidou.mybatisplus.annotation.IEnum;

public enum Role implements IEnum<Integer> {
    ADMIN, NORMAL;

    public String toAuthorityString() {
        return "ROLE_" + name();
    }

    @Override
    public Integer getValue() {
        return ordinal();
    }

}