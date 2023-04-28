package com.google.android.gms.auth.api.signin;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import p230m9.C10561a;
import p318r9.C12481o;
import p365u9.C13220f;
import p365u9.C13223i;
import p384v9.AbstractC13468e;
import p384v9.AbstractC13470f;
import p400w9.C13811a;
import p420x9.C14000o;

/* renamed from: com.google.android.gms.auth.api.signin.b */
/* loaded from: classes5.dex */
public class C5362b extends AbstractC13468e<GoogleSignInOptions> {

    /* renamed from: k */
    private static final C5366f f10086k = new C5366f(null);

    /* renamed from: l */
    static int f10087l = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5362b(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, C10561a.f23394c, googleSignInOptions, new C13811a());
    }

    /* renamed from: E */
    private final synchronized int m29128E() {
        int i;
        i = f10087l;
        if (i == 1) {
            Context t = m3624t();
            C13220f k = C13220f.m4286k();
            int f = k.mo4270f(t, C13223i.f29692a);
            if (f == 0) {
                i = 4;
                f10087l = 4;
            } else if (k.mo4275a(t, f, null) != null || DynamiteModule.m28940a(t, "com.google.android.gms.auth.api.fallback") == 0) {
                i = 2;
                f10087l = 2;
            } else {
                i = 3;
                f10087l = 3;
            }
        }
        return i;
    }

    /* renamed from: C */
    public Task<Void> m29130C() {
        boolean z;
        AbstractC13470f h = m3636h();
        Context t = m3624t();
        if (m29128E() == 3) {
            z = true;
        } else {
            z = false;
        }
        return C14000o.m2065c(C12481o.m6636a(h, t, z));
    }

    /* renamed from: D */
    public Task<Void> m29129D() {
        boolean z;
        AbstractC13470f h = m3636h();
        Context t = m3624t();
        if (m29128E() == 3) {
            z = true;
        } else {
            z = false;
        }
        return C14000o.m2065c(C12481o.m6635b(h, t, z));
    }
}
