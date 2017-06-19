package am.ak.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by karlen on 11.05.16.
 */
@Controller
@RequestMapping(value = "/Test")
public class TestController {

    @RequestMapping(method = RequestMethod.GET)
    public String test() {
        return "";
    }
}
