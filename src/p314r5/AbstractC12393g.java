package p314r5;

import android.content.Context;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.disk.DiskCacheConfig;
import com.facebook.common.internal.Supplier;
import com.facebook.imagepipeline.cache.MemoryCacheParams;
import com.facebook.imagepipeline.core.C4904a;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import java.util.Set;
import p026b6.AbstractC3388d;
import p278p5.AbstractC11534a;
import p278p5.AbstractC11543f;
import p278p5.AbstractC11547i;
import p278p5.AbstractC11557o;
import p278p5.AbstractC11564s;
import p332s3.AbstractC12782a;
import p334s5.AbstractC12785a;
import p346t5.AbstractC12962c;
import p346t5.AbstractC12964e;
import p346t5.C12963d;
import p359u3.AbstractExecutorServiceC13188f;
import p416x5.AbstractC13937d;
import p437y5.C14256y;
import p455z3.AbstractC14531c;
import p455z3.AbstractC14535g;

/* renamed from: r5.g */
/* loaded from: classes7.dex */
public interface AbstractC12393g {
    /* renamed from: A */
    AbstractC11557o mo6957A();

    /* renamed from: B */
    AbstractC14531c mo6956B();

    /* renamed from: C */
    AbstractC12782a mo6955C();

    /* renamed from: D */
    C4904a mo6954D();

    /* renamed from: E */
    AbstractC12391e mo6953E();

    /* renamed from: a */
    Set<AbstractC13937d> mo6952a();

    /* renamed from: b */
    Supplier<Boolean> mo6951b();

    /* renamed from: c */
    NetworkFetcher mo6950c();

    /* renamed from: d */
    AbstractC11564s<CacheKey, AbstractC14535g> mo6949d();

    /* renamed from: e */
    DiskCacheConfig mo6948e();

    /* renamed from: f */
    Set<RequestListener> mo6947f();

    /* renamed from: g */
    AbstractC11564s.AbstractC11565a mo6946g();

    Context getContext();

    /* renamed from: h */
    AbstractC12964e mo6945h();

    /* renamed from: i */
    DiskCacheConfig mo6944i();

    /* renamed from: j */
    AbstractC11547i.AbstractC11549b<CacheKey> mo6943j();

    /* renamed from: k */
    boolean mo6942k();

    /* renamed from: l */
    AbstractExecutorServiceC13188f mo6941l();

    /* renamed from: m */
    Integer mo6940m();

    /* renamed from: n */
    AbstractC3388d mo6939n();

    /* renamed from: o */
    C12963d mo6938o();

    /* renamed from: p */
    boolean mo6937p();

    /* renamed from: q */
    Supplier<MemoryCacheParams> mo6936q();

    /* renamed from: r */
    AbstractC12962c mo6935r();

    /* renamed from: s */
    Supplier<MemoryCacheParams> mo6934s();

    /* renamed from: t */
    C14256y mo6933t();

    /* renamed from: u */
    int mo6932u();

    /* renamed from: v */
    AbstractC12392f mo6931v();

    /* renamed from: w */
    AbstractC12785a mo6930w();

    /* renamed from: x */
    AbstractC11534a mo6929x();

    /* renamed from: y */
    AbstractC11543f mo6928y();

    /* renamed from: z */
    boolean mo6927z();
}
