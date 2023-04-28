package bi;

import java.util.Set;
import kotlin.collections.C9920v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p217lg.C10434k;
import p249nh.C11136b;
import p268og.AbstractC11313e;

/* renamed from: bi.i */
/* loaded from: classes8.dex */
public final class C3579i {

    /* renamed from: c */
    public static final C3581b f5809c = new C3581b(null);

    /* renamed from: d */
    private static final Set<C11136b> f5810d;

    /* renamed from: a */
    private final C3585k f5811a;

    /* renamed from: b */
    private final Function1<C3580a, AbstractC11313e> f5812b;

    /* renamed from: bi.i$a */
    /* loaded from: classes8.dex */
    public static final class C3580a {

        /* renamed from: a */
        private final C11136b f5813a;

        /* renamed from: b */
        private final C3577g f5814b;

        public C3580a(C11136b classId, C3577g gVar) {
            C9971q.m14633g(classId, "classId");
            this.f5813a = classId;
            this.f5814b = gVar;
        }

        /* renamed from: a */
        public final C3577g m34055a() {
            return this.f5814b;
        }

        /* renamed from: b */
        public final C11136b m34054b() {
            return this.f5813a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C3580a) && C9971q.m14638b(this.f5813a, ((C3580a) obj).f5813a);
        }

