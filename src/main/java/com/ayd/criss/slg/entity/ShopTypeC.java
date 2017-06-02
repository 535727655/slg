package com.ayd.criss.slg.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Administrator on 2017/5/26.
 * 商品类型
 */
@Entity
public class ShopTypeC {

    private Integer typeId; //类型id
    private String typeName; //类型名称
    private List<Shop> shops; //商品


    @Id
    @GeneratedValue
    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }


    public void setTypeName(String typeName) {
        this.typeName = typeName;
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
