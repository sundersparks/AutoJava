package Practice;

import javax.management.monitor.Monitor;

public class Shapes {
  private static Test monitor = new Test();
  private static RandomShapeGenerator gen = new RandomShapeGenerator();
  
  public static void main(String[] args) {
    Shape[] s = new Shape[9];
    // Fill up the array with shapes:
    for(int i = 0; i < s.length; i++)
      s[i] = gen.next();
    // Make polymorphic method calls:
    for(int i = 0; i < s.length; i++)
      s[i].draw();
    Monitor.expect(new Object[] {
      new TestExpression("%% (Circle|Square|Triangle)"
        + "\\.draw\\(\\)", s.length)
    });
  }
}



