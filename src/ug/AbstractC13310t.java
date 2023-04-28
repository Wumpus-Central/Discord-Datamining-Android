package ug;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C9899f;
import kotlin.collections.C9906j;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import p086eh.AbstractC6888b0;
import p086eh.AbstractC6905q;
import p249nh.C11137c;
import p249nh.C11142f;
import p249nh.C11144h;
import p268og.AbstractC11362n1;
import p268og.C11348m1;
import sg.C12896a;
import sg.C12897b;
import sg.C12898c;

/* renamed from: ug.t */
/* loaded from: classes8.dex */
public abstract class AbstractC13310t extends AbstractC13306p implements AbstractC13290h, AbstractC13312v, AbstractC6905q {
    @Override // p086eh.AbstractC6891d
    /* renamed from: D */
    public boolean mo3971D() {
        return false;
    }

    /* renamed from: P */
    public C13294l mo3984O() {
        Class<?> declaringClass = mo3969Q().getDeclaringClass();
        C9971q.m14634f(declaringClass, "member.declaringClass");
        return new C13294l(declaringClass);
    }

    /* renamed from: Q */
    public abstract Member mo3969Q();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: R */
    public final List<AbstractC6888b0> m3982R(Type[] parameterTypes, Annotation[][] parameterAnnotations, boolean z) {
        int i;
        String str;
        boolean z2;
        int I;
        Object X;
        C9971q.m14633g(parameterTypes, "parameterTypes");
        C9971q.m14633g(parameterAnnotations, "parameterAnnotations");
        ArrayList arrayList = new ArrayList(parameterTypes.length);
        List<String> b = C13280c.f29816a.m4060b(mo3969Q());
        if (b != null) {
            i = b.size() - parameterTypes.length;
        } else {
            i = 0;
        }
        int length = parameterTypes.length;
        for (int i2 = 0; i2 < length; i2++) {
            AbstractC13316z a = AbstractC13316z.f29860a.m3965a(parameterTypes[i2]);
            if (b != null) {
                X = C9914r.m14767X(b, i2 + i);
                str = (String) X;
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i2 + '+' + i + " (name=" + getName() + " type=" + a + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            if (z) {
                I = C9899f.m14956I(parameterTypes);
                if (i2 == I) {
                    z2 = true;
                    arrayList.add(new C13279b0(a, parameterAnnotations[i2], str, z2));
                }
            }
            z2 = false;
            arrayList.add(new C13279b0(a, parameterAnnotations[i2], str, z2));
        }
        return arrayList;
    }

    @Override // ug.AbstractC13290h
    /* renamed from: b */
    public AnnotatedElement mo3981b() {
        Member Q = mo3969Q();
        C9971q.m14635e(Q, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        return (AnnotatedElement) Q;
    }

    public boolean equals(Object obj) {
        return (obj instanceof AbstractC13310t) && C9971q.m14638b(mo3969Q(), ((AbstractC13310t) obj).mo3969Q());
    }

    @Override // p086eh.AbstractC6907s
    /* renamed from: f */
    public boolean mo3980f() {
        return Modifier.isStatic(getModifiers());
    }

    @Override // ug.AbstractC13312v
    public int getModifiers() {
        return mo3969Q().getModifiers();
    }

    @Override // p086eh.AbstractC6908t
    public C11142f getName() {
        String name = mo3969Q().getName();
        C11142f f = name != null ? C11142f.m10767f(name) : null;
        return f == null ? C11144h.f24734b : f;
    }

    @Override // p086eh.AbstractC6907s
    public AbstractC11362n1 getVisibility() {
        int modifiers = getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return C11348m1.C11356h.f25284c;
        }
        if (Modifier.isPrivate(modifiers)) {
            return C11348m1.C11353e.f25281c;
        }
        if (!Modifier.isProtected(modifiers)) {
            return C12896a.f28970c;
        }
        if (Modifier.isStatic(modifiers)) {
            return C12898c.f28972c;
        }
        return C12897b.f28971c;
    }

    public int hashCode() {
        return mo3969Q().hashCode();
    }

    @Override // p086eh.AbstractC6907s
    public boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // p086eh.AbstractC6907s
    public boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }

    public String toString() {
        return getClass().getName() + ": " + mo3969Q();
    }

    @Override // ug.AbstractC13290h, p086eh.AbstractC6891d
    /* renamed from: c */
    public C13286e mo3966c(C11137c fqName) {
        Annotation[] declaredAnnotations;
        C9971q.m14633g(fqName, "fqName");
        AnnotatedElement b = mo3981b();
        if (b == null || (declaredAnnotations = b.getDeclaredAnnotations()) == null) {
            return null;
        }
        return C13291i.m4034a(declaredAnnotations, fqName);
    }

    @Override // ug.AbstractC13290h, p086eh.AbstractC6891d
    public List<C13286e> getAnnotations() {
        List<C13286e> i;
        Annotation[] declaredAnnotations;
        List<C13286e> b;
        AnnotatedElement b2 = mo3981b();
        if (b2 != null && (declaredAnnotations = b2.getDeclaredAnnotations()) != null && (b = C13291i.m4033b(declaredAnnotations)) != null) {
            return b;
        }
        i = C9906j.m14820i();
        return i;
    }
}
