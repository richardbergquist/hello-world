
package richardbergquist.helloworld.prime;
/**
 * Utility class to calculate primes. Used as a speed test to compare speeds to
 * other language implementations.
 */
public class Prime {

  /**
   * Main
   *
   * Expects two command line arguments:
   * int startFromValue : The value to to start calculating primes from
   * int delta: The value when added to startFromValue, to stop calculating primes.
   */
  public final static void main(String args[]) {

    //Parse commandline args
    long startFromValue = 0;
    long delta = 0;
    try {
      startFromValue = Long.parseLong(args[0]);
      delta = Long.parseLong(args[1]);
    } catch (NumberFormatException exNumberFormat) {
      System.out.println(exNumberFormat.toString());
      System.exit(-1);
    }


    Prime primegenerator = new Prime();
    primegenerator.printprimes(startFromValue, delta);

  }

  /**
   * printprimes
   *
   * Expects two arguments:
   * int startFromValue : The value to to start calculating primes from
   * int delta: The value when added to startFromValue, to stop calculating primes.
   */
  private void printprimes(long startFromValue, long delta) {

    System.out.println("Generating Primes");
    System.out.println("startFromValue: " + startFromValue);
    System.out.println("delta: " + delta);

    long limit = startFromValue + delta;
    for (long n = startFromValue ; n <= limit; n++) {
      boolean founddivisor = false;

      for (long x = 2 ; x < n ; x ++) {
        if ( n % x == 0 ) {
          // found a divisor
          founddivisor = true;
          break;
        }
      }
      if (!founddivisor) {
        System.out.print(n + " ");
      }
    }
    System.out.println("");

  }

}
