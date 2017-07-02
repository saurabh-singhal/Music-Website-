package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class dataHelper 
{
    public static void main(String[] arg)
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory factory = cfg.buildSessionFactory();        
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        
        Data d = new Data();
        d.setIdx("2112");
        d.setNamex("d");
        d.setEmailx("ddddddddd");
        d.setFriendx("ssssssssss");
        d.setFcount(4);
        d.setMusicx("sssssssdddddddddddd");
        d.setMcount(2);
        
        session.persist(d);  
        t.commit();
        session.close();  
      
        System.out.println("successfully saved");  
    }
}
