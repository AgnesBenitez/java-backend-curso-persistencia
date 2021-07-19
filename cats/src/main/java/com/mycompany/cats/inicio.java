/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cats;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author j.benitez.prudente
 */
public class inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
          int opcion_menu = -1;
        String[] botones = {" 1. ver gatos", "2. salir"};
        
        do{
            
            //menu principal
            String opcion = (String) JOptionPane.showInputDialog(null, "Gatitos java",
                    "Menu principal", JOptionPane.INFORMATION_MESSAGE,
                    null, botones,botones[0]);
            
            //validamos que opcion selecciona el usuario
            for(int i=0;i<botones.length;i++){
                if(opcion.equals(botones[i])){
                    opcion_menu = i;
                }
            }
            
            switch(opcion_menu){
                case 0:
                    GatosService.verGatos();
                    break;
                default:
                    break;
            }     
        }while(opcion_menu != 1);
        
    }
    
    }
    

