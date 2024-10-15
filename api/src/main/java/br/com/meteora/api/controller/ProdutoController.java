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

@PostMapping
public void produto (@RequestBody DadosCadastroProduto dados){
    repository.save(new ProdutoModel(dados));
}
}