package design.shortnd.basicicelandic;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // TODO: 1. Add Pronunciation underneath each word

    // TODO: 2. Make on Click Listener that opens up a new fragment with more information

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

        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

    }
}
