package design.shortnd.basicicelandic;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class NumbersFragment extends Fragment {
    // Needs to be here
    public NumbersFragment() {}

    // Inflate the fragment to the base root view

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflates the view into the main activity view
        View rootView = inflater.inflate(R.layout.main_list, container, false);

        // Create a list of words(Number)
        final ArrayList<Word> numbers = new ArrayList<>();

        numbers.add(new Word(getString(R.string.one), getString(R.string.one_icelandic)));

        numbers.add(new Word(getString(R.string.two), getString(R.string.two_icelandic)));

        numbers.add(new Word(getString(R.string.three), getString(R.string.three_icelandic)));

        numbers.add(new Word(getString(R.string.four), getString(R.string.four_icelandic)));

        numbers.add(new Word(getString(R.string.five), getString(R.string.five_icelandic)));

        numbers.add(new Word(getString(R.string.six), getString(R.string.six_icelandic)));

        numbers.add(new Word(getString(R.string.seven), getString(R.string.seven_icelandic)));

        numbers.add(new Word(getString(R.string.eight), getString(R.string.eight_icelandic)));

        numbers.add(new Word(getString(R.string.nine), getString(R.string.nine_icelandic)));

        numbers.add(new Word(getString(R.string.ten), getString(R.string.ten_icelandic)));

        WordAdapter adapter = new WordAdapter(getActivity(), numbers, R.color.category_numbers);

        ListView listView = rootView.findViewById(R.id.main_list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
