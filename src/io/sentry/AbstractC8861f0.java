package io.sentry;

import io.sentry.protocol.C9001p;
import io.sentry.protocol.C9015w;

/* renamed from: io.sentry.f0 */
/* loaded from: classes8.dex */
public interface AbstractC8861f0 {
    AbstractC8861f0 clone();

    void close();

    /* renamed from: d */
    void mo17834d(long j);

    /* renamed from: e */
    void mo17833e(C8843d dVar);

    /* renamed from: f */
    C9001p mo17832f(C9025q2 q2Var, C9116v vVar);

    /* renamed from: g */
    C9001p mo17831g(C9015w wVar, C8918k4 k4Var, C9116v vVar);

    /* renamed from: h */
    void mo17830h(C8843d dVar, C9116v vVar);

    /* renamed from: i */
    void mo17829i(AbstractC8807b2 b2Var);

    boolean isEnabled();

    /* renamed from: j */
    AbstractC8932m0 mo17828j(C8944n4 n4Var, C8860f fVar, boolean z);

    /* renamed from: k */
    void mo17827k(Throwable th2, ISpan iSpan, String str);

    /* renamed from: l */
    C8951o3 mo17826l();

    /* renamed from: m */
    C9001p mo17825m(String str, EnumC8942n3 n3Var);

    /* renamed from: n */
    AbstractC8932m0 mo17824n(String str, String str2, C8860f fVar);

    /* renamed from: o */
    void mo17823o();

    /* renamed from: p */
    C9001p mo17822p(C9025q2 q2Var);

    /* renamed from: q */
    C9001p mo17821q(C8908j3 j3Var, C9116v vVar);

    /* renamed from: r */
    AbstractC8932m0 mo17820r(String str, String str2);

    /* renamed from: s */
    AbstractC8932m0 mo17819s(C8944n4 n4Var, C8965p4 p4Var);

    /* renamed from: t */
    Boolean mo17818t();

    /* renamed from: u */
    void mo17817u(AbstractC8807b2 b2Var);

    /* renamed from: v */
    C9001p mo17816v(Throwable th2);

    /* renamed from: w */
    AbstractC8932m0 mo17815w(String str, String str2, C8860f fVar, boolean z);

    /* renamed from: x */
    C9001p mo17814x(Throwable th2, C9116v vVar);

    /* renamed from: y */
    void mo17813y();
}
