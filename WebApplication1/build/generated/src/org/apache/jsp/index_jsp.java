package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.time.LocalDate;
import java.sql.Time;
import java.time.LocalTime;
import java.sql.ResultSet;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.sql.Statement;
import java.sql.DriverManager;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import java.sql.Connection;
import java.sql.Connection;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_write_property_name_filter_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_password_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_submit_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_bean_write_property_name_filter_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_form_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_password_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_submit_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_bean_write_property_name_filter_nobody.release();
    _jspx_tagPool_html_form_action.release();
    _jspx_tagPool_html_password_property_nobody.release();
    _jspx_tagPool_html_text_property_nobody.release();
    _jspx_tagPool_html_submit_value_nobody.release();
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
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>soundMatch</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"keywords\" content=\"Music Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\n");
      out.write("        <link href=\"css/style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("        <link href=\"css/font-awesome.css\" rel=\"stylesheet\"> \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/icon-font.css\" type='text/css' />\n");
      out.write("        <script src=\"js/jquery-2.1.4.js\"></script>\n");
      out.write("        ");

            String name = null, id = null;
            if ((request.getParameter("name") != null) && (request.getParameter("id") != null)) {
                name = request.getParameter("name");
                id = request.getParameter("id");
            }
        
      out.write("\n");
      out.write("\n");
      out.write("    </head> \n");
      out.write("    <body class=\"sticky-header left-side-collapsed\"  onload=\"initMap()\">\n");
      out.write("        <section>\n");
      out.write("            <div class=\"left-side sticky-left-side\">\n");
      out.write("                <!--logo and iconic logo start-->\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <h1><a href=\"index.jsp?name=");
      out.print(name);
      out.write("&&id=");
      out.print(id);
      out.write("\">Mosai<span>c</span></a></h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"logo-icon text-center\">\n");
      out.write("                    <a href=\"index.jsp?name=");
      out.print(name);
      out.write("&&id=");
      out.print(id);
      out.write("\">M </a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"left-side-inner\">\n");
      out.write("\n");
      out.write("                    <ul class=\"nav nav-pills nav-stacked custom-nav\">\n");
      out.write("                        <li class=\"active\"><a href=\"index.jsp?name=");
      out.print(name);
      out.write("&&id=");
      out.print(id);
      out.write("\"><i class=\"lnr lnr-home\"></i><span>Home</span></a></li>\n");
      out.write("                        <li><a href=\"artistname.jsp?name=");
      out.print(name);
      out.write("&&id=");
      out.print(id);
      out.write("\"><i class=\"lnr lnr-users\"></i> <span>Artists</span></a></li> \n");
      out.write("                        <li><a href=\"album.jsp?name=");
      out.print(name);
      out.write("&&id=");
      out.print(id);
      out.write("\"><i class=\"lnr lnr-music-note\"></i> <span>Albums</span></a></li>\t\t\t\t\t\t\n");
      out.write("                        <li><a href=\"barChrt.jsp\"><i class=\"lnr lnr-book\"></i><span>Bar Chart</span></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- signup -->\n");
      out.write("            <div class=\"modal fade\" id=\"myModal5\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\n");
      out.write("                <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                    <div class=\"modal-content modal-info\">\n");
      out.write("                        <div class=\"modal-header\">\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\t\t\t\t\t\t\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body modal-spa\">\n");
      out.write("                            <div class=\"sign-grids\">\n");
      out.write("                                <div class=\"sign\">\n");
      out.write("                                    <div class=\"sign-left\">\n");
      out.write("                                        <ul>\n");
      out.write("                                            <li><a class=\"fb\" href=\"fbsignin.jsp\"><i></i>Sign in with Facebook</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"sign-right\">\n");
      out.write("                                        ");
      if (_jspx_meth_html_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"clearfix\"></div>\t\t\t\t\t\t\t\t\n");
      out.write("                                </div>\n");
      out.write("                                <p>By logging in you agree to our <span>Terms and Conditions</span> and <span>Privacy Policy</span></p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("            <div class=\"main-content\">\n");
      out.write("                <div class=\"header-section\">\n");
      out.write("                    <a class=\"toggle-btn  menu-collapsed\"><i class=\"fa fa-bars\"></i></a>\n");
      out.write("                    <div class=\"menu-right\">\n");
      out.write("                        <div class=\"profile_details\">\t\t\n");
      out.write("                            <div class=\"col-md-4 serch-part\">\n");
      out.write("                                <div id=\"sb-search\" class=\"sb-search\">\n");
      out.write("                                    <form action=\"#\" method=\"post\">\n");
      out.write("\n");
      out.write("                                        <input class=\"sb-search-input\" placeholder=\"Search\" type=\"search\" name=\"search\" id=\"search\">\n");
      out.write("                                        <input class=\"sb-search-submit\" type=\"submit\" value=\"\">\n");
      out.write("                                        <span class=\"sb-icon-search\"> </span>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- search-scripts -->\n");
      out.write("                            <script src=\"js/classie.js\"></script>\n");
      out.write("                            <script src=\"js/uisearch.js\"></script>\n");
      out.write("                            <script>\n");
      out.write("        new UISearch(document.getElementById('sb-search'));\n");
      out.write("                            </script>\n");
      out.write("                            <!-- //search-scripts -->\n");
      out.write("                            <!---->\n");
      out.write("                            <div class=\"col-md-4 player\">\n");
      out.write("                                <div class=\"audio-player\">\n");
      out.write("                                    <audio id=\"audio-player\"  controls=\"controls\">\n");
      out.write("                                        <source src=\"media/Blue Browne.ogg\" type=\"audio/ogg\"></source>\n");
      out.write("                                        <source src=\"media/Blue Browne.mp3\" type=\"audio/mpeg\"></source>\n");
      out.write("                                        <source src=\"media/Georgia.ogg\" type=\"audio/ogg\"></source>\n");
      out.write("                                        <source src=\"media/Georgia.mp3\" type=\"audio/mpeg\"></source></audio>\n");
      out.write("                                </div>\n");
      out.write("                                <!---->\n");
      out.write("                                <script type=\"text/javascript\">\n");
      out.write("                                    $(function () {\n");
      out.write("                                        $('#audio-player').mediaelementplayer({\n");
      out.write("                                            alwaysShowControls: true,\n");
      out.write("                                            features: ['playpause', 'progress', 'volume'],\n");
      out.write("                                            audioVolume: 'horizontal',\n");
      out.write("                                            iPadUseNativeControls: true,\n");
      out.write("                                            iPhoneUseNativeControls: true,\n");
      out.write("                                            AndroidUseNativeControls: true\n");
      out.write("                                        });\n");
      out.write("                                    });\n");
      out.write("                                </script>\n");
      out.write("                                <!--audio-->\n");
      out.write("                                <link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"css/audio.css\">\n");
      out.write("                                <script type=\"text/javascript\" src=\"js/mediaelement-and-player.min.js\"></script>\n");
      out.write("                               \n");
      out.write("                                <ul class=\"next-top\">\n");
      out.write("                                    <li><a class=\"ar\" href=\"#\"> <img src=\"images/arrow.png\" alt=\"\"/></a></li>\n");
      out.write("                                    <li><a class=\"ar2\" href=\"#\"><img src=\"images/arrow2.png\" alt=\"\"/></i></a></li>\n");
      out.write("\n");
      out.write("                                </ul>\t\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-4 login-pop\">\n");
      out.write("                                <div id=\"loginpop\"> <a href=\"#\" id=\"loginButton\"><span>Login <i class=\"arrow glyphicon glyphicon-chevron-right\"></i></span></a><a class=\"top-sign\" href=\"#\" data-toggle=\"modal\" data-target=\"#myModal5\"><i class=\"fa fa-sign-in\"></i></a>\n");
      out.write("                                    <div id=\"loginBox\">  \n");
      out.write("                                        ");
      if (_jspx_meth_html_form_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"clearfix\"> </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-------->\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("                </div>\n");
      out.write("                <!-- //header-ends -->\n");
      out.write("                <div id=\"page-wrapper\">\n");
      out.write("                    <div class=\"inner-content\">\t\t\t\t\n");
      out.write("                        <div class=\"music-left\">\n");
      out.write("                            <!--banner-section-->\n");
      out.write("                            <div class=\"banner-section\">\n");
      out.write("                                <div class=\"banner\">\n");
      out.write("                                    <div class=\"callbacks_container\">\n");
      out.write("                                        <ul class=\"rslides callbacks callbacks1\" id=\"slider4\">\n");
      out.write("                                            <li>\n");
      out.write("                                                <div class=\"banner-img\">\n");
      out.write("                                                    <img src=\"images/l.jpg\" class=\"img-responsive\" alt=\"\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"banner-info\">\n");
      out.write("                                                    <a class=\"trend\" href=\"playlist?name=");
      out.print(name);
      out.write("&&id=");
      out.print(id);
      out.write("\">Playlist For You</a>\n");
      out.write("                                                    <h3>SoundMatch</h3>\n");
      out.write("                                                    <p>Album by <span>Rock star</span></p>\n");
      out.write("                                                </div>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li>\n");
      out.write("                                                <div class=\"banner-img\">\n");
      out.write("                                                    <img src=\"images/kk.jpg\" class=\"img-responsive\" alt=\"\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"banner-info\">\n");
      out.write("                                                    <a class=\"trend\" href=\"playlist?name=");
      out.print(name);
      out.write("&&id=");
      out.print(id);
      out.write("\">Playlist For You</a>\n");
      out.write("                                                    <h3>SoundMatch</h3>\n");
      out.write("                                                    <p>Album by <span>Rock star</span></p>\n");
      out.write("                                                </div>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li>\n");
      out.write("                                                <div class=\"banner-img\">\n");
      out.write("                                                    <img src=\"images/barr.png\" WIDTH=\"685\" HEIGHT=\"50\" BORDER=\"6\" USEMAP=\"#chart\" class=\"img-responsive\" alt=\"\">\n");
      out.write("                                                </div>\t\n");
      out.write("                                            </li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!--banner-->\n");
      out.write("                                    <script src=\"js/responsiveslides.min.js\"></script>\n");
      out.write("                                    <script>\n");
      out.write("                                    $(function () {\n");
      out.write("                                        // Slideshow 4\n");
      out.write("                                        $(\"#slider4\").responsiveSlides({\n");
      out.write("                                            auto: true,\n");
      out.write("                                            pager: true,\n");
      out.write("                                            nav: true,\n");
      out.write("                                            speed: 800,\n");
      out.write("                                            namespace: \"callbacks\",\n");
      out.write("                                            before: function () {\n");
      out.write("                                                $('.events').append(\"<li>before event fired.</li>\");\n");
      out.write("                                            },\n");
      out.write("                                            after: function () {\n");
      out.write("                                                $('.events').append(\"<li>after event fired.</li>\");\n");
      out.write("                                            }\n");
      out.write("                                        });\n");
      out.write("\n");
      out.write("                                    });\n");
      out.write("                                    </script>\n");
      out.write("                                    <div class=\"clearfix\"> </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\t\n");
      out.write("                            <!--//End-banner-->\n");
      out.write("                            <link href=\"css/popuo-box.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("                            <script src=\"js/jquery.magnific-popup.js\" type=\"text/javascript\"></script>\n");
      out.write("                            <script>\n");
      out.write("                                    $(document).ready(function () {\n");
      out.write("                                        $('.popup-with-zoom-anim').magnificPopup({\n");
      out.write("                                            type: 'inline',\n");
      out.write("                                            fixedContentPos: false,\n");
      out.write("                                            fixedBgPos: true,\n");
      out.write("                                            overflowY: 'auto',\n");
      out.write("                                            closeBtnInside: true,\n");
      out.write("                                            preloader: false,\n");
      out.write("                                            midClick: true,\n");
      out.write("                                            removalDelay: 300,\n");
      out.write("                                            mainClass: 'my-mfp-zoom-in'\n");
      out.write("                                        });\n");
      out.write("                                    });\n");
      out.write("                            </script>\t\t\n");
      out.write("                            <!--//pop-up-box -->\n");
      out.write("                            <div class=\"albums\">\n");
      out.write("                                <div class=\"tittle-head\">\n");
      out.write("                                    <h3 class=\"tittle\">Most Listened Songs <span class=\"new\">!!</span></h3>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            ");

                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    Connection connection = null;
                                    connection = DriverManager.getConnection("jdbc:mysql://localhost/soundMatch", "root", "");
                                    Statement statement = connection.createStatement();
                                    Statement stmnt = connection.createStatement();
                                    Statement st = connection.createStatement();
                                    if (connection.isClosed()) {
                                        out.println("NOT connected to " + "MySQL server using TCP/IP...");
                                    }
                                    ResultSet rst = statement.executeQuery("select * from categorya order by likes DESC LIMIT 6");
                                    while (rst.next()) {

                            
      out.write(" \n");
      out.write("                            <div class=\"albums\">\n");
      out.write("                                <div class=\"col-md-3 content-grid\">\n");
      out.write("                                    <a href=\"history?song=");
      out.print(rst.getString(1));
      out.write("&&link=");
      out.print(rst.getString(3));
      out.write("&&name=");
      out.print(name);
      out.write("&&id=");
      out.print(id);
      out.write("&&type=");
      out.print(rst.getString(5));
      out.write("\"><img src=\"images/music.jpg\" title=\"allbum-name\"></a>\n");
      out.write("                                    <a href=\"history?song=");
      out.print(rst.getString(1));
      out.write("&&link=");
      out.print(rst.getString(3));
      out.write("&&name=");
      out.print(name);
      out.write("&&id=");
      out.print(id);
      out.write("&&type=");
      out.print(rst.getString(5));
      out.write('"');
      out.write('>');
      out.print(rst.getString(1));
      out.write("</a>\n");
      out.write("                                </div>\t\n");
      out.write("                            </div>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                            <div class=\"clearfix\"> </div>\n");
      out.write("\n");
      out.write("                            <div class=\"albums second\">\n");
      out.write("                                <div class=\"tittle-head\">\n");
      out.write("                                    <h3 class=\"tittle\">Discover <span class=\"new\">View</span></h3>\n");
      out.write("                                    <a href=\"album.jsp?name=");
      out.print(name);
      out.write("&&id=");
      out.print(id);
      out.write("\"><h4 class=\"tittle two\">See all</h4></a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            ");

                                ResultSet rts = statement.executeQuery("SELECT * FROM categorya ORDER BY RAND() LIMIT 6");
                                while (rts.next()) {
                            
      out.write("\t\n");
      out.write("\n");
      out.write("                            <div class=\"albums second\">\n");
      out.write("                                <div class=\"col-md-3 content-grid\">\n");
      out.write("                                    <a href=\"history?song=");
      out.print(rts.getString(1));
      out.write("&&link=");
      out.print(rts.getString(3));
      out.write("&&name=");
      out.print(name);
      out.write("&&id=");
      out.print(id);
      out.write("%%type=");
      out.print(rts.getString(5));
      out.write("\"><img src=\"images/music.jpg\" title=\"allbum-name\"></a>\n");
      out.write("                                    <div class=\"inner-info\"><a href=\"history?song=");
      out.print(rts.getString(1));
      out.write("&&link=");
      out.print(rts.getString(3));
      out.write("&&name=");
      out.print(name);
      out.write("&&id=");
      out.print(id);
      out.write("&&type=");
      out.print(rts.getString(5));
      out.write("\"><h5>");
      out.print(rts.getString(1));
      out.write("</h5></a>  </div>\n");
      out.write("                                </div>\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                            </div>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <!--//music-left-->\n");
      out.write("                        </br></br>                                                    \n");
      out.write("                        <div class=\"music-right\">\n");
      out.write("                            <h4 class=\"widget-title\">Friend's Activity</h4>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        ");

                            LocalTime time = LocalTime.now();
                            LocalDate d = LocalDate.now();

                            int fcount = 0;
                            String[] f = {""};
                            String pic = "", t = "";

                            int i = 0;
                            ResultSet resultset = statement.executeQuery("select * from data where idx='" + id + "' ");
                            while (resultset.next()) {
                                String friends = resultset.getString(6);
                                fcount = resultset.getInt(7);
                                f = friends.split(" ");
                            }
                            while (i != fcount) {
                                ResultSet rs = stmnt.executeQuery("select * from history where id='" + f[i] + "' order by time desc");
                                while (rs.next()) {
                                    pic = "http://graph.facebook.com/" + f[i] + "/picture?type=square";
                                    Time tt = rs.getTime(4);
                                    Date dd = rs.getDate(4);
                                    int a = dd.getDate();
                                    int b = d.getDayOfMonth();
                                    LocalTime time2 = time.minusHours(tt.getHours());
                                    LocalTime time3 = time2.minusMinutes(tt.getMinutes());
                                    LocalTime time4 = time3.minusSeconds(tt.getSeconds());
                                    if ((b - a > 2) || (time4.getHour() > 23)) {
                                        st.executeUpdate("delete from history where id='" + f[i] + "' and song='" + rs.getString(2) + "' ");
                                    }
                                    if (time4.getHour() < 1 && time4.getMinute() < 1) {
                                        t = "few seconds ago";
                                    } else if (time4.getHour() < 1 && time4.getMinute() == 1) {
                                        t = time4.getMinute() + "minute ago";
                                    } else if (time4.getHour() < 1) {
                                        t = time4.getMinute() + "minutes ago";
                                    } else if (time4.getHour() == 1) {
                                        t = time4.getHour() + "hour ago";
                                    } else {
                                        t = time4.getHour() + "hours ago";
                                    }
                        
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"music-right\">\n");
      out.write("                            <div class=\"widget-side\">\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>\n");
      out.write("                                        <div class=\"song-img\">\n");
      out.write("                                            <img src=");
      out.print(pic);
      out.write(" class=\"img-responsive\" alt=\"\" />\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"song-text\">\n");
      out.write("                                            <a href=\"history?song=");
      out.print(rs.getString(2));
      out.write("&&link=");
      out.print(rs.getString(3));
      out.write("&&name=");
      out.print(name);
      out.write("&&id=");
      out.print(id);
      out.write("&&type=");
      out.print(rs.getString(5));
      out.write('"');
      out.write('>');
      out.print(rs.getString(2));
      out.write("</a>\n");
      out.write("                                            <span class=\"post-date\">");
      out.print(t);
      out.write("</span>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"clearfix\"></div>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>  \n");
      out.write("                        ");
                          }
                                i++;
                            }

                        
      out.write("\n");
      out.write("\n");
      out.write("                        </br></br></br>\n");
      out.write("                        <div class=\"music-right\">\t\t\t\t\t\t\t\t\n");
      out.write("                            <h4 class=\"widget-title\">Top Artists</h4>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        ");
    ResultSet r = statement.executeQuery("SELECT artist,sum(likes) FROM `categorya` group by artist order by likes DESC limit 5;");
                            while (r.next()) {
                        
      out.write("        \n");
      out.write("\n");
      out.write("                        <div class=\"music-right\">\t\t\t\t\t\t\t\t\t\t\t \n");
      out.write("                            <div class=\"widget-side second\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"artist.jsp?artist=");
      out.print(r.getString(1));
      out.write("&&name=");
      out.print(name);
      out.write("&&id=");
      out.print(id);
      out.write('"');
      out.write('>');
      out.print(r.getString(1));
      out.write("</a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"review-slider\">\n");
      out.write("                        <div class=\"tittle-head\">\n");
      out.write("                            <h3 class=\"tittle\">Featured Albums <span class=\"new\"> New</span></h3>\n");
      out.write("                            <div class=\"clearfix\"> </div>\n");
      out.write("                        </div>\n");
      out.write("                        <ul id=\"flexiselDemo1\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"single.html\"><img src=\"images/v1.jpg\" alt=\"\"/></a>\n");
      out.write("                                <div class=\"slide-title\"><h4>Bollywood</h4> </div>\n");
      out.write("                                <div class=\"date-city\">\n");
      out.write("                                    <div class=\"buy-tickets\">\n");
      out.write("                                        <a href=\"category?type=BOLLYWOOD&&name=");
      out.print(name);
      out.write("&&id=");
      out.print(id);
      out.write("\">LISTEN</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"single.html\"><img src=\"images/v2.jpg\" alt=\"\"/></a>\n");
      out.write("                                <div class=\"slide-title\"><h4>EDM</h4></div>\n");
      out.write("                                <div class=\"date-city\">\n");
      out.write("                                    <div class=\"buy-tickets\">\n");
      out.write("                                        <a href=\"category?type=EDM&&name=");
      out.print(name);
      out.write("&&id=");
      out.print(id);
      out.write("\">LISTEN</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"single.html\"><img src=\"images/v3.jpg\" alt=\"\"/></a>\n");
      out.write("                                <div class=\"slide-title\"><h4>POP</h4></div>\n");
      out.write("                                <div class=\"date-city\">\n");
      out.write("                                    <div class=\"buy-tickets\">\n");
      out.write("                                        <a href=\"category?type=POP&&name=");
      out.print(name);
      out.write("&&id=");
      out.print(id);
      out.write("\">LISTEN</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"single.html\"><img src=\"images/v4.jpg\" alt=\"\"/></a>\n");
      out.write("                                <div class=\"slide-title\"><h4>METAL</h4></div>\n");
      out.write("                                <div class=\"date-city\">\n");
      out.write("                                    <div class=\"buy-tickets\">\n");
      out.write("                                        <a href=\"category?type=METAL&&name=");
      out.print(name);
      out.write("&&id=");
      out.print(id);
      out.write("\">LISTEN</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"single.html\"><img src=\"images/v5.jpg\" alt=\"\"/></a>\n");
      out.write("                                <div class=\"slide-title\"><h4>PROGRESSIVE </h4></div>\n");
      out.write("                                <div class=\"date-city\">\n");
      out.write("                                    <div class=\"buy-tickets\">\n");
      out.write("                                        <a href=\"category?type=ROCK&&name=");
      out.print(name);
      out.write("&&id=");
      out.print(id);
      out.write("\">LISTEN</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"single.html\"><img src=\"images/v6.jpg\" alt=\"\"/></a>\n");
      out.write("                                <div class=\"slide-title\"><h4>ROCK</h4></div>\n");
      out.write("                                <div class=\"date-city\">\n");
      out.write("                                    <div class=\"buy-tickets\">\n");
      out.write("                                        <a href=\"category?type=ROCK&&name=");
      out.print(name);
      out.write("&&id=");
      out.print(id);
      out.write("\">LISTEN</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"single.html\"><img src=\"images/v6.jpeg\" alt=\"\"/></a>\n");
      out.write("                                <div class=\"slide-title\"><h4>ALTERNATIVE ROCK</h4></div>\n");
      out.write("                                <div class=\"date-city\">\n");
      out.write("                                    <div class=\"buy-tickets\">\n");
      out.write("                                        <a href=\"category?type=ALTERNATIVE ROCK&&name=");
      out.print(name);
      out.write("&&id=");
      out.print(id);
      out.write("\">LISTEN</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                        <script type=\"text/javascript\">\n");
      out.write("                            $(window).load(function () {\n");
      out.write("\n");
      out.write("                                $(\"#flexiselDemo1\").flexisel({\n");
      out.write("                                    visibleItems: 5,\n");
      out.write("                                    animationSpeed: 1000,\n");
      out.write("                                    autoPlay: true,\n");
      out.write("                                    autoPlaySpeed: 3000,\n");
      out.write("                                    pauseOnHover: false,\n");
      out.write("                                    enableResponsiveBreakpoints: true,\n");
      out.write("                                    responsiveBreakpoints: {\n");
      out.write("                                        portrait: {\n");
      out.write("                                            changePoint: 480,\n");
      out.write("                                            visibleItems: 2\n");
      out.write("                                        },\n");
      out.write("                                        landscape: {\n");
      out.write("                                            changePoint: 640,\n");
      out.write("                                            visibleItems: 3\n");
      out.write("                                        },\n");
      out.write("                                        tablet: {\n");
      out.write("                                            changePoint: 800,\n");
      out.write("                                            visibleItems: 4\n");
      out.write("                                        }\n");
      out.write("                                    }\n");
      out.write("                                });\n");
      out.write("                            });\n");
      out.write("                        </script>\n");
      out.write("                        <script type=\"text/javascript\" src=\"js/jquery.flexisel.js\"></script>\t\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("                <!--body wrapper end-->\n");
      out.write("                <!-- /w3l-agile -->\n");
      out.write("            </div>\n");
      out.write("            <footer>\n");
      out.write("                <p>SoundMatch</p>\n");
      out.write("            </footer>\n");
      out.write("        </section>\n");
      out.write("        ");

            } catch (Exception e) {
                out.println("wrong entry " + e);
            }
        
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery.nicescroll.js\"></script>\n");
      out.write("        <script src=\"js/scripts.js\"></script>\n");
      out.write("        <!-- Bootstrap Core JavaScript -->\n");
      out.write("        <script src=\"js/bootstrap.js\"></script>\n");
      out.write("    </body>\n");
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

  private boolean _jspx_meth_html_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_form_0.setPageContext(_jspx_page_context);
    _jspx_th_html_form_0.setParent(null);
    _jspx_th_html_form_0.setAction("/login");
    int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
    if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\n");
        out.write("                                            ");
        if (_jspx_meth_bean_write_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                            &nbsp;</td>\n");
        out.write("                                            <td>Enter your name:</td>\n");
        out.write("                                            <td>");
        if (_jspx_meth_html_text_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("                                            <td>Enter your email:</td>\n");
        out.write("                                            <td>");
        if (_jspx_meth_html_text_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("                                            <td>Enter your password:</td>\n");
        out.write("                                            <td>");
        if (_jspx_meth_html_password_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("                                            <td>");
        if (_jspx_meth_html_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_form_action.reuse(_jspx_th_html_form_0);
      return true;
    }
    _jspx_tagPool_html_form_action.reuse(_jspx_th_html_form_0);
    return false;
  }

  private boolean _jspx_meth_bean_write_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_0 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_0.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_write_0.setName("validatelogin");
    _jspx_th_bean_write_0.setProperty("error");
    _jspx_th_bean_write_0.setFilter(false);
    int _jspx_eval_bean_write_0 = _jspx_th_bean_write_0.doStartTag();
    if (_jspx_th_bean_write_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_0);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_0);
    return false;
  }

  private boolean _jspx_meth_html_text_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_0.setPageContext(_jspx_page_context);
    _jspx_th_html_text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_0.setProperty("name");
    int _jspx_eval_html_text_0 = _jspx_th_html_text_0.doStartTag();
    if (_jspx_th_html_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_0);
      return true;
    }
    _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_0);
    return false;
  }

  private boolean _jspx_meth_html_text_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_1 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_1.setPageContext(_jspx_page_context);
    _jspx_th_html_text_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_1.setProperty("email");
    int _jspx_eval_html_text_1 = _jspx_th_html_text_1.doStartTag();
    if (_jspx_th_html_text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_1);
      return true;
    }
    _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_1);
    return false;
  }

  private boolean _jspx_meth_html_password_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:password
    org.apache.struts.taglib.html.PasswordTag _jspx_th_html_password_0 = (org.apache.struts.taglib.html.PasswordTag) _jspx_tagPool_html_password_property_nobody.get(org.apache.struts.taglib.html.PasswordTag.class);
    _jspx_th_html_password_0.setPageContext(_jspx_page_context);
    _jspx_th_html_password_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_password_0.setProperty("password");
    int _jspx_eval_html_password_0 = _jspx_th_html_password_0.doStartTag();
    if (_jspx_th_html_password_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_password_property_nobody.reuse(_jspx_th_html_password_0);
      return true;
    }
    _jspx_tagPool_html_password_property_nobody.reuse(_jspx_th_html_password_0);
    return false;
  }

  private boolean _jspx_meth_html_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_submit_0 = (org.apache.struts.taglib.html.SubmitTag) _jspx_tagPool_html_submit_value_nobody.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_html_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_submit_0.setValue("Login");
    int _jspx_eval_html_submit_0 = _jspx_th_html_submit_0.doStartTag();
    if (_jspx_th_html_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_submit_value_nobody.reuse(_jspx_th_html_submit_0);
      return true;
    }
    _jspx_tagPool_html_submit_value_nobody.reuse(_jspx_th_html_submit_0);
    return false;
  }

  private boolean _jspx_meth_html_form_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_form_1 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_form_1.setPageContext(_jspx_page_context);
    _jspx_th_html_form_1.setParent(null);
    _jspx_th_html_form_1.setAction("/login");
    int _jspx_eval_html_form_1 = _jspx_th_html_form_1.doStartTag();
    if (_jspx_eval_html_form_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <table border=\"0\">\n");
        out.write("                                                <tbody>\n");
        out.write("                                                    <tr>\n");
        out.write("                                                        <td colspan=\"2\">\n");
        out.write("                                                            ");
        if (_jspx_meth_bean_write_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                            &nbsp;\n");
        out.write("                                                        </td>\n");
        out.write("                                                    </tr>\n");
        out.write("                                                <td>Email:</td>\n");
        out.write("                                                <td>");
        if (_jspx_meth_html_text_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_1, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("                                                <td></td>\n");
        out.write("                                                <td>");
        if (_jspx_meth_html_submit_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_1, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("                                                </tbody>\n");
        out.write("                                            </table>\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_html_form_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_form_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_form_action.reuse(_jspx_th_html_form_1);
      return true;
    }
    _jspx_tagPool_html_form_action.reuse(_jspx_th_html_form_1);
    return false;
  }

  private boolean _jspx_meth_bean_write_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_1 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_1.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_bean_write_1.setName("validatelogin");
    _jspx_th_bean_write_1.setProperty("error");
    _jspx_th_bean_write_1.setFilter(false);
    int _jspx_eval_bean_write_1 = _jspx_th_bean_write_1.doStartTag();
    if (_jspx_th_bean_write_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_1);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_1);
    return false;
  }

  private boolean _jspx_meth_html_text_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_2 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_2.setPageContext(_jspx_page_context);
    _jspx_th_html_text_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_text_2.setProperty("email");
    int _jspx_eval_html_text_2 = _jspx_th_html_text_2.doStartTag();
    if (_jspx_th_html_text_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_2);
      return true;
    }
    _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_2);
    return false;
  }

  private boolean _jspx_meth_html_submit_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_submit_1 = (org.apache.struts.taglib.html.SubmitTag) _jspx_tagPool_html_submit_value_nobody.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_submit_1.setPageContext(_jspx_page_context);
    _jspx_th_html_submit_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_submit_1.setValue("Login");
    int _jspx_eval_html_submit_1 = _jspx_th_html_submit_1.doStartTag();
    if (_jspx_th_html_submit_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_submit_value_nobody.reuse(_jspx_th_html_submit_1);
      return true;
    }
    _jspx_tagPool_html_submit_value_nobody.reuse(_jspx_th_html_submit_1);
    return false;
  }
}
