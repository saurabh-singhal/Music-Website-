import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class category extends HttpServlet 
{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String pic = "http://graph.facebook.com/1793661520875876/picture?type=square";
        String name=request.getParameter("name");
        String id=request.getParameter("id");
        String type=request.getParameter("type");
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
"        <title>artsists</title>\n" +
"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" +
"<meta name=\"keywords\" content=\"Mosaic Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n" +
"Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n" +
"<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n" +
"<link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\n" +
"<link href=\"css/style.css\" rel='stylesheet' type='text/css' />\n" +
"<link href=\"css/font-awesome.css\" rel=\"stylesheet\"> \n" +
"<link rel=\"stylesheet\" href=\"css/icon-font.css\" type='text/css' />\n" +
"<script src=\"js/jquery-2.1.4.js\"></script>");            
            out.println("</head>");
            out.println("<body>");
           out.println("<h1>Freinds</h1>");
           out.println("<body class=\"sticky-header left-side-collapsed\"  onload=\"initMap()\">\n" +
"    <section>\n" +
"		<div class=\"left-side sticky-left-side\">\n" +
"			<div class=\"logo\">\n" +
"				<h1><a href=\"index.jsp?name="+name+"&&id="+id+"\">Mosai<span>c</span></a></h1>\n" +
"			</div>\n" +
"			<div class=\"logo-icon text-center\">\n" +
"				<a href=\"index.jsp?name="+name+"&&id="+id+"\">M </a>\n" +
"			</div>\n" +
"					<div class=\"left-side-inner\">\n" +
"			</div>\n" +
"		</div>\n" +
"		<div class=\"main-content\">\n" +
"			<div class=\"header-section\">\n" +
"			<a class=\"toggle-btn  menu-collapsed\"><i class=\"fa fa-bars\"></i></a>\n" +
"				<div class=\"menu-right\">\n" +
"					<div class=\"profile_details\">		\n" +
"								</div>\n" +
"				</div>\n" +
"				</div>\n" +
"                    <h1><tr><td>"+type+" Music Group !!</td></tr></h1>   ");
           try
           {
           Class.forName("com.mysql.jdbc.Driver");
           Connection connection = null; 
           connection = DriverManager.getConnection("jdbc:mysql://localhost/soundMatch","root","");
           PreparedStatement s = connection.prepareStatement("select * from history where type='"+type+"'");
           ResultSet rt=s.executeQuery();                     
           while(rt.next())
           {
               pic = "http://graph.facebook.com/" + rt.getString(1) + "/picture?type=square";
               out.println(" <a><img src="+pic+"></a>\n" +  "");
           }
           out.println("</br></br>");
          out.println("<h1>Songs Among Them....</h1>");
           PreparedStatement ss = connection.prepareStatement("select * from history where type='"+type+"'");
           ResultSet rts=ss.executeQuery();
                        while(rts.next())
                        {
                        out.println("<div class=\"col-md-3 artist-grid\">\n" +
" <a href=\"history?type="+rts.getString(5)+"&&song="+rts.getString(1)+"&&link="+rts.getString(3)+"&&name="+name+"&&id="+id+"\" onclick=\"location.href=this.href+;return false;\"><img src=\"images/music.jpg\" title=\"allbum-name\"></a>\n" +
" <a href=\"history?type="+rts.getString(5)+"&&song="+rts.getString(1)+"&&link="+rts.getString(3)+"&&name="+name+"&&id="+id+"\" onclick=\"location.href=this.href;return false;\"><i class=\"glyphicon glyphicon-play-circle\"></i></a>\n" +
" <a class=\"art\" href=\"history?type="+rts.getString(5)+"&&song="+rts.getString(1)+"&&link="+rts.getString(3)+"&&name="+name+"&&id="+id+"\" onclick=\"location.href=this.href;return false;\">"+rts.getString(2)+"</a>\n" +
" </div>\n" +"");
                        }
           }
             catch(Exception e)
                {
                    e.printStackTrace();
                }
            out.println("<footer><p>soundMatch</p></footer>");
          out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
