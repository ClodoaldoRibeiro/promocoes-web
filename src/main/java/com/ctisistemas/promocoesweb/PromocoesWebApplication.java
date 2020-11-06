package com.ctisistemas.promocoesweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ctisistemas.promocoesweb.domain.SocialMetaTag;
import com.ctisistemas.promocoesweb.service.SocialMetaTagService;

@SpringBootApplication
public class PromocoesWebApplication implements CommandLineRunner {

	final String KABUM_twitter = "https://www.kabum.com.br/cgi-local/site/produtos/descricao_ofertas.cgi?codigo=94938";
	final String PICHAL_openGraph = "https://www.pichau.com.br/perifericos/mesa-digitalizadora/mesa-digitalizadora-wacom-pequena-one-ctl472";
	final String UDAMY_OpenGraph = "https://www.udemy.com/course/spring-boot-mvc-com-spring-security/ ";

	public static void main(String[] args) {
		SpringApplication.run(PromocoesWebApplication.class, args);
	}

	@Autowired
	SocialMetaTagService service;

	@Override
	public void run(String... args) throws Exception {

		// SocialMetaTag tag = service.getSocialMetaTagByUrl(UDAMY_OpenGraph);

		// if (tag != null) {
		// System.out.println(tag.toString());
		// } else {
		// System.out.println("URL inválido!");
		// }

	}

}
