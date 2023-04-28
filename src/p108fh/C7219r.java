package p108fh;

import fi.AbstractC7267g0;
import gi.C7680q;
import java.util.List;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import ng.C11107d;
import p249nh.C11137c;
import p268og.AbstractC11313e;
import p268og.AbstractC11326h;
import p427xg.C14108b0;
import pg.AbstractC11672g;
import pg.C11679k;

/* renamed from: fh.r */
/* loaded from: classes8.dex */
public final class C7219r {

    /* renamed from: a */
    private static final AbstractC11672g f15658a;

    /* renamed from: b */
    private static final C7168c f15659b;

    /* renamed from: fh.r$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C7220a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15660a;

        static {
            int[] iArr = new int[EnumC7176h.values().length];
            try {
                iArr[EnumC7176h.NULLABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC7176h.NOT_NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f15660a = iArr;
        }
    }

    static {
        C11137c ENHANCED_NULLABILITY_ANNOTATION = C14108b0.f31866u;
        C9971q.m14634f(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        f15658a = new C7168c(ENHANCED_NULLABILITY_ANNOTATION);
        C11137c ENHANCED_MUTABILITY_ANNOTATION = C14108b0.f31867v;
        C9971q.m14634f(ENHANCED_MUTABILITY_ANNOTATION, "ENHANCED_MUTABILITY_ANNOTATION");
        f15659b = new C7168c(ENHANCED_MUTABILITY_ANNOTATION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final AbstractC11672g m23185e(List<? extends AbstractC11672g> list) {
        Object r0;
        List D0;
        int size = list.size();
        if (size == 0) {
            throw new IllegalStateException("At least one Annotations object expected".toString());
        } else if (size != 1) {
            D0 = C9914r.m14790D0(list);
            return new C11679k(D0);
        } else {
            r0 = C9914r.m14747r0(list);
            return (AbstractC11672g) r0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final AbstractC11326h m23184f(AbstractC11326h hVar, C7172e eVar, EnumC7216o oVar) {
        C11107d dVar = C11107d.f24646a;
        if (!C7217p.m23191a(oVar) || !(hVar instanceof AbstractC11313e)) {
            return null;
        }
        if (eVar.m23284c() == EnumC7174f.READ_ONLY && oVar == EnumC7216o.FLEXIBLE_LOWER) {
            AbstractC11313e eVar2 = (AbstractC11313e) hVar;
            if (dVar.m10887c(eVar2)) {
                return dVar.m10889a(eVar2);
            }
        }
        if (eVar.m23284c() != EnumC7174f.MUTABLE || oVar != EnumC7216o.FLEXIBLE_UPPER) {
            return null;
        }
        AbstractC11313e eVar3 = (AbstractC11313e) hVar;
        if (dVar.m10886d(eVar3)) {
            return dVar.m10888b(eVar3);
        }
        return null;
    }

    /* renamed from: g */
    public static final AbstractC11672g m23183g() {
        return f15658a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final Boolean m23182h(C7172e eVar, EnumC7216o oVar) {
        int i;
        if (!C7217p.m23191a(oVar)) {
            return null;
        }
        EnumC7176h d = eVar.m23283d();
        if (d == null) {
            i = -1;
        } else {
            i = C7220a.f15660a[d.ordinal()];
        }
        if (i == 1) {
            return Boolean.TRUE;
        }
        if (i != 2) {
            return null;
        }
        return Boolean.FALSE;
    }

    /* renamed from: i */
    public static final boolean m23181i(AbstractC7267g0 g0Var) {
        C9971q.m14633g(g0Var, "<this>");
        return C7221s.m23178c(C7680q.f16687a, g0Var);
    }
}
