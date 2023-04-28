package p420x9;

import android.accounts.Account;
import android.view.View;
import androidx.collection.C2095b;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p012ab.C1351a;
import p384v9.C13456a;

/* renamed from: x9.d */
/* loaded from: classes5.dex */
public final class C13964d {

    /* renamed from: a */
    private final Account f31482a;

    /* renamed from: b */
    private final Set<Scope> f31483b;

    /* renamed from: c */
    private final Set<Scope> f31484c;

    /* renamed from: d */
    private final Map<C13456a<?>, C13952a0> f31485d;

    /* renamed from: e */
    private final int f31486e;

    /* renamed from: f */
    private final View f31487f;

    /* renamed from: g */
    private final String f31488g;

    /* renamed from: h */
    private final String f31489h;

    /* renamed from: i */
    private final C1351a f31490i;

    /* renamed from: j */
    private Integer f31491j;

    /* renamed from: x9.d$a */
    /* loaded from: classes5.dex */
    public static final class C13965a {

        /* renamed from: a */
        private Account f31492a;

        /* renamed from: b */
        private C2095b<Scope> f31493b;

        /* renamed from: c */
        private String f31494c;

        /* renamed from: d */
        private String f31495d;

        /* renamed from: e */
        private C1351a f31496e = C1351a.f284t;

        /* renamed from: a */
        public C13964d m2131a() {
            return new C13964d(this.f31492a, this.f31493b, null, 0, null, this.f31494c, this.f31495d, this.f31496e, false);
        }

        /* renamed from: b */
        public C13965a m2130b(String str) {
            this.f31494c = str;
            return this;
        }

        /* renamed from: c */
        public final C13965a m2129c(Collection<Scope> collection) {
            if (this.f31493b == null) {
                this.f31493b = new C2095b<>();
            }
            this.f31493b.addAll(collection);
            return this;
        }

        /* renamed from: d */
        public final C13965a m2128d(Account account) {
            this.f31492a = account;
            return this;
        }

        /* renamed from: e */
        public final C13965a m2127e(String str) {
            this.f31495d = str;
            return this;
        }
    }

    public C13964d(Account account, Set<Scope> set, Map<C13456a<?>, C13952a0> map, int i, View view, String str, String str2, C1351a aVar, boolean z) {
        Set<Scope> set2;
        this.f31482a = account;
        if (set == null) {
            set2 = Collections.emptySet();
        } else {
            set2 = Collections.unmodifiableSet(set);
        }
        this.f31483b = set2;
        map = map == null ? Collections.emptyMap() : map;
        this.f31485d = map;
        this.f31487f = view;
        this.f31486e = i;
        this.f31488g = str;
        this.f31489h = str2;
        this.f31490i = aVar == null ? C1351a.f284t : aVar;
        HashSet hashSet = new HashSet(set2);
        for (C13952a0 a0Var : map.values()) {
            hashSet.addAll(a0Var.f31453a);
        }
        this.f31484c = Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: a */
    public Account m2142a() {
        return this.f31482a;
    }

    @Deprecated
    /* renamed from: b */
    public String m2141b() {
        Account account = this.f31482a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    /* renamed from: c */
    public Account m2140c() {
        Account account = this.f31482a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    /* renamed from: d */
    public Set<Scope> m2139d() {
        return this.f31484c;
    }

    /* renamed from: e */
    public Set<Scope> m2138e(C13456a<?> aVar) {
        C13952a0 a0Var = this.f31485d.get(aVar);
        if (a0Var == null || a0Var.f31453a.isEmpty()) {
            return this.f31483b;
        }
        HashSet hashSet = new HashSet(this.f31483b);
        hashSet.addAll(a0Var.f31453a);
        return hashSet;
    }

    /* renamed from: f */
    public String m2137f() {
        return this.f31488g;
    }

    /* renamed from: g */
    public Set<Scope> m2136g() {
        return this.f31483b;
    }

    /* renamed from: h */
    public final C1351a m2135h() {
        return this.f31490i;
    }

    /* renamed from: i */
    public final Integer m2134i() {
        return this.f31491j;
    }

    /* renamed from: j */
    public final String m2133j() {
        return this.f31489h;
    }

    /* renamed from: k */
    public final void m2132k(Integer num) {
        this.f31491j = num;
    }
}
