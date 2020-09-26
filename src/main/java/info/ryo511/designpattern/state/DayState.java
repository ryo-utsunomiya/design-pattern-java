package info.ryo511.designpattern.state;

public enum DayState implements State {
  INSTANCE;

  @Override
  public void doClock(Context context, int hour) {
    if (hour < 9 || 17 <= hour) {
      context.changeState(NightState.INSTANCE);
    }
  }

  @Override
  public void doUse(Context context) {
    context.recordLog("use(day)");
  }

  @Override
  public void doAlarm(Context context) {
    context.callSecurityCenter("alarm(day)");
  }

  @Override
  public void doPhone(Context context) {
    context.callSecurityCenter("phone(day)");
  }

  @Override
  public String toString() {
    return "[day]";
  }
}
