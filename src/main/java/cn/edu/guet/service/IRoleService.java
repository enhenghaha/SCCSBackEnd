package cn.edu.guet.service;

import cn.edu.guet.model.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IRoleService {
    Role getRoleById(String roleId) ;
    List<Role> getAllRole() ;
    void saveRole(Role role)throws Exception;
    void updateRole(Role role) throws Exception;
    void deleteRoleById(String roleId) throws Exception;
    void saveRoleMenu(@Param("menuid") String menuid, @Param("roleid")String roleid)throws Exception;
}
