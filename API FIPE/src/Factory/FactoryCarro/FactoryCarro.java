/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory.FactoryCarro;

import Factory.FactoryModelo.FactoryModelo;
import Objetos.Carro;
import WebService.WebService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author debor
 */
public class FactoryCarro implements IFactoryCarro {

    @Override
    public Carro cria(int codMarca, int codModelo, String idVeiculo) {
       
        WebService web = new WebService();
        String json = null;
        try {
            json = web.inicia("http://fipeapi.appspot.com/api/1/carros/veiculo/" + codMarca + "/" + codModelo + "/" + idVeiculo + ".json");
        } catch (Exception ex) {
            Logger.getLogger(FactoryModelo.class.getName()).log(Level.SEVERE, null, ex);
        }

        Type listType = new TypeToken<Carro>() {
        }.getType();
        Carro ve = new Gson().fromJson(json, listType);
      
        return ve;
    }

}
