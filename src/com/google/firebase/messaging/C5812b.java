package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.core.content.C2337a;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.firebase.messaging.b */
/* loaded from: classes3.dex */
public final class C5812b {

    /* renamed from: a */
    private static final AtomicInteger f11550a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* renamed from: com.google.firebase.messaging.b$a */
    /* loaded from: classes3.dex */
    public static class C5813a {

        /* renamed from: a */
        public final NotificationCompat.Builder f11551a;

        /* renamed from: b */
        public final String f11552b;

        /* renamed from: c */
        public final int f11553c;

        C5813a(NotificationCompat.Builder builder, String str, int i) {
            this.f11551a = builder;
            this.f11552b = str;
            this.f11553c = i;
        }
    }

    /* renamed from: a */
    private static PendingIntent m27236a(Context context, C5828f0 f0Var, String str, PackageManager packageManager) {
        Intent f = m27231f(str, f0Var, packageManager);
        if (f == null) {
            return null;
        }
        f.addFlags(67108864);
        f.putExtras(f0Var.m27142y());
        if (m27220q(f0Var)) {
            f.putExtra("gcm.n.analytics_data", f0Var.m27143x());
        }
        return PendingIntent.getActivity(context, m27230g(), f, m27225l(1073741824));
    }

    /* renamed from: b */
    private static PendingIntent m27235b(Context context, C5828f0 f0Var) {
        if (!m27220q(f0Var)) {
            return null;
        }
        return m27234c(context, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(f0Var.m27143x()));
    }

    /* renamed from: c */
    private static PendingIntent m27234c(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, m27230g(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), m27225l(1073741824));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C5813a m27233d(Context context, C5828f0 f0Var) {
        Bundle j = m27227j(context.getPackageManager(), context.getPackageName());
        return m27232e(context, context.getPackageName(), f0Var, m27226k(context, f0Var.m27156k(), j), context.getResources(), context.getPackageManager(), j);
    }

