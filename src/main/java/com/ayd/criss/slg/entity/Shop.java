package com.ayd.criss.slg.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Administrator on 2017/5/26.
 * 商品类
 *
 */
@Entity
public class Shop {

    private Integer shopId; //商品id
    private String shopName; //商品名
    private String shopTitle; //标题
    private Float shopPrice; //商品单价
    private ShopTypeC shopType; //商品类型
    private ShopDetails shopDetails;//商品详情
    private ShopState shopState; //商品状态
    private Date insertDate;//插入时间
    private Date updateDate;//最后修改时间


    @Id
    @GeneratedValue
    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopTitle() {
        return shopTitle;
    }

    public void setShopTitle(String shopTitle) {
        this.shopTitle = shopTitle;
    }

    public Float getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(Float shopPrice) {
        this.shopPrice = shopPrice;
    }

    @ManyToOne
    @JoinColumn
    public ShopTypeC getShopType() {
        return shopType;
    }

    public void setShopType(ShopTypeC shopType) {
        this.shopType = shopType;
    }

    @OneToOne
    @JoinColumn
    public ShopDetails getShopDetails() {
        return shopDetails;
    }

    public void setShopDetails(ShopDetails shopDetails) {
        this.shopDetails = shopDetails;
    }

    @ManyToOne
    @JoinColumn
    public ShopState getShopState() {
        return shopState;
    }

    public void setShopState(ShopState shopState) {
        this.shopState = shopState;
    }


    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
