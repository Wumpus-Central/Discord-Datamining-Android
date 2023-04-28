package ng;

import java.util.List;
import kotlin.collections.C9905i;
import kotlin.collections.C9906j;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p087ei.AbstractC6944n;
import p249nh.C11142f;
import p268og.AbstractC11299a1;
import p268og.AbstractC11301b;
import p268og.AbstractC11313e;
import p268og.AbstractC11319f1;
import p268og.AbstractC11335j1;
import p268og.AbstractC11396x0;
import p268og.AbstractC11397y;
import p268og.C11373t;
import p268og.EnumC11314e0;
import p324rg.C12607g0;
import p388vh.C13508c;
import p448yh.AbstractC14405e;
import pg.AbstractC11672g;

/* renamed from: ng.a */
/* loaded from: classes8.dex */
public final class C11102a extends AbstractC14405e {

    /* renamed from: e */
    public static final C0353a f24622e = new C0353a(null);

    /* renamed from: f */
    private static final C11142f f24623f;

    /* renamed from: ng.a$a */
    /* loaded from: classes8.dex */
    public static final class C0353a {
        private C0353a() {
        }

        public /* synthetic */ C0353a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C11142f m10913a() {
            return C11102a.f24623f;
        }
    }

    static {
        C11142f f = C11142f.m10767f("clone");
        C9971q.m14634f(f, "identifier(\"clone\")");
        f24623f = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11102a(AbstractC6944n storageManager, AbstractC11313e containingClass) {
        super(storageManager, containingClass);
        C9971q.m14633g(storageManager, "storageManager");
        C9971q.m14633g(containingClass, "containingClass");
    }

    @Override // p448yh.AbstractC14405e
    /* renamed from: i */
    protected List<AbstractC11397y> mo656i() {
        List<AbstractC11396x0> i;
        List<? extends AbstractC11319f1> i2;
        List<AbstractC11335j1> i3;
        List<AbstractC11397y> d;
        C12607g0 l1 = C12607g0.m6363l1(m653l(), AbstractC11672g.f26044g.m9048b(), f24623f, AbstractC11301b.EnumC11302a.DECLARATION, AbstractC11299a1.f25230a);
        AbstractC11396x0 J0 = m653l().mo6174J0();
        i = C9906j.m14820i();
        i2 = C9906j.m14820i();
        i3 = C9906j.m14820i();
        l1.mo6259R0(null, J0, i, i2, i3, C13508c.m3531j(m653l()).m13387i(), EnumC11314e0.OPEN, C11373t.f25297c);
        d = C9905i.m14825d(l1);
        return d;
    }
}
