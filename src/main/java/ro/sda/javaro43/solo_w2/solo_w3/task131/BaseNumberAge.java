package ro.sda.javaro43.solo_w2.solo_w3.task131;

public class BaseNumberAge {
  public static String happyBirthday(int age) {
    return age % 2 == 0 ?
            "Tesha is just 20, in base " + age/2 + "!"
            :
            "Tesha is just 21, in base " + (age-1)/2 + "!";
  }
}