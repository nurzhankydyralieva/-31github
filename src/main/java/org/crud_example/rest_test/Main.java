package org.crud_example.rest_test;

import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        RestTemplate template = new RestTemplate();
       // String url = "https://reqres.in/api/users/2";
      //  String forObject = template.getForObject(url, String.class);
      //  System.out.println(forObject);

        Map<String, String> map = new HashMap<>();
        map.put("name", "Test name");
        map.put("job", "Test job");
        HttpEntity<Map<String, String>> entity = new HttpEntity<>(map);
        String urlPost = "https://reqres.in/api/users/";
        String post = template.postForObject(urlPost, entity, String.class);
        System.out.println(post);
    }
}
