package br.com.beans.dio.beans_dio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class BeansDioApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeansDioApplication.class, args);

		AbstractApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

		Livro livro = factory.getBean(Livro.class);
		livro.setNome("Lord of rings");
		livro.setCodigo("D34FD");

		Autor autor = factory.getBean(Autor.class);
		autor.setNome("J. R. R. Tolkien");

		livro.exibir();

		factory.close();
	}

}
