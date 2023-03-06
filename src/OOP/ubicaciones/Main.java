package OOP.ubicaciones;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import com.sun.deploy.util.StringUtils;

import java.io.FileReader;
import java.io.Reader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Reader reader = new FileReader("/home/mfranke/workspace-intellij/Pruebas-java/src/resources/json.txt")) {
            Gson gson = new Gson();
            String fromSite = "dvpe";
            String toSite = "ubpe";
            List<LinkedTreeMap<String,String>> features = gson.fromJson(reader, ArrayList.class);

            String keyProvinciaFrom = getKey(fromSite, "Province");
            String keyProvinciato = getKey(toSite, "Province");
            String keyCiudadFrom = getKey(fromSite, "City");
            String keyCiudadto = getKey(toSite, "City");
            String keyZonaFrom = getKey(fromSite, "Zone");
            String keyZonato = getKey(toSite, "Zone");
            String keySubzonaFrom = getKey(fromSite, "SubZone");
            String keySubzonato = getKey(toSite, "SubZone");

            List<LinkedTreeMap<String,String>> provinces = new ArrayList<>();
            List<LinkedTreeMap<String,String>> cities = new ArrayList<>();
            List<LinkedTreeMap<String,String>> zones = new ArrayList<>();
            List<LinkedTreeMap<String,String>> subZones = new ArrayList<>();

            for (LinkedTreeMap<String,String> node :features) {
                String ProvinciaFrom = node.get(keyProvinciaFrom);
                String Provinciato = node.get(keyProvinciato);
                String CiudadFrom = node.get(keyCiudadFrom);
                String Ciudadto = node.get(keyCiudadto);
                String ZonaFrom = node.get(keyZonaFrom);
                String Zonato = node.get(keyZonato);
                String SubzonaFrom = node.get(keySubzonaFrom);
                String Subzonato = node.get(keySubzonato);
                if (SubzonaFrom == null && ZonaFrom == null && CiudadFrom == null && ProvinciaFrom != null) {
                    provinces.add(node);
                } else if (SubzonaFrom == null && ZonaFrom == null && CiudadFrom != null && ProvinciaFrom != null) {
                    cities.add(node);
                } else if (SubzonaFrom == null && ZonaFrom != null && CiudadFrom != null && ProvinciaFrom != null) {
                    zones.add(node);
                } else if (SubzonaFrom != null && ZonaFrom != null && CiudadFrom != null && ProvinciaFrom != null) {
                    subZones.add(node);
                }
            }
            Map<String, Ubicacion> mapaZona = new HashMap();
            Map<String, Ubicacion> mapaCiudad = new HashMap();
            Map<String, Ubicacion> mapaProvincia = new HashMap();

            for (LinkedTreeMap<String,String> node :provinces) {
                mapaProvincia.put(node.get(keyProvinciaFrom), new Ubicacion(Level.PROVINCIA, node.get("name"),
                        node.get(keyProvinciaFrom), node.get(keyProvinciato), new HashMap<>()));
            }

            for (LinkedTreeMap<String,String> node :cities) {
                Ubicacion ciudad = new Ubicacion(Level.CIUDAD, node.get("name"),
                        node.get(keyCiudadFrom), node.get(keyCiudadto), new HashMap<>());
                mapaCiudad.put(node.get(keyCiudadFrom), ciudad);
                Ubicacion provincia = mapaProvincia.get(node.get(keyProvinciaFrom));
                if (provincia != null) {
                    provincia.getChildren().put(node.get(keyCiudadFrom),ciudad);
                }

            }

            for (LinkedTreeMap<String,String> node :zones) {
                Ubicacion zona = new Ubicacion(Level.ZONA, node.get("name"),
                        node.get(keyZonaFrom), node.get(keyZonato), new HashMap<>());
                mapaZona.put(node.get(keyZonaFrom), zona);
                Ubicacion ciudad = mapaCiudad.get(node.get(keyCiudadFrom));
                if (ciudad != null) {
                    ciudad.getChildren().put(node.get(keyZonaFrom),zona);
                }

            }

            for (LinkedTreeMap<String,String> node :subZones) {
                Ubicacion subZona = new Ubicacion(Level.SUBZONA, node.get("name"),
                        node.get(keySubzonaFrom), node.get(keySubzonato), null);
                Ubicacion zona = mapaZona.get(node.get(keyZonaFrom));
                if (zona != null) {
                    zona.getChildren().put(node.get(keySubzonaFrom),subZona);
                }

            }

            for (Map.Entry<String,Ubicacion> entry : mapaProvincia.entrySet()) {
                System.out.println(entry.getValue());
            }

        } catch(Exception e){
            System.out.println(e.getStackTrace());
        }
    }

    public static String getKey(String siteCode, String fieldName) {
        return new StringBuilder(siteCode.toLowerCase(Locale.ROOT)).append("_").append(fieldName).toString();
    }
}
