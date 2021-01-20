package jw.dynamic;
//目标对象
class SubjectImpl implements Subject{
  @Override
  public void request(){
      System.out.println("I am dealing the request.");
  }
}


