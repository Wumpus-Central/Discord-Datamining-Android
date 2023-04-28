package ug;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C9899f;
import kotlin.collections.C9906j;
import kotlin.jvm.internal.C9971q;
import p086eh.AbstractC6885a;
import p086eh.AbstractC6890c0;
import ug.AbstractC13316z;

/* renamed from: ug.c0 */
/* loaded from: classes8.dex */
public final class C13282c0 extends AbstractC13316z implements AbstractC6890c0 {

    /* renamed from: b */
    private final WildcardType f29820b;

    /* renamed from: c */
    private final Collection<AbstractC6885a> f29821c;

    /* renamed from: d */
    private final boolean f29822d;

    public C13282c0(WildcardType reflectType) {
        List i;
        C9971q.m14633g(reflectType, "reflectType");
        this.f29820b = reflectType;
        i = C9906j.m14820i();
        this.f29821c = i;
    }

    @Override // p086eh.AbstractC6891d
    /* renamed from: D */
    public boolean mo3971D() {
        return this.f29822d;
    }

    @Override // p086eh.AbstractC6890c0
    /* renamed from: L */
    public boolean mo4057L() {
        Object E;
        Type[] upperBounds = mo3967P().getUpperBounds();
        C9971q.m14634f(upperBounds, "reflectType.upperBounds");
        E = C9899f.m14964E(upperBounds);
        return !C9971q.m14638b(E, Object.class);
    }

    /* renamed from: Q */
    public AbstractC13316z mo4054w() {
        Object h0;
        Object h02;
        Type[] upperBounds = mo3967P().getUpperBounds();
        Type[] lowerBounds = mo3967P().getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + mo3967P());
        } else if (lowerBounds.length == 1) {
            AbstractC13316z.C13317a aVar = AbstractC13316z.f29860a;
            C9971q.m14634f(lowerBounds, "lowerBounds");
            h02 = C9899f.m14929h0(lowerBounds);
            C9971q.m14634f(h02, "lowerBounds.single()");
            return aVar.m3965a((Type) h02);
        } else {
            if (upperBounds.length == 1) {
                C9971q.m14634f(upperBounds, "upperBounds");
                h0 = C9899f.m14929h0(upperBounds);
                Type ub = (Type) h0;
                if (!C9971q.m14638b(ub, Object.class)) {
                    AbstractC13316z.C13317a aVar2 = AbstractC13316z.f29860a;
                    C9971q.m14634f(ub, "ub");
                    return aVar2.m3965a(ub);
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: R */
    public WildcardType mo3967P() {
        return this.f29820b;
    }

    @Override // p086eh.AbstractC6891d
    public Collection<AbstractC6885a> getAnnotations() {
        return this.f29821c;
    }
}
