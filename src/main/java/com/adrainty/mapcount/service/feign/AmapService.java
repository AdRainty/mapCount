package com.adrainty.mapcount.service.feign;

import com.adrainty.mapcount.entity.AmapEntity;
import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 高德地图Api接口调用
 * @author AdRainty
 * @version V1.0.0
 * @date 2023/3/13 0:26
 */

@FeignClient(url = "${amap.api.url}", name = "amap")
public interface AmapService {

    /**
     * 驾车路线规划Api
     * @param amapEntity 请求参数
     * @return 响应结果
     */
    @GetMapping(value = "/v5/direction/driving")
    public JSONObject getDirectionByDriving(AmapEntity amapEntity);

    /**
     * 公交路线规划Api
     * @param amapEntity 请求参数
     * @return 响应结果
     */
    @GetMapping(value = "/v5/direction/transit/integrated")
    public JSONObject getDirectionByTransit(AmapEntity amapEntity);

}
