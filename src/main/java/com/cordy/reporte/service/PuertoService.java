package com.cordy.reporte.service;

import com.cordy.reporte.model.Puerto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
@RequiredArgsConstructor
public class PuertoService {

    @Value("${servicios.puerto.url}")
    private String puertoServiceUrl;

    private final RestTemplate restTemplate;

    public Puerto puertoDB(Integer id_puerto) {
        try {
            return restTemplate.getForObject(
                    puertoServiceUrl + "/puertos/" + id_puerto,
                    Puerto.class
            );
        } catch (RestClientException e) {
            log.error("Error al obtener información del puerto: {}", e.getMessage());
            throw new ServiceException("Error en servicio de puertos", e);
        }
    }
}
