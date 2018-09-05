package unioeste.geral.pessoa.bo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
public class Telefone implements Serializable {
    @Id
    private Long id;

    @NotNull
    private String telefone;

    @ManyToOne
    private DDI ddi;

    @ManyToOne
    private DDD ddd;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public DDI getDdi() {
        return ddi;
    }

    public void setDdi(DDI ddi) {
        this.ddi = ddi;
    }

    public DDD getDdd() {
        return ddd;
    }

    public void setDdd(DDD ddd) {
        this.ddd = ddd;
    }

}
