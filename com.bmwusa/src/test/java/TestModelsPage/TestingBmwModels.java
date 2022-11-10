package TestModelsPage;

import AutoMotive.BmwHomePage;
import AutoMotive.DetailPage;
import base.BasePage;
import org.testng.annotations.Test;

public class TestingBmwModels extends BasePage {


    @Test
    public void TestingBmwModels(){
String ZipCode="11220";


BmwHomePage bmwHomePage=new BmwHomePage();

DetailPage detailPage;
        detailPage = bmwHomePage.doSearch(ZipCode);


    }


}
