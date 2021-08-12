package com.example.springboot.helloWorld;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

public class RestClient {
    private static final String Get_API="http://localhost:8080/hello";
    static RestTemplate rest=new RestTemplate();

    public static void main(String[] args) {
        callGetAPI();


    }
    private static void callGetAPI(){
        HttpHeaders header=new HttpHeaders();
        header.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        HttpEntity<String> entity=new HttpEntity<>("parameters",header);
        ResponseEntity<String> result= rest.exchange(Get_API, HttpMethod.GET,entity,String.class);
        System.out.println(result);
    }



}
