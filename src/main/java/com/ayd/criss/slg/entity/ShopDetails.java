package com.ayd.criss.slg.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Administrator on 2017/5/26.
 * 商品详情
 */
@Entity
public class ShopDetails {

    private Integer detailId; //详情id
    private String explan; //说明
    private List<ImageC> images;//详细图片

    @Id
    @GeneratedValue
    public Integer getDetailId() {
        return detailId;
    }

    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }

    public String getExplan() {
        return explan;
    }

    public void setExplan(String explan) {
        this.explan = explan;
    }

    @OneToMany
    @JoinColumn
    public List<ImageC> getImages() {
        return images;
    }

    public void setImages(List<ImageC> images) {
        this.images = images;
    }
}
