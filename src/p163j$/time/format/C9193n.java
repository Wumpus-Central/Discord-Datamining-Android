package p163j$.time.format;

import p163j$.time.chrono.AbstractC9175g;
import p163j$.time.chrono.C9176h;
import p163j$.time.temporal.AbstractC9222j;
import p163j$.time.temporal.AbstractC9224l;
import p163j$.time.temporal.EnumC9213a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.n */
/* loaded from: classes2.dex */
public final class C9193n implements AbstractC9186g {

    /* renamed from: a */
    private final AbstractC9224l f20178a;

    /* renamed from: b */
    private final EnumC9202w f20179b;

    /* renamed from: c */
    private final C9181b f20180c;

    /* renamed from: d */
    private volatile C9189j f20181d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9193n(EnumC9213a aVar, EnumC9202w wVar, C9181b bVar) {
        this.f20178a = aVar;
        this.f20179b = wVar;
        this.f20180c = bVar;
    }

    @Override // p163j$.time.format.AbstractC9186g
    /* renamed from: a */
    public final boolean mo16712a(C9197r rVar, StringBuilder sb2) {
        String str;
        C9176h hVar;
        Long e = rVar.m16688e(this.f20178a);
        if (e == null) {
            return false;
        }
        AbstractC9175g gVar = (AbstractC9175g) rVar.m16689d().mo16632d(AbstractC9222j.m16642d());
        if (gVar == null || gVar == (hVar = C9176h.f20141a)) {
            C9181b bVar = this.f20180c;
            long longValue = e.longValue();
            EnumC9202w wVar = this.f20179b;
            rVar.m16690c();
            str = bVar.f20157a.m16685a(longValue, wVar);
        } else {
            C9181b bVar2 = this.f20180c;
            AbstractC9224l lVar = this.f20178a;
            long longValue2 = e.longValue();
            EnumC9202w wVar2 = this.f20179b;
            rVar.m16690c();
            bVar2.getClass();
            str = (gVar == hVar || !(lVar instanceof EnumC9213a)) ? bVar2.f20157a.m16685a(longValue2, wVar2) : null;
        }
        if (str == null) {
            if (this.f20181d == null) {
                this.f20181d = new C9189j(this.f20178a, 1, 19, EnumC9201v.NORMAL);
            }
            return this.f20181d.mo16712a(rVar, sb2);
        }
        sb2.append(str);
        return true;
    }

    public final String toString() {
        EnumC9202w wVar = EnumC9202w.FULL;
        AbstractC9224l lVar = this.f20178a;
        EnumC9202w wVar2 = this.f20179b;
        if (wVar2 == wVar) {
            return "Text(" + lVar + ")";
        }
        return "Text(" + lVar + "," + wVar2 + ")";
    }
}
