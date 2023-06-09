package com.driver;

import org.w3c.dom.ls.LSOutput;

public class Main {
  public static void main(String[] args) {
    RWOnly obj = new RWOnly("Vedant");
    obj.setName("Vedant Walavalkar");
    System.out.println(obj.getName());
  }
}