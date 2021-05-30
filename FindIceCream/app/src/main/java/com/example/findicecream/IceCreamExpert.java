package com.example.findicecream;

import java.util.ArrayList;
import java.util.List;

public class IceCreamExpert {

    List<String> GetBrands(String s){
        ArrayList<String> res=new ArrayList<>();
        if(s.equals("White")){
            res.add("Vanilla");
        }
        else if(s.equals("Brown")){
            res.add("Chocolate");
        }
        else if(s.equals("Green")){
            res.add("Pista");
        }else{
            res.add("Mango");
        }
        return  res;
    }
}
