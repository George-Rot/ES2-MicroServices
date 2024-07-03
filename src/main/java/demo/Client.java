import java.util.ArrayList;
import java.util.List;

public class Client {
    private long code;
    private String Nome;
    private String email;
    private List<Assinatura> assinaturas = new ArrayList<Assinatura>(); //facilita achar as assinaturas de determinado cliente
    
    public Client(long code, String Nome, String email){
        this.code = code;
        this.Nome = Nome;
        this.email = email;
    }

    public long getCode() {
        return code;
    }

    public String getNome() {
        return Nome;
    }

    public String getEmail() {
        return email;
    }

    public List<Assinatura> getAssinaturas(){
        return assinaturas;
    }

    public void addAssinatura(Assinatura assinatura){
        assinaturas.add(assinatura);
    }
}