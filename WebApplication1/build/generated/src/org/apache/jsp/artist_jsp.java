package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.*;

public final class artist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
ResultSet resultset =null;
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>artsists</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Mosaic Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\n");
      out.write("<link href=\"css/style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("<link href=\"css/font-awesome.css\" rel=\"stylesheet\"> \n");
      out.write("<link rel=\"stylesheet\" href=\"css/icon-font.css\" type='text/css' />\n");
      out.write("<script src=\"js/jquery-2.1.4.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String name=null,id=null;
            String artist=null,s=null ;
            if((request.getParameter("artist")!=null)&&(request.getParameter("name")!=null)&&(request.getParameter("id")!=null))
            {
                name=request.getParameter("name");
                id=request.getParameter("id");
                artist = request.getParameter("artist");                                 
                 

               try
                    {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection connection = null; 

                        connection = DriverManager.getConnection("jdbc:mysql://localhost/soundMatch","root","");
                        Statement statement = connection.createStatement() ;

                         if(connection.isClosed())
                            out.println("NOT connected to " + "MySQL server using TCP/IP...");

                        resultset =statement.executeQuery("select * from categorya where artist='"+artist+"' ") ;

                        while(resultset.next())
                        {
                            s = resultset.getString(1);
                            /*out.print(s);
                            out.println("<br>");*/
                        
        
      out.write("\n");
      out.write(" <div class=\"col-md-3 artist-grid\">\n");
      out.write(" <a href=\"history?song=");
      out.print(resultset.getString(1));
      out.write("&&link=");
      out.print(resultset.getString(3));
      out.write("&&name=");
      out.print(name);
      out.write("&&id=");
      out.print(id);
      out.write("\" onclick=\"location.href=this.href+;return false;\"><img src=\"images/music.jpg\" title=\"allbum-name\"></a>\n");
      out.write(" <a href=\"history?song=");
      out.print(resultset.getString(1));
      out.write("&&link=");
      out.print(resultset.getString(3));
      out.write("&&name=");
      out.print(name);
      out.write("&&id=");
      out.print(id);
      out.write("\" onclick=\"location.href=this.href;return false;\"><i class=\"glyphicon glyphicon-play-circle\"></i></a>\n");
      out.write(" <a class=\"art\" href=\"history?song=");
      out.print(resultset.getString(1));
      out.write("&&link=");
      out.print(resultset.getString(3));
      out.write("&&name=");
      out.print(name);
      out.write("&&id=");
      out.print(id);
      out.write("\" onclick=\"location.href=this.href;return false;\">");
out.print(resultset.getString(1));
      out.write("</a>\n");
      out.write(" </div>\n");
      out.write("\n");
      out.write(" ");

                        }      
                    }catch(Exception e)
                        {
                             out.println("wrong entry "+e);
                        }
            }
 
      out.write("\n");
      out.write(" \n");
      out.write("   <footer>\n");
      out.write("       <p>soundMatch</p>    \n");
      out.write("   </footer>\n");
      out.write("\n");
      out.write("<script src=\"js/jquery.nicescroll.js\"></script>\n");
      out.write("<script src=\"js/scripts.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.js\"></script>\n");
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
