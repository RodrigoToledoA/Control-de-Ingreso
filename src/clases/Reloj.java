
package clases;

import java.util.Calendar; 
import java.util.Date; 
import java.util.GregorianCalendar; 
import javax.swing.JLabel; 
import ui.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Toledo Rodrigo
 */

public class Reloj extends JLabel implements Runnable {

    private String dia, mes, año, hora, minutos, segundos;
    Thread hilo;
    private Calendar calendario = new GregorianCalendar();

    public Reloj (int x, int y, int p, int p1) { //Constructor 
        
        setBounds(x, y, p, p1);
        hilo = new Thread(this);
        hilo.start();

    } //fin constructor 

    @Override
    public void run() {
        Thread ct = Thread.currentThread();
        String txtFecha; String txtHora;
        while (ct == hilo) {
            try {
                actualiza();
                int mesE;
                mesE = Integer.valueOf(mes) + 1;

                txtFecha = dia + "/" + mesE + "/" + año;
                txtHora = hora + ":" + minutos + ":" + segundos;
                
                QrDecoder.lblHora.setText(txtHora);
                QrDecoder.lblFecha.setText(txtFecha);
                QrDecoder.lblHora.setFont(new java.awt.Font("Comic Sans", 1, 14));//tipo de letra y tamaño
                QrDecoder.lblFecha.setFont(new java.awt.Font("Comic Sans", 1, 14));//tipo de letra y tamaño
                
                Thread.sleep(1000);
                
            } catch (InterruptedException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error del reloj", JOptionPane.ERROR_MESSAGE);
            }

        }

    }

    public void actualiza() {

        Date fechaHoraActual = new Date();
        calendario.setTime(fechaHoraActual);
        //Aca se acomodan los numeros
        //Los signos "?" son una abreviacion de IF
        hora = String.valueOf(calendario.get(Calendar.HOUR_OF_DAY));
        minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
        dia = calendario.get(Calendar.DATE) > 9 ? "" + calendario.get(Calendar.DATE) : "0" + calendario.get(Calendar.DATE);
        mes = calendario.get(Calendar.MONTH) > 9 ? "" + calendario.get(Calendar.MONTH) : "0" + calendario.get(Calendar.MONTH);
        año = calendario.get(Calendar.YEAR) > 9 ? "" + calendario.get(Calendar.YEAR) : "0" + calendario.get(Calendar.YEAR);
    }
}
