package br.com.ferrarib;

import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.model.DataModel;

import java.io.File;
import java.io.IOException;

/**
 * Created by bruno on 1/31/17.
 */
public class Recommendation {

    public DataModel getProductModel() throws IOException {
        return getDataModel("data.csv");
    }

    public DataModel getCourseModel() throws IOException {
        return getDataModel("courses.csv");
    }

    private DataModel getDataModel(String pathname) throws IOException {
        File file = new File(pathname);
        return new FileDataModel(file);
    }

}
