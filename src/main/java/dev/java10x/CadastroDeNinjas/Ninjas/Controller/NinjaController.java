package dev.java10x.CadastroDeNinjas.Ninjas.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1")
public class NinjaController {

    @GetMapping(path = "/boasVindas")
    public String boasVindas() {
        return "Essa é minha primeira menssagem nessa rota";
    }

}
