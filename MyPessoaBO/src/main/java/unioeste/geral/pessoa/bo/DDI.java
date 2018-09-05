package unioeste.geral.pessoa.bo;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class DDI implements Serializable {
    @Id
    private int ddi;

    public int getDdi() {
        return ddi;
    }

    public void setDdi(int ddi) {
        this.ddi = ddi;
    }
}
