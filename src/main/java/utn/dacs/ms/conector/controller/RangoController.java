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
import utn.dacs.ms.conector.dto.RangoDTO;
import utn.dacs.ms.conector.service.RangoService;

import java.util.List;


@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class RangoController {
    @Autowired
    private RangoService rangoService;

    @GetMapping(value = "/rangos")
    public ResponseEntity<List<RangoDTO>> rangos()
    {
        List<RangoDTO> listaRangos = rangoService.rangos();
        return new ResponseEntity<>(listaRangos, HttpStatus.OK);
    }

    @GetMapping(value = "/rangos/{nombre}")
    public ResponseEntity<List<RangoDTO>> obtenerPersonaje(@PathVariable String nombre)
    {
        return new ResponseEntity<>(rangoService.obtenerPersonaje(nombre),HttpStatus.OK);
    }

}
