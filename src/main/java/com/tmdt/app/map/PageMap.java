package com.tmdt.app.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PageMap {
	private static final Map<String, String> mapRoleWithPage = new HashMap<>();

	public PageMap(String... pages) {
		for (String page : pages) {
			String[] split = page.split(":");
			mapRoleWithPage.put(split[0], split[1]);
		}
	}

	public String getPathMap(String roleName) {
		Set<Entry<String, String>> entrySet = mapRoleWithPage.entrySet();
		for (Entry<String, String> entry : entrySet) {
			if (entry.getKey().equals(roleName)) {
				return entry.getValue();
			}
		}
		throw new IllegalStateException();
	};
}
