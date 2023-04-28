package p420x9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import androidx.core.p018os.C2440f;
import ca.C3799f;
import java.util.Locale;
import p082ea.C6801d;
import p338s9.C12826b;
import p365u9.C13222h;
import p365u9.C13225k;

/* renamed from: x9.b0 */
/* loaded from: classes5.dex */
public final class C13955b0 {

    /* renamed from: a */
    private static final SimpleArrayMap<String, String> f31456a = new SimpleArrayMap<>();

    /* renamed from: b */
    private static Locale f31457b;

    /* renamed from: a */
    public static String m2199a(Context context) {
        String packageName = context.getPackageName();
        try {
            return C6801d.m24304a(context).m24307d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    /* renamed from: b */
    public static String m2198b(Context context) {
        return context.getResources().getString(C12826b.f28868g);
    }

    /* renamed from: c */
    public static String m2197c(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(C12826b.f28865d);
        }
        if (i == 2) {
            return resources.getString(C12826b.f28871j);
        }
        if (i != 3) {
            return resources.getString(17039370);
        }
        return resources.getString(C12826b.f28862a);
    }

    /* renamed from: d */
    public static String m2196d(Context context, int i) {
        Resources resources = context.getResources();
        String a = m2199a(context);
        if (i == 1) {
            return resources.getString(C12826b.f28866e, a);
        }
        if (i != 2) {
            if (i == 3) {
                return resources.getString(C12826b.f28863b, a);
            }
            if (i == 5) {
                return m2192h(context, "common_google_play_services_invalid_account_text", a);
            }
            if (i == 7) {
                return m2192h(context, "common_google_play_services_network_error_text", a);
            }
            if (i == 9) {
                return resources.getString(C12826b.f28870i, a);
            }
            if (i == 20) {
                return m2192h(context, "common_google_play_services_restricted_profile_text", a);
            }
            switch (i) {
                case 16:
                    return m2192h(context, "common_google_play_services_api_unavailable_text", a);
                case 17:
                    return m2192h(context, "common_google_play_services_sign_in_failed_text", a);
                case 18:
                    return resources.getString(C12826b.f28874m, a);
                default:
                    return resources.getString(C13225k.f29699a, a);
            }
        } else if (C3799f.m33575d(context)) {
            return resources.getString(C12826b.f28875n);
        } else {
            return resources.getString(C12826b.f28872k, a);
        }
    }

    /* renamed from: e */
    public static String m2195e(Context context, int i) {
        if (i == 6 || i == 19) {
            return m2192h(context, "common_google_play_services_resolution_required_text", m2199a(context));
        }
        return m2196d(context, i);
    }

    /* renamed from: f */
    public static String m2194f(Context context, int i) {
        String str;
        if (i == 6) {
            str = m2191i(context, "common_google_play_services_resolution_required_title");
        } else {
            str = m2193g(context, i);
        }
        if (str == null) {
            return context.getResources().getString(C12826b.f28869h);
        }
        return str;
    }

    /* renamed from: g */
    public static String m2193g(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(C12826b.f28867f);
            case 2:
                return resources.getString(C12826b.f28873l);
            case 3:
                return resources.getString(C12826b.f28864c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m2191i(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m2191i(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb2 = new StringBuilder(33);
                sb2.append("Unexpected error code ");
                sb2.append(i);
                Log.e("GoogleApiAvailability", sb2.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m2191i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m2191i(context, "common_google_play_services_restricted_profile_title");
        }
    }

    /* renamed from: h */
    private static String m2192h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String i = m2191i(context, str);
        if (i == null) {
            i = resources.getString(C13225k.f29699a);
        }
        return String.format(resources.getConfiguration().locale, i, str2);
    }

    /* renamed from: i */
    private static String m2191i(Context context, String str) {
        String str2;
        String str3;
        SimpleArrayMap<String, String> simpleArrayMap = f31456a;
        synchronized (simpleArrayMap) {
            Locale c = C2440f.m37739a(context.getResources().getConfiguration()).m37727c(0);
            if (!c.equals(f31457b)) {
                simpleArrayMap.clear();
                f31457b = c;
            }
            String str4 = simpleArrayMap.get(str);
            if (str4 != null) {
                return str4;
            }
            Resources b = C13222h.m4267b(context);
            if (b == null) {
                return null;
            }
            int identifier = b.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                if (str.length() != 0) {
                    str3 = "Missing resource: ".concat(str);
                } else {
                    str3 = new String("Missing resource: ");
                }
                Log.w("GoogleApiAvailability", str3);
                return null;
            }
            String string = b.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                if (str.length() != 0) {
                    str2 = "Got empty resource: ".concat(str);
                } else {
                    str2 = new String("Got empty resource: ");
                }
                Log.w("GoogleApiAvailability", str2);
                return null;
            }
            simpleArrayMap.put(str, string);
            return string;
        }
    }
}
