package com.in28mins.learnspringframework;

import com.in28mins.learnspringframework.game.GameRunner;
import com.in28mins.learnspringframework.game.MarioGame;
import com.in28mins.learnspringframework.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
					SpringApplication.run(LearnSpringFrameworkApplication.class, args);

		// MarieGame, GameRunner
		GameRunner runner = context.getBean(GameRunner.class);

		// GameRunner tightly coupled to game objects
//		MarioGame game = new MarioGame();
//		SuperContraGame game = new SuperContraGame();
//		GameRunner runner = new GameRunner(game);
		runner.runGame();


	}

}
