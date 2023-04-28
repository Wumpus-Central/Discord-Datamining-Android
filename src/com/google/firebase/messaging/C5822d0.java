package com.google.firebase.messaging;

import ad.C1360a;
import ad.C1364b;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.discord.nearby.NearbyManager;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.tasks.C5474b;
import com.google.firebase.installations.C5794c;
import java.util.concurrent.ExecutionException;
import p136hc.C7984d;
import p157ic.AbstractC8387a;
import p279p6.AbstractC11573c;
import p279p6.AbstractC11575e;
import p279p6.AbstractC11577g;
import p279p6.C11572b;

/* renamed from: com.google.firebase.messaging.d0 */
/* loaded from: classes3.dex */
public class C5822d0 {
    /* renamed from: A */
    public static boolean m27202A(Intent intent) {
        if (intent == null || m27183r(intent)) {
            return false;
        }
        return m27201B(intent.getExtras());
    }

    /* renamed from: B */
    public static boolean m27201B(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return NearbyManager.PERMISSION_DENIED.equals(bundle.getString("google.c.a.e"));
    }

    /* renamed from: a */
    static boolean m27200a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            C7984d.m20966k();
            Context j = C7984d.m20966k().m20967j();
            SharedPreferences sharedPreferences = j.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = j.getPackageManager();
                if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(j.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("delivery_metrics_exported_to_big_query_enabled"))) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    /* renamed from: b */
    static C1360a m27199b(C1360a.EnumC1361b bVar, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        C1360a.C0005a h = C1360a.m41239p().m41226m(m27185p(extras)).m41234e(bVar).m41233f(m27195f(extras)).m41230i(m27188m()).m41228k(C1360a.EnumC1363d.ANDROID).m41231h(m27190k(extras));
        String h2 = m27193h(extras);
        if (h2 != null) {
            h.m41232g(h2);
        }
        String o = m27186o(extras);
        if (o != null) {
            h.m41227l(o);
        }
        String c = m27198c(extras);
        if (c != null) {
            h.m41236c(c);
        }
        String i = m27192i(extras);
        if (i != null) {
            h.m41237b(i);
        }
        String e = m27196e(extras);
        if (e != null) {
            h.m41235d(e);
        }
        long n = m27187n(extras);
        if (n > 0) {
            h.m41229j(n);
        }
        return h.m41238a();
    }

    /* renamed from: c */
    static String m27198c(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    /* renamed from: d */
    static String m27197d(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    /* renamed from: e */
    static String m27196e(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    /* renamed from: f */
    static String m27195f(Bundle bundle) {
        String string = bundle.getString("google.to");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) C5474b.m28897a(C5794c.m27315n(C7984d.m20966k()).getId());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: g */
    static String m27194g(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    /* renamed from: h */
    static String m27193h(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        if (string == null) {
            return bundle.getString("message_id");
        }
        return string;
    }

    /* renamed from: i */
    static String m27192i(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    /* renamed from: j */
    static String m27191j(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    /* renamed from: k */
    static C1360a.EnumC1362c m27190k(Bundle bundle) {
        if (bundle == null || !C5828f0.m27147t(bundle)) {
            return C1360a.EnumC1362c.DATA_MESSAGE;
        }
        return C1360a.EnumC1362c.DISPLAY_NOTIFICATION;
    }

    /* renamed from: l */
    static String m27189l(Bundle bundle) {
        return (bundle == null || !C5828f0.m27147t(bundle)) ? "data" : ViewProps.DISPLAY;
    }

    /* renamed from: m */
    static String m27188m() {
        return C7984d.m20966k().m20967j().getPackageName();
    }

    /* renamed from: n */
    static long m27187n(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException e) {
                Log.w("FirebaseMessaging", "error parsing project number", e);
            }
        }
        C7984d k = C7984d.m20966k();
        String d = k.m20964m().m20940d();
        if (d != null) {
            try {
                return Long.parseLong(d);
            } catch (NumberFormatException e2) {
                Log.w("FirebaseMessaging", "error parsing sender ID", e2);
            }
        }
        String c = k.m20964m().m20941c();
        if (!c.startsWith("1:")) {
            try {
                return Long.parseLong(c);
            } catch (NumberFormatException e3) {
                Log.w("FirebaseMessaging", "error parsing app ID", e3);
            }
        } else {
            String[] split = c.split(":");
            if (split.length < 2) {
                return 0L;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return 0L;
            }
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e4) {
                Log.w("FirebaseMessaging", "error parsing app ID", e4);
            }
        }
        return 0L;
    }

    /* renamed from: o */
    static String m27186o(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    /* renamed from: p */
    static int m27185p(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }

    /* renamed from: q */
    static String m27184q(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    /* renamed from: r */
    private static boolean m27183r(Intent intent) {
        return FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction());
    }

    /* renamed from: s */
    public static void m27182s(Intent intent) {
        m27177x("_nd", intent.getExtras());
    }

    /* renamed from: t */
    public static void m27181t(Intent intent) {
        m27177x("_nf", intent.getExtras());
    }

    /* renamed from: u */
    public static void m27180u(Bundle bundle) {
        m27176y(bundle);
        m27177x("_no", bundle);
    }

    /* renamed from: v */
    public static void m27179v(Intent intent) {
        if (m27202A(intent)) {
            m27177x("_nr", intent.getExtras());
        }
        if (m27175z(intent)) {
            m27178w(C1360a.EnumC1361b.MESSAGE_DELIVERED, intent, FirebaseMessaging.m27261q());
        }
    }

    /* renamed from: w */
    private static void m27178w(C1360a.EnumC1361b bVar, Intent intent, AbstractC11577g gVar) {
        if (gVar == null) {
            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        C1360a b = m27199b(bVar, intent);
        if (b != null) {
            try {
                gVar.mo6792a("FCM_CLIENT_EVENT_LOGGING", C1364b.class, C11572b.m9324b("src/main/proto"), new AbstractC11575e() { // from class: com.google.firebase.messaging.c0
                    @Override // p279p6.AbstractC11575e
                    public final Object apply(Object obj) {
                        return ((C1364b) obj).m41223c();
                    }
                }).mo6790a(AbstractC11573c.m9320d(C1364b.m41224b().m41221b(b).m41222a()));
            } catch (RuntimeException e) {
                Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e);
            }
        }
    }

    /* renamed from: x */
    static void m27177x(String str, Bundle bundle) {
        try {
            C7984d.m20966k();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String d = m27197d(bundle);
            if (d != null) {
                bundle2.putString("_nmid", d);
            }
            String e = m27196e(bundle);
            if (e != null) {
                bundle2.putString("_nmn", e);
            }
            String i = m27192i(bundle);
            if (!TextUtils.isEmpty(i)) {
                bundle2.putString("label", i);
            }
            String g = m27194g(bundle);
            if (!TextUtils.isEmpty(g)) {
                bundle2.putString("message_channel", g);
            }
            String o = m27186o(bundle);
            if (o != null) {
                bundle2.putString("_nt", o);
            }
            String j = m27191j(bundle);
            if (j != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(j));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e2);
                }
            }
            String q = m27184q(bundle);
            if (q != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(q));
                } catch (NumberFormatException e3) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e3);
                }
            }
            String l = m27189l(bundle);
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", l);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            AbstractC8387a aVar = (AbstractC8387a) C7984d.m20966k().m20968i(AbstractC8387a.class);
            if (aVar != null) {
                aVar.m19880a("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    /* renamed from: y */
    private static void m27176y(Bundle bundle) {
        if (bundle != null) {
            if (NearbyManager.PERMISSION_DENIED.equals(bundle.getString("google.c.a.tc"))) {
                AbstractC8387a aVar = (AbstractC8387a) C7984d.m20966k().m20968i(AbstractC8387a.class);
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                }
                if (aVar != null) {
                    String string = bundle.getString("google.c.a.c_id");
                    aVar.m19879b("fcm", "_ln", string);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("source", "Firebase");
                    bundle2.putString("medium", "notification");
                    bundle2.putString("campaign", string);
                    aVar.m19880a("fcm", "_cmp", bundle2);
                    return;
                }
                Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
            }
        }
    }

    /* renamed from: z */
    public static boolean m27175z(Intent intent) {
        if (intent == null || m27183r(intent)) {
            return false;
        }
        return m27200a();
    }
}
