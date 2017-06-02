package com.ayd.criss.slg.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Administrator on 2017/5/26.
 * 商品状态
 */
@Entity
public class ShopState {

    private Integer stateId; //状态id
    private String stateName;//状态说明
    private List<Shop> shops; //商品列表  状态分类


    @Id
    @GeneratedValue
    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }


    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    @OneToMany
    @JoinColumn
    public List<Shop> getShops() {
        return shops;
    }

    public void setShops(List<Shop> shops) {
        this.shops = shops;
    }
}
