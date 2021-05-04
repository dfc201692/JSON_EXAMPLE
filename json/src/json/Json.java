package json;

import org.json.simple.JSONObject;

/**
 * @author david.cruz
 */
public class Json {

    public static void main(String[] args) {

        JSONObject obj = new JSONObject();
        obj.put("name", "David");
        obj.put("apellido","Cruz");
        obj.put("ciudad", "Bogotá");
        obj.put("celuar", "3124887710");
        obj.put("direccion", "calle 5 N° 74 - 82 sur");
        obj.put("email", "davidferneycruz@gmail.com");
        obj.put("Tipoid", "CC");
        obj.put("numid", "1053847384");
        obj.put("age", new Integer(30));
        obj.put("salary", new Double(12000));
        System.out.print(obj); //imprime el json
    }
}


    

