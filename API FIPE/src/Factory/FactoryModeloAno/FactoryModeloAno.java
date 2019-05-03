package Factory.FactoryModeloAno;

import Factory.FactoryModelo.FactoryModelo;
import Objetos.ModeloAno;
import WebService.WebService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author debor
 */
public class FactoryModeloAno implements IFactoryModeloAno {

    @Override
    public List<ModeloAno> cria(int codMarca, int codModelo) {
        WebService web = new WebService();
        String json = null;
        try {
            json = web.inicia("http://fipeapi.appspot.com/api/1/carros/veiculo/" + codMarca + "/" + codModelo + ".json");
        } catch (Exception ex) {
            Logger.getLogger(FactoryModelo.class.getName()).log(Level.SEVERE, null, ex);
        }

        List<ModeloAno> lista = new ArrayList<ModeloAno>();
        Type listType = new TypeToken<ArrayList<ModeloAno>>() {
        }.getType();
        lista = new Gson().fromJson(json, listType);

        return lista;
    }

}
