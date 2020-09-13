package info.ryo511.designpattern.visitor;

public class ListVisitor extends Visitor {

  private String currentDir = "";

  @Override
  public void visit(File file) {
    System.out.println(currentDir + "/" + file);
  }

  @Override
  public void visit(Directory directory) {
    System.out.println(currentDir + "/" + directory);
    String saveDir = currentDir;
    currentDir = currentDir + "/" + directory.getName();
    for (var entry : directory) {
      entry.accept(this);
    }
    currentDir = saveDir;
  }
}
