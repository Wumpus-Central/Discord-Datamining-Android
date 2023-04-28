package fi;

import kotlin.jvm.internal.C9944c0;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlin.properties.AbstractC9984d;
import kotlin.reflect.KProperty;
import pg.AbstractC11672g;

/* renamed from: fi.k */
/* loaded from: classes8.dex */
public final class C7288k {

    /* renamed from: a */
    static final /* synthetic */ KProperty<Object>[] f15770a = {C9951f0.m14679g(new C9944c0(C9951f0.m14682d(C7288k.class, "descriptors"), "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;"))};

    /* renamed from: b */
    private static final AbstractC9984d f15771b;

    static {
        AbstractC9984d c = C7232c1.f15671l.m12679c(C9951f0.m14684b(C7280j.class));
        C9971q.m14635e(c, "null cannot be cast to non-null type kotlin.properties.ReadOnlyProperty<org.jetbrains.kotlin.types.TypeAttributes, T of org.jetbrains.kotlin.types.TypeAttributes.Companion.attributeAccessor?>");
        f15771b = c;
    }

    /* renamed from: a */
    public static final AbstractC11672g m23011a(C7232c1 c1Var) {
        AbstractC11672g e;
        C9971q.m14633g(c1Var, "<this>");
        C7280j b = m23010b(c1Var);
        if (b == null || (e = b.m23027e()) == null) {
            return AbstractC11672g.f26044g.m9048b();
        }
        return e;
    }

    /* renamed from: b */
    public static final C7280j m23010b(C7232c1 c1Var) {
        C9971q.m14633g(c1Var, "<this>");
        return (C7280j) f15771b.getValue(c1Var, f15770a[0]);
    }
}
