/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bala.blog.main;

import java.util.Date;
import org.bala.blog.bo.BlogCategory;
import org.bala.blog.util.BlogHibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author bala
 */
public class NewClass {
    
    public static void main(String args[]){        
        
        Session session =BlogHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        BlogCategory blogCategory = new BlogCategory();
        blogCategory.setCategoryName("Java");
        blogCategory.setCreatedDate(new Date());
        blogCategory.setUpdatedDate(new Date());
        
        BlogCategory blogCategoryc = new BlogCategory(101);
        blogCategoryc.setCategoryName("JDBC");
        blogCategoryc.setCreatedDate(new Date());
        blogCategoryc.setUpdatedDate(new Date());
        
        session.save(blogCategory);
        transaction.commit();
        session.close();
       // sessionFactory.close();
        
        
        
        
        
    
    }
    
}
