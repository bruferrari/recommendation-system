package br.com.ferrarib;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;

import java.io.IOException;
import java.util.List;

/**
 * Created by bruno on 1/30/17.
 */
public class ProductRecommender {
    public static void main(String []args) throws IOException, TasteException {
        DataModel productModel = new Recommendation().getProductModel();

        Recommender recommender = new RecommendationBuilder().buildRecommender(productModel);

        List<RecommendedItem> recommendations = recommender.recommend(2, 3);
        for (RecommendedItem recomendation : recommendations) {

            System.out.println(recomendation);
        }
    }
}
