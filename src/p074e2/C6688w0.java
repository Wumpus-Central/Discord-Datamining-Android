package p074e2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: e2.w0 */
/* loaded from: classes.dex */
public class C6688w0 {
    /* renamed from: a */
    public static String m24683a(Context context, String str, AbstractC6608c0 c0Var) {
        if (!C6629i1.m24920c0(context, "com.adjust.preinstall")) {
            return null;
        }
        return m24672l(context, C6629i1.m24906l("content://%s/%s", "com.adjust.preinstall", "trackers"), str, c0Var);
    }

    /* renamed from: b */
    public static String m24682b(String str, String str2, AbstractC6608c0 c0Var) {
        String n = m24670n("/data/local/tmp/adjust.preinstall", c0Var);
        if (n == null || n.isEmpty()) {
            if (str2 != null && !str2.isEmpty()) {
                n = m24670n(str2, c0Var);
            }
            if (n == null || n.isEmpty()) {
                return null;
            }
        }
        return m24669o(n, str, c0Var);
    }

    /* renamed from: c */
    public static String m24681c(String str, AbstractC6608c0 c0Var) {
        return m24668p("adjust.preinstall." + str, c0Var);
    }

    /* renamed from: d */
    public static String m24680d(String str, AbstractC6608c0 c0Var) {
        String n;
        String p = m24668p("adjust.preinstall.path", c0Var);
        if (p == null || p.isEmpty() || (n = m24670n(p, c0Var)) == null || n.isEmpty()) {
            return null;
        }
        return m24669o(n, str, c0Var);
    }

    /* renamed from: e */
    public static String m24679e(String str, AbstractC6608c0 c0Var) {
        String n;
        String q = m24667q("adjust.preinstall.path", c0Var);
        if (q == null || q.isEmpty() || (n = m24670n(q, c0Var)) == null || n.isEmpty()) {
            return null;
        }
        return m24669o(n, str, c0Var);
    }

    /* renamed from: f */
    public static String m24678f(String str, AbstractC6608c0 c0Var) {
        return m24667q("adjust.preinstall." + str, c0Var);
    }

    /* renamed from: g */
    public static List<String> m24677g(Context context, String str, AbstractC6608c0 c0Var) {
        return m24671m(context, str, "android.permission.INSTALL_PACKAGES", c0Var);
    }

    /* renamed from: h */
    public static List<String> m24676h(Context context, String str, AbstractC6608c0 c0Var) {
        return m24671m(context, str, null, c0Var);
    }

    /* renamed from: i */
    public static boolean m24675i(long j) {
        return (j & 255) == 255;
    }

