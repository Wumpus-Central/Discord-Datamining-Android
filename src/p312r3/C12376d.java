package p312r3;

import com.facebook.cache.common.CacheKey;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p024b4.C3381a;
import p057d4.AbstractC6394a;
import p057d4.C6397d;
import p276p3.AbstractC11526a;
import p292q3.AbstractC11980a;
import p292q3.AbstractC11982c;
import p292q3.AbstractC11989i;
import p292q3.C11984d;
import p312r3.AbstractC12373c;
import p344t3.AbstractC12954a;
import p344t3.AbstractC12955b;
import p394w3.C13740j;
import p414x3.C13925a;

/* renamed from: r3.d */
/* loaded from: classes7.dex */
public class C12376d implements AbstractC12384h, AbstractC12954a {

    /* renamed from: r */
    private static final Class<?> f27777r = C12376d.class;

    /* renamed from: s */
    private static final long f27778s = TimeUnit.HOURS.toMillis(2);

    /* renamed from: t */
    private static final long f27779t = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    private final long f27780a;

    /* renamed from: b */
    private final long f27781b;

    /* renamed from: c */
    private final CountDownLatch f27782c;

    /* renamed from: d */
    private long f27783d;

    /* renamed from: e */
    private final AbstractC11982c f27784e;

    /* renamed from: h */
    private final long f27787h;

    /* renamed from: j */
    private final AbstractC12373c f27789j;

    /* renamed from: k */
    private final AbstractC12383g f27790k;

    /* renamed from: l */
    private final AbstractC11980a f27791l;

    /* renamed from: m */
    private final boolean f27792m;

    /* renamed from: q */
    private boolean f27796q;

    /* renamed from: p */
    private final Object f27795p = new Object();

    /* renamed from: i */
    private final C3381a f27788i = C3381a.m34551d();

    /* renamed from: g */
    private long f27786g = -1;

    /* renamed from: n */
    private final C12378b f27793n = new C12378b();

    /* renamed from: o */
    private final AbstractC6394a f27794o = C6397d.m25631a();

    /* renamed from: f */
    final Set<String> f27785f = new HashSet();

    /* renamed from: r3.d$a */
    /* loaded from: classes7.dex */
    class RunnableC12377a implements Runnable {
        RunnableC12377a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C12376d.this.f27795p) {
                C12376d.this.m7026p();
            }
            C12376d.this.f27796q = true;
            C12376d.this.f27782c.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r3.d$b */
    /* loaded from: classes7.dex */
    public static class C12378b {

        /* renamed from: a */
        private boolean f27798a = false;

        /* renamed from: b */
        private long f27799b = -1;

        /* renamed from: c */
        private long f27800c = -1;

        C12378b() {
        }

        /* renamed from: a */
        public synchronized long m7022a() {
            return this.f27800c;
        }

        /* renamed from: b */
        public synchronized long m7021b() {
            return this.f27799b;
        }

        /* renamed from: c */
        public synchronized void m7020c(long j, long j2) {
            if (this.f27798a) {
                this.f27799b += j;
                this.f27800c += j2;
            }
        }

        /* renamed from: d */
        public synchronized boolean m7019d() {
            return this.f27798a;
        }

        /* renamed from: e */
        public synchronized void m7018e() {
            this.f27798a = false;
            this.f27800c = -1L;
            this.f27799b = -1L;
        }

        /* renamed from: f */
        public synchronized void m7017f(long j, long j2) {
            this.f27800c = j2;
            this.f27799b = j;
            this.f27798a = true;
        }
    }

    /* renamed from: r3.d$c */
    /* loaded from: classes7.dex */
    public static class C12379c {

        /* renamed from: a */
        public final long f27801a;

        /* renamed from: b */
        public final long f27802b;

        /* renamed from: c */
        public final long f27803c;

        public C12379c(long j, long j2, long j3) {
            this.f27801a = j;
            this.f27802b = j2;
            this.f27803c = j3;
        }
    }

