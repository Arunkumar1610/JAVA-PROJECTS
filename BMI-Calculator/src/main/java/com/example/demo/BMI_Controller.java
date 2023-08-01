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
    public String calculateBMI(@RequestParam("weight") Float weight, @RequestParam("height") float height, Model model) {
        float bmi = calculateBMIValue(weight, height);
        String category = getBMICategory(bmi);
        model.addAttribute("bmi", bmi);
        model.addAttribute("category", category);
        return "bmiResult.jsp";
    }

    private float calculateBMIValue(Float weight, Float height) {
        // Formula: BMI = weight (kg) / (height (m) * height (m))
    	height=height/100;
        return weight / (height * height);
    }

    private String getBMICategory(float bmi) 
    {

    	if(bmi<18.5){
    	    return "Underweight";
    	     }else if(18.5<=bmi&&bmi<=24.9){
    	    return "Healthy";
    	     }else if(25<=bmi&&bmi<=29.9){
    	    return "Overweight";
    	     }else if(30<=bmi&&bmi<=34.9){
    	    return "Obese";
    	     }else{
    	    return "Extremely obese";
    	     }
		
    	
    }
}

