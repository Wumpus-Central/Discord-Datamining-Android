package p131h7;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import p119g9.C7557q0;

/* renamed from: h7.d */
/* loaded from: classes7.dex */
public final class C7934d {
    /* renamed from: a */
    private static String[] m21125a(int i, String str) {
        return new String[]{Integer.toString(i), str};
    }

    /* renamed from: b */
    public static int m21124b(SQLiteDatabase sQLiteDatabase, int i, String str) {
        try {
            if (!C7557q0.m22180R0(sQLiteDatabase, "ExoPlayerVersions")) {
                return -1;
            }
            Cursor query = sQLiteDatabase.query("ExoPlayerVersions", new String[]{"version"}, "feature = ? AND instance_uid = ?", m21125a(i, str), null, null, null);
            if (query.getCount() == 0) {
                query.close();
                return -1;
            }
            query.moveToNext();
            int i2 = query.getInt(0);
            query.close();
            return i2;
        } catch (SQLException e) {
            throw new C7931a(e);
        }
    }

    /* renamed from: c */
    public static void m21123c(SQLiteDatabase sQLiteDatabase, int i, String str) {
        try {
            if (C7557q0.m22180R0(sQLiteDatabase, "ExoPlayerVersions")) {
                sQLiteDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", m21125a(i, str));
            }
        } catch (SQLException e) {
            throw new C7931a(e);
        }
    }

    /* renamed from: d */
    public static void m21122d(SQLiteDatabase sQLiteDatabase, int i, String str, int i2) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
            ContentValues contentValues = new ContentValues();
            contentValues.put("feature", Integer.valueOf(i));
            contentValues.put("instance_uid", str);
            contentValues.put("version", Integer.valueOf(i2));
            sQLiteDatabase.replaceOrThrow("ExoPlayerVersions", null, contentValues);
        } catch (SQLException e) {
            throw new C7931a(e);
        }
    }
}
