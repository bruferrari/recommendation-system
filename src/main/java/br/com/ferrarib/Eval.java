package br.com.ferrarib;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.eval.RecommenderEvaluator;
import org.apache.mahout.cf.taste.impl.eval.AverageAbsoluteDifferenceRecommenderEvaluator;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.common.RandomUtils;

import java.io.IOException;

/**
 * Created by bruno on 1/31/17.
 */
public class Eval {

    private static Recommendation recommendation = new Recommendation();

    public static void main(String[] args) throws IOException, TasteException {
        // Fix the random eval on every run
        RandomUtils.useTestSeed();

        DataModel courseModel = recommendation.getCourseModel();

        RecommenderEvaluator evaluator = new AverageAbsoluteDifferenceRecommenderEvaluator();
        org.apache.mahout.cf.taste.eval.RecommenderBuilder builder = new RecommendationBuilder();

        double courseError = evaluator.evaluate(builder, null, courseModel, 0.9, 1.0);

        System.out.println("Courses Error: " + courseError);
    }
}
