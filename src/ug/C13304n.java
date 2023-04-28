package ug;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.jvm.internal.C9971q;
import p086eh.AbstractC6885a;
import p086eh.AbstractC6897i;
import p086eh.AbstractC6898j;
import p086eh.AbstractC6912x;
import p249nh.C11137c;
import ug.AbstractC13316z;

/* renamed from: ug.n */
/* loaded from: classes8.dex */
public final class C13304n extends AbstractC13316z implements AbstractC6898j {

    /* renamed from: b */
    private final Type f29848b;

    /* renamed from: c */
    private final AbstractC6897i f29849c;

    public C13304n(Type reflectType) {
        AbstractC6897i iVar;
        C9971q.m14633g(reflectType, "reflectType");
        this.f29848b = reflectType;
        Type P = mo3967P();
        if (P instanceof Class) {
            iVar = new C13294l((Class) P);
        } else if (P instanceof TypeVariable) {
            iVar = new C13276a0((TypeVariable) P);
        } else if (P instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) P).getRawType();
            C9971q.m14635e(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            iVar = new C13294l((Class) rawType);
        } else {
            throw new IllegalStateException("Not a classifier type (" + P.getClass() + "): " + P);
        }
        this.f29849c = iVar;
    }

    @Override // p086eh.AbstractC6891d
    /* renamed from: D */
    public boolean mo3971D() {
        return false;
    }

    @Override // p086eh.AbstractC6898j
    /* renamed from: E */
    public String mo3997E() {
        return mo3967P().toString();
    }

    @Override // p086eh.AbstractC6898j
    /* renamed from: H */
    public String mo3996H() {
        throw new UnsupportedOperationException("Type not found: " + mo3967P());
    }

    @Override // ug.AbstractC13316z
    /* renamed from: P */
    public Type mo3967P() {
        return this.f29848b;
    }

    @Override // ug.AbstractC13316z, p086eh.AbstractC6891d
    /* renamed from: c */
    public AbstractC6885a mo3966c(C11137c fqName) {
        C9971q.m14633g(fqName, "fqName");
        return null;
    }

    @Override // p086eh.AbstractC6898j
    /* renamed from: d */
    public AbstractC6897i mo3995d() {
        return this.f29849c;
    }

    @Override // p086eh.AbstractC6891d
    public Collection<AbstractC6885a> getAnnotations() {
        List i;
        i = C9906j.m14820i();
        return i;
    }

    @Override // p086eh.AbstractC6898j
    /* renamed from: h */
    public boolean mo3994h() {
        Type P = mo3967P();
        if (!(P instanceof Class)) {
            return false;
        }
        TypeVariable[] typeParameters = ((Class) P).getTypeParameters();
        C9971q.m14634f(typeParameters, "getTypeParameters()");
        return (typeParameters.length == 0) ^ true;
    }

    @Override // p086eh.AbstractC6898j
    /* renamed from: z */
    public List<AbstractC6912x> mo3993z() {
        int t;
        List<Type> d = C13283d.m4050d(mo3967P());
        AbstractC13316z.C13317a aVar = AbstractC13316z.f29860a;
        t = C9907k.m14809t(d, 10);
        ArrayList arrayList = new ArrayList(t);
        for (Type type : d) {
            arrayList.add(aVar.m3965a(type));
        }
        return arrayList;
    }
}
