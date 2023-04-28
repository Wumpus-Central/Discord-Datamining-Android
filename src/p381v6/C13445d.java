package p381v6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p284pc.AbstractC11612d;

/* renamed from: v6.d */
/* loaded from: classes7.dex */
public final class C13445d {

    /* renamed from: c */
    private static final C13445d f30034c = new C13446a().m3666a();

    /* renamed from: a */
    private final String f30035a;

    /* renamed from: b */
    private final List<C13442c> f30036b;

    /* renamed from: v6.d$a */
    /* loaded from: classes7.dex */
    public static final class C13446a {

        /* renamed from: a */
        private String f30037a = "";

        /* renamed from: b */
        private List<C13442c> f30038b = new ArrayList();

        C13446a() {
        }

        /* renamed from: a */
        public C13445d m3666a() {
            return new C13445d(this.f30037a, Collections.unmodifiableList(this.f30038b));
        }

        /* renamed from: b */
        public C13446a m3665b(List<C13442c> list) {
            this.f30038b = list;
            return this;
        }

        /* renamed from: c */
        public C13446a m3664c(String str) {
            this.f30037a = str;
            return this;
        }
    }

    C13445d(String str, List<C13442c> list) {
        this.f30035a = str;
        this.f30036b = list;
    }

    /* renamed from: c */
    public static C13446a m3667c() {
        return new C13446a();
    }

    @AbstractC11612d(tag = 2)
    /* renamed from: a */
    public List<C13442c> m3669a() {
        return this.f30036b;
    }

    @AbstractC11612d(tag = 1)
    /* renamed from: b */
    public String m3668b() {
        return this.f30035a;
    }
}
