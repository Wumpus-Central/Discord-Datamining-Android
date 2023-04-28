package p311r2;

import java.util.List;
import p126h2.C7762i;
import p238n2.C10693a;
import p238n2.C10694b;
import p238n2.C10695c;
import p238n2.C10696d;
import p238n2.C10698f;
import p238n2.C10699g;
import p238n2.C10700h;
import p238n2.C10702j;
import p331s2.AbstractC12777c;
import p343t2.C12949j;
import p358u2.C13178a;

/* renamed from: r2.d */
/* loaded from: classes.dex */
public class C12328d {
    /* renamed from: a */
    private static <T> List<C13178a<T>> m7140a(AbstractC12777c cVar, float f, C7762i iVar, AbstractC12349n0<T> n0Var) {
        return C12357u.m7080a(cVar, iVar, f, n0Var, false);
    }

    /* renamed from: b */
    private static <T> List<C13178a<T>> m7139b(AbstractC12777c cVar, C7762i iVar, AbstractC12349n0<T> n0Var) {
        return C12357u.m7080a(cVar, iVar, 1.0f, n0Var, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C10693a m7138c(AbstractC12777c cVar, C7762i iVar) {
        return new C10693a(m7139b(cVar, iVar, C12334g.f27704a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C10702j m7137d(AbstractC12777c cVar, C7762i iVar) {
        return new C10702j(m7139b(cVar, iVar, C12338i.f27709a));
    }

    /* renamed from: e */
    public static C10694b m7136e(AbstractC12777c cVar, C7762i iVar) {
        return m7135f(cVar, iVar, true);
    }

    /* renamed from: f */
    public static C10694b m7135f(AbstractC12777c cVar, C7762i iVar, boolean z) {
        float f;
        if (z) {
            f = C12949j.m4967e();
        } else {
            f = 1.0f;
        }
        return new C10694b(m7140a(cVar, f, iVar, C12344l.f27726a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static C10695c m7134g(AbstractC12777c cVar, C7762i iVar, int i) {
        return new C10695c(m7139b(cVar, iVar, new C12350o(i)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static C10696d m7133h(AbstractC12777c cVar, C7762i iVar) {
        return new C10696d(m7139b(cVar, iVar, C12353r.f27739a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static C10698f m7132i(AbstractC12777c cVar, C7762i iVar) {
        return new C10698f(C12357u.m7080a(cVar, iVar, C12949j.m4967e(), C12325b0.f27694a, true));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static C10699g m7131j(AbstractC12777c cVar, C7762i iVar) {
        return new C10699g(m7139b(cVar, iVar, C12335g0.f27705a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static C10700h m7130k(AbstractC12777c cVar, C7762i iVar) {
        return new C10700h(m7140a(cVar, C12949j.m4967e(), iVar, C12337h0.f27707a));
    }
}
