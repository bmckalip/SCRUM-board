package com.revature.dao;

import com.revature.pojo.Permission;

public interface PermissionDao {

    void createPermission(Permission permission);
    Permission getPermissionById(Permission permission);
}
