package p180jg;

import fi.AbstractC7267g0;
import fi.C7322s1;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import p158ig.C8430h0;
import p158ig.C8503p0;
import p217lg.AbstractC10420h;
import p268og.AbstractC11301b;
import p268og.AbstractC11313e;
import p268og.AbstractC11326h;
import p268og.AbstractC11335j1;
import p268og.AbstractC11342k1;
import p268og.AbstractC11343l;
import p268og.AbstractC11346m;
import p268og.AbstractC11388u0;
import p268og.AbstractC11396x0;
import p325rh.C12665g;
import p388vh.C13508c;

@Metadata(m15074d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a6\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000\u001a\f\u0010\b\u001a\u00020\u0005*\u00020\u0003H\u0002\u001a\u0018\u0010\u000b\u001a\u00020\n*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\f\u001a\u00020\n*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u0012\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t*\u00020\rH\u0000\u001a\u0014\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t*\u0004\u0018\u00010\u000fH\u0000\u001a\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u0004\u0018\u00010\u00112\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\"\u001a\u0010\u0015\u001a\u0004\u0018\u00010\r*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m15073d2 = {"Ljava/lang/reflect/Member;", "M", "Ljg/e;", "Log/b;", "descriptor", "", "isDefault", "b", "g", "Ljava/lang/Class;", "Ljava/lang/reflect/Method;", "f", "d", "Lfi/g0;", "h", "Log/m;", "i", "", "a", "getExpectedReceiverType", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;)Lorg/jetbrains/kotlin/types/KotlinType;", "expectedReceiverType", "kotlin-reflection"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: jg.i */
/* loaded from: classes8.dex */
public final class C9602i {
    /* renamed from: a */
    public static final Object m15944a(Object obj, AbstractC11301b descriptor) {
        Class<?> h;
        Method f;
        C9971q.m14633g(descriptor, "descriptor");
        if ((descriptor instanceof AbstractC11388u0) && C12665g.m6024d((AbstractC11342k1) descriptor)) {
            return obj;
        }
        AbstractC7267g0 e = m15940e(descriptor);
        if (e == null || (h = m15937h(e)) == null || (f = m15939f(h, descriptor)) == null) {
            return obj;
        }
        return f.invoke(obj, new Object[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static final <M extends Member> AbstractC9579e<M> m15943b(AbstractC9579e<? extends M> eVar, AbstractC11301b descriptor, boolean z) {
        boolean z2;
        boolean z3;
        C9971q.m14633g(eVar, "<this>");
        C9971q.m14633g(descriptor, "descriptor");
        boolean z4 = true;
        if (!C12665g.m6027a(descriptor)) {
            List<AbstractC11335j1> i = descriptor.mo6242i();
            C9971q.m14634f(i, "descriptor.valueParameters");
            if (!(i instanceof Collection) || !i.isEmpty()) {
                for (AbstractC11335j1 j1Var : i) {
                    AbstractC7267g0 type = j1Var.getType();
                    C9971q.m14634f(type, "it.type");
                    if (C12665g.m6025c(type)) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            if (!z2) {
                AbstractC7267g0 returnType = descriptor.getReturnType();
                if (returnType == null || !C12665g.m6025c(returnType)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (!z3 && ((eVar instanceof AbstractC9578d) || !m15938g(descriptor))) {
                    z4 = false;
                }
            }
        }
        if (z4) {
            return new C9600h(descriptor, eVar, z);
        }
        return eVar;
    }

    /* renamed from: c */
    public static /* synthetic */ AbstractC9579e m15942c(AbstractC9579e eVar, AbstractC11301b bVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m15943b(eVar, bVar, z);
    }

    /* renamed from: d */
    public static final Method m15941d(Class<?> cls, AbstractC11301b descriptor) {
        C9971q.m14633g(cls, "<this>");
        C9971q.m14633g(descriptor, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("box-impl", m15939f(cls, descriptor).getReturnType());
            C9971q.m14634f(declaredMethod, "{\n        getDeclaredMet…riptor).returnType)\n    }");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new C8430h0("No box method found in inline class: " + cls + " (calling " + descriptor + ')');
        }
    }

    /* renamed from: e */
    private static final AbstractC7267g0 m15940e(AbstractC11301b bVar) {
        AbstractC11313e eVar;
        AbstractC11396x0 M = bVar.mo6264M();
        AbstractC11396x0 J = bVar.mo6266J();
        if (M != null) {
            return M.getType();
        }
        if (J != null) {
            if (bVar instanceof AbstractC11343l) {
                return J.getType();
            }
            AbstractC11346m b = bVar.mo6104b();
            if (b instanceof AbstractC11313e) {
                eVar = (AbstractC11313e) b;
            } else {
                eVar = null;
            }
            if (eVar != null) {
                return eVar.mo6166p();
            }
        }
        return null;
    }

    /* renamed from: f */
    public static final Method m15939f(Class<?> cls, AbstractC11301b descriptor) {
        C9971q.m14633g(cls, "<this>");
        C9971q.m14633g(descriptor, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", new Class[0]);
            C9971q.m14634f(declaredMethod, "{\n        getDeclaredMet…LINE_CLASS_MEMBERS)\n    }");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new C8430h0("No unbox method found in inline class: " + cls + " (calling " + descriptor + ')');
        }
    }

    /* renamed from: g */
    private static final boolean m15938g(AbstractC11301b bVar) {
        AbstractC7267g0 e = m15940e(bVar);
        return e != null && C12665g.m6025c(e);
    }

    /* renamed from: h */
    public static final Class<?> m15937h(AbstractC7267g0 g0Var) {
        C9971q.m14633g(g0Var, "<this>");
        Class<?> i = m15936i(g0Var.mo5172N0().mo4565p());
        if (i == null) {
            return null;
        }
        if (!C7322s1.m22935l(g0Var)) {
            return i;
        }
        AbstractC7267g0 e = C12665g.m6023e(g0Var);
        if (e != null && !C7322s1.m22935l(e) && !AbstractC10420h.m13368r0(e)) {
            return i;
        }
        return null;
    }

    /* renamed from: i */
    public static final Class<?> m15936i(AbstractC11346m mVar) {
        if (!(mVar instanceof AbstractC11313e) || !C12665g.m6026b(mVar)) {
            return null;
        }
        AbstractC11313e eVar = (AbstractC11313e) mVar;
        Class<?> p = C8503p0.m19644p(eVar);
        if (p != null) {
            return p;
        }
        throw new C8430h0("Class object for the class " + eVar.getName() + " cannot be found (classId=" + C13508c.m3530k((AbstractC11326h) mVar) + ')');
    }
}
