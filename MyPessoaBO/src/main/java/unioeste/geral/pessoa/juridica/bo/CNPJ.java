package unioeste.geral.pessoa.juridica.bo;

import javax.validation.constraints.NotNull;
import java.io.Serializable;


public class CNPJ implements Serializable {
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
