package utn.dacs.ms.conector.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.dacs.ms.conector.api.client.ValorantApi;
import utn.dacs.ms.conector.dto.PersonajeDTO;
import utn.dacs.ms.conector.dto.Respuesta;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonajeService {
    @Autowired
    ValorantApi valorantApi;
    public List<PersonajeDTO> agentes() {
        return Arrays.stream(this.valorantApi.agentes().getData()).toList() ;
    }
   public List<PersonajeDTO> obtenerPersonaje(String nombre) {
        return this.agentes().stream().filter(agente -> agente.getNombre().equalsIgnoreCase(nombre)).collect(Collectors.toList());
    }
}
