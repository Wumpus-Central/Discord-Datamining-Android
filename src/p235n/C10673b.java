package p235n;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseArray;
import androidx.core.app.C2212d;
import androidx.core.app.C2240h;
import androidx.core.content.C2337a;
import java.util.ArrayList;
import p235n.C10672a;

/* renamed from: n.b */
/* loaded from: classes.dex */
public final class C10673b {

    /* renamed from: a */
    public final Intent f23617a;

    /* renamed from: b */
    public final Bundle f23618b;

    /* renamed from: n.b$a */
    /* loaded from: classes.dex */
    public static final class C10674a {

        /* renamed from: c */
        private ArrayList<Bundle> f23621c;

        /* renamed from: d */
        private Bundle f23622d;

        /* renamed from: e */
        private ArrayList<Bundle> f23623e;

        /* renamed from: f */
        private SparseArray<Bundle> f23624f;

        /* renamed from: g */
        private Bundle f23625g;

        /* renamed from: a */
        private final Intent f23619a = new Intent("android.intent.action.VIEW");

        /* renamed from: b */
        private final C10672a.C0345a f23620b = new C10672a.C0345a();

        /* renamed from: h */
        private int f23626h = 0;

        /* renamed from: i */
        private boolean f23627i = true;

        /* renamed from: d */
        private void m12661d(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            C2240h.m38260b(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f23619a.putExtras(bundle);
        }

        /* renamed from: a */
        public C10673b m12664a() {
            if (!this.f23619a.hasExtra("android.support.customtabs.extra.SESSION")) {
                m12661d(null, null);
            }
            ArrayList<Bundle> arrayList = this.f23621c;
            if (arrayList != null) {
                this.f23619a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f23623e;
            if (arrayList2 != null) {
                this.f23619a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f23619a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f23627i);
            this.f23619a.putExtras(this.f23620b.m12669a().m12670a());
            Bundle bundle = this.f23625g;
            if (bundle != null) {
                this.f23619a.putExtras(bundle);
            }
            if (this.f23624f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f23624f);
                this.f23619a.putExtras(bundle2);
            }
            this.f23619a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f23626h);
            return new C10673b(this.f23619a, this.f23622d);
        }

        /* renamed from: b */
        public C10674a m12663b(C10672a aVar) {
            this.f23625g = aVar.m12670a();
            return this;
        }

        /* renamed from: c */
        public C10674a m12662c(Context context, int i, int i2) {
            this.f23619a.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", C2212d.m38302a(context, i, i2).mo38301b());
            return this;
        }

        /* renamed from: e */
        public C10674a m12660e(boolean z) {
            this.f23619a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z ? 1 : 0);
            return this;
        }

        /* renamed from: f */
        public C10674a m12659f(Context context, int i, int i2) {
            this.f23622d = C2212d.m38302a(context, i, i2).mo38301b();
            return this;
        }
    }

    C10673b(Intent intent, Bundle bundle) {
        this.f23617a = intent;
        this.f23618b = bundle;
    }

    /* renamed from: a */
    public void m12665a(Context context, Uri uri) {
        this.f23617a.setData(uri);
        C2337a.m38126l(context, this.f23617a, this.f23618b);
    }
}
