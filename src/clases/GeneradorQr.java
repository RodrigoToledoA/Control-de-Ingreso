/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.QRCodeReader;
import com.google.zxing.qrcode.QRCodeWriter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import javax.imageio.ImageIO;
import static ui.QrDecoder.*;

/**
 *
 * @author rodrigo
 */
public class GeneradorQr {
    private static String ultimoIngreso = "";
    
    public File generateQR(File file, String text, int h, int w) throws Exception {
 
        Charset charset = Charset.forName("ISO-8859-1");
        CharsetEncoder encoder = charset.newEncoder();
        byte[] b = null;
        // Asignación del texto que contendra la imagen y se codifica
        ByteBuffer bbuf = encoder.encode(CharBuffer.wrap(text));
        b = bbuf.array();
        String data = new String(b, "ISO-8859-1");
        // get a byte matrix for the data
        BitMatrix matrix = null;
        QRCodeWriter writer = new QRCodeWriter();
        matrix = writer.encode(data, com.google.zxing.BarcodeFormat.QR_CODE, w, h);
        MatrixToImageWriter.writeToFile(matrix, "PNG", file);
        return file;
 
    }
//Lee cualquier imagen de qr desde el archivo y transforma su contenido en un string 
    public String decoder(File file) throws Exception {
 
        FileInputStream inputStream = new FileInputStream(file);
 
        BufferedImage image = ImageIO.read(inputStream);
 
        // convert the image to a binary bitmap source
        LuminanceSource source = new BufferedImageLuminanceSource(image);
        BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
 
        // decode the barcode
        QRCodeReader reader = new QRCodeReader();
 
        Result result = reader.decode(bitmap);
 
        return new String(result.getText().getBytes("UTF8"));
 
    }

//Clase para saber si el QR que se escaneo pertenece o no a un usuario.
    public static String Decoder(String text){
        ListaUsuarios.levantarObjetoEntero();
        Usuario[] listado = ListaUsuarios.getLista();
        String aux = "";
        for (Usuario listado1 : listado) {
            if (listado1!=null){
            aux = listado1.toString();
            if (aux.equalsIgnoreCase(text)) {
                listado1.sethLlegada(lblFecha.getText() + " " + lblHora.getText());
                ultimoIngreso = listado1.getNombre();
                ListaUsuarios.guardarUsuario();
                aux = "Usuario Valido.\nBienvenido "+listado1.getNombre();
            }
            else{
                aux = "Usuario invalido.\nUsted no pertenece a esta institucion.";
            }
            }
        }
        return aux;
    }
    
}
