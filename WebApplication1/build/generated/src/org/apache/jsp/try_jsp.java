package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Connection;
import java.sql.*;

public final class try_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>soundMatch</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Music Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\n");
      out.write("<link href=\"css/style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("<link href=\"css/font-awesome.css\" rel=\"stylesheet\"> \n");
      out.write("<link rel=\"stylesheet\" href=\"css/icon-font.css\" type='text/css' />\n");
      out.write("<script src=\"js/jquery-2.1.4.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</head> \n");
      out.write(" <body class=\"sticky-header left-side-collapsed\"  onload=\"initMap()\">\n");
      out.write("    <section>\n");
      out.write("      <!-- left side start-->\n");
      out.write("\t\t<div class=\"left-side sticky-left-side\">\n");
      out.write("\t\t\t<!--logo and iconic logo start-->\n");
      out.write("\t\t\t<div class=\"logo\">\n");
      out.write("\t\t\t\t<h1><a href=\"index.jsp\">Mosai<span>c</span></a></h1>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"logo-icon text-center\">\n");
      out.write("\t\t\t\t<a href=\"index.jsp\">M </a>\n");
      out.write("\t\t\t</div>\n");
      out.write(" \t <!-- /w3l-agile -->\n");
      out.write("\t\t\t<!--logo and iconic logo end-->\n");

