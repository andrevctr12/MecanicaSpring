package unioeste.geral.pessoa.fisica.bo;

import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import unioeste.geral.pessoa.bo.Pessoa;

import javax.persistence.Embedded;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public abstract class PessoaFisica extends Pessoa implements Serializable {
    @Embedded
    private CPF cpf;

    @NotNull
    @ManyToOne
    private Genero genero;

    public CPF getCpf() {
        return cpf;
    }

    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
