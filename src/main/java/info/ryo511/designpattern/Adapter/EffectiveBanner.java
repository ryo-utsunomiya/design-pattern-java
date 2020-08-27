package info.ryo511.designpattern.Adapter;

public class EffectiveBanner extends Banner implements Effecter {

  public EffectiveBanner(String s) {
    super(s);
  }

  public String weak() {
    return getWithParen();
  }

  public String strong() {
    return getWithAster();
  }
}
