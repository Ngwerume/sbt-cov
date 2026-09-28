package codacytest;

import java.util.List;

/** Small, side-effect free statistics helpers. */
public final class CleanStats {

    private CleanStats() {
    }

    /**
     * Returns the arithmetic mean of the values, or 0 for an empty list.
     *
     * @param values the values
     * @return the mean
     */
    public static double mean(final List<Double> values) {
        if (values.isEmpty()) {
            return 0.0;
        }
        double total = 0.0;
        for (final double value : values) {
            total += value;
        }
        return total / values.size();
    }
}
