package p292q3;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import java.util.List;
import p394w3.C13740j;

/* renamed from: q3.e */
/* loaded from: classes7.dex */
public class C11985e implements CacheKey {

    /* renamed from: a */
    final List<CacheKey> f26836a;

    public C11985e(List<CacheKey> list) {
        this.f26836a = (List) C13740j.m2834g(list);
    }

    @Override // com.facebook.cache.common.CacheKey
    /* renamed from: a */
    public String mo256a() {
        return this.f26836a.get(0).mo256a();
    }

    @Override // com.facebook.cache.common.CacheKey
    /* renamed from: b */
    public boolean mo255b(Uri uri) {
        for (int i = 0; i < this.f26836a.size(); i++) {
            if (this.f26836a.get(i).mo255b(uri)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.cache.common.CacheKey
    /* renamed from: c */
    public boolean mo254c() {
        return false;
    }

    /* renamed from: d */
    public List<CacheKey> m8071d() {
        return this.f26836a;
    }

    @Override // com.facebook.cache.common.CacheKey
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11985e) {
            return this.f26836a.equals(((C11985e) obj).f26836a);
        }
        return false;
    }

    @Override // com.facebook.cache.common.CacheKey
    public int hashCode() {
        return this.f26836a.hashCode();
    }

    public String toString() {
        return "MultiCacheKey:" + this.f26836a.toString();
    }
}
