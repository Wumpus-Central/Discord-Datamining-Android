package p380v5;

import com.facebook.imagepipeline.image.ImageInfo;
import java.io.Closeable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p414x3.C13925a;

/* renamed from: v5.c */
/* loaded from: classes7.dex */
public abstract class AbstractC13432c implements Closeable, ImageInfo {

    /* renamed from: l */
    private static final Set<String> f29978l = new HashSet(Arrays.asList("encoded_size", "encoded_width", "encoded_height", "uri_source", "image_format", "bitmap_config", "is_rounded"));

    /* renamed from: k */
    private Map<String, Object> f29979k = new HashMap();

    /* renamed from: b */
    public AbstractC13438i mo3734b() {
        return C13437h.f30004d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    protected void finalize() {
        if (!isClosed()) {
            C13925a.m2302J("CloseableImage", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }

    /* renamed from: g */
    public abstract int mo3733g();

    @Override // p380v5.AbstractC13436g
    public Map<String, Object> getExtras() {
        return this.f29979k;
    }

    /* renamed from: h */
    public boolean mo3738h() {
        return false;
    }

    /* renamed from: i */
    public void m3737i(String str, Object obj) {
        if (f29978l.contains(str)) {
            this.f29979k.put(str, obj);
        }
    }

    public abstract boolean isClosed();

    /* renamed from: l */
    public void m3736l(Map<String, Object> map) {
        if (map != null) {
            for (String str : f29978l) {
                Object obj = map.get(str);
                if (obj != null) {
                    this.f29979k.put(str, obj);
                }
            }
        }
    }
}
