/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto_mensajesapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author j.benitez.prudente
 */
public class MensajesDAO {

    public static void crearMsj(Mensajes mensaje) {
        Conexion conexion = new Conexion();
        try (Connection conn = conexion.get_connection()) {
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO mensaje ( mensaje, autor_mensaje) VALUES (?,?)";
                ps = conn.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, mensaje.getAutor_mensaje());
                ps.execute();
                System.out.println("Mensaje enviado");

            } catch (SQLException ex) {

                System.err.println(ex);

            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public static void leerMsj() {
Conexion db_connect = new Conexion();
        
        PreparedStatement ps=null;
        ResultSet rs=null;
        
        try(Connection conexion = db_connect.get_connection())  {        
            String query="SELECT * FROM mensaje";
            ps=conexion.prepareStatement(query);
            rs=ps.executeQuery();
            
            while(rs.next()){
                System.out.println("ID: "+rs.getInt("id_mensaje"));
                System.out.println("Mensaje: "+rs.getString("mensaje"));
                System.out.println("Autor: "+rs.getString("autor_mensaje"));
                System.out.println("Fecha: "+rs.getString("fecha_mensaje"));
                System.out.println("");
            }
        }catch(SQLException e){
            System.out.println("no se pudieron recuperar los mensajes");
            System.out.println(e);
        }
    }
    

    public static void borrarMsj(int id_mensaje) {
Conexion db_connect = new Conexion();
        
        try(Connection conexion = db_connect.get_connection())  {
        PreparedStatement ps=null;
        
            try {
                String query="DELETE FROM mensaje WHERE id_mensaje = ?";
                ps=conexion.prepareStatement(query);
                ps.setInt(1, id_mensaje);
                ps.executeUpdate();
                System.out.println("el mensaje ha sido borrado");
            }catch(SQLException e) {
                System.out.println(e);
                 System.out.println("no se pudo borrar el mensaje");
            }
        
            
        }catch(SQLException e){
            System.out.println(e);
        }
        
    }

    public static void actualizarMsj(Mensajes mensaje) {
 Conexion db_connect = new Conexion();
        
        try(Connection conexion = db_connect.get_connection())  { 
        PreparedStatement ps=null;
        
            try{ 
                String query="UPDATE mensajes SET mensaje = ? WHERE id_mensaje = ?";
                ps=conexion.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setInt(2, mensaje.getId_mensaje());
                ps.executeUpdate();
                System.out.println("mensaje se actualizó correctamente");
            }catch(SQLException ex){ 
                System.out.println(ex);
                System.out.println("no se pudo actualizar el mensaje");
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    }


