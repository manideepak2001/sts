package com.deepak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.deepak.game.GameRunner;
import com.deepak.game.MarioGame;
import com.deepak.game.SuperContraGame;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
		//MarioGame game=new MarioGame();
		SuperContraGame game=new SuperContraGame();

		GameRunner runner=new GameRunner(game);
		runner.runGame();
	}

}
