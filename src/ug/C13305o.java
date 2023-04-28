package ug;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C9897e;
import kotlin.collections.C9906j;
import kotlin.jvm.internal.C9971q;
import p086eh.AbstractC6888b0;
import p086eh.AbstractC6899k;

/* renamed from: ug.o */
/* loaded from: classes8.dex */
public final class C13305o extends AbstractC13310t implements AbstractC6899k {

    /* renamed from: a */
    private final Constructor<?> f29850a;

    public C13305o(Constructor<?> member) {
        C9971q.m14633g(member, "member");
        this.f29850a = member;
    }

    /* renamed from: S */
    public Constructor<?> mo3969Q() {
        return this.f29850a;
    }

    @Override // p086eh.AbstractC6914z
    public List<C13276a0> getTypeParameters() {
        TypeVariable<Constructor<?>>[] typeParameters = mo3969Q().getTypeParameters();
        C9971q.m14634f(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Constructor<?>> typeVariable : typeParameters) {
            arrayList.add(new C13276a0(typeVariable));
        }
        return arrayList;
    }

    @Override // p086eh.AbstractC6899k
    /* renamed from: i */
    public List<AbstractC6888b0> mo3991i() {
        boolean z;
        Object[] j;
        Object[] j2;
        List<AbstractC6888b0> i;
        Type[] realTypes = mo3969Q().getGenericParameterTypes();
        C9971q.m14634f(realTypes, "types");
        if (realTypes.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = C9906j.m14820i();
            return i;
        }
        Class<?> declaringClass = mo3969Q().getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            j2 = C9897e.m14985j(realTypes, 1, realTypes.length);
            realTypes = (Type[]) j2;
        }
        Annotation[][] realAnnotations = mo3969Q().getParameterAnnotations();
        if (realAnnotations.length >= realTypes.length) {
            if (realAnnotations.length > realTypes.length) {
                C9971q.m14634f(realAnnotations, "annotations");
                j = C9897e.m14985j(realAnnotations, realAnnotations.length - realTypes.length, realAnnotations.length);
                realAnnotations = (Annotation[][]) j;
            }
            C9971q.m14634f(realTypes, "realTypes");
            C9971q.m14634f(realAnnotations, "realAnnotations");
            return m3982R(realTypes, realAnnotations, mo3969Q().isVarArgs());
        }
        throw new IllegalStateException("Illegal generic signature: " + mo3969Q());
    }
}
