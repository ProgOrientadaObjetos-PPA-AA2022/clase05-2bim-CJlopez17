package paquete10;

public class APIStarPlus implements APIMovie {

    private String apiKey;

    @Override
    public void establecerApiKey(String ak) {
        apiKey = String.format("%s%s", ak, "104578");
    }

    @Override
    public String obtenerApiKey() {
        return apiKey;
    }

    public String toString(){
        return "Staar plus";
    }
}
