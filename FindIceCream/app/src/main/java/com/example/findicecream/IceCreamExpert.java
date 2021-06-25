package com.example.findicecream;

import java.util.ArrayList;
import java.util.List;

public class IceCreamExpert {
    List<String> getBrand(String color){
        List<String> brands=new ArrayList<>();
        if(color.equals("White")){
            brands.add("Vanilla");
        }else if(color.equals("Green")){
            brands.add("Pista");
        }else if(color.equals("Brown")){
            brands.add("chocolate");
        }else if(color.equals("Yellow")){
            brands.add("Mango");
        }else {
            brands.add("No flavor Selected");
        }
        return  brands;
    }
}
