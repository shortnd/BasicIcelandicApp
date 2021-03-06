package design.shortnd.basicicelandic;



public class Word {
    /** Constant value that represents no image was provided for this word/phrase */
    private static final int NO_IMAGE_PROVIDED = -1;
    /** Default translation of the word/phrase */
    private String mDefaultTranslation;
    /** Icelandic translation for the word/phrase */
    private String mIcelandicTranslation;
    /** Image for the current word */
    private int mImageResouceId = NO_IMAGE_PROVIDED;

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

    /**
     * Get the current word/phrase Image Resource Id
     */
    public int getImageResouceId() { return mImageResouceId; }

    /**
     * Return wether or not there is an image for the word/phrase
     */
    public boolean hasImage() { return mImageResouceId != NO_IMAGE_PROVIDED; }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mIcelandicTranslation='" + mIcelandicTranslation + '\'' +
                // TODO: Add Image and Audio Sources here when they are implemented
                "}";
    }
}
