package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.*;
import java.net.URLDecoder;

public final class database_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            int i,j=0;
            String s;
        
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
ResultSet resultset =null,rs;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>DATABASE insertion</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

            /*URLDecoder urlDecoder = new URLDecoder(); 
            request.setCharacterEncoding("UTF-8");
                        String name=request.getParameter("response");
                        String k = urlDecoder.decode(name);
                        out.print("welcome"+name);*/
                        
           String name = request.getParameter("name");
           String music = request.getParameter("music");
           String friend = request.getParameter("friend");
           String id = request.getParameter("id");
           String email = request.getParameter("email");
           String music_count = request.getParameter("music_count");
           String friend_count = request.getParameter("friend_count");

           out.println(name);
           out.println(music);
           out.print(friend);
           out.print(email);
           out.print(id);

                    try
                    {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection connection = null; 
                        connection = DriverManager.getConnection("jdbc:mysql://localhost/soundMatch","root","");
                        Statement statement = connection.createStatement() ;

                         if(!connection.isClosed())
                            out.println("Successfully connected to " + "MySQL server using TCP/IP...");
 
                        resultset =statement.executeQuery("select * from dataa") ;
                        while(resultset.next())
                        {
                            //checking if existing user
                           out.print("while vale me h");
                           out.print(i);
                           s=resultset.getString(1);
                           out.print(s);
                            if(s == id)
                            {
                                 out.print("if vale me h");
                                //account already exixts
                                i=1;
                               /* if(resultset.getString(5)!=music_count)
                                {
                                    //user liked more music pages after login 
                                    out.print("music vale me h");
                                    statement.executeUpdate("update data set musicx= '"+music+"' , music_count='"+music_count+"' where idx='"+id+"' ");
                                }
                                
                                if(resultset.getString(6)!=friend_count)
                                {
                                    out.print("friend vale me h");
                                    //user's friends added to the soundMatch
                                    statement.executeUpdate("update data set friendx= '"+friend+"' , friend_count='"+friend_count+"' where idx='"+id+"' ");
                                }*/
                            }                        
                        }
                        
                        if(i==0)
                            {
                                out.print("insert vale me h");
                                //statement.executeUpdate("insert into data(idx,namex,emailx,musicx,friendx,music_count,friend_count) values( '"+id+"','"+name+"','"+email+"','"+music+"','"+friend+"','"+music_count+"','"+friend_count+"')");
                                statement.executeUpdate("insert into dataa(idx,namex,emailx,musicx) values( '"+id+"','"+name+"','"+email+"','"+music+"')");
                            }                       
                       // statement.executeUpdate("insert into category(artist,type ,count) values ('saurabh' ,'"+s+"',1)") ;
                        
                    }catch(Exception e)
                        {
                             out.println("wrong entry "+e);
                        }
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
