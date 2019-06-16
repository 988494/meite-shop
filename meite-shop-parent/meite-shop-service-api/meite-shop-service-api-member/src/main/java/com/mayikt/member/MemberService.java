package com.mayikt.member;

import com.mayikt.weixin.entity.AppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 会员服务接口
 */
@Api(tags = "会员服务接口")
public interface MemberService {

	/**
	 * 会员服务接口调用微信接口
	 * 
	 * @return
	 */
	@ApiOperation(value = "会员调用微信服务接口")
	public AppEntity memberInvokeWeixin();

}
