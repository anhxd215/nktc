import android.database.Cursor;

import com.ptaconstructions.nktc.Data.Database;

public class SQLfunc {
    public static Cursor LoadTable(String Table, String Col, String KEY) {
        String sql = "Select * from " + Table + "where " + Col + "='" + KEY + "'";
        return Database.ReadSQL(sql);
    }

}
