package unip.alpoo.atividade01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    
    @GetMapping("/hello")
    public String hello(){
        return "Olá Luiz";
    }

    @GetMapping("/helloNome")
    public String helloNome(@RequestParam String nome) {
        return "Olá " + nome;
    }

}
