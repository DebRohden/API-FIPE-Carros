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
public class ModeloAno {
    String fipe_marca;
    String fipe_codigo;
    String name;
    String marca;
    String key;
    String veiculo;
    String id;

    public String getFipe_codigo() {
        return fipe_codigo;
    }

    public void setFipe_codigo(String fipe_codigo) {
        this.fipe_codigo = fipe_codigo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFipe_marca() {
        return fipe_marca;
    }

    public void setFipe_marca(String fipe_marca) {
        this.fipe_marca = fipe_marca;
    }

    @Override
    public String toString() {
        return "ModeloAno{" + "fipe_marca=" + fipe_marca + ", fipe_codigo=" + fipe_codigo + ", name=" + name + ", marca=" + marca + ", key=" + key + ", veiculo=" + veiculo + ", id=" + id + '}';
    }


    
}
