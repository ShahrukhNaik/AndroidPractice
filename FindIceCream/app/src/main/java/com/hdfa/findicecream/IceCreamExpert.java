package com.hdfa.findicecream;

import java.util.ArrayList;
import java.util.List;

public class IceCreamExpert {
  public List<String> expert(String s){
      ArrayList<String> res=new ArrayList<String>();
      if(s.equals("White")){
          res.add("Vanilla");
      }else if(s.equals("Green")){
          res.add("Pista");
      }
      else if(s.equals("Brown")){
          res.add("Chocolate");
      }
      else {
          res.add("Mango");
      }
      return res;
  }
}
