package p074e2;

import android.content.Context;
import java.util.Map;

/* renamed from: e2.q */
/* loaded from: classes.dex */
public class C6661q {

    /* renamed from: a */
    private static volatile Object f14102a;

    private C6661q() {
    }

    /* renamed from: a */
    public static void m24788a(AbstractC6608c0 c0Var) {
        m24786c();
        if (f14102a != null) {
            try {
                C6692y0.m24629i(f14102a, "disableSigning", null, new Object[0]);
            } catch (Exception e) {
                c0Var.mo24886a("Invoking Signer disableSigning() received an error [%s]", e.getMessage());
            }
        }
    }

    /* renamed from: b */
    public static void m24787b(AbstractC6608c0 c0Var) {
        m24786c();
        if (f14102a != null) {
            try {
                C6692y0.m24629i(f14102a, "enableSigning", null, new Object[0]);
            } catch (Exception e) {
                c0Var.mo24886a("Invoking Signer enableSigning() received an error [%s]", e.getMessage());
            }
        }
    }

    /* renamed from: c */
    private static void m24786c() {
        if (f14102a == null) {
            synchronized (C6661q.class) {
                if (f14102a == null) {
                    f14102a = C6692y0.m24636b("com.adjust.sdk.sig.Signer");
                }
            }
        }
    }

    /* renamed from: d */
    public static void m24785d(AbstractC6608c0 c0Var) {
        m24786c();
        if (f14102a != null) {
            try {
                C6692y0.m24629i(f14102a, "onResume", null, new Object[0]);
            } catch (Exception e) {
                c0Var.mo24886a("Invoking Signer onResume() received an error [%s]", e.getMessage());
            }
        }
    }

    /* renamed from: e */
    public static void m24784e(Map<String, String> map, String str, String str2, Context context, AbstractC6608c0 c0Var) {
        m24786c();
        if (f14102a != null) {
            try {
                C6692y0.m24629i(f14102a, "sign", new Class[]{Context.class, Map.class, String.class, String.class}, context, map, str, str2);
            } catch (Exception e) {
                c0Var.mo24886a("Invoking Signer sign() for %s received an error [%s]", str, e.getMessage());
            }
        }
    }
}
