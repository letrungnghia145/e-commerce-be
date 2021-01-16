package com.tmdt.app.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Converter {
	public static void convert(Object from, Object to) throws IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {
		Class<?> fromClass = from.getClass();
		Class<?> toClass = to.getClass();
		Method[] methods = fromClass.getMethods();
		for (Method method : methods) {
			String methodName = method.getName();
			if (methodName.startsWith("get") && !methodName.equals("getClass")) {
				Object prop = method.invoke(from);
				if (prop != null) {
					Method setter = toClass.getMethod(methodName.replace("get", "set"), method.getReturnType());
					setter.invoke(to, prop);
				}
			}
		}
	}
}