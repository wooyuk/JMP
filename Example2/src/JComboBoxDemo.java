/**
 *  Just for fun
 *
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
  <applet code="JComboBoxDemo" width=300 height=100>
  </applet>
*/

public class JComboBoxDemo extends JApplet
implements ItemListener {
  JLabel jl;
  ImageIcon france, germany, italy, japan;

  public void init() {
    try {
      SwingUtilities.invokeAndWait(
        new Runnable() {
          public void run() {
            makeGUI();
          }
        }
      );
    } catch (Exception exc) {
      System.out.println("Can't create because of " +
                         exc);
    }
  }

  private void makeGUI() {

    setLayout(new FlowLayout());

    // Create a combo box and add it
    // to the panel.
    JComboBox jc = new JComboBox();
    jc.addItem("France");
    jc.addItem("Germany");
    jc.addItem("Italy");
    jc.addItem("Japan");
    jc.addItemListener(this);
    add(jc);

    // Create label.
    jl = new JLabel(new ImageIcon("france.gif"));
    add(jl);
  }

  public void itemStateChanged(ItemEvent ie) {
    String s = (String)ie.getItem();
    jl.setIcon(new ImageIcon(s + ".gif"));
  }
}
