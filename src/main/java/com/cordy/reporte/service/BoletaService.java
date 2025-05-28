
package com.cordy.reporte.service;


import com.cordy.reporte.model.Boleta;
import lombok.extern.slf4j.Slf4j;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;


@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class BoletaService {

    @Value("${servicios.boleta.url}")
    private String boletaServiceUrl;

    private final RestTemplate restTemplate;


    public Boleta boletaDB(String idBoleta){
        try {
            return restTemplate.getForObject(
                    boletaServiceUrl + "/boleta/" + idBoleta,
                    Boleta.class
            );
        }catch (RestClientException e){
            log.error("Error al obtener informacion de la boleta: {}", e.getMessage());
            throw new RuntimeException("Error al obtener informacion del boleta", e);
        }
    }
}

