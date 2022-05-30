package com.telusko;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SubController {

    @RequestMapping("/sub")
    public ModelAndView sub(@RequestParam("t1") int n1, @RequestParam("t2") int n2){

        int k = n1 + n2;

        ModelAndView mv = new ModelAndView();
        mv.addObject("result", k);
        mv.setViewName("result.jsp");

        return mv;
    }
}
