package com.ctisistemas.promocoesweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ctisistemas.promocoesweb.domain.SocialMetaTag;
import com.ctisistemas.promocoesweb.service.SocialMetaTagService;

@SpringBootApplication
public class PromocoesWebApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PromocoesWebApplication.class, args);
	}

	@Autowired
	SocialMetaTagService service;

	@Override
	public void run(String... args) throws Exception {

		SocialMetaTag tag = service.getSocialMetaTagByUrl(
				"https://www.mobly.com.br/sofa-3-lugares-retratil-nairobi-suede-grafite-210-cm-677284.html?origin=jetmobly");
		System.out.println(tag.toString());

	}

}
