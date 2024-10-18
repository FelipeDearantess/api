package br.com.meteora.api.model.usuario;


import jakarta.persistence.*;
import lombok.*;


@Table(name = "usuarios")
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

public class UsuarioModel {
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

    public UsuarioModel(DadosCadatroUsuario dados){
        this.nome = dados.nome();
        this.cpf = dados.cpf();
        this.email = dados.email();
        this.endereco = dados.endereco();
        this.senha = dados.senha();
        this.dataDeNascimento = dados.dataDeNascimento();
        this.genero = dados.genero();

    }
}
