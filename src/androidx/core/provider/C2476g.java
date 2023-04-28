package androidx.core.provider;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.graphics.C2410e;
import androidx.core.util.C2517g;

/* renamed from: androidx.core.provider.g */
/* loaded from: classes.dex */
public class C2476g {

    /* renamed from: androidx.core.provider.g$a */
    /* loaded from: classes.dex */
    public static class C2477a {

        /* renamed from: a */
        private final int f3420a;

        /* renamed from: b */
        private final C2478b[] f3421b;

        @Deprecated
        public C2477a(int i, C2478b[] bVarArr) {
            this.f3420a = i;
            this.f3421b = bVarArr;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public static C2477a m37677a(int i, C2478b[] bVarArr) {
            return new C2477a(i, bVarArr);
        }

        /* renamed from: b */
        public C2478b[] m37676b() {
            return this.f3421b;
        }

        /* renamed from: c */
        public int m37675c() {
            return this.f3420a;
        }
    }

    /* renamed from: androidx.core.provider.g$b */
    /* loaded from: classes.dex */
    public static class C2478b {

        /* renamed from: a */
        private final Uri f3422a;

        /* renamed from: b */
        private final int f3423b;

        /* renamed from: c */
        private final int f3424c;

        /* renamed from: d */
        private final boolean f3425d;

        /* renamed from: e */
        private final int f3426e;

        @Deprecated
        public C2478b(Uri uri, int i, int i2, boolean z, int i3) {
            this.f3422a = (Uri) C2517g.m37588g(uri);
            this.f3423b = i;
            this.f3424c = i2;
            this.f3425d = z;
            this.f3426e = i3;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public static C2478b m37674a(Uri uri, int i, int i2, boolean z, int i3) {
            return new C2478b(uri, i, i2, z, i3);
        }

        /* renamed from: b */
        public int m37673b() {
            return this.f3426e;
        }

        /* renamed from: c */
        public int m37672c() {
            return this.f3423b;
        }

        /* renamed from: d */
        public Uri m37671d() {
            return this.f3422a;
        }

        /* renamed from: e */
        public int m37670e() {
            return this.f3424c;
        }

        /* renamed from: f */
        public boolean m37669f() {
            return this.f3425d;
        }
    }

    /* renamed from: androidx.core.provider.g$c */
    /* loaded from: classes.dex */
    public static class C2479c {
        /* renamed from: a */
        public void mo37668a(int i) {
            throw null;
        }

        /* renamed from: b */
        public void mo37667b(Typeface typeface) {
            throw null;
        }
    }

    /* renamed from: a */
    public static Typeface m37680a(Context context, CancellationSignal cancellationSignal, C2478b[] bVarArr) {
        return C2410e.m37799b(context, cancellationSignal, bVarArr, 0);
    }

    /* renamed from: b */
    public static C2477a m37679b(Context context, CancellationSignal cancellationSignal, C2469e eVar) {
        return C2467d.m37702e(context, eVar, cancellationSignal);
    }

    /* renamed from: c */
    public static Typeface m37678c(Context context, C2469e eVar, int i, boolean z, int i2, Handler handler, C2479c cVar) {
        C2463a aVar = new C2463a(cVar, handler);
        if (z) {
            return C2470f.m37686e(context, eVar, aVar, i, i2);
        }
        return C2470f.m37687d(context, eVar, i, null, aVar);
    }
}
