package br.com.meteora.api.controller;

import org.springframework.web.bind.annotation.*;

import br.com.meteora.api.model.usuario.DadosCadatroUsuario;
import br.com.meteora.api.model.usuario.UsuarioModel;
import br.com.meteora.api.model.usuario.UsuarioRepository;

import org.springframework.beans.factory.annotation.*;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;
        
    @PostMapping("/cadastrar")
    public void cadastrar(@RequestBody DadosCadatroUsuario dados){
        repository.save(new UsuarioModel(dados));
    }



    @GetMapping("/listar")
    public String lista(){
        return " Aqui irá ficar a lista dos Usuarios";
    }




    


    
}
