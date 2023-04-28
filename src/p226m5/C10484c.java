package p226m5;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p278p5.AbstractC11547i;
import p380v5.AbstractC13432c;
import p394w3.C13736i;

/* renamed from: m5.c */
/* loaded from: classes7.dex */
public class C10484c {

    /* renamed from: a */
    private final CacheKey f23158a;

    /* renamed from: b */
    private final AbstractC11547i<CacheKey, AbstractC13432c> f23159b;

    /* renamed from: d */
    private final LinkedHashSet<CacheKey> f23161d = new LinkedHashSet<>();

    /* renamed from: c */
    private final AbstractC11547i.AbstractC11549b<CacheKey> f23160c = new C10485a();

    /* renamed from: m5.c$a */
    /* loaded from: classes7.dex */
    class C10485a implements AbstractC11547i.AbstractC11549b<CacheKey> {
        C10485a() {
        }

        /* renamed from: b */
        public void mo9398a(CacheKey cacheKey, boolean z) {
            C10484c.this.m13058f(cacheKey, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m5.c$b */
    /* loaded from: classes7.dex */
    public static class C10486b implements CacheKey {

        /* renamed from: a */
        private final CacheKey f23163a;

        /* renamed from: b */
        private final int f23164b;

        public C10486b(CacheKey cacheKey, int i) {
            this.f23163a = cacheKey;
            this.f23164b = i;
        }

        @Override // com.facebook.cache.common.CacheKey
        /* renamed from: a */
        public String mo256a() {
            return null;
        }

        @Override // com.facebook.cache.common.CacheKey
        /* renamed from: b */
        public boolean mo255b(Uri uri) {
            return this.f23163a.mo255b(uri);
        }

        @Override // com.facebook.cache.common.CacheKey
        /* renamed from: c */
        public boolean mo254c() {
            return false;
        }

        @Override // com.facebook.cache.common.CacheKey
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C10486b)) {
                return false;
            }
            C10486b bVar = (C10486b) obj;
            if (this.f23164b != bVar.f23164b || !this.f23163a.equals(bVar.f23163a)) {
                return false;
            }
            return true;
        }

        @Override // com.facebook.cache.common.CacheKey
        public int hashCode() {
            return (this.f23163a.hashCode() * 1013) + this.f23164b;
        }

        public String toString() {
            return C13736i.m2846c(this).m2844b("imageCacheKey", this.f23163a).m2845a("frameIndex", this.f23164b).toString();
        }
    }

    public C10484c(CacheKey cacheKey, AbstractC11547i<CacheKey, AbstractC13432c> iVar) {
        this.f23158a = cacheKey;
        this.f23159b = iVar;
    }

    /* renamed from: e */
    private C10486b m13059e(int i) {
        return new C10486b(this.f23158a, i);
    }

    /* renamed from: g */
    private synchronized CacheKey m13057g() {
        CacheKey cacheKey;
        Iterator<CacheKey> it = this.f23161d.iterator();
        if (it.hasNext()) {
            cacheKey = it.next();
            it.remove();
        } else {
            cacheKey = null;
        }
        return cacheKey;
    }

    /* renamed from: a */
    public CloseableReference<AbstractC13432c> m13063a(int i, CloseableReference<AbstractC13432c> closeableReference) {
        return this.f23159b.mo9378f(m13059e(i), closeableReference, this.f23160c);
    }

    /* renamed from: b */
    public boolean m13062b(int i) {
        return this.f23159b.contains(m13059e(i));
    }

    /* renamed from: c */
    public CloseableReference<AbstractC13432c> m13061c(int i) {
        return this.f23159b.get(m13059e(i));
    }

    /* renamed from: d */
    public CloseableReference<AbstractC13432c> m13060d() {
        CloseableReference<AbstractC13432c> c;
        do {
            CacheKey g = m13057g();
            if (g == null) {
                return null;
            }
            c = this.f23159b.mo9379c(g);
        } while (c == null);
        return c;
    }

    /* renamed from: f */
    public synchronized void m13058f(CacheKey cacheKey, boolean z) {
        if (z) {
            this.f23161d.add(cacheKey);
        } else {
            this.f23161d.remove(cacheKey);
        }
    }
}
