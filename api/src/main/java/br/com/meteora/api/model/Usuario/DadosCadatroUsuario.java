package br.com.meteora.api.model.Usuario;

public record DadosCadatroUsuario (
    String cpf,
    String dataDeNacimento,
    String email,
    char genero,
    String endereco,
    String senha)
    {
}
