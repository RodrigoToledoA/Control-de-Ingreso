/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import com.itextpdf.text.Document;
import com.itextpdf.text.html.simpleparser.HTMLWorker;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringReader;
import org.markdown4j.Markdown4jProcessor;

/**
 *
 * @author Rodrigo Toledo
 * clase para convertir todo lo guardado en la lista en un registro con un pdf
 */
public abstract class Export {

    public static String toHtmlString() {
        String html = "";
        String md = "";
        md += "<html><head>";
        md+="</head>";
        md += "<body><h1 style='text-align: center; color:blue;'>Instituto Técnico Salesiano Villada</h1>";
        md += "<br>";
        md += "<h1 style='text-align: center; color:blue;'>Registro de Ingreso</h1>";
        md += "<br>";
        md += "<h4>Septiembre de 2014</h2>";        
        md += "<p></p>";

        md += "<table>"
                + "<tr>"
                + "<th> <strong>Nombre</strong> </th>"
                + "<th> <strong>DNI</strong> </th>"
                + "<th> <strong>Telefono</strong> </th>"
                + "<th> <strong>Mail</strong> </th>"
                + "<th> <strong>Ultimo Ingreso</strong> </th>"
                + "</tr>";
        
        Usuario[] listado = ListaUsuarios.getLista();
        for (int i = 0; i < listado.length; i++) {
            if (listado[i] != null) {
                String horaLlegada = listado[i].gethLlegada();
                if (horaLlegada == null){
                    horaLlegada = "No llego.";
                }
                md += "<tr>"
                        + "<td>" + listado[i].getNombre() + "</td>"
                        + "<td>" + listado[i].getDni() + "</td>"
                        + "<td>" + listado[i].getTel() + "</td>"
                        + "<td>" + listado[i].getMail() + "</td>"
                        + "<td>" + horaLlegada + "</td>"
                        + "</tr>";
            }
        }
        md += "</table>";
        md += "</body></html>";

        try {
            html = new Markdown4jProcessor().process(md);
        } catch (IOException ex) {
            System.out.println("Error!");
        }

        return html;
    }

    public static File exportToHtmlFile() {
        return null;
    }

    public static File exportToPdf(String fileName) {        
        OutputStream file=null;                
        try {
            
            file = new FileOutputStream(new File(fileName));
            Document document = new Document();
            PdfWriter.getInstance(document, file);
            document.open();
            HTMLWorker htmlWorker = new HTMLWorker(document);
            htmlWorker.parse(new StringReader(toHtmlString()));
            document.close();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new File("Test.pdf");
    }

}
