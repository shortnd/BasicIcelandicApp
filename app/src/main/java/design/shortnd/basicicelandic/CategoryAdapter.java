package design.shortnd.basicicelandic;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    public CategoryAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
            return new PhrasesFragment();
    }

    @Override
    public int getCount() {
        return 0;
    }
}