    public C12376d(AbstractC12373c cVar, AbstractC12383g gVar, C12379c cVar2, AbstractC11982c cVar3, AbstractC11980a aVar, AbstractC12955b bVar, Executor executor, boolean z) {
        this.f27780a = cVar2.f27802b;
        long j = cVar2.f27803c;
        this.f27781b = j;
        this.f27783d = j;
        this.f27789j = cVar;
        this.f27790k = gVar;
        this.f27784e = cVar3;
        this.f27787h = cVar2.f27801a;
        this.f27791l = aVar;
        this.f27792m = z;
        if (bVar != null) {
            bVar.mo4953a(this);
        }
        if (z) {
            this.f27782c = new CountDownLatch(1);
            executor.execute(new RunnableC12377a());
            return;
        }
        this.f27782c = new CountDownLatch(0);
    }

    /* renamed from: l */
    private AbstractC11526a m7030l(AbstractC12373c.AbstractC12375b bVar, CacheKey cacheKey, String str) {
        AbstractC11526a a;
        synchronized (this.f27795p) {
            a = bVar.mo7037a(cacheKey);
            this.f27785f.add(str);
            this.f27793n.m7020c(a.size(), 1L);
        }
        return a;
    }

    /* renamed from: m */
    private void m7029m(long j, AbstractC11982c.EnumC11983a aVar) {
        try {
            Collection<AbstractC12373c.AbstractC12374a> n = m7028n(this.f27789j.mo7010g());
            long b = this.f27793n.m7021b();
            long j2 = b - j;
            int i = 0;
            long j3 = 0;
            for (AbstractC12373c.AbstractC12374a aVar2 : n) {
                if (j3 > j2) {
                    break;
                }
                long h = this.f27789j.mo7009h(aVar2);
                this.f27785f.remove(aVar2.getId());
                if (h > 0) {
                    i++;
                    j3 += h;
                    C12385i e = C12385i.m6996a().m6987j(aVar2.getId()).m6990g(aVar).m6988i(h).m6991f(b - j3).m6992e(j);
                    this.f27784e.mo8062g(e);
                    e.m6995b();
                }
            }
            this.f27793n.m7020c(-j3, -i);
            this.f27789j.mo7015b();
        } catch (IOException e2) {
            AbstractC11980a aVar3 = this.f27791l;
            AbstractC11980a.EnumC0380a aVar4 = AbstractC11980a.EnumC0380a.EVICTION;
            Class<?> cls = f27777r;
            aVar3.mo8070a(aVar4, cls, "evictAboveSize: " + e2.getMessage(), e2);
            throw e2;
        }
    }

