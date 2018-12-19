package com.discoverClientSecond.demo.DiscoveryMSTwoDemp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by mshaik on 12/19/18.
 */
@RestController
@RequestMapping("${microservice.contextpath}")
public class testController2 {


  @Autowired
  RestTemplate restTemplate;

  @RequestMapping(method = RequestMethod.GET)
  public String validateOne() {

    String url = "http://discovery-service-demo/api/v1/test";
    return restTemplate.getForObject(url,String.class);
  }

}
