package project.app.controllers

import org.slf4j.Logger
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class ApplicationController {

    @RequestMapping("/")
    def index() {
        return "index.html"
    }

    @RequestMapping("/example")
    def example(){
        return "examples/index"
    }

}
