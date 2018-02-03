/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import javabeans.Computadora;

/**
 *
 * @author paul
 */
public class UtilidadesHTML {
    public String generarTablaHtmlContactos(ArrayList listaComputadoras) {
        String html = "<table border=1>";
        html += "<tr><th>Id</th><th>Marca</th><th>Procesador</th><th>Memoria RAM</th>"
                + "<th>Disco</th><th>Memoria de video</th><th>Descripcion</th>"
                + "</tr>";
        for (Object objContacto : listaComputadoras) {
            Computadora c = (Computadora) objContacto;
            html += "<tr>";
            html += "<td>" + c.getId() + "</td>";
            html += "<td>" + c.getMarca() + "</td>";
            html += "<td>" + c.getProcesador() + "</td>";
            html += "<td>" + c.getMemoria() + "</td>";
            html += "<td>" + c.getDisco() + "</td>";
            html += "<td>" + c.getMemoriaVideo() + "</td>";
            html += "<td>" + c.getDescripcion() + "</td>";
            html += "</tr>";
        }
        html += "</table>";
        return html;
    }
}