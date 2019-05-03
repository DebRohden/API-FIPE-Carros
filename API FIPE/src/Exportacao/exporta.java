/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exportacao;

import Objetos.Marca;
import Objetos.Modelo;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author debor
 */
public interface exporta{
    
    public boolean exportaMarca(String destino, List<Marca> marcas)throws IOException ;
    public boolean exportaModelo(String destino,List<Modelo> modelos, String marca)throws IOException ;
}
