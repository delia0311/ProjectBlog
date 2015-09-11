package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by DELIA on 10.09.2015.
 */

@Controller
public class DefaultRestController {

    @RequestMapping("/blog-rest-service")
    public String blog() {
        return "index.jsp";
    }



}
