package israel.av2apiserve.q8.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="produto")
@Data
public class produto implements Serializable{
    static final long serialVersionUID = 1L;

    @Id
    private long id;
    private String nome;
    private String categoria;
    private Double preco;
    private String imageURI;

}
