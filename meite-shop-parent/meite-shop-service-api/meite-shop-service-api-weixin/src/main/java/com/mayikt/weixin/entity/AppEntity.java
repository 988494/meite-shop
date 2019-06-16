package com.mayikt.weixin.entity;

import lombok.Data;

/**
 *  App实体类层
 */
@Data
public class AppEntity {

	/**
	 * appid
	 */
	private String appId;
	/**
	 * 应用名称
	 */
	private String appName;

	public AppEntity() {

	}

	public AppEntity(String appId, String appName) {
		super();
		this.appId = appId;
		this.appName = appName;
	}

}
