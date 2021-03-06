package com.revature.pojo;

import java.io.Serializable;

public class Permission implements Serializable {
    private int permissionId;
    private String permissionType;

    public Permission(){}

    public Permission(int permissionId, String permissionType) {
        this.permissionId = permissionId;
        this.permissionType = permissionType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Permission)) return false;

        Permission that = (Permission) o;

        if (getPermissionId() != that.getPermissionId()) return false;
        return getPermissionType() != null ? getPermissionType().equals(that.getPermissionType()) : that.getPermissionType() == null;
    }

    @Override
    public int hashCode() {
        int result = getPermissionId();
        result = 31 * result + (getPermissionType() != null ? getPermissionType().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "permissionId=" + permissionId +
                ", permissionType='" + permissionType + '\'' +
                '}';
    }

    public int getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(int permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(String permissionType) {
        this.permissionType = permissionType;
    }
}
