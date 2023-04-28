package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzcd extends SQLiteOpenHelper {
    final /* synthetic */ zzce zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcd(zzce zzceVar, Context context, String str) {
        super(context, "google_analytics_v4.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.zza = zzceVar;
    }

    private final boolean zza(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursor = null;
        try {
            try {
                cursor = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                boolean moveToFirst = cursor.moveToFirst();
                cursor.close();
                return moveToFirst;
            } catch (SQLiteException e) {
                this.zza.zzT("Error querying for table", str, e);
                if (cursor != null) {
                    cursor.close();
                }
                return false;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    private static final Set<String> zzb(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        StringBuilder sb2 = new StringBuilder(str.length() + 22);
        sb2.append("SELECT * FROM ");
        sb2.append(str);
        sb2.append(" LIMIT 0");
        Cursor rawQuery = sQLiteDatabase.rawQuery(sb2.toString(), null);
        try {
            for (String str2 : rawQuery.getColumnNames()) {
                hashSet.add(str2);
            }
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        zzfo zzfoVar;
        zzfo zzfoVar2;
        String zzae;
        zzfo zzfoVar3;
        zzfoVar = this.zza.zze;
        if (zzfoVar.zzc(3600000L)) {
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException unused) {
                zzfoVar2 = this.zza.zze;
                zzfoVar2.zzb();
                this.zza.zzJ("Opening the database failed, dropping the table and recreating it");
                zzae = this.zza.zzae();
                this.zza.zzo().getDatabasePath(zzae).delete();
                try {
                    SQLiteDatabase writableDatabase = super.getWritableDatabase();
                    zzfoVar3 = this.zza.zze;
                    zzfoVar3.zza();
                    return writableDatabase;
                } catch (SQLiteException e) {
                    this.zza.zzK("Failed to open freshly created database", e);
                    throw e;
                }
            }
        } else {
            throw new SQLiteException("Database open failed");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        String path = sQLiteDatabase.getPath();
        try {
            if (Integer.parseInt(Build.VERSION.SDK) >= 9) {
                File file = new File(path);
                file.setReadable(false, false);
                file.setWritable(false, false);
                file.setReadable(true, true);
                file.setWritable(true, true);
            }
        } catch (NumberFormatException unused) {
            zzfa.zzb("Invalid version number", Build.VERSION.SDK);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        String str;
        String str2;
        String str3;
        if (!zza(sQLiteDatabase, "hits2")) {
            str3 = zzce.zza;
            sQLiteDatabase.execSQL(str3);
        } else {
            Set<String> zzb = zzb(sQLiteDatabase, "hits2");
            String[] strArr = {"hit_id", "hit_string", "hit_time", "hit_url"};
            for (int i = 0; i < 4; i++) {
                String str4 = strArr[i];
                if (!zzb.remove(str4)) {
                    String valueOf = String.valueOf(str4);
                    if (valueOf.length() != 0) {
                        str2 = "Database hits2 is missing required column: ".concat(valueOf);
                    } else {
                        str2 = new String("Database hits2 is missing required column: ");
                    }
                    throw new SQLiteException(str2);
                }
            }
            boolean z = !zzb.remove("hit_app_id");
            if (!zzb.isEmpty()) {
                throw new SQLiteException("Database hits2 has extra columns");
            } else if (z) {
                sQLiteDatabase.execSQL("ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER");
            }
        }
        if (zza(sQLiteDatabase, "properties")) {
            Set<String> zzb2 = zzb(sQLiteDatabase, "properties");
            String[] strArr2 = {"app_uid", "cid", "tid", "params", "adid", "hits_count"};
            for (int i2 = 0; i2 < 6; i2++) {
                String str5 = strArr2[i2];
                if (!zzb2.remove(str5)) {
                    String valueOf2 = String.valueOf(str5);
                    if (valueOf2.length() != 0) {
                        str = "Database properties is missing required column: ".concat(valueOf2);
                    } else {
                        str = new String("Database properties is missing required column: ");
                    }
                    throw new SQLiteException(str);
                }
            }
            if (!zzb2.isEmpty()) {
                throw new SQLiteException("Database properties table has extra columns");
            }
            return;
        }
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
