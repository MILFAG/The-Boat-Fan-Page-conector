package utn.dacs.ms.conector.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.dacs.ms.conector.dto.PersonajeDTO;
import utn.dacs.ms.conector.dto.Respuesta;
import utn.dacs.ms.conector.service.PersonajeService;

import java.util.List;


@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class PersonajeController {

    @Autowired
    private PersonajeService personajeService;

    @GetMapping(value = "/agentes")
    public ResponseEntity<List<PersonajeDTO>> agentes()
    {
        List<PersonajeDTO> listaPersonajes = personajeService.agentes();
        return new ResponseEntity<>(listaPersonajes, HttpStatus.OK);
    }

    @GetMapping(value = "/agentes/{nombre}")
    public ResponseEntity<List<PersonajeDTO>> obtenerPersonaje(@PathVariable String nombre)
    {
        return new ResponseEntity<>(personajeService.obtenerPersonaje(nombre),HttpStatus.OK);
    }



}
