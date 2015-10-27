package com.himline.annotation;

import java.util.*;
public class Suppwarn
{
  @SuppressWarnings(value={"deprecation"})      // to suppress deprecation warning
  public static void show()
  {
    Date today = new Date();
    int month = today.getMonth();
  }

  @SuppressWarnings(value={"unchecked"})   // to suppress unchecked warning
  public static void display()
  {
    List studentNames = new ArrayList();
    studentNames.add("hello");
  }
}