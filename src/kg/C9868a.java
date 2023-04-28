package kg;

import gh.AbstractC7637r;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9906j;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.Ref$BooleanRef;
import p249nh.C11136b;
import p249nh.C11137c;
import p268og.AbstractC11299a1;
import p427xg.C14106a0;
import p427xg.C14108b0;

/* renamed from: kg.a */
/* loaded from: classes8.dex */
public final class C9868a {

    /* renamed from: a */
    public static final C9868a f21990a = new C9868a();

    /* renamed from: b */
    private static final Set<C11136b> f21991b;

    /* renamed from: c */
    private static final C11136b f21992c;

    /* renamed from: kg.a$a */
    /* loaded from: classes8.dex */
    public static final class C0299a implements AbstractC7637r.AbstractC7640c {

        /* renamed from: a */
        final /* synthetic */ Ref$BooleanRef f21993a;

        C0299a(Ref$BooleanRef ref$BooleanRef) {
            this.f21993a = ref$BooleanRef;
        }

        @Override // gh.AbstractC7637r.AbstractC7640c
        /* renamed from: a */
        public void mo15156a() {
        }

        @Override // gh.AbstractC7637r.AbstractC7640c
        /* renamed from: b */
        public AbstractC7637r.AbstractC7638a mo15155b(C11136b classId, AbstractC11299a1 source) {
            C9971q.m14633g(classId, "classId");
            C9971q.m14633g(source, "source");
            if (!C9971q.m14638b(classId, C14106a0.f31833a.m1650a())) {
                return null;
            }
            this.f21993a.f22067k = true;
            return null;
        }
    }

    static {
        List<C11137c> l;
        l = C9906j.m14817l(C14108b0.f31846a, C14108b0.f31856k, C14108b0.f31857l, C14108b0.f31849d, C14108b0.f31851f, C14108b0.f31854i);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C11137c cVar : l) {
            linkedHashSet.add(C11136b.m10805m(cVar));
        }
        f21991b = linkedHashSet;
        C11136b m = C11136b.m10805m(C14108b0.f31855j);
        C9971q.m14634f(m, "topLevel(JvmAnnotationNames.REPEATABLE_ANNOTATION)");
        f21992c = m;
    }

    private C9868a() {
    }

    /* renamed from: a */
    public final C11136b m15159a() {
        return f21992c;
    }

    /* renamed from: b */
    public final Set<C11136b> m15158b() {
        return f21991b;
    }

    /* renamed from: c */
    public final boolean m15157c(AbstractC7637r klass) {
        C9971q.m14633g(klass, "klass");
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        klass.mo4631c(new C0299a(ref$BooleanRef), null);
        return ref$BooleanRef.f22067k;
    }
}
