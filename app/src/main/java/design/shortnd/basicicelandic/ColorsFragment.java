package design.shortnd.basicicelandic;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class ColorsFragment extends Fragment {
    public ColorsFragment(){}

    // Inflates the fragment into the rootview

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        // Finds the rootview to inflate the view
        View rootView = inflater.inflate(R.layout.main_list, container,false);

        // Create a new ArrayList to put into the layout
        final ArrayList<Word> colors = new ArrayList<>();

        colors.add(new Word(getString(R.string.black),
                getString(R.string.black_icelandic)));

        colors.add(new Word(getString(R.string.blue),
                getString(R.string.blue_icelandic)));

        colors.add(new Word(getString(R.string.brown),
                getString(R.string.brown_icelandic)));

        colors.add(new Word(getString(R.string.gray),
                getString(R.string.gray_icelandic)));

        colors.add(new Word(getString(R.string.green),
                getString(R.string.green_icelandic)));

        colors.add(new Word(getString(R.string.orange),
                getString(R.string.orange_icelandic)));

        colors.add(new Word(getString(R.string.purple),
                getString(R.string.purple_icelandic)));

        colors.add(new Word(getString(R.string.red),
                getString(R.string.red_icelandic)));

        colors.add(new Word(getString(R.string.white),
                getString(R.string.white_icelandic)));

        WordAdapter adapter = new WordAdapter(getActivity(), colors, R.color.category_phrases);

        ListView listView = rootView.findViewById(R.id.main_list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
