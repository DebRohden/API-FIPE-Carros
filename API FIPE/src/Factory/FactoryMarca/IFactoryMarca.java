/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory.FactoryMarca;

import Objetos.Marca;
import java.util.List;

/**
 *
 * @author debor
 */
public interface IFactoryMarca {
    
    public List<Marca> cria();
    
}
