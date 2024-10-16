package br.com.especivia.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarroController {

    @GetMapping("/get")
    public String get() {
        return "Request GET";
    }

    @PostMapping("/post")
    public String post() {
        return "Request POST";
    }

    @PutMapping("/put")
    public String put() {
        return "Request PUT";
    }

    @DeleteMapping("/delete")
    public String delete() {
        return "Request DELETE";
    }

}