    /* renamed from: e */
    public static C5813a m27232e(Context context, String str, C5828f0 f0Var, String str2, Resources resources, PackageManager packageManager, Bundle bundle) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, str2);
        String n = f0Var.m27153n(resources, str, "gcm.n.title");
        if (!TextUtils.isEmpty(n)) {
            builder.m38572E(n);
        }
        String n2 = f0Var.m27153n(resources, str, "gcm.n.body");
        if (!TextUtils.isEmpty(n2)) {
            builder.m38573D(n2);
            builder.m38541e0(new NotificationCompat.C2171c().m38481x(n2));
        }
        builder.m38551Z(m27224m(packageManager, resources, str, f0Var.m27151p("gcm.n.icon"), bundle));
        Uri n3 = m27223n(str, f0Var, resources);
        if (n3 != null) {
            builder.m38545c0(n3);
        }
        builder.m38574C(m27236a(context, f0Var, str, packageManager));
        PendingIntent b = m27235b(context, f0Var);
        if (b != null) {
            builder.m38570G(b);
        }
        Integer h = m27229h(context, f0Var.m27151p("gcm.n.color"), bundle);
        if (h != null) {
            builder.m38513z(h.intValue());
        }
        builder.m38519t(!f0Var.m27166a("gcm.n.sticky"));
        builder.m38563N(f0Var.m27166a("gcm.n.local_only"));
        String p = f0Var.m27151p("gcm.n.ticker");
        if (p != null) {
            builder.m38537g0(p);
        }
        Integer m = f0Var.m27154m();
        if (m != null) {
            builder.m38558S(m.intValue());
        }
        Integer r = f0Var.m27149r();
        if (r != null) {
            builder.m38529k0(r.intValue());
        }
        Integer l = f0Var.m27155l();
        if (l != null) {
            builder.m38561P(l.intValue());
        }
        Long j = f0Var.m27157j("gcm.n.event_time");
        if (j != null) {
            builder.m38553X(true);
            builder.m38527l0(j.longValue());
        }
        long[] q = f0Var.m27150q();
        if (q != null) {
            builder.m38531j0(q);
        }
        int[] e = f0Var.m27162e();
        if (e != null) {
            builder.m38564M(e[0], e[1], e[2]);
        }
        builder.m38571F(m27228i(f0Var));
        return new C5813a(builder, m27222o(f0Var), 0);
    }

    /* renamed from: f */
    private static Intent m27231f(String str, C5828f0 f0Var, PackageManager packageManager) {
        String p = f0Var.m27151p("gcm.n.click_action");
        if (!TextUtils.isEmpty(p)) {
            Intent intent = new Intent(p);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri f = f0Var.m27161f();
        if (f != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(f);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    /* renamed from: g */
    private static int m27230g() {
        return f11550a.incrementAndGet();
    }

    /* renamed from: h */
    private static Integer m27229h(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i == 0) {
            return null;
        }
        try {
            return Integer.valueOf(C2337a.m38135c(context, i));
        } catch (Resources.NotFoundException unused2) {
            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    /* renamed from: i */
    private static int m27228i(C5828f0 f0Var) {
        boolean a = f0Var.m27166a("gcm.n.default_sound");
        if (f0Var.m27166a("gcm.n.default_vibrate_timings")) {
            a = (a ? 1 : 0) | true;
        }
        if (!f0Var.m27166a("gcm.n.default_light_settings")) {
            int i = a ? 1 : 0;
            int i2 = a ? 1 : 0;
            int i3 = a ? 1 : 0;
            return i;
        }
        int i4 = a ? 1 : 0;
        char c = a ? 1 : 0;
        return i4 | 4;
    }

    /* renamed from: j */
    private static Bundle m27227j(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e);
        }
        return Bundle.EMPTY;
    }

    @TargetApi(26)
    /* renamed from: k */
    public static String m27226k(Context context, String str, Bundle bundle) {
        NotificationChannel notificationChannel;
        String str2;
        NotificationChannel notificationChannel2;
        NotificationChannel notificationChannel3;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                notificationChannel3 = notificationManager.getNotificationChannel(str);
                if (notificationChannel3 != null) {
                    return str;
                }
                Log.w("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (!TextUtils.isEmpty(string)) {
                notificationChannel2 = notificationManager.getNotificationChannel(string);
                if (notificationChannel2 != null) {
                    return string;
                }
                Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            } else {
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            }
            notificationChannel = notificationManager.getNotificationChannel("fcm_fallback_notification_channel");
            if (notificationChannel == null) {
                int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                if (identifier == 0) {
                    Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    str2 = "Misc";
                } else {
                    str2 = context.getString(identifier);
                }
                notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", str2, 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: l */
    private static int m27225l(int i) {
        return i | 67108864;
    }

    /* renamed from: m */
    private static int m27224m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && m27221p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && m27221p(resources, identifier2)) {
                return identifier2;
            }
            Log.w("FirebaseMessaging", "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i == 0 || !m27221p(resources, i)) {
            try {
                i = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e);
            }
        }
        if (i == 0 || !m27221p(resources, i)) {
            return 17301651;
        }
        return i;
    }

    /* renamed from: n */
    private static Uri m27223n(String str, C5828f0 f0Var, Resources resources) {
        String o = f0Var.m27152o();
        if (TextUtils.isEmpty(o)) {
            return null;
        }
        if ("default".equals(o) || resources.getIdentifier(o, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + o);
    }

    /* renamed from: o */
    private static String m27222o(C5828f0 f0Var) {
        String p = f0Var.m27151p("gcm.n.tag");
        if (!TextUtils.isEmpty(p)) {
            return p;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    @TargetApi(26)
    /* renamed from: p */
    private static boolean m27221p(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i + ", treating it as an invalid icon");
            return false;
        }
    }

    /* renamed from: q */
    static boolean m27220q(C5828f0 f0Var) {
        return f0Var.m27166a("google.c.a.e");
    }
}
