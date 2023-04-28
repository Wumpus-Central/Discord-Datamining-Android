package sd;

import p137hd.C7996a;

/* renamed from: sd.b */
/* loaded from: classes3.dex */
final class C12863b extends AbstractC12867f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C12863b(C7996a aVar) {
        super(aVar);
    }

    @Override // sd.AbstractC12870i
    /* renamed from: h */
    protected void mo5241h(StringBuilder sb2, int i) {
        if (i < 10000) {
            sb2.append("(3202)");
        } else {
            sb2.append("(3203)");
        }
    }

    @Override // sd.AbstractC12870i
    /* renamed from: i */
    protected int mo5240i(int i) {
        return i < 10000 ? i : i - 10000;
    }
}
