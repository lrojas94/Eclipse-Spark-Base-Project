package Util;

public class Path {
	public static class Web {
		public static final String HOME = "/";
		public static final String ABOUT_US = "/about";
		public static final String ABOUT_SOMEONE = "/about/:someone";
		public static final String ABOUT_SOMEONE_MULTI = "/about/*";
	}
	
	public static class General {
		public static final String HOME = "/html/home.html";
	}
}
