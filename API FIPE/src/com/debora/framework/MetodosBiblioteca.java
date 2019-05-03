/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.debora.framework;

import Exportacao.ExportacaoJson;
import Exportacao.exporta;
import Factory.FactoryMarca.FactoryMarca;
import Factory.FactoryModelo.FactoryModelo;
import Factory.FactoryModeloAno.FactoryModeloAno;
import Factory.FactoryCarro.FactoryCarro;
import Factory.FactoryCarro.IFactoryCarro;
import Factory.FactoryMarca.IFactoryMarca;
import Factory.FactoryModelo.IFactoryModelo;
import Factory.FactoryModeloAno.IFactoryModeloAno;
import Objetos.Marca;
import Objetos.Modelo;
import Objetos.ModeloAno;
import Objetos.Carro;
import WebService.VerificaConexao;
import java.io.IOException;
import java.util.List;

/**
 * Classe para utilização da busca de veiculos da tabela FIPE
 *
 * @author Débora Rohden
 * @version 1
 * @since 05/04/2019
 */
public class MetodosBiblioteca implements IFactoryModelo, IFactoryMarca, IFactoryCarro, IFactoryModeloAno, exporta {

    /**
     * Metodo para exportar lista de todas as marca em seu computador
     *
     * @param destino diretorio para salvar Marcas
     * @param lista lista de marcas que queira salvar
     * @throws IOException caso não consiga salvar
     * @return verdadeiro caso consiga exportar, caso não, falso
     */
    public boolean exportaMarca(String destino, List<Marca> lista) throws IOException {
        ExportacaoJson json = new ExportacaoJson();
        return json.exportaMarca(destino, lista);
    }

    /**
     * Metodo para exportar lista do modelos da marca escolhida em seu
     * computador
     *
     * @param destino diretorio para salvar Modelo
     * @param lista lista de modelos que queira salvar
     * @param marca nome da marca para salvar no titulo do documento
     * @throws IOException caso não consiga salvar
     * @return verdadeiro caso consiga exportar, caso não, falso
     */
    public boolean exportaModelo(String destino, List<Modelo> lista, String marca) throws IOException {
        ExportacaoJson json = new ExportacaoJson();
        return json.exportaModelo(destino, lista, marca);
    }

    /**
     * Metodo para importar marcas
     *
     * @return lista com marcas
     */
    @Override
    public List<Marca> cria() {
        FactoryMarca factory = new FactoryMarca();
        return factory.cria();
    }

    /**
     * Metodo para importar modelos de marcas
     *
     * @param id codigo da Marca escolhida
     * @return lista com modelos da marca
     */
    @Override
    public List<Modelo> criaModelo(int id) {
        FactoryModelo factoryM = new FactoryModelo();
        return factoryM.criaModelo(id);
    }

    /**
     * Metodo para importar modelos de diferentes anos de certo modelo
     *
     * @param codMarca codigo da Marca escolhida
     * @param codModelo codigo do Modelo de carro da marca escolhida
     * @return lista com modelos de diferentes anos
     */
    @Override
    public List<ModeloAno> cria(int codMarca, int codModelo) {
        FactoryModeloAno factoryMA = new FactoryModeloAno();
        return factoryMA.cria(codMarca, codModelo);
    }

    /**
     * Metodo para importar carro com suas características
     *
     * @param codMarca codigo da Marca escolhida
     * @param codModelo codigo do Modelo de carro da marca escolhida
     * @param idModeloAno id do Modelo de certo ano escolhido
     * @return objeto carro com suas características
     */
    @Override
    public Carro cria(int codMarca, int codModelo, String idModeloAno) {
        FactoryCarro factoryV = new FactoryCarro();
        return factoryV.cria(codMarca, codModelo, idModeloAno);
    }

    /**
     * Metodo que retorna id da marca escolhida
     *
     * @param lista lista de marcas
     * @param marca nome da marca escolhida
     * @return id da marca
     */
    public int idMarca(List<Marca> lista, String marca) {
        for (Marca m : lista) {
            if (m.getName().equals(marca)) {
                return m.getId();
            }
        }
        return 0;
    }

    /**
     * Metodo que retorna id do modelo escolhido a partir do nome do modelo
     *
     * @param lista lista de modelos da marca escolhida
     * @param Modelo nome do modelo escolhido
     * @return id do modelo
     */
    public int idModelo(List<Modelo> lista, String Modelo) {
        for (Modelo m : lista) {
            if (Modelo.equals(m.getFipe_name())) {
                return m.getId();
            }
        }
        return 0;
    }

    /**
     * Metodo que retorna id do modelo de diferentes anos escolhido a partir do
     * fipe do mesmo
     *
     * @param lista lista de modeloAno
     * @param fipeCodigo descricao do fipeCodigo do modeloAno escolhido
     * @return id/key do modeloAno
     */
    public String id(List<ModeloAno> lista, String fipeCodigo) {
        for (ModeloAno m : lista) {
            String carro = m.getName() + " " + m.getVeiculo();
            if (carro.equals(fipeCodigo)) {
                return m.getId();
            }
        }

        return null;
    }

    /**
     * Metodo que verifica conexao
     *
     * @return se houver conexao retorna verdadeiro, caso não, falso
     */
    public boolean conexao() {
        String url = "http://fipeapi.appspot.com/api/1/carros/marcas.json";
        if (VerificaConexao.consegueConectar(url)) {
            return true;
        } else {
            return false;
        }
    }

}
