package utn.dacs.ms.conector.service;

import org.apache.catalina.valves.rewrite.RandomizedTextRewriteMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.dacs.ms.conector.api.client.ValorantApi;
import utn.dacs.ms.conector.dto.PersonajeDTO;
import utn.dacs.ms.conector.dto.RangoDTO;
import utn.dacs.ms.conector.dto.TiersCompetitivosDTO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RangoService {
    @Autowired
    ValorantApi valorantApi;
    public List<RangoDTO> rangos() {
        List<TiersCompetitivosDTO> tiersCompetitivos = Arrays.stream(this.valorantApi.rangos().getData()).toList();
        return Arrays.stream(tiersCompetitivos.get(tiersCompetitivos.size()-1).getRangos()).toList();
    }

    public List<RangoDTO> obtenerPersonaje(String nombre) {
        System.out.println(nombre);
        return this.rangos().stream().filter(rango -> rango.getRango().equalsIgnoreCase(nombre)).collect(Collectors.toList());
    }
}
