package com.ironhack.groupapiproject.util;

public class Util {

  private static String[] idList = {
          "6039396a68347a4a842920cf",
          "603a5d82e708590015ca94cc",
          "603a5e3ce708590015ca94cd",
          "603a5eb7e708590015ca94ce",
          "603a5f60e708590015ca94cf",
          "603a600be708590015ca94d0",
          "603a6076e708590015ca94d1",
          "603a60e8e708590015ca94d2",
          "603a617de708590015ca94d3",
          "603a622ce708590015ca94d4",
          "603a628ce708590015ca94d5",
          "603a66f3e708590015ca94d6",
          "603a6814e708590015ca94d7",
          "603a6898e708590015ca94d8",
          "603a68e3e708590015ca94d9",
          "603a6983e708590015ca94da",
          "603a69d1e708590015ca94db",
          "603a6a29e708590015ca94dc",
          "603a6a7fe708590015ca94dd",
          "603a6b0ee708590015ca94de",
          "603a6d10e708590015ca94df"
  };
  public static String getRandomSakuraCardId(){
    int random = (int) (Math.random() * (idList.length - 0) + 0);
    return idList[random];
  }

  public static String[] getIdsSakuraCard(){
    return idList;
  }
}
