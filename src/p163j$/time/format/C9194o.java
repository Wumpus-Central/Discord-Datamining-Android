package p163j$.time.format;

import p163j$.time.AbstractC9209m;
import p163j$.time.temporal.AbstractC9226n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.o */
/* loaded from: classes2.dex */
public final class C9194o implements AbstractC9186g {

    /* renamed from: a */
    private final AbstractC9226n f20182a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9194o(C9180a aVar) {
        this.f20182a = aVar;
    }

    @Override // p163j$.time.format.AbstractC9186g
    /* renamed from: a */
    public final boolean mo16712a(C9197r rVar, StringBuilder sb2) {
        AbstractC9209m mVar = (AbstractC9209m) rVar.m16687f(this.f20182a);
        if (mVar == null) {
            return false;
        }
        sb2.append(mVar.mo16661f());
        return true;
    }

    public final String toString() {
        return "ZoneRegionId()";
    }
}
