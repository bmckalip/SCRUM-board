package com.revature.dao.impl;

import com.revature.dao.PermissionDao;
import com.revature.pojo.Permission;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PermissionDaoImpl implements PermissionDao{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void createPermission(Permission permission) {
        System.out.println("Creating a Permission - FROM The PermissionDaoImpl class");
        Session session = sessionFactory.getCurrentSession();
        session.save(permission);

    }

    @Override
    public Permission getPermissionById(Permission permission) {
        System.out.println("Creating a Permission - FROM The PermissionDaoImpl class");
        Session session = sessionFactory.getCurrentSession();
        return (Permission) session.get(Permission.class, permission.getPermissionId());
    }

    @Override
    public void updatePermission(Permission permission) {
        System.out.println("Updating a Permission - FROM The PermissionDaoImpl class");
        Session session = sessionFactory.getCurrentSession();
        session.update(permission);

    }

    @Override
    public void deletePermission(Permission permission) {
        System.out.println("Deleting a Permission - FROM The PermissionDaoImpl class");
        Session session = sessionFactory.getCurrentSession();
        session.delete(permission);

    }
}
