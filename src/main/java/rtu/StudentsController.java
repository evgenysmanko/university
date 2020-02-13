package rtu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentsController {

    @GetMapping("/students")
    public String students(@RequestParam(name = "institute", required = false) String institute, Model model){
        return "students";
    }

}
