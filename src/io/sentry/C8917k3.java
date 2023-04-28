package io.sentry;

import io.sentry.exception.C8858a;
import io.sentry.protocol.C8985h;
import io.sentry.protocol.C8999o;
import io.sentry.protocol.C9009t;
import io.sentry.protocol.C9011u;
import io.sentry.util.C9111k;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.sentry.k3 */
/* loaded from: classes8.dex */
public final class C8917k3 {

    /* renamed from: a */
    private final C9026q3 f19603a;

    public C8917k3(C9026q3 q3Var) {
        this.f19603a = (C9026q3) C9111k.m16995a(q3Var, "The SentryStackTraceFactory is required.");
    }

    /* renamed from: b */
    private C8999o m17688b(Throwable th2, C8985h hVar, Thread thread, boolean z) {
        String str;
        Package r0 = th2.getClass().getPackage();
        String name = th2.getClass().getName();
        C8999o oVar = new C8999o();
        String message = th2.getMessage();
        if (r0 != null) {
            name = name.replace(r0.getName() + ".", "");
        }
        if (r0 != null) {
            str = r0.getName();
        } else {
            str = null;
        }
        List<C9009t> a = this.f19603a.m17204a(th2.getStackTrace());
        if (a != null && !a.isEmpty()) {
            C9011u uVar = new C9011u(a);
            if (z) {
                uVar.m17270d(Boolean.TRUE);
            }
            oVar.m17322l(uVar);
        }
        if (thread != null) {
            oVar.m17321m(Long.valueOf(thread.getId()));
        }
        oVar.m17320n(name);
        oVar.m17324j(hVar);
        oVar.m17323k(str);
        oVar.m17318p(message);
        return oVar;
    }

    /* renamed from: d */
    private List<C8999o> m17686d(Deque<C8999o> deque) {
        return new ArrayList(deque);
    }

    /* renamed from: a */
    Deque<C8999o> m17689a(Throwable th2) {
        Thread thread;
        C8985h hVar;
        boolean z;
        ArrayDeque arrayDeque = new ArrayDeque();
        HashSet hashSet = new HashSet();
        while (th2 != null && hashSet.add(th2)) {
            if (th2 instanceof C8858a) {
                C8858a aVar = (C8858a) th2;
                C8985h a = aVar.m17862a();
                Throwable c = aVar.m17860c();
                thread = aVar.m17861b();
                z = aVar.m17859d();
                th2 = c;
                hVar = a;
            } else {
                thread = Thread.currentThread();
                z = false;
                hVar = null;
            }
            arrayDeque.addFirst(m17688b(th2, hVar, thread, z));
            th2 = th2.getCause();
        }
        return arrayDeque;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public List<C8999o> m17687c(Throwable th2) {
        return m17686d(m17689a(th2));
    }
}
