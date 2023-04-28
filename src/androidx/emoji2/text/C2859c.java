package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.core.provider.C2469e;
import androidx.core.util.C2517g;
import androidx.emoji2.text.C2863d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.emoji2.text.c */
/* loaded from: classes.dex */
public final class C2859c {

    /* renamed from: androidx.emoji2.text.c$a */
    /* loaded from: classes.dex */
    public static class C2860a {

        /* renamed from: a */
        private final C2861b f3829a;

        public C2860a(C2861b bVar) {
            this.f3829a = bVar == null ? m36472e() : bVar;
        }

        /* renamed from: a */
        private C2863d.AbstractC2866c m36476a(Context context, C2469e eVar) {
            if (eVar == null) {
                return null;
            }
            return new C2879i(context, eVar);
        }

        /* renamed from: b */
        private List<List<byte[]>> m36475b(Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        /* renamed from: d */
        private C2469e m36473d(ProviderInfo providerInfo, PackageManager packageManager) {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new C2469e(str, str2, "emojicompat-emoji-font", m36475b(this.f3829a.mo36466b(packageManager, str2)));
        }

        /* renamed from: e */
        private static C2861b m36472e() {
            if (Build.VERSION.SDK_INT >= 28) {
                return new C2862d();
            }
            return new C0051c();
        }

        /* renamed from: f */
        private boolean m36471f(ProviderInfo providerInfo) {
            ApplicationInfo applicationInfo;
            return (providerInfo == null || (applicationInfo = providerInfo.applicationInfo) == null || (applicationInfo.flags & 1) != 1) ? false : true;
        }

        /* renamed from: g */
        private ProviderInfo m36470g(PackageManager packageManager) {
            for (ResolveInfo resolveInfo : this.f3829a.mo36467c(packageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0)) {
                ProviderInfo a = this.f3829a.mo36468a(resolveInfo);
                if (m36471f(a)) {
                    return a;
                }
            }
            return null;
        }

        /* renamed from: c */
        public C2863d.AbstractC2866c m36474c(Context context) {
            return m36476a(context, m36469h(context));
        }

        /* renamed from: h */
        C2469e m36469h(Context context) {
            PackageManager packageManager = context.getPackageManager();
            C2517g.m37587h(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo g = m36470g(packageManager);
            if (g == null) {
                return null;
            }
            try {
                return m36473d(g, packageManager);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                return null;
            }
        }
    }

    /* renamed from: androidx.emoji2.text.c$b */
    /* loaded from: classes.dex */
    public static class C2861b {
        /* renamed from: a */
        public ProviderInfo mo36468a(ResolveInfo resolveInfo) {
            throw null;
        }

        /* renamed from: b */
        public Signature[] mo36466b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        /* renamed from: c */
        public List<ResolveInfo> mo36467c(PackageManager packageManager, Intent intent, int i) {
            throw null;
        }
    }

    /* renamed from: androidx.emoji2.text.c$c */
    /* loaded from: classes.dex */
    public static class C0051c extends C2861b {
        @Override // androidx.emoji2.text.C2859c.C2861b
        /* renamed from: a */
        public ProviderInfo mo36468a(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.C2859c.C2861b
        /* renamed from: c */
        public List<ResolveInfo> mo36467c(PackageManager packageManager, Intent intent, int i) {
            return packageManager.queryIntentContentProviders(intent, i);
        }
    }

    /* renamed from: androidx.emoji2.text.c$d */
    /* loaded from: classes.dex */
    public static class C2862d extends C0051c {
        @Override // androidx.emoji2.text.C2859c.C2861b
        /* renamed from: b */
        public Signature[] mo36466b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    /* renamed from: a */
    public static C2879i m36477a(Context context) {
        return (C2879i) new C2860a(null).m36474c(context);
    }
}
