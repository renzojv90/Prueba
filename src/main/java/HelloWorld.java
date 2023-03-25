import objets.User;
import spark.ModelAndView;
import spark.template.mustache.MustacheTemplateEngine;

import javax.swing.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class HelloWorld {
    public static void main(String[] args) {

        //Se selecciona la carpeta en la cual se guardaran los archivos estaticos, como css o json.
        staticFileLocation("/public");

        User user1 = new User("Pepe","Lalo","pepe@gmail.com","36584584",new Date(),"eeeeeeee");
        User user2 = new User("Pepe","Lalo","pepe@gmail.com","36584584",new Date(),"eeeeeeee");

        User user3 = new User("Renzo","358288558","Algun lado","ad");

        get("/hello", (req, res) -> {
            return "buenas World";
        });

        get("/hello/:name", (request, response) -> {
            Map map = new HashMap();
            map.put("nombre", request.params(":name"));

            return new ModelAndView(map, "hello.mustache");
        }, new MustacheTemplateEngine());
        /* Acá arranca*/

        get("/", (request, response) -> {
            Map map = new HashMap();
            return new ModelAndView(map,"index.mustache");
        }, new MustacheTemplateEngine());

        get("/register", (request, response) -> {
            Map map = new HashMap();
            return new ModelAndView(map, "userForm.mustache");
        }, new MustacheTemplateEngine());

        get("/forgetPass", (request, response) -> {
            Map map = new HashMap();
            return new ModelAndView(map, "forgetPass.mustache");
        }, new MustacheTemplateEngine());

        get("/login", (request, response) -> {
            Map map = new HashMap();
            return new ModelAndView(map,"login.mustache");
        }, new MustacheTemplateEngine());

        post("/login", (request, response) -> {
            Map map = new HashMap();
            request.queryParams("email");
            System.out.println(request.queryParams("email"));
            request.queryParams("password");
            System.out.println(request.queryParams("password"));
    /*        int attempt = 0;
            String usernameEntered;
            String passwordEntered;
            String mail = "john";
            String password = "123";


            if (usernameEntered.equals(mail) && passwordEntered(password)){
                JOptionPane.showMessageDialog(null,"Bienvenido");
            }else if (usernameEntered.equals(mail)) {
                JOptionPane.showMessageDialog((null,"Contrase\u00F1a incorrecta");
                attempt++;
                passwordEntered = (JOptionPane.showMessageDialog(null,"Ingresé la contraseña nuevamente"));
            }else if (passwordEntered.equals(password)) {

                JOptionPane.showMessageDialog(null, "Usuario no registrado.");
                attempt++;
                usernameEntered = (JOptionPane.showInputDialog("Ingresé el usuario nuevamente"));
            }else{

                JOptionPane.showMessageDialog(null,"Usuario y contraseña incorrectos");
                attempt++;
                usernameEntered = (JOptionPane.showInputDialog("Ingresé el usuario nuevamente"));
                passwordEntered = (JOptionPane.showInputDialog("Ingresé la contraseña nuevamente"));
            }
            if (attempt == 5){
                JOptionPane.showMessageDialog((null,"Alcanzó el limite de intentos.");
            }
*/
            return new ModelAndView(map,"index.mustache");


            /*confirmacion si datos esta bien
            * si estan bien y al catalogo
            * si estan mal mensaje error y volver a login
            * hacer olvide contraseña*/

        }, new MustacheTemplateEngine());


        get("/card", (request, response) -> {
            Map map = new HashMap();
            return new ModelAndView(map,"card.mustache");
        }, new MustacheTemplateEngine());




    }
}

