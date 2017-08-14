package design.shortnd.basicicelandic;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    //TODO: 2. Implement a Recycler View to Display our list


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Sets the content of the activity to use activity_main
        setContentView(R.layout.activity_main);

        // Find the view pager that allows users to swipe between the multiple
        // fragments we will have
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);

        // Creates the adapter for each page
        CategoryAdapter adapter = new CategoryAdapter(getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        //TODO: Implement Tab layout once we get more then one Category
    }
}
