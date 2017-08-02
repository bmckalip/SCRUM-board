package com.revature.dao;

import com.revature.pojo.Permission;

public interface PermissionDao {

    //CREATE
    void createPermission(Permission permission);
    //READ
    Permission getPermissionById(Permission permission);
    //UPDATE
    void updatePermission(Permission permission);
    //DELETE
    void deletePermission(Permission permission);
}
