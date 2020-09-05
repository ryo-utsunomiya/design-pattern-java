package info.ryo511.designpattern.adapter;

public class EffectiveBanner implements Effecter {

  private final Banner banner;

  public EffectiveBanner(String s) {
    this.banner = new Banner(s);
  }

  public String weak() {
    return banner.withParen();
  }

  public String strong() {
    return banner.withAster();
  }
}
