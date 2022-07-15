public class Singleton {
  private static Singleton instance;

  static {
    instance = new Singleton();
    // В этом блоке возможна обработка исключений
  }

  private Singleton () {}

  public static Singleton getInstance() {
    return instance;
  }
}
