package p158ig;

import fi.C7322s1;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import mh.C10619i;
import p070di.C6505j;
import p158ig.AbstractC8404c0;
import p180jg.AbstractC9581f;
import p268og.AbstractC11346m;
import p268og.AbstractC11388u0;
import p325rh.C12661e;

@Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a \u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\f\u0010\u0006\u001a\u00020\u0001*\u00020\u0005H\u0002\"\"\u0010\n\u001a\u0004\u0018\u00010\u0007*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m15073d2 = {"Lig/c0$a;", "", "isGetter", "Ljg/e;", "b", "Log/u0;", "g", "", "f", "(Lig/c0$a;)Ljava/lang/Object;", "boundReceiver", "kotlin-reflection"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: ig.d0 */
/* loaded from: classes8.dex */
public final class C8416d0 {
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0118  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final p180jg.AbstractC9579e<?> m19807b(p158ig.AbstractC8404c0.AbstractC8405a<?, ?> r6, boolean r7) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p158ig.C8416d0.m19807b(ig.c0$a, boolean):jg.e");
    }

    /* renamed from: c */
    private static final AbstractC9581f<Field> m19806c(AbstractC8404c0.AbstractC8405a<?, ?> aVar, boolean z, Field field) {
        AbstractC9581f<Field> fVar;
        if (m19802g(aVar.mo19569B().mo19626x()) || !Modifier.isStatic(field.getModifiers())) {
            if (z) {
                if (!aVar.mo19625z()) {
                    return new AbstractC9581f.AbstractC0290f.c(field);
                }
                fVar = new AbstractC9581f.AbstractC0290f.a(field, m19803f(aVar));
            } else if (aVar.mo19625z()) {
                fVar = new AbstractC9581f.AbstractC9587g.C9588a(field, m19804e(aVar), m19803f(aVar));
            } else {
                fVar = new AbstractC9581f.AbstractC9587g.C9590c(field, m19804e(aVar));
            }
        } else if (m19805d(aVar)) {
            if (z) {
                if (aVar.mo19625z()) {
                    return new AbstractC9581f.AbstractC0290f.b(field);
                }
                return new AbstractC9581f.AbstractC0290f.d(field);
            } else if (aVar.mo19625z()) {
                fVar = new AbstractC9581f.AbstractC9587g.C9589b(field, m19804e(aVar));
            } else {
                fVar = new AbstractC9581f.AbstractC9587g.C9591d(field, m19804e(aVar));
            }
        } else if (z) {
            return new AbstractC9581f.AbstractC0290f.e(field);
        } else {
            fVar = new AbstractC9581f.AbstractC9587g.C9592e(field, m19804e(aVar));
        }
        return fVar;
    }

    /* renamed from: d */
    private static final boolean m19805d(AbstractC8404c0.AbstractC8405a<?, ?> aVar) {
        return aVar.mo19569B().mo19626x().getAnnotations().mo9037l(C8503p0.m19650j());
    }

    /* renamed from: e */
    private static final boolean m19804e(AbstractC8404c0.AbstractC8405a<?, ?> aVar) {
        return !C7322s1.m22935l(aVar.mo19569B().mo19626x().getType());
    }

    /* renamed from: f */
    public static final Object m19803f(AbstractC8404c0.AbstractC8405a<?, ?> aVar) {
        C9971q.m14633g(aVar, "<this>");
        return aVar.mo19569B().m19822B();
    }

    /* renamed from: g */
    private static final boolean m19802g(AbstractC11388u0 u0Var) {
        AbstractC11346m containingDeclaration = u0Var.mo6104b();
        C9971q.m14634f(containingDeclaration, "containingDeclaration");
        if (!C12661e.m6030x(containingDeclaration)) {
            return false;
        }
        AbstractC11346m b = containingDeclaration.mo6104b();
        if ((C12661e.m6064C(b) || C12661e.m6034t(b)) && (!(u0Var instanceof C6505j) || !C10619i.m12723f(((C6505j) u0Var).mo25408c0()))) {
            return false;
        }
        return true;
    }
}
