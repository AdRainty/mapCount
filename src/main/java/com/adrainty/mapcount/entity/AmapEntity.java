package com.adrainty.mapcount.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

import java.io.Serializable;

/**
 * @author AdRainty
 * @version V1.0.0
 * @date 2023/3/13 0:33
 */
@Data
@ToString
public class AmapEntity implements Serializable {
    /**
     * 高德Key
     */
    @Value("${amap.api.key}")
    private String key;

    /**
     * 起点经纬度
     */
    private String origin;

    /**
     * 目的地
     */
    private String destination;

    /**
     * 数字签名
     */
    @Value("${amap.api.sign}")
    private String sig;
}
