package sd;

import p066dd.C6441j;
import p137hd.C7996a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: sd.d */
/* loaded from: classes3.dex */
public final class C12865d extends AbstractC12869h {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C12865d(C7996a aVar) {
        super(aVar);
    }

    @Override // sd.AbstractC12871j
    /* renamed from: d */
    public String mo5235d() {
        if (m5236c().m20932j() >= 48) {
            StringBuilder sb2 = new StringBuilder();
            m5243f(sb2, 8);
            int f = m5237b().m5206f(48, 2);
            sb2.append("(393");
            sb2.append(f);
            sb2.append(')');
            int f2 = m5237b().m5206f(50, 10);
            if (f2 / 100 == 0) {
                sb2.append('0');
            }
            if (f2 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(f2);
            sb2.append(m5237b().m5209c(60, null).m5222b());
            return sb2.toString();
        }
        throw C6441j.m25551a();
    }
}
