package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import androidx.core.util.C2517g;

/* loaded from: classes.dex */
public class NotificationChannelCompat {

    /* renamed from: a */
    final String f3030a;

    /* renamed from: b */
    CharSequence f3031b;

    /* renamed from: c */
    int f3032c;

    /* renamed from: d */
    String f3033d;

    /* renamed from: e */
    String f3034e;

    /* renamed from: f */
    boolean f3035f;

    /* renamed from: g */
    Uri f3036g;

    /* renamed from: h */
    AudioAttributes f3037h;

    /* renamed from: i */
    boolean f3038i;

    /* renamed from: j */
    int f3039j;

    /* renamed from: k */
    boolean f3040k;

    /* renamed from: l */
    long[] f3041l;

    /* renamed from: m */
    String f3042m;

    /* renamed from: n */
    String f3043n;

    /* renamed from: o */
    private boolean f3044o;

    /* renamed from: p */
    private int f3045p;

    /* renamed from: q */
    private boolean f3046q;

    /* renamed from: r */
    private boolean f3047r;

    /* loaded from: classes.dex */
    public static class Builder {

        /* renamed from: a */
        private final NotificationChannelCompat f3048a;

        public Builder(String str, int i) {
            this.f3048a = new NotificationChannelCompat(str, i);
        }

        /* renamed from: a */
        public NotificationChannelCompat m38633a() {
            return this.f3048a;
        }

        /* renamed from: b */
        public Builder m38632b(String str) {
            this.f3048a.f3033d = str;
            return this;
        }

        /* renamed from: c */
        public Builder m38631c(String str) {
            this.f3048a.f3034e = str;
            return this;
        }

        /* renamed from: d */
        public Builder m38630d(int i) {
            this.f3048a.f3039j = i;
            return this;
        }

        /* renamed from: e */
        public Builder m38629e(boolean z) {
            this.f3048a.f3038i = z;
            return this;
        }

        /* renamed from: f */
        public Builder m38628f(CharSequence charSequence) {
            this.f3048a.f3031b = charSequence;
            return this;
        }

        /* renamed from: g */
        public Builder m38627g(boolean z) {
            this.f3048a.f3035f = z;
            return this;
        }

        /* renamed from: h */
        public Builder m38626h(Uri uri, AudioAttributes audioAttributes) {
            NotificationChannelCompat notificationChannelCompat = this.f3048a;
            notificationChannelCompat.f3036g = uri;
            notificationChannelCompat.f3037h = audioAttributes;
            return this;
        }

        /* renamed from: i */
        public Builder m38625i(boolean z) {
            this.f3048a.f3040k = z;
            return this;
        }

        /* renamed from: j */
        public Builder m38624j(long[] jArr) {
            boolean z;
            NotificationChannelCompat notificationChannelCompat = this.f3048a;
            if (jArr == null || jArr.length <= 0) {
                z = false;
            } else {
                z = true;
            }
            notificationChannelCompat.f3040k = z;
            notificationChannelCompat.f3041l = jArr;
            return this;
        }
    }

    NotificationChannelCompat(String str, int i) {
        this.f3035f = true;
        this.f3036g = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.f3039j = 0;
        this.f3030a = (String) C2517g.m37588g(str);
        this.f3032c = i;
        this.f3037h = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }

    /* renamed from: a */
    public boolean m38637a() {
        return this.f3035f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public NotificationChannel m38636b() {
        String str;
        String str2;
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return null;
        }
        NotificationChannel notificationChannel = new NotificationChannel(this.f3030a, this.f3031b, this.f3032c);
        notificationChannel.setDescription(this.f3033d);
        notificationChannel.setGroup(this.f3034e);
        notificationChannel.setShowBadge(this.f3035f);
        notificationChannel.setSound(this.f3036g, this.f3037h);
        notificationChannel.enableLights(this.f3038i);
        notificationChannel.setLightColor(this.f3039j);
        notificationChannel.setVibrationPattern(this.f3041l);
        notificationChannel.enableVibration(this.f3040k);
        if (!(i < 30 || (str = this.f3042m) == null || (str2 = this.f3043n) == null)) {
            notificationChannel.setConversationId(str, str2);
        }
        return notificationChannel;
    }

    /* renamed from: c */
    public boolean m38635c() {
        return this.f3038i;
    }

    /* renamed from: d */
    public boolean m38634d() {
        return this.f3040k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public NotificationChannelCompat(android.app.NotificationChannel r4) {
        /*
            r3 = this;
            java.lang.String r0 = androidx.core.app.C2272n.m38221a(r4)
            int r1 = androidx.core.app.C2273n0.m38220a(r4)
            r3.<init>(r0, r1)
            java.lang.CharSequence r0 = androidx.core.app.C2277o.m38216a(r4)
            r3.f3031b = r0
            java.lang.String r0 = androidx.core.app.C2282p.m38211a(r4)
            r3.f3033d = r0
            java.lang.String r0 = androidx.core.app.C2288q.m38201a(r4)
            r3.f3034e = r0
            boolean r0 = androidx.core.app.C2293r.m38196a(r4)
            r3.f3035f = r0
            android.net.Uri r0 = androidx.core.app.C2298s.m38191a(r4)
            r3.f3036g = r0
            android.media.AudioAttributes r0 = androidx.core.app.C2303t.m38186a(r4)
            r3.f3037h = r0
            boolean r0 = androidx.core.app.C2308u.m38181a(r4)
            r3.f3038i = r0
            int r0 = androidx.core.app.C2313v.m38169a(r4)
            r3.f3039j = r0
            boolean r0 = androidx.core.app.C2327y.m38149a(r4)
            r3.f3040k = r0
            long[] r0 = androidx.core.app.C2236g0.m38265a(r4)
            r3.f3041l = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L_0x0059
            java.lang.String r2 = androidx.core.app.C2242h0.m38257a(r4)
            r3.f3042m = r2
            java.lang.String r2 = androidx.core.app.C2247i0.m38252a(r4)
            r3.f3043n = r2
        L_0x0059:
            boolean r2 = androidx.core.app.C2252j0.m38247a(r4)
            r3.f3044o = r2
            int r2 = androidx.core.app.C2257k0.m38242a(r4)
            r3.f3045p = r2
            r2 = 29
            if (r0 < r2) goto L_0x006f
            boolean r2 = androidx.core.app.C2263l0.m38229a(r4)
            r3.f3046q = r2
        L_0x006f:
            if (r0 < r1) goto L_0x0077
            boolean r4 = androidx.core.app.C2268m0.m38225a(r4)
            r3.f3047r = r4
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationChannelCompat.<init>(android.app.NotificationChannel):void");
    }
}
