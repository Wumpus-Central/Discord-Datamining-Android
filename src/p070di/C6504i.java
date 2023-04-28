package p070di;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9911o;
import kotlin.collections.C9914r;
import kotlin.collections.C9921w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import p249nh.C11136b;
import p249nh.C11137c;
import p249nh.C11142f;
import p268og.AbstractC11326h;
import p268og.AbstractC11344l0;
import p268og.AbstractC11346m;
import p304qg.AbstractC12126b;
import p406wg.AbstractC13878b;
import p406wg.EnumC13881d;
import p448yh.C14403d;
import vg.C13505a;

/* renamed from: di.i */
/* loaded from: classes8.dex */
public class C6504i extends AbstractC6485h {

    /* renamed from: g */
    private final AbstractC11344l0 f13638g;

    /* renamed from: h */
    private final String f13639h;

    /* renamed from: i */
    private final C11137c f13640i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C6504i(p268og.AbstractC11344l0 r17, p159ih.C8575l r18, kh.AbstractC9874c r19, kh.AbstractC9869a r20, p070di.AbstractC6483f r21, bi.C3585k r22, java.lang.String r23, kotlin.jvm.functions.Function0<? extends java.util.Collection<p249nh.C11142f>> r24) {
        /*
            r16 = this;
            r6 = r16
            r14 = r17
            r15 = r23
            java.lang.String r0 = "packageDescriptor"
            kotlin.jvm.internal.C9971q.m14633g(r14, r0)
            java.lang.String r0 = "proto"
            r1 = r18
            kotlin.jvm.internal.C9971q.m14633g(r1, r0)
            java.lang.String r0 = "nameResolver"
            r2 = r19
            kotlin.jvm.internal.C9971q.m14633g(r2, r0)
            java.lang.String r0 = "metadataVersion"
            r3 = r20
            kotlin.jvm.internal.C9971q.m14633g(r3, r0)
            java.lang.String r0 = "components"
            r4 = r22
            kotlin.jvm.internal.C9971q.m14633g(r4, r0)
            java.lang.String r0 = "debugName"
            kotlin.jvm.internal.C9971q.m14633g(r15, r0)
            java.lang.String r0 = "classNames"
            r5 = r24
            kotlin.jvm.internal.C9971q.m14633g(r5, r0)
            kh.g r10 = new kh.g
            ih.t r0 = r18.m19045W()
            java.lang.String r7 = "proto.typeTable"
            kotlin.jvm.internal.C9971q.m14634f(r0, r7)
            r10.<init>(r0)
            kh.h$a r0 = kh.C9880h.f22033b
            ih.w r7 = r18.m19044X()
            java.lang.String r8 = "proto.versionRequirementTable"
            kotlin.jvm.internal.C9971q.m14634f(r7, r8)
            kh.h r11 = r0.m15108a(r7)
            r7 = r22
            r8 = r17
            r9 = r19
            r12 = r20
            r13 = r21
            bi.m r2 = r7.m34049a(r8, r9, r10, r11, r12, r13)
            java.util.List r3 = r18.m19052P()
            java.lang.String r0 = "proto.functionList"
            kotlin.jvm.internal.C9971q.m14634f(r3, r0)
            java.util.List r4 = r18.m19049S()
            java.lang.String r0 = "proto.propertyList"
            kotlin.jvm.internal.C9971q.m14634f(r4, r0)
            java.util.List r7 = r18.m19046V()
            java.lang.String r0 = "proto.typeAliasList"
            kotlin.jvm.internal.C9971q.m14634f(r7, r0)
            r0 = r16
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f13638g = r14
            r6.f13639h = r15
            nh.c r0 = r17.mo6103e()
            r6.f13640i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p070di.C6504i.<init>(og.l0, ih.l, kh.c, kh.a, di.f, bi.k, java.lang.String, kotlin.jvm.functions.Function0):void");
    }

    @Override // p070di.AbstractC6485h, p448yh.AbstractC14414i, p448yh.AbstractC14416k
    /* renamed from: e */
    public AbstractC11326h mo636e(C11142f name, AbstractC13878b location) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        m25411z(name, location);
        return super.mo636e(name, location);
    }

    @Override // p070di.AbstractC6485h
    /* renamed from: i */
    protected void mo25418i(Collection<AbstractC11346m> result, Function1<? super C11142f, Boolean> nameFilter) {
        C9971q.m14633g(result, "result");
        C9971q.m14633g(nameFilter, "nameFilter");
    }

    @Override // p070di.AbstractC6485h
    /* renamed from: m */
    protected C11136b mo25417m(C11142f name) {
        C9971q.m14633g(name, "name");
        return new C11136b(this.f13640i, name);
    }

    @Override // p070di.AbstractC6485h
    /* renamed from: s */
    protected Set<C11142f> mo25416s() {
        Set<C11142f> d;
        d = C9921w.m14722d();
        return d;
    }

    @Override // p070di.AbstractC6485h
    /* renamed from: t */
    protected Set<C11142f> mo25415t() {
        Set<C11142f> d;
        d = C9921w.m14722d();
        return d;
    }

    public String toString() {
        return this.f13639h;
    }

    @Override // p070di.AbstractC6485h
    /* renamed from: u */
    protected Set<C11142f> mo25414u() {
        Set<C11142f> d;
        d = C9921w.m14722d();
        return d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p070di.AbstractC6485h
    /* renamed from: w */
    public boolean mo25413w(C11142f name) {
        boolean z;
        C9971q.m14633g(name, "name");
        if (super.mo25413w(name)) {
            return true;
        }
        Iterable<AbstractC12126b> k = m25479p().m34019c().m34039k();
        if (!(k instanceof Collection) || !((Collection) k).isEmpty()) {
            for (AbstractC12126b bVar : k) {
                if (bVar.mo7768b(this.f13640i, name)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public List<AbstractC11346m> mo625f(C14403d kindFilter, Function1<? super C11142f, Boolean> nameFilter) {
        List<AbstractC11346m> o0;
        C9971q.m14633g(kindFilter, "kindFilter");
        C9971q.m14633g(nameFilter, "nameFilter");
        Collection<AbstractC11346m> j = m25484j(kindFilter, nameFilter, EnumC13881d.WHEN_GET_ALL_DESCRIPTORS);
        Iterable<AbstractC12126b> k = m25479p().m34019c().m34039k();
        ArrayList arrayList = new ArrayList();
        for (AbstractC12126b bVar : k) {
            C9911o.m14801y(arrayList, bVar.mo7769a(this.f13640i));
        }
        o0 = C9914r.m14750o0(j, arrayList);
        return o0;
    }

    /* renamed from: z */
    public void m25411z(C11142f name, AbstractC13878b location) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        C13505a.m3543b(m25479p().m34019c().m34035o(), location, this.f13638g, name);
    }
}
