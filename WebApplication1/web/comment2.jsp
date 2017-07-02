<%@page import="java.sql.Connection"%>
<%@ page import="java.sql.*" %>
<%ResultSet resultset =null;%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
<title>music a Entertainment Category Flat Bootstrap Responsive Website Template | Blogs :: w3layouts</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="music Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<link href="css/style.css" rel='stylesheet' type='text/css' />
<link href="css/font-awesome.css" rel="stylesheet"> 
<link rel="stylesheet" href="css/icon-font.css" type='text/css' />
<script src="js/jquery-2.1.4.js"></script>

<%
      String name=request.getParameter("name");
      String id=request.getParameter("id");
      String song=request.getParameter("song");
      String link=request.getParameter("link");
%>

</head> 
 <body class="sticky-header left-side-collapsed"  onload="initMap()">
    <section>
<div class="left-side sticky-left-side">
                <div class="logo">
                    <h1><a href="index.jsp?name=<%=name%>&&id=<%=id%>">Mosai<span>c</span></a></h1>
                </div>
                <div class="logo-icon text-center">
                    <a href="index.jsp?name=<%=name%>&&id=<%=id%>">M </a>
                </div>
                <div class="left-side-inner">

                    <ul class="nav nav-pills nav-stacked custom-nav">
                        <li class="active"><a href="index.jsp?name=<%=name%>&&id=<%=id%>"><i class="lnr lnr-home"></i><span>Home</span></a></li>
                        <li><a href="artistname.jsp?name=<%=name%>&&id=<%=id%>"><i class="lnr lnr-users"></i> <span>Artists</span></a></li> 
                        <li><a href="album.jsp?name=<%=name%>&&id=<%=id%>"><i class="lnr lnr-music-note"></i> <span>Albums</span></a></li>						
                        <li><a href="barchrt.jsp"><i class="lnr lnr-book"></i><span>Bar Chart</span></a></li>
                    </ul>
                </div>
