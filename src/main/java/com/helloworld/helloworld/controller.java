package com.helloworld.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class controller {
    @PostMapping("/")
    public int add(@RequestBody addition add)
    {
       return add.getA()+add.getB();
    }
}
