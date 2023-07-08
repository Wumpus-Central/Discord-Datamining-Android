package com.discord.share.intent;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import ff.s;
import ff.t;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import pf.c;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"getFileName", "", "Landroid/content/ContentResolver;", "uri", "Landroid/net/Uri;", "share_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GetFileNameKt {
    /* JADX WARN: Finally extract failed */
    public static final String getFileName(ContentResolver contentResolver, Uri uri) {
        Object obj;
        String str;
        q.g(contentResolver, "<this>");
        q.g(uri, "uri");
        String[] strArr = {"_display_name"};
        try {
            s.a aVar = s.f14771l;
            obj = s.b(contentResolver.query(uri, strArr, null, null, null));
        } catch (Throwable th2) {
            s.a aVar2 = s.f14771l;
            obj = s.b(t.a(th2));
        }
        String str2 = null;
        if (s.g(obj)) {
            obj = null;
        }
        Cursor cursor = (Cursor) obj;
        if (cursor != null) {
            try {
                if (cursor.moveToFirst()) {
                    str = cursor.getString(0);
                } else {
                    str = "";
                }
                c.a(cursor, null);
                str2 = str;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    c.a(cursor, th3);
                    throw th4;
                }
            }
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }
}
