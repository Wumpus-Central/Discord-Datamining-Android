package p250nj;

import java.util.Locale;
import java.util.Set;
import net.time4j.C10892f0;
import net.time4j.history.C10929d;
import net.time4j.history.C10934h;
import net.time4j.history.EnumC10937j;
import p143hj.AbstractC8046c;
import p143hj.AbstractC8048d;
import p143hj.AbstractC8079p;
import p143hj.AbstractC8080q;
import p143hj.AbstractC8082s;
import p161ij.C8627a;
import p161ij.EnumC8637g;
import p219lj.EnumC10455a;
import p234mj.C10668a;
import p234mj.C10671c;

/* renamed from: nj.b */
/* loaded from: classes8.dex */
public class C11152b implements AbstractC8082s {
    /* renamed from: e */
    private static C10929d m10712e(Locale locale, AbstractC8048d dVar) {
        AbstractC8046c<String> cVar = C8627a.f19053b;
        if (((String) dVar.mo15674c(cVar, "iso8601")).equals("julian")) {
            return C10929d.f38934B;
        }
        AbstractC8046c<C10929d> cVar2 = C10668a.f23594a;
        if (dVar.mo15676a(cVar2)) {
            return (C10929d) dVar.mo15675b(cVar2);
        }
        if (((String) dVar.mo15674c(cVar, "iso8601")).equals("historic")) {
            AbstractC8046c<String> cVar3 = C8627a.f19071t;
            if (dVar.mo15676a(cVar3)) {
                return C10929d.m11572j((String) dVar.mo15675b(cVar3));
            }
        }
        return C10929d.m11591D(locale);
    }

    @Override // p143hj.AbstractC8082s
    /* renamed from: a */
    public AbstractC8080q<?> mo10716a(AbstractC8080q<?> qVar, Locale locale, AbstractC8048d dVar) {
        return m10711f(qVar, m10712e(locale, dVar), dVar);
    }

    @Override // p143hj.AbstractC8082s
    /* renamed from: b */
    public Set<AbstractC8079p<?>> mo10715b(Locale locale, AbstractC8048d dVar) {
        return m10712e(locale, dVar).m11567o();
    }

    @Override // p143hj.AbstractC8082s
    /* renamed from: c */
    public boolean mo10714c(Class<?> cls) {
        return cls == C10892f0.class;
    }

    @Override // p143hj.AbstractC8082s
    /* renamed from: d */
    public boolean mo10713d(AbstractC8079p<?> pVar) {
        return pVar instanceof C10671c;
    }

    /* renamed from: f */
    public AbstractC8080q<?> m10711f(AbstractC8080q<?> qVar, C10929d dVar, AbstractC8048d dVar2) {
        EnumC10937j jVar;
        EnumC10937j jVar2;
        if (qVar.mo11377e(dVar.m11573i())) {
            jVar2 = (EnumC10937j) qVar.mo11371r(dVar.m11573i());
        } else if (((EnumC8637g) dVar2.mo15674c(C8627a.f19057f, EnumC8637g.SMART)).m18443a()) {
            jVar2 = EnumC10937j.AD;
        } else {
            jVar = null;
            if (jVar == null && qVar.mo11377e(dVar.m11582M())) {
                int s = qVar.mo11370s(dVar.m11582M());
                if (qVar.mo11377e(dVar.m11592C()) && qVar.mo11377e(dVar.m11575g())) {
                    C10892f0 d = dVar.m11578d(C10934h.m11539h(jVar, s, qVar.mo11370s(dVar.m11592C()), qVar.mo11370s(dVar.m11575g()), (EnumC10455a) dVar2.mo15674c(C10929d.f24251z, EnumC10455a.DUAL_DATING), dVar.m11559w()));
                    qVar.mo15654D(dVar.m11573i(), null);
                    qVar.mo15654D(dVar.m11582M(), null);
                    qVar.mo15654D(dVar.m11592C(), null);
                    qVar.mo15654D(dVar.m11575g(), null);
                    return qVar.mo15654D(C10892f0.f24173y, d);
                } else if (!qVar.mo11377e(dVar.m11574h())) {
                    return qVar;
                } else {
                    int s2 = qVar.mo11370s(dVar.m11574h());
                    AbstractC8079p<Integer> pVar = C10671c.f23605o;
                    if (qVar.mo11377e(pVar)) {
                        s = qVar.mo11370s(pVar);
                    }
                    return qVar.mo15654D(C10892f0.f24173y, (C10892f0) dVar.m11578d(dVar.m11568n(jVar, s)).mo15655B(dVar.m11574h(), s2));
                }
            }
        }
        jVar = jVar2;
        return jVar == null ? qVar : qVar;
    }
}
