package com.ayd.criss.slg.dao;

import com.ayd.criss.slg.entity.Shop;

import java.util.List;

/**
 * Created by Administrator on 2017/5/26.
 * 商品操作接口
 */
public interface ShopDao {
    /**
     * 添加一个商品
     * */
    public Integer addShop(Shop shop);

    /**
     * 修改商品信息
     * */
    public void updateShop(Shop shop);

    /**
     * 删除 (一般不用)
     * */
    public void deleteShop(Shop shop);

    /**
     * 查询全部
     * */
    public List<Shop> queryAll();

    /**
     * 根据id查询
     * */
    public Shop queryShopFromShopId(Integer shopId);

    /**
     * 根据名字模糊查询
     * */
    public List<Shop> queryShopLikeName(String shopName);

}
