package info.ryo511.designpattern.state;

public enum NightState implements State {
  INSTANCE;

  @Override
  public void doClock(Context context, int hour) {
    if (9 <= hour && hour < 17) {
      context.changeState(DayState.INSTANCE);
    }
  }

  @Override
  public void doUse(Context context) {
    context.callSecurityCenter("use(night)");
  }

  @Override
  public void doAlarm(Context context) {
    context.callSecurityCenter("alarm(night)");
  }

  @Override
  public void doPhone(Context context) {
    context.callSecurityCenter("phone(night)");
  }

  @Override
  public String toString() {
    return "[night]";
  }
}
