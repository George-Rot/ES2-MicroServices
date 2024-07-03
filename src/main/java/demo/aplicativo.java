public class App {
    private long code;
    private String nome;
    private float custoMensal;

    public App(long code, String nome, float custoMensal) {
        this.code = code;
        this.nome = nome;
        this.custoMensal = custoMensal;
    }

    public long getCode() {
        return code;
    }

    public String getNome() {
        return nome;
    }

    public float getCustoMensal() {
        return custoMensal;
    }
    
}
