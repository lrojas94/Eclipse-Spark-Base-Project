package Index;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Util.Path;
import spark.Route;

public class IndexController {
	static Logger logger = LoggerFactory.getLogger(IndexController.class);
	
	public static Route renderIndex = (req, res) -> {
		logger.info("renderIndex :: El usuario intento acceder a index");
		res.redirect(Path.General.HOME);
		logger.info("renderIndex :: El usuario ha sido redireccionado a html/index.html");
		return null;
	};
}
