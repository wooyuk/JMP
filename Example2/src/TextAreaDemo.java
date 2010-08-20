/**
 *  Just for fun
 *
 */

// Demonstrate TextArea.
import java.awt.*;
import java.applet.*;
/*
<applet code="TextAreaDemo" width=300 height=250>
</applet>
*/

public class TextAreaDemo extends Applet {
  public void init() {
    String val =
      "Codenamed Tiger, J2SE 5 has once again put\n" +
      "Java at the forefront of computer language design.\n\n" +
      "Unlike most of the previous Java upgrades, which\n" +
      "offered important, but incremental improvements,\n" +
      "version 5 fundamentally expands the scope, power,\n" +
      "and range of the language.\n\n" +
      "Not since its original launch nearly a decade\n" +
      "ago has a release of Java been so important,\n" +
      "or so eagerly awaited.";


    TextArea text = new TextArea(val, 10, 30);
    add(text);
  }
}
