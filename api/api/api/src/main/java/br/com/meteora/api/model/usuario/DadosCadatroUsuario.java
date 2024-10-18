package br.com.meteora.api.model.usuario;

public record DadosCadatroUsuario (
    String nome,
    String cpf,
    String dataDeNascimento,
    String email,
    char genero,
    String endereco,
    String senha)
    {
}
