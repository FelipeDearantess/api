package br.com.meteora.api.model.pessoa;

import jakarta.persistence.*;
import lombok.*;


@Table(name ="pessoas")
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class PessoaModel {

    @Id//somente para ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)//somente para ID
    private long id;

    private String nome;

    private String cpf;

    private char genero;
    private String dataDeNascimento;
    private String email;
    private String endereco;
    private String senha;
public PessoaModel(DadosCadastroPessoa dados ){
    this.nome =dados.nome();
    this.cpf = dados.cpf();
    this.email = dados.email();
    this.endereco = dados.endereco();
    this.senha = dados.senha();
    this.dataDeNascimento = dados.dataDeNascimento();
    this.genero = dados.genero();
}
}
