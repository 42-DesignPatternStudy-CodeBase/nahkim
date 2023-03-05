package VisitorPattern;

public class ListVisitor extends Visitor {
 // 파일이나 디렉토리 목록을 출력한다
  @Override
  public void visit(File file) {
    System.out.println(file.getName() + " ");
    System.out.println(file.getSize() + " ");
  }

// 디렉토리는 색깔을 다르게 
//  TODO: 검색해보기

  @Override
  public void visit(Directory directory) {
    
    System.out.println(directory.getName());
    System.out.println(directory.getSize());
  }
  
}
