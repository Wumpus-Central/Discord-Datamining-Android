package p366ub;

import android.graphics.Typeface;

/* renamed from: ub.a */
/* loaded from: classes3.dex */
public final class C13240a extends AbstractC13247f {

    /* renamed from: a */
    private final Typeface f29716a;

    /* renamed from: b */
    private final AbstractC0430a f29717b;

    /* renamed from: c */
    private boolean f29718c;

    /* renamed from: ub.a$a */
    /* loaded from: classes3.dex */
    public interface AbstractC0430a {
        /* renamed from: a */
        void mo4247a(Typeface typeface);
    }

    public C13240a(AbstractC0430a aVar, Typeface typeface) {
        this.f29716a = typeface;
        this.f29717b = aVar;
    }

    /* renamed from: d */
    private void m4248d(Typeface typeface) {
        if (!this.f29718c) {
            this.f29717b.mo4247a(typeface);
        }
    }

    @Override // p366ub.AbstractC13247f
    /* renamed from: a */
    public void mo4214a(int i) {
        m4248d(this.f29716a);
    }

    @Override // p366ub.AbstractC13247f
    /* renamed from: b */
    public void mo4213b(Typeface typeface, boolean z) {
        m4248d(typeface);
    }

    /* renamed from: c */
    public void m4249c() {
        this.f29718c = true;
    }
}