    /* renamed from: j */
    public static boolean m24674j(String str, long j) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1771852303:
                if (str.equals("content_provider_intent_action")) {
                    c = 0;
                    break;
                }
                break;
            case -1590804087:
                if (str.equals("system_properties_path_reflection")) {
                    c = 1;
                    break;
                }
                break;
            case -782042377:
                if (str.equals("content_provider")) {
                    c = 2;
                    break;
                }
                break;
            case -480091743:
                if (str.equals("system_properties_path")) {
                    c = 3;
                    break;
                }
                break;
            case -468656985:
                if (str.equals("system_properties_reflection")) {
                    c = 4;
                    break;
                }
                break;
            case -95318717:
                if (str.equals("system_properties")) {
                    c = 5;
                    break;
                }
                break;
            case 2055247442:
                if (str.equals("file_system")) {
                    c = 6;
                    break;
                }
                break;
            case 2080271301:
                if (str.equals("content_provider_no_permission")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return (j & 32) != 32;
            case 1:
                return (j & 8) != 8;
            case 2:
                return (j & 16) != 16;
            case 3:
                return (j & 4) != 4;
            case 4:
                return (j & 2) != 2;
            case 5:
                return (j & 1) != 1;
            case 6:
                return (j & 64) != 64;
            case 7:
                return (j & 128) != 128;
            default:
                return false;
        }
    }

    /* renamed from: k */
    public static long m24673k(String str, long j) {
        long j2;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1771852303:
                if (str.equals("content_provider_intent_action")) {
                    c = 0;
                    break;
                }
                break;
            case -1590804087:
                if (str.equals("system_properties_path_reflection")) {
                    c = 1;
                    break;
                }
                break;
            case -782042377:
                if (str.equals("content_provider")) {
                    c = 2;
                    break;
                }
                break;
            case -480091743:
                if (str.equals("system_properties_path")) {
                    c = 3;
                    break;
                }
                break;
            case -468656985:
                if (str.equals("system_properties_reflection")) {
                    c = 4;
                    break;
                }
                break;
            case -95318717:
                if (str.equals("system_properties")) {
                    c = 5;
                    break;
                }
                break;
            case 2055247442:
                if (str.equals("file_system")) {
                    c = 6;
                    break;
                }
                break;
            case 2080271301:
                if (str.equals("content_provider_no_permission")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                j2 = 32;
                break;
            case 1:
                j2 = 8;
                break;
            case 2:
                j2 = 16;
                break;
            case 3:
                j2 = 4;
                break;
            case 4:
                j2 = 2;
                break;
            case 5:
                j2 = 1;
                break;
            case 6:
                j2 = 64;
                break;
            case 7:
                j2 = 128;
                break;
            default:
                return j;
        }
        return j | j2;
    }

    /* renamed from: l */
    private static String m24672l(Context context, String str, String str2, AbstractC6608c0 c0Var) {
        try {
            Cursor query = context.getContentResolver().query(Uri.parse(str), new String[]{"encrypted_data"}, "package_name=?", new String[]{str2}, null);
            if (query == null) {
                c0Var.mo24884c("Read content provider cursor null content uri [%s]", str);
                return null;
            } else if (!query.moveToFirst()) {
                c0Var.mo24884c("Read content provider cursor empty content uri [%s]", str);
                query.close();
                return null;
            } else {
                String string = query.getString(0);
                query.close();
                return string;
            }
        } catch (Exception e) {
            c0Var.mo24885b("Exception read content provider uri [%s] error [%s]", str, e.getMessage());
            return null;
        }
    }

    /* renamed from: m */
    private static List<String> m24671m(Context context, String str, String str2, AbstractC6608c0 c0Var) {
        boolean z;
        String str3;
        String l;
        List<ResolveInfo> queryIntentContentProviders = context.getPackageManager().queryIntentContentProviders(new Intent("com.attribution.REFERRAL_PROVIDER"), 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : queryIntentContentProviders) {
            if (str2 == null || context.getPackageManager().checkPermission(str2, resolveInfo.providerInfo.packageName) == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && (str3 = resolveInfo.providerInfo.authority) != null && !str3.isEmpty() && (l = m24672l(context, C6629i1.m24906l("content://%s/%s", str3, "trackers"), str, c0Var)) != null && !l.isEmpty()) {
                arrayList.add(l);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        return null;
    }

    /* renamed from: n */
    private static String m24670n(String str, AbstractC6608c0 c0Var) {
        File file = new File(str);
        if (file.exists() && file.isFile() && file.canRead()) {
            try {
                int length = (int) file.length();
                if (length <= 0) {
                    c0Var.mo24884c("Read file content empty file", new Object[0]);
                    return null;
                }
                byte[] bArr = new byte[length];
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    fileInputStream.read(bArr);
                    fileInputStream.close();
                    return new String(bArr);
                } catch (Exception e) {
                    c0Var.mo24885b("Exception read file input stream error [%s]", e.getMessage());
                    fileInputStream.close();
                    return null;
                }
            } catch (Exception e2) {
                c0Var.mo24885b("Exception read file content error [%s]", e2.getMessage());
            }
        }
        return null;
    }

    /* renamed from: o */
    private static String m24669o(String str, String str2, AbstractC6608c0 c0Var) {
        try {
            return new JSONObject(str.trim()).optString(str2);
        } catch (Exception e) {
            c0Var.mo24885b("Exception read payload from json string error [%s]", e.getMessage());
            return null;
        }
    }

    /* renamed from: p */
    private static String m24668p(String str, AbstractC6608c0 c0Var) {
        try {
            return System.getProperty(str);
        } catch (Exception e) {
            c0Var.mo24885b("Exception read system property key [%s] error [%s]", str, e.getMessage());
            return null;
        }
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: q */
    private static String m24667q(String str, AbstractC6608c0 c0Var) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
        } catch (Exception e) {
            c0Var.mo24885b("Exception read system property using reflection key [%s] error [%s]", str, e.getMessage());
            return null;
        }
    }
}
