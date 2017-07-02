
package com.myapp.struts;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author saurabh
 */
public class loginAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String FAILURE = "failure";
    private static final String SUCCESS = "success";

    
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception 
    {
        validatelogin formbean = (validatelogin)form;
        String name=formbean.getName();
        String email=formbean.getEmail();
        String password=formbean.getPassword();
        
        if(password.length()<6)
        {
            formbean.setPError();
            return mapping.findForward(FAILURE);
        }
        
         if ((name == null) || email == null || password==null ||name.equals("") || email.indexOf("@") == -1 
                 || email.indexOf(".com")==-1) 
         {  
                 formbean.setError();
                return mapping.findForward(FAILURE);
         }
         
         try
           {
           PrintWriter out = response.getWriter();
           Class.forName("com.mysql.jdbc.Driver");
           Connection connection = null; 
           connection = DriverManager.getConnection("jdbc:mysql://localhost/soundMatch","root","");
           PreparedStatement s = connection.prepareStatement("insert into dataa values(?,?,?)");
           s.setString(1,name);
           s.setString(2,email);
           s.setString(3,password);
           s.executeUpdate();
              
           }catch(Exception e)
            {
               e.printStackTrace();
            }
        
        return mapping.findForward(SUCCESS);
    }
}
