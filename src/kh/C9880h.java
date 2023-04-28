package kh;

import java.util.List;
import kotlin.collections.C9906j;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p159ih.C8614v;
import p159ih.C8621w;

/* renamed from: kh.h */
/* loaded from: classes8.dex */
public final class C9880h {

    /* renamed from: b */
    public static final C9881a f22033b = new C9881a(null);

    /* renamed from: c */
    private static final C9880h f22034c;

    /* renamed from: a */
    private final List<C8614v> f22035a;

    /* renamed from: kh.h$a */
    /* loaded from: classes8.dex */
    public static final class C9881a {
        private C9881a() {
        }

        public /* synthetic */ C9881a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C9880h m15108a(C8621w table) {
            C9971q.m14633g(table, "table");
            if (table.m18500w() == 0) {
                return m15107b();
            }
            List<C8614v> x = table.m18499x();
            C9971q.m14634f(x, "table.requirementList");
            return new C9880h(x, null);
        }

        /* renamed from: b */
        public final C9880h m15107b() {
            return C9880h.f22034c;
        }
    }

    static {
        List i;
        i = C9906j.m14820i();
        f22034c = new C9880h(i);
    }

    private C9880h(List<C8614v> list) {
        this.f22035a = list;
    }

    public /* synthetic */ C9880h(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }
}
