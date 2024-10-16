package br.com.meteora.api.model.produto;

import jakarta.persistence.*;
import lombok.*;


@Table(name = "produtos")
@Entity
@Getter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class ProdutoModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;
    private String cpf;

    private char genero;
    private String dataDeNascimento;
    private String email;
    private String endereco;
    private String senha;

    public  ProdutoModel(DadosCadastroProduto dados){
        this.nome = dados.nome();
        this.cpf =dados.cpf();
        this.email =dados.email();
        this.endereco =dados.endereco();
        this.senha = dados.senha();
        this.dataDeNascimento = dados.dataDeNascimento();
        this.genero = dados.genero();
    }
}