    /* renamed from: n */
    private Collection<AbstractC12373c.AbstractC12374a> m7028n(Collection<AbstractC12373c.AbstractC12374a> collection) {
        long now = this.f27794o.now() + f27778s;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        for (AbstractC12373c.AbstractC12374a aVar : collection) {
            if (aVar.mo7038a() > now) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        Collections.sort(arrayList2, this.f27790k.get());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* renamed from: o */
    private void m7027o() {
        synchronized (this.f27795p) {
            boolean p = m7026p();
            m7023s();
            long b = this.f27793n.m7021b();
            if (b > this.f27783d && !p) {
                this.f27793n.m7018e();
                m7026p();
            }
            long j = this.f27783d;
            if (b > j) {
                m7029m((j * 9) / 10, AbstractC11982c.EnumC11983a.CACHE_FULL);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public boolean m7026p() {
        long now = this.f27794o.now();
        if (this.f27793n.m7019d()) {
            long j = this.f27786g;
            if (j != -1 && now - j <= f27779t) {
                return false;
            }
        }
        return m7025q();
    }

    /* renamed from: q */
    private boolean m7025q() {
        Set<String> set;
        long j;
        long now = this.f27794o.now();
        long j2 = f27778s + now;
        if (this.f27792m && this.f27785f.isEmpty()) {
            set = this.f27785f;
        } else if (this.f27792m) {
            set = new HashSet<>();
        } else {
            set = null;
        }
        try {
            long j3 = 0;
            long j4 = -1;
            int i = 0;
            boolean z = false;
            int i2 = 0;
            int i3 = 0;
            for (AbstractC12373c.AbstractC12374a aVar : this.f27789j.mo7010g()) {
                i2++;
                j3 += aVar.getSize();
                if (aVar.mo7038a() > j2) {
                    i3++;
                    i = (int) (i + aVar.getSize());
                    j = j2;
                    j4 = Math.max(aVar.mo7038a() - now, j4);
                    z = true;
                } else {
                    j = j2;
                    if (this.f27792m) {
                        C13740j.m2834g(set);
                        set.add(aVar.getId());
                    }
                }
                j2 = j;
            }
            if (z) {
                this.f27791l.mo8070a(AbstractC11980a.EnumC0380a.READ_INVALID_ENTRY, f27777r, "Future timestamp found in " + i3 + " files , with a total size of " + i + " bytes, and a maximum time delta of " + j4 + "ms", null);
            }
            long j5 = i2;
            if (!(this.f27793n.m7022a() == j5 && this.f27793n.m7021b() == j3)) {
                if (this.f27792m && this.f27785f != set) {
                    C13740j.m2834g(set);
                    this.f27785f.clear();
                    this.f27785f.addAll(set);
                }
                this.f27793n.m7017f(j3, j5);
            }
            this.f27786g = now;
            return true;
        } catch (IOException e) {
            this.f27791l.mo8070a(AbstractC11980a.EnumC0380a.GENERIC_IO, f27777r, "calcFileCacheSize: " + e.getMessage(), e);
            return false;
        }
    }

    /* renamed from: r */
    private AbstractC12373c.AbstractC12375b m7024r(String str, CacheKey cacheKey) {
        m7027o();
        return this.f27789j.mo7013d(str, cacheKey);
    }

    /* renamed from: s */
    private void m7023s() {
        C3381a.EnumC0077a aVar;
        if (this.f27789j.isExternal()) {
            aVar = C3381a.EnumC0077a.EXTERNAL;
        } else {
            aVar = C3381a.EnumC0077a.INTERNAL;
        }
        if (this.f27788i.m34549f(aVar, this.f27781b - this.f27793n.m7021b())) {
            this.f27783d = this.f27780a;
        } else {
            this.f27783d = this.f27781b;
        }
    }

    @Override // p312r3.AbstractC12384h
    /* renamed from: a */
    public void mo7003a() {
        synchronized (this.f27795p) {
            try {
                this.f27789j.mo7016a();
                this.f27785f.clear();
                this.f27784e.mo8065d();
            } catch (IOException | NullPointerException e) {
                AbstractC11980a aVar = this.f27791l;
                AbstractC11980a.EnumC0380a aVar2 = AbstractC11980a.EnumC0380a.EVICTION;
                Class<?> cls = f27777r;
                aVar.mo8070a(aVar2, cls, "clearAll: " + e.getMessage(), e);
            }
            this.f27793n.m7018e();
        }
    }

    @Override // p312r3.AbstractC12384h
    /* renamed from: b */
    public AbstractC11526a mo7002b(CacheKey cacheKey, AbstractC11989i iVar) {
        String a;
        C12385i d = C12385i.m6996a().m6993d(cacheKey);
        this.f27784e.mo8063f(d);
        synchronized (this.f27795p) {
            a = C11984d.m8074a(cacheKey);
        }
        d.m6987j(a);
        try {
            try {
                AbstractC12373c.AbstractC12375b r = m7024r(a, cacheKey);
                try {
                    r.mo7036b(iVar, cacheKey);
                    AbstractC11526a l = m7030l(r, cacheKey, a);
                    d.m6988i(l.size()).m6991f(this.f27793n.m7021b());
                    this.f27784e.mo8061h(d);
                    return l;
                } finally {
                    if (!r.mo7035e()) {
                        C13925a.m2292f(f27777r, "Failed to delete temp file");
                    }
                }
            } finally {
                d.m6995b();
            }
        } catch (IOException e) {
            d.m6989h(e);
            this.f27784e.mo8068a(d);
            C13925a.m2291g(f27777r, "Failed inserting a file into the cache", e);
            throw e;
        }
    }

    @Override // p312r3.AbstractC12384h
    /* renamed from: c */
    public boolean mo7001c(CacheKey cacheKey) {
        String str;
        IOException e;
        String str2 = null;
        try {
            try {
                synchronized (this.f27795p) {
                    try {
                        List<String> b = C11984d.m8073b(cacheKey);
                        int i = 0;
                        while (i < b.size()) {
                            String str3 = b.get(i);
                            if (this.f27789j.mo7014c(str3, cacheKey)) {
                                this.f27785f.add(str3);
                                return true;
                            }
                            i++;
                            str2 = str3;
                        }
                        return false;
                    } catch (Throwable th2) {
                        str = str2;
                        th = th2;
                        try {
                            throw th;
                        } catch (IOException e2) {
                            e = e2;
                            C12385i h = C12385i.m6996a().m6993d(cacheKey).m6987j(str).m6989h(e);
                            this.f27784e.mo8064e(h);
                            h.m6995b();
                            return false;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e3) {
            str = null;
            e = e3;
        }
    }

    @Override // p312r3.AbstractC12384h
    /* renamed from: d */
    public AbstractC11526a mo7000d(CacheKey cacheKey) {
        AbstractC11526a aVar;
        C12385i d = C12385i.m6996a().m6993d(cacheKey);
        try {
            synchronized (this.f27795p) {
                List<String> b = C11984d.m8073b(cacheKey);
                String str = null;
                aVar = null;
                for (int i = 0; i < b.size(); i++) {
                    str = b.get(i);
                    d.m6987j(str);
                    aVar = this.f27789j.mo7011f(str, cacheKey);
                    if (aVar != null) {
                        break;
                    }
                }
                if (aVar == null) {
                    this.f27784e.mo8067b(d);
                    this.f27785f.remove(str);
                } else {
                    C13740j.m2834g(str);
                    this.f27784e.mo8066c(d);
                    this.f27785f.add(str);
                }
            }
            return aVar;
        } catch (IOException e) {
            this.f27791l.mo8070a(AbstractC11980a.EnumC0380a.GENERIC_IO, f27777r, "getResource", e);
            d.m6989h(e);
            this.f27784e.mo8064e(d);
            return null;
        } finally {
            d.m6995b();
        }
    }

    @Override // p312r3.AbstractC12384h
    /* renamed from: e */
    public boolean mo6999e(CacheKey cacheKey) {
        synchronized (this.f27795p) {
            List<String> b = C11984d.m8073b(cacheKey);
            for (int i = 0; i < b.size(); i++) {
                if (this.f27785f.contains(b.get(i))) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // p312r3.AbstractC12384h
    /* renamed from: f */
    public void mo6998f(CacheKey cacheKey) {
        synchronized (this.f27795p) {
            try {
                List<String> b = C11984d.m8073b(cacheKey);
                for (int i = 0; i < b.size(); i++) {
                    String str = b.get(i);
                    this.f27789j.remove(str);
                    this.f27785f.remove(str);
                }
            } catch (IOException e) {
                AbstractC11980a aVar = this.f27791l;
                AbstractC11980a.EnumC0380a aVar2 = AbstractC11980a.EnumC0380a.DELETE_FILE;
                Class<?> cls = f27777r;
                aVar.mo8070a(aVar2, cls, "delete: " + e.getMessage(), e);
            }
        }
    }

    @Override // p312r3.AbstractC12384h
    /* renamed from: g */
    public boolean mo6997g(CacheKey cacheKey) {
        synchronized (this.f27795p) {
            if (mo6999e(cacheKey)) {
                return true;
            }
            try {
                List<String> b = C11984d.m8073b(cacheKey);
                for (int i = 0; i < b.size(); i++) {
                    String str = b.get(i);
                    if (this.f27789j.mo7012e(str, cacheKey)) {
                        this.f27785f.add(str);
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
                return false;
            }
        }
    }
}
