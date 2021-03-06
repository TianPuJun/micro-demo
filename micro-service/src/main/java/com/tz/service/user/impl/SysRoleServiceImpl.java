package com.tz.service.user.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tz.bean.mysql.user.entity.SysRole;
import com.tz.dao.mysql.user.SysRoleMapper;
import com.tz.service.user.ISysRoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户角色表 服务实现类
 * </p>
 *
 * @author 256g的胃
 * @since 2020-05-16
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements ISysRoleService {

}
