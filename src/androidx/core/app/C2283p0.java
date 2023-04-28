package androidx.core.app;

import android.app.NotificationChannelGroup;
import android.os.Build;
import androidx.core.util.C2517g;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.core.app.p0 */
/* loaded from: classes.dex */
public class C2283p0 {

    /* renamed from: a */
    final String f3214a;

    /* renamed from: b */
    CharSequence f3215b;

    /* renamed from: c */
    String f3216c;

    /* renamed from: d */
    private List<NotificationChannelCompat> f3217d = Collections.emptyList();

    /* renamed from: androidx.core.app.p0$a */
    /* loaded from: classes.dex */
    public static class C2284a {

        /* renamed from: a */
        final C2283p0 f3218a;

        public C2284a(String str) {
            this.f3218a = new C2283p0(str);
        }

        /* renamed from: a */
        public C2283p0 m38207a() {
            return this.f3218a;
        }

        /* renamed from: b */
        public C2284a m38206b(String str) {
            this.f3218a.f3216c = str;
            return this;
        }

        /* renamed from: c */
        public C2284a m38205c(CharSequence charSequence) {
            this.f3218a.f3215b = charSequence;
            return this;
        }
    }

    C2283p0(String str) {
        this.f3214a = (String) C2517g.m37588g(str);
    }

    /* renamed from: a */
    public String m38210a() {
        return this.f3214a;
    }

    /* renamed from: b */
    public CharSequence m38209b() {
        return this.f3215b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public NotificationChannelGroup m38208c() {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return null;
        }
        NotificationChannelGroup notificationChannelGroup = new NotificationChannelGroup(this.f3214a, this.f3215b);
        if (i >= 28) {
            notificationChannelGroup.setDescription(this.f3216c);
        }
        return notificationChannelGroup;
    }
}
