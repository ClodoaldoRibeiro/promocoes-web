package com.ctisistemas.promocoesweb.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class SocialMetaTag implements Serializable {

	private String site;

	private String titulo;

	private String url;

	private String imagem;

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	@Override
	public String toString() {
		return "SocialMetaTag [site=" + site + ", titulo=" + titulo + ", url=" + url + ", imagem=" + imagem + "]";
	}

}
