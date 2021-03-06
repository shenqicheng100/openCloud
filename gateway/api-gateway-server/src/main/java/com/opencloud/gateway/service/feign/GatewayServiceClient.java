package com.opencloud.gateway.service.feign;

import com.opencloud.system.client.constants.SystemConstants;
import com.opencloud.system.client.service.IGatewayServiceClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * @author: liuyadu
 * @date: 2018/10/24 16:49
 * @description:
 */
@Component
@FeignClient(value = SystemConstants.SYSTEM_SERVER)
public interface GatewayServiceClient extends IGatewayServiceClient {


}
