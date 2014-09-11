/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;
import java.io.*;
/**
 *
 * @author rodrigo
 * 
 */
public class Usuario implements Serializable{
    private String nombre;
    private int dni;
    private int edad;
    private int tel;
    private String mail;
    private String hLlegada;

    public Usuario(String nombre, int dni, int edad, int tel, String mail) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.tel = tel;
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Nombre:" + nombre + "\nEdad:"+ edad +
                "\nDni:" + this.dni + "\nNº Tel:" + tel + "\nMail:" + mail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String gethLlegada() {
        return hLlegada;
    }

    public void sethLlegada(String hLlegada) {
        this.hLlegada = hLlegada;
    }
                   
}
