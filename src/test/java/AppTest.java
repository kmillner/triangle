import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
      goTo("http://localhost:4567/");
      assertThat(pageSource()).contains("Enter the three");
  }
  @Test
  public void triangleTestIsNotATriangle() {
    goTo("http://localhost:4567/");
    fill("#sidea").with("5");
    fill("#sideb").with("1");
    fill("#sidec").with("1");
    submit(".btn");
    assertThat(pageSource()).contains("isn't a triangle");
  }

  @Test public void triangleTestIsEquilateral()
   { goTo("http://localhost:4567/");
   fill("#sidea").with("7");
   fill("#sideb").with("7");
   fill("#sidec").with("7");

   submit(".btn");
   assertThat(pageSource()).contains("equilateral"); }
}
