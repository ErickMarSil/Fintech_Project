package com.fintech.project.demo.controll;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.security.auth.login.Configuration;

public class SessionControll {
    private static final SessionFactory sessionFactory = null;
    static {
        sessionFactory = new Configuration()
    }
    public static Session getSession(){
        return session;
    }
}
