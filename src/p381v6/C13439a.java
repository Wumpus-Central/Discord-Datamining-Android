package p381v6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p284pc.AbstractC11612d;
import p315r6.AbstractC12425l;

/* renamed from: v6.a */
/* loaded from: classes7.dex */
public final class C13439a {

    /* renamed from: e */
    private static final C13439a f30008e = new C0436a().m3683b();

    /* renamed from: a */
    private final C13449f f30009a;

    /* renamed from: b */
    private final List<C13445d> f30010b;

    /* renamed from: c */
    private final C13440b f30011c;

    /* renamed from: d */
    private final String f30012d;

    /* renamed from: v6.a$a */
    /* loaded from: classes7.dex */
    public static final class C0436a {

        /* renamed from: a */
        private C13449f f30013a = null;

        /* renamed from: b */
        private List<C13445d> f30014b = new ArrayList();

        /* renamed from: c */
        private C13440b f30015c = null;

        /* renamed from: d */
        private String f30016d = "";

        C0436a() {
        }

        /* renamed from: a */
        public C0436a m3684a(C13445d dVar) {
            this.f30014b.add(dVar);
            return this;
        }

        /* renamed from: b */
        public C13439a m3683b() {
            return new C13439a(this.f30013a, Collections.unmodifiableList(this.f30014b), this.f30015c, this.f30016d);
        }

        /* renamed from: c */
        public C0436a m3682c(String str) {
            this.f30016d = str;
            return this;
        }

        /* renamed from: d */
        public C0436a m3681d(C13440b bVar) {
            this.f30015c = bVar;
            return this;
        }

        /* renamed from: e */
        public C0436a m3680e(C13449f fVar) {
            this.f30013a = fVar;
            return this;
        }
    }

    C13439a(C13449f fVar, List<C13445d> list, C13440b bVar, String str) {
        this.f30009a = fVar;
        this.f30010b = list;
        this.f30011c = bVar;
        this.f30012d = str;
    }

    /* renamed from: e */
    public static C0436a m3686e() {
        return new C0436a();
    }

    @AbstractC11612d(tag = 4)
    /* renamed from: a */
    public String m3690a() {
        return this.f30012d;
    }

    @AbstractC11612d(tag = 3)
    /* renamed from: b */
    public C13440b m3689b() {
        return this.f30011c;
    }

    @AbstractC11612d(tag = 2)
    /* renamed from: c */
    public List<C13445d> m3688c() {
        return this.f30010b;
    }

    @AbstractC11612d(tag = 1)
    /* renamed from: d */
    public C13449f m3687d() {
        return this.f30009a;
    }

    /* renamed from: f */
    public byte[] m3685f() {
        return AbstractC12425l.m6817a(this);
    }
}
