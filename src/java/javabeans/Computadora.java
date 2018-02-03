/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabeans;

/**
 *
 * @author Nolasco
 */
public class Computadora {
    private int id;
    private String marca;
    private String procesador;
    private int memoria;
    private String disco;
    private int memoriaVideo;
    private String descripcion;

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", procesador=" + procesador + ", memoria=" + memoria + ", disco=" + disco + ", memoriaVideo=" + memoriaVideo + ", descripcion=" + descripcion + '}';
    }

    public Computadora() {
        this.id=0;
        this.marca = "";
        this.procesador = "";
        this.memoria = 0;
        this.disco = "";
        this.memoriaVideo = 0;
        this.descripcion = "";
    }

    public Computadora(int id,String marca, String procesador, int memoria, String disco, int memoriaVideo, String descripcion) {
        this.id=id;
        this.marca = marca;
        this.procesador = procesador;
        this.memoria = memoria;
        this.disco = disco;
        this.memoriaVideo = memoriaVideo;
        this.descripcion = descripcion;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the procesador
     */
    public String getProcesador() {
        return procesador;
    }

    /**
     * @param procesador the procesador to set
     */
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    /**
     * @return the memoria
     */
    public int getMemoria() {
        return memoria;
    }

    /**
     * @param memoria the memoria to set
     */
    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    /**
     * @return the disco
     */
    public String getDisco() {
        return disco;
    }

    /**
     * @param disco the disco to set
     */
    public void setDisco(String disco) {
        this.disco = disco;
    }

    /**
     * @return the memoriaVideo
     */
    public int getMemoriaVideo() {
        return memoriaVideo;
    }

    /**
     * @param memoriaVideo the memoriaVideo to set
     */
    public void setMemoriaVideo(int memoriaVideo) {
        this.memoriaVideo = memoriaVideo;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    
}
