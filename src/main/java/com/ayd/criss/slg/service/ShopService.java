package com.ayd.criss.slg.service;

import com.ayd.criss.slg.entity.Shop;

/**
 * Created by Administrator on 2017/5/26.
 * 商品操作service接口
 */
public interface ShopService {
    /**
     * 新增商品，状态为上架
     * */
    public Integer addShop(Shop shop);
}
