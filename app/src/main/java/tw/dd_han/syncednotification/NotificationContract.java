package tw.dd_han.syncednotification;

import android.provider.BaseColumns;

/**
 * Created by dd-han on 15/6/19.
 */
public class NotificationContract {
    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    public NotificationContract() {}

    /* Inner class that defines the table contents */
    public static abstract class NotificationEntry implements BaseColumns {
        public static final String TABLE_NAME = "entry";
        public static final String COLUMN_NAME_ENTRY_ID = "entryid";
        public static final String COLUMN_NAME_TITLE = "title";
        public static final String COLUMN_NAME_SUBTITLE = "subtitle";
        public static final String COLUMN_NAME_AT_TIME = "attime";
    }
}
