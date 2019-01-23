package com.ecommerce.ecommerce.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Category")
public class Category
{
    @Id
    private ObjectId _id;
    private String categoryName;
    private String parentId;
    private String desc;
    private String picURL;

    public Category(){}

    public Category(ObjectId _id, String categoryName, String parentId, String desc, String picURL) {
        this.categoryName = categoryName;
        this.parentId = parentId;
        this.desc = desc;
        this.picURL = picURL;
    }

    public String get_id() {
        return _id.toString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPicURL() {
        return picURL;
    }

    public void setPicURL(String picURL) {
        this.picURL = picURL;
    }

    @Override
    public String toString() {
        return "iski id hai - " + this.get_id();
    }
}