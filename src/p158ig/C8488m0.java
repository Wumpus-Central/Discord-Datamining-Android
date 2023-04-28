package p158ig;

import gh.C7648w;
import java.lang.reflect.Method;
import kh.C9877e;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import mh.AbstractC10609d;
import mh.C10619i;
import ng.C11102a;
import ng.C11105c;
import p069dh.AbstractC6462a;
import p070di.AbstractC6465b;
import p070di.C6505j;
import p086eh.AbstractC6900l;
import p158ig.AbstractC8434j;
import p158ig.AbstractC8447k;
import p159ih.C8547d;
import p159ih.C8568i;
import p159ih.C8581n;
import p217lg.C10434k;
import p217lg.EnumC10426i;
import p218lh.C10440a;
import p249nh.C11136b;
import p249nh.C11137c;
import p268og.AbstractC11299a1;
import p268og.AbstractC11301b;
import p268og.AbstractC11346m;
import p268og.AbstractC11388u0;
import p268og.AbstractC11390v0;
import p268og.AbstractC11392w0;
import p268og.AbstractC11397y;
import p325rh.C12659d;
import p325rh.C12661e;
import p325rh.C12665g;
import p388vh.C13508c;
import p407wh.EnumC13886e;
import p427xg.C14106a0;
import p427xg.C14126h0;
import p467zg.C14647b;
import p467zg.C14650e;
import p467zg.C14654f;
import ph.AbstractC11702i;
import ph.AbstractC11724q;
import ug.C13283d;
import ug.C13294l;
import ug.C13305o;
import ug.C13308r;
import ug.C13311u;

