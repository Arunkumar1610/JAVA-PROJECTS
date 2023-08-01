package com.example.demo;

public class calculation {
	
	private float weight;
	private float height;
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	
	
    public float calculateBMIValue(Float weight, Float height) {
        
    	height=height/100;
        return weight / (height * height);
    }

    public String getBMICategory(float bmi) 
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
