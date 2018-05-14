public class Common {

  static public long s2l ( String s ) 
  {
    long i = 0;

    try {
      i = Long.parseLong(s.trim());
    } catch (NumberFormatException nfe) {
      System.out.println("NumberFormatException: " + nfe.getMessage());
    }

    return i;
  }

  static public int s2i ( String s ) 
  {
    int i = 0;

    try {
      i = Integer.parseInt(s.trim());
    } catch (NumberFormatException nfe) {
      System.out.println("NumberFormatException: " + nfe.getMessage());
    }

    return i;
  }

  static public byte s2b ( String s ) 
  {
    int i = 0;
    byte b = 0;

    try {
      i = Integer.parseInt(s.trim());
    } catch (NumberFormatException nfe) {
      System.out.println("NumberFormatException: " + nfe.getMessage());
    }
    b = (byte) i;
    return b;
  }

  public static long randomLong(long MAX) {                                                        // fixed
    long i = -1;

    java.util.Random generator = new java.util.Random(System.currentTimeMillis());

    while (i > MAX || i < 0) {
      double intOne = Math.random() * generator.nextInt();
      double intTwo = Math.random() * generator.nextInt();
      i = (long) (intOne + intTwo);
    }
    return i;
  }
}

