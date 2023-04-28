package p312r3;

import p312r3.AbstractC12373c;

/* renamed from: r3.b */
/* loaded from: classes7.dex */
public class C12371b implements AbstractC12383g {

    /* renamed from: r3.b$a */
    /* loaded from: classes7.dex */
    class C12372a implements AbstractC12382f {
        C12372a() {
        }

        /* renamed from: b */
        public int compare(AbstractC12373c.AbstractC12374a aVar, AbstractC12373c.AbstractC12374a aVar2) {
            long a = aVar.mo7038a();
            long a2 = aVar2.mo7038a();
            if (a < a2) {
                return -1;
            }
            if (a2 == a) {
                return 0;
            }
            return 1;
        }
    }

    @Override // p312r3.AbstractC12383g
    public AbstractC12382f get() {
        return new C12372a();
    }
}
