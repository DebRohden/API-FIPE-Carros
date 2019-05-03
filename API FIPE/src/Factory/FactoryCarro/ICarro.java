/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory.FactoryCarro;

import Objetos.Carro;
import java.util.List;

/**
 *
 * @author debor
 */
public interface ICarro {
    
    public default List<Carro> infos(){
        return null;
    }
}
