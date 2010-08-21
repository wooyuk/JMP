/**
 *  Just for fun
 *
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
  <applet code="JCheckBoxDemo" width=400 height=50>
  </applet>
*/

public class JCheckBoxDemo extends JApplet
implements ItemListener {
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

    setLayout(new FlowLayout());

    // Create icons.
    ImageIcon normal = new ImageIcon("normal.gif");
    ImageIcon rollover = new ImageIcon("rollover.gif");
    ImageIcon selected = new ImageIcon("selected.gif");

    // Add check boxes to the content pane.
    JCheckBox cb = new JCheckBox("C", normal);
    cb.setRolloverIcon(rollover);
    cb.setSelectedIcon(selected);
    cb.addItemListener(this);
    add(cb);

    cb = new JCheckBox("C++", normal);
    cb.setRolloverIcon(rollover);
    cb.setSelectedIcon(selected);
    cb.addItemListener(this);
    add(cb);

    cb = new JCheckBox("Java", normal);
    cb.setRolloverIcon(rollover);
    cb.setSelectedIcon(selected);
    cb.addItemListener(this);
    add(cb);

    cb = new JCheckBox("Perl", normal);
    cb.setRolloverIcon(rollover);
    cb.setSelectedIcon(selected);
    cb.addItemListener(this);
    add(cb);

    // Add text field to the content pane.
    jtf = new JTextField(15);
    add(jtf);
  }

  public void itemStateChanged(ItemEvent ie) {
    JCheckBox cb = (JCheckBox)ie.getItem();
    int state = ie.getStateChange();

    if(state == ItemEvent.SELECTED)
      jtf.setText(cb.getText() + " selected");
    else
      jtf.setText(cb.getText() + " cleared");
  }
}
