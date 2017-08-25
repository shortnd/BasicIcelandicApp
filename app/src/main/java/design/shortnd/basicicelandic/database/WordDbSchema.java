package design.shortnd.basicicelandic.database;


public class WordDbSchema {
    // TODO: Try to refactor COL names
    public static final class PhrasesTable {
        public static final String PHRASES_NAME = "phrases";

        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String ICELANDIC_TEXT = "icelandic_text";
            public static final String DEFAULT_TEXT = "default_text";
            public static final String ICELANDIC_PRONUNCIATION = "icelandic_pronunciation";
        }
    }

    public static final class NumbersTable {
        public static final String NUMBERS_Name = "numbers";

        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String ICELANDIC_TEXT = "icelandic_text";
            public static final String DEFAULT_TEXT = "default_text";
            public static final String ICELANDIC_PRONUNCIATION = "icelandic_pronunciation";
        }
    }

    public static final class ColorsTable {
        public static final String COLORS_NAME = "colors";

        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String ICELANDIC_TEXT = "icelandic_text";
            public static final String DEFAULT_TEXT = "default_text";
            public static final String ICELANDIC_PRONUNCIATION = "icelandic_pronunciation";
        }
    }

    public static final class FamilyTable {
        public static final String FAMILY_NAME = "family";

        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String ICELANDIC_TEXT = "icelandic_text";
            public static final String DEFAULT_TEXT = "default_text";
            public static final String ICELANDIC_PRONUNCIATION = "icelandic_pronunciation";
        }
    }
}
