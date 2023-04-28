package p003a2;

import android.content.Context;
import android.os.Build;
import android.util.TypedValue;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;

/* renamed from: a2.a */
/* loaded from: classes.dex */
public class C1244a {

    /* renamed from: a */
    private Context f88a;

    public C1244a(Context context) {
        this.f88a = context;
    }

    /* renamed from: a */
    public static String m41547a(File file) {
        String canonicalPath = file.getCanonicalPath();
        if (canonicalPath.endsWith("/")) {
            return canonicalPath;
        }
        return canonicalPath + "/";
    }

    /* renamed from: b */
    public static File m41546b(File file, String str) {
        String a = m41547a(file);
        String canonicalPath = new File(file, str).getCanonicalPath();
        if (canonicalPath.startsWith(a)) {
            return new File(canonicalPath);
        }
        return null;
    }

    /* renamed from: c */
    public static File m41545c(Context context) {
        File dataDir;
        if (Build.VERSION.SDK_INT < 24) {
            return context.getCacheDir().getParentFile();
        }
        dataDir = context.getDataDir();
        return dataDir;
    }

    /* renamed from: d */
    private int m41544d(String str, String str2) {
        return this.f88a.getResources().getIdentifier(str2, str, this.f88a.getPackageName());
    }

    /* renamed from: e */
    private int m41543e(int i) {
        TypedValue typedValue = new TypedValue();
        this.f88a.getResources().getValue(i, typedValue, true);
        return typedValue.type;
    }

    /* renamed from: f */
    public static String m41542f(String str) {
        String guessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
        return guessContentTypeFromName == null ? "text/plain" : guessContentTypeFromName;
    }

    /* renamed from: g */
    private static InputStream m41541g(String str, InputStream inputStream) {
        if (str.endsWith(".svgz")) {
            return new GZIPInputStream(inputStream);
        }
        return inputStream;
    }

    /* renamed from: i */
    public static InputStream m41539i(File file) {
        return m41541g(file.getPath(), new FileInputStream(file));
    }

    /* renamed from: k */
    private static String m41537k(String str) {
        if (str.length() <= 1 || str.charAt(0) != '/') {
            return str;
        }
        return str.substring(1);
    }

    /* renamed from: h */
    public InputStream m41540h(String str) {
        String k = m41537k(str);
        return m41541g(k, this.f88a.getAssets().open(k, 2));
    }

    /* renamed from: j */
    public InputStream m41538j(String str) {
        String k = m41537k(str);
        String[] split = k.split("/", -1);
        if (split.length == 2) {
            String str2 = split[0];
            String str3 = split[1];
            int lastIndexOf = str3.lastIndexOf(46);
            if (lastIndexOf != -1) {
                str3 = str3.substring(0, lastIndexOf);
            }
            int d = m41544d(str2, str3);
            int e = m41543e(d);
            if (e == 3) {
                return m41541g(k, this.f88a.getResources().openRawResource(d));
            }
            throw new IOException(String.format("Expected %s resource to be of TYPE_STRING but was %d", k, Integer.valueOf(e)));
        }
        throw new IllegalArgumentException("Incorrect resource path: " + k);
    }
}
