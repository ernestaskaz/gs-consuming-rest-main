package com.example.consumingrest.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/quote")
public class QuoteController {

//    @GetMapping("/random")
//    public Quote getQuote(@RequestParam(value = "id") long id) {
//        Quote quote = new Quote();
//        quote.setType("some kind of a type of Quote object");
//        Value value = new Value();
//        value.setQuote("this is some kind of quote of Value object");
//        value.setId(id);
//        quote.setValue(value);
//
//
//        return quote;
//
//    }
//
//
//    @GetMapping("/random/{id}")
//    public Quote getVariableQuote(@PathVariable("id") long id) {
//        Quote quote = new Quote();
//        quote.setType("path variable of type Quote");
//        Value value = new Value();
//        value.setQuote("a quote value from variable");
//        value.setId(id);
//        quote.setValue(value);
//
//       //http://localhost:8080/quote/random/78
//
//        return quote;
//
//    }
}
