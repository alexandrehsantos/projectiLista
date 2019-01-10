package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.format.annotation.DateTimeFormat;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

import net.minidev.json.JSONArray;

public class TestExecution {

	public static void main(String[] args) {
		testJsonPath(null);
	}

	private static void testJsonPath(String response) {

		response = " {\"content\": [\r\n" + "   {\r\n" + "     \"content\": [\r\n" + "       null\r\n" + "     ],\r\n"
				+ "     \"contratacoes\": [\r\n" + "       {\r\n" + "         \"estabelecimento\": {a\r\n"
				+ "           \"codigo\": 0,\r\n" + "           \"equipamento\": {\r\n"
				+ "             \"codigoContratoSolucao\": 0,\r\n" + "             \"codigo_contratacao\": 0,\r\n"
				+ "             \"data_contratacao\": \"2019-01-09 22:35:30.414\",\r\n"
				+ "             \"data_desinstalacao\": \"string\",\r\n"
				+ "             \"data_instalacao\": \"2019-01-09 22:35:30.414\",\r\n"
				+ "             \"data_solicitacao_cancelamento\": \"string\",\r\n"
				+ "             \"descricao_alias_sistemas\": \"string\",\r\n" + "             \"detalhes\": {\r\n"
				+ "               \"conectividade\": {\r\n" + "                 \"imei_chip\": \"string\",\r\n"
				+ "                 \"operadora\": \"string\"\r\n" + "               },\r\n"
				+ "               \"id_equipamento\": 0,\r\n" + "               \"modelo\": \"string\",\r\n"
				+ "               \"patrimonio\": \"string\",\r\n" + "               \"status\": \"string\"\r\n"
				+ "             },\r\n" + "             \"financeiro\": {\r\n"
				+ "               \"meses_carencia\": 0,\r\n" + "               \"percentual_desconto\": 0,\r\n"
				+ "               \"valor_desconto\": 0,\r\n" + "               \"valor_padrao\": 12.5\r\n"
				+ "             },\r\n" + "             \"id_solucao\": 0,\r\n"
				+ "             \"id_tipo_equipamento\": 0,\r\n" + "             \"numero_patrimonio\": 0,\r\n"
				+ "             \"patrimonio\": \"string\",\r\n" + "             \"serie\": 0,\r\n"
				+ "             \"solicitacoes\": [\r\n" + "               {\r\n"
				+ "                 \"chamado_desinstalacao\": 0,\r\n"
				+ "                 \"chamado_instalacao\": 0,\r\n"
				+ "                 \"os_desinstalacao\": \"string\",\r\n"
				+ "                 \"os_instalacao\": \"string\"\r\n" + "               }\r\n" + "             ],\r\n"
				+ "             \"tipo_solucao\": \"string\",\r\n" + "             \"idTipo\": 0,\r\n"
				+ "             \"tipo\": \"string\",\r\n" + "             \"valorAluguel\": 0,\r\n"
				+ "             \"valorAluguelNegociacao\": 0,\r\n" + "             \"quantidade\": 0\r\n"
				+ "           }\r\n" + "         },\r\n" + "         \"solucoes\": {\r\n"
				+ "           \"data_ativacao\": \"string\",\r\n" + "           \"data_contratacao\": \"string\",\r\n"
				+ "           \"data_desinstalacao\": \"string\",\r\n" + "           \"financeiro\": {\r\n"
				+ "             \"meses_carencia\": 0,\r\n" + "             \"percentual_desconto\": 0,\r\n"
				+ "             \"valor_desconto\": 0,\r\n" + "             \"valor_padrao\": 0\r\n"
				+ "           },\r\n" + "           \"tipo\": \"string\",\r\n" + "           \"tipo_id\": 0\r\n"
				+ "         }\r\n" + "       }\r\n" + "     ],\r\n" + "     \"first\": true,\r\n"
				+ "     \"last\": true,\r\n" + "     \"number\": 0,\r\n" + "     \"numberOfElements\": 0,\r\n"
				+ "     \"size\": 0,\r\n" + "     \"sort\": {},\r\n" + "     \"totalElements\": 0,\r\n"
				+ "     \"totalPages\": 0\r\n" + "   }\r\n" + " ],\r\n" + " \"first\": true,\r\n"
				+ " \"last\": true,\r\n" + " \"number\": 0,\r\n" + " \"numberOfElements\": 0,\r\n" + " \"size\": 0,\r\n"
				+ " \"sort\": {},\r\n" + " \"totalElements\": 0,\r\n" + " \"totalPages\": 0\r\n" + "}";

		DocumentContext jsonContext = JsonPath.parse(response);

		List<Map<String, Object>> listaObjetosRetornados = new ArrayList<>();

		List<ParametrosRetorno> listaParametrosRetorno = new ArrayList<>();

		ParametrosRetorno parametrosRetorno = new ParametrosRetorno();
		ParametrosRetorno parametrosRetorno1 = new ParametrosRetorno();
		ParametrosRetorno parametrosRetorno2 = new ParametrosRetorno();
		ParametrosRetorno parametrosRetorno3 = new ParametrosRetorno();
		parametrosRetorno
				.setNomeCampoRetorno("$.content[0].contratacoes.[*].estabelecimento.equipamento.codigoContratoSolucao");
		parametrosRetorno.setDescricaoCampoRetorno("codigoContratoSolucao");
		parametrosRetorno.setTipoDadoRetorno("N");

		parametrosRetorno1
				.setNomeCampoRetorno("$.content[0].contratacoes.[*].estabelecimento.equipamento.data_instalacao");
		parametrosRetorno1.setDescricaoCampoRetorno("data_instalacao");
		parametrosRetorno1.setTipoDadoRetorno("D");

		parametrosRetorno2.setNomeCampoRetorno(
				"$.content[0].contratacoes.[*].estabelecimento.equipamento.financeiro.valor_padrao");
		parametrosRetorno2.setDescricaoCampoRetorno("valor_padrao");
		parametrosRetorno2.setTipoDadoRetorno("F");

		parametrosRetorno3.setNomeCampoRetorno("$.content[0].contratacoes.[*]");
		parametrosRetorno3.setDescricaoCampoRetorno("lista_contratacoes");
		parametrosRetorno3.setTipoDadoRetorno("L");

		listaParametrosRetorno.add(parametrosRetorno);
		listaParametrosRetorno.add(parametrosRetorno1);
		listaParametrosRetorno.add(parametrosRetorno2);
		listaParametrosRetorno.add(parametrosRetorno3);

		// Map<String, String> parametros = new HashMap<>();
		// parametros.put("N",
		// "$.content[0].contratacoes.[*].estabelecimento.equipamento.codigoContratoSolucao");
		// parametros.put("D",
		// "$.content[0].contratacoes.[*].estabelecimento.equipamento.data_desinstalacao");
		// parametros.put("N",
		// "$.content[0].contratacoes.[*].estabelecimento.equipamento.financeiro.valor_padrao");
		// parametros.put("L", "$.content[0].contratacoes.[*]");

		Integer itensLista = retornarTamanhoLista(jsonContext, listaParametrosRetorno);

		if (itensLista != null) {
			for (Long i = 0L; i < itensLista; i++) {
				// MAPA DE OBJETOS.
				Map<String, Object> valoresObjeto = new HashMap<>();
				// CADA PARAMETRO RETORNO
				for (ParametrosRetorno parametro : listaParametrosRetorno) {
					if (!parametro.getTipoDadoRetorno().equals("L")) {
						String consultaJson = parametro.getNomeCampoRetorno();
						consultaJson = consultaJson.replace("*", i.toString());
						// Object jsonpathCreatorName = jsonContext.read(jsonpathCreatorLocationPath);
						Object valor = jsonContext.read(consultaJson);
						valoresObjeto.put(parametro.getDescricaoCampoRetorno(), valor);
					}
				}

				// ADICIONANDO VALORES DO OBJETO
				listaObjetosRetornados.add(valoresObjeto);
			}
		}

		System.out.println(listaObjetosRetornados);
		
		//TESTES DE PARSE 
		for (Map<String, Object> retorno : listaObjetosRetornados) {
			String object = (String) retorno.get("data_instalacao");

			DateTimeFormatter formatter = org.joda.time.format.DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss.SSS");

			DateTime parseDateTime = formatter.parseDateTime(object);

			System.out.println(parseDateTime);
		}

	}

	private static Integer retornarTamanhoLista(DocumentContext jsonContext,
			List<ParametrosRetorno> listaParametrosRetorno) {
		for (ParametrosRetorno parametro : listaParametrosRetorno) {

			if (parametro.getTipoDadoRetorno().equals("L")) {
				String countLista = parametro.getNomeCampoRetorno();
				JSONArray array = jsonContext.read(countLista);

				if (array != null) {

					return array.size();
				}
			}

		}
		return 0;
	}

}
