package p006a5;

import p414x3.C13925a;
import p415x4.AbstractC13928a;
import p436y4.AbstractC14224b;

/* renamed from: a5.d */
/* loaded from: classes7.dex */
public class C1269d implements AbstractC1265a {

    /* renamed from: b */
    private static final Class<?> f140b = C1269d.class;

    /* renamed from: a */
    private final int f141a;

    public C1269d() {
        this(3);
    }

    @Override // p006a5.AbstractC1265a
    /* renamed from: a */
    public void mo41495a(AbstractC1266b bVar, AbstractC14224b bVar2, AbstractC13928a aVar, int i) {
        for (int i2 = 1; i2 <= this.f141a; i2++) {
            int a = (i + i2) % aVar.mo1344a();
            if (C13925a.m2276v(2)) {
                C13925a.m2273y(f140b, "Preparing frame %d, last drawn: %d", Integer.valueOf(a), Integer.valueOf(i));
            }
            if (!bVar.mo41504a(bVar2, aVar, a)) {
                return;
            }
        }
    }

    public C1269d(int i) {
        this.f141a = i;
    }
}
