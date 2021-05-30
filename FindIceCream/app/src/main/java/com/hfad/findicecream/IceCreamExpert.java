package com.hfad.findicecream;

import java.util.ArrayList;
import java.util.List;

public class IceCreamExpert {
    List<String> getBrands(String color){
        List<String> brands=new ArrayList<>();
        if(color.equals("white")){
            brands.add("vanilla");
        }
        else if(color.equals("yellow")){
            brands.add("Mango");
        }
        else if(color.equals("green")){
            brands.add("pista");
        }
        else{
            brands.add("chocolate");
        }
        return brands;
    }
}
