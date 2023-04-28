package io.sentry;

import io.sentry.protocol.C9001p;
import io.sentry.protocol.C9015w;

/* renamed from: io.sentry.h1 */
/* loaded from: classes8.dex */
public final class C8877h1 implements AbstractC8861f0 {

    /* renamed from: b */
    private static final C8877h1 f19563b = new C8877h1();

    /* renamed from: a */
    private final C8951o3 f19564a = C8951o3.empty();

    private C8877h1() {
    }

    /* renamed from: a */
    public static C8877h1 m17835a() {
        return f19563b;
    }

    @Override // io.sentry.AbstractC8861f0
    public void close() {
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: d */
    public void mo17834d(long j) {
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: e */
    public /* synthetic */ void mo17833e(C8843d dVar) {
        C8852e0.m17871a(this, dVar);
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: f */
    public C9001p mo17832f(C9025q2 q2Var, C9116v vVar) {
        return C9001p.f19786l;
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: g */
    public C9001p mo17831g(C9015w wVar, C8918k4 k4Var, C9116v vVar) {
        return C9001p.f19786l;
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: h */
    public void mo17830h(C8843d dVar, C9116v vVar) {
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: i */
    public void mo17829i(AbstractC8807b2 b2Var) {
    }

    @Override // io.sentry.AbstractC8861f0
    public boolean isEnabled() {
        return false;
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: j */
    public AbstractC8932m0 mo17828j(C8944n4 n4Var, C8860f fVar, boolean z) {
        return C8947o1.m17586n();
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: k */
    public void mo17827k(Throwable th2, ISpan iSpan, String str) {
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: l */
    public C8951o3 mo17826l() {
        return this.f19564a;
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: m */
    public C9001p mo17825m(String str, EnumC8942n3 n3Var) {
        return C9001p.f19786l;
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: n */
    public /* synthetic */ AbstractC8932m0 mo17824n(String str, String str2, C8860f fVar) {
        return C8852e0.m17867e(this, str, str2, fVar);
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: o */
    public void mo17823o() {
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: p */
    public /* synthetic */ C9001p mo17822p(C9025q2 q2Var) {
        return C8852e0.m17870b(this, q2Var);
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: q */
    public C9001p mo17821q(C8908j3 j3Var, C9116v vVar) {
        return C9001p.f19786l;
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: r */
    public /* synthetic */ AbstractC8932m0 mo17820r(String str, String str2) {
        return C8852e0.m17868d(this, str, str2);
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: s */
    public AbstractC8932m0 mo17819s(C8944n4 n4Var, C8965p4 p4Var) {
        return C8947o1.m17586n();
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: t */
    public Boolean mo17818t() {
        return null;
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: u */
    public void mo17817u(AbstractC8807b2 b2Var) {
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: v */
    public /* synthetic */ C9001p mo17816v(Throwable th2) {
        return C8852e0.m17869c(this, th2);
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: w */
    public /* synthetic */ AbstractC8932m0 mo17815w(String str, String str2, C8860f fVar, boolean z) {
        return C8852e0.m17866f(this, str, str2, fVar, z);
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: x */
    public C9001p mo17814x(Throwable th2, C9116v vVar) {
        return C9001p.f19786l;
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: y */
    public void mo17813y() {
    }

    @Override // io.sentry.AbstractC8861f0
    public AbstractC8861f0 clone() {
        return f19563b;
    }
}
