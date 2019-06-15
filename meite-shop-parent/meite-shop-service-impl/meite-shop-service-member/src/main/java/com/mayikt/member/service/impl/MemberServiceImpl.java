package com.mayikt.member.service.impl;

import com.mayikt.weixin.entity.AppEntity;
import com.mayikt.member.MemberService;
import com.mayikt.member.feign.WeiXinAppServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 会员服务接口实现
 */
@RestController
public class MemberServiceImpl implements MemberService {
	@Autowired
	private WeiXinAppServiceFeign weiXinAppServiceFeign;

	@GetMapping("/memberInvokeWeixin")
	public AppEntity memberInvokeWeixin() {
		return weiXinAppServiceFeign.getApp();
	}

}
