/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.13
 * Generated at: 2018-12-14 12:09:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ua.myhospital.model.Room;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/Css/HidenTable.css", Long.valueOf(1544729070000L));
    _jspx_dependants.put("/WEB-INF/Css/main.css", Long.valueOf(1544734724000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1543615010000L));
    _jspx_dependants.put("/WEB-INF/Css/register.css", Long.valueOf(1544732562000L));
    _jspx_dependants.put("jar:file:/C:/Users/eskan/IdeaProjects/Github/Hospital/apache-tomcat-9.0.13/webapps/Hospital/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153374282000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("ua.myhospital.model.Room");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Kyrsach</title>\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("        ");
      out.write("#hider {\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: -9999px;\r\n");
      out.write("    left: -9999px;\r\n");
      out.write("}\r\n");
      out.write("#hider:checked + .content {\r\n");
      out.write("    display: block;\r\n");
      out.write("}\r\n");
      out.write("#clickme {\r\n");
      out.write("\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write(".content {\r\n");
      out.write("    margin-top: 10px;\r\n");
      out.write("    display: none;\r\n");
      out.write("}");
      out.write("\n");
      out.write("        ");
      out.write("body{\r\n");
      out.write("\tmargin: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container{\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tdisplay: grid;\r\n");
      out.write("\tgrid-template-areas: \"header header header\"\r\n");
      out.write("\t                     \"left main right\" \r\n");
      out.write("\t                     \"footer footer footer\";\r\n");
      out.write("\tgrid-template-columns: 1fr 9fr 1fr;\r\n");
      out.write("\tgrid-template-rows:    1fr 9fr 1fr;\r\n");
      out.write("\tmin-height:auto;\r\n");
      out.write("\tgrid-gap: 0px;\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write(".header{\r\n");
      out.write("\tgrid-area: header;\r\n");
      out.write("\tbackground: #fff1c8;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\t/*grid-template-columns: 400px;\r\n");
      out.write("\tgrid-template-rows: 400px*/\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".main{\t\r\n");
      out.write("\tgrid-area: main;\r\n");
      out.write("\tbackground: #fff;\r\n");
      out.write("\tdisplay: flex;\r\n");
      out.write("\t/*grid-template: 300px 1fr 500px/300px 1fr 300px;*/\r\n");
      out.write("\tjustify-content: center;\r\n");
      out.write("\tflex-direction: column;\r\n");
      out.write("\tgrid-template-rows: 0.5fr;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".content{\r\n");
      out.write("\tgrid-area: content;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer{\r\n");
      out.write("\tgrid-area: footer;\r\n");
      out.write("\tbackground: rgb(39,37,31);\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bigGrid{\r\n");
      out.write("\tdisplay: grid;\r\n");
      out.write("\theight: 480px;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tbackground-color: red;\r\n");
      out.write("\r\n");
      out.write("\tgrid-template-areas: \"myGrid  smallGrida smallGridc\"\r\n");
      out.write("\t                     \"myGrid  smallGridb smallGridd\" ;\r\n");
      out.write("\r\n");
      out.write("\tgrid-template-columns: 2fr 1fr 1fr;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".myGrid{\r\n");
      out.write("\tdisplay: grid;\r\n");
      out.write("\tgrid-area: myGrid;\r\n");
      out.write("\r\n");
      out.write("\tbackground: #000;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\t/*grid-template-areas: \"smalltablea smalltablec\"\r\n");
      out.write("\t                     \"smalltableb smalltabled\" ;*/\r\n");
      out.write("\tgrid-template-rows: 2fr;\r\n");
      out.write("\tbackground-image: url(\"https://www.mayoclinic.org/-/media/kcms/gbs/patient-consumer/images/2018/09/24/18/44/home-young-boy-outside-6col-3663200-0024r.jpg\");\r\n");
      out.write("\tbackground-size: 100% 100%;\r\n");
      out.write("\t                     \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*.table img{\r\n");
      out.write("\theight: 100%\r\n");
      out.write("\tweight: 100%;\r\n");
      out.write("}*/\r\n");
      out.write("\r\n");
      out.write(".smallGrid{\r\n");
      out.write("\tbackground: #fff;\r\n");
      out.write("\tcolor: #000;\r\n");
      out.write("\tgrid-template-rows: 0.25fr;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".smallGrid p{\r\n");
      out.write("\tmargin: 0px;\r\n");
      out.write("    margin-top: 36%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".a{\r\n");
      out.write("\tgrid-area: smallGrida;\r\n");
      out.write("\tbackground: rgb(0,61,165);\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".b{\r\n");
      out.write("\tgrid-area: smallGridb;\r\n");
      out.write("\tbackground: rgb(51,100,183)\r\n");
      out.write("}\r\n");
      out.write(".c{\r\n");
      out.write("\tgrid-area: smallGridc;\r\n");
      out.write("\tbackground: rgb(25,80,174)\r\n");
      out.write("}\r\n");
      out.write(".d{\r\n");
      out.write("\tgrid-area: smallGridd;\r\n");
      out.write("\tbackground: rgb(76,119, 192)\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a.button1 {\r\n");
      out.write("  background: #678;\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  color: white;\r\n");
      out.write("  font-weight: 300;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  user-select: none;\r\n");
      out.write("  padding: .5em 1.6em;\r\n");
      out.write("  outline: none;\r\n");
      out.write("  border: 2px solid;\r\n");
      out.write("  border-radius: 1px;\r\n");
      out.write("  transition: 0.2s;\r\n");
      out.write("} \r\n");
      out.write("a.button1:hover { background: rgba(0,0,0,.8); }\r\n");
      out.write("a.button1:active { background: blue; }\r\n");
      out.write("\r\n");
      out.write("a.button2{\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("    right: 0px;\r\n");
      out.write("    top: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a.button3{\r\n");
      out.write("\tright: 140px;\r\n");
      out.write("\tpadding: .5em 2.75em;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".context{\r\n");
      out.write(" display: flex;\r\n");
      out.write(" flex-wrap: wrap;\r\n");
      out.write("/*margin-right: 30px;*/\r\n");
      out.write(" justify-content: space-between;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".block{\r\n");
      out.write("   position: relative;\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    background-color: #fff;\r\n");
      out.write("    /*margin-bottom: 30px;*/\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("    vertical-align: top;\r\n");
      out.write("    box-shadow: 0px 0px 25px rgba(116, 116, 116, 0.25);\r\n");
      out.write("    width: 200px;\r\n");
      out.write("    height: 328px;\r\n");
      out.write("    /*padding: 30px 30px;*/\r\n");
      out.write("    margin-bottom: 18px;\r\n");
      out.write(" }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".a1{\r\n");
      out.write("\tbackground: #fff;\r\n");
      out.write("\tcolor: #000;\r\n");
      out.write("\tdisplay: flex;\r\n");
      out.write("\tflex-direction: column;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".a1 div{\r\n");
      out.write("\theight: 50%;\r\n");
      out.write("\tpadding-top: 46px;\r\n");
      out.write("\talign-self: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".a1 img{\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 50%;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".a1 p{\r\n");
      out.write("\tfont-size: 19.5px;\r\n");
      out.write("\tmargin: 0px;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".a2 p{\r\n");
      out.write("\tfont-size: 19.5px;\r\n");
      out.write("\tmargin: 0px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\t/*align-self: center;*/\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".c1 {\r\n");
      out.write("\tbackground: #fff;\r\n");
      out.write("\tcolor: #000;\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".c1 img{\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 50%;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("        ");
      out.write(".register_form{\r\n");
      out.write("  grid-area: divr;\r\n");
      out.write("  margin: 0px;\r\n");
      out.write("  display: flex;\r\n");
      out.write("  flex-direction: column;\r\n");
      out.write("  align-items:center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".register_input{\r\n");
      out.write("box-sizing: border-box;\r\n");
      out.write("  -webkit-box-sizing: border-box;\r\n");
      out.write("  -moz-box-sizing: border-box;\r\n");
      out.write("  outline: none;\r\n");
      out.write("  display: block;\r\n");
      out.write("  width: 20%;\r\n");
      out.write("  padding: 7px;\r\n");
      out.write("  border: none;\r\n");
      out.write("  border-bottom: 1px solid #ddd;\r\n");
      out.write("  background: transparent;\r\n");
      out.write("  margin-bottom: 10px;\r\n");
      out.write("  height: 45px;\r\n");
      out.write("  -webkit-appearance: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".normalize{\r\n");
      out.write("  height: 100vh;  \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".header{\r\n");
      out.write("background-color: rgb(39,37,31);\r\n");
      out.write("\r\n");
      out.write("}");
      out.write("\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <meta http-equiv=\"Content-Type\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <header class=\"header\">\n");
      out.write("        <img src=\"https://www.mayoclinic.org/styles/img/logo-mayoclinic.png\" alt=\"\">\n");
      out.write("    </header>\n");
      out.write("    <aside class=\"left\"></aside>\n");
      out.write("    <aside class=\"right\"></aside>\n");
      out.write("\n");
      out.write("    <main class=\"main\">\n");
      out.write("\n");
      out.write("        <form method=\"post\" action=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("            <input type=\"submit\" name=\"Reg\">\n");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <form method=\"post\" action=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("            <input type=\"submit\" name=\"Auth\">\n");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"bigGrid\">\n");
      out.write("            <div class=\"myGrid\"></div>\n");
      out.write("\n");
      out.write("            <div class=\"smallGrid a\"><p>APPOINTMENTS</p></div>\n");
      out.write("            <div class=\"smallGrid b\"><p>CONTACT US</p></div>\n");
      out.write("            <div class=\"smallGrid c\"><p>FIND A DOCTOR</p></div>\n");
      out.write("            <div class=\"smallGrid d\"><p>PATIENT  & VISITOR GUIDE</p></div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <h2 align=\"center\">Find Diseases & Conditions</h2>\n");
      out.write("        <div class=\"r\"></div>\n");
      out.write("\n");
      out.write("        <div class=\"context\">\n");
      out.write("\n");
      out.write("            <div class=\"block a1\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <img src=\"https://www.mayoclinic.org/-/media/kcms/gbs/patient-consumer/images/2018/09/25/18/03/ken-burns-documentary-promo-tile-v3.jpg\" alt=\"\">\n");
      out.write("                <div>\n");
      out.write("                    <p>Mayo Clinic featured in</p>\n");
      out.write("                    <p>Ken Burns documentary</p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"block a1 a2\">\n");
      out.write("\n");
      out.write("                <img src=\"https://www.mayoclinic.org/-/media/kcms/gbs/patient-consumer/images/2018/12/03/16/13/triplemygift520x360_ad.jpg\" alt=\"\">\n");
      out.write("                <div>\n");
      out.write("                    <p>Triple my gift for the Mayo Clinic Center for</p>\n");
      out.write("                    <p>Indvidualized Medicine today!</p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"block a1\">\n");
      out.write("\n");
      out.write("                <img src=https://www.mayoclinic.org/-/media/kcms/gbs/patient-consumer/images/2018/08/22/17/03/mc-usnews-tile-520x360.jpg\"alt=\"\">\n");
      out.write("                <div>\n");
      out.write("                    <p>Mayo Clinic featured in</p>\n");
      out.write("                    <p>Ken Burns documentary</p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"block a1\">\n");
      out.write("\n");
      out.write("                <img src=\"https://www.mayoclinic.org/-/media/kcms/gbs/patient-consumer/images/2018/04/23/16/35/hopeandhealing2x.jpg\" alt=\"\">\n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("                    <p>Mayo Clinic featured in</p>\n");
      out.write("                    <p>Ken Burns documentary</p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <label class=\"link\" for=\"hider\" id=\"clickme\">Show rooms</label>\n");
      out.write("        <input type=\"checkbox\" id=\"hider\">\n");
      out.write("        <div class=\"content\">\n");
      out.write("\n");
      out.write("            <table border=\"2\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>Number</th>\n");
      out.write("                    <th>Type</th>\n");
      out.write("                    <th>Seats</th>\n");
      out.write("                </tr>\n");
      out.write("                ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </main>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <footer class=\"footer\">Footer</footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /WEB-INF/view/login.jsp(30,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/reg");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f1_reused = false;
    try {
      _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f1.setParent(null);
      // /WEB-INF/view/login.jsp(36,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f1.setValue("/signIn");
      int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
      if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      _jspx_th_c_005furl_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f1, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/view/login.jsp(113,16) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("roomList");
      // /WEB-INF/view/login.jsp(113,16) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/view/login.jsp(113,16) '${roomList}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${roomList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                    <tr>\n");
            out.write("\n");
            out.write("                        <td>");
            if (_jspx_meth_c_005fout_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("</td>\n");
            out.write("                        <td>");
            if (_jspx_meth_c_005fout_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("</td>\n");
            out.write("                        <td>");
            if (_jspx_meth_c_005fout_005f2(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("</td>\n");
            out.write("                    </tr>\n");
            out.write("\n");
            out.write("                ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f0_reused = false;
    try {
      _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /WEB-INF/view/login.jsp(116,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${roomList.roomNumber}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
      if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      _jspx_th_c_005fout_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f1_reused = false;
    try {
      _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /WEB-INF/view/login.jsp(117,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${roomList.type}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
      if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      _jspx_th_c_005fout_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f2_reused = false;
    try {
      _jspx_th_c_005fout_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /WEB-INF/view/login.jsp(118,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${roomList.numberOfSeats}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f2 = _jspx_th_c_005fout_005f2.doStartTag();
      if (_jspx_th_c_005fout_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
      _jspx_th_c_005fout_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f2_reused);
    }
    return false;
  }
}
