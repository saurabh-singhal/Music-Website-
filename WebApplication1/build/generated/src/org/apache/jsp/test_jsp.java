package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<script>\r\n");
      out.write("  window.fbAsyncInit = function() \r\n");
      out.write("  {\r\n");
      out.write("    FB.init\r\n");
      out.write("    (\r\n");
      out.write("    {\r\n");
      out.write("      appId      : '1686330418354709',\r\n");
      out.write("      xfbml      : true,\r\n");
      out.write("      version    : 'v2.8'\r\n");
      out.write("    }\r\n");
      out.write("    );\r\n");
      out.write("    FB.AppEvents.logPageView();\r\n");
      out.write("\r\n");
      out.write("    FB.getLoginStatus(function(response) \r\n");
      out.write("    {\r\n");
      out.write("      if (response.status === 'connected') \r\n");
      out.write("      {\r\n");
      out.write("  \t   //document.getElementById('status').innerHTML='.We are connected.';\r\n");
      out.write("  \t   var uid = response.authResponse.userID;\r\n");
      out.write("        var accessToken = response.authResponse.accessToken;\r\n");
      out.write("        \r\n");
      out.write("      } \r\n");
      out.write("      else if (response.status === 'not_authorized') \r\n");
      out.write("      {\r\n");
      out.write("  \t   document.getElementById('status').innerHTML='.We are not logged in2.'; \r\n");
      out.write("      }  \r\n");
      out.write("      else \r\n");
      out.write("      {\r\n");
      out.write("  \t   document.getElementById('status').innerHTML='.not2.';\r\n");
      out.write("           login();\r\n");
      out.write("      }\r\n");
      out.write("    });\r\n");
      out.write("  };\r\n");
      out.write("  \r\n");
      out.write("  (function(d, s, id)\r\n");
      out.write("  {\r\n");
      out.write("     var js, fjs = d.getElementsByTagName(s)[0];\r\n");
      out.write("     if (d.getElementById(id)) {return;}\r\n");
      out.write("     js = d.createElement(s); js.id = id;\r\n");
      out.write("     js.src = \"//connect.facebook.net/en_US/sdk.js\";\r\n");
      out.write("     fjs.parentNode.insertBefore(js, fjs);\r\n");
      out.write("   }\r\n");
      out.write("   (document, 'script', 'facebook-jssdk'));\r\n");
      out.write("\r\n");
      out.write("function login()\r\n");
      out.write("{\r\n");
      out.write("FB.login(function(response)\r\n");
      out.write("{\r\n");
      out.write("\tif (response.status === 'connected') \r\n");
      out.write("  {\r\n");
      out.write("  \tdocument.getElementById('status').innerHTML='.We are connected1.';\r\n");
      out.write("        info();\r\n");
      out.write("  } \r\n");
      out.write("  else if (response.status === 'not_authorized') \r\n");
      out.write("  {\r\n");
      out.write("  \tdocument.getElementById('status').innerHTML='.We are not logged in1.'; \r\n");
      out.write("  }\r\n");
      out.write("  else \r\n");
      out.write("  {\r\n");
      out.write("  \tdocument.getElementById('status').innerHTML='.not1.';\r\n");
      out.write("  }\r\n");
      out.write("});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function logout()\r\n");
      out.write("{\r\n");
      out.write("FB.logout(function(response) {});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function info()\r\n");
      out.write("{\r\n");
      out.write("document.getElementById('status').innerHTML='.aa gaya.'; \r\n");
      out.write("//email is extended permission\r\n");
      out.write("FB.login(function(response) \r\n");
      out.write("{\r\n");
      out.write("  console.log((response));\r\n");
      out.write("          document.getElementById('status').innerHTML = toString(response);\r\n");
      out.write("}, {scope: 'email,user_likes,user_friends'});\r\n");
      out.write("\r\n");
      out.write("  //running\r\n");
      out.write("  //name aur id default \r\n");
      out.write("  FB.api('/me', 'GET', {fields: 'first_name,last_name,name,id,email,friends'}, function(response) \r\n");
      out.write("  {\r\n");
      out.write("        document.getElementById('status').innerHTML = response.friends.data[\"0\"].name;\r\n");
      out.write("        console.log(response);\r\n");
      out.write("        \r\n");
      out.write("  });\r\n");
      out.write("/*\r\n");
      out.write("FB.api(\r\n");
      out.write("    \"/{friend-list-id}\",\r\n");
      out.write("    function (response) {\r\n");
      out.write("{        console.log(response);\r\n");
      out.write("\r\n");
      out.write("      }\r\n");
      out.write("    }\r\n");
      out.write(");*/\r\n");
      out.write("\r\n");
      out.write("//running\r\n");
      out.write("/*FB.api(\"/me/friendlists\", function(response)\r\n");
      out.write("{\r\n");
      out.write("  document.getElementById('status').innerHTML = toString(response);\r\n");
      out.write("    console.log(response);\r\n");
      out.write("}, {scope: 'user_friends'});*/\r\n");
      out.write("\r\n");
      out.write("//running\r\n");
      out.write("/*\r\n");
      out.write("FB.api(\r\n");
      out.write("    \"/{user-id}/friends\",\r\n");
      out.write("    function (response) {\r\n");
      out.write("      if (response && !response.error) {\r\n");
      out.write("            console.log(response.);\r\n");
      out.write("\r\n");
      out.write("      }\r\n");
      out.write("    }\r\n");
      out.write(");*/\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<div id=\"status\"></div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
