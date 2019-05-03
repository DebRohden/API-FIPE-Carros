/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory.FactoryModeloAno;

import Objetos.ModeloAno;
import java.util.List;

/**
 *
 * @author debor
 */
public interface IFactoryModeloAno {
    
    public List<ModeloAno> cria(int codMarca, int codModelo);
   
}
