package domain;
import org.apache.logging.log4j.*;


public class WeightConverter {
    private static Logger logger = LogManager.getLogger(WeightConverter.class);

    private double weightInKilograms;
    private double weightInPounds;

    public WeightConverter() {
        logger.debug("INSIDE WeightConverterConstructor !!!");

        weightInKilograms = 0.0;
        weightInPounds = 0.0;
    }

    public double getWeightInKilograms() {
        logger.debug("INSIDE WeightConverter weightinkilograms getter!!!");

        return weightInKilograms;
    }

    public void setWeightInKilograms(double weightInKilograms) throws WeightException {
        logger.debug("INSIDE WeightConverter weightinkilograms setter!!!");

        if (weightInKilograms >= 0) {
            this.weightInKilograms = weightInKilograms;
            this.weightInPounds = convertKgsToLbs(weightInKilograms);
        } else {
            throw new WeightException("Invalid kilograms value. Must be >= 0");
        }
    }

    public double getWeightInPounds() {
        logger.debug("INSIDE WeightConverter weightinpounds getter!!!");

        return weightInPounds;
    }

    public void setWeightInPounds(double weightInPounds) throws WeightException {
        logger.debug("INSIDE WeightConverter weightinpounds setter!!!");

        if (weightInPounds >= 0) {
            this.weightInPounds = weightInPounds;
            this.weightInKilograms = convertLbsToKgs(weightInPounds);
        } else {
            throw new WeightException("Invalid pounds value. Must be >= 0");
        }
    }

    public static double convertKgsToLbs(Double d) {
        logger.debug("INSIDE WeightConverter kgstolbs converter!!!");

        return d / 0.453592;
    }

    public static double convertLbsToKgs(Double d) {
        logger.debug("INSIDE WeightConverter lbstokgs converter!!!");

        return d * 0.453592;
    }

    @Override
    public String toString() {
        logger.debug("INSIDE WeightConverter tostring!!!");

        return "WeightConverter{" +
                "weightInPounds=" + weightInPounds +
                ", weightInKilograms=" + weightInKilograms +
                '}';
    }
}
