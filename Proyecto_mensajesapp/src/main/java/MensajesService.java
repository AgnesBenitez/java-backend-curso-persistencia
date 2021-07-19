/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto_mensajesapp;

import java.util.Scanner;

/**
 *
 * @author j.benitez.prudente
 */
public class MensajesService {
    public static void crearMsj()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Escribe tu mensaje");
        String m,a;
        m=sc.nextLine();
        System.out.println("Escribe tu nombre");
        a=sc.nextLine();
        Mensajes re=new Mensajes();
        re.setMensaje(m);
        re.setAutor_mensaje(a);
        MensajesDAO.crearMsj(re);
        
    }
    
    
  public static void listarMsj()
    {
        MensajesDAO.leerMsj();
    }
  
  public static void borrarMsj()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("indica el ID del mensaje a borrar");
        int id_mensaje= sc.nextInt();
        MensajesDAO.borrarMsj(id_mensaje);
    }
  
  public static void editarMsj()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe tu nuevo mensaje");
        String mensaje = sc.nextLine();
        
        System.out.println("indica el ID del mensaje a editar");
        int id_mensaje= sc.nextInt();
        Mensajes actualizacion = new Mensajes();
        actualizacion.setId_mensaje(id_mensaje);
        actualizacion.setMensaje(mensaje);
        MensajesDAO.actualizarMsj(actualizacion);
        
    }
  
  
  
  
  
  
  
  
  
}
