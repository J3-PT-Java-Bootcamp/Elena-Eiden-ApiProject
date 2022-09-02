package com.ironhack.groupapiproject;

import com.ironhack.groupapiproject.menu.SakuraMenu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class MemoryGameApplication implements CommandLineRunner {

  private final SakuraMenu sakuraMenu;

  public MemoryGameApplication(SakuraMenu sakuraMenu) {
    this.sakuraMenu = sakuraMenu;
  }

  public static void main(String[] args) {SpringApplication.run(MemoryGameApplication.class, args);}


  @Override
  public void run(String... args) {this.sakuraMenu.start();}

}

