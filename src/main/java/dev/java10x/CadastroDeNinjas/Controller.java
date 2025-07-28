package dev.java10x.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1")
public class Controller {

    @GetMapping(path = "/boasVindas")
    public String boasVindas() {
        return "Essa é minha primeira menssagem nessa rota";
    }

}
