package com.ayd.criss.slg.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Administrator on 2017/5/26.
 * 图片
 *
 */
@Entity
public class ImageC {

    private Integer imageId; //图片的id
    private String  imagePath; //图片的访问路径
    private String imageExplan;//图片说明

    @Id
    @GeneratedValue
    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getImageExplan() {
        return imageExplan;
    }

    public void setImageExplan(String imageExplan) {
        this.imageExplan = imageExplan;
    }
}
