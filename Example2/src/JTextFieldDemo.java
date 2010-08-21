/**
 *  Just for fun
 *
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
  <applet code="JTextFieldDemo" width=300 height=50>
  </applet>
*/

public class JTextFieldDemo extends JApplet implements ActionListener {
  JTextField jtf;

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

    // Set layout.
    setLayout(new FlowLayout());

    // Add text field to content pane.
    jtf = new JTextField(15);
    add(jtf);
    jtf.addActionListener(this);
  }

  // Show text when user presses ENTER.
  public void actionPerformed(ActionEvent ae) {
    showStatus(jtf.getText());
  }

}
