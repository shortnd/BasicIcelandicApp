package design.shortnd.basicicelandic;



public class Word {
    /** Default translation of the word/phrase */
    private String mDefaultTranslation;

    /** Icelandic translation for the word/phrase */
    private String mIcelandicTranslation;

    //TODO: Get all audio source files for words/phrases
//    /** Audio Source for the word */
    //private int mAudioSourceId;

    /**
     * Create a new Word Object
     */
    public Word(String defaultTranslation, String icelandicTranslation) {
        mDefaultTranslation = defaultTranslation;
        mIcelandicTranslation = icelandicTranslation;
    }

    /**
     * Gets the default translation of the word/phrase
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Gets the Icelandic translation of the word/phrase
     */
    public String getIcelandicTranslation() {
        return mIcelandicTranslation;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mIcelandicTranslation='" + mIcelandicTranslation + '\'' +
                // TODO: Add Image and Audio Sources here when they are implemented
                "}";
    }
}
