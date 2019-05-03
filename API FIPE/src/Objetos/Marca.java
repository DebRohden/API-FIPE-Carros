/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author debor
 */
public class Marca {
    String name;
    String fipe_name;
    String key;
    int id;
   

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFipe_name() {
        return fipe_name;
    }

    public void setFipe_name(String fipe_name) {
        this.fipe_name = fipe_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Marca{" + "name=" + name + ", fipe_name=" + fipe_name + ", key=" + key + ", id=" + id + '}';
    }
    
    
}
