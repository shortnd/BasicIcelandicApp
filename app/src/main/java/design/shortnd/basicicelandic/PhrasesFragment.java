package design.shortnd.basicicelandic;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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

        phrases.add(new Word(Integer.toString(R.string.cheers),
                Integer.toString(R.string.cheers_icelandic)));

        phrases.add(new Word(Integer.toString(R.string.whats_your_name),
                Integer.toString(R.string.whats_your_name_icelandic)));

        phrases.add(new Word(Integer.toString(R.string.my_name_is),
                Integer.toString(R.string.my_name_is_icelandic)));

        phrases.add(new Word(Integer.toString(R.string.how_are_you),
                Integer.toString(R.string.how_are_you_icelandic)));

        phrases.add(new Word(Integer.toString(R.string.all_good),
                Integer.toString(R.string.all_good_icelandic)));

        phrases.add(new Word(Integer.toString(R.string.where_are_you_from),
                Integer.toString(R.string.where_are_you_from_icelandic)));

        phrases.add(new Word(Integer.toString(R.string.im_from),
                Integer.toString(R.string.im_from_icelandic)));

        phrases.add(new Word(Integer.toString(R.string.have_a_nice_day),
                Integer.toString(R.string.have_a_nice_day_icelandic)));

        phrases.add(new Word(Integer.toString(R.string.i_love_you),
                Integer.toString(R.string.i_love_you_icelandic)));

        phrases.add(new Word(Integer.toString(R.string.wheres_the_toilet),
                Integer.toString(R.string.wheres_the_toilet_icelandic)));

        phrases.add(new Word(Integer.toString(R.string.yes),
                Integer.toString(R.string.yes_icelandic)));

        phrases.add(new Word(Integer.toString(R.string.no),
                Integer.toString(R.string.no_icelandic)));
        //TODO: Need to Implement an Adapter and then the listView to populate the list
        return rootView;
    }
}
