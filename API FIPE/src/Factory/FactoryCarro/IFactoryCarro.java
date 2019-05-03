/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory.FactoryCarro;

import Objetos.Carro;

/**
 *
 * @author debor
 */
public interface IFactoryCarro {
    
    public Carro cria(int codMarca, int codModelo, String idVeiculo);
}
