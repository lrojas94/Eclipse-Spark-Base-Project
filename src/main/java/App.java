import static spark.Spark.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import About.AboutController;
import Index.IndexController;
import Util.Path;

public class App {
	static Logger logger = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
    	staticFileLocation("/public");
    	get(Path.Web.HOME, IndexController.renderIndex);
    	get(Path.Web.ABOUT_US, AboutController.renderAbout);
    	get(Path.Web.ABOUT_SOMEONE, AboutController.renderAboutSomeone);
    }
}