@Metadata(m15074d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0002J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eJ\u0012\u0010\u0015\u001a\u00020\u00142\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u0018*\u0006\u0012\u0002\b\u00030\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m15073d2 = {"Lig/m0;", "", "Log/y;", "descriptor", "", "b", "Lig/j$e;", "d", "Log/b;", "", "e", "possiblySubstitutedFunction", "Lig/j;", "g", "Log/u0;", "possiblyOverriddenProperty", "Lig/k;", "f", "Ljava/lang/Class;", "klass", "Lnh/b;", "c", "Lnh/b;", "JAVA_LANG_VOID", "Llg/i;", "getPrimitiveType", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/builtins/PrimitiveType;", "primitiveType", "<init>", "()V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: ig.m0 */
/* loaded from: classes8.dex */
public final class C8488m0 {

    /* renamed from: a */
    public static final C8488m0 f18475a = new C8488m0();

    /* renamed from: b */
    private static final C11136b f18476b;

    static {
        C11136b m = C11136b.m10805m(new C11137c("java.lang.Void"));
        C9971q.m14634f(m, "topLevel(FqName(\"java.lang.Void\"))");
        f18476b = m;
    }

    private C8488m0() {
    }

    /* renamed from: a */
    private final EnumC10426i m19696a(Class<?> cls) {
        if (cls.isPrimitive()) {
            return EnumC13886e.m2394b(cls.getSimpleName()).m2390f();
        }
        return null;
    }

    /* renamed from: b */
    private final boolean m19695b(AbstractC11397y yVar) {
        if (C12659d.m6069p(yVar) || C12659d.m6068q(yVar)) {
            return true;
        }
        if (!C9971q.m14638b(yVar.getName(), C11102a.f24622e.m10913a()) || !yVar.mo6242i().isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private final AbstractC8434j.C8441e m19693d(AbstractC11397y yVar) {
        return new AbstractC8434j.C8441e(new AbstractC10609d.C10611b(m19692e(yVar), C7648w.m21803c(yVar, false, false, 1, null)));
    }

    /* renamed from: e */
    private final String m19692e(AbstractC11301b bVar) {
        String b = C14126h0.m1579b(bVar);
        if (b != null) {
            return b;
        }
        if (bVar instanceof AbstractC11390v0) {
            String b2 = C13508c.m3522s(bVar).getName().m10771b();
            C9971q.m14634f(b2, "descriptor.propertyIfAccessor.name.asString()");
            return C14106a0.m1649b(b2);
        } else if (bVar instanceof AbstractC11392w0) {
            String b3 = C13508c.m3522s(bVar).getName().m10771b();
            C9971q.m14634f(b3, "descriptor.propertyIfAccessor.name.asString()");
            return C14106a0.m1646e(b3);
        } else {
            String b4 = bVar.getName().m10771b();
            C9971q.m14634f(b4, "descriptor.name.asString()");
            return b4;
        }
    }

    /* renamed from: c */
    public final C11136b m19694c(Class<?> klass) {
        C9971q.m14633g(klass, "klass");
        if (klass.isArray()) {
            Class<?> componentType = klass.getComponentType();
            C9971q.m14634f(componentType, "klass.componentType");
            EnumC10426i a = m19696a(componentType);
            if (a != null) {
                return new C11136b(C10434k.f22894u, a.m13345c());
            }
            C11136b m = C11136b.m10805m(C10434k.C10435a.f22916i.m10782l());
            C9971q.m14634f(m, "topLevel(StandardNames.FqNames.array.toSafe())");
            return m;
        } else if (C9971q.m14638b(klass, Void.TYPE)) {
            return f18476b;
        } else {
            EnumC10426i a2 = m19696a(klass);
            if (a2 != null) {
                return new C11136b(C10434k.f22894u, a2.m13343e());
            }
            C11136b a3 = C13283d.m4053a(klass);
            if (!a3.m10807k()) {
                C11105c cVar = C11105c.f24626a;
                C11137c b = a3.m10816b();
                C9971q.m14634f(b, "classId.asSingleFqName()");
                C11136b m2 = cVar.m10897m(b);
                if (m2 != null) {
                    return m2;
                }
            }
            return a3;
        }
    }

    /* renamed from: f */
    public final AbstractC8447k m19691f(AbstractC11388u0 possiblyOverriddenProperty) {
        AbstractC6462a aVar;
        AbstractC6900l lVar;
        AbstractC11299a1 a1Var;
        AbstractC6462a aVar2;
        AbstractC6900l lVar2;
        C13311u uVar;
        C9971q.m14633g(possiblyOverriddenProperty, "possiblyOverriddenProperty");
        AbstractC11388u0 a = ((AbstractC11388u0) C12661e.m6055L(possiblyOverriddenProperty)).mo6162a();
        C9971q.m14634f(a, "unwrapFakeOverride(possi…rriddenProperty).original");
        AbstractC8434j.C8441e eVar = null;
        Method method = null;
        if (a instanceof C6505j) {
            C6505j jVar = (C6505j) a;
            C8581n f1 = jVar.mo25408c0();
            AbstractC11702i.C11709f<C8581n, C10440a.C10444d> propertySignature = C10440a.f22978d;
            C9971q.m14634f(propertySignature, "propertySignature");
            C10440a.C10444d dVar = (C10440a.C10444d) C9877e.m15132a(f1, propertySignature);
            if (dVar != null) {
                return new AbstractC8447k.C8450c(a, f1, dVar, jVar.mo25404F(), jVar.mo25405C());
            }
        } else if (a instanceof C14654f) {
            AbstractC11299a1 j = ((C14654f) a).mo6102j();
            if (j instanceof AbstractC6462a) {
                aVar = (AbstractC6462a) j;
            } else {
                aVar = null;
            }
            if (aVar != null) {
                lVar = aVar.mo4611c();
            } else {
                lVar = null;
            }
            if (lVar instanceof C13308r) {
                return new AbstractC8447k.C8448a(((C13308r) lVar).mo3969Q());
            }
            if (lVar instanceof C13311u) {
                Method S = ((C13311u) lVar).mo3969Q();
                AbstractC11392w0 h = a.mo6436h();
                if (h != null) {
                    a1Var = h.mo6102j();
                } else {
                    a1Var = null;
                }
                if (a1Var instanceof AbstractC6462a) {
                    aVar2 = (AbstractC6462a) a1Var;
                } else {
                    aVar2 = null;
                }
                if (aVar2 != null) {
                    lVar2 = aVar2.mo4611c();
                } else {
                    lVar2 = null;
                }
                if (lVar2 instanceof C13311u) {
                    uVar = (C13311u) lVar2;
                } else {
                    uVar = null;
                }
                if (uVar != null) {
                    method = uVar.mo3969Q();
                }
                return new AbstractC8447k.C8449b(S, method);
            }
            throw new C8430h0("Incorrect resolution sequence for Java field " + a + " (source = " + lVar + ')');
        }
        AbstractC11390v0 f = a.mo6437f();
        C9971q.m14636d(f);
        AbstractC8434j.C8441e d = m19693d(f);
        AbstractC11392w0 h2 = a.mo6436h();
        if (h2 != null) {
            eVar = m19693d(h2);
        }
        return new AbstractC8447k.C8451d(d, eVar);
    }

    /* renamed from: g */
    public final AbstractC8434j m19690g(AbstractC11397y possiblySubstitutedFunction) {
        AbstractC6462a aVar;
        AbstractC6462a aVar2;
        AbstractC6900l lVar;
        Method S;
        AbstractC10609d.C10611b b;
        AbstractC10609d.C10611b e;
        C9971q.m14633g(possiblySubstitutedFunction, "possiblySubstitutedFunction");
        AbstractC11397y a = ((AbstractC11397y) C12661e.m6055L(possiblySubstitutedFunction)).mo6162a();
        C9971q.m14634f(a, "unwrapFakeOverride(possi…titutedFunction).original");
        if (a instanceof AbstractC6465b) {
            AbstractC6465b bVar = (AbstractC6465b) a;
            AbstractC11724q c0 = bVar.mo25408c0();
            if ((c0 instanceof C8568i) && (e = C10619i.f23511a.m12724e((C8568i) c0, bVar.mo25404F(), bVar.mo25405C())) != null) {
                return new AbstractC8434j.C8441e(e);
            }
            if (!(c0 instanceof C8547d) || (b = C10619i.f23511a.m12727b((C8547d) c0, bVar.mo25404F(), bVar.mo25405C())) == null) {
                return m19693d(a);
            }
            AbstractC11346m b2 = possiblySubstitutedFunction.mo6104b();
            C9971q.m14634f(b2, "possiblySubstitutedFunction.containingDeclaration");
            if (C12665g.m6026b(b2)) {
                return new AbstractC8434j.C8441e(b);
            }
            return new AbstractC8434j.C8440d(b);
        }
        AbstractC6900l lVar2 = null;
        C13311u uVar = null;
        if (a instanceof C14650e) {
            AbstractC11299a1 j = ((C14650e) a).mo6102j();
            if (j instanceof AbstractC6462a) {
                aVar2 = (AbstractC6462a) j;
            } else {
                aVar2 = null;
            }
            if (aVar2 != null) {
                lVar = aVar2.mo4611c();
            } else {
                lVar = null;
            }
            if (lVar instanceof C13311u) {
                uVar = (C13311u) lVar;
            }
            if (uVar != null && (S = uVar.mo3969Q()) != null) {
                return new AbstractC8434j.C8439c(S);
            }
            throw new C8430h0("Incorrect resolution sequence for Java method " + a);
        } else if (a instanceof C14647b) {
            AbstractC11299a1 j2 = ((C14647b) a).mo6102j();
            if (j2 instanceof AbstractC6462a) {
                aVar = (AbstractC6462a) j2;
            } else {
                aVar = null;
            }
            if (aVar != null) {
                lVar2 = aVar.mo4611c();
            }
            if (lVar2 instanceof C13305o) {
                return new AbstractC8434j.C8437b(((C13305o) lVar2).mo3969Q());
            }
            if (lVar2 instanceof C13294l) {
                C13294l lVar3 = (C13294l) lVar2;
                if (lVar3.mo4012q()) {
                    return new AbstractC8434j.C8435a(lVar3.mo3981b());
                }
            }
            throw new C8430h0("Incorrect resolution sequence for Java constructor " + a + " (" + lVar2 + ')');
        } else if (m19695b(a)) {
            return m19693d(a);
        } else {
            throw new C8430h0("Unknown origin of " + a + " (" + a.getClass() + ')');
        }
    }
}
