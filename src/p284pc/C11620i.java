package p284pc;

import mc.AbstractC10588g;
import mc.C10581b;
import mc.C10582c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: pc.i */
/* loaded from: classes3.dex */
public class C11620i implements AbstractC10588g {

    /* renamed from: a */
    private boolean f25901a = false;

    /* renamed from: b */
    private boolean f25902b = false;

    /* renamed from: c */
    private C10582c f25903c;

    /* renamed from: d */
    private final C11615f f25904d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11620i(C11615f fVar) {
        this.f25904d = fVar;
    }

    /* renamed from: a */
    private void m9235a() {
        if (!this.f25901a) {
            this.f25901a = true;
            return;
        }
        throw new C10581b("Cannot encode a second value in the ValueEncoderContext");
    }

    @Override // mc.AbstractC10588g
    /* renamed from: b */
    public AbstractC10588g mo9234b(String str) {
        m9235a();
        this.f25904d.m9260g(this.f25903c, str, this.f25902b);
        return this;
    }

    @Override // mc.AbstractC10588g
    /* renamed from: c */
    public AbstractC10588g mo9233c(boolean z) {
        m9235a();
        this.f25904d.m9255l(this.f25903c, z, this.f25902b);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m9232d(C10582c cVar, boolean z) {
        this.f25901a = false;
        this.f25903c = cVar;
        this.f25902b = z;
    }
}