        public int hashCode() {
            return this.f5813a.hashCode();
        }
    }

    /* renamed from: bi.i$b */
    /* loaded from: classes8.dex */
    public static final class C3581b {
        private C3581b() {
        }

        public /* synthetic */ C3581b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Set<C11136b> m34053a() {
            return C3579i.f5810d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bi.i$c */
    /* loaded from: classes8.dex */
    public static final class C3582c extends AbstractC9973s implements Function1<C3580a, AbstractC11313e> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3582c() {
            super(1);
            C3579i.this = r1;
        }

        /* renamed from: a */
        public final AbstractC11313e invoke(C3580a key) {
            C9971q.m14633g(key, "key");
            return C3579i.this.m34058c(key);
        }
    }

    static {
        Set<C11136b> c;
        c = C9920v.m14723c(C11136b.m10805m(C10434k.C10435a.f22906d.m10782l()));
        f5810d = c;
    }

    public C3579i(C3585k components) {
        C9971q.m14633g(components, "components");
        this.f5811a = components;
        this.f5812b = components.m34029u().mo23894g(new C3582c());
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00b8 A[EDGE_INSN: B:47:0x00b8->B:39:0x00b8 ?: BREAK  , SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p268og.AbstractC11313e m34058c(bi.C3579i.C3580a r13) {
        /*
            r12 = this;
            nh.b r0 = r13.m34054b()
            bi.k r1 = r12.f5811a
            java.lang.Iterable r1 = r1.m34039k()
            java.util.Iterator r1 = r1.iterator()
        L_0x000e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0021
            java.lang.Object r2 = r1.next()
            qg.b r2 = (p304qg.AbstractC12126b) r2
            og.e r2 = r2.mo7767c(r0)
            if (r2 == 0) goto L_0x000e
            return r2
        L_0x0021:
            java.util.Set<nh.b> r1 = bi.C3579i.f5810d
            boolean r1 = r1.contains(r0)
            r2 = 0
            if (r1 == 0) goto L_0x002b
            return r2
        L_0x002b:
            bi.g r13 = r13.m34055a()
            if (r13 != 0) goto L_0x003e
            bi.k r13 = r12.f5811a
            bi.h r13 = r13.m34045e()
            bi.g r13 = r13.mo21860a(r0)
            if (r13 != 0) goto L_0x003e
            return r2
        L_0x003e:
            kh.c r1 = r13.m34064a()
            ih.c r10 = r13.m34063b()
            kh.a r11 = r13.m34062c()
            og.a1 r13 = r13.m34061d()
            nh.b r3 = r0.m10811g()
            java.lang.String r4 = "classId.shortClassName"
            if (r3 == 0) goto L_0x0079
            r5 = 2
            og.e r3 = m34056e(r12, r3, r2, r5, r2)
            boolean r5 = r3 instanceof p070di.C6467d
            if (r5 == 0) goto L_0x0062
            di.d r3 = (p070di.C6467d) r3
            goto L_0x0063
        L_0x0062:
            r3 = r2
        L_0x0063:
            if (r3 != 0) goto L_0x0066
            return r2
        L_0x0066:
            nh.f r0 = r0.m10808j()
            kotlin.jvm.internal.C9971q.m14634f(r0, r4)
            boolean r0 = r3.m25509g1(r0)
            if (r0 != 0) goto L_0x0074
            return r2
        L_0x0074:
            bi.m r0 = r3.m25515a1()
            goto L_0x00e4
        L_0x0079:
            bi.k r3 = r12.f5811a
            og.m0 r3 = r3.m34032r()
            nh.c r5 = r0.m10810h()
            java.lang.String r6 = "classId.packageFqName"
            kotlin.jvm.internal.C9971q.m14634f(r5, r6)
            java.util.List r3 = p268og.C11364o0.m10182c(r3, r5)
            java.util.Iterator r3 = r3.iterator()
        L_0x0090:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00b7
            java.lang.Object r5 = r3.next()
            r6 = r5
            og.l0 r6 = (p268og.AbstractC11344l0) r6
            boolean r7 = r6 instanceof bi.AbstractC3592p
            if (r7 == 0) goto L_0x00b3
            bi.p r6 = (bi.AbstractC3592p) r6
            nh.f r7 = r0.m10808j()
            kotlin.jvm.internal.C9971q.m14634f(r7, r4)
            boolean r6 = r6.m34008K0(r7)
            if (r6 == 0) goto L_0x00b1
            goto L_0x00b3
        L_0x00b1:
            r6 = 0
            goto L_0x00b4
        L_0x00b3:
            r6 = 1
        L_0x00b4:
            if (r6 == 0) goto L_0x0090
            goto L_0x00b8
        L_0x00b7:
            r5 = r2
        L_0x00b8:
            r4 = r5
            og.l0 r4 = (p268og.AbstractC11344l0) r4
            if (r4 != 0) goto L_0x00be
            return r2
        L_0x00be:
            bi.k r3 = r12.f5811a
            kh.g r6 = new kh.g
            ih.t r0 = r10.m19382i1()
            java.lang.String r2 = "classProto.typeTable"
            kotlin.jvm.internal.C9971q.m14634f(r0, r2)
            r6.<init>(r0)
            kh.h$a r0 = kh.C9880h.f22033b
            ih.w r2 = r10.m19378k1()
            java.lang.String r5 = "classProto.versionRequirementTable"
            kotlin.jvm.internal.C9971q.m14634f(r2, r5)
            kh.h r7 = r0.m15108a(r2)
            r9 = 0
            r5 = r1
            r8 = r11
            bi.m r0 = r3.m34049a(r4, r5, r6, r7, r8, r9)
        L_0x00e4:
            r4 = r0
            di.d r0 = new di.d
            r3 = r0
            r5 = r10
            r6 = r1
            r7 = r11
            r8 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bi.C3579i.m34058c(bi.i$a):og.e");
    }

    /* renamed from: e */
    public static /* synthetic */ AbstractC11313e m34056e(C3579i iVar, C11136b bVar, C3577g gVar, int i, Object obj) {
        if ((i & 2) != 0) {
            gVar = null;
        }
        return iVar.m34057d(bVar, gVar);
    }

    /* renamed from: d */
    public final AbstractC11313e m34057d(C11136b classId, C3577g gVar) {
        C9971q.m14633g(classId, "classId");
        return this.f5812b.invoke(new C3580a(classId, gVar));
    }
}
