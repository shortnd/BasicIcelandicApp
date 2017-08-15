package design.shortnd.basicicelandic;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class PhrasesFragment extends Fragment {
    // Needs to be here
    public PhrasesFragment() {
    }


    // Inflates the fragment to the base root view

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflates the view into the main activity view
        View rootView = inflater.inflate(R.layout.main_list, container, false);


        // Create a list of words(Phrases)
        final ArrayList<Word> phrases = new ArrayList<>();

        phrases.add(new Word(getString(R.string.cheers),
                getString(R.string.cheers_icelandic)));

        phrases.add(new Word(getString(R.string.whats_your_name),
                getString(R.string.whats_your_name_icelandic)));

        phrases.add(new Word(getString(R.string.my_name_is),
                getString(R.string.my_name_is_icelandic)));

        phrases.add(new Word(getString(R.string.how_are_you),
                getString(R.string.how_are_you_icelandic)));

        phrases.add(new Word(getString(R.string.all_good),
                getString(R.string.all_good_icelandic)));

        phrases.add(new Word(getString(R.string.where_are_you_from),
                getString(R.string.where_are_you_from_icelandic)));

        phrases.add(new Word(getString(R.string.im_from),
                getString(R.string.im_from_icelandic)));

        phrases.add(new Word(getString(R.string.have_a_nice_day),
                getString(R.string.have_a_nice_day_icelandic)));

        phrases.add(new Word(getString(R.string.i_love_you),
                getString(R.string.i_love_you_icelandic)));

        phrases.add(new Word(getString(R.string.wheres_the_toilet),
                getString(R.string.wheres_the_toilet_icelandic)));

        phrases.add(new Word(getString(R.string.yes),
                getString(R.string.yes_icelandic)));

        phrases.add(new Word(getString(R.string.no),
                getString(R.string.no_icelandic)));
        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), phrases, R.color.category_phrases);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // main_list layout file
        ListView listView = rootView.findViewById(R.id.main_list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
