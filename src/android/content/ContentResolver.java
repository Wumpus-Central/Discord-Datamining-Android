package android.content;

import android.database.Cursor;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¨\u0006\u0005"}, m15073d2 = {"Landroid/content/ContentResolver;", "Landroid/net/Uri;", "uri", "", "a", "react-native-image-picker_release"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: com.imagepicker.a  reason: from Kotlin metadata and invalid package */
/* loaded from: classes6.dex */
public final class ContentResolver {
    /* renamed from: a */
    public static final String m26542a(android.content.ContentResolver contentResolver, Uri uri) {
        C9971q.m14633g(contentResolver, "<this>");
        C9971q.m14633g(uri, "uri");
        Cursor query = contentResolver.query(uri, null, null, null, null);
        if (query == null) {
            return "";
        }
        int columnIndex = query.getColumnIndex("_display_name");
        query.moveToFirst();
        String name = query.getString(columnIndex);
        query.close();
        C9971q.m14634f(name, "name");
        return name;
    }
}
