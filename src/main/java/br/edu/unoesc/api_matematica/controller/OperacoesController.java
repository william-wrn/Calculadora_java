package br.edu.unoesc.api_matematica.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import calculadora.Calculadora;
import excecoes.erroNumerico;

@RestController
@RequestMapping("/operacao")
public class OperacoesController {

    // Raiz quadrada
    @RequestMapping("/raiz2-query")
    public ResponseEntity<String> raiz2Query(@RequestParam(value = "numero1", defaultValue = "0") String numero1) {
        try {
            String resultado = Calculadora.raiz2(numero1);
            return ResponseEntity.ok(resultado);
        } catch (erroNumerico e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @RequestMapping("/raiz2-path/{numero1}")
    public ResponseEntity<String> raiz2Path(@PathVariable(value = "numero1") String numero1) throws Exception {
        try {
            String resultado = Calculadora.raiz2(numero1);
            return ResponseEntity.ok(resultado);
        } catch (erroNumerico e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    // Potência
    @RequestMapping("/potencia-query")
    public ResponseEntity<String> potenciaQuery(@RequestParam(value = "numero1", defaultValue = "0") String numero1,
            @RequestParam(value = "numero2", defaultValue = "0") String numero2) {
        try {
            String resultado = Calculadora.potencia(numero1, numero2);
            return ResponseEntity.ok(resultado);
        } catch (erroNumerico e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @RequestMapping("/potencia-path/{numero1}/{numero2}")
    public ResponseEntity<String> potenciaPath(@PathVariable(value = "numero1") String numero1,
            @PathVariable(value = "numero2") String numero2) throws Exception {
        try {
            String resultado = Calculadora.potencia(numero1, numero2);
            return ResponseEntity.ok(resultado);
        } catch (erroNumerico e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    // Média
    @RequestMapping("/media-query")
    public ResponseEntity<String> mediaQuery(@RequestParam(value = "numero1", defaultValue = "0") String numero1,
            @RequestParam(value = "numero2", defaultValue = "0") String numero2) {
        try {
            String resultado = Calculadora.media(numero1, numero2);
            return ResponseEntity.ok(resultado);
        } catch (erroNumerico e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @RequestMapping("/media-path/{numero1}/{numero2}")
    public ResponseEntity<String> mediaPath(@PathVariable(value = "numero1") String numero1,
            @PathVariable(value = "numero2") String numero2) throws Exception {
        try {
            String resultado = Calculadora.media(numero1, numero2);
            return ResponseEntity.ok(resultado);
        } catch (erroNumerico e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    // Divisão
    @RequestMapping("/divisao-query")
    public ResponseEntity<String> divisaocaoQuery(@RequestParam(value = "numero1", defaultValue = "0") String numero1,
            @RequestParam(value = "numero2", defaultValue = "0") String numero2) {
        try {
            String resultado = Calculadora.divisao(numero1, numero2);
            return ResponseEntity.ok(resultado);
        } catch (erroNumerico e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @RequestMapping("/divisao-path/{numero1}/{numero2}")
    public ResponseEntity<String> divisaoPath(@PathVariable(value = "numero1") String numero1,
            @PathVariable(value = "numero2") String numero2) throws Exception {
        try {
            String resultado = Calculadora.divisao(numero1, numero2);
            return ResponseEntity.ok(resultado);
        } catch (erroNumerico e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    // Multiplicacao
    @RequestMapping("/multiplicacao-query")
    public ResponseEntity<String> multiplicacaoQuery(
            @RequestParam(value = "numero1", defaultValue = "0") String numero1,
            @RequestParam(value = "numero2", defaultValue = "0") String numero2) {
        try {
            String resultado = Calculadora.multiplicacao(numero1, numero2);
            return ResponseEntity.ok(resultado);
        } catch (erroNumerico e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @RequestMapping("/multiplicacao-path/{numero1}/{numero2}")
    public ResponseEntity<String> multiplicacaoPath(@PathVariable(value = "numero1") String numero1,
            @PathVariable(value = "numero2") String numero2) throws Exception {
        try {
            String resultado = Calculadora.multiplicacao(numero1, numero2);
            return ResponseEntity.ok(resultado);
        } catch (erroNumerico e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    // Subtração
    @RequestMapping("/subtracao-query")
    public ResponseEntity<String> subtracaoQuery(@RequestParam(value = "numero1", defaultValue = "0") String numero1,
            @RequestParam(value = "numero2", defaultValue = "0") String numero2) {
        try {
            String resultado = Calculadora.subtracao(numero1, numero2);
            return ResponseEntity.ok(resultado);
        } catch (erroNumerico e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @RequestMapping("/subtracao-path/{numero1}/{numero2}")
    public ResponseEntity<String> subtracaoPath(@PathVariable(value = "numero1") String numero1,
            @PathVariable(value = "numero2") String numero2) throws Exception {
        try {
            String resultado = Calculadora.subtracao(numero1, numero2);
            return ResponseEntity.ok(resultado);
        } catch (erroNumerico e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    // Soma
    @RequestMapping("/soma-query")
    public ResponseEntity<String> somaQuery(@RequestParam(value = "numero1", defaultValue = "0") String numero1,
            @RequestParam(value = "numero2", defaultValue = "0") String numero2) {
        try {
            String resultado = Calculadora.soma(numero1, numero2);
            return ResponseEntity.ok(resultado);
        } catch (erroNumerico e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @RequestMapping("/soma-path/{numero1}/{numero2}")
    public ResponseEntity<String> somarPath(@PathVariable(value = "numero1") String numero1,
            @PathVariable(value = "numero2") String numero2) throws Exception {
        try {
            String resultado = Calculadora.soma(numero1, numero2);
            return ResponseEntity.ok(resultado);
        } catch (erroNumerico e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

}
