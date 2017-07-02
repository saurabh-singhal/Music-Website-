package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.concurrent.TimeUnit;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.awt.*;
import java.io.*;
import org.jfree.chart.*;
import org.jfree.chart.axis.*;
import org.jfree.chart.entity.*;
import org.jfree.chart.labels.*;
import org.jfree.chart.plot.*;
import org.jfree.chart.renderer.category.*;
import org.jfree.chart.urls.*;
import org.jfree.data.category.*;
import org.jfree.data.general.*;

public final class kk_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


                DefaultCategoryDataset categoryDataset = new DefaultCategoryDataset();

                 String img;
                 
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write(" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');

    String name=request.getParameter("name");
    String id=request.getParameter("id");
    
     try
                    {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection connection = null; 

                        connection = DriverManager.getConnection("jdbc:mysql://localhost/soundMatch","root","");
                        Statement statement = connection.createStatement() ;

                         if(connection.isClosed())
                            out.println("NOT connected to " + "MySQL server using TCP/IP...");

                        ResultSet rs =statement.executeQuery("SELECT type,sum(likes) FROM `categorya` group by type order by likes DESC") ;

                        while (rs.next()) 
                            {
                                int a = rs.getInt(2);
                                categoryDataset.setValue(a, "" + rs.getString(1), "" + rs.getString(1));
                            }    
                    }catch(Exception e)
                        {
                             out.println("wrong entry "+e);
                        }
  

 

 JFreeChart chart = null;
 BarRenderer renderer3D = null;
 CategoryPlot plot = null;

chart = ChartFactory.createBarChart3D("fff",
                                    "Music genres",
                                    "Followers" ,
                                    categoryDataset,
                                    PlotOrientation.VERTICAL,
                                    true,
                                    true,
                                    false
                            );
 final CategoryAxis3D categoryAxis = new CategoryAxis3D("Match");
 final ValueAxis valueAxis = new NumberAxis3D("Run");
 renderer3D = new BarRenderer3D();
                           plot = chart.getCategoryPlot();

 chart = new JFreeChart("Trending", JFreeChart.DEFAULT_TITLE_FONT, 
  plot, true);

 chart.setBackgroundPaint(new Color(249, 231, 236));
 BarRenderer renderer = (BarRenderer) chart.getCategoryPlot().getRenderer();
    //renderer.setItemMargin(.2);
    renderer.setMaximumBarWidth(.30);

  try {
 final ChartRenderingInfo info = new ChartRenderingInfo
 (new StandardEntityCollection());
 final File file1 = new File("C:/Users/saurabh/Documents/NetBeansProjects/WebApplication1/web/images/barr.png");
               img="barr.png";

 ChartUtilities.saveChartAsPNG(file1, chart, 600, 400, info);
  } catch (Exception e) {
 out.println(e);
 }

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Mosaic a Entertainment Category Flat Bootstrap Responsive Website Template | 404 :: w3layouts</title>\n");
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
      out.write("</head> \n");
      out.write(" <body class=\"sticky-header left-side-collapsed\"  onload=\"initMap()\">\n");
      out.write("    <section>\n");
      out.write("\t\t<div class=\"left-side sticky-left-side\">\n");
      out.write("\t\t\t<div class=\"logo\">\n");
      out.write("\t\t\t\t<h1><a href=\"index.html\">Mosai<span>c</span></a></h1>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"logo-icon text-center\">\n");
      out.write("\t\t\t\t<a href=\"index.jsp?name=");
      out.print(name);
      out.write("&&id=");
      out.print(id);
      out.write("\">M </a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"left-side-inner\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"main-content\">\n");
      out.write("\t\t\t<div class=\"header-section\">\n");
      out.write("\t\t\t<a class=\"toggle-btn  menu-collapsed\"><i class=\"fa fa-bars\"></i></a>\n");
      out.write("\t\t\t\t<div class=\"menu-right\">\n");
      out.write("\t\t\t\t\t<div class=\"profile_details\">\t\t\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div id=\"page-wrapper\">\n");
      out.write("\t\t\t\t\t\t<div class=\"inner-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"error-top\">                                                \t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                                                            <h3>TRENDING MUSIC GENRES ON SoundMatch<h3>                                                                                                                      \n");
      out.write("                                                                                    <img src=");
      out.print(img);
      out.write(" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("                                                                        </div>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t</div>\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<footer>\n");
      out.write("\t\t\t   <p>SoundMatch</p>\n");
      out.write("\t\t\t</footer>\n");
      out.write("   </section>\n");
      out.write("<script src=\"js/jquery.nicescroll.js\"></script>\n");
      out.write("<script src=\"js/scripts.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
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
