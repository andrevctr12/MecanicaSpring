package unioeste.geral.pessoa.bo;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
import unioeste.geral.endereco.bo.EnderecoEspecifico;

import javax.persistence.Embedded;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import java.io.Serializable;

@MappedSuperclass
public abstract class Pessoa implements Serializable {
    @Id
    private Long id;

    @NotEmpty
    private String nomeCompleto;

    @OneToMany
    @NotNull
    private List<Email> emails;

    @OneToMany
    @NotNull
    private List<Telefone> telefones;

    @Embedded
    private EnderecoEspecifico endereco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public EnderecoEspecifico getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoEspecifico endereco) {
        this.endereco = endereco;
    }
}
