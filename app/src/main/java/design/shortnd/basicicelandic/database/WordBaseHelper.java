package design.shortnd.basicicelandic.database;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import design.shortnd.basicicelandic.database.WordDbSchema.ColorsTable;
import design.shortnd.basicicelandic.database.WordDbSchema.FamilyTable;
import design.shortnd.basicicelandic.database.WordDbSchema.NumbersTable;
import design.shortnd.basicicelandic.database.WordDbSchema.PhrasesTable;

public class WordBaseHelper extends SQLiteOpenHelper {
    /**
     * TODO: Create a for loop to create all four tables
     */
    private static final int VERSION = 1;
    private static final String DATABASE_NAME = "basicIcelandic.db";

    public WordBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table " + PhrasesTable.PHRASES_NAME + "(" +
                PhrasesTable.Cols.UUID + ", " +
                PhrasesTable.Cols.ICELANDIC_TEXT + ", " +
                PhrasesTable.Cols.DEFAULT_TEXT + ", " +
                PhrasesTable.Cols.ICELANDIC_PRONUNCIATION +
                ")"
        );
        sqLiteDatabase.execSQL("create table " + ColorsTable.COLORS_NAME + "(" +
                ColorsTable.Cols.UUID + ", " +
                ColorsTable.Cols.ICELANDIC_TEXT + ", " +
                ColorsTable.Cols.DEFAULT_TEXT + ", " +
                ColorsTable.Cols.ICELANDIC_PRONUNCIATION +
                ")"
        );
        sqLiteDatabase.execSQL("create table " + FamilyTable.FAMILY_NAME + "(" +
                FamilyTable.Cols.UUID + ", " +
                FamilyTable.Cols.ICELANDIC_TEXT + ", " +
                FamilyTable.Cols.DEFAULT_TEXT + ", " +
                FamilyTable.Cols.ICELANDIC_PRONUNCIATION +
                ")"
        );
        sqLiteDatabase.execSQL("create table " + NumbersTable.NUMBERS_Name + "(" +
                NumbersTable.Cols.UUID + ", " +
                NumbersTable.Cols.ICELANDIC_TEXT + ", " +
                NumbersTable.Cols.DEFAULT_TEXT + ", " +
                NumbersTable.Cols.ICELANDIC_PRONUNCIATION +
                ")"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        // Nothing as of right now
    }
}
