package unioeste.geral.pessoa.juridica.bo;

import javax.validation.constraints.NotNull;
import unioeste.geral.pessoa.bo.Pessoa;

import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

import java.io.Serializable;

@MappedSuperclass
public abstract class PessoaJuridica extends Pessoa implements Serializable {
    @NotNull
    @OneToOne
    private CNPJ cnpj;

    public CNPJ getCnpj() {
        return cnpj;
    }

    public void setCnpj(CNPJ cnpj) {
        this.cnpj = cnpj;
    }
}
