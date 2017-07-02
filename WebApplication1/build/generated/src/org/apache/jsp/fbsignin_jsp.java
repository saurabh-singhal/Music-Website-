package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class fbsignin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("  \n");
      out.write("<html>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<script>\n");
      out.write("  window.fbAsyncInit = function() \n");
      out.write("  {\n");
      out.write("    FB.init\n");
      out.write("    (\n");
      out.write("    {\n");
      out.write("      appId      : '1686330418354709',\n");
      out.write("      xfbml      : true,\n");
      out.write("      version    : 'v2.8'\n");
      out.write("    }\n");
      out.write("    );\n");
      out.write("    FB.AppEvents.logPageView();\n");
      out.write("\n");
      out.write("    FB.getLoginStatus(function(response) \n");
      out.write("    {\n");
      out.write("      if (response.status === 'connected') \n");
      out.write("      {\n");
      out.write("  \t   //document.getElementById('status').innerHTML='.We are connected.';\n");
      out.write("  \t   var uid = response.authResponse.userID;\n");
      out.write("        var accessToken = response.authResponse.accessToken;\n");
      out.write("        \n");
      out.write("      } \n");
      out.write("      else if (response.status === 'not_authorized') \n");
      out.write("      {\n");
      out.write("  \t   document.getElementById('status').innerHTML='.We are not logged in2.'; \n");
      out.write("      }  \n");
      out.write("      else \n");
      out.write("      {\n");
      out.write("  \t   document.getElementById('status').innerHTML='.not2.';\n");
      out.write("           login();\n");
      out.write("      }\n");
      out.write("    });\n");
      out.write("  };\n");
      out.write("  \n");
      out.write("  (function(d, s, id)\n");
      out.write("  {\n");
      out.write("     var js, fjs = d.getElementsByTagName(s)[0];\n");
      out.write("     if (d.getElementById(id)) {return;}\n");
      out.write("     js = d.createElement(s); js.id = id;\n");
      out.write("     js.src = \"//connect.facebook.net/en_US/sdk.js\";\n");
      out.write("     fjs.parentNode.insertBefore(js, fjs);\n");
      out.write("   }\n");
      out.write("   (document, 'script', 'facebook-jssdk'));\n");
      out.write("\n");
      out.write("function login()\n");
      out.write("{\n");
      out.write("FB.login(function(response)\n");
      out.write("{\n");
      out.write("\tif (response.status === 'connected') \n");
      out.write("  {\n");
      out.write("  \tdocument.getElementById('status').innerHTML='.We are connected1.';\n");
      out.write("        info();\n");
      out.write("  } \n");
      out.write("  else if (response.status === 'not_authorized') \n");
      out.write("  {\n");
      out.write("  \tdocument.getElementById('status').innerHTML='.We are not logged in1.'; \n");
      out.write("  }\n");
      out.write("  else \n");
      out.write("  {\n");
      out.write("  \tdocument.getElementById('status').innerHTML='.not1.';\n");
      out.write("  }\n");
      out.write("});\n");
      out.write("}\n");
      out.write("\n");
      out.write("function logout()\n");
      out.write("{\n");
      out.write("FB.logout(function(response) {});\n");
      out.write("}\n");
      out.write("\n");
      out.write("function info()\n");
      out.write("{\n");
      out.write("document.getElementById('status').innerHTML='.aa gaya.'; \n");
      out.write("//email is extended permission\n");
      out.write("FB.login(function(response) \n");
      out.write("{\n");
      out.write("  console.log((response));\n");
      out.write("          document.getElementById('status').innerHTML = toString(response);\n");
      out.write("}, {scope: 'email,user_likes,user_friends,user_actions.music'});\n");
      out.write("\n");
      out.write("  //running\n");
      out.write("  //name aur id default \n");
      out.write("  FB.api('/me', 'GET', {fields: 'first_name,last_name,name,id,email,friends,music'}, function(response) \n");
      out.write("  {\n");
      out.write("      var i=0,j=0;\n");
      out.write("      var music=\"\";\n");
      out.write("      var s=\"\";\n");
      out.write("      var friend=\"\";\n");
      out.write("        document.getElementById('status').innerHTML = response.friends.data[\"0\"].name;\n");
      out.write("       /* console.log(decodeURIComponent(response));\n");
      out.write("        window.location = \"http://localhost:8080/WebApplication1/database.jsp?response=\" + encodeURIComponent(response.name);*/\n");
      out.write("        document.formname.name.value = response.name;\n");
      out.write("        document.formname.id.value = response.id;\n");
      out.write("        document.formname.email.value = response.email;\n");
      out.write("        while((response.music.data.length)!==i)\n");
      out.write("        {\n");
      out.write("            s = response.music.data[i].name;\n");
      out.write("            if(s.indexOf(/'/g))\n");
      out.write("            {\n");
      out.write("                s=s.replace(/'/g, \"\\\\'\");\n");
      out.write("                music = music + s + \",\";\n");
      out.write("                i++;\n");
      out.write("            }\n");
      out.write("            else\n");
      out.write("            {\n");
      out.write("                music = music + response.music.data[i].name + \",\";\n");
      out.write("                i++;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("           document.formname.music.value = music;\n");
      out.write("        \n");
      out.write("        while((response.friends.data.length)!==j)\n");
      out.write("        {\n");
      out.write("            friend = friend + response.friends.data[j].name;\n");
      out.write("            j++;\n");
      out.write("        }\n");
      out.write("        document.formname.friend.value = friend;\n");
      out.write("        document.formname.music_count.value = response.music.data.length;\n");
      out.write("        document.formname.friend_count.value = response.friends.data.length;\n");
      out.write("\n");
      out.write("        document.formname.submit();\n");
      out.write("  });\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("        <form name=\"formname\" action=\"database.jsp\" method=\"post\">\n");
      out.write("            <input type=\"hidden\" name=\"name\">\n");
      out.write("            <input type=\"hidden\" name=\"music\">\n");
      out.write("            <input type=\"hidden\" name=\"id\">\n");
      out.write("            <input type=\"hidden\" name=\"email\">\n");
      out.write("            <input type=\"hidden\" name=\"friend\">\n");
      out.write("            <input type=\"hidden\" name=\"music_count\">\n");
      out.write("            <input type=\"hidden\" name=\"friend_count\">\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("<div id=\"status\"></div>\n");
      out.write("\n");
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
