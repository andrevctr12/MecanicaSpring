package unioeste.mecanica.cliente.bo;

import unioeste.geral.pessoa.fisica.bo.PessoaFisica;
import unioeste.mecanica.veiculo.bo.Veiculo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Entity
public class Cliente extends PessoaFisica implements Serializable {
    @NotNull
    private String senha;

    @OneToMany(mappedBy = "cliente")
    private List<Veiculo> veiculos;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
}
