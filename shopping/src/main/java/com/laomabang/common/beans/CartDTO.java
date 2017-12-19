package com.laomabang.common.beans;

import lombok.Data;

/**
 * 购物车
 * Created by dazhuang on 2017/12/19.
 */
@Data
public class CartDTO {

    /** 商品Id. */
    private String productId;

    /** 数量. */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}