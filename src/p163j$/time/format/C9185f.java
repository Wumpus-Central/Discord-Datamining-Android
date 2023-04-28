package p163j$.time.format;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.f */
/* loaded from: classes2.dex */
public final class C9185f implements AbstractC9186g {

    /* renamed from: a */
    private final AbstractC9186g[] f20160a;

    /* renamed from: b */
    private final boolean f20161b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9185f(ArrayList arrayList, boolean z) {
        this((AbstractC9186g[]) arrayList.toArray(new AbstractC9186g[arrayList.size()]), z);
    }

    C9185f(AbstractC9186g[] gVarArr, boolean z) {
        this.f20160a = gVarArr;
        this.f20161b = z;
    }

    @Override // p163j$.time.format.AbstractC9186g
    /* renamed from: a */
    public final boolean mo16712a(C9197r rVar, StringBuilder sb2) {
        int length = sb2.length();
        boolean z = this.f20161b;
        if (z) {
            rVar.m16686g();
        }
        try {
            for (AbstractC9186g gVar : this.f20160a) {
                if (!gVar.mo16712a(rVar, sb2)) {
                    sb2.setLength(length);
                    return true;
                }
            }
            if (z) {
                rVar.m16692a();
            }
            return true;
        } finally {
            if (z) {
                rVar.m16692a();
            }
        }
    }

    /* renamed from: b */
    public final C9185f m16716b() {
        return !this.f20161b ? this : new C9185f(this.f20160a, false);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        AbstractC9186g[] gVarArr = this.f20160a;
        if (gVarArr != null) {
            boolean z = this.f20161b;
            sb2.append(z ? "[" : "(");
            for (AbstractC9186g gVar : gVarArr) {
                sb2.append(gVar);
            }
            sb2.append(z ? "]" : ")");
        }
        return sb2.toString();
    }
}
