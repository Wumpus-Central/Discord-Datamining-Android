package p314r5;

import com.facebook.cache.disk.DiskCacheConfig;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import p312r3.AbstractC12373c;
import p312r3.AbstractC12384h;
import p312r3.C12376d;

/* renamed from: r5.b */
/* loaded from: classes7.dex */
public class C12388b implements AbstractC12392f {

    /* renamed from: a */
    private AbstractC12389c f27842a;

    public C12388b(AbstractC12389c cVar) {
        this.f27842a = cVar;
    }

    /* renamed from: b */
    public static C12376d m6968b(DiskCacheConfig diskCacheConfig, AbstractC12373c cVar) {
        return m6967c(diskCacheConfig, cVar, Executors.newSingleThreadExecutor());
    }

    /* renamed from: c */
    public static C12376d m6967c(DiskCacheConfig diskCacheConfig, AbstractC12373c cVar, Executor executor) {
        return new C12376d(cVar, diskCacheConfig.m32063h(), new C12376d.C12379c(diskCacheConfig.m32060k(), diskCacheConfig.m32061j(), diskCacheConfig.m32065f()), diskCacheConfig.m32066e(), diskCacheConfig.m32067d(), diskCacheConfig.m32064g(), executor, diskCacheConfig.m32062i());
    }

    @Override // p314r5.AbstractC12392f
    /* renamed from: a */
    public AbstractC12384h mo6958a(DiskCacheConfig diskCacheConfig) {
        return m6968b(diskCacheConfig, this.f27842a.mo6966a(diskCacheConfig));
    }
}
