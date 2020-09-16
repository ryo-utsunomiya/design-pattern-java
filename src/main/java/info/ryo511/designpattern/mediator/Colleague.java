package info.ryo511.designpattern.mediator;

public interface Colleague {

  public abstract void setMediator(Mediator mediator);

  public abstract void setColleagueEnabled(boolean enabled);
}
