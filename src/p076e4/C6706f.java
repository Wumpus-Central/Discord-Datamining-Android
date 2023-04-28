package p076e4;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import com.facebook.react.util.JSStackTrace;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import p059d6.C6399a;

/* renamed from: e4.f */
/* loaded from: classes7.dex */
public class C6706f {

    /* renamed from: a */
    private static final Uri f14262a = Uri.withAppendedPath((Uri) C6399a.m25619f(ContactsContract.AUTHORITY_URI), "display_photo");

    /* renamed from: a */
    public static AssetFileDescriptor m24609a(ContentResolver contentResolver, Uri uri) {
        if (m24600j(uri)) {
            try {
                return contentResolver.openAssetFileDescriptor(uri, "r");
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m24608b(ContentResolver contentResolver, Uri uri) {
        Throwable th2;
        int columnIndex;
        Cursor cursor = null;
        r1 = null;
        r1 = null;
        String string = null;
        if (m24600j(uri)) {
            try {
                Cursor query = contentResolver.query(uri, null, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst() && (columnIndex = query.getColumnIndex("_data")) != -1) {
                            string = query.getString(columnIndex);
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        cursor = query;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th2;
                    }
                }
                if (query == null) {
                    return string;
                }
                query.close();
                return string;
            } catch (Throwable th4) {
                th2 = th4;
            }
        } else if (m24599k(uri)) {
            return uri.getPath();
        } else {
            return null;
        }
    }

    /* renamed from: c */
    public static String m24607c(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    /* renamed from: d */
    public static Uri m24606d(File file) {
        return Uri.fromFile(file);
    }

    /* renamed from: e */
    public static Uri m24605e(int i) {
        return new Uri.Builder().scheme("res").path(String.valueOf(i)).build();
    }

    /* renamed from: f */
    public static boolean m24604f(Uri uri) {
        return "data".equals(m24607c(uri));
    }

    /* renamed from: g */
    public static boolean m24603g(Uri uri) {
        return "asset".equals(m24607c(uri));
    }

    /* renamed from: h */
    public static boolean m24602h(Uri uri) {
        String uri2 = uri.toString();
        if (uri2.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || uri2.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString())) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m24601i(Uri uri) {
        if (uri.getPath() != null && m24600j(uri) && "com.android.contacts".equals(uri.getAuthority()) && !uri.getPath().startsWith((String) C6399a.m25619f(f14262a.getPath()))) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m24600j(Uri uri) {
        return "content".equals(m24607c(uri));
    }

    /* renamed from: k */
    public static boolean m24599k(Uri uri) {
        return JSStackTrace.FILE_KEY.equals(m24607c(uri));
    }

    /* renamed from: l */
    public static boolean m24598l(Uri uri) {
        return "res".equals(m24607c(uri));
    }

    /* renamed from: m */
    public static boolean m24597m(Uri uri) {
        String c = m24607c(uri);
        if ("https".equals(c) || "http".equals(c)) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public static boolean m24596n(Uri uri) {
        return "android.resource".equals(m24607c(uri));
    }

    /* renamed from: o */
    public static Uri m24595o(String str) {
        if (str != null) {
            return Uri.parse(str);
        }
        return null;
    }

    /* renamed from: p */
    public static URL m24594p(Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            return new URL(uri.toString());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