String name=null,id=null;
if((request.getParameter("name")!=null)&&(request.getParameter("id")!=null))
{
	name=request.getParameter("name");
	id=request.getParameter("id");
}

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"left-side-inner\">\n");
      out.write("\n");
      out.write("\t\t\t\t<!--sidebar nav start-->\n");
      out.write("\t\t\t\t\t<ul class=\"nav nav-pills nav-stacked custom-nav\">\n");
      out.write("\t\t\t\t\t\t<li class=\"active\"><a href=\"index.jsp\"><i class=\"lnr lnr-home\"></i><span>Home</span></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal1\"><i class=\"fa fa-th\"></i><span>Apps</span></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"artistname.jsp?name=");
      out.print(name);
      out.write("&&id=");
      out.print(id);
      out.write("\"><i class=\"lnr lnr-users\"></i> <span>Artists</span></a></li> \n");
      out.write("\t\t\t\t\t\t<li><a href=\"album.jsp?name=");
      out.print(name);
      out.write("&&id=");
      out.print(id);
      out.write("\"><i class=\"lnr lnr-music-note\"></i> <span>Albums</span></a></li>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<li class=\"menu-list\"><a href=\"browse.html\"><i class=\"lnr lnr-indent-increase\"></i> <span>Browser</span></a>  \n");
      out.write("\t\t\t\t\t\t\t<ul class=\"sub-menu-list\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"browse.html\">Artists</a> </li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"404.html\">Services</a> </li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"blog.html\"><i class=\"lnr lnr-book\"></i><span>Blog</span></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"typography.html\"><i class=\"lnr lnr-pencil\"></i> <span>Typography</span></a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"menu-list\"><a href=\"#\"><i class=\"lnr lnr-heart\"></i>  <span>My Favourities</span></a> \n");
      out.write("\t\t\t\t\t\t\t<ul class=\"sub-menu-list\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"radio.html\">All Songs</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li class=\"menu-list\"><a href=\"contact.html\"><i class=\"fa fa-thumb-tack\"></i><span>Contact</span></a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"sub-menu-list\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"contact.html\">Location</a> </li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>     \n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<!--sidebar nav end-->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- app-->\n");
      out.write("\t\t\t<div class=\"modal fade\" id=\"myModal1\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\n");
      out.write("\t\t\t\t<div class=\"modal-dialog facebook\" role=\"document\">\n");
      out.write("\t\t\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"app-grids\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"app\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-5 app-left mpl\">\n");
      out.write("\t\t\t\t\t\t\t<h3>Music mobile app on your smartphone!</h3>\n");
      out.write("\t\t\t\t\t\t\t<p>Download and Avail Special Songs Videos and Audios.</p>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"app-devices\">\n");
      out.write("\t\t\t\t\t\t\t\t<h5>Gets the app from</h5>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\"><img src=\"images/1.png\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\"><img src=\"images/2.png\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-7 app-image\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/apps.png\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- //app-->\n");
      out.write("\n");
      out.write("\t\t<!-- signup -->\n");
      out.write("\t\t\t<div class=\"modal fade\" id=\"myModal5\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\n");
      out.write("\t\t\t\t<div class=\"modal-dialog\" role=\"document\">\n");
      out.write("\t\t\t\t\t<div class=\"modal-content modal-info\">\n");
      out.write("\t\t\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"modal-body modal-spa\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"sign-grids\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"sign\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"sign-left\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a class=\"fb\" href=\"fbsignin.jsp\"><i></i>Sign in with Facebook</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"sign-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_html_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<p>By logging in you agree to our <span>Terms and Conditions</span> and <span>Privacy Policy</span></p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- //signup -->\n");
      out.write("\t\t<!-- left side end-->\n");
      out.write("\t\t<!-- main content start-->\n");
      out.write("\t\t<div class=\"main-content\">\n");
      out.write("\t\t\t<!-- header-starts -->\n");
      out.write("\t\t\t<div class=\"header-section\">\n");
      out.write("\t\t\t<!--toggle button start-->\n");
      out.write("\t\t\t<a class=\"toggle-btn  menu-collapsed\"><i class=\"fa fa-bars\"></i></a>\n");
      out.write("\t\t\t<!--toggle button end-->\n");
      out.write("\t\t\t<!--notification menu start -->\n");
      out.write("\t\t\t\t<div class=\"menu-right\">\n");
      out.write("\t\t\t\t\t<div class=\"profile_details\">\t\t\n");
      out.write("\t\t\t\t\t\t  <div class=\"col-md-4 serch-part\">\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"sb-search\" class=\"sb-search\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<form action=\"#\" method=\"post\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input class=\"sb-search-input\" placeholder=\"Search\" type=\"search\" name=\"search\" id=\"search\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input class=\"sb-search-submit\" type=\"submit\" value=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"sb-icon-search\"> </span>\n");
      out.write("\t\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t  <!-- search-scripts -->\n");
      out.write("\t\t\t\t\t\t\t\t\t<script src=\"js/classie.js\"></script>\n");
      out.write("\t\t\t\t\t\t\t\t\t<script src=\"js/uisearch.js\"></script>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<script>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tnew UISearch( document.getElementById( 'sb-search' ) );\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</script>\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- //search-scripts -->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t <!---->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  <div class=\"col-md-4 player\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"audio-player\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<audio id=\"audio-player\"  controls=\"controls\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<source src=\"media/Blue Browne.ogg\" type=\"audio/ogg\"></source>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<source src=\"media/Blue Browne.mp3\" type=\"audio/mpeg\"></source>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<source src=\"media/Georgia.ogg\" type=\"audio/ogg\"></source>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<source src=\"media/Georgia.mp3\" type=\"audio/mpeg\"></source></audio>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<!---->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(function(){\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t  $('#audio-player').mediaelementplayer({\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\talwaysShowControls: true,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tfeatures: ['playpause','progress','volume'],\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\taudioVolume: 'horizontal',\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tiPadUseNativeControls: true,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tiPhoneUseNativeControls: true,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tAndroidUseNativeControls: true\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t });\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</script>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<!--audio-->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"css/audio.css\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<script type=\"text/javascript\" src=\"js/mediaelement-and-player.min.js\"></script>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<!---->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<!--//-->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<ul class=\"next-top\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li><a class=\"ar\" href=\"#\"> <img src=\"images/arrow.png\" alt=\"\"/></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li><a class=\"ar2\" href=\"#\"><img src=\"images/arrow2.png\" alt=\"\"/></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t </ul>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-4 login-pop\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div id=\"loginpop\"> <a href=\"#\" id=\"loginButton\"><span>Login <i class=\"arrow glyphicon glyphicon-chevron-right\"></i></span></a><a class=\"top-sign\" href=\"#\" data-toggle=\"modal\" data-target=\"#myModal5\"><i class=\"fa fa-sign-in\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div id=\"loginBox\">  \n");
      if (_jspx_meth_html_form_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<!-------->\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t<!--notification menu end -->\n");
      out.write("\t\t\t<!-- //header-ends -->\n");
      out.write(" \t <!-- /w3l-agileits -->\n");
      out.write("\t\t<!-- //header-ends -->\n");
      out.write("\t\t\t<div id=\"page-wrapper\">\n");
      out.write("\t\t\t\t<div class=\"inner-content\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t      <div class=\"music-left\">\n");
      out.write("\t\t\t\t\t      <!--banner-section-->\n");
      out.write("\t\t\t\t\t\t\t<div class=\"banner-section\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"banner\">\n");
      out.write("\t\t\t\t\t\t\t\t\t <div class=\"callbacks_container\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul class=\"rslides callbacks callbacks1\" id=\"slider4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t   \t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"banner-img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t <img src=\"images/11.jpg\" class=\"img-responsive\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"banner-info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t              <a class=\"trend\" href=\"single.html\">TRENDING</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <h3>Let Your Home</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <p>Album by <span>Rock star</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t </div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"banner-img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t <img src=\"images/22.jpg\" class=\"img-responsive\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"banner-info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <a class=\"trend\" href=\"single.html\">TRENDING</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <h3>Charis Brown feet</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <p>Album by <span>Rock star</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t <div class=\"banner-img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t <img src=\"images/33.jpg\" class=\"img-responsive\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"banner-info\"> \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t             <a class=\"trend\" href=\"single.html\">TRENDING</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <h3>Let Your Home</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <p>Album by <span>Rock star</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t </div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t \t <!-- /w3layouts-agileits -->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!--banner-->\n");
      out.write("\t\t\t\t\t\t\t\t\t<script src=\"js/responsiveslides.min.js\"></script>\n");
      out.write("\t\t\t\t\t\t\t\t <script>\n");
      out.write("\t\t\t\t\t\t\t\t\t// You can also use \"$(window).load(function() {\"\n");
      out.write("\t\t\t\t\t\t\t\t\t$(function () {\n");
      out.write("\t\t\t\t\t\t\t\t\t  // Slideshow 4\n");
      out.write("\t\t\t\t\t\t\t\t\t  $(\"#slider4\").responsiveSlides({\n");
      out.write("\t\t\t\t\t\t\t\t\t\tauto: true,\n");
      out.write("\t\t\t\t\t\t\t\t\t\tpager:true,\n");
      out.write("\t\t\t\t\t\t\t\t\t\tnav:true,\n");
      out.write("\t\t\t\t\t\t\t\t\t\tspeed: 500,\n");
      out.write("\t\t\t\t\t\t\t\t\t\tnamespace: \"callbacks\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\tbefore: function () {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  $('.events').append(\"<li>before event fired.</li>\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\t\t\t\t\tafter: function () {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  $('.events').append(\"<li>after event fired.</li>\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t  });\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t  </script>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t<!--//End-banner-->\n");
      out.write("\t\t\t\t\t<!--albums-->\n");
      out.write("\t\t\t\t\t<!-- pop-up-box --> \n");
      out.write("\t\t\t\t\t\t\t<link href=\"css/popuo-box.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("\t\t\t\t\t\t\t<script src=\"js/jquery.magnific-popup.js\" type=\"text/javascript\"></script>\n");
      out.write("\t\t\t\t\t\t\t <script>\n");
      out.write("\t\t\t\t\t\t\t\t\t$(document).ready(function() {\n");
      out.write("\t\t\t\t\t\t\t\t\t$('.popup-with-zoom-anim').magnificPopup({\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype: 'inline',\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfixedContentPos: false,\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfixedBgPos: true,\n");
      out.write("\t\t\t\t\t\t\t\t\t\toverflowY: 'auto',\n");
      out.write("\t\t\t\t\t\t\t\t\t\tcloseBtnInside: true,\n");
      out.write("\t\t\t\t\t\t\t\t\t\tpreloader: false,\n");
      out.write("\t\t\t\t\t\t\t\t\t\tmidClick: true,\n");
      out.write("\t\t\t\t\t\t\t\t\t\tremovalDelay: 300,\n");
      out.write("\t\t\t\t\t\t\t\t\t\tmainClass: 'my-mfp-zoom-in'\n");
      out.write("\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t</script>\t\t\n");
      out.write("\t\t\t\t\t<!--//pop-up-box -->\n");
      out.write("\t\t\t\t\t\t<div class=\"albums\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"tittle-head\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h3 class=\"tittle\">New Releases <span class=\"new\">New</span></h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"index.jsp\"><h4 class=\"tittle\">See all</h4></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-3 content-grid\">\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"play-icon popup-with-zoom-anim\" href=\"#small-dialog\"><img src=\"images/v1.jpg\" title=\"allbum-name\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"button play-icon popup-with-zoom-anim\" href=\"#small-dialog\">Listen now</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div id=\"small-dialog\" class=\"mfp-hide\">\n");
      out.write("\t\t\t\t\t\t\t\t<iframe src=\"https://player.vimeo.com/video/12985622\"></iframe>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-3 content-grid\">\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"play-icon popup-with-zoom-anim\" href=\"#small-dialog\"><img src=\"images/v2.jpg\" title=\"allbum-name\"></a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"button play-icon popup-with-zoom-anim\" href=\"#small-dialog\">Listen now</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-3 content-grid\">\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"play-icon popup-with-zoom-anim\" href=\"#small-dialog\"><img src=\"images/v3.jpg\" title=\"allbum-name\"></a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"button play-icon popup-with-zoom-anim\" href=\"#small-dialog\">Listen now</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-3 content-grid last-grid\">\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"play-icon popup-with-zoom-anim\" href=\"#small-dialog\"><img src=\"images/v4.jpg\" title=\"allbum-name\"></a>\n");
      out.write("\t\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"button play-icon popup-with-zoom-anim\" href=\"#small-dialog\">Listen now</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-3 content-grid\">\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"play-icon popup-with-zoom-anim\" href=\"#small-dialog\"><img src=\"images/v5.jpg\" title=\"allbum-name\"></a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"button play-icon popup-with-zoom-anim\" href=\"#small-dialog\">Listen now</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div id=\"small-dialog\" class=\"mfp-hide\">\n");
      out.write("\t\t\t\t\t\t\t\t<iframe src=\"https://player.vimeo.com/video/12985622\"></iframe>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-3 content-grid\">\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"play-icon popup-with-zoom-anim\" href=\"#small-dialog\"><img src=\"images/v6.jpg\" title=\"allbum-name\"></a>\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"button play-icon popup-with-zoom-anim\" href=\"#small-dialog\">Listen now</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-3 content-grid\">\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"play-icon popup-with-zoom-anim\" href=\"#small-dialog\"><img src=\"images/v7.jpg\" title=\"allbum-name\"></a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"button play-icon popup-with-zoom-anim\" href=\"#small-dialog\">Listen now</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-3 content-grid last-grid\">\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"play-icon popup-with-zoom-anim\" href=\"#small-dialog\"><img src=\"images/v8.jpg\" title=\"allbum-name\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a class=\"button play-icon popup-with-zoom-anim\" href=\"#small-dialog\">Listen now</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!--//End-albums-->\n");
      out.write("\t\t\t\t\t\t<!--//discover-view-->\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"albums second\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"tittle-head\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h3 class=\"tittle\">Discover <span class=\"new\">View</span></h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"index.jsp\"><h4 class=\"tittle two\">See all</h4></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-3 content-grid\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\"><img src=\"images/v11.jpg\" title=\"allbum-name\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"inner-info\"><a href=\"single.html\"><h5>Pop</h5></a></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-3 content-grid\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\"><img src=\"images/v22.jpg\" title=\"allbum-name\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"inner-info\"><a href=\"single.html\"><h5>Pop</h5></a></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-3 content-grid\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\"><img src=\"images/v33.jpg\" title=\"allbum-name\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"inner-info\"><a href=\"single.html\"><h5>Pop</h5></a></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-3 content-grid last-grid\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\"><img src=\"images/v44.jpg\" title=\"allbum-name\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"inner-info\"><a href=\"single.html\"><h5>Pop</h5></a></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-3 content-grid\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\"><img src=\"images/v55.jpg\" title=\"allbum-name\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"inner-info\"><a href=\"single.html\"><h5>Pop</h5></a></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-3 content-grid\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\"><img src=\"images/v66.jpg\" title=\"allbum-name\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"inner-info\"><a href=\"single.html\"><h5>Pop</h5></a></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-3 content-grid\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\"><img src=\"images/v11.jpg\" title=\"allbum-name\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"inner-info\"><a href=\"single.html\"><h5>Pop</h5></a></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-3 content-grid last-grid\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\"><img src=\"images/v22.jpg\" title=\"allbum-name\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"inner-info\"><a href=\"single.html\"><h5>Pop</h5></a></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<!--//music-left-->\n");
      out.write("\t\t\t\t\t\t    <!--/music-right-->\n");

                                                      try
                    {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection connection = null; 
                        connection = DriverManager.getConnection("jdbc:mysql://localhost/soundMatch","root","");
                        Statement statement = connection.createStatement() ;
                        Statement stmnt = connection.createStatement() ;

                         if(connection.isClosed())
                            out.println("NOT connected to " + "MySQL server using TCP/IP...");
  
                        
                         ResultSet resultset =statement.executeQuery("select * from data where idx='"+id+"' ") ;
                        while(resultset.next())
                        {
                         String friends = resultset.getString(6);
                         String[] f = friends.split("//s");
                         for(String w:f)
                         {  
                             
                         } 
                        }
                    }catch(Exception e)
                        {
                             out.println("wrong entry "+e);
                        }
        
      out.write("\n");
      out.write("        \n");
      out.write("<div class=\"music-right\">\n");
      out.write("    <div class=\"widget-side\">\n");
      out.write("        <h4 class=\"widget-title\">Recent Activity</h4>\n");
      out.write("        <ul>\n");
      out.write("            <li>\n");
      out.write("                <a href=\"single.html\">Taylor Swift – Shake It Off</a>\n");
      out.write("                <span class=\"post-date\">Feb 13, 2016</span>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"widget-side second\">\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("    \t<h4 class=\"widget-title\">Top Songs</h4>\n");
      out.write("        <ul>\n");
      out.write("            <li>\n");
      out.write("                <div class=\"song-img\">\n");
      out.write("                    <a href=\"single.html\"><img src=\"images/play1.png\" class=\"img-responsive\" alt=\"\" /></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"song-text\">\n");
      out.write("                    <a href=\"single.html\">Ellie-Goulding</a>\n");
      out.write("                    <span class=\"post-date\">Feb 13, 2016</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("                                                    <div class=\"clearfix\"></div>\n");
      out.write("                                </div>\n");
      out.write("\t\t\t\t\t\t<!--body wrapper start-->\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"review-slider\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"tittle-head\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h3 class=\"tittle\">Featured Albums <span class=\"new\"> New</span></h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t <ul id=\"flexiselDemo1\">\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"single.html\"><img src=\"images/v1.jpg\" alt=\"\"/></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"slide-title\"><h4>Adele21 </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"date-city\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5>Jan-02-16</h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"buy-tickets\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\">READ MORE</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"single.html\"><img src=\"images/v2.jpg\" alt=\"\"/></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"slide-title\"><h4>Adele21</h4></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"date-city\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5>Jan-02-16</h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"buy-tickets\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\">READ MORE</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"single.html\"><img src=\"images/v3.jpg\" alt=\"\"/></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"slide-title\"><h4>Shomlock</h4></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"date-city\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5>Jan-02-16</h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"buy-tickets\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\">READ MORE</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"single.html\"><img src=\"images/v4.jpg\" alt=\"\"/></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"slide-title\"><h4>Stuck on a feeling</h4></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"date-city\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5>Jan-02-16</h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"buy-tickets\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\">READ MORE</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"single.html\"><img src=\"images/v5.jpg\" alt=\"\"/></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"slide-title\"><h4>Ricky Martine </h4></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"date-city\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5>Jan-02-16</h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"buy-tickets\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\">READ MORE</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"single.html\"><img src=\"images/v6.jpg\" alt=\"\"/></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"slide-title\"><h4>Ellie Goluding </h4></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"date-city\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5>Jan-02-16</h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"buy-tickets\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\">READ MORE</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"single.html\"><img src=\"images/v6.jpeg\" alt=\"\"/></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"slide-title\"><h4>Fifty Shades </h4></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"date-city\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5>Jan-02-16</h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"buy-tickets\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\">READ MORE</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\t\t\t$(window).load(function() {\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t  $(\"#flexiselDemo1\").flexisel({\n");
      out.write("\t\t\t\t\t\t\t\tvisibleItems: 5,\n");
      out.write("\t\t\t\t\t\t\t\tanimationSpeed: 1000,\n");
      out.write("\t\t\t\t\t\t\t\tautoPlay: true,\n");
      out.write("\t\t\t\t\t\t\t\tautoPlaySpeed: 3000,    \t\t\n");
      out.write("\t\t\t\t\t\t\t\tpauseOnHover: false,\n");
      out.write("\t\t\t\t\t\t\t\tenableResponsiveBreakpoints: true,\n");
      out.write("\t\t\t\t\t\t\t\tresponsiveBreakpoints: { \n");
      out.write("\t\t\t\t\t\t\t\t\tportrait: { \n");
      out.write("\t\t\t\t\t\t\t\t\t\tchangePoint:480,\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvisibleItems: 2\n");
      out.write("\t\t\t\t\t\t\t\t\t}, \n");
      out.write("\t\t\t\t\t\t\t\t\tlandscape: { \n");
      out.write("\t\t\t\t\t\t\t\t\t\tchangePoint:640,\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvisibleItems: 3\n");
      out.write("\t\t\t\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\t\t\t\ttablet: { \n");
      out.write("\t\t\t\t\t\t\t\t\t\tchangePoint:800,\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvisibleItems: 4\n");
      out.write("\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t</script>\n");
      out.write("\t\t\t\t\t\t<script type=\"text/javascript\" src=\"js/jquery.flexisel.js\"></script>\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t<!--body wrapper end-->\n");
      out.write(" \t <!-- /w3l-agile -->\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t  <!--body wrapper end-->\n");
      out.write("\t\t\t     <div class=\"footer\">\n");
      out.write("\t\t\t\t<div class=\"footer-grid\">\n");
      out.write("\t\t\t\t\t<h3>Navigation</h3>\n");
      out.write("\t\t\t\t\t<ul class=\"list1\">\n");
      out.write("\t\t\t\t\t  <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t\t  <li><a href=\"radio.html\">All Songs</a></li>\n");
      out.write("\t\t\t\t\t  <li><a href=\"browse.html\">Albums</a></li>\n");
      out.write("\t\t\t\t\t  <li><a href=\"radio.html\">New Collections</a></li>\n");
      out.write("\t\t\t\t\t  <li><a href=\"blog.html\">Blog</a></li>\n");
      out.write("\t\t\t\t\t  <li><a href=\"contact.html\">Contact</a></li>\n");
      out.write("\t\t\t\t    </ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"footer-grid\">\n");
      out.write("\t\t\t\t\t<h3>Our Account</h3>\n");
      out.write("\t\t\t\t    <ul class=\"list1\">\n");
      out.write("\t\t\t\t\t  <li><a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal5\">Your Account</a></li>\n");
      out.write("\t\t\t\t\t  <li><a href=\"#\">Personal information</a></li>\n");
      out.write("\t\t\t\t\t  <li><a href=\"#\">Addresses</a></li>\n");
      out.write("\t\t\t\t\t  <li><a href=\"#\">Discount</a></li>\n");
      out.write("\t\t\t\t\t  <li><a href=\"#\">Orders history</a></li>\n");
      out.write("\t\t\t\t\t  <li><a href=\"#\">Addresses</a></li>\n");
      out.write("\t\t\t\t\t  <li><a href=\"#\">Search Terms</a></li>\n");
      out.write("\t\t\t\t    </ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"footer-grid\">\n");
      out.write("\t\t\t\t\t<h3>Our Support</h3>\n");
      out.write("\t\t\t\t\t<ul class=\"list1\">\n");
      out.write("\t\t\t\t\t  <li><a href=\"contact.html\">Site Map</a></li>\n");
      out.write("\t\t\t\t\t  <li><a href=\"#\">Search Terms</a></li>\n");
      out.write("\t\t\t\t\t  <li><a href=\"#\">Advanced Search</a></li>\n");
      out.write("\t\t\t\t\t  <li><a href=\"#\">Mobile</a></li>\n");
      out.write("\t\t\t\t\t  <li><a href=\"contact.html\">Contact Us</a></li>\n");
      out.write("\t\t\t\t\t  <li><a href=\"#\">Mobile</a></li>\n");
      out.write("\t\t\t\t\t  <li><a href=\"#\">Addresses</a></li>\n");
      out.write("\t\t\t\t    </ul>\n");
      out.write("\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t  <div class=\"footer-grid\">\n");
      out.write("\t\t\t\t\t\t<h3>Newsletter</h3>\n");
      out.write("\t\t\t\t\t\t<p class=\"footer_desc\">Nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat</p>\n");
      out.write("\t\t\t\t\t\t<div class=\"search_footer\">\n");
      out.write("\t\t\t\t\t\t <form>\n");
      out.write("\t\t\t\t\t\t   <input type=\"text\" placeholder=\"Email....\" required=\"\">\n");
      out.write("\t\t\t\t\t\t  <input type=\"submit\" value=\"Submit\">\n");
      out.write("\t\t\t\t\t\t  </form>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t </div>\n");
      out.write("\t\t\t\t\t <div class=\"footer-grid footer-grid_last\">\n");
      out.write("\t\t\t\t\t\t<h3>About Us</h3>\n");
      out.write("\t\t\t\t\t\t<p class=\"footer_desc\">Diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat enim ad minim veniam,.</p>\n");
      out.write("\t\t\t\t\t\t<p class=\"f_text\">Phone:  &nbsp;&nbsp;&nbsp;00-250-2131</p>\n");
      out.write("\t\t\t\t\t\t<p class=\"email\">Email : &nbsp;<span><a href=\"mailto:mail@example.com\">info(at)mailing.com</a></span></p>\t\n");
      out.write("\t\t\t\t\t </div>\n");
      out.write("\t\t\t\t\t <div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("        <!--footer section start-->\n");
      out.write("\t\t\t<footer>\n");
      out.write("\t\t\t   <p>&copy 2016 Music. All Rights Reserved | Design by <a href=\"https://w3layouts.com/\" target=\"_blank\">w3layouts.</a></p>\n");
      out.write("\t\t\t</footer>\n");
      out.write("   </section>\n");
      out.write("  \n");
      out.write("<script src=\"js/jquery.nicescroll.js\"></script>\n");
      out.write("<script src=\"js/scripts.js\"></script>\n");
      out.write("<!-- Bootstrap Core JavaScript -->\n");
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
        out.write("    \n");
        out.write("                    ");
        if (_jspx_meth_bean_write_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    &nbsp;</td>\n");
        out.write("                <td>Enter your name:</td>\n");
        out.write("                <td>");
        if (_jspx_meth_html_text_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("                <td>Enter your email:</td>\n");
        out.write("                <td>");
        if (_jspx_meth_html_text_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("                <td>Enter your password:</td>\n");
        out.write("                <td>");
        if (_jspx_meth_html_password_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_html_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
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
        out.write("    <table border=\"0\">\n");
        out.write("        <tbody>\n");
        out.write("             <tr>\n");
        out.write("                <td colspan=\"2\">\n");
        out.write("                    ");
        if (_jspx_meth_bean_write_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    &nbsp;\n");
        out.write("                </td>\n");
        out.write("            </tr>\n");
        out.write("                <td>Name:</td>\n");
        out.write("                <td>");
        if (_jspx_meth_html_text_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_1, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("                <td>Email:</td>\n");
        out.write("                <td>");
        if (_jspx_meth_html_text_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_1, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("                <td></td>\n");
        out.write("                <td>");
        if (_jspx_meth_html_submit_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_1, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("        </tbody>\n");
        out.write("    </table>\n");
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
    _jspx_th_html_text_2.setProperty("name");
    int _jspx_eval_html_text_2 = _jspx_th_html_text_2.doStartTag();
    if (_jspx_th_html_text_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_2);
      return true;
    }
    _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_2);
    return false;
  }

  private boolean _jspx_meth_html_text_3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_3 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_3.setPageContext(_jspx_page_context);
    _jspx_th_html_text_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_text_3.setProperty("email");
    int _jspx_eval_html_text_3 = _jspx_th_html_text_3.doStartTag();
    if (_jspx_th_html_text_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_3);
      return true;
    }
    _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_3);
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
