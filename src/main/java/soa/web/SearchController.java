package soa.web;


import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import static soa.eip.Router.DIRECT_URI;


@Controller
public class SearchController {

  private final ProducerTemplate producerTemplate;

  @Autowired
  public SearchController(ProducerTemplate producerTemplate) {
    this.producerTemplate = producerTemplate;
  }

  @RequestMapping("/")
  public String index() {
    return "index";
  }


  @RequestMapping(value = "/search")
  @ResponseBody
  public Object search(@RequestParam("q") String q) {
    System.out.println(q);

    // Parsing q input
    String[] words = q.split(" ");
    String body = "";
    int count = 5; // Default value just in case max:n option was not used
    // Loop to find max:n option
    for(String s : words){
      // Matches uses Regular Expressions
      if(s.matches("max:[0-9]+")){
        // Found -> Gets new max value from 4th character of matching expression
        count = Integer.parseInt(s.substring(4));
      }
      else {
        body = body + s + " ";
      }
    }

    // Once body and count set we create a request with body.
    // In header we are going to have count value to recover it in Router
    return producerTemplate.requestBodyAndHeader(DIRECT_URI, body, "count", count);
  }
}