/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labb02;

public class Plan {
    private String nombre;
    private int costo;
    private int vm;
    private int cantCliente;
    public Plan(String nombre, int costo , int vm){
        this.nombre = nombre;
        this.costo = costo;
        this.vm = vm;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getVm() {
        return vm;
    }

    public void setVm(int vm) {
        this.vm = vm;
    }

    public int getCantCliente() {
        return cantCliente;
    }

    public void setCantCliente(int cantCliente) {
        this.cantCliente = cantCliente;
    }
    
    
}
