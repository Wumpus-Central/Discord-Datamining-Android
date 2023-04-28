package io.sentry.android.core;

import io.sentry.AbstractC8862f1;
import io.sentry.AbstractC9053t;
import io.sentry.C8815c4;
import io.sentry.C8908j3;
import io.sentry.C9116v;
import io.sentry.protocol.C8983g;
import io.sentry.protocol.C9001p;
import io.sentry.protocol.C9015w;
import io.sentry.util.C9111k;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.sentry.android.core.u0 */
/* loaded from: classes8.dex */
public final class C8786u0 implements AbstractC9053t {

    /* renamed from: k */
    private boolean f19400k = false;

    /* renamed from: l */
    private final C8716g f19401l;

    /* renamed from: m */
    private final SentryAndroidOptions f19402m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8786u0(SentryAndroidOptions sentryAndroidOptions, C8716g gVar) {
        this.f19402m = (SentryAndroidOptions) C9111k.m16995a(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f19401l = (C8716g) C9111k.m16995a(gVar, "ActivityFramesTracker is required");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m18086a(java.util.List<io.sentry.protocol.C9007s> r4) {
        /*
            r3 = this;
            java.util.Iterator r4 = r4.iterator()
        L_0x0004:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r4.next()
            io.sentry.protocol.s r0 = (io.sentry.protocol.C9007s) r0
            java.lang.String r1 = r0.m17300b()
            java.lang.String r2 = "app.start.cold"
            boolean r1 = r1.contentEquals(r2)
            if (r1 != 0) goto L_0x0028
            java.lang.String r0 = r0.m17300b()
            java.lang.String r1 = "app.start.warm"
            boolean r0 = r0.contentEquals(r1)
            if (r0 == 0) goto L_0x0004
        L_0x0028:
            r4 = 1
            return r4
        L_0x002a:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.C8786u0.m18086a(java.util.List):boolean");
    }

    @Override // io.sentry.AbstractC9053t
    /* renamed from: b */
    public C8908j3 mo17164b(C8908j3 j3Var, C9116v vVar) {
        return j3Var;
    }

    @Override // io.sentry.AbstractC9053t
    /* renamed from: g */
    public synchronized C9015w mo17163g(C9015w wVar, C9116v vVar) {
        Map<String, C8983g> q;
        Long a;
        String str;
        if (!this.f19402m.isTracingEnabled()) {
            return wVar;
        }
        if (!this.f19400k && m18086a(wVar.m17238l0()) && (a = C8709d0.m18315d().m18318a()) != null) {
            C8983g gVar = new C8983g(Float.valueOf((float) a.longValue()), AbstractC8862f1.EnumC8863a.MILLISECOND.apiName());
            if (C8709d0.m18315d().m18314e().booleanValue()) {
                str = "app_start_cold";
            } else {
                str = "app_start_warm";
            }
            wVar.m17240j0().put(str, gVar);
            this.f19400k = true;
        }
        C9001p E = wVar.m17665E();
        C8815c4 f = wVar.m17668B().m17501f();
        if (!(E == null || f == null || !f.m17995b().contentEquals("ui.load") || (q = this.f19401l.m18284q(E)) == null)) {
            wVar.m17240j0().putAll(q);
        }
        return wVar;
    }
}
