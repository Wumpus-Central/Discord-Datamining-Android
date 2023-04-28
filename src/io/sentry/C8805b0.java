package io.sentry;

import io.sentry.protocol.C9001p;
import io.sentry.protocol.C9015w;

/* renamed from: io.sentry.b0 */
/* loaded from: classes8.dex */
public final class C8805b0 implements AbstractC8861f0 {

    /* renamed from: a */
    private static final C8805b0 f19463a = new C8805b0();

    private C8805b0() {
    }

    /* renamed from: a */
    public static C8805b0 m18042a() {
        return f19463a;
    }

    @Override // io.sentry.AbstractC8861f0
    public void close() {
        C8915k2.m17705i();
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: d */
    public void mo17834d(long j) {
        C8915k2.m17702l(j);
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: e */
    public /* synthetic */ void mo17833e(C8843d dVar) {
        C8852e0.m17871a(this, dVar);
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: f */
    public C9001p mo17832f(C9025q2 q2Var, C9116v vVar) {
        return C8915k2.m17701m().mo17832f(q2Var, vVar);
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: g */
    public C9001p mo17831g(C9015w wVar, C8918k4 k4Var, C9116v vVar) {
        return C8915k2.m17701m().mo17831g(wVar, k4Var, vVar);
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: h */
    public void mo17830h(C8843d dVar, C9116v vVar) {
        C8915k2.m17711c(dVar, vVar);
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: i */
    public void mo17829i(AbstractC8807b2 b2Var) {
        C8915k2.m17704j(b2Var);
    }

    @Override // io.sentry.AbstractC8861f0
    public boolean isEnabled() {
        return C8915k2.m17696r();
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: j */
    public AbstractC8932m0 mo17828j(C8944n4 n4Var, C8860f fVar, boolean z) {
        return C8915k2.m17693u(n4Var, fVar, z);
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: k */
    public void mo17827k(Throwable th2, ISpan iSpan, String str) {
        C8915k2.m17701m().mo17827k(th2, iSpan, str);
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: l */
    public C8951o3 mo17826l() {
        return C8915k2.m17701m().mo17826l();
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: m */
    public C9001p mo17825m(String str, EnumC8942n3 n3Var) {
        return C8915k2.m17706h(str, n3Var);
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: n */
    public /* synthetic */ AbstractC8932m0 mo17824n(String str, String str2, C8860f fVar) {
        return C8852e0.m17867e(this, str, str2, fVar);
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: o */
    public void mo17823o() {
        C8915k2.m17703k();
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: p */
    public /* synthetic */ C9001p mo17822p(C9025q2 q2Var) {
        return C8852e0.m17870b(this, q2Var);
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: q */
    public C9001p mo17821q(C8908j3 j3Var, C9116v vVar) {
        return C8915k2.m17709e(j3Var, vVar);
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: r */
    public /* synthetic */ AbstractC8932m0 mo17820r(String str, String str2) {
        return C8852e0.m17868d(this, str, str2);
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: s */
    public AbstractC8932m0 mo17819s(C8944n4 n4Var, C8965p4 p4Var) {
        return C8915k2.m17692v(n4Var, p4Var);
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: t */
    public Boolean mo17818t() {
        return C8915k2.m17697q();
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: u */
    public void mo17817u(AbstractC8807b2 b2Var) {
        C8915k2.m17690x(b2Var);
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
        return C8915k2.m17707g(th2, vVar);
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: y */
    public void mo17813y() {
        C8915k2.m17694t();
    }

    @Override // io.sentry.AbstractC8861f0
    public AbstractC8861f0 clone() {
        return C8915k2.m17701m().clone();
    }
}
