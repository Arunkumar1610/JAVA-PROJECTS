package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class BMI_Controller {
    
    @GetMapping("bmi")
    public String showForm() {
        return "bmiForm.jsp";
    }

    @PostMapping("/calculate")
    public String calculateBMI(calculation cal, Model model)
    {
        float bmi = cal.calculateBMIValue(cal.getWeight(), cal.getHeight());
  
        String category = cal.getBMICategory(bmi);
        
        model.addAttribute("bmi", bmi);
        model.addAttribute("category", category);
        return "bmiResult.jsp";
    }


}

