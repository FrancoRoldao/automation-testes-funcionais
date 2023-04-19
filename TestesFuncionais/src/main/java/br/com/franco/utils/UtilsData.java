package br.com.franco.utils;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;

public class UtilsData {
	
	public static String getData(DataTable dt, String parameter) {
		List<Map<String, String>> list = dt.asMaps(String.class, String.class);
		return list.get(0).get(parameter).toString();
	}

}
