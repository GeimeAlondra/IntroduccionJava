/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfazejemplo;

import Services.InterfaceBD1;
import java.lang.reflect.Field;

/**
 *
 * @author Alondra
 */
public class InterfazEjemplo {

    public static void main(String[] args) {
         
        ImplementacionInterface1 obj = new ImplementacionInterface1();
        ImplementacionInterface2 obj2 = new ImplementacionInterface2();
    
        System.out.println(ImplementacionInterface1.class.getName());
        System.out.println(ImplementacionInterface2.class.getName());
        
        Field[] fields = ImplementacionInterface2.class.getDeclaredFields();
    
        for (Field field : fields){
            System.out.println("nombre " + field.getName());
            System.out.println("tipo " + field.getType());
        }
        
        InterfaceBD1<String> anonimo = new InterfaceBD1<String>() {
            
            @Override
            public String getAll() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public String getById(int id) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public String insert(String objeto) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public String update(String objeto) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public String delete(String objeto) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
    }
}
