package com.facebook.fresco.animation.factory;

import android.content.Context;
import android.graphics.Rect;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import java.util.concurrent.ExecutorService;
import p058d5.C6398a;
import p191k5.AbstractC9748a;
import p191k5.C9753e;
import p209l5.AbstractC10341a;
import p209l5.AbstractC10344d;
import p209l5.C10345e;
import p226m5.AbstractC10483b;
import p226m5.C10482a;
import p241n5.C10717a;
import p278p5.AbstractC11547i;
import p314r5.AbstractC12391e;
import p346t5.AbstractC12962c;
import p359u3.AbstractExecutorServiceC13188f;
import p359u3.C13185c;
import p359u3.C13190h;
import p361u5.AbstractC13192a;
import p380v5.AbstractC13432c;
import p380v5.AbstractC13438i;
import p380v5.C13434e;
import p394w3.AbstractC13731d;
import p394w3.C13743m;

@AbstractC13731d
/* loaded from: classes7.dex */
public class AnimatedFactoryV2Impl implements AbstractC10341a {

    /* renamed from: a */
    private final PlatformBitmapFactory f7857a;

    /* renamed from: b */
    private final AbstractC12391e f7858b;

    /* renamed from: c */
    private final AbstractC11547i<CacheKey, AbstractC13432c> f7859c;

    /* renamed from: d */
    private final boolean f7860d;

    /* renamed from: e */
    private AbstractC10344d f7861e;

    /* renamed from: f */
    private AbstractC10483b f7862f;

    /* renamed from: g */
    private C10717a f7863g;

    /* renamed from: h */
    private AbstractC13192a f7864h;

    /* renamed from: i */
    private AbstractExecutorServiceC13188f f7865i;

    /* renamed from: com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl$a */
    /* loaded from: classes7.dex */
    class C4839a implements AbstractC12962c {
        C4839a() {
        }

        @Override // p346t5.AbstractC12962c
        /* renamed from: a */
        public AbstractC13432c mo4939a(C13434e eVar, int i, AbstractC13438i iVar, ImageDecodeOptions imageDecodeOptions) {
            return AnimatedFactoryV2Impl.this.m31647k().mo13572a(eVar, imageDecodeOptions, imageDecodeOptions.f8133h);
        }
    }

    /* renamed from: com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl$b */
    /* loaded from: classes7.dex */
    class C4840b implements AbstractC12962c {
        C4840b() {
        }

        @Override // p346t5.AbstractC12962c
        /* renamed from: a */
        public AbstractC13432c mo4939a(C13434e eVar, int i, AbstractC13438i iVar, ImageDecodeOptions imageDecodeOptions) {
            return AnimatedFactoryV2Impl.this.m31647k().mo13571b(eVar, imageDecodeOptions, imageDecodeOptions.f8133h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl$c */
    /* loaded from: classes7.dex */
    public class C4841c implements Supplier<Integer> {
        C4841c() {
        }

        /* renamed from: a */
        public Integer get() {
            return 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl$d */
    /* loaded from: classes7.dex */
    public class C4842d implements Supplier<Integer> {
        C4842d() {
        }

        /* renamed from: a */
        public Integer get() {
            return 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl$e */
    /* loaded from: classes7.dex */
    public class C4843e implements AbstractC10483b {
        C4843e() {
        }

        @Override // p226m5.AbstractC10483b
        /* renamed from: a */
        public AbstractC9748a mo13064a(C9753e eVar, Rect rect) {
            return new C10482a(AnimatedFactoryV2Impl.this.m31648j(), eVar, rect, AnimatedFactoryV2Impl.this.f7860d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl$f */
    /* loaded from: classes7.dex */
    public class C4844f implements AbstractC10483b {
        C4844f() {
        }

        @Override // p226m5.AbstractC10483b
        /* renamed from: a */
        public AbstractC9748a mo13064a(C9753e eVar, Rect rect) {
            return new C10482a(AnimatedFactoryV2Impl.this.m31648j(), eVar, rect, AnimatedFactoryV2Impl.this.f7860d);
        }
    }

    @AbstractC13731d
    public AnimatedFactoryV2Impl(PlatformBitmapFactory platformBitmapFactory, AbstractC12391e eVar, AbstractC11547i<CacheKey, AbstractC13432c> iVar, boolean z, AbstractExecutorServiceC13188f fVar) {
        this.f7857a = platformBitmapFactory;
        this.f7858b = eVar;
        this.f7859c = iVar;
        this.f7860d = z;
        this.f7865i = fVar;
    }

    /* renamed from: g */
    private AbstractC10344d m31651g() {
        return new C10345e(new C4844f(), this.f7857a);
    }

    /* renamed from: h */
    private C6398a m31650h() {
        C4841c cVar = new C4841c();
        ExecutorService executorService = this.f7865i;
        if (executorService == null) {
            executorService = new C13185c(this.f7858b.mo6962d());
        }
        return new C6398a(m31649i(), C13190h.m4376g(), executorService, RealtimeSinceBootClock.get(), this.f7857a, this.f7859c, cVar, new C4842d(), C13743m.f30712b);
    }

    /* renamed from: i */
    private AbstractC10483b m31649i() {
        if (this.f7862f == null) {
            this.f7862f = new C4843e();
        }
        return this.f7862f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public C10717a m31648j() {
        if (this.f7863g == null) {
            this.f7863g = new C10717a();
        }
        return this.f7863g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public AbstractC10344d m31647k() {
        if (this.f7861e == null) {
            this.f7861e = m31651g();
        }
        return this.f7861e;
    }

    @Override // p209l5.AbstractC10341a
    /* renamed from: a */
    public AbstractC13192a mo13578a(Context context) {
        if (this.f7864h == null) {
            this.f7864h = m31650h();
        }
        return this.f7864h;
    }

    @Override // p209l5.AbstractC10341a
    /* renamed from: b */
    public AbstractC12962c mo13577b() {
        return new C4840b();
    }

    @Override // p209l5.AbstractC10341a
    /* renamed from: c */
    public AbstractC12962c mo13576c() {
        return new C4839a();
    }
}
