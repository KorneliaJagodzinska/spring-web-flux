package com.example.springwebflux.controller;

import com.example.springwebflux.webflux.Book;
import com.example.springwebflux.webflux.FirstFluxCheck;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class FluxController {

    @GetMapping("/strings")
    public Flux<String> getStrings() {
        return Flux
                .just("a", "b", "c", "d", "e")
                .log();
    }
}
