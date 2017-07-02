import java.io.IOException;
import java.sql.*;
import java.sql.Connection;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet 
{
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
   
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
         response.setContentType("text/html;charset=UTF-8");
                PrintWriter out = response.getWriter();
           String name = request.getParameter("name");
           String song = request.getParameter("song");
           String id = request.getParameter("id");
           String link=request.getParameter("link");
           String comment = request.getParameter("comment");
           try
           {
           Class.forName("com.mysql.jdbc.Driver");
           Connection connection = null; 
           connection = DriverManager.getConnection("jdbc:mysql://localhost/soundMatch","root","");
           PreparedStatement s = connection.prepareStatement("insert into comments values(?,?,?,?)");
           s.setString(1,name);
           s.setString(2,id);
           s.setString(3,song);
           s.setString(4,comment);
           int i = s.executeUpdate();
           
            if(i>0)
            {
               out.println("successfull");
            }                
           }catch(Exception e)
            {
               e.printStackTrace();
            }
                   response.sendRedirect("http://localhost:8080/WebApplication1/comment2.jsp?name="+name+"&&id="+id+"&&song="+song+"&&link="+link);  

    }

   
    @Override
    public String getServletInfo() 
    {
        return "Short description";
    }// </editor-fold>

}
