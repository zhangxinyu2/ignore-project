package com.zxy.dao;

import com.zxy.entity.User;

public interface UserDao {
	/**
	 * 根据主键id查询用户
	 * @param id
	 * @return
	 * Create Date:	2017年6月14日 下午4:18:36
	  * @version:	redis V1.0.0
	 * @author:		Mr zxy
	 */
	User selectById(long id);
}
