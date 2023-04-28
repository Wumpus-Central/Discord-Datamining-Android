package com.discord.share.intent;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import nf.C11090s;
import nf.C11093t;
import p426xf.C14082c;

@Metadata(m15074d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, m15073d2 = {"getFileName", "", "Landroid/content/ContentResolver;", "uri", "Landroid/net/Uri;", "share_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes7.dex */
public final class GetFileNameKt {
    /* JADX WARN: Finally extract failed */
    public static final String getFileName(ContentResolver contentResolver, Uri uri) {
        Object obj;
        String str;
        C9971q.m14633g(contentResolver, "<this>");
        C9971q.m14633g(uri, "uri");
        String[] strArr = {"_display_name"};
        try {
            C11090s.C11091a aVar = C11090s.f24606l;
            obj = C11090s.m10940b(contentResolver.query(uri, strArr, null, null, null));
        } catch (Throwable th2) {
            C11090s.C11091a aVar2 = C11090s.f24606l;
            obj = C11090s.m10940b(C11093t.m10931a(th2));
        }
        String str2 = null;
        if (C11090s.m10935g(obj)) {
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
                C14082c.m1713a(cursor, null);
                str2 = str;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    C14082c.m1713a(cursor, th3);
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
