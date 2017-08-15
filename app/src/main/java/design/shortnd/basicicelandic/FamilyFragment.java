package design.shortnd.basicicelandic;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class FamilyFragment extends Fragment {
    // Needs to be implemented here
    public FamilyFragment(){}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.main_list, container, false);

        // Create an ArrayList of Family members
        ArrayList<Word> family = new ArrayList<>();

        family.add(new Word(getString(R.string.father),
                getString(R.string.father_icelandic)));
        family.add(new Word(getString(R.string.mother),
                getString(R.string.mother_icelandic)));
        family.add(new Word(getString(R.string.son),
                getString(R.string.son_icelandic)));
        family.add(new Word(getString(R.string.daughter),
                getString(R.string.daughter_icelandic)));
        family.add(new Word(getString(R.string.brother),
                getString(R.string.brother_icelandic)));
        family.add(new Word(getString(R.string.sister),
                getString(R.string.sister_icelandic)));
        family.add(new Word(getString(R.string.grandmother),
                getString(R.string.grandmother_icelandic)));
        family.add(new Word(getString(R.string.grandfather),
                getString(R.string.grandfather_icelandic)));
        family.add(new Word(getString(R.string.cousin),
                getString(R.string.cousin_icelandic)));
        family.add(new Word(getString(R.string.aunt),
                getString(R.string.aunt_icelandic)));
        family.add(new Word(getString(R.string.uncle),
                getString(R.string.uncle_icelandic)));

        WordAdapter adapter = new WordAdapter(getActivity(), family, R.color.category_numbers);

        ListView listView = rootView.findViewById(R.id.main_list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
