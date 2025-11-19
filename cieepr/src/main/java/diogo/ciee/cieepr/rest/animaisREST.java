package diogo.ciee.cieepr.rest;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import diogo.ciee.cieepr.model.Animal;


@CrossOrigin
@RestController
public class animaisREST {
    public static List<Animal> lista = new ArrayList<>();

    // Métodos invocados ao chamar a API
    @GetMapping("/animais")
    public List<Animal> obterTodosAnimais () {
    return lista;
}

    // Adições estáticas só pra ter ter alguma coisa
static {
    lista.add(
        new Animal(
            1,
       "Leão Africano",
  "Rei da selva",
             Date.valueOf("2018-03-15"),
    "Panthera leo",
    "Savana",
 "Africa")
    );
    lista.add(
        new Animal(
            2,
       "Tartaruga Gigante",
  "Vive por mais de 100 anos",
             Date.valueOf("1990-07-02"),
    "Chelonoidis nigra",
    "Ilhas/costas rochosas",
 "Equador")
    );
    lista.add(
        new Animal(
            3,
       "Panda gigante",
  "Alimenta-se de bambu",
             Date.valueOf("2015-11-21"),
    "Ailuropoda melanoleuca",
    "Florestas temperadas",
 "China")
    );
}

}
