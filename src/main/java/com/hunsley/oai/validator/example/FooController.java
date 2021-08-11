package com.hunsley.oai.validator.example;

import java.util.Random;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "foo")
public class FooController {

  @RequestMapping(value = "/{name}", method = RequestMethod.GET)
  public Foo getFoo(@PathVariable final String name) {
    return new Foo(name, new Random().nextInt(), true);
  }


  @RequestMapping(method = RequestMethod.POST)
  public void createFoo(@RequestBody Foo foo) {
    System.out.println(foo.toString());
  }
}
