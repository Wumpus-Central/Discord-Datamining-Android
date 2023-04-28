package p448yh;

import java.util.Collection;
import java.util.Set;
import kotlin.collections.C9921w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import p249nh.C11142f;
import p268og.AbstractC11388u0;
import p268og.AbstractC11404z0;
import p406wg.AbstractC13878b;

/* renamed from: yh.h */
/* loaded from: classes8.dex */
public interface AbstractC14411h extends AbstractC14416k {

    /* renamed from: a */
    public static final C14412a f32622a = C14412a.f32623a;

    /* renamed from: yh.h$a */
    /* loaded from: classes8.dex */
    public static final class C14412a {

        /* renamed from: a */
        static final /* synthetic */ C14412a f32623a = new C14412a();

        /* renamed from: b */
        private static final Function1<C11142f, Boolean> f32624b = C0470a.f32625k;

        /* renamed from: yh.h$a$a */
        /* loaded from: classes8.dex */
        static final class C0470a extends AbstractC9973s implements Function1<C11142f, Boolean> {

            /* renamed from: k */
            public static final C0470a f32625k = new C0470a();

            C0470a() {
                super(1);
            }

            /* renamed from: a */
            public final Boolean invoke(C11142f it) {
                C9971q.m14633g(it, "it");
                return Boolean.TRUE;
            }
        }

        private C14412a() {
        }

        /* renamed from: a */
        public final Function1<C11142f, Boolean> m648a() {
            return f32624b;
        }
    }

    /* renamed from: yh.h$b */
    /* loaded from: classes8.dex */
    public static final class C14413b extends AbstractC14414i {

        /* renamed from: b */
        public static final C14413b f32626b = new C14413b();

        private C14413b() {
        }

        @Override // p448yh.AbstractC14414i, p448yh.AbstractC14411h
        /* renamed from: b */
        public Set<C11142f> mo638b() {
            Set<C11142f> d;
            d = C9921w.m14722d();
            return d;
        }

        @Override // p448yh.AbstractC14414i, p448yh.AbstractC14411h
        /* renamed from: c */
        public Set<C11142f> mo637c() {
            Set<C11142f> d;
            d = C9921w.m14722d();
            return d;
        }

        @Override // p448yh.AbstractC14414i, p448yh.AbstractC14411h
        /* renamed from: g */
        public Set<C11142f> mo635g() {
            Set<C11142f> d;
            d = C9921w.m14722d();
            return d;
        }
    }

    /* renamed from: a */
    Collection<? extends AbstractC11388u0> mo627a(C11142f fVar, AbstractC13878b bVar);

    /* renamed from: b */
    Set<C11142f> mo638b();

    /* renamed from: c */
    Set<C11142f> mo637c();

    /* renamed from: d */
    Collection<? extends AbstractC11404z0> mo626d(C11142f fVar, AbstractC13878b bVar);

    /* renamed from: g */
    Set<C11142f> mo635g();
}
