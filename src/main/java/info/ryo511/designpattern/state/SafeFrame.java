package info.ryo511.designpattern.state;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SafeFrame extends Frame implements ActionListener, Context {

  private final TextField textClock = new TextField(60);
  private final TextArea textScreen = new TextArea(10, 60);
  private final Button buttonUse = new Button("Use safe");
  private final Button buttonAlarm = new Button("Emergency alarm");
  private final Button buttonPhone = new Button("Call security center");
  private final Button buttonExit = new Button("Exit");

  private State state = DayState.INSTANCE;

  public SafeFrame(String title) {
    super(title);
    setBackground(Color.lightGray);
    setLayout(new BorderLayout());
    add(textClock, BorderLayout.NORTH);
    textClock.setEditable(false);
    add(textScreen, BorderLayout.CENTER);
    textScreen.setEditable(false);
    var panel = new Panel();
    panel.add(buttonUse);
    panel.add(buttonAlarm);
    panel.add(buttonPhone);
    panel.add(buttonExit);
    add(panel, BorderLayout.SOUTH);
    pack();
    setVisible(true);
    buttonUse.addActionListener(this);
    buttonAlarm.addActionListener(this);
    buttonPhone.addActionListener(this);
    buttonExit.addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.println(e.toString());
    if (e.getSource() == buttonUse) {
      state.doUse(this);
    } else if (e.getSource() == buttonAlarm) {
      state.doAlarm(this);
    } else if (e.getSource() == buttonPhone) {
      state.doPhone(this);
    } else if (e.getSource() == buttonExit) {
      System.exit(0);
    } else {
      throw new RuntimeException("Unknown event");
    }
  }

  @Override
  public void setClock(int hour) {
    var clockMessage = String.format("Current time: %s:00%n", hour < 10 ? "0" + hour : hour);
    System.out.print(clockMessage);
    textClock.setText(clockMessage);
    state.doClock(this, hour);
  }

  @Override
  public void changeState(State state) {
    System.out.printf("State is changed from %s to %s%n", this.state, state);
    this.state = state;
  }

  @Override
  public void callSecurityCenter(String msg) {
    textScreen.append(String.format("call! %s%n", msg));
  }

  @Override
  public void recordLog(String msg) {
    textScreen.append(String.format("record ... %s%n", msg));
  }
}
