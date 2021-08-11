package com.hunsley.oai.validator.example;

public class Foo {
  private String name;
  private int legs;
  private boolean canFly;

  public Foo() {}

  public Foo(final String name, final int legs, final boolean canFly) {
    this.name = name;
    this.legs = legs;
    this.canFly = canFly;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getLegs() {
    return legs;
  }

  public void setLegs(int legs) {
    this.legs = legs;
  }

  public boolean isCanFly() {
    return canFly;
  }

  public void setCanFly(boolean canFly) {
    this.canFly = canFly;
  }

  @Override
  public String toString() {
    return "Foo{" + "name='" + name + '\'' + ", legs=" + legs + ", canFly=" + canFly + '}';
  }
}
