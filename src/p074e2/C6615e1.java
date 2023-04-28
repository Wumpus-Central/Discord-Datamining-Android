package p074e2;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import org.json.JSONArray;
import org.json.JSONException;

/*  JADX ERROR: NullPointerException in pass: ProcessKotlinInternals
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
    	at jadx.core.dex.visitors.kotlin.ProcessKotlinInternals.processMth(ProcessKotlinInternals.java:92)
    	at jadx.core.dex.visitors.kotlin.ProcessKotlinInternals.visit(ProcessKotlinInternals.java:83)
    */
/* renamed from: e2.e1 */
/* loaded from: classes.dex */
public class C6615e1 {

    /* renamed from: a */
    private final SharedPreferences f13909a;

    public C6615e1(Context context) {
        this.f13909a = context.getSharedPreferences("adjust_preferences", 0);
    }

    /* renamed from: C */
    private synchronized void m25061C(String str, String str2) {
        this.f13909a.edit().putString(str, str2).apply();
    }

    /* renamed from: b */
    private synchronized boolean m25054b(String str, boolean z) {
        try {
        } catch (ClassCastException unused) {
            return z;
        }
        return this.f13909a.getBoolean(str, z);
    }

    /* renamed from: h */
    private synchronized long m25048h(String str, long j) {
        try {
        } catch (ClassCastException unused) {
            return j;
        }
        return this.f13909a.getLong(str, j);
    }

    /* renamed from: n */
    private synchronized int m25042n(String str, long j) {
        try {
            JSONArray m = m25043m();
            for (int i = 0; i < m.length(); i++) {
                JSONArray jSONArray = m.getJSONArray(i);
                String optString = jSONArray.optString(0, null);
                if (optString != null && optString.equals(str) && jSONArray.optLong(1, -1L) == j) {
                    return i;
                }
            }
        } catch (JSONException unused) {
        }
        return -1;
    }

    /* renamed from: o */
    private synchronized String m25041o(String str) {
        try {
        } catch (ClassCastException unused) {
            return null;
        } catch (Throwable unused2) {
            if (str.equals("raw_referrers")) {
                m25040p("raw_referrers");
            }
            return null;
        }
        return this.f13909a.getString(str, null);
    }

    /* renamed from: p */
    private synchronized void m25040p(String str) {
        this.f13909a.edit().remove(str).apply();
    }

    /* renamed from: w */
    private synchronized void m25033w(String str, boolean z) {
        this.f13909a.edit().putBoolean(str, z).apply();
    }

    /* renamed from: y */
    private synchronized void m25031y(String str, long j) {
        this.f13909a.edit().putLong(str, j).apply();
    }