</div>
		<!-- signup -->
			<div class="modal fade" id="myModal5" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
				<div class="modal-dialog" role="document">
					<div class="modal-content modal-info">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>						
						</div>
						<div class="modal-body modal-spa">
							<div class="sign-grids">
								<div class="sign">
									<div class="sign-left">
										<ul>
											<li><a class="fb" href="#"><i></i>Sign in with Facebook</a></li>
											</ul>
									</div>
									<div class="sign-right">
										<form action="#" method="post">
											<h3>Create your account </h3>
											<input type="text" value="Name" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Name';}" required="">
											<input type="text" value="Mobile number" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Mobile number';}" required="">
											<input type="text" value="Email id" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email id';}" required="">	
											<input type="password" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}" required="">	
											
											<input type="submit" value="CREATE ACCOUNT" >
										</form>
									</div>
									<div class="clearfix"></div>								
								</div>
								<p>By logging in you agree to our <span>Terms and Conditions</span> and <span>Privacy Policy</span></p>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- //signup -->
		<!-- main content start-->
		<div class="main-content">
			<div class="header-section">
			<a class="toggle-btn  menu-collapsed"><i class="fa fa-bars"></i></a>
				<div class="menu-right">
					<div class="profile_details">		
						  <div class="col-md-4 serch-part">
								<div id="sb-search" class="sb-search">
									<form action="#" method="post">
										<input class="sb-search-input" placeholder="Search" type="search" name="search" id="search">
										<input class="sb-search-submit" type="submit" value="">
										<span class="sb-icon-search"> </span>
									</form>
								</div>
							</div>
							  <!-- search-scripts -->
									<script src="js/classie.js"></script>
									<script src="js/uisearch.js"></script>
										<script>
											new UISearch( document.getElementById( 'sb-search' ) );
										</script>
									<!-- //search-scripts -->
											 <!---->
											  <div class="col-md-4 player">
													<div class="audio-player">
														<audio id="audio-player"  controls="controls">
                                                                                                                    <source src="<%=request.getParameter("link")%>" type="audio/ogg"></source>
																<source src="media/Blue Browne.mp3" type="audio/mpeg"></source>
																<source src="media/Georgia.ogg" type="audio/ogg"></source>
																<source src="media/Georgia.mp3" type="audio/mpeg"></source></audio>
														</div>
												<!---->
												<script type="text/javascript">
													$(function(){
													  $('#audio-player').mediaelementplayer({
														alwaysShowControls: true,
														features: ['playpause','progress','volume'],
														audioVolume: 'horizontal',
														iPadUseNativeControls: true,
														iPhoneUseNativeControls: true,
														AndroidUseNativeControls: true
													});
												 });
												</script>
												<!--audio-->
													<link rel="stylesheet" type="text/css" media="all" href="css/audio.css">
													<script type="text/javascript" src="js/mediaelement-and-player.min.js"></script>
													<!---->

												<!--//-->
												<ul class="next-top">
													<li><a class="ar" href="#"> <img src="images/arrow.png" alt=""/></a></li>
													<li><a class="ar2" href="#"><img src="images/arrow2.png" alt=""/></i></a></li>
														
											 </ul>	
											</div>
											<div class="col-md-4 login-pop">
												<div id="loginpop"><a href="#" id="loginButton"><span>Login <i class="arrow glyphicon glyphicon-chevron-right"></i></span></a><a class="top-sign" href="#" data-toggle="modal" data-target="#myModal5"><i class="fa fa-sign-in"></i></a>
														<div id="loginBox">                
															<form action="#" method="post" id="loginForm">
																	<fieldset id="body">
																		<fieldset>
																			  <label for="email">Email Address</label>
																			  <input type="text" name="email" id="email">
																		</fieldset>
																		<fieldset>
																				<label for="password">Password</label>
																				<input type="password" name="password" id="password">
																		 </fieldset>
																		<input type="submit" id="login" value="Sign in">
																		<label for="checkbox"><input type="checkbox" id="checkbox"> <i>Remember me</i></label>
																	</fieldset>
																<span><a href="#">Forgot your password?</a></span>
														 </form>
													</div>
												</div>

											</div>
										<div class="clearfix"> </div>
								</div>
							<!-------->
						</div>
					<div class="clearfix"></div>
				</div>
				<!--notification menu end -->
							<div id="page-wrapper">
								<div class="inner-content">
		
										<div class="tittle-head">
											<h3 class="tittle">COMMENTS </h3>
											<div class="clearfix"> </div>
<%
                  
                    try
                    {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection connection = null; 
                        connection = DriverManager.getConnection("jdbc:mysql://localhost/soundMatch","root","");
                        Statement statement = connection.createStatement() ;

                         if(connection.isClosed())
                            out.println("NOT connected to " + "MySQL server using TCP/IP...");
 
                        resultset =statement.executeQuery("select * from comments where song= '"+song+"' ") ;
                      while(resultset.next())
                      	{
%>										</div>
										<!-- /music-left -->
<div class="music-left">
    <div class="post-media">				
        <div class="blog-text">
            <h3 class="h-t"><%=resultset.getString(1)%></h3>
            <div class="entry-meta">
                <div class="icons">
                </div>
                <div class="clearfix"></div>
                <p><%=resultset.getString(4)%></p>
            </div>											  
        </div>
    </div>					<!--//comment box-->
    <%
                    }    
                    }catch(Exception e)
                        {
                             out.println("wrong entry :"+e);
                        }

    %>									
               
    <div class="coment-form">
		<h4>Leave your comment(Max. length 80)</h4>
			<form action="Servlet" method="post">
                <input type="hidden" name="name" value="<%=name%>">
				<input type="hidden" name="song" value="<%=song%>" >
				<input type="hidden" name="id" value="<%=id%>" >                                				
                                <input type="hidden" name="link" value="<%=link%>" >
				<textarea name="comment" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Your Comment...';}" required="">Your Comment...</textarea>
				<input type="submit" value="Submit Comment">
			</form>
	</div>
</div>
									<div class="clearfix"></div>
</div>
							<div class="clearfix"></div>
</div>
</div>

			<footer>
			   <p>SoundMatch</p>
			</footer>
   </section>
  
<script src="js/jquery.nicescroll.js"></script>
<script src="js/scripts.js"></script>
<script src="js/bootstrap.js"></script>
</body>
</html>