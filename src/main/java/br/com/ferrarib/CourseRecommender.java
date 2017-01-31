package br.com.ferrarib;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;

import java.io.IOException;
import java.util.List;

/**
 * Created by bruno on 1/31/17.
 */
public class CourseRecommender {

    public static void main(String[] args) throws IOException, TasteException {
        DataModel courseModel = new Recommendation().getCourseModel();

        Recommender recommender = new RecommendationBuilder().buildRecommender(courseModel);

        List<RecommendedItem> recommendations = recommender.recommend(1, 3);

        for (RecommendedItem recomendation : recommendations) {
            System.out.println(recomendation);
        }
    }
}
