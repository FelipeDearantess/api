package br.com.meteora.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.meteora.api.model.produto.DadosCadastroProduto;
import br.com.meteora.api.model.produto.ProdutoRepository;
import br.com.meteora.api.model.produto.ProdutoModel;

@RestController
@RequestMapping("/produto")
public class ProdutoController{

@Autowired
private ProdutoRepository repository;

@PostMapping("/cadastrar")
public void cadastrar (@RequestBody DadosCadastroProduto dados){
    repository.save(new ProdutoModel(dados));
}
    
    @GetMapping("/listar")
    public String lista(){
        return " Aqui irá ficar a lista dos Produtos.";
    

}
}