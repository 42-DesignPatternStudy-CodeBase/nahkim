package VisitorPattern;

import java.util.*;

public class ListVisitor extends Visitor {
  // ls -R 과 같은 모양으로 출력

  public static final String LIGHT_CYAN_BOLD = "\033[1;96m";
  public static final String RESET = "\033[0m";


  @Override
  public void visit(File file) { }

  @Override
  public void visit(Directory directory) {
    System.out.println("./" + directory.getName());
    Iterator<Entry> iterator = directory.iterator();
    
    while (iterator.hasNext()) {
      Entry entry = iterator.next();
      if (entry instanceof Directory) 
        System.out.print(LIGHT_CYAN_BOLD);
      System.out.print(entry.getName()+"\t" + RESET);
    }
    System.out.println("");
    System.out.println("");
    
  }
  
}
