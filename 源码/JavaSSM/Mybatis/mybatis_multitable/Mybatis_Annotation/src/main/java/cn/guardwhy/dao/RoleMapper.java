package cn.guardwhy.dao;

import cn.guardwhy.domain.Role;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

// 角色接口
public interface RoleMapper {
    // 根据传递过来的用户id，查询该用户所具有的角色信息
    @Select("select * from role r inner join user_role ur on r.id = ur.user_id where ur.role_id = #{id}")
    @Results({
        @Result(id = true, column = "id", property = "id"),
        @Result(column = "role_name", property = "roleName"),
        @Result(column = "role_detail", property = "roleDetail")
    })
    List<Role> findByOid(Integer id);
}
