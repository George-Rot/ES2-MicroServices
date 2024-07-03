import java.util.ArrayList;
import java.util.List;

public class clientService {
    List<Client> conteinerClient = new ArrayList<Client>();
    
    
    public void addClient(long code, String nome, String email) {
        
        conteinerClient.add(new Client(code, nome, email));
    }

    public void removeClient(long code) {
        for (Client client : conteinerClient) {
            if (client.getCode() == code) {
                conteinerClient.remove(client);
                break;
            }
        }
    }

    public Client getClient(long code) {
        for (Client client : conteinerClient) {
            if (client.getCode() == code) {
                return client;
            }
        }
        return null;
    }

    public void addAssinatura(Assinatura assinatura, long clientCode) {
        for (Client client : conteinerClient) {
            if (client.getCode() == clientCode) {
                client.addAssinatura(assinatura);
                break;
            }
        }
    }
}
