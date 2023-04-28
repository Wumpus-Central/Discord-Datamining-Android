package p292q3;

import com.facebook.cache.common.CacheKey;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import p076e4.C6702c;

/* renamed from: q3.d */
/* loaded from: classes7.dex */
public final class C11984d {
    /* renamed from: a */
    public static String m8074a(CacheKey cacheKey) {
        try {
            if (cacheKey instanceof C11985e) {
                return m8072c(((C11985e) cacheKey).m8071d().get(0));
            }
            return m8072c(cacheKey);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public static List<String> m8073b(CacheKey cacheKey) {
        ArrayList arrayList;
        String str;
        try {
            if (cacheKey instanceof C11985e) {
                List<CacheKey> d = ((C11985e) cacheKey).m8071d();
                arrayList = new ArrayList(d.size());
                for (int i = 0; i < d.size(); i++) {
                    arrayList.add(m8072c(d.get(i)));
                }
            } else {
                arrayList = new ArrayList(1);
                if (cacheKey.mo254c()) {
                    str = cacheKey.mo256a();
                } else {
                    str = m8072c(cacheKey);
                }
                arrayList.add(str);
            }
            return arrayList;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    private static String m8072c(CacheKey cacheKey) {
        return C6702c.m24614a(cacheKey.mo256a().getBytes("UTF-8"));
    }
}
