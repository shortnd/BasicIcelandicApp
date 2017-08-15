package design.shortnd.basicicelandic;


import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    // Color resourceId for background of each list
    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            // Inflates the listItem view is null
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false
            );
        }

        Word currentWord = getItem(position);

        // Gets the textview for the translation
        TextView icelandicTranslation = listItemView
                .findViewById(R.id.icelandic_text_view);
        // Sets the current word at {@params position} to the text view
        icelandicTranslation.setText(currentWord.getIcelandicTranslation());

        // Gets the text view for the default language
        TextView defaultTranslation = listItemView
                .findViewById(R.id.default_text_view);
        // Sets the current word at {@params position} to the text view
        defaultTranslation.setText(currentWord.getDefaultTranslation());

        // Finds the image view on the ListItem
        ImageView imageView = listItemView.findViewById(R.id.image);

        // Checks to see if there are images with the current words
        if (currentWord.hasImage()) {
            // If they have an image set the imageResouce to the imageResouceId
            imageView.setImageResource(currentWord.getImageResouceId());
            // Sets the visibility of the ImageView to VISIBLE
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);

        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
