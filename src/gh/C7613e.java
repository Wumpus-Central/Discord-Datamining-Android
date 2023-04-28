package gh;

import fi.AbstractC7267g0;
import fi.C7322s1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C9971q;
import p217lg.AbstractC10420h;
import p249nh.C11137c;
import p249nh.C11144h;
import p268og.AbstractC11297a;
import p268og.AbstractC11313e;
import p268og.AbstractC11343l;
import p268og.AbstractC11344l0;
import p268og.AbstractC11346m;
import p268og.AbstractC11390v0;
import p286pi.C11762d;
import p326ri.C12718u;

/* renamed from: gh.e */
/* loaded from: classes8.dex */
public final class C7613e {
    /* renamed from: a */
    public static final String m21887a(AbstractC11313e klass, AbstractC7653z<?> typeMappingConfiguration) {
        AbstractC11313e eVar;
        String C;
        C9971q.m14633g(klass, "klass");
        C9971q.m14633g(typeMappingConfiguration, "typeMappingConfiguration");
        String a = typeMappingConfiguration.mo21786a(klass);
        if (a != null) {
            return a;
        }
        AbstractC11346m b = klass.mo6104b();
        C9971q.m14634f(b, "klass.containingDeclaration");
        String d = C11144h.m10761b(klass.getName()).m10769d();
        C9971q.m14634f(d, "safeIdentifier(klass.name).identifier");
        if (b instanceof AbstractC11344l0) {
            C11137c e = ((AbstractC11344l0) b).mo6103e();
            if (e.m10801d()) {
                return d;
            }
            StringBuilder sb2 = new StringBuilder();
            String b2 = e.m10803b();
            C9971q.m14634f(b2, "fqName.asString()");
            C = C12718u.m5741C(b2, '.', '/', false, 4, null);
            sb2.append(C);
            sb2.append('/');
            sb2.append(d);
            return sb2.toString();
        }
        if (b instanceof AbstractC11313e) {
            eVar = (AbstractC11313e) b;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            String e2 = typeMappingConfiguration.mo21782e(eVar);
            if (e2 == null) {
                e2 = m21887a(eVar, typeMappingConfiguration);
            }
            return e2 + '$' + d;
        }
        throw new IllegalArgumentException("Unexpected container: " + b + " for " + klass);
    }

    /* renamed from: b */
    public static /* synthetic */ String m21886b(AbstractC11313e eVar, AbstractC7653z zVar, int i, Object obj) {
        if ((i & 2) != 0) {
            zVar = C7599a0.f16555a;
        }
        return m21887a(eVar, zVar);
    }

    /* renamed from: c */
    public static final boolean m21885c(AbstractC11297a descriptor) {
        C9971q.m14633g(descriptor, "descriptor");
        if (descriptor instanceof AbstractC11343l) {
            return true;
        }
        AbstractC7267g0 returnType = descriptor.getReturnType();
        C9971q.m14636d(returnType);
        if (AbstractC10420h.m13428B0(returnType)) {
            AbstractC7267g0 returnType2 = descriptor.getReturnType();
            C9971q.m14636d(returnType2);
            if (!C7322s1.m22935l(returnType2) && !(descriptor instanceof AbstractC11390v0)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v9, types: [T, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> T m21884d(fi.AbstractC7267g0 r8, gh.AbstractC7630n<T> r9, gh.C7604b0 r10, gh.AbstractC7653z<? extends T> r11, gh.C7623k<T> r12, kotlin.jvm.functions.Function3<? super fi.AbstractC7267g0, ? super T, ? super gh.C7604b0, kotlin.Unit> r13) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gh.C7613e.m21884d(fi.g0, gh.n, gh.b0, gh.z, gh.k, kotlin.jvm.functions.Function3):java.lang.Object");
    }

    /* renamed from: e */
    public static /* synthetic */ Object m21883e(AbstractC7267g0 g0Var, AbstractC7630n nVar, C7604b0 b0Var, AbstractC7653z zVar, C7623k kVar, Function3 function3, int i, Object obj) {
        if ((i & 32) != 0) {
            function3 = C11762d.m8671b();
        }
        return m21884d(g0Var, nVar, b0Var, zVar, kVar, function3);
    }
}
