package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class validatelogin extends org.apache.struts.action.ActionForm {
    
    private String name;
    private String email;
    private String password;

    public String getPassword() 
    {
        return password;
    }

    public void setPassword(String password) 
    {
        this.password = password;
    }
    private String error;

    public String getError() 
    {
        return error;
    }
    
    public void setPError()
    {
                this.error = "<span style='color:red'>Minimum 6 length of password</span>";
    }
    
    public void setError()
    {
        this.error = "<span style='color:red'>Please provide valid entries for both fields</span>";
    }

    public String getEmail() 
    {
        return email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }
    
    public String getName() 
    {
        return name;
    }
    
    public void setName(String string) 
    {
        name = string;
    }
    
    public validatelogin() 
    {
        super();
        // TODO Auto-generated constructor stub
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request)
    {
        ActionErrors errors = new ActionErrors();
        if (getName() == null || getName().length() < 1) 
        {
            errors.add("name", new ActionMessage("error.name.required"));
        }
        return errors;
    }
}
