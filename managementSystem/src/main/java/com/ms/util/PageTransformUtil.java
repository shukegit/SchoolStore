package com.ms.util;

public class PageTransformUtil {
	public static int transformPageIndexToRowIndex(int pageIndex, int pageSize) {
		return pageIndex == 1  ? 0 : (pageIndex - 1) * pageSize; 
	}
}
