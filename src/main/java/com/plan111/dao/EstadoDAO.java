/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.plan111.dao;

import com.plan111.modelo.Estado;
import com.plan111.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Nicolas Oliva
 */
public class EstadoDAO 
{
    public void agregarEstado(Estado estado) {
        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            tx = session.beginTransaction();
            session.save(estado);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.flush();
            session.close();
        }
    }
    
    public void modificarEstado(Estado estado) {
        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            tx = session.beginTransaction();
            session.save(estado);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.flush();
            session.close();
        }
    }
    
    public void eliminarEstado(Estado estado) {
        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            tx = session.beginTransaction();
            session.save(estado);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.flush();
            session.close();
        }
    }
}
