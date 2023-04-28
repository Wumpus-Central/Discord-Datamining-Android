package p292q3;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import p394w3.C13740j;

/* renamed from: q3.h */
/* loaded from: classes7.dex */
public class C11988h implements CacheKey {

    /* renamed from: a */
    final String f26839a;

    /* renamed from: b */
    final boolean f26840b;

    public C11988h(String str) {
        this(str, false);
    }

    @Override // com.facebook.cache.common.CacheKey
    /* renamed from: a */
    public String mo256a() {
        return this.f26839a;
    }

    @Override // com.facebook.cache.common.CacheKey
    /* renamed from: b */
    public boolean mo255b(Uri uri) {
        return this.f26839a.contains(uri.toString());
    }

    @Override // com.facebook.cache.common.CacheKey
    /* renamed from: c */
    public boolean mo254c() {
        return this.f26840b;
    }

    @Override // com.facebook.cache.common.CacheKey
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11988h) {
            return this.f26839a.equals(((C11988h) obj).f26839a);
        }
        return false;
    }

    @Override // com.facebook.cache.common.CacheKey
    public int hashCode() {
        return this.f26839a.hashCode();
    }

    public String toString() {
        return this.f26839a;
    }

    public C11988h(String str, boolean z) {
        this.f26839a = (String) C13740j.m2834g(str);
        this.f26840b = z;
    }
}
