package com.ayd.criss.slg.service;

import com.ayd.criss.slg.entity.Shop;

import java.util.List;

/**
 * Created by Administrator on 2017/5/26.
 * 商品操作service接口
 */
public interface ShopService {
    /**
     * 新增商品，状态为上架
     * @param shop ：商品，需要添加的商品
     * */
    public Integer addShop(Shop shop);


    /**
     * 下架商品，将指定商品id 的商品的状态改为下架
     * @param shopId : 需要下架的商品id
     * */
    public void soldOutShop(Integer shopId);


    /**
     * 修改商品,用指定的shop替换数据库已存在的shop
     * @param shop : 商品，需要修改的商品
     * */
    public void updateShop(Shop shop);


    /**
     * 查询所有的商品
     * @return 返回所有的商品的集合,List<shop>
     * */
    public List<Shop> queryAllShops();

    /**
     * 根据上架时间正序查询
     * @return 返回排序的商品的集合
     * */
    public List<Shop> queryAllShopsSortFromInsertDateASC();


    /**
     * 根据上架时间反序查询
     * @return 返回排序的商品的集合
     * */
    public List<Shop> queryAllShopsSortFromInsertDateDESC();



    /**
     * 根据用户查看量正序
     * */
    public List<Shop> queryAllShopsSortFromUserLookASC();

    /**
     * 根据用户查看量倒序
     * */
    public List<Shop> queryAllShopsSortFromUserLookDESC();


    /**
     * 根据价格正序
     * */
    public List<Shop> queryAllShopsSortFromPriceASC();

    /**
     * 根据价格倒序
     * */
    public List<Shop> queryAllShopsSortFromPriceDESC();



}
