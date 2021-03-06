package chapter9;

import chapter0.PrintUtils;
import java.util.Arrays;

class Processor {

  public String name() {
    return getClass().getSimpleName();
  }

  Object process(Object input) {
    return input;
  }
}

class Upcase extends Processor {

  String process(Object input) {
    return ((String) input).toUpperCase();
  }
}

class Downcase extends Processor {

  String process(Object input) {
    return ((String) input).toLowerCase();
  }
}

class Splitter extends Processor {

  String process(Object input) {
    return Arrays.toString(((String) input).split(" "));
  }
}

public class Apply {

  public static void process(Processor p, Object s) {
    PrintUtils.print("Using Processor " + p.name());
    PrintUtils.print(p.process(s));
  }

  public static String s = "Disagreement with beliefs is by definition incorrect";

  public static void main(String[] args) {
    process(new Upcase(), s);
    process(new Downcase(), s);
    process(new Splitter(), s);
  }
}
