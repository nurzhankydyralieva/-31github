package org.rest_test;

import org.springframework.web.client.RestTemplate;

public class Main {
    public static void main(String[] args) {
        RestTemplate template = new RestTemplate();
        String url = "https://reqres.in/api/users/2";
        String forObject = template.getForObject(url, String.class);
        System.out.println(forObject);
    }
}
