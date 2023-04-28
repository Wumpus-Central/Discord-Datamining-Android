package sd;

import p137hd.C7996a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: sd.i */
/* loaded from: classes3.dex */
public abstract class AbstractC12870i extends AbstractC12869h {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC12870i(C7996a aVar) {
        super(aVar);
    }

    /* renamed from: h */
    protected abstract void mo5241h(StringBuilder sb2, int i);

    /* renamed from: i */
    protected abstract int mo5240i(int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public final void m5239j(StringBuilder sb2, int i, int i2) {
        int f = m5237b().m5206f(i, i2);
        mo5241h(sb2, f);
        int i3 = mo5240i(f);
        int i4 = 100000;
        for (int i5 = 0; i5 < 5; i5++) {
            if (i3 / i4 == 0) {
                sb2.append('0');
            }
            i4 /= 10;
        }
        sb2.append(i3);
    }
}
