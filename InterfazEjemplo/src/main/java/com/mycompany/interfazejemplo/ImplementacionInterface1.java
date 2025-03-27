/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfazejemplo;

import Modelos.Modelo2;
import Services.InterfaceBD1;

/**
 *
 * @author Alondra
 */
public class ImplementacionInterface1 implements InterfaceBD1<Modelos.Modelo2>{

    Modelo2 obj = new Modelo2();
    
    @Override
    public Modelo2 getAll() {
       obj.setMarca("sin marca");    
       return  obj;
    }

    @Override
    public Modelo2 getById(int id) {
         obj.getMarca();
       return  obj;
    }

    @Override
    public Modelo2 insert(String objeto) {
        obj.setEmpresa("Insert desde interfaz 2");
       return  obj;
    }

    @Override
    public Modelo2 update(String objeto) {
        obj.getEmpresa();
       return  obj;
    }

    @Override
    public Modelo2 delete(String objeto) {
      obj.getMarca();
       return  obj;
    }  
    
    public String all(){
        return obj.toString();
    }
}
