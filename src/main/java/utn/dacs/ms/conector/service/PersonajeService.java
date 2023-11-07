package utn.dacs.ms.conector.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import utn.dacs.ms.conector.api.client.ValorantApi;

@Service
public class PersonajeService {
    @Autowired
    ValorantApi valorantApi;
    public Object agentes() {
        return this.valorantApi.agentes();
    }
}
