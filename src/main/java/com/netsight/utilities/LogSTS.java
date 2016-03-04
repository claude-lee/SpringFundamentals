package com.netsight.utilities;

public class LogSTS {
	
	public static void log(){
		StackTraceElement stackTrace2 = Thread.currentThread().getStackTrace()[2];
		String className = stackTrace2.getFileName();
		String methodName = stackTrace2.getMethodName();
		String m = methodName.equals("<init>") ? "constructor" : methodName;
		System.out.println(className + " - method - " + ": " + m);
	}

}
