package com.cinema.entity.dao;

import com.cinema.HibernateUtil;
import com.cinema.entity.Seans;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by artur on 30.09.2017.
 */
public class SeansDAO {

    public Integer addSeans(Seans seans) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        Integer seansID = null;
        try{
            tx = session.beginTransaction();
            seansID = (Integer) session.save(seans);
            tx.commit();
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
        return seansID;
    }

    public void deleteSeans(Seans seans) {
        if (seans.getSeans_id() == 0) {
            return;
        }
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        Integer seansID = null;
        try{
            tx = session.beginTransaction();
            session.delete(seans);
            tx.commit();
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
    }

    public Seans getSeans(Integer seansId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        Seans seans = null;
        try {
            tx = session.beginTransaction();
            seans = session.get(Seans.class, seansId);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        return seans;
    }
}
