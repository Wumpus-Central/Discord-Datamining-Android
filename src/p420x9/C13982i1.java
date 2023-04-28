package p420x9;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* renamed from: x9.i1 */
/* loaded from: classes5.dex */
public final class C13982i1 {

    /* renamed from: f */
    private static final Uri f31535f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a */
    private final String f31536a;

    /* renamed from: b */
    private final String f31537b;

    /* renamed from: c */
    private final ComponentName f31538c = null;

    /* renamed from: d */
    private final int f31539d;

    /* renamed from: e */
    private final boolean f31540e;

    public C13982i1(String str, String str2, int i, boolean z) {
        C14004p.m2055f(str);
        this.f31536a = str;
        C14004p.m2055f(str2);
        this.f31537b = str2;
        this.f31539d = i;
        this.f31540e = z;
    }

    /* renamed from: a */
    public final int m2098a() {
        return this.f31539d;
    }

    /* renamed from: b */
    public final ComponentName m2097b() {
        return this.f31538c;
    }

    /* renamed from: c */
    public final Intent m2096c(Context context) {
        Bundle bundle;
        String str;
        if (this.f31536a == null) {
            return new Intent().setComponent(this.f31538c);
        }
        Intent intent = null;
        if (this.f31540e) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", this.f31536a);
            try {
                bundle = context.getContentResolver().call(f31535f, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundle = null;
            }
            if (bundle != null) {
                intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
            }
            if (intent == null) {
                String valueOf = String.valueOf(this.f31536a);
                if (valueOf.length() != 0) {
                    str = "Dynamic lookup for intent failed for action: ".concat(valueOf);
                } else {
                    str = new String("Dynamic lookup for intent failed for action: ");
                }
                Log.w("ConnectionStatusConfig", str);
            }
        }
        if (intent != null) {
            return intent;
        }
        return new Intent(this.f31536a).setPackage(this.f31537b);
    }

    /* renamed from: d */
    public final String m2095d() {
        return this.f31537b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13982i1)) {
            return false;
        }
        C13982i1 i1Var = (C13982i1) obj;
        if (!C13996n.m2071b(this.f31536a, i1Var.f31536a) || !C13996n.m2071b(this.f31537b, i1Var.f31537b) || !C13996n.m2071b(this.f31538c, i1Var.f31538c) || this.f31539d != i1Var.f31539d || this.f31540e != i1Var.f31540e) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C13996n.m2070c(this.f31536a, this.f31537b, this.f31538c, Integer.valueOf(this.f31539d), Boolean.valueOf(this.f31540e));
    }

    public final String toString() {
        String str = this.f31536a;
        if (str != null) {
            return str;
        }
        C14004p.m2051j(this.f31538c);
        return this.f31538c.flattenToString();
    }
}
