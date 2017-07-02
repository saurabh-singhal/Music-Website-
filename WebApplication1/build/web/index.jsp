<%@page import="java.time.LocalDate"%>
<%@page import="java.sql.Time"%>
<%@page import="java.time.LocalTime"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@ page import="java.io.*,java.util.*, javax.servlet.*" %>
<%@page import="java.sql.Connection"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<!DOCTYPE HTML>
<html>
    <head>
        <title>soundMatch</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Music Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
        <link href="css/style.css" rel='stylesheet' type='text/css' />
        <link href="css/font-awesome.css" rel="stylesheet"> 
        <link rel="stylesheet" href="css/icon-font.css" type='text/css' />
        <script src="js/jquery-2.1.4.js"></script>
        <%
            String name = null, id = null;
            if ((request.getParameter("name") != null) && (request.getParameter("id") != null)) {
                name = request.getParameter("name");
                id = request.getParameter("id");
            }
        %>

    </head> 
    <body class="sticky-header left-side-collapsed"  onload="initMap()">
        <section>
            <div class="left-side sticky-left-side">
                <!--logo and iconic logo start-->
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
                        <li><a href="http://localhost:8080/WebApplication1/barChrt.jsp"><i class="lnr lnr-book"></i><span>Bar Chart</span></a></li>
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
                                            <li><a class="fb" href="fbsignin.jsp"><i></i>Sign in with Facebook</a></li>
                                        </ul>
                                    </div>
                                    <div class="sign-right">
                                        <html:form action="/login">

                                            <bean:write name="validatelogin" property="error" filter="false"/>
                                            &nbsp;</td>
                                            <td>Enter your name:</td>
                                            <td><html:text property="name" /></td>
                                            <td>Enter your email:</td>
                                            <td><html:text property="email" /></td>
                                            <td>Enter your password:</td>
                                            <td><html:password property="password"/></td>
                                            <td><html:submit value="Login" /></td>
                                        </html:form>
                                    </div>
                                    <div class="clearfix"></div>								
                                </div>
                                <p>By logging in you agree to our <span>Terms and Conditions</span> and <span>Privacy Policy</span></p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
           
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
        new UISearch(document.getElementById('sb-search'));
                            </script>
                            <!-- //search-scripts -->
                            <!---->
                            <div class="col-md-4 player">
                                <div class="audio-player">
                                    <audio id="audio-player"  controls="controls">
                                        <source src="media/Blue Browne.ogg" type="audio/ogg"></source>
                                        <source src="media/Blue Browne.mp3" type="audio/mpeg"></source>
                                        <source src="media/Georgia.ogg" type="audio/ogg"></source>
                                        <source src="media/Georgia.mp3" type="audio/mpeg"></source></audio>
                                </div>
                                <!---->
                                <script type="text/javascript">
                                    $(function () {
                                        $('#audio-player').mediaelementplayer({
                                            alwaysShowControls: true,
                                            features: ['playpause', 'progress', 'volume'],
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
                               
                                <ul class="next-top">
                                    <li><a class="ar" href="#"> <img src="images/arrow.png" alt=""/></a></li>
                                    <li><a class="ar2" href="#"><img src="images/arrow2.png" alt=""/></i></a></li>

                                </ul>	
                            </div>
                            <div class="col-md-4 login-pop">
                                <div id="loginpop"> <a href="#" id="loginButton"><span>Login <i class="arrow glyphicon glyphicon-chevron-right"></i></span></a><a class="top-sign" href="#" data-toggle="modal" data-target="#myModal5"><i class="fa fa-sign-in"></i></a>
                                </div>

                            </div>
                            <div class="clearfix"> </div>
                        </div>
                        <!-------->
                    </div>
                    <div class="clearfix"></div>
                </div>
                <!-- //header-ends -->
                <div id="page-wrapper">
                    <div class="inner-content">				
                        <div class="music-left">
                            <!--banner-section-->
                            <div class="banner-section">
                                <div class="banner">
                                    <div class="callbacks_container">
                                        <ul class="rslides callbacks callbacks1" id="slider4">
                                            <li>
                                                <div class="banner-img">
                                                    <img src="images/l.jpg" class="img-responsive" alt="">
                                                </div>
                                                <div class="banner-info">
                                                    <a class="trend" href="playlist?name=<%=name%>&&id=<%=id%>">Playlist For You</a>
                                                    <h3>SoundMatch</h3>
                                                    <p>Album by <span>Rock star</span></p>
                                                </div>
                                            </li>
                                            <li>
                                                <div class="banner-img">
                                                    <img src="images/kk.jpg" class="img-responsive" alt="">
                                                </div>
                                                <div class="banner-info">
                                                    <a class="trend" href="playlist?name=<%=name%>&&id=<%=id%>">Playlist For You</a>
                                                    <h3>SoundMatch</h3>
                                                    <p>Album by <span>Rock star</span></p>
                                                </div>
                                            </li>
                                            <li>
                                                <div class="banner-img">
                                                    <img src="images/barr.png" WIDTH="685" HEIGHT="50" BORDER="6" USEMAP="#chart" class="img-responsive" alt="">
                                                </div>	
                                            </li>
                                        </ul>
                                    </div>
                                    <!--banner-->
                                    <script src="js/responsiveslides.min.js"></script>
                                    <script>
                                    $(function () {
                                        // Slideshow 4
                                        $("#slider4").responsiveSlides({
                                            auto: true,
                                            pager: true,
                                            nav: true,
                                            speed: 800,
                                            namespace: "callbacks",
                                            before: function () {
                                                $('.events').append("<li>before event fired.</li>");
                                            },
                                            after: function () {
                                                $('.events').append("<li>after event fired.</li>");
                                            }
                                        });

                                    });
                                    </script>
                                    <div class="clearfix"> </div>
                                </div>
                            </div>	
                            <!--//End-banner-->
                            <link href="css/popuo-box.css" rel="stylesheet" type="text/css" media="all">
                            <script src="js/jquery.magnific-popup.js" type="text/javascript"></script>
                            <script>
                                    $(document).ready(function () {
                                        $('.popup-with-zoom-anim').magnificPopup({
                                            type: 'inline',
                                            fixedContentPos: false,
                                            fixedBgPos: true,
                                            overflowY: 'auto',
                                            closeBtnInside: true,
                                            preloader: false,
                                            midClick: true,
                                            removalDelay: 300,
                                            mainClass: 'my-mfp-zoom-in'
                                        });
                                    });
                            </script>		
                            <!--//pop-up-box -->
                            <div class="albums">
                                <div class="tittle-head">
                                    <h3 class="tittle">Most Listened Songs <span class="new">!!</span></h3>
                                </div>
                            </div>
                            <%
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

                            %> 
                            <div class="albums">
                                <div class="col-md-3 content-grid">
                                    <a href="history?song=<%=rst.getString(1)%>&&link=<%=rst.getString(3)%>&&name=<%=name%>&&id=<%=id%>&&type=<%=rst.getString(5)%>"><img src="images/music.jpg" title="allbum-name"></a>
                                    <a href="history?song=<%=rst.getString(1)%>&&link=<%=rst.getString(3)%>&&name=<%=name%>&&id=<%=id%>&&type=<%=rst.getString(5)%>"><%=rst.getString(1)%></a>
                                </div>	
                            </div>
                            <%
                                }
                            %>
                            <div class="clearfix"> </div>

                            <div class="albums second">
                                <div class="tittle-head">
                                    <h3 class="tittle">Discover <span class="new">View</span></h3>
                                    <a href="album.jsp?name=<%=name%>&&id=<%=id%>"><h4 class="tittle two">See all</h4></a>
                                </div>
                            </div>
                            <%
                                ResultSet rts = statement.executeQuery("SELECT * FROM categorya ORDER BY RAND() LIMIT 6");
                                while (rts.next()) {
                            %>	

                            <div class="albums second">
                                <div class="col-md-3 content-grid">
                                    <a href="history?song=<%=rts.getString(1)%>&&link=<%=rts.getString(3)%>&&name=<%=name%>&&id=<%=id%>%%type=<%=rts.getString(5)%>"><img src="images/music.jpg" title="allbum-name"></a>
                                    <div class="inner-info"><a href="history?song=<%=rts.getString(1)%>&&link=<%=rts.getString(3)%>&&name=<%=name%>&&id=<%=id%>&&type=<%=rts.getString(5)%>"><h5><%=rts.getString(1)%></h5></a>  </div>
                                </div>												
                            </div>
                            <%}%>
                        </div>
                        <!--//music-left-->
                        </br></br>                                                    
                        <div class="music-right">
                            <h4 class="widget-title">Friend's Activity</h4>
                        </div>

                        <%
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
                        %>

                        <div class="music-right">
                            <div class="widget-side">												
                                <ul>
                                    <li>
                                        <div class="song-img">
                                            <img src=<%=pic%> class="img-responsive" alt="" />
                                        </div>
                                        <div class="song-text">
                                            <a href="history?song=<%=rs.getString(2)%>&&link=<%=rs.getString(3)%>&&name=<%=name%>&&id=<%=id%>&&type=<%=rs.getString(5)%>"><%=rs.getString(2)%></a>
                                            <span class="post-date"><%=t%></span>
                                        </div>
                                        <div class="clearfix"></div>
                                    </li>
                                </ul>
                            </div>
                        </div>  
                        <%                          }
                                i++;
                            }

                        %>

                        </br></br></br>
                        <div class="music-right">								
                            <h4 class="widget-title">Top Artists</h4>
                        </div>

                        <%    ResultSet r = statement.executeQuery("SELECT artist,sum(likes) FROM `categorya` group by artist order by likes DESC limit 5;");
                            while (r.next()) {
                        %>        

                        <div class="music-right">											 
                            <div class="widget-side second">
                                <ul>
                                    <li>
                                        <a href="artist.jsp?artist=<%=r.getString(1)%>&&name=<%=name%>&&id=<%=id%>"><%=r.getString(1)%></a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                        <%}%>
                        <div class="clearfix"></div>
                    </div>

                    <div class="review-slider">
                        <div class="tittle-head">
                            <h3 class="tittle">Featured Genres <span class="new"> New</span></h3>
                            <div class="clearfix"> </div>
                        </div>
                        <ul id="flexiselDemo1">
                            <li>
                                <a href="single.html"><img src="images/v1.jpg" alt=""/></a>
                                <div class="slide-title"><h4>Bollywood</h4> </div>
                                <div class="date-city">
                                    <div class="buy-tickets">
                                        <a href="category?type=bollywood&&name=<%=name%>&&id=<%=id%>">LISTEN</a>
                                    </div>
                                </div>
                            </li>
                            <li>
                                <a href="single.html"><img src="images/v2.jpg" alt=""/></a>
                                <div class="slide-title"><h4>EDM</h4></div>
                                <div class="date-city">
                                    <div class="buy-tickets">
                                        <a href="category?type=EDM&&name=<%=name%>&&id=<%=id%>">LISTEN</a>
                                    </div>
                                </div>
                            </li>
                            <li>
                                <a href="single.html"><img src="images/v3.jpg" alt=""/></a>
                                <div class="slide-title"><h4>POP</h4></div>
                                <div class="date-city">
                                    <div class="buy-tickets">
                                        <a href="category?type=POP&&name=<%=name%>&&id=<%=id%>">LISTEN</a>
                                    </div>
                                </div>
                            </li>
                            <li>
                                <a href="single.html"><img src="images/v4.jpg" alt=""/></a>
                                <div class="slide-title"><h4>METAL</h4></div>
                                <div class="date-city">
                                    <div class="buy-tickets">
                                        <a href="category?type=METAL&&name=<%=name%>&&id=<%=id%>">LISTEN</a>
                                    </div>
                                </div>
                            </li>
                            <li>
                                <a href="single.html"><img src="images/v5.jpg" alt=""/></a>
                                <div class="slide-title"><h4>PROGRESSIVE </h4></div>
                                <div class="date-city">
                                    <div class="buy-tickets">
                                        <a href="category?type=PROGRESSIVE&&name=<%=name%>&&id=<%=id%>">LISTEN</a>
                                    </div>
                                </div>
                            </li>
                            <li>
                                <a href="single.html"><img src="images/v6.jpg" alt=""/></a>
                                <div class="slide-title"><h4>ROCK</h4></div>
                                <div class="date-city">
                                    <div class="buy-tickets">
                                        <a href="category?type=ROCK&&name=<%=name%>&&id=<%=id%>">LISTEN</a>
                                    </div>
                                </div>
                            </li>
                            <li>
                                <a href="single.html"><img src="images/v6.jpeg" alt=""/></a>
                                <div class="slide-title"><h4>ALTERNATIVE ROCK</h4></div>
                                <div class="date-city">
                                    <div class="buy-tickets">
                                        <a href="category?type=ALTERNATIVE ROCK&&name=<%=name%>&&id=<%=id%>">LISTEN</a>
                                    </div>
                                </div>
                            </li>
                        </ul>
                        <script type="text/javascript">
                            $(window).load(function () {

                                $("#flexiselDemo1").flexisel({
                                    visibleItems: 5,
                                    animationSpeed: 1000,
                                    autoPlay: true,
                                    autoPlaySpeed: 3000,
                                    pauseOnHover: false,
                                    enableResponsiveBreakpoints: true,
                                    responsiveBreakpoints: {
                                        portrait: {
                                            changePoint: 480,
                                            visibleItems: 2
                                        },
                                        landscape: {
                                            changePoint: 640,
                                            visibleItems: 3
                                        },
                                        tablet: {
                                            changePoint: 800,
                                            visibleItems: 4
                                        }
                                    }
                                });
                            });
                        </script>
                        <script type="text/javascript" src="js/jquery.flexisel.js"></script>	
                    </div>
                </div>
                <div class="clearfix"></div>
                <!--body wrapper end-->
                <!-- /w3l-agile -->
            </div>
            <footer>
                <p>SoundMatch</p>
            </footer>
        </section>
        <%
            } catch (Exception e) {
                out.println("wrong entry " + e);
            }
        %>

        <script src="js/jquery.nicescroll.js"></script>
        <script src="js/scripts.js"></script>
        <!-- Bootstrap Core JavaScript -->
        <script src="js/bootstrap.js"></script>
    </body>
</html>