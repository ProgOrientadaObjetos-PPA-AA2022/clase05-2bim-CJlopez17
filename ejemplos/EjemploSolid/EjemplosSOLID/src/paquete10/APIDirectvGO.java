package paquete10;

public class APIDirectvGO implements APIMovie{

    private String apiKey;

    @Override
    public void establecerApiKey(String ak){
        apiKey = String.format("%s%s",ak,"+505478");
    }

    @Override
    public String obtenerApiKey() {
        return apiKey;
    }

    public String toString(){
        return "DicrectvGo";
    }
}