    /* renamed from: A */
    public synchronized void m25063A(String str, long j) {
        if (m25044l(str, j) == null) {
            JSONArray m = m25043m();
            if (m.length() != 10) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(0, str);
                jSONArray.put(1, j);
                jSONArray.put(2, 0);
                m.put(jSONArray);
                m25062B(m);
            }
        }
    }

    /* renamed from: B */
    public synchronized void m25062B(JSONArray jSONArray) {
        try {
            m25061C("raw_referrers", jSONArray.toString());
        } catch (Throwable unused) {
            m25040p("raw_referrers");
        }
    }

    /* renamed from: D */
    public synchronized void m25060D() {
        m25033w("disable_third_party_sharing", true);
    }

    /* renamed from: E */
    public synchronized void m25059E() {
        m25033w("gdpr_forget_me", true);
    }

    /* renamed from: F */
    public synchronized void m25058F() {
        m25033w("install_tracked", true);
    }

    /* renamed from: G */
    public synchronized void m25057G(long j) {
        m25031y("preinstall_payload_read_status", j);
    }

    /* renamed from: H */
    public synchronized void m25056H() {
        try {
            JSONArray m = m25043m();
            boolean z = false;
            for (int i = 0; i < m.length(); i++) {
                JSONArray jSONArray = m.getJSONArray(i);
                if (jSONArray.optInt(2, -1) == 1) {
                    jSONArray.put(2, 0);
                    z = true;
                }
            }
            if (z) {
                m25062B(m);
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public synchronized void m25055a() {
        this.f13909a.edit().clear().apply();
    }

    /* renamed from: c */
    public synchronized long m25053c() {
        return m25048h("deeplink_click_time", -1L);
    }

    /* renamed from: d */
    public synchronized String m25052d() {
        return m25041o("deeplink_url");
    }

    /* renamed from: e */
    public synchronized boolean m25051e() {
        return m25054b("disable_third_party_sharing", false);
    }

    /* renamed from: f */
    public synchronized boolean m25050f() {
        return m25054b("gdpr_forget_me", false);
    }

    /* renamed from: g */
    public synchronized boolean m25049g() {
        return m25054b("install_tracked", false);
    }

    /* renamed from: i */
    public synchronized long m25047i() {
        return m25048h("preinstall_payload_read_status", 0L);
    }

    /* renamed from: j */
    public synchronized String m25046j() {
        return m25041o("preinstall_system_installer_referrer");
    }

    /* renamed from: k */
    public synchronized String m25045k() {
        return m25041o("push_token");
    }

    /* renamed from: l */
    public synchronized JSONArray m25044l(String str, long j) {
        int n = m25042n(str, j);
        if (n >= 0) {
            try {
                return m25043m().getJSONArray(n);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: AttachTryCatchVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Null type added to not empty exception handler: JSONException -> 0x0034
        	at jadx.core.dex.trycatch.ExceptionHandler.addCatchType(ExceptionHandler.java:54)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.createHandler(AttachTryCatchVisitor.java:130)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.attachHandlers(AttachTryCatchVisitor.java:118)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.initTryCatches(AttachTryCatchVisitor.java:54)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.visit(AttachTryCatchVisitor.java:42)
        */
    /* renamed from: m */
    public synchronized org.json.JSONArray m25043m() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "raw_referrers"     // Catch: all -> 0x003b
            r5.m25041o(r0)     // Catch: all -> 0x003b
            r0 = move-result     // Catch: all -> 0x003b
            if (r0 == 0) goto L_0x0034
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>(r0)
            r1.length()
            r2 = move-result
            r3 = 10
            if (r2 <= r3) goto L_0x002d
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            r2 = 0
            if (r2 >= r3) goto L_0x0028
            r1.get(r2)
            r4 = move-result
            r0.put(r4)
            int r2 = r2 + 1
            goto L_0x001c
            r5.m25062B(r0)
            monitor-exit(r5)
            return r0
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>(r0)
            monitor-exit(r5)
            return r1
        L_0x0034:
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            monitor-exit(r5)
            return r0
        L_0x003b:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p074e2.C6615e1.m25043m():org.json.JSONArray");
    }

    /* renamed from: q */
    public synchronized void m25039q() {
        m25040p("deeplink_url");
        m25040p("deeplink_click_time");
    }

    /* renamed from: r */
    public synchronized void m25038r() {
        m25040p("disable_third_party_sharing");
    }

    /* renamed from: s */
    public synchronized void m25037s() {
        m25040p("gdpr_forget_me");
    }

    /* renamed from: t */
    public synchronized void m25036t() {
        m25040p("preinstall_system_installer_referrer");
    }

    /* renamed from: u */
    public synchronized void m25035u() {
        m25040p("push_token");
    }

    /* renamed from: v */
    public synchronized void m25034v(String str, long j) {
        if (str != null) {
            if (str.length() != 0) {
                int n = m25042n(str, j);
                if (n >= 0) {
                    JSONArray m = m25043m();
                    JSONArray jSONArray = new JSONArray();
                    for (int i = 0; i < m.length(); i++) {
                        if (i != n) {
                            try {
                                jSONArray.put(m.getJSONArray(i));
                            } catch (JSONException unused) {
                            }
                        }
                    }
                    m25061C("raw_referrers", jSONArray.toString());
                }
            }
        }
    }

    /* renamed from: x */
    public synchronized void m25032x(Uri uri, long j) {
        if (uri != null) {
            m25061C("deeplink_url", uri.toString());
            m25031y("deeplink_click_time", j);
        }
    }

    /* renamed from: z */
    public synchronized void m25030z(String str) {
        m25061C("push_token", str);
    }
}
