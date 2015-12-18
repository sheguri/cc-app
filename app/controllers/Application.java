package controllers;

import java.io.InputStream;

import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {

    public static Result index() {
        return showIndexPage();
    }

    
    private static Result showIndexPage(){
    	try{
			InputStream is=null;
        	is = play.Play.application().resourceAsStream("/public/index.html");
        	return ok(is).as("text/html");
		}catch(Exception e){
			return index();
		}
    }
}
