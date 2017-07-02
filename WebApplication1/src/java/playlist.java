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

public class playlist extends HttpServlet 
{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String name=request.getParameter("name");
        String id=request.getParameter("id");
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
            try
           {
               int i=0,mcount=0;
               String music="";
               String[] m={""};
           Class.forName("com.mysql.jdbc.Driver");
           Connection connection = null; 
           connection = DriverManager.getConnection("jdbc:mysql://localhost/soundMatch","root","");
           PreparedStatement s = connection.prepareStatement("select * from data");
           ResultSet rs=s.executeQuery();
           while(rs.next())
           {
                music=rs.getString(4);
                mcount=rs.getInt(5);
                m=music.split(",");
           }
           while(i!=mcount)
           {
               PreparedStatement ss=connection.prepareStatement("select distinct artist from categorya");
               ResultSet rst=ss.executeQuery();
               while(rst.next())
               {
                  /* if(m[i].compareToIgnoreCase(rst.getString(1))==0)
                   {
                        out.println("<h1>equal"+m[i]+i+"</h1>");
                   }
                   else*/ if(m[i].toLowerCase().contains(rst.getString(1).toLowerCase()))
                   {
                        PreparedStatement s1=connection.prepareStatement("select * from categorya where artist='"+rst.getString(1)+"' order by RAND() limit 2");
                        ResultSet rts=s1.executeQuery();
                        while(rts.next())
                        {
                        out.println("<div class=\"col-md-3 artist-grid\">\n" +
" <a href=\"history?type="+rts.getString(5)+"&&song="+rts.getString(1)+"&&link="+rts.getString(3)+"&&name="+name+"&&id="+id+"\" onclick=\"location.href=this.href+;return false;\"><img src=\"images/music.jpg\" title=\"allbum-name\"></a>\n" +
" <a href=\"history?type="+rts.getString(5)+"&&song="+rts.getString(1)+"&&link="+rts.getString(3)+"&&name="+name+"&&id="+id+"\" onclick=\"location.href=this.href;return false;\"><i class=\"glyphicon glyphicon-play-circle\"></i></a>\n" +
" <a class=\"art\" href=\"history?type="+rts.getString(5)+"&&song="+rts.getString(1)+"&&link="+rts.getString(3)+"&&name="+name+"&&id="+id+"\" onclick=\"location.href=this.href;return false;\">"+rts.getString(1)+"</a>\n" +
" </div>\n" +"");
                        }
                   }
               }
               i++;
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
