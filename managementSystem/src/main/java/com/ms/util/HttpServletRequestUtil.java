package com.ms.util;

import javax.servlet.http.HttpServletRequest;

public class HttpServletRequestUtil {

	public static int getInt(HttpServletRequest request, String key) {

		try {

			return Integer.decode(request.getParameter(key));
		} catch (Exception e) {
			return -1;
		}
	}

	public static long getLong(HttpServletRequest request, String key) {

		try {

			return Long.valueOf(request.getParameter(key));
		} catch (Exception e) {
			return -1;
		}
	}

	public static Double getDouble(HttpServletRequest request, String key) {

		try {

			return Double.valueOf(request.getParameter(key));
		} catch (Exception e) {
			return -1d;
		}
	}

	public static boolean getBoolean(HttpServletRequest request, String key) {

		try {

			return Boolean.valueOf(request.getParameter(key));
		} catch (Exception e) {
			return false;
		}
	}

	public static String getString(HttpServletRequest request, String key) {

		try {
			String str = String.valueOf(request.getParameter(key));
			if(str == "null") {
				str = null;
			}
			if(str != null) {
				str = str.trim();
			}
			if("".equals(str)) {
				str = null;
			}
			return str;
		} catch (Exception e) {
			return null;
		}
	}
}
