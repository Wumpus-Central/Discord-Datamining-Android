package p119g9;

import android.text.TextUtils;
import android.util.Log;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.net.UnknownHostException;

/* renamed from: g9.r */
/* loaded from: classes5.dex */
public final class C7558r {

    /* renamed from: a */
    private static int f16383a = 0;

    /* renamed from: b */
    private static boolean f16384b = true;

    /* renamed from: a */
    private static String m22111a(String str, Throwable th2) {
        String e = m22107e(th2);
        if (TextUtils.isEmpty(e)) {
            return str;
        }
        return str + "\n  " + e.replace(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "\n  ") + '\n';
    }

    /* renamed from: b */
    public static void m22110b(String str, String str2) {
        if (f16383a == 0) {
            Log.d(str, str2);
        }
    }

    /* renamed from: c */
    public static void m22109c(String str, String str2) {
        if (f16383a <= 3) {
            Log.e(str, str2);
        }
    }

    /* renamed from: d */
    public static void m22108d(String str, String str2, Throwable th2) {
        m22109c(str, m22111a(str2, th2));
    }

    /* renamed from: e */
    public static String m22107e(Throwable th2) {
        if (th2 == null) {
            return null;
        }
        if (m22105g(th2)) {
            return "UnknownHostException (no network)";
        }
        if (!f16384b) {
            return th2.getMessage();
        }
        return Log.getStackTraceString(th2).trim().replace("\t", "    ");
    }

    /* renamed from: f */
    public static void m22106f(String str, String str2) {
        if (f16383a <= 1) {
            Log.i(str, str2);
        }
    }

    /* renamed from: g */
    private static boolean m22105g(Throwable th2) {
        while (th2 != null) {
            if (th2 instanceof UnknownHostException) {
                return true;
            }
            th2 = th2.getCause();
        }
        return false;
    }

    /* renamed from: h */
    public static void m22104h(String str, String str2) {
        if (f16383a <= 2) {
            Log.w(str, str2);
        }
    }

    /* renamed from: i */
    public static void m22103i(String str, String str2, Throwable th2) {
        m22104h(str, m22111a(str2, th2));
    }
}
