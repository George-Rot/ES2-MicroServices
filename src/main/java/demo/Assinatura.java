import java.time.LocalDate;

public class Assinatura {
    private long code;
    private long codeApp;
    private long codeCli;
    private LocalDate inicioVigencia;
    private LocalDate fimVigencia;

    public Assinatura(long code, long codeApp, long codeCli, LocalDate inicioVigencia, LocalDate fimVigencia){
        this.code = code;
        this.codeApp = codeApp;
        this.codeCli = codeCli;
        this.inicioVigencia = inicioVigencia;
        this.fimVigencia = fimVigencia;
    }

    public long getCode() {
        return code;
    }

    public long getCodeApp() {
        return codeApp;
    }

    public long getCodeCli() {
        return codeCli;
    }

    public LocalDate getInicioVigencia() {
        return inicioVigencia;
    }

    public LocalDate getFimVigencia() {
        return fimVigencia;
    }
    
    public boolean isAtiva(){ // garante que a assinatura ja comecou e ainda nao acabou
        return LocalDate.now().isAfter(inicioVigencia) && LocalDate.now().isBefore(fimVigencia);
    }
}
