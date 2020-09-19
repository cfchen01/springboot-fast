

package com.os.modules.sys.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.os.common.utils.PageUtils;
import com.os.modules.sys.entity.SysRoleEntity;

import java.util.Map;


/**
 * 角色
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface SysRoleService extends IService<SysRoleEntity> {

	PageUtils queryPage(Map<String, Object> params);

	void saveRole(SysRoleEntity role);

	void update(SysRoleEntity role);

	void deleteBatch(Long[] roleIds);

}
