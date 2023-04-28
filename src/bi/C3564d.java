package bi;

import ai.C1406a;
import bi.AbstractC3615z;
import fi.AbstractC7267g0;
import java.util.ArrayList;
import java.util.List;
import kh.AbstractC9874c;
import kh.C9877e;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.jvm.internal.C9971q;
import p159ih.C8541b;
import p159ih.C8547d;
import p159ih.C8560g;
import p159ih.C8568i;
import p159ih.C8581n;
import p159ih.C8593q;
import p159ih.C8603s;
import p159ih.C8611u;
import p268og.AbstractC11327h0;
import p268og.C11337k0;
import pg.AbstractC11666c;
import ph.AbstractC11724q;
import th.AbstractC13104g;

/* renamed from: bi.d */
/* loaded from: classes8.dex */
public final class C3564d implements AbstractC3562c<AbstractC11666c, AbstractC13104g<?>> {

    /* renamed from: a */
    private final C1406a f5784a;

    /* renamed from: b */
    private final C3573e f5785b;

    /* renamed from: bi.d$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C3565a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5786a;

        static {
            int[] iArr = new int[EnumC3559b.values().length];
            try {
                iArr[EnumC3559b.PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3559b.PROPERTY_GETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3559b.PROPERTY_SETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f5786a = iArr;
        }
    }

    public C3564d(AbstractC11327h0 module, C11337k0 notFoundClasses, C1406a protocol) {
        C9971q.m14633g(module, "module");
        C9971q.m14633g(notFoundClasses, "notFoundClasses");
        C9971q.m14633g(protocol, "protocol");
        this.f5784a = protocol;
        this.f5785b = new C3573e(module, notFoundClasses);
    }

    @Override // bi.AbstractC3576f
    /* renamed from: a */
    public List<AbstractC11666c> mo21935a(AbstractC3615z container, C8581n proto) {
        List<AbstractC11666c> i;
        C9971q.m14633g(container, "container");
        C9971q.m14633g(proto, "proto");
        i = C9906j.m14820i();
        return i;
    }

    @Override // bi.AbstractC3576f
    /* renamed from: b */
    public List<AbstractC11666c> mo21934b(C8593q proto, AbstractC9874c nameResolver) {
        int t;
        C9971q.m14633g(proto, "proto");
        C9971q.m14633g(nameResolver, "nameResolver");
        List<C8541b> list = (List) proto.m8832v(this.f5784a.m41148k());
        if (list == null) {
            list = C9906j.m14820i();
        }
        t = C9907k.m14809t(list, 10);
        ArrayList arrayList = new ArrayList(t);
        for (C8541b bVar : list) {
            arrayList.add(this.f5785b.m34072a(bVar, nameResolver));
        }
        return arrayList;
    }

    @Override // bi.AbstractC3576f
    /* renamed from: c */
    public List<AbstractC11666c> mo21933c(AbstractC3615z.C3616a container) {
        int t;
        C9971q.m14633g(container, "container");
        List<C8541b> list = (List) container.m33973f().m8832v(this.f5784a.m41158a());
        if (list == null) {
            list = C9906j.m14820i();
        }
        t = C9907k.m14809t(list, 10);
        ArrayList arrayList = new ArrayList(t);
        for (C8541b bVar : list) {
            arrayList.add(this.f5785b.m34072a(bVar, container.m33977b()));
        }
        return arrayList;
    }

    @Override // bi.AbstractC3576f
    /* renamed from: d */
    public List<AbstractC11666c> mo21932d(AbstractC3615z container, C8560g proto) {
        int t;
        C9971q.m14633g(container, "container");
        C9971q.m14633g(proto, "proto");
        List<C8541b> list = (List) proto.m8832v(this.f5784a.m41155d());
        if (list == null) {
            list = C9906j.m14820i();
        }
        t = C9907k.m14809t(list, 10);
        ArrayList arrayList = new ArrayList(t);
        for (C8541b bVar : list) {
            arrayList.add(this.f5785b.m34072a(bVar, container.m33977b()));
        }
        return arrayList;
    }

