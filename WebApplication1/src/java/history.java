import javax.servlet.*;  
import javax.servlet.http.*; 
import java.util.Date;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class history extends HttpServlet 
{

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {          
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
         response.setContentType("text/html;charset=UTF-8");
PrintWriter out = response.getWriter();
        String song=request.getParameter("song");
        String link=request.getParameter("link");
        String id=request.getParameter("id");
        String name=request.getParameter("name");
        String type=request.getParameter("type");
        Date date = new Date();
                
     try
           {
           Class.forName("com.mysql.jdbc.Driver");
           Connection connection = null; 
           connection = DriverManager.getConnection("jdbc:mysql://localhost/soundMatch","root","");
           PreparedStatement s = connection.prepareStatement("insert into history values(?,?,?,?,?)");
           s.setString(2,song);
           s.setTimestamp(4,new java.sql.Timestamp(date.getTime()));
           s.setString(1,id);
           s.setString(3,link);
           s.setString(5,type);
           s.executeUpdate();
           PreparedStatement ss = connection.prepareStatement("update categorya set likes=(likes+1) where music='"+song+"' ");
           ss.executeUpdate();
                     
           response.sendRedirect("http://localhost:8080/WebApplication1/comment2.jsp?name="+name+"&&id="+id+"&&song="+song+"&&link="+link);  
           }
             catch(Exception e)
                {
                    e.printStackTrace();
                }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        
    }
    
    @Override
    public String getServletInfo() 
    {
        return "Short description";
    }
}
