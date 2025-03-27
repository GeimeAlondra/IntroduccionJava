/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

/**
 *
 * @author Alondra
 */
public interface ServicesBD2<T> {
    
    T getAll();
    T getById(int id);
    T insert(String objeto);
    T update(String objeto);
    T delete(String objeto);
}
