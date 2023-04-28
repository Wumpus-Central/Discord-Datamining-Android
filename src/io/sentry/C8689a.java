package io.sentry;

import io.sentry.transport.AbstractC9080p;
import io.sentry.transport.C9065d;
import io.sentry.transport.C9090y;
import io.sentry.util.C9111k;

/* renamed from: io.sentry.a */
/* loaded from: classes8.dex */
public final class C8689a implements AbstractC8946o0 {
    @Override // io.sentry.AbstractC8946o0
    /* renamed from: a */
    public AbstractC9080p mo17210a(C8951o3 o3Var, C9155y1 y1Var) {
        C9111k.m16995a(o3Var, "options is required");
        C9111k.m16995a(y1Var, "requestDetails is required");
        return new C9065d(o3Var, new C9090y(o3Var), o3Var.getTransportGate(), y1Var);
    }
}
