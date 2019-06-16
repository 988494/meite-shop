package com.mayikt.weixin.service.impl;

import com.mayikt.weixin.entity.AppEntity;
import com.mayikt.weixin.service.WeiXinAppService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

/**
 * 微信服务接口的实现
 */
@RestController
public class WeiXinAppServiceImpl implements WeiXinAppService {

	@Value("${yangzx}")
	private String name;
//	@GetMapping("/getApp")
	public AppEntity getApp() {
		return new AppEntity("644064779", "yushengjun644"+name);
	}
}
