package p456z4;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;

/* renamed from: z4.a */
/* loaded from: classes7.dex */
public class C14541a implements CacheKey {

    /* renamed from: a */
    private final String f32966a;

    /* renamed from: b */
    private final boolean f32967b;

    public C14541a(int i, boolean z) {
        this.f32966a = "anim://" + i;
        this.f32967b = z;
    }

    @Override // com.facebook.cache.common.CacheKey
    /* renamed from: a */
    public String mo256a() {
        return this.f32966a;
    }

    @Override // com.facebook.cache.common.CacheKey
    /* renamed from: b */
    public boolean mo255b(Uri uri) {
        return uri.toString().startsWith(this.f32966a);
    }

    @Override // com.facebook.cache.common.CacheKey
    /* renamed from: c */
    public boolean mo254c() {
        return false;
    }

    @Override // com.facebook.cache.common.CacheKey
    public boolean equals(Object obj) {
        if (!this.f32967b) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f32966a.equals(((C14541a) obj).f32966a);
    }

    @Override // com.facebook.cache.common.CacheKey
    public int hashCode() {
        if (!this.f32967b) {
            return super.hashCode();
        }
        return this.f32966a.hashCode();
    }
}
