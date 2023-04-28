package p278p5;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import p076e4.C6701b;
import p394w3.C13736i;
import p394w3.C13740j;

/* renamed from: p5.b */
/* loaded from: classes7.dex */
public class C11535b implements CacheKey {

    /* renamed from: a */
    private final String f25747a;

    /* renamed from: b */
    private final ResizeOptions f25748b;

    /* renamed from: c */
    private final RotationOptions f25749c;

    /* renamed from: d */
    private final ImageDecodeOptions f25750d;

    /* renamed from: e */
    private final CacheKey f25751e;

    /* renamed from: f */
    private final String f25752f;

    /* renamed from: g */
    private final int f25753g;

    /* renamed from: h */
    private final Object f25754h;

    /* renamed from: i */
    private final long f25755i;

    public C11535b(String str, ResizeOptions resizeOptions, RotationOptions rotationOptions, ImageDecodeOptions imageDecodeOptions, CacheKey cacheKey, String str2, Object obj) {
        int i;
        this.f25747a = (String) C13740j.m2834g(str);
        this.f25748b = resizeOptions;
        this.f25749c = rotationOptions;
        this.f25750d = imageDecodeOptions;
        this.f25751e = cacheKey;
        this.f25752f = str2;
        Integer valueOf = Integer.valueOf(str.hashCode());
        if (resizeOptions != null) {
            i = resizeOptions.hashCode();
        } else {
            i = 0;
        }
        this.f25753g = C6701b.m24615d(valueOf, Integer.valueOf(i), Integer.valueOf(rotationOptions.hashCode()), imageDecodeOptions, cacheKey, str2);
        this.f25754h = obj;
        this.f25755i = RealtimeSinceBootClock.get().now();
    }

    @Override // com.facebook.cache.common.CacheKey
    /* renamed from: a */
    public String mo256a() {
        return this.f25747a;
    }

    @Override // com.facebook.cache.common.CacheKey
    /* renamed from: b */
    public boolean mo255b(Uri uri) {
        return mo256a().contains(uri.toString());
    }

    @Override // com.facebook.cache.common.CacheKey
    /* renamed from: c */
    public boolean mo254c() {
        return false;
    }

    @Override // com.facebook.cache.common.CacheKey
    public boolean equals(Object obj) {
        if (!(obj instanceof C11535b)) {
            return false;
        }
        C11535b bVar = (C11535b) obj;
        if (this.f25753g != bVar.f25753g || !this.f25747a.equals(bVar.f25747a) || !C13736i.m2848a(this.f25748b, bVar.f25748b) || !C13736i.m2848a(this.f25749c, bVar.f25749c) || !C13736i.m2848a(this.f25750d, bVar.f25750d) || !C13736i.m2848a(this.f25751e, bVar.f25751e) || !C13736i.m2848a(this.f25752f, bVar.f25752f)) {
            return false;
        }
        return true;
    }

    @Override // com.facebook.cache.common.CacheKey
    public int hashCode() {
        return this.f25753g;
    }

    public String toString() {
        return String.format(null, "%s_%s_%s_%s_%s_%s_%d", this.f25747a, this.f25748b, this.f25749c, this.f25750d, this.f25751e, this.f25752f, Integer.valueOf(this.f25753g));
    }
}
