package jw.annoparse;

import rect.Point;
import rect.Rectangle;
import source.annotations.ToStringGenerator;

public class SourceLevelAnnotationDemo
{
   public static void main(String[] args)
   {
      Rectangle rect = new Rectangle(new Point(10, 10), 20, 30);
      System.out.println(ToStringGenerator.toString(rect));
   }
}
