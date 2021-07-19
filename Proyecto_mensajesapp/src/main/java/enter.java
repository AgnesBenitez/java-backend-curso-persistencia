/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto_mensajesapp;

import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author j.benitez.prudente
 */
public class enter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc=new Scanner(System.in);
        
        int op=0;
        do{
            System.out.println("______________________________");
            System.out.println("   ____\n" +
"                             _(____)_\n" +
"                      ___ooO_(_o__o_)_Ooo___\n" +
"	                    BIENVENIDO");
            System.out.println(" Aplicacion de mensajes");
            System.out.println(" 1. crear mensaje");
            System.out.println(" 2. listar mensajes");
            System.out.println(" 3. editar mensaje");
            System.out.println(" 4. eliminar mensaje");
            System.out.println(" 5. salir");
            //leemos la opcion del usuario
            op = sc.nextInt();
            
            switch (op){
                case 1:
                    MensajesService.crearMsj();
                    break;
               case 2:
                    MensajesService.listarMsj();
                    break;
                    
                case 3:
                    MensajesService.editarMsj();
                    break;
                case 4:
                    MensajesService.borrarMsj();
                    break;    
           default:
                    break;
            }

            
        }while(op !=5 );
        Conexion conexion = new Conexion();

        try (Connection conn = conexion.get_connection()) {

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
