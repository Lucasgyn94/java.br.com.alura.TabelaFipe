package br.com.alura.TabelaFipe;

import br.com.alura.TabelaFipe.main.Main;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class TabelaFipeApplication implements CommandLineRunner {

	public static void main(String[] args){
		SpringApplication.run(TabelaFipeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main principal = new Main();
		principal.exibeMenu();
	}
}
