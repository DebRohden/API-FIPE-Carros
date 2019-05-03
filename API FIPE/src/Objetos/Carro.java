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
public class Carro {
    String referencia;
    String fipe_codigo;
    String name;
    String combustivel;
    String marca;
    int ano_modelo;
    String preco;
    String key;
    float time;
    String veiculo;
    int id;

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

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

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno_modelo() {
        return ano_modelo;
    }

    public void setAno_modelo(int ano_modelo) {
        this.ano_modelo = ano_modelo;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "referencia=" + referencia +"\n"+ 
                " fipe_codigo=" + fipe_codigo + "\n"+ 
                " name=" + name + "\n"+ 
                " combustivel=" + combustivel + "\n" + 
                " marca=" + marca + "\n"+ 
                " ano_modelo=" + ano_modelo + "\n"+ 
                " preco=" + preco + "\n"+ 
                " key=" + key + "\n"+
                " time=" + time + "\n"+
                " veiculo=" + veiculo + "\n"+
                " id=" + id + '}';
    }

}
