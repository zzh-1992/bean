package com.grapefruit.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author 柚子苦瓜茶
 * @version 1.0
 */
@RestController
@RequestMapping("/bean")
public class IndexController {
    @Autowired
    InitClass initClass;
    @RequestMapping("/index")
    public String getTime(){
        String name = initClass.getName();
        return LocalDateTime.now().toString() + name;
    }
    
    @RequestMapping("/destroy")
    public String toDestroy(){
        String name = initClass.getName();
        return "destroy===>" + LocalDateTime.now().toString() + name;
    }
}
