package cn.guardwhy.dao;

import cn.guardwhy.domain.Role;

import java.util.List;

// 角色接口
public interface RoleMapper {
    // 根据id查询角色
    List<Role> findByOid(Integer id);
}
