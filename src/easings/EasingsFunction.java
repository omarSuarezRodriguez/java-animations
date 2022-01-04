package easings;

/**
 *
 * @author Omar
 */
public class EasingsFunction {

    // www.easings.net
    public static float easeOutBounce(float x) {

        float n1 = 7.5625f;
        float d1 = 2.75f;

        double v;

        if (x < 1 / d1) {
            v = n1 * x * x;
        } else if (x < 2 / d1) {
            v = n1 * (x -= 1.5 / d1) * x + 0.75;
        } else if (x < 2.5 / d1) {
            v = n1 * (x -= 2.25 / d1) * x + 0.9375;
        } else {
            v = n1 * (x -= 2.625 / d1) * x + 0.984375;
        }

        return (float) v;

    }

    public static float easeInOutBounce(float x) {

        return x < 0.5
                ? (1 - easeOutBounce(1 - 2 * x)) / 2
                : (1 + easeOutBounce(2 * x - 1)) / 2;

    }

}
