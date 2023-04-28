package cd;

import java.util.Iterator;
import java.util.Set;
import p177jc.AbstractC9528e;
import p177jc.AbstractC9534h;
import p177jc.C9523d;
import p177jc.C9548q;

/* renamed from: cd.c */
/* loaded from: classes3.dex */
public class C3980c implements AbstractC3987i {

    /* renamed from: a */
    private final String f6538a;

    /* renamed from: b */
    private final C3981d f6539b;

    C3980c(Set<AbstractC3983f> set, C3981d dVar) {
        this.f6538a = m33206e(set);
        this.f6539b = dVar;
    }

    /* renamed from: c */
    public static C9523d<AbstractC3987i> m33208c() {
        return C9523d.m16092c(AbstractC3987i.class).m16077b(C9548q.m16016k(AbstractC3983f.class)).m16074e(new AbstractC9534h() { // from class: cd.b
            @Override // p177jc.AbstractC9534h
            /* renamed from: a */
            public final Object mo4207a(AbstractC9528e eVar) {
                AbstractC3987i d;
                d = C3980c.m33207d(eVar);
                return d;
            }
        }).m16075d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ AbstractC3987i m33207d(AbstractC9528e eVar) {
        return new C3980c(eVar.mo16060c(AbstractC3983f.class), C3981d.m33205a());
    }

    /* renamed from: e */
    private static String m33206e(Set<AbstractC3983f> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<AbstractC3983f> it = set.iterator();
        while (it.hasNext()) {
            AbstractC3983f next = it.next();
            sb2.append(next.mo33201b());
            sb2.append('/');
            sb2.append(next.mo33200c());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // cd.AbstractC3987i
    /* renamed from: a */
    public String mo33195a() {
        if (this.f6539b.m33204b().isEmpty()) {
            return this.f6538a;
        }
        return this.f6538a + ' ' + m33206e(this.f6539b.m33204b());
    }
}
