package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import models.Comment;
import java.io.OutputStream;
import models.Post;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import database.addPost;
import database.connect;
import java.sql.Connection;
import java.io.InputStream;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css\" integrity=\"sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS\" crossorigin=\"anonymous\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/homepage.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js\" integrity=\"sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js\" integrity=\"sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <link href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css'>\n");
      out.write("    <script src=\"https://kit.fontawesome.com/a076d05399.js\"></script>\n");
      out.write("    <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" />\n");
      out.write("    </head>\n");
      out.write("<style>\n");
      out.write("    @import url('https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap');\n");
      out.write("    body {\n");
      out.write("  background-color: #eee;\n");
      out.write("  font-family: 'Poppins', sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".time {\n");
      out.write("  font-size: 9px !important\n");
      out.write("}\n");
      out.write("\n");
      out.write(".socials i {\n");
      out.write("  margin-right: 14px;\n");
      out.write("  font-size: 17px;\n");
      out.write("  color: #d2c8c8;\n");
      out.write("  cursor: pointer\n");
      out.write("}\n");
      out.write("\n");
      out.write(".feed-image img {\n");
      out.write("  width: 100%;\n");
      out.write("  height: auto;\n");
      out.write("}\n");
      out.write("body {\n");
      out.write("    background: #eee;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".date {\n");
      out.write("    font-size: 11px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".comment-text {\n");
      out.write("    font-size: 12px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".fs-12 {\n");
      out.write("    font-size: 12px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".shadow-none {\n");
      out.write("    box-shadow: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".name {\n");
      out.write("    color: #007bff;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".cursor:hover {\n");
      out.write("    color: blue;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".cursor {\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".textarea {\n");
      out.write("    resize: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#gen {\n");
      out.write("       margin-right: auto;\n");
      out.write("      }\n");
      out.write("#exampleFormControlFile1 {\n");
      out.write("           margin-top: 3%;\n");
      out.write("        }\n");
      out.write(".list{\n");
      out.write("  padding:2.3%;\n");
      out.write(" \n");
      out.write("}\n");
      out.write("a{\n");
      out.write("  color: rgb(63, 61, 61);\n");
      out.write("  font-weight: 500;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".list a:hover{\n");
      out.write("  color: blue;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<!--<script>\n");
      out.write("     var count=0;\n");
      out.write("     function dk(str)\n");
      out.write("     {\n");
      out.write("       alert(str);\n");
      out.write("       console.log(str);\n");
      out.write("//       if(count%2===0)\n");
      out.write("//       { \n");
      out.write("//         mk();\n");
      out.write("//         count+=1;\n");
      out.write("//\n");
      out.write("//       }\n");
      out.write("//       else{\n");
      out.write("//             mk1();\n");
      out.write("//             count+=1;\n");
      out.write("//       }\n");
      out.write("     }\n");
      out.write("    function mk()\n");
      out.write("         {  \n");
      out.write("          var s=document.querySelector(\"#sm\").style.visibility=\"visible\";\n");
      out.write("          var m=document.querySelector('.sm').style.display=\"unset\";\n");
      out.write("      }\n");
      out.write("    function mk1()\n");
      out.write("    {\n");
      out.write("      var s=document.querySelector(\"#sm\").style.visibility=\"hidden\";\n");
      out.write("      var m=document.querySelector(\".sm\").style.display=\"none\";\n");
      out.write("      // var k=document.querySelector(\".sm\").style.margin-left=\"20%\";\n");
      out.write("    }\n");
      out.write("      </script>-->\n");
      out.write("<script>\n");
      out.write("        var d={};\n");
      out.write("        function dk(z)\n");
      out.write("        {   \n");
      out.write("            var i = 's'.concat(z);\n");
      out.write("            if(d[i]===undefined)\n");
      out.write("            {\n");
      out.write("                d[i]=1;\n");
      out.write("                console.log(d);\n");
      out.write("            }\n");
      out.write("            else\n");
      out.write("            {\n");
      out.write("                d[i]=d[i]+1;\n");
      out.write("                console.log(d);\n");
      out.write("                console.log(\"2nd\");\n");
      out.write("            }\n");
      out.write("            if(d[i]%2!==0)\n");
      out.write("            {   \n");
      out.write("                 var s=document.querySelector(\"#\"+i).style.visibility=\"visible\";\n");
      out.write("                 var m=document.querySelector(\"#\"+ i).style.display=\"unset\";\n");
      out.write("            }\n");
      out.write("            if(d[i]%2===0)\n");
      out.write("            {    \n");
      out.write("                 var s=document.querySelector(\"#\"+i).style.visibility=\"hidden\";\n");
      out.write("                 var m=document.querySelector(\"#\"+ i).style.display=\"none\";\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        var e={};\n");
      out.write("        function like(x){\n");
      out.write("            var i = 'r'.concat(x);\n");
      out.write("            var j = 'rr'.concat(x);\n");
      out.write("            if(e[i]===undefined)\n");
      out.write("            {\n");
      out.write("                e[i]=1;\n");
      out.write("                console.log(e);\n");
      out.write("            }\n");
      out.write("            else\n");
      out.write("            {\n");
      out.write("                e[i]=e[i]+1;\n");
      out.write("                console.log(e);\n");
      out.write("                console.log(\"2nd\");\n");
      out.write("            }\n");
      out.write("            if(e[i]%2!==0)\n");
      out.write("            {   \n");
      out.write("                 var s=document.querySelector(\".\"+i).style.color=\"blue\";\n");
      out.write("                 var m=document.querySelector(\".\"+j).style.color=\"blue\";\n");
      out.write("            }\n");
      out.write("            if(e[i]%2===0)\n");
      out.write("            {    \n");
      out.write("                 var s=document.querySelector(\".\"+i).style.color=\"black\";\n");
      out.write("                 var m=document.querySelector(\".\"+j).style.color=\"black\";\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("       \n");
      out.write("    </script>\n");
      out.write("      <body>\n");
      out.write("        ");
 
          
          Cookie[] cookie = request.getCookies();
          if(cookie != null){
              for(int i=0;i<cookie.length;i++){
                  String cName = cookie[i].getName();
                  String cValue = cookie[i].getValue();
                  if(cName.equals("username")){
                      break;
                  }else if(i == (cookie.length-1)){
                      response.sendRedirect("login.jsp");
                      return;
                  }
                //  i++;
              }
          }else{
              response.sendRedirect("login.jsp");
              return;
          }
            
      out.write("\n");
      out.write("\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("            <img src=\"images/logo.png\" width=\"40px\"  class=\"d-inline-block align-top\" alt=\"\">\n");
      out.write("             GamesUp\n");
      out.write("        </a>\n");
      out.write("        \n");
      out.write("        <form class=\"form-inline my-2 my-lg-0\" action='./profile' method=\"get\">\n");
      out.write("            <div class=\"form-outline\">                \n");
      out.write("                <input type=\"search\" name=\"username\" id=\"form1\" class=\"form-control\"  placeholder=\"Search for an user\" aria-label=\"Search\" />\n");
      out.write("                                \n");
      out.write("              </div>\n");
      out.write(" \n");
      out.write("          </form>\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("          <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("      \n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("          <ul class=\"navbar-nav ml-auto\">\n");
      out.write("            <li class=\"nav-item active\">\n");
      out.write("              <a class=\"nav-link\" href=\"./home\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link\" href=\"http://localhost:3000/index.html\">Groups</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"navbar.html\">Games</a>\n");
      out.write("            </li>\n");
      out.write("            ");

                                    String uname = "";
                                   if(cookie != null){
                                       for(int j=0;j<cookie.length;j++){
                                         String cName = cookie[j].getName();
                                         String cValue = cookie[j].getValue();
                                        if(cName.equals("username")){
                                              uname = cValue;
                                        }
                                       } 
      out.write("\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"./profile?username=");
      out.print( uname );
      out.write("\">Profile</a>\n");
      out.write("            </li>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("          </ul>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("        <!--</header>-->\n");
      out.write("        <div class=\"container-fluid \" style=\"background: burlywood;\">\n");
      out.write("        <div class=\"page-inner no-page-title\">\n");
      out.write("             <!--start page main wrapper--> \n");
      out.write("<!--             <div id=\"main-wrapper\"> -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-4 col-xl-3 centerl\" >\n");
      out.write("                        <div class=\"card card-white grid-margin\">\n");
      out.write("                            <div class=\"card-heading clearfix\">\n");
      out.write("                                <h4 class=\"card-title\">User Profile</h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-body user-profile-card mb-3\">\n");
      out.write("                                <img src=\"images/avatar.jpg\" class=\"user-profile-image rounded-circle\" alt=\"\" />\n");
      out.write("                                <h4 class=\"text-center h6 mt-2\">");
      out.print( uname );
      out.write("</h4>\n");
      out.write("                                <p class=\"text-center small\">Pro Gamer</p>\n");
      out.write("<!--                                <button class=\"btn btn-theme btn-sm\">Follow</button>\n");
      out.write("                                <button class=\"btn btn-theme btn-sm\">Message</button>-->\n");
      out.write("                            </div>\n");
      out.write("                            <hr />\n");
      out.write("                            <div class=\"card-heading clearfix mt-3\">\n");
      out.write("                                <h4 class=\"card-title\">User Profile</h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-body mb-3\">\n");
      out.write("                                <a href=\"#\" class=\"label label-success mb-2\">COC</a>\n");
      out.write("                                <a href=\"#\" class=\"label label-success mb-2\">PUBG</a>\n");
      out.write("                                <a href=\"#\" class=\"label label-success mb-2\">Call of Duty</a>\n");
      out.write("                                <a href=\"#\" class=\"label label-success mb-2\">Pro player</a>\n");
      out.write("                                <a href=\"#\" class=\"label label-success mb-2\">best player</a>\n");
      out.write("                                <a href=\"#\" class=\"label label-success mb-2\">WWE</a>\n");
      out.write("<!--                                <a href=\"#\" class=\"label label-success\"></a>\n");
      out.write("                                <a href=\"#\" class=\"label label-success\">UX</a>-->\n");
      out.write("                            </div>\n");
      out.write("                            <hr />\n");
      out.write("                            <div class=\"card-heading clearfix mt-3\">\n");
      out.write("                                <h4 class=\"card-title\">About</h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-body mb-3\">\n");
      out.write("                                <p class=\"mb-0\">I am a full time Gamer.I play all types of games </p>\n");
      out.write("                            </div>\n");
      out.write("                            <hr />\n");
      out.write("                            <div class=\"card-heading clearfix mt-3\">\n");
      out.write("                                <h4 class=\"card-title\">Contact Information</h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <div class=\"table-responsive\">\n");
      out.write("                                    <table class=\"table table-borderless mb-0 text-muted\">\n");
      out.write("                                        <tbody>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th scope=\"row\">Email:</th>\n");
      out.write("                                                <td>");
      out.print( uname );
      out.write("</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th scope=\"row\">Phone:</th>\n");
      out.write("                                                <td>(+44) 123 456 789</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th scope=\"row\">Address:</th>\n");
      out.write("                                                <td>Dubai main road , Dubai.</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("        <div class=\"col-lg-6\">             \n");
      out.write("        <div class=\"container \">\n");
      out.write("        <div class=\"d-flex justify-content-center row\">\n");
      out.write("            <div class=\"col-md-8\">\n");
      out.write("                <div class=\"feed p-2\">\n");
      out.write("                    <div class=\"d-flex flex-row justify-content-between align-items-center p-4 bg-white border\">\n");
      out.write("                         \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <form method=\"post\" action=\"");
      out.print( request.getContextPath() );
      out.write("/home\" enctype=\"multipart/form-data\" >\n");
      out.write("                            <textarea name=\"caption\" class=\"form-control\" id=\"exampleFormControlTextarea1\" rows=\"3\" cols=\"100\" placeholder=\"Start a post\"></textarea>\n");
      out.write("                            <input type=\"file\" class=\"form-control-file\" id=\"exampleFormControlFile1\" name=\"img\" accept=\"image/*\">\n");
      out.write("                                <div class=\"form-group p-3\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-primary float-right\" id=\"gen\" value=\"Submit\">\n");
      out.write("                                        Post\n");
      out.write("                                    </button>\n");
      out.write("                                    <button class=\"btn btn-default float-right\">\n");
      out.write("                                        Cancel\n");
      out.write("                                    </button>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                          </div>\n");
      out.write("                        <div class=\"feed-icon px-2\"><i class=\"fa fa-long-arrow-up text-black-50\"></i></div>\n");
      out.write("                    </div>\n");
      out.write("                    ");
  Post FeedArray[] = (Post[])request.getAttribute("feed"); 
      out.write("\n");
      out.write("                    ");
 if(FeedArray.length > 0 ) { 
      out.write("\n");
      out.write("                    ");
  for(int i = 0;i<FeedArray.length;i++) { 
      out.write("\n");
      out.write("                    ");
  String id = "s"+String.valueOf(i); 
      out.write("\n");
      out.write("                    ");
  String id2 = "r"+String.valueOf(i); 
      out.write("\n");
      out.write("                    ");
  String id3 = "rr"+String.valueOf(i); 
      out.write("\n");
      out.write("                    ");
  System.out.println(id);                                    
      out.write("\n");
      out.write("                    <div class=\"bg-white border mt-2\">\n");
      out.write("                        <div>\n");
      out.write("                            <div class=\"d-flex flex-row justify-content-between align-items-center p-2 border-bottom\">\n");
      out.write("                                <div class=\"d-flex flex-row align-items-center feed-text px-2\"><img class=\"rounded-circle\" src=\"https://res.cloudinary.com/dxfq3iotg/image/upload/v1574583336/AAA/4.jpg\" width=\"50\" height=\"45S\">\n");
      out.write("                                    <div class=\"d-flex flex-column flex-wrap ml-2\"><span class=\"font-weight-bold\"> ");
      out.print( FeedArray[i].getUsername() );
      out.write("                 </span><span class=\"text-black-50 time\">40 minutes ago</span></div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"feed-icon px-2\"><i class=\"fa fa-ellipsis-v text-black-50\"></i></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"p-2 px-3\"><span>  ");
      out.print( FeedArray[i].getCaption() );
      out.write("                    </span></div>\n");
      out.write("                        <div class=\"feed-image p-2 px-3\"><img class=\"img-fluid img-responsive\" src=\"data:image/jpg;base64,");
      out.print( FeedArray[i].getBase64Image() );
      out.write("\"></div>\n");
      out.write("                        <div class=\"bg-white\">\n");
      out.write("                            <div class=\"d-flex flex-row fs-12\">\n");
      out.write("                                <div class=\"like p-2 cursor\"><i class=\"fa fa-thumbs-up ");
      out.print( id2);
      out.write("\" onclick=\"like(");
      out.print( i );
      out.write(")\"  ></i><span onclick=\"like(");
      out.print( i );
      out.write(")\"  class=\"ml-1 ");
      out.print( id3);
      out.write("\">Like</span></div>\n");
      out.write("                                <div class=\"like p-2 cursor\"><i onclick=\"\" class=\"fa fa-comment\"></i><span onclick=\"dk(");
      out.print( i );
      out.write(")\" class=\"ml-1\">Comment</span></div>\n");
      out.write("                                <div class=\"like p-2 cursor\"><i class=\"fa fa-share\"></i><span class=\"ml-1\">Share</span></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                         \n");
      out.write("                        <div class=\"bg-light p-2\">\n");
      out.write("                            <div id=\"");
      out.print( id );
      out.write("\" class=\"sm\" >\n");
      out.write("                               ");
 Comment comments[] =  FeedArray[i].getComments(); 
      out.write("\n");
      out.write("                               ");
 if(comments.length > 0){ 
      out.write("\n");
      out.write("                               ");
 for(int k=0;k<comments.length;k++){ 
      out.write("\n");
      out.write("\n");
      out.write("                                <div class=\"comment-widgets\">\n");
      out.write("                                    <div class=\"d-flex flex-row comment-row m-t-0\">\n");
      out.write("                                       <div class=\"p-2\"><img src=\"https://res.cloudinary.com/dxfq3iotg/image/upload/v1574583336/AAA/4.jpg\" alt=\"user\" width=\"50\" class=\"rounded-circle\"></div>\n");
      out.write("                                       <div class=\"comment-text w-100\">\n");
      out.write("                                           <h6 class=\"font-medium\">   ");
      out.print( comments[k].getCommentedUser()  );
      out.write("          </h6> <span class=\"m-b-15 d-block\">  ");
      out.print( comments[k].getComment() );
      out.write("           </span>\n");
      out.write("                                       </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                               ");
  } 
      out.write("\n");
      out.write("                               ");
 }else if(comments.length == 0){ 
      out.write("\n");
      out.write("                                     <div class=\"comment-widgets\">\n");
      out.write("                                    <div class=\"d-flex flex-row comment-row m-t-0\">\n");
      out.write("                                       <!--<div class=\"p-2\"><img src=\"https://res.cloudinary.com/dxfq3iotg/image/upload/v1574583336/AAA/4.jpg\" alt=\"user\" width=\"50\" class=\"rounded-circle\"></div>-->\n");
      out.write("                                       <div class=\"comment-text w-100\">\n");
      out.write("                                           <h6 class=\"font-medium\"></h6> <span class=\"m-b-15 d-block p-2\">No comments available </span>\n");
      out.write("                                       </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                               \n");
      out.write("                               \n");
      out.write("                              ");
 } 
      out.write("\n");
      out.write("                               \n");
      out.write("<!--                                <div class=\"comment-widgets\">\n");
      out.write("                                    <div class=\"d-flex flex-row comment-row m-t-0\">\n");
      out.write("                                       <div class=\"p-2\"><img src=\"https://res.cloudinary.com/dxfq3iotg/image/upload/v1574583336/AAA/4.jpg\" alt=\"user\" width=\"50\" class=\"rounded-circle\"></div>\n");
      out.write("                                       <div class=\"comment-text w-100\">\n");
      out.write("                                           <h6 class=\"font-medium\">James Thomas</h6> <span class=\"m-b-15 d-block\">This is awesome website. I would love to comeback again. </span>\n");
      out.write("                                       </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>-->\n");
      out.write("                            </div>\n");
      out.write("                              \n");
      out.write("                         <div style=\"padding: 10px;\">\n");
      out.write("                            <form method=\"post\" action=\"");
      out.print( request.getContextPath() );
      out.write("/homeAddcomment\">\n");
      out.write("\n");
      out.write("                            <div class=\"d-flex flex-row align-items-start\">\n");
      out.write("                                <img class=\"rounded-circle\" src=\"https://res.cloudinary.com/dxfq3iotg/image/upload/v1574583336/AAA/4.jpg\" width=\"35\" height=\"30\">\n");
      out.write("                                <textarea name=\"comment\" class=\"form-control ml-1 shadow-none textarea\" placeholder=\"Add a comment\"></textarea>\n");
      out.write("                            </div>\n");
      out.write("                                <input type=\"hidden\" name=\"authorname\" value=\"");
      out.print( FeedArray[i].getUsername());
      out.write("\" />\n");
      out.write("                                <input type=\"hidden\" name=\"postno\" value=\"");
      out.print( FeedArray[i].getPostNo() );
      out.write("\" />\n");
      out.write("                                <input type=\"hidden\" name=\"commentTablename\" value=\"");
      out.print( FeedArray[i].getCommentTableName() );
      out.write("\" />\n");
      out.write("\n");
      out.write("                            <div class=\"mt-2 text-right\">\n");
      out.write("                                ");

                                    String username = "";
                                   if(cookie != null){
                                       for(int j=0;j<cookie.length;j++){
                                         String cName = cookie[j].getName();
                                         String cValue = cookie[j].getValue();
                                        if(cName.equals("username")){
                                              username = cValue;
                                        }
                                       } 
      out.write("\n");
      out.write("                             <button class=\"btn btn-primary btn-sm shadow-none\" type=\"submit\" name=\"commentername\" value=\"");
      out.print( username );
      out.write("\">comment</button>\n");
      out.write("                             ");
 } 
      out.write("\n");
      out.write("                                <button class=\"btn btn-outline-primary btn-sm ml-1 shadow-none\" type=\"button\" >Cancel</button>\n");
      out.write("                            </div>\n");
      out.write("                            </form>\n");
      out.write("                         </div>\n");
      out.write("                        </div>\n");
      out.write("                            \n");
      out.write("                    </div>\n");
      out.write("                             ");
 }
      out.write("\n");
      out.write("                            ");
  } 
      out.write("\n");
      out.write("                </div>\n");
      out.write("                               \n");
      out.write("                   \n");
      out.write("        </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("        <div class=\"col-lg-1 col-xl-3\">\n");
      out.write("        <div class=\"card card-white grid-margin\">\n");
      out.write("            <div class=\"card-heading clearfix\">\n");
      out.write("                <h4 class=\"card-title\">Gamesup News</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-body\" style=\"padding-top: 30px;\">\n");
      out.write("                <ul >\n");
      out.write("                  <li class=\"list\"><a href=\"https://www.bgr.in/gaming/faug-launch-in-india-fearless-and-united-guards-game-hit-5-million-downloads-and-becomes-top-free-game-on-google-play-store-know-how-to-download-faug-on-android-smartphone-936871/\">FAU-G crosses 5 million downloads on Google Play store, becomes top free game app</a></li>\n");
      out.write("                  <li class=\"list\"><a href=\"https://www.bgr.in/gaming/tesla-model-s-cyberpunk-witcher-3-sony-ps5-gaming-elon-musk-936570/\">Elon Musk says his car can play Cyberpunk 2077</a></li>\n");
      out.write("                  <li class=\"list\"><a href=\"https://www.bgr.in/gaming/pubg-mobile-global-championship-2020-how-to-watch-live-935577/\">PUBG Mobile Global Championship 2020: How to watch live, everything you need to know</a></li>\n");
      out.write("                  <li class=\"list\"><a href=\"https://www.bgr.in/gaming/ces-2021-razer-unveils-smart-mask-and-gaming-chair-with-a-rollout-display-933458/\">CES 2021: Razer unveils smart mask and gaming chair with a rollout display</a></li>\n");
      out.write("                  <li class=\"list\"><a href=\"https://www.bgr.in/gaming/gta-6-grand-theft-auto-female-protagonist-story-mode-launch-933264/\">Grand Theft Auto 6 story mode could let you play as a female lead</a></li>\n");
      out.write("                  <li class=\"list\"><a href=\"https://www.bgr.in/gaming/among-us-is-the-most-downloaded-mobile-game-for-2020-933041/\">Among Us was the most downloaded mobile game for 2020</a></li>\n");
      out.write("                  <li class=\"list\"><a href=\"https://www.bgr.in/gaming/among-us-is-the-most-downloaded-mobile-game-for-2020-933041/\">Minecraft Earth by Microsoft is shutting down on 30 June</a></li>\n");
      out.write("                  <li class=\"list\"><a href=\"https://www.bgr.in/news/minecraft-earth-by-microsoft-is-shutting-down-on-30-june-931768/\">Assassin's Creed Valhalla is the best selling game in the franchise</a></li>\n");
      out.write("                  <li class=\"list\"><a href=\"https://www.bgr.in/gaming/garena-free-fire-update-weapons-new-training-map-and-more-926679/\">Garena Free Fire update: Revamped training map, new Vector Akimbo SMG & more</a></li>\n");
      out.write("                  <li class=\"list\"><a href=\"https://www.bgr.in/news/minecraft-earth-by-microsoft-is-shutting-down-on-30-june-931768/\">FarmVille to be shut down this year; will still be playable until December 31</a></li>\n");
      out.write("                  <li class=\"list\"><a href=\"https://www.bgr.in/gaming/assassins-creed-valhalla-most-sold-game-929534/\">Ubisoft Forward: Prince of Persia The Sands of Time Remake, Fenyx Rising announced</a></li>\n");
      out.write("                  <li class=\"list\"><a href=\"https://www.bgr.in/gaming/watch-dogs-legion-review-price-gameplay-review-india-922228/\">Epic Games to stop “Sign-in with Apple” logging from September 11</a></li>\n");
      out.write("                  <!-- <li><a href=\"\"></a></li>\n");
      out.write("                  <li><a href=\"\"></a></li>\n");
      out.write("                  <li><a href=\"\"></a></li>\n");
      out.write("                  <li><a href=\"\"></a></li> -->\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("  </div>  \n");
      out.write("             </div>\n");
      out.write("        </div>                   \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