    @Override // bi.AbstractC3576f
    /* renamed from: f */
    public List<AbstractC11666c> mo21931f(AbstractC3615z container, AbstractC11724q proto, EnumC3559b kind) {
        List<C8541b> list;
        int t;
        C9971q.m14633g(container, "container");
        C9971q.m14633g(proto, "proto");
        C9971q.m14633g(kind, "kind");
        if (proto instanceof C8547d) {
            list = (List) ((C8547d) proto).m8832v(this.f5784a.m41156c());
        } else if (proto instanceof C8568i) {
            list = (List) ((C8568i) proto).m8832v(this.f5784a.m41153f());
        } else if (proto instanceof C8581n) {
            int i = C3565a.f5786a[kind.ordinal()];
            if (i == 1) {
                list = (List) ((C8581n) proto).m8832v(this.f5784a.m41151h());
            } else if (i == 2) {
                list = (List) ((C8581n) proto).m8832v(this.f5784a.m41150i());
            } else if (i == 3) {
                list = (List) ((C8581n) proto).m8832v(this.f5784a.m41149j());
            } else {
                throw new IllegalStateException("Unsupported callable kind with property proto".toString());
            }
        } else {
            throw new IllegalStateException(("Unknown message: " + proto).toString());
        }
        if (list == null) {
            list = C9906j.m14820i();
        }
        t = C9907k.m14809t(list, 10);
        ArrayList arrayList = new ArrayList(t);
        for (C8541b bVar : list) {
            arrayList.add(this.f5785b.m34072a(bVar, container.m33977b()));
        }
        return arrayList;
    }

    @Override // bi.AbstractC3576f
    /* renamed from: g */
    public List<AbstractC11666c> mo21930g(C8603s proto, AbstractC9874c nameResolver) {
        int t;
        C9971q.m14633g(proto, "proto");
        C9971q.m14633g(nameResolver, "nameResolver");
        List<C8541b> list = (List) proto.m8832v(this.f5784a.m41147l());
        if (list == null) {
            list = C9906j.m14820i();
        }
        t = C9907k.m14809t(list, 10);
        ArrayList arrayList = new ArrayList(t);
        for (C8541b bVar : list) {
            arrayList.add(this.f5785b.m34072a(bVar, nameResolver));
        }
        return arrayList;
    }

    @Override // bi.AbstractC3576f
    /* renamed from: h */
    public List<AbstractC11666c> mo21929h(AbstractC3615z container, AbstractC11724q proto, EnumC3559b kind) {
        List<AbstractC11666c> i;
        C9971q.m14633g(container, "container");
        C9971q.m14633g(proto, "proto");
        C9971q.m14633g(kind, "kind");
        i = C9906j.m14820i();
        return i;
    }

    @Override // bi.AbstractC3576f
    /* renamed from: j */
    public List<AbstractC11666c> mo21928j(AbstractC3615z container, AbstractC11724q callableProto, EnumC3559b kind, int i, C8611u proto) {
        int t;
        C9971q.m14633g(container, "container");
        C9971q.m14633g(callableProto, "callableProto");
        C9971q.m14633g(kind, "kind");
        C9971q.m14633g(proto, "proto");
        List<C8541b> list = (List) proto.m8832v(this.f5784a.m41152g());
        if (list == null) {
            list = C9906j.m14820i();
        }
        t = C9907k.m14809t(list, 10);
        ArrayList arrayList = new ArrayList(t);
        for (C8541b bVar : list) {
            arrayList.add(this.f5785b.m34072a(bVar, container.m33977b()));
        }
        return arrayList;
    }

    @Override // bi.AbstractC3576f
    /* renamed from: k */
    public List<AbstractC11666c> mo21927k(AbstractC3615z container, C8581n proto) {
        List<AbstractC11666c> i;
        C9971q.m14633g(container, "container");
        C9971q.m14633g(proto, "proto");
        i = C9906j.m14820i();
        return i;
    }

    /* renamed from: l */
    public AbstractC13104g<?> mo21943i(AbstractC3615z container, C8581n proto, AbstractC7267g0 expectedType) {
        C9971q.m14633g(container, "container");
        C9971q.m14633g(proto, "proto");
        C9971q.m14633g(expectedType, "expectedType");
        return null;
    }

    /* renamed from: m */
    public AbstractC13104g<?> mo21944e(AbstractC3615z container, C8581n proto, AbstractC7267g0 expectedType) {
        C9971q.m14633g(container, "container");
        C9971q.m14633g(proto, "proto");
        C9971q.m14633g(expectedType, "expectedType");
        C8541b.C0266b.c cVar = (C8541b.C0266b.c) C9877e.m15132a(proto, this.f5784a.m41157b());
        if (cVar == null) {
            return null;
        }
        return this.f5785b.m34067f(expectedType, cVar, container.m33977b());
    }
}
