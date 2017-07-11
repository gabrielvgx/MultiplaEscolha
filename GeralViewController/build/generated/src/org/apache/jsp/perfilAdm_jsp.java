package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class perfilAdm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!--[if IE 8 ]><html class=\"no-js oldie ie8\" lang=\"en\"> <![endif]-->\n");
      out.write("<!--[if IE 9 ]><html class=\"no-js oldie ie9\" lang=\"en\"> <![endif]-->\n");
      out.write("<!--[if (gte IE 9)|!(IE)]><!--><html class=\"no-js\" lang=\"en\"> <!--<![endif]-->\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("   <!--- basic page needs\n");
      out.write("   ================================================== -->\n");
      out.write("   <meta charset=\"utf-8\">\n");
      out.write("   <title>Perfil</title>\n");
      out.write("   <meta name=\"description\" content=\"\">  \n");
      out.write("   <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("   <!-- mobile specific metas\n");
      out.write("   ================================================== -->\n");
      out.write("   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("\n");
      out.write("   <!-- CSS\n");
      out.write("   ================================================== -->\n");
      out.write("   <link rel=\"stylesheet\" href=\"css/base.css\">  \n");
      out.write("   <link rel=\"stylesheet\" href=\"css/main.css\">\n");
      out.write("   <link rel=\"stylesheet\" href=\"css/vendor.css\">    \n");
      out.write("   <link href=\"css/materialize.css\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\"/>\n");
      out.write("   <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("   <!-- script\n");
      out.write("   ================================================== -->\n");
      out.write("   <script src=\"js/modernizr.js\"></script>\n");
      out.write("\n");
      out.write("   <!-- favicons\n");
      out.write("   ================================================== -->\n");
      out.write("   <link rel=\"icon\" type=\"image/png\" href=\"favicon.png\">\n");
      out.write("\n");
      out.write("   <!-- Style do header\n");
      out.write("   ================================================== -->\n");
      out.write("   <style type=\"text/css\">\n");
      out.write("      header {\n");
      out.write("         width: 100%;\n");
      out.write("         position: absolute;\n");
      out.write("         left: 0;\n");
      out.write("         top: 0px;\n");
      out.write("         z-index: 600;\n");
      out.write("         background: #14171c;\n");
      out.write("      }\n");
      out.write("   </style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"top\">\n");
      out.write("\n");
      out.write("   <!-- header \n");
      out.write("   ================================================== -->\n");
      out.write("   <header>\n");
      out.write("\n");
      out.write("      <div class=\"row\">\n");
      out.write("\n");
      out.write("         <div class=\"logo\">\n");
      out.write("            <a href=\"index.jsp\"></a>\n");
      out.write("         </div>\n");
      out.write("\n");
      out.write("         <nav id=\"main-nav-wrap\">\n");
      out.write("            <ul class=\"main-navigation\">\n");
      out.write("               <li><a href=\"questao.jsp\" title=\"\">Início</a></li> \n");
      out.write("               <li><a href=\"questao.jsp\" title=\"\">Questões</a></li>\n");
      out.write("               <li><a href=\"editarQuestao.jsp\" title=\"\">Editar Questões</a></li>   \n");
      out.write("               <li><a href=\"perfil.jsp\" title=\"\">Perfil</a></li>\n");
      out.write("               <li class=\"highlight with-sep\"><a title=\"\">Sair</a></li>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("         </nav>\n");
      out.write("\n");
      out.write("         <a class=\"menu-toggle\" href=\"#\"><span>Menu</span></a>\n");
      out.write("         \n");
      out.write("      </div>      \n");
      out.write("      \n");
      out.write("   </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("   <!-- formulário de cadastro\n");
      out.write("   ================================================== -->\n");
      out.write("   <section id=\"process\">  \n");
      out.write("\n");
      out.write("      <br>\n");
      out.write("      <div class=\"row\">\n");
      out.write("         <div class=\"col s3\">\n");
      out.write("            <img src=\"images/avatars/avatar-5.jpg\" class=\"circle responsive-img\">\n");
      out.write("            Luana Pinheiro\n");
      out.write("            <h6>Luaninha</h6>\n");
      out.write("         </div>\n");
      out.write("         <div class=\"col s2\"></div>\n");
      out.write("         <div class=\"col s7\">\n");
      out.write("            <img src=\"images/grafico.png\">\n");
      out.write("         </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"row\">\n");
      out.write("         <div class=\"col s3\">\n");
      out.write("            <p>luana.pinheiro@gmail.com</p>\n");
      out.write("            <h6>Gestor de Conteúdo</h6>\n");
      out.write("         </div>\n");
      out.write("\n");
      out.write("         <div class=\"col s2\"></div>\n");
      out.write("\n");
      out.write("         <div class=\"col s3 borda\">\n");
      out.write("            <h3>Questões Respondidas:</h3>\n");
      out.write("            <h3>23</h3>\n");
      out.write("         </div> \n");
      out.write("\n");
      out.write("         <div class=\"col s1\"></div>\n");
      out.write("\n");
      out.write("         <div class=\"col s3 borda\">\n");
      out.write("            <h3>Número de Acertos:</h3>\n");
      out.write("            <h3>21</h3>\n");
      out.write("         </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"row\">\n");
      out.write("         <div class=\"col s3\">\n");
      out.write("            <a class=\"waves-effect waves-light btn\" id=\"editar_perfil\"><i class=\"material-icons right\">mode_edit</i>Editar Perfil</a>\n");
      out.write("         </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("   </section> <!-- /process-->    \n");
      out.write("\n");
      out.write("\n");
      out.write("   <!-- footer\n");
      out.write("   ================================================== -->\n");
      out.write("   <footer>\n");
      out.write("\n");
      out.write("      <div class=\"footer-main\">\n");
      out.write("\n");
      out.write("         <div class=\"row\">  \n");
      out.write("\n");
      out.write("            <div class=\"col-four tab-full mob-full footer-info\">            \n");
      out.write("\n");
      out.write("               <div class=\"footer-logo\"></div>\n");
      out.write("\n");
      out.write("               <p>\n");
      out.write("                  Centro Federal de Educação Tecnológica de Minas Gerais\n");
      out.write("                  <br>\n");
      out.write("                  Av. Amazonas, 7675 - Nova Gameleira, Belo Horizonte - MG\n");
      out.write("                  <br>\n");
      out.write("                  Telefone: +55 (31) 3319-6722\n");
      out.write("               </p>\n");
      out.write("\n");
      out.write("            </div> <!-- /footer-info -->\n");
      out.write("\n");
      out.write("            <div class=\"col-two tab-1-3 mob-1-2\">\n");
      out.write("\n");
      out.write("               <h4>Instituição</h4>\n");
      out.write("\n");
      out.write("               <ul>\n");
      out.write("                  <li><a href=\"http://www.cefetmg.br/\">CEFET-MG</a></li>\n");
      out.write("                  <li><a href=\"http://www.campus2.cefetmg.br/\">CEFET-MG/CII</a></li>\n");
      out.write("                  <li><a href=\"http://www.decom.cefetmg.br/\">DECOM</a></li>\n");
      out.write("               </ul>\n");
      out.write("            </div> <!-- /site-links -->  \n");
      out.write("            \n");
      out.write("            <div class=\"col-two tab-1-3 mob-1-2 social-links\">\n");
      out.write("               <h4>Sigam-nos</h4>\n");
      out.write("               <ul>\n");
      out.write("                  <li><a href=\"https://www.facebook.com/cefetminasgerais/\">Facebook CEFET</a></li>\n");
      out.write("                  <li><a href=\"https://www.facebook.com/cefetmg.campus2/\">Facebook CEFET/CII</a></li>\n");
      out.write("                  <li><a href=\"https://www.instagram.com/cefetmg/\">Instagram CEFET</a></li>\n");
      out.write("               </ul>               \n");
      out.write("            </div> <!-- /sociais--> \n");
      out.write("            \n");
      out.write("            <div class=\"col-four tab-1-3 mob-full\">\n");
      out.write("               <h4>Professores</h4>\n");
      out.write("               <p>Cristiano Amaral Maffort - Linguagem de Programação II.\n");
      out.write("                  <br>\n");
      out.write("                  Glívia Angélica Rodrigues Barbosa - Projetos de Sistemas.\n");
      out.write("                  <br>\n");
      out.write("                  Edson Marchetti da Silva - Banco de Dados.</p>                        \n");
      out.write("               </div> <!-- /professores --> \n");
      out.write("\n");
      out.write("            </div> <!-- /row -->\n");
      out.write("\n");
      out.write("         </div> <!-- /footer-main --> \n");
      out.write("\n");
      out.write("         <div class=\"footer-bottom\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("               <div class=\"col-twelve\">\n");
      out.write("                  <div class=\"copyright\"></div>\n");
      out.write("\n");
      out.write("                  <div id=\"go-top\" style=\"display: block;\">\n");
      out.write("                     <a class=\"smoothscroll\" title=\"Back to Top\" href=\"#top\"><i class=\"icon ion-android-arrow-up\"></i></a>\n");
      out.write("                  </div>         \n");
      out.write("               </div>\n");
      out.write("            </div>       \n");
      out.write("         </div> <!-- /footer-bottom -->\n");
      out.write("      </footer> -->       \n");
      out.write("\n");
      out.write("      <div id=\"preloader\"> \n");
      out.write("         <div id=\"loader\"></div>\n");
      out.write("      </div> \n");
      out.write("\n");
      out.write("   <!-- Java Script\n");
      out.write("   ================================================== --> \n");
      out.write("   <script src=\"js/jquery-1.11.3.min.js\"></script>\n");
      out.write("   <script src=\"js/jquery-migrate-1.2.1.min.js\"></script>\n");
      out.write("   <script src=\"js/plugins.js\"></script>\n");
      out.write("   <script src=\"js/main.js\"></script>\n");
      out.write("   <script src=\"js/materialize.js\"></script>\n");
      out.write("   <script src=\"js/perfilDados.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
