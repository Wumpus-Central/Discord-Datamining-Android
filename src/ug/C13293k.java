package ug;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C9906j;
import kotlin.jvm.internal.C9971q;
import p086eh.AbstractC6885a;
import p086eh.AbstractC6894f;
import ug.AbstractC13316z;

/* renamed from: ug.k */
/* loaded from: classes8.dex */
public final class C13293k extends AbstractC13316z implements AbstractC6894f {

    /* renamed from: b */
    private final Type f29834b;

    /* renamed from: c */
    private final AbstractC13316z f29835c;

    /* renamed from: d */
    private final Collection<AbstractC6885a> f29836d;

    /* renamed from: e */
    private final boolean f29837e;

    public C13293k(Type reflectType) {
        AbstractC13316z zVar;
        List i;
        C9971q.m14633g(reflectType, "reflectType");
        this.f29834b = reflectType;
        Type P = mo3967P();
        if (P instanceof GenericArrayType) {
            AbstractC13316z.C13317a aVar = AbstractC13316z.f29860a;
            Type genericComponentType = ((GenericArrayType) P).getGenericComponentType();
            C9971q.m14634f(genericComponentType, "genericComponentType");
            zVar = aVar.m3965a(genericComponentType);
        } else {
            if (P instanceof Class) {
                Class cls = (Class) P;
                if (cls.isArray()) {
                    AbstractC13316z.C13317a aVar2 = AbstractC13316z.f29860a;
                    Class<?> componentType = cls.getComponentType();
                    C9971q.m14634f(componentType, "getComponentType()");
                    zVar = aVar2.m3965a(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + mo3967P().getClass() + "): " + mo3967P());
        }
        this.f29835c = zVar;
        i = C9906j.m14820i();
        this.f29836d = i;
    }

    @Override // p086eh.AbstractC6891d
    /* renamed from: D */
    public boolean mo3971D() {
        return this.f29837e;
    }

    @Override // ug.AbstractC13316z
    /* renamed from: P */
    protected Type mo3967P() {
        return this.f29834b;
    }

    /* renamed from: Q */
    public AbstractC13316z getComponentType() {
        return this.f29835c;
    }

    @Override // p086eh.AbstractC6891d
    public Collection<AbstractC6885a> getAnnotations() {
        return this.f29836d;
    }
}
