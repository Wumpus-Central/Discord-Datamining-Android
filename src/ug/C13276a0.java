package ug;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C9906j;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import p086eh.AbstractC6913y;
import p249nh.C11137c;
import p249nh.C11142f;

/* renamed from: ug.a0 */
/* loaded from: classes8.dex */
public final class C13276a0 extends AbstractC13306p implements AbstractC13290h, AbstractC6913y {

    /* renamed from: a */
    private final TypeVariable<?> f29805a;

    public C13276a0(TypeVariable<?> typeVariable) {
        C9971q.m14633g(typeVariable, "typeVariable");
        this.f29805a = typeVariable;
    }

    @Override // p086eh.AbstractC6891d
    /* renamed from: D */
    public boolean mo3971D() {
        return false;
    }

    /* renamed from: P */
    public List<C13304n> getUpperBounds() {
        Object t0;
        Type type;
        List<C13304n> i;
        Type[] bounds = this.f29805a.getBounds();
        C9971q.m14634f(bounds, "typeVariable.bounds");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type2 : bounds) {
            arrayList.add(new C13304n(type2));
        }
        t0 = C9914r.m14745t0(arrayList);
        C13304n nVar = (C13304n) t0;
        if (nVar != null) {
            type = nVar.mo3967P();
        } else {
            type = null;
        }
        if (!C9971q.m14638b(type, Object.class)) {
            return arrayList;
        }
        i = C9906j.m14820i();
        return i;
    }

    @Override // ug.AbstractC13290h
    /* renamed from: b */
    public AnnotatedElement mo3981b() {
        TypeVariable<?> typeVariable = this.f29805a;
        if (typeVariable instanceof AnnotatedElement) {
            return (AnnotatedElement) typeVariable;
        }
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C13276a0) && C9971q.m14638b(this.f29805a, ((C13276a0) obj).f29805a);
    }

    @Override // p086eh.AbstractC6908t
    public C11142f getName() {
        C11142f f = C11142f.m10767f(this.f29805a.getName());
        C9971q.m14634f(f, "identifier(typeVariable.name)");
        return f;
    }

    public int hashCode() {
        return this.f29805a.hashCode();
    }

    public String toString() {
        return C13276a0.class.getName() + ": " + this.f29805a;
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
