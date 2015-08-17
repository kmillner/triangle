import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest {

  @Test
  public void newTriangle_instantiatesCorrectly() {
    Triangle testTriangle = new Triangle(2, 2, 2);
    assertEquals(true, testTriangle instanceof Triangle);
  }

  @Test
  public void isTriangle_whenNotATriangle_false() {
  Triangle testTriangle = new Triangle(2, 2, 7);
  assertEquals(false, testTriangle.isTriangle());
  }

  @Test
  public void getTriangleType_isEquilateral_true() {
  Triangle testTriangle = new Triangle(2, 2, 2);
  assertEquals("equilateral", testTriangle.getTriangleType());
  }

  @Test
  public void getTriangleType_isIsosceles_true() {
  Triangle testTriangle = new Triangle(2, 2, 4);
  assertEquals("isosceles", testTriangle.getTriangleType());
  }

  @Test
  public void getTriangleType_isScalene_true() {
  Triangle testTriangle = new Triangle(2, 3, 4);
  assertEquals("scalene", testTriangle.getTriangleType());
  }


}
