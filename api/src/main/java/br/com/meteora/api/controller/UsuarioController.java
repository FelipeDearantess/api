package br.com.meteora.api.controller;

import org.springframework.web.bind.annotation.*;

import br.com.meteora.api.model.Usuario.UsuarioModel;
import br.com.meteora.api.model.Usuario.UsuarioRepository;
import br.com.meteora.api.model.pessoa.DadosCadastroPessoa;


import org.springframework.beans.factory.annotation.*;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;
        
    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroPessoa dados){
        repository.save(new UsuarioModel(dados));
    }



    @GetMapping("/listar")
    public String lista(){
        return " Aqui irá ficar a lista dos Usuarios";
    }




    


    
}
