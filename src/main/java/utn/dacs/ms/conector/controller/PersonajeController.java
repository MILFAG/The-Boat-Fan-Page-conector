package utn.dacs.ms.conector.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.dacs.ms.conector.service.PersonajeService;


@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class PersonajeController {

    @Autowired
    private PersonajeService personajeService;

    @GetMapping(value = "/agentes")
    public Object agentes()
    {
        return new ResponseEntity<>(personajeService.agentes(), HttpStatus.OK);
    }

}
