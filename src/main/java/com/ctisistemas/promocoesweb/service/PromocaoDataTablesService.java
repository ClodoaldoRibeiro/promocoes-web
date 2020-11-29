package com.ctisistemas.promocoesweb.service;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.ctisistemas.promocoesweb.repository.PromocaoRepository;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

public class PromocaoDataTablesService {

	private String[] cols = { "id", "titulo", "site", "linkPromocao", "descricao", "linkImagem", "preco", "likes",
			"dtCadastro", "categoria" };

	public Map<String, Object> execute(PromocaoRepository repository, HttpServletRequest request) {

		// Recupera os valores da página
		int start = Integer.parseInt(request.getParameter("start"));
		int lenght = Integer.parseInt(request.getParameter("lenght"));
		int draw = Integer.parseInt(request.getParameter("draw"));

		int current = currentPage(start, lenght);

		String column = columnName(request);
		Sort.Direction direction = orderBy(request);

		// Montar o arquivo Json para a tabela da página
		Map<String, Object> json = new LinkedHashMap<>();
		json.put("draw", draw);
		json.put("recordsTotal", null);
		json.put("recordsFiltered", null);
		json.put("data", null);
		return json;
	}

	private Direction orderBy(HttpServletRequest request) {
		String order = request.getParameter("order[0][dir]");
		Sort.Direction sort = Sort.Direction.ASC;
		if (order.equalsIgnoreCase("desc")) {
			sort = Sort.Direction.DESC;
		}
		return sort;
	}

	private String columnName(HttpServletRequest request) {
		int iCol = Integer.parseInt(request.getParameter("order[0][column]"));
		return cols[iCol];
	}

	private int currentPage(int start, int lenght) {
		return start / lenght;
	}

}
