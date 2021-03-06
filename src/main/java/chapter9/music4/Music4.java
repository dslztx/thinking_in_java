package chapter9.music4;

import chapter0.PrintUtils;
import chapter8.music.Note;

abstract class Instrument {

  private int i;

  public abstract void play(Note n);

  public String what() {
    return "Instrument";
  }

  public abstract void adjust();
}

class Wind extends Instrument {

  public void play(Note n) {
    PrintUtils.print("Wind.play() " + n);
  }

  public void adjust() {

  }

  @Override
  public String what() {
    return "Wind";
  }
}

class Percussion extends Instrument {

  public void play(Note n) {
    PrintUtils.print("Percussion.play() " + n);
  }

  @Override
  public String what() {
    return "Percussion";
  }

  public void adjust() {

  }
}

class Stringed extends Instrument {

  public void play(Note n) {
    PrintUtils.print("Stringed.play() " + n);
  }

  @Override
  public String what() {
    return "Stringed";
  }

  public void adjust() {

  }
}

class Brass extends Instrument {

  public void play(Note n) {
    PrintUtils.print("Brass.play() " + n);
  }

  public void adjust() {
    PrintUtils.print("Brass.adjust()");
  }
}

class Woodwind extends Wind {

  @Override
  public void play(Note n) {
  }

  @Override
  public String what() {
    return super.what();
  }
}

public class Music4 {

  static void tune(Instrument i) {
    i.play(Note.MIDDLE_C);
  }

  static void tuneAll(Instrument[] e) {
    for (Instrument i : e) {
      tune(i);
    }
  }

  public static void main(String[] args) {
    Instrument[] orchestra = {new Wind(), new Percussion(), new Stringed(), new Brass(),
        new Woodwind()};
    tuneAll(orchestra);
  }


}
