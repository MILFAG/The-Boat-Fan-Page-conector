package utn.dacs.ms.conector.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.dacs.ms.conector.service.RangoService;


@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class RangoController {
    @Autowired
    private RangoService rangoService;

    @GetMapping(value = "/rangos")
    public Object rangos()    {
        return new ResponseEntity<>(rangoService.rangos(), HttpStatus.OK);
    }

}
