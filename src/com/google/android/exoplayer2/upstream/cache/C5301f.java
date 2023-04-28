package com.google.android.exoplayer2.upstream.cache;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p119g9.C7510a;
import p131h7.AbstractC7932b;
import p131h7.C7931a;
import p131h7.C7934d;

/* renamed from: com.google.android.exoplayer2.upstream.cache.f */
/* loaded from: classes5.dex */
final class C5301f {

    /* renamed from: c */
    private static final String[] f9826c = {"name", "length", "last_touch_timestamp"};

    /* renamed from: a */
    private final AbstractC7932b f9827a;

    /* renamed from: b */
    private String f9828b;

    public C5301f(AbstractC7932b bVar) {
        this.f9827a = bVar;
    }

    /* renamed from: a */
    private static void m29562a(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
    }

    /* renamed from: c */
    private Cursor m29560c() {
        C7510a.m22367e(this.f9828b);
        return this.f9827a.getReadableDatabase().query(this.f9828b, f9826c, null, null, null, null, null);
    }

    /* renamed from: d */
    private static String m29559d(String str) {
        return "ExoPlayerCacheFileMetadata" + str;
    }

    /* renamed from: b */
    public Map<String, C5300e> m29561b() {
        try {
            Cursor c = m29560c();
            HashMap hashMap = new HashMap(c.getCount());
            while (c.moveToNext()) {
                hashMap.put(c.getString(0), new C5300e(c.getLong(1), c.getLong(2)));
            }
            c.close();
            return hashMap;
        } catch (SQLException e) {
            throw new C7931a(e);
        }
    }

    /* renamed from: e */
    public void m29558e(long j) {
        try {
            String hexString = Long.toHexString(j);
            this.f9828b = m29559d(hexString);
            if (C7934d.m21124b(this.f9827a.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.f9827a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                C7934d.m21122d(writableDatabase, 2, hexString, 1);
                m29562a(writableDatabase, this.f9828b);
                writableDatabase.execSQL("CREATE TABLE " + this.f9828b + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new C7931a(e);
        }
    }

    /* renamed from: f */
    public void m29557f(String str) {
        C7510a.m22367e(this.f9828b);
        try {
            this.f9827a.getWritableDatabase().delete(this.f9828b, "name = ?", new String[]{str});
        } catch (SQLException e) {
            throw new C7931a(e);
        }
    }

    /* renamed from: g */
    public void m29556g(Set<String> set) {
        C7510a.m22367e(this.f9828b);
        try {
            SQLiteDatabase writableDatabase = this.f9827a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                writableDatabase.delete(this.f9828b, "name = ?", new String[]{it.next()});
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new C7931a(e);
        }
    }

    /* renamed from: h */
    public void m29555h(String str, long j, long j2) {
        C7510a.m22367e(this.f9828b);
        try {
            SQLiteDatabase writableDatabase = this.f9827a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow(this.f9828b, null, contentValues);
        } catch (SQLException e) {
            throw new C7931a(e);
        }
    }
}
