package com.bkty.springwebflux.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@RestController
public class WeatherController {


    @Autowired
    RestTemplate restTemplate;


    @GetMapping("/getWeather")
    public ResponseEntity<String> getWeatcher(){
        // 1、访问地址
        String url = "https://eolink.o.apispace.com/456456/weather/v001/now?areacode=101010100";
        // 2、请求头
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("X-APISpace-Token","2kguy10dhx4wmc0pq176g0k2kye18inp");
        // 3、封装请求头
        HttpEntity<MultiValueMap<String, Object>> formEntity = new HttpEntity<>(headers);
        // 4、发送请求
        ResponseEntity<String> result4 = restTemplate.exchange(url, HttpMethod.GET, formEntity, String.class);


        return result4;


    }
    //webClinet
    /**
     * 基于webclient
     * @return
     */
    @GetMapping("/getWeatherwebclient")
    public Mono<String> webclient(){
//     return WebClient
//         .create("https://eolink.o.apispace.com")
//         .get()
//         .uri("/456456/weather/v001/now?areacode={id}", 101010100)
//         .headers(httpHeaders -> {
//           httpHeaders.add("X-APISpace-Token", "cogwd73ct99mcpgswcgseji35z2s5clr");
//           httpHeaders.add("Authorization-Type", "apikey");
//         })
//         .retrieve()
//         .bodyToMono(String.class);


        return WebClient
                .create("https://eolink.o.apispace.com")
                .get()
                .uri(uriBuilder ->
                        uriBuilder.scheme("http")
                                .host("eolink.o.apispace.com")
                                .path("/456456/weather/v001/now")
                                .queryParam("areacode",101010100)
                                .build()
                )
                .headers(httpHeaders -> {
                    httpHeaders.add("X-APISpace-Token", "2kguy10dhx4wmc0pq176g0k2kye18inp");
                })
                .retrieve()
                .bodyToMono(String.class);


    }




}


