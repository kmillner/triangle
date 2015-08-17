  import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();

      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  get("/triangle", (request, response) -> {
  HashMap<String, Object> model = new HashMap<String, Object>();
  int sideA = Integer.parseInt(request.queryParams("sidea"));
  int sideB = Integer.parseInt(request.queryParams("sideb"));
  int sideC = Integer.parseInt(request.queryParams("sidec"));

  Triangle myTriangle = new Triangle(sideA, sideB, sideC);

  String type = myTriangle.getTriangleType();

  model.put("type",type);


  model.put("myTriangle", myTriangle);

  model.put("template", "templates/triangle.vtl");
  return new ModelAndView(model, layout);
}, new VelocityTemplateEngine());
}
}
