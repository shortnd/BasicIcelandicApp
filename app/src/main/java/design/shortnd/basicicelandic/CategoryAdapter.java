package design.shortnd.basicicelandic;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[] {"Phrases", "Numbers", "Colors", "Family"};

    public CategoryAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new PhrasesFragment();
        } else if (position == 1){
            return new NumbersFragment();
        } else if (position == 2){
            return new ColorsFragment();
        } else {
            return new FamilyFragment();
        }
    }

    @Override
    public int getCount() { return tabTitles.length; }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
