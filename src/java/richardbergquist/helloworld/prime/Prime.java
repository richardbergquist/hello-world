
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
    int startFromValue = 0;
    int delta = 0;
    try {
      startFromValue = Integer.parseInt(args[0]);
      delta = Integer.parseInt(args[1]);
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
  private void printprimes(int startFromValue, int delta) {

    System.out.println("Generating Primes");
    System.out.println("startFromValue: " + startFromValue);
    System.out.println("delta: " + delta);

    int limit = startFromValue + delta;
    for (int n = startFromValue ; n <= limit; n++) {
      boolean founddivisor = false;

      for (int x = 2 ; x < n ; x ++) {
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
