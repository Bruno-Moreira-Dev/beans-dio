package br.com.beans.dio.beans_dio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Livro getLivro() {
        return new Livro();
    }

    @Bean
    public Autor getAutorLivro() {
        return new Autor();
    }
}
