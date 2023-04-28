package io.sentry;

import java.io.StringReader;
import java.nio.charset.Charset;

/* renamed from: io.sentry.n */
/* loaded from: classes8.dex */
public final class C8938n implements AbstractC8811c0 {

    /* renamed from: b */
    private static final Charset f19646b = Charset.forName("UTF-8");

    /* renamed from: a */
    private final AbstractC8924l0 f19647a;

    public C8938n(AbstractC8924l0 l0Var) {
        this.f19647a = l0Var;
    }

    /* renamed from: b */
    private C9032r2 m17596b(byte[] bArr, int i, int i2) {
        return (C9032r2) this.f19647a.mo17605c(new StringReader(new String(bArr, i, i2, f19646b)), C9032r2.class);
    }

    /* renamed from: c */
    private C8897i3 m17595c(byte[] bArr, int i, int i2) {
        return (C8897i3) this.f19647a.mo17605c(new StringReader(new String(bArr, i, i2, f19646b)), C8897i3.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e2, code lost:
        throw new java.lang.IllegalArgumentException("Item header at index '" + r2.size() + "' is null or empty.");
     */
    @Override // io.sentry.AbstractC8811c0
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public io.sentry.C9025q2 mo17597a(java.io.InputStream r11) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.C8938n.mo17597a(java.io.InputStream):io.sentry.q2");
    }
}
