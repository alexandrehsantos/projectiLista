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

////OUTROS TESTES 
//
//
//package br.com.projecti.motoroferta.service.impl;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Map.Entry;
//import java.util.Set;
//import java.util.regex.Pattern;
//
//import org.apache.http.HttpEntity;
//import org.apache.http.client.ClientProtocolException;
//import org.apache.http.client.ResponseHandler;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.client.methods.HttpRequestBase;
//import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.HttpClients;
//import org.apache.http.util.EntityUtils;
//import org.joda.time.DateTime;
//import org.joda.time.LocalDate;
//import org.joda.time.format.DateTimeFormat;
//import org.joda.time.format.DateTimeFormatter;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.google.gson.GsonBuilder;
//import com.google.gson.JsonArray;
//import com.google.gson.JsonElement;
//import com.google.gson.JsonObject;
//import com.google.gson.JsonParser;
//import com.jayway.jsonpath.DocumentContext;
//import com.jayway.jsonpath.JsonPath;
//
//import br.com.projecti.motoroferta.dao.dto.servico.EquipamentoBeneficioDiretoDto;
//import br.com.projecti.motoroferta.exception.MotorOfertaException;
//import br.com.projecti.motoroferta.util.FooDeserializerFromJsonWithDifferentFields;
//import net.minidev.json.JSONArray;
//
//public class TestListaObjetos {
//
//	@Autowired
//	public static void main(String[] args) {
//
//		try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
//			testJsonPath(null);
//
//			HttpRequestBase httpGet = new HttpGet("http://localhost:8090/contrato-solucao/paginada/params");
//
//			ResponseHandler<String> responseHandler = getResponseHandler();
//
//			String response = httpclient.execute(httpGet, responseHandler);
//
//			JsonElement json = new JsonParser().parse(response);
//
//			JsonObject asJsonObject = json.getAsJsonObject();
//
//			Map<String, String> parametrosRetorno = new HashMap<>();
//
//			List<Map<String, Object>> valores = new ArrayList<>();
//
//			parametrosRetorno.put("valor_padrao", "F");
//			parametrosRetorno.put("data_contratacao", "D");
//			parametrosRetorno.put("codigoContratoSolucao", "N");
//			parametrosRetorno.put("contratacoes", "L");
//
//			Set<Entry<String, String>> entrySet = parametrosRetorno.entrySet();
//
//			JsonElement lista = asJsonObject.get("contratacoes");
//			JsonArray jsonArray = (JsonArray) lista;
//			for (JsonElement jsonElement : jsonArray) {
//
//				String string = jsonElement.toString();
//
//				String dias[] = string.split(Pattern.quote(","));
//
//				List<String> asList = Arrays.asList(dias);
//
//				String valorEsperado = null;
//
//				// FORMA DIFÍCIL
//
//				for (String string2 : asList) {
//					int indexOf = string2.indexOf("{");
//					int indexOf2 = string2.indexOf("}");
//
//					if (indexOf > 0 || indexOf2 > 0) {
//						System.out.println(string2);
//					}
//
//					if (string2.indexOf("valor_padrao") > -1) {
//						String valorTemp = string2.substring(string2.indexOf("valor_padrao"), string2.length());
//						valorEsperado = valorTemp.substring(valorTemp.indexOf(":") + 1, valorTemp.length());
//
//					}
//
//				}
//
//				System.out.println(valorEsperado);
//
//				// string.substring(string.indexOf("valor_padrao"), endIndex)
//
//				// for (LinkedTreeMap<K, V> jsonElement : jsonElement.to) {
//				//
//				// }
//
//				System.out.println(jsonElement.getAsJsonObject().get("estabelecimento"));
//
//				JsonObject object = jsonElement.getAsJsonObject();
//
//				JsonElement solucao = object.get("solucao");
//
//				JsonElement estabelecimento = object.get("estabelecimento");
//
//				System.out.println(estabelecimento);
//
//			}
//
//			// for (Entry<String, String> entry : entrySet) {
//			// Map<String, Object> chaveValor = new HashMap<>();
//			// if (!entry.getKey().equals("L")) {
//			// JsonElement jsonElement = asJsonObject.get(entry.getKey());
//			// if (entry.getValue().equals("F")) {
//			// chaveValor.put(entry.getKey(), jsonElement.getAsBigDecimal());
//			// }
//			// }
//			// valores.add(chaveValor);
//			//
//			// }
//
//			JsonElement jsonElement = asJsonObject.get("codigo_contratacao");
//			JsonElement jsonElement2 = asJsonObject.get("data_contratacao");
//			JsonElement jsonElement3 = asJsonObject.get("estabelecimento");
//			JsonElement jsonElement4 = asJsonObject.get("contratacoes");
//
//			JsonArray jsonArray2 = (JsonArray) jsonElement4;
//
//			HashMap<String, Object> genericObjecti = new HashMap<>();
//
//			for (JsonElement jsonElement5 : jsonArray) {
//				String jsonpathCreatorNamePath = "$['']";
//
//				JsonObject asJsonObject2 = jsonElement5.getAsJsonObject();
//
//				// System.out.println(jsonContext);
//				// jsonContext.read(path);
//
//				GsonBuilder gsonBuilder = new GsonBuilder();
//
//				gsonBuilder.registerTypeAdapter(EquipamentoBeneficioDiretoDto.class,
//						new FooDeserializerFromJsonWithDifferentFields());
//
//				EquipamentoBeneficioDiretoDto fromJson = gsonBuilder.create().fromJson(asJsonObject2,
//						EquipamentoBeneficioDiretoDto.class);
//
//				// EquipamentoBeneficioDiretoDto fromJson = gson.fromJson(asJsonObject2,
//				// FooDeserializerFromJsonWithDifferentFields.class);
//
//				System.out.println(fromJson);
//
//			}
//
//			System.out.println(jsonElement);
//			System.out.println(jsonElement2);
//
//			// Gson gson = new Gson();
//			// gson.fromJson(asJsonObject, classOfT);
//
//		} catch (IOException e) {
//			throw new MotorOfertaException("Falha consumir o serviço backoffice", e);
//		}
//
//	}
//
//	private static void testJsonPath(String response) {
//
//		response = " {\"content\": [\r\n" + "   {\r\n" + "     \"content\": [\r\n" + "       null\r\n" + "     ],\r\n"
//				+ "     \"contratacoes\": [\r\n" + "       {\r\n" + "         \"estabelecimento\": {a\r\n"
//				+ "           \"codigo\": 0,\r\n" + "           \"equipamento\": {\r\n"
//				+ "             \"codigoContratoSolucao\": 0,\r\n" + "             \"codigo_contratacao\": 0,\r\n"
//				+ "             \"data_contratacao\": \"2019-01-09 22:35:30.414\",\r\n"
//				+ "             \"data_desinstalacao\": \"string\",\r\n"
//				+ "             \"data_instalacao\": \"2019-01-09 22:35:30.414\",\r\n"
//				+ "             \"data_solicitacao_cancelamento\": \"string\",\r\n"
//				+ "             \"descricao_alias_sistemas\": \"string\",\r\n" + "             \"detalhes\": {\r\n"
//				+ "               \"conectividade\": {\r\n" + "                 \"imei_chip\": \"string\",\r\n"
//				+ "                 \"operadora\": \"string\"\r\n" + "               },\r\n"
//				+ "               \"id_equipamento\": 0,\r\n" + "               \"modelo\": \"string\",\r\n"
//				+ "               \"patrimonio\": \"string\",\r\n" + "               \"status\": \"string\"\r\n"
//				+ "             },\r\n" + "             \"financeiro\": {\r\n"
//				+ "               \"meses_carencia\": 0,\r\n" + "               \"percentual_desconto\": 0,\r\n"
//				+ "               \"valor_desconto\": 0,\r\n" + "               \"valor_padrao\": 12.5\r\n"
//				+ "             },\r\n" + "             \"id_solucao\": 0,\r\n"
//				+ "             \"id_tipo_equipamento\": 0,\r\n" + "             \"numero_patrimonio\": 0,\r\n"
//				+ "             \"patrimonio\": \"string\",\r\n" + "             \"serie\": 0,\r\n"
//				+ "             \"solicitacoes\": [\r\n" + "               {\r\n"
//				+ "                 \"chamado_desinstalacao\": 0,\r\n"
//				+ "                 \"chamado_instalacao\": 0,\r\n"
//				+ "                 \"os_desinstalacao\": \"string\",\r\n"
//				+ "                 \"os_instalacao\": \"string\"\r\n" + "               }\r\n" + "             ],\r\n"
//				+ "             \"tipo_solucao\": \"string\",\r\n" + "             \"idTipo\": 0,\r\n"
//				+ "             \"tipo\": \"string\",\r\n" + "             \"valorAluguel\": 0,\r\n"
//				+ "             \"valorAluguelNegociacao\": 0,\r\n" + "             \"quantidade\": 0\r\n"
//				+ "           }\r\n" + "         },\r\n" + "         \"solucoes\": {\r\n"
//				+ "           \"data_ativacao\": \"string\",\r\n" + "           \"data_contratacao\": \"string\",\r\n"
//				+ "           \"data_desinstalacao\": \"string\",\r\n" + "           \"financeiro\": {\r\n"
//				+ "             \"meses_carencia\": 0,\r\n" + "             \"percentual_desconto\": 0,\r\n"
//				+ "             \"valor_desconto\": 0,\r\n" + "             \"valor_padrao\": 0\r\n"
//				+ "           },\r\n" + "           \"tipo\": \"string\",\r\n" + "           \"tipo_id\": 0\r\n"
//				+ "         }\r\n" + "       }\r\n" + "     ],\r\n" + "     \"first\": true,\r\n"
//				+ "     \"last\": true,\r\n" + "     \"number\": 0,\r\n" + "     \"numberOfElements\": 0,\r\n"
//				+ "     \"size\": 0,\r\n" + "     \"sort\": {},\r\n" + "     \"totalElements\": 0,\r\n"
//				+ "     \"totalPages\": 0\r\n" + "   }\r\n" + " ],\r\n" + " \"first\": true,\r\n"
//				+ " \"last\": true,\r\n" + " \"number\": 0,\r\n" + " \"numberOfElements\": 0,\r\n" + " \"size\": 0,\r\n"
//				+ " \"sort\": {},\r\n" + " \"totalElements\": 0,\r\n" + " \"totalPages\": 0\r\n" + "}";
//
//		DocumentContext jsonContext = JsonPath.parse(response);
//
//		List<Map<String, Object>> listaObjetosRetornados = new ArrayList<>();
//
//		List<ParametrosRetorno> listaParametrosRetorno = new ArrayList<>();
//
//		ParametrosRetorno parametrosRetorno = new ParametrosRetorno();
//		ParametrosRetorno parametrosRetorno1 = new ParametrosRetorno();
//		ParametrosRetorno parametrosRetorno2 = new ParametrosRetorno();
//		ParametrosRetorno parametrosRetorno3 = new ParametrosRetorno();
//		parametrosRetorno
//				.setNomeCampoRetorno("$.content[0].contratacoes.[*].estabelecimento.equipamento.codigoContratoSolucao");
//		parametrosRetorno.setDescricaoCampoRetorno("codigoContratoSolucao");
//		parametrosRetorno.setTipoDadoRetorno("N");
//
//		parametrosRetorno1
//				.setNomeCampoRetorno("$.content[0].contratacoes.[*].estabelecimento.equipamento.data_instalacao");
//		parametrosRetorno1.setDescricaoCampoRetorno("data_instalacao");
//		parametrosRetorno1.setTipoDadoRetorno("D");
//
//		parametrosRetorno2.setNomeCampoRetorno(
//				"$.content[0].contratacoes.[*].estabelecimento.equipamento.financeiro.valor_padrao");
//		parametrosRetorno2.setDescricaoCampoRetorno("valor_padrao");
//		parametrosRetorno2.setTipoDadoRetorno("F");
//
//		parametrosRetorno3.setNomeCampoRetorno("$.content[0].contratacoes.[*]");
//		parametrosRetorno3.setDescricaoCampoRetorno("lista_contratacoes");
//		parametrosRetorno3.setTipoDadoRetorno("L");
//
//		listaParametrosRetorno.add(parametrosRetorno);
//		listaParametrosRetorno.add(parametrosRetorno1);
//		listaParametrosRetorno.add(parametrosRetorno2);
//		listaParametrosRetorno.add(parametrosRetorno3);
//
//		// Map<String, String> parametros = new HashMap<>();
//		// parametros.put("N",
//		// "$.content[0].contratacoes.[*].estabelecimento.equipamento.codigoContratoSolucao");
//		// parametros.put("D",
//		// "$.content[0].contratacoes.[*].estabelecimento.equipamento.data_desinstalacao");
//		// parametros.put("N",
//		// "$.content[0].contratacoes.[*].estabelecimento.equipamento.financeiro.valor_padrao");
//		// parametros.put("L", "$.content[0].contratacoes.[*]");
//
//		Integer itensLista = retornarTamanhoLista(jsonContext, listaParametrosRetorno);
//
//		if (itensLista != null) {
//			for (Long i = 0L; i < itensLista; i++) {
//				// MAPA DE OBJETOS.
//				Map<String, Object> valoresObjeto = new HashMap<>();
//				// CADA PARAMETRO RETORNO
//				for (ParametrosRetorno parametro : listaParametrosRetorno) {
//					if (!parametro.getTipoDadoRetorno().equals("L")) {
//						String consultaJson = parametro.getNomeCampoRetorno();
//						consultaJson = consultaJson.replace("*", i.toString());
//						// Object jsonpathCreatorName = jsonContext.read(jsonpathCreatorLocationPath);
//						Object valor = jsonContext.read(consultaJson);
//						valoresObjeto.put(parametro.getDescricaoCampoRetorno(), valor);
//					}
//				}
//
//				// ADICIONANDO VALORES DO OBJETO
//				listaObjetosRetornados.add(valoresObjeto);
//			}
//		}
//
//		System.out.println(listaObjetosRetornados);
//		for (Map<String, Object> retorno : listaObjetosRetornados) {
//			String object = (String)retorno.get("data_instalacao");
//			DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss.SSS");	
//			
//			DateTime parseDateTime = formatter.parseDateTime(object);
//			
//			
//			System.out.println(parseDateTime);
//		}
//
//	}
//
//	private static Integer retornarTamanhoLista(DocumentContext jsonContext,
//			List<ParametrosRetorno> listaParametrosRetorno) {
//		for (ParametrosRetorno parametro : listaParametrosRetorno) {
//
//			if (parametro.getTipoDadoRetorno().equals("L")) {
//				String countLista = parametro.getNomeCampoRetorno();
//				JSONArray array = jsonContext.read(countLista);
//
//				if (array != null) {
//
//					return array.size();
//				}
//			}
//
//		}
//		return 0;
//	}
//
//	public static ResponseHandler<String> getResponseHandler() {
//		return response -> {
//			int status = response.getStatusLine().getStatusCode();
//			if (status >= 200 && status < 300) {
//				HttpEntity responseEntity = response.getEntity();
//				return responseEntity != null ? EntityUtils.toString(responseEntity) : null;
//			} else {
//				throw new ClientProtocolException("Unexpected response status: " + status);
//			}
//		};
//	}
//
//}

