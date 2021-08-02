package com.lovecoding.vo;

import com.lovecoding.pojo.UmsUser;

import java.util.List;

public class QueryVo {

    private UmsUser umsUser;

    private List<Integer> ids;


    public UmsUser getUmsUser() {
        return umsUser;
    }

    public void setUmsUser(UmsUser umsUser) {
        this.umsUser = umsUser;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }
}
