package jp.ac.ccmc.controller_sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class MainController {

    @GetMapping("/page1")
    public String showGetPage1() {
        return "get-page1";
    }

    @GetMapping("/page2")
    public String showGetPage2() {
        return "get-page2";
    }

    @PostMapping("/page1")
    public String showPostPage() {
        return "post-page";
    }

}
    

