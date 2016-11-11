package controllers;


import play.api.*;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import views.html.*;

import models.*;

public class HomeController extends Controller {

    public Result index(String name) {
        return ok(index.render("Welcome to the Home page", name));
    }

    public Result about() {
        return ok(about.render());
    }

    public Result products() {
    	List<Product> productList = Product.findAll();

        return ok(products.render(productList));
    }
}


