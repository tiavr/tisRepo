public class Afficheur {
    public void afficherAffichableEnTexte(Affichable a){
        if(a.getNomType().equals("DOCUMENT")){
            System.out.println(a.getValeur());
            for(Affichable elem : a.getContenuAffichable()){
                System.out.println(elem.getValeur());
            }
        }
        else{
            System.out.println(a.getValeur());
        }
    }

    public void afficherAffichableEnHtml(Affichable a){
        if(a.getNomType().equals("DOCUMENT")){
            System.out.println("<HTML>");
            System.out.println("<HEAD>");
            System.out.println("<TITLE>"+a.getValeur()+"</TITLE>");
            System.out.println("</HEAD>");
            System.out.println("<BODY>");
            System.out.println("<H1>"+a.getValeur()+"</H1>");
            for(Affichable e:a.getContenuAffichable()) System.out.println("<p>" + e.getValeur() + "</p>");;
            System.out.println("</BODY>");
            System.out.println("</HTML>");;
        }
        if(a.getNomType().equals("IMAGE")){
            System.out.println("<HTML>");
            System.out.println("<HEAD>");
            System.out.println("<TITLE>"+ "URL = " + a.getValeur()+ "</TITLE>");
            System.out.println("</HEAD>");
            System.out.println("<BODY>");
            System.out.println("<H1>"+ "URL = " + a.getValeur()+"</H1>");
            System.out.println("</BODY>");
            System.out.println("</HTML>");;
        }
        else{
            System.out.println("<HTML>");
            System.out.println("<HEAD>");
            System.out.println("<TITLE>"+a.getValeur()+"</TITLE>");
            System.out.println("</HEAD>");
            System.out.println("<BODY>");
            System.out.println("<H1>"+a.getValeur()+"</H1>");
            System.out.println("</BODY>");
            System.out.println("</HTML>");;
        }
    }
}
