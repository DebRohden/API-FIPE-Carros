/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory.FactoryMarca;

import Factory.FactoryModelo.FactoryModelo;
import Objetos.Marca;
import WebService.WebService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author debor
 */
public class FactoryMarca implements IFactoryMarca{

    @Override
    public List<Marca> cria() {        
        WebService web = new WebService();
        String json = null;
        try {
            json = web.inicia("http://fipeapi.appspot.com/api/1/carros/marcas.json");
        } catch (Exception ex) {
            Logger.getLogger(FactoryModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        List<Marca> lista = new ArrayList<Marca>();
        Type listType = new TypeToken<ArrayList<Marca>>() {}.getType();
        lista = new Gson().fromJson(json, listType);
        
        return lista;
    }

    
}
