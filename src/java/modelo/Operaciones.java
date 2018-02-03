/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javabeans.Computadora;
import javax.sql.DataSource;

/**
 *
 * @author Nolasco
 */
public class Operaciones {
    private String url;
    DataSource ds;
    PreparedStatement pstInsertar;
    PreparedStatement pstModificar;
    PreparedStatement pstEliminar;
    PreparedStatement pstConsultar;
    
    public Operaciones(String url) {
        this.url = "jdbc:mysql://localhost:4848/favoritos?user=root&password=";
    }
    
    public Operaciones(DataSource ds) {
        try {
            this.ds = ds;
            Connection cn = this.getConnection();
            
            pstInsertar = cn.prepareStatement("INSERT INTO computadoras VALUES(?,?,?,?,?,?)");
            pstModificar = cn.prepareStatement("UPDATE computadores "
                    + "SET marca=?,procesador=?,"
                    + "memoria=?,disco=?,"
                    + "memoriaVideo=?,descripcion=?"
                    +" WHERE id=?");
            pstEliminar = cn.prepareStatement("DELETE FROM computadoras WHERE id=?");
            pstConsultar=cn.prepareStatement("SELECT * FROM computadoras");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void insertaComputadora(Computadora c){
        try {
            pstInsertar.setString(1, c.getMarca());
            pstInsertar.setString(2, c.getProcesador());
            pstInsertar.setInt(3, c.getMemoria());
            pstInsertar.setString(4, c.getDisco());
            pstInsertar.setInt(5, c.getMemoriaVideo());
            pstInsertar.setString(6, c.getDescripcion());
            pstInsertar.executeUpdate();
        } catch (Exception e) {
        }
    }
    
     public void modificaComputadora(Computadora c){
        try {
            pstInsertar.setString(1, c.getMarca());
            pstInsertar.setString(2, c.getProcesador());
            pstInsertar.setInt(3, c.getMemoria());
            pstInsertar.setString(4, c.getDisco());
            pstInsertar.setInt(5, c.getMemoriaVideo());
            pstInsertar.setString(6, c.getDescripcion());
            pstInsertar.setInt(3, c.getId());
            pstInsertar.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void eliminarComputadora(Computadora c){
        try {
            pstEliminar.setInt(1, c.getId());
            pstEliminar.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public ArrayList obtenerComputadoras(){
        ArrayList computadoras = null;
        try {
            computadoras=new ArrayList();
            ResultSet rs=pstConsultar.executeQuery();
            
            while(rs.next()){
                computadoras.add(new Computadora(rs.getInt("id"), rs.getString("marca"), rs.getString("procesador"),
                        rs.getInt("memoria"), rs.getString("disco"), rs.getInt("memoriaVideo"), rs.getString("descripcion")));
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return computadoras;
    }
    
    private Connection getConnection() {
         Connection cn = null;
        try {
            cn = this.ds.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cn;
    }

     
}
