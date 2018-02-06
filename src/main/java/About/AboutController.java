package About;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import spark.Route;

public class AboutController {
	static Logger logger = LoggerFactory.getLogger(AboutController.class);
	
	/**
	 * Renders route: /about
	 */
	public static Route renderAbout = (req, res) -> {
		logger.info("renderAbout :: El usuario intento acceder a /about");
		return "This is about page";
	};
	
	/**
	 * Renders route: /about/:someone
	 */
	public static Route renderAboutSomeone = (req, res) -> {
		logger.info("renderAboutSomeone :: El usuario intento acceder a /about/:someone");
		String someone = req.params("someone");
		logger.info("renderAboutSomeone :: El parametro :someone es: " + someone);
		return someone;
	};
}
