package io.sentry;

import io.sentry.protocol.C8997n;
import io.sentry.protocol.C9001p;
import io.sentry.util.C9111k;
import java.util.ArrayList;

/* renamed from: io.sentry.q2 */
/* loaded from: classes8.dex */
public final class C9025q2 {

    /* renamed from: a */
    private final C9032r2 f19850a;

    /* renamed from: b */
    private final Iterable<C8879h3> f19851b;

    public C9025q2(C9032r2 r2Var, Iterable<C8879h3> iterable) {
        this.f19850a = (C9032r2) C9111k.m16995a(r2Var, "SentryEnvelopeHeader is required.");
        this.f19851b = (Iterable) C9111k.m16995a(iterable, "SentryEnvelope items are required.");
    }

    /* renamed from: a */
    public static C9025q2 m17208a(AbstractC8924l0 l0Var, C9137w1 w1Var, long j, C8997n nVar) {
        C9111k.m16995a(l0Var, "Serializer is required.");
        C9111k.m16995a(w1Var, "Profiling trace data is required.");
        return new C9025q2(new C9001p(w1Var.m16891A()), nVar, C8879h3.m17780s(w1Var, j, l0Var));
    }

    /* renamed from: b */
    public static C9025q2 m17207b(AbstractC8924l0 l0Var, C9157y3 y3Var, C8997n nVar) {
        C9111k.m16995a(l0Var, "Serializer is required.");
        C9111k.m16995a(y3Var, "session is required.");
        return new C9025q2(null, nVar, C8879h3.m17779t(l0Var, y3Var));
    }

    /* renamed from: c */
    public C9032r2 m17206c() {
        return this.f19850a;
    }

    /* renamed from: d */
    public Iterable<C8879h3> m17205d() {
        return this.f19851b;
    }

    public C9025q2(C9001p pVar, C8997n nVar, C8879h3 h3Var) {
        C9111k.m16995a(h3Var, "SentryEnvelopeItem is required.");
        this.f19850a = new C9032r2(pVar, nVar);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(h3Var);
        this.f19851b = arrayList;
    }
}
