package androidx.camera.video.internal.encoder;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.util.Range;
import android.view.Surface;
import androidx.camera.core.C1915r1;
import androidx.camera.video.internal.encoder.AbstractC2013j;
import androidx.camera.video.internal.encoder.C1981a0;
import androidx.concurrent.futures.C2114c;
import androidx.core.util.C2517g;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p120gc.AbstractFutureC7576b;
import p186k0.AbstractC9712j;
import p186k0.C9714k;
import p221m0.C10458b;
import p221m0.C10460d;
import p221m0.C10462f;
import p273p0.C11507a;
import p273p0.C11508b;
import p390w.AbstractC13568a2;
import p410x.C13905a;
import p431y.AbstractC14182c;
import p431y.C14186f;

/* renamed from: androidx.camera.video.internal.encoder.a0 */
/* loaded from: classes.dex */
public class C1981a0 {

    /* renamed from: u */
    private static final Range<Long> f2127u = Range.create(Long.MAX_VALUE, Long.MAX_VALUE);

    /* renamed from: a */
    final String f2128a;

    /* renamed from: c */
    final boolean f2130c;

    /* renamed from: d */
    private final MediaFormat f2131d;

    /* renamed from: e */
    final MediaCodec f2132e;

    /* renamed from: f */
    final AbstractC2011i f2133f;

    /* renamed from: g */
    final Executor f2134g;

    /* renamed from: o */
    EnumC1986e f2142o;

    /* renamed from: t */
    final C11508b f2147t;

    /* renamed from: b */
    final Object f2129b = new Object();

    /* renamed from: h */
    final Queue<Integer> f2135h = new ArrayDeque();

    /* renamed from: i */
    private final Queue<C2114c.C2115a<AbstractC2044x0>> f2136i = new ArrayDeque();

    /* renamed from: j */
    private final Set<AbstractC2044x0> f2137j = new HashSet();

    /* renamed from: k */
    final Set<C2007g> f2138k = new HashSet();

    /* renamed from: l */
    final Deque<Range<Long>> f2139l = new ArrayDeque();

    /* renamed from: m */
    AbstractC2018l f2140m = AbstractC2018l.f2232a;

    /* renamed from: n */
    Executor f2141n = C13905a.m2339a();

    /* renamed from: p */
    Range<Long> f2143p = f2127u;

    /* renamed from: q */
    long f2144q = 0;

    /* renamed from: r */
    private boolean f2145r = false;

    /* renamed from: s */
    private boolean f2146s = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.video.internal.encoder.a0$a */
    /* loaded from: classes.dex */
    public class C1982a implements AbstractC14182c<AbstractC2044x0> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.camera.video.internal.encoder.a0$a$a */
        /* loaded from: classes.dex */
        public class C0023a implements AbstractC14182c<Void> {
            C0023a() {
            }

            /* renamed from: b */
            public void mo1412a(Void r1) {
            }

            @Override // p431y.AbstractC14182c
            public void onFailure(Throwable th2) {
                if (th2 instanceof MediaCodec.CodecException) {
                    C1981a0.this.m39293r((MediaCodec.CodecException) th2);
                } else {
                    C1981a0.this.m39294q(0, th2.getMessage(), th2);
                }
            }
        }

        C1982a() {
        }

        /* renamed from: b */
        public void mo1412a(AbstractC2044x0 x0Var) {
            x0Var.mo39190d(C1981a0.m39296o());
            x0Var.mo39192b(true);
            x0Var.mo39191c();
            C14186f.m1427b(x0Var.mo39189e(), new C0023a(), C1981a0.this.f2134g);
        }

        @Override // p431y.AbstractC14182c
        public void onFailure(Throwable th2) {
            C1981a0.this.m39294q(0, "Unable to acquire InputBuffer.", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.video.internal.encoder.a0$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C1983b {

        /* renamed from: a */
        static final /* synthetic */ int[] f2150a;

        static {
            int[] iArr = new int[EnumC1986e.values().length];
            f2150a = iArr;
            try {
                iArr[EnumC1986e.CONFIGURED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2150a[EnumC1986e.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2150a[EnumC1986e.PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2150a[EnumC1986e.STOPPING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2150a[EnumC1986e.PENDING_START_PAUSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2150a[EnumC1986e.PENDING_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2150a[EnumC1986e.PENDING_RELEASE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2150a[EnumC1986e.ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2150a[EnumC1986e.RELEASED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.camera.video.internal.encoder.a0$c */
    /* loaded from: classes.dex */
    public static class C1984c {
        /* renamed from: a */
        static Surface m39282a() {
            return MediaCodec.createPersistentInputSurface();
        }

        /* renamed from: b */
        static void m39281b(MediaCodec mediaCodec, Surface surface) {
            mediaCodec.setInputSurface(surface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.video.internal.encoder.a0$d */
    /* loaded from: classes.dex */
    public class C1985d implements AbstractC2009h {

        /* renamed from: a */
        private final Map<AbstractC13568a2.AbstractC13569a<? super AbstractC9712j.EnumC9713a>, Executor> f2151a = new LinkedHashMap();

        /* renamed from: b */
        private AbstractC9712j.EnumC9713a f2152b = AbstractC9712j.EnumC9713a.INACTIVE;

        /* renamed from: c */
        private final List<AbstractFutureC7576b<AbstractC2044x0>> f2153c = new ArrayList();

        C1985d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: q */
        public /* synthetic */ void m39269q(AbstractFutureC7576b bVar) {
            this.f2153c.remove(bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r */
        public /* synthetic */ void m39268r(C2114c.C2115a aVar) {
            AbstractC9712j.EnumC9713a aVar2 = this.f2152b;
            if (aVar2 == AbstractC9712j.EnumC9713a.ACTIVE) {
                final AbstractFutureC7576b<AbstractC2044x0> n = C1981a0.this.m39297n();
                C14186f.m1418k(n, aVar);
                aVar.m38963a(new Runnable() { // from class: androidx.camera.video.internal.encoder.j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractFutureC7576b.this.cancel(true);
                    }
                }, C13905a.m2339a());
                this.f2153c.add(n);
                n.mo1409a(new Runnable() { // from class: androidx.camera.video.internal.encoder.k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1981a0.C1985d.this.m39269q(n);
                    }
                }, C1981a0.this.f2134g);
            } else if (aVar2 == AbstractC9712j.EnumC9713a.INACTIVE) {
                aVar.m38958f(new IllegalStateException("BufferProvider is not active."));
            } else {
                aVar.m38958f(new IllegalStateException("Unknown state: " + this.f2152b));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public /* synthetic */ Object m39267s(final C2114c.C2115a aVar) {
            C1981a0.this.f2134g.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.g0
                @Override // java.lang.Runnable
                public final void run() {
                    C1981a0.C1985d.this.m39268r(aVar);
                }
            });
            return "acquireBuffer";
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: u */
        public /* synthetic */ void m39265u(final AbstractC13568a2.AbstractC13569a aVar, Executor executor) {
            this.f2151a.put((AbstractC13568a2.AbstractC13569a) C2517g.m37588g(aVar), (Executor) C2517g.m37588g(executor));
            final AbstractC9712j.EnumC9713a aVar2 = this.f2152b;
            executor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.h0
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC13568a2.AbstractC13569a.this.mo3341a(aVar2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v */
        public /* synthetic */ void m39264v(C2114c.C2115a aVar) {
            aVar.m38961c(this.f2152b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w */
        public /* synthetic */ Object m39263w(final C2114c.C2115a aVar) {
            C1981a0.this.f2134g.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.i0
                @Override // java.lang.Runnable
                public final void run() {
                    C1981a0.C1985d.this.m39264v(aVar);
                }
            });
            return "fetchData";
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: x */
        public /* synthetic */ void m39262x(AbstractC13568a2.AbstractC13569a aVar) {
            this.f2151a.remove(C2517g.m37588g(aVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: y */
        public static /* synthetic */ void m39261y(Map.Entry entry, AbstractC9712j.EnumC9713a aVar) {
            ((AbstractC13568a2.AbstractC13569a) entry.getKey()).mo3341a(aVar);
        }

        @Override // p390w.AbstractC13568a2
        /* renamed from: b */
        public void mo3078b(final Executor executor, final AbstractC13568a2.AbstractC13569a<? super AbstractC9712j.EnumC9713a> aVar) {
            C1981a0.this.f2134g.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.f0
                @Override // java.lang.Runnable
                public final void run() {
                    C1981a0.C1985d.this.m39265u(aVar, executor);
                }
            });
        }

        @Override // p390w.AbstractC13568a2
        /* renamed from: c */
        public AbstractFutureC7576b<AbstractC9712j.EnumC9713a> mo3077c() {
            return C2114c.m38964a(new C2114c.AbstractC0030c() { // from class: androidx.camera.video.internal.encoder.e0
                @Override // androidx.concurrent.futures.C2114c.AbstractC0030c
                /* renamed from: a */
                public final Object mo1403a(C2114c.C2115a aVar) {
                    Object w;
                    w = C1981a0.C1985d.this.m39263w(aVar);
                    return w;
                }
            });
        }

        @Override // p390w.AbstractC13568a2
        /* renamed from: d */
        public void mo3076d(final AbstractC13568a2.AbstractC13569a<? super AbstractC9712j.EnumC9713a> aVar) {
            C1981a0.this.f2134g.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.d0
                @Override // java.lang.Runnable
                public final void run() {
                    C1981a0.C1985d.this.m39262x(aVar);
                }
            });
        }

        @Override // p186k0.AbstractC9712j
        /* renamed from: e */
        public AbstractFutureC7576b<AbstractC2044x0> mo15543e() {
            return C2114c.m38964a(new C2114c.AbstractC0030c() { // from class: androidx.camera.video.internal.encoder.c0
                @Override // androidx.concurrent.futures.C2114c.AbstractC0030c
                /* renamed from: a */
                public final Object mo1403a(C2114c.C2115a aVar) {
                    Object s;
                    s = C1981a0.C1985d.this.m39267s(aVar);
                    return s;
                }
            });
        }

        /* renamed from: z */
        void m39260z(boolean z) {
            final AbstractC9712j.EnumC9713a aVar;
            if (z) {
                aVar = AbstractC9712j.EnumC9713a.ACTIVE;
            } else {
                aVar = AbstractC9712j.EnumC9713a.INACTIVE;
            }
            if (this.f2152b != aVar) {
                this.f2152b = aVar;
                if (aVar == AbstractC9712j.EnumC9713a.INACTIVE) {
                    for (AbstractFutureC7576b<AbstractC2044x0> bVar : this.f2153c) {
                        bVar.cancel(true);
                    }
                    this.f2153c.clear();
                }
                for (final Map.Entry<AbstractC13568a2.AbstractC13569a<? super AbstractC9712j.EnumC9713a>, Executor> entry : this.f2151a.entrySet()) {
                    try {
                        entry.getValue().execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.b0
                            @Override // java.lang.Runnable
                            public final void run() {
                                C1981a0.C1985d.m39261y(entry, aVar);
                            }
                        });
                    } catch (RejectedExecutionException e) {
                        C1915r1.m39524d(C1981a0.this.f2128a, "Unable to post to the supplied executor.", e);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.video.internal.encoder.a0$e */
    /* loaded from: classes.dex */
    public enum EnumC1986e {
        CONFIGURED,
        STARTED,
        PAUSED,
        STOPPING,
        PENDING_START,
        PENDING_START_PAUSED,
        PENDING_RELEASE,
        ERROR,
        RELEASED
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.video.internal.encoder.a0$f */
    /* loaded from: classes.dex */
    public class C1987f extends MediaCodec.Callback {

        /* renamed from: a */
        private final C11507a f2165a;

        /* renamed from: b */
        private boolean f2166b = false;

        /* renamed from: c */
        private boolean f2167c = false;

        /* renamed from: d */
        private boolean f2168d = false;

        /* renamed from: e */
        private long f2169e = 0;

        /* renamed from: f */
        private long f2170f = 0;

        /* renamed from: g */
        private boolean f2171g = false;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.camera.video.internal.encoder.a0$f$a */
        /* loaded from: classes.dex */
        public class C1988a implements AbstractC14182c<Void> {

            /* renamed from: a */
            final /* synthetic */ C2007g f2173a;

            C1988a(C2007g gVar) {
                this.f2173a = gVar;
            }

            /* renamed from: b */
            public void mo1412a(Void r2) {
                C1981a0.this.f2138k.remove(this.f2173a);
            }

            @Override // p431y.AbstractC14182c
            public void onFailure(Throwable th2) {
                C1981a0.this.f2138k.remove(this.f2173a);
                if (th2 instanceof MediaCodec.CodecException) {
                    C1981a0.this.m39293r((MediaCodec.CodecException) th2);
                } else {
                    C1981a0.this.m39294q(0, th2.getMessage(), th2);
                }
            }
        }

        C1987f() {
            if (!C1981a0.this.f2130c || C10460d.m13127a(C10458b.class) == null) {
                this.f2165a = null;
            } else {
                this.f2165a = new C11507a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ void m39250j(MediaCodec.CodecException codecException) {
            switch (C1983b.f2150a[C1981a0.this.f2142o.ordinal()]) {
                case 1:
                case 8:
                case 9:
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    C1981a0.this.m39293r(codecException);
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + C1981a0.this.f2142o);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public /* synthetic */ void m39249k(int i) {
            switch (C1983b.f2150a[C1981a0.this.f2142o.ordinal()]) {
                case 1:
                case 8:
                case 9:
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    C1981a0.this.f2135h.offer(Integer.valueOf(i));
                    C1981a0.this.m39327I();
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + C1981a0.this.f2142o);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ void m39248l(Executor executor, final AbstractC2018l lVar) {
            if (C1981a0.this.f2142o != EnumC1986e.ERROR) {
                try {
                    Objects.requireNonNull(lVar);
                    executor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.v0
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC2018l.this.mo20407b();
                        }
                    });
                } catch (RejectedExecutionException e) {
                    C1915r1.m39524d(C1981a0.this.f2128a, "Unable to post to the supplied executor.", e);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ void m39247m(MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, int i) {
            final AbstractC2018l lVar;
            final Executor executor;
            switch (C1983b.f2150a[C1981a0.this.f2142o.ordinal()]) {
                case 1:
                case 8:
                case 9:
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    synchronized (C1981a0.this.f2129b) {
                        C1981a0 a0Var = C1981a0.this;
                        lVar = a0Var.f2140m;
                        executor = a0Var.f2141n;
                    }
                    C11507a aVar = this.f2165a;
                    if (aVar != null) {
                        aVar.m9541a(bufferInfo);
                    }
                    if (!this.f2166b) {
                        this.f2166b = true;
                        try {
                            Objects.requireNonNull(lVar);
                            executor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.r0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    AbstractC2018l.this.mo20404e();
                                }
                            });
                        } catch (RejectedExecutionException e) {
                            C1915r1.m39524d(C1981a0.this.f2128a, "Unable to post to the supplied executor.", e);
                        }
                    }
                    if (!m39240t(bufferInfo)) {
                        if (!this.f2167c) {
                            this.f2167c = true;
                        }
                        long j = C1981a0.this.f2144q;
                        if (j > 0) {
                            bufferInfo.presentationTimeUs -= j;
                        }
                        this.f2170f = bufferInfo.presentationTimeUs;
                        try {
                            m39241s(new C2007g(mediaCodec, i, bufferInfo), lVar, executor);
                        } catch (MediaCodec.CodecException e2) {
                            C1981a0.this.m39293r(e2);
                            return;
                        }
                    } else {
                        try {
                            C1981a0.this.f2132e.releaseOutputBuffer(i, false);
                        } catch (MediaCodec.CodecException e3) {
                            C1981a0.this.m39293r(e3);
                            return;
                        }
                    }
                    if (!this.f2168d && C1981a0.m39291t(bufferInfo)) {
                        this.f2168d = true;
                        C1981a0.this.m39312X(new Runnable() { // from class: androidx.camera.video.internal.encoder.s0
                            @Override // java.lang.Runnable
                            public final void run() {
                                C1981a0.C1987f.this.m39248l(executor, lVar);
                            }
                        });
                        return;
                    }
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + C1981a0.this.f2142o);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public static /* synthetic */ MediaFormat m39246n(MediaFormat mediaFormat) {
            return mediaFormat;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public static /* synthetic */ void m39245o(AbstractC2018l lVar, final MediaFormat mediaFormat) {
            lVar.mo20408a(new AbstractC1994b1() { // from class: androidx.camera.video.internal.encoder.u0
                @Override // androidx.camera.video.internal.encoder.AbstractC1994b1
                /* renamed from: a */
                public final MediaFormat mo39194a() {
                    MediaFormat n;
                    n = C1981a0.C1987f.m39246n(mediaFormat);
                    return n;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p */
        public /* synthetic */ void m39244p(final MediaFormat mediaFormat) {
            final AbstractC2018l lVar;
            Executor executor;
            switch (C1983b.f2150a[C1981a0.this.f2142o.ordinal()]) {
                case 1:
                case 8:
                case 9:
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    synchronized (C1981a0.this.f2129b) {
                        C1981a0 a0Var = C1981a0.this;
                        lVar = a0Var.f2140m;
                        executor = a0Var.f2141n;
                    }
                    try {
                        executor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.q0
                            @Override // java.lang.Runnable
                            public final void run() {
                                C1981a0.C1987f.m39245o(AbstractC2018l.this, mediaFormat);
                            }
                        });
                        return;
                    } catch (RejectedExecutionException e) {
                        C1915r1.m39524d(C1981a0.this.f2128a, "Unable to post to the supplied executor.", e);
                        return;
                    }
                default:
                    throw new IllegalStateException("Unknown state: " + C1981a0.this.f2142o);
            }
        }

        /* renamed from: s */
        private void m39241s(final C2007g gVar, final AbstractC2018l lVar, Executor executor) {
            C1981a0.this.f2138k.add(gVar);
            C14186f.m1427b(gVar.m39200g(), new C1988a(gVar), C1981a0.this.f2134g);
            try {
                executor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.m0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC2018l.this.mo20406c(gVar);
                    }
                });
            } catch (RejectedExecutionException e) {
                C1915r1.m39524d(C1981a0.this.f2128a, "Unable to post to the supplied executor.", e);
                gVar.close();
            }
        }

        /* renamed from: t */
        private boolean m39240t(MediaCodec.BufferInfo bufferInfo) {
            if (this.f2168d) {
                C1915r1.m39527a(C1981a0.this.f2128a, "Drop buffer by already reach end of stream.");
                return true;
            } else if (bufferInfo.size <= 0) {
                C1915r1.m39527a(C1981a0.this.f2128a, "Drop buffer by invalid buffer size.");
                return true;
            } else if ((bufferInfo.flags & 2) != 0) {
                C1915r1.m39527a(C1981a0.this.f2128a, "Drop buffer by codec config.");
                return true;
            } else {
                long j = bufferInfo.presentationTimeUs;
                if (j <= this.f2169e) {
                    C1915r1.m39527a(C1981a0.this.f2128a, "Drop buffer by out of order buffer from MediaCodec.");
                    return true;
                }
                this.f2169e = j;
                if (!C1981a0.this.f2143p.contains((Range<Long>) Long.valueOf(j))) {
                    C1915r1.m39527a(C1981a0.this.f2128a, "Drop buffer by not in start-stop range.");
                    return true;
                } else if (m39239u(bufferInfo)) {
                    C1915r1.m39527a(C1981a0.this.f2128a, "Drop buffer by pause.");
                    return true;
                } else if (this.f2167c || !C1981a0.this.f2130c || C1981a0.m39289v(bufferInfo)) {
                    return false;
                } else {
                    C1915r1.m39527a(C1981a0.this.f2128a, "Drop buffer by first video frame is not key frame.");
                    C1981a0.this.m39321O();
                    return true;
                }
            }
        }

        /* renamed from: u */
        private boolean m39239u(MediaCodec.BufferInfo bufferInfo) {
            Executor executor;
            final AbstractC2018l lVar;
            C1981a0.this.m39311Y(bufferInfo.presentationTimeUs);
            boolean u = C1981a0.this.m39290u(bufferInfo.presentationTimeUs);
            boolean z = this.f2171g;
            if (!z && u) {
                C1915r1.m39527a(C1981a0.this.f2128a, "Switch to pause state");
                this.f2171g = true;
                synchronized (C1981a0.this.f2129b) {
                    C1981a0 a0Var = C1981a0.this;
                    executor = a0Var.f2141n;
                    lVar = a0Var.f2140m;
                }
                executor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.t0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC2018l.this.mo20405d();
                    }
                });
                C1981a0 a0Var2 = C1981a0.this;
                if (a0Var2.f2142o == EnumC1986e.PAUSED) {
                    AbstractC2011i iVar = a0Var2.f2133f;
                    if (iVar instanceof C1985d) {
                        ((C1985d) iVar).m39260z(false);
                    }
                    C1981a0.this.m39318R(true);
                }
            } else if (z && !u) {
                if (!C1981a0.this.f2130c || C1981a0.m39289v(bufferInfo)) {
                    long j = bufferInfo.presentationTimeUs;
                    C1981a0 a0Var3 = C1981a0.this;
                    if (j - a0Var3.f2144q > this.f2170f) {
                        C1915r1.m39527a(a0Var3.f2128a, "Switch to resume state");
                        this.f2171g = false;
                    } else {
                        C1915r1.m39527a(a0Var3.f2128a, "Adjusted time by pause duration is invalid.");
                    }
                } else {
                    C1915r1.m39527a(C1981a0.this.f2128a, "Not a key frame, don't switch to resume state.");
                    C1981a0.this.m39321O();
                }
            }
            return this.f2171g;
        }

        @Override // android.media.MediaCodec.Callback
        public void onError(MediaCodec mediaCodec, final MediaCodec.CodecException codecException) {
            C1981a0.this.f2134g.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.l0
                @Override // java.lang.Runnable
                public final void run() {
                    C1981a0.C1987f.this.m39250j(codecException);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onInputBufferAvailable(MediaCodec mediaCodec, final int i) {
            C1981a0.this.f2134g.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.o0
                @Override // java.lang.Runnable
                public final void run() {
                    C1981a0.C1987f.this.m39249k(i);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputBufferAvailable(final MediaCodec mediaCodec, final int i, final MediaCodec.BufferInfo bufferInfo) {
            C1981a0.this.f2134g.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.n0
                @Override // java.lang.Runnable
                public final void run() {
                    C1981a0.C1987f.this.m39247m(bufferInfo, mediaCodec, i);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputFormatChanged(MediaCodec mediaCodec, final MediaFormat mediaFormat) {
            C1981a0.this.f2134g.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.p0
                @Override // java.lang.Runnable
                public final void run() {
                    C1981a0.C1987f.this.m39244p(mediaFormat);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.video.internal.encoder.a0$g */
    /* loaded from: classes.dex */
    public class C1989g implements AbstractC2013j {

        /* renamed from: b */
        private Surface f2176b;

        /* renamed from: d */
        private AbstractC2013j.AbstractC2014a f2178d;

        /* renamed from: e */
        private Executor f2179e;

        /* renamed from: a */
        private final Object f2175a = new Object();

        /* renamed from: c */
        private final Set<Surface> f2177c = new HashSet();

        C1989g() {
        }

        /* renamed from: d */
        private void m39235d(Executor executor, final AbstractC2013j.AbstractC2014a aVar, final Surface surface) {
            try {
                executor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.w0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC2013j.AbstractC2014a.this.mo20527a(surface);
                    }
                });
            } catch (RejectedExecutionException e) {
                C1915r1.m39524d(C1981a0.this.f2128a, "Unable to post to the supplied executor.", e);
            }
        }

        @Override // androidx.camera.video.internal.encoder.AbstractC2013j
        /* renamed from: a */
        public void mo39197a(Executor executor, AbstractC2013j.AbstractC2014a aVar) {
            Surface surface;
            synchronized (this.f2175a) {
                this.f2178d = (AbstractC2013j.AbstractC2014a) C2517g.m37588g(aVar);
                this.f2179e = (Executor) C2517g.m37588g(executor);
                surface = this.f2176b;
            }
            if (surface != null) {
                m39235d(executor, aVar, surface);
            }
        }

        /* renamed from: e */
        void m39234e() {
            Surface surface;
            HashSet<Surface> hashSet;
            synchronized (this.f2175a) {
                surface = this.f2176b;
                this.f2176b = null;
                hashSet = new HashSet(this.f2177c);
                this.f2177c.clear();
            }
            if (surface != null) {
                surface.release();
            }
            for (Surface surface2 : hashSet) {
                surface2.release();
            }
        }

        @SuppressLint({"NewApi"})
        /* renamed from: f */
        void m39233f() {
            Surface surface;
            AbstractC2013j.AbstractC2014a aVar;
            Executor executor;
            C10462f fVar = (C10462f) C10460d.m13127a(C10462f.class);
            synchronized (this.f2175a) {
                if (fVar == null) {
                    if (this.f2176b == null) {
                        surface = C1984c.m39282a();
                        this.f2176b = surface;
                    } else {
                        surface = null;
                    }
                    C1984c.m39281b(C1981a0.this.f2132e, this.f2176b);
                } else {
                    Surface surface2 = this.f2176b;
                    if (surface2 != null) {
                        this.f2177c.add(surface2);
                    }
                    surface = C1981a0.this.f2132e.createInputSurface();
                    this.f2176b = surface;
                }
                aVar = this.f2178d;
                executor = this.f2179e;
            }
            if (surface != null && aVar != null && executor != null) {
                m39235d(executor, aVar, surface);
            }
        }
    }

    public C1981a0(Executor executor, AbstractC2021m mVar) {
        C11508b bVar = new C11508b();
        this.f2147t = bVar;
        C2517g.m37588g(executor);
        C2517g.m37588g(mVar);
        this.f2134g = C13905a.m2333g(executor);
        if (mVar instanceof AbstractC1980a) {
            this.f2128a = "AudioEncoder";
            this.f2130c = false;
            this.f2133f = new C1985d();
        } else if (mVar instanceof AbstractC1999c1) {
            this.f2128a = "VideoEncoder";
            this.f2130c = true;
            this.f2133f = new C1989g();
        } else {
            throw new C1990a1("Unknown encoder config type");
        }
        MediaFormat a = mVar.mo39195a();
        this.f2131d = a;
        String str = this.f2128a;
        C1915r1.m39527a(str, "mMediaFormat = " + a);
        MediaCodec a2 = bVar.m9540a(a, new MediaCodecList(1));
        this.f2132e = a2;
        String str2 = this.f2128a;
        C1915r1.m39523e(str2, "Selected encoder: " + a2.getName());
        try {
            m39320P();
            m39317S(EnumC1986e.CONFIGURED);
        } catch (MediaCodec.CodecException e) {
            throw new C1990a1(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public static /* synthetic */ void m39335A(AbstractC2018l lVar, int i, String str, Throwable th2) {
        lVar.mo20403f(new C2001d(i, str, th2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void m39334B() {
        switch (C1983b.f2150a[this.f2142o.ordinal()]) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 8:
                return;
            case 2:
                long o = m39296o();
                String str = this.f2128a;
                C1915r1.m39527a(str, "Pause on " + C9714k.m15535h(o));
                this.f2139l.addLast(Range.create(Long.valueOf(o), Long.MAX_VALUE));
                m39317S(EnumC1986e.PAUSED);
                return;
            case 6:
                m39317S(EnumC1986e.PENDING_START_PAUSED);
                return;
            case 7:
            case 9:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + this.f2142o);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ void m39333C() {
        switch (C1983b.f2150a[this.f2142o.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 8:
                m39323M();
                return;
            case 4:
            case 5:
            case 6:
                m39317S(EnumC1986e.PENDING_RELEASE);
                return;
            case 7:
            case 9:
                return;
            default:
                throw new IllegalStateException("Unknown state: " + this.f2142o);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ void m39332D() {
        int i = C1983b.f2150a[this.f2142o.ordinal()];
        if (i == 2) {
            m39321O();
        } else if (i == 7 || i == 9) {
            throw new IllegalStateException("Encoder is released");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ void m39331E() {
        this.f2146s = true;
        if (this.f2145r) {
            this.f2132e.stop();
            m39320P();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ void m39330F() {
        boolean z;
        long longValue;
        long o;
        switch (C1983b.f2150a[this.f2142o.ordinal()]) {
            case 1:
                long o2 = m39296o();
                C1915r1.m39527a(this.f2128a, "Start on " + C9714k.m15535h(o2));
                try {
                    if (this.f2145r) {
                        m39320P();
                    }
                    this.f2143p = Range.create(Long.valueOf(o2), Long.MAX_VALUE);
                    this.f2132e.start();
                    AbstractC2011i iVar = this.f2133f;
                    if (iVar instanceof C1985d) {
                        ((C1985d) iVar).m39260z(true);
                    }
                    m39317S(EnumC1986e.STARTED);
                    return;
                } catch (MediaCodec.CodecException e) {
                    m39293r(e);
                    return;
                }
            case 2:
            case 6:
            case 8:
                return;
            case 3:
                Range<Long> removeLast = this.f2139l.removeLast();
                if (removeLast == null || removeLast.getUpper().longValue() != Long.MAX_VALUE) {
                    z = false;
                } else {
                    z = true;
                }
                C2517g.m37585j(z, "There should be a \"pause\" before \"resume\"");
                this.f2139l.addLast(Range.create(Long.valueOf(removeLast.getLower().longValue()), Long.valueOf(m39296o())));
                C1915r1.m39527a(this.f2128a, "Resume on " + C9714k.m15535h(o) + "\nPaused duration = " + C9714k.m15535h(o - longValue));
                m39318R(false);
                AbstractC2011i iVar2 = this.f2133f;
                if (iVar2 instanceof C1985d) {
                    ((C1985d) iVar2).m39260z(true);
                }
                if (this.f2130c) {
                    m39321O();
                }
                m39317S(EnumC1986e.STARTED);
                return;
            case 4:
            case 5:
                m39317S(EnumC1986e.PENDING_START);
                return;
            case 7:
            case 9:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + this.f2142o);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ void m39329G() {
        switch (C1983b.f2150a[this.f2142o.ordinal()]) {
            case 1:
            case 4:
            case 8:
                return;
            case 2:
            case 3:
                m39317S(EnumC1986e.STOPPING);
                AbstractC2011i iVar = this.f2133f;
                boolean z = false;
                if (iVar instanceof C1985d) {
                    ((C1985d) iVar).m39260z(false);
                    ArrayList arrayList = new ArrayList();
                    for (AbstractC2044x0 x0Var : this.f2137j) {
                        arrayList.add(x0Var.mo39189e());
                    }
                    C14186f.m1415n(arrayList).mo1409a(new Runnable() { // from class: androidx.camera.video.internal.encoder.z
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1981a0.this.m39316T();
                        }
                    }, this.f2134g);
                } else if (iVar instanceof C1989g) {
                    try {
                        this.f2132e.signalEndOfInputStream();
                    } catch (MediaCodec.CodecException e) {
                        m39293r(e);
                        return;
                    }
                }
                long longValue = this.f2143p.getLower().longValue();
                if (longValue != Long.MAX_VALUE) {
                    z = true;
                }
                C2517g.m37585j(z, "There should be a \"start\" before \"stop\"");
                long o = m39296o();
                this.f2143p = Range.create(Long.valueOf(longValue), Long.valueOf(o));
                String str = this.f2128a;
                C1915r1.m39527a(str, "Stop on " + C9714k.m15535h(o));
                return;
            case 5:
            case 6:
                m39317S(EnumC1986e.CONFIGURED);
                return;
            case 7:
            case 9:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + this.f2142o);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ void m39328H(Runnable runnable) {
        if (!(this.f2133f instanceof C1989g) || this.f2146s) {
            this.f2132e.stop();
        } else {
            this.f2132e.flush();
            this.f2145r = true;
        }
        if (runnable != null) {
            runnable.run();
        }
        m39292s();
    }

    /* renamed from: M */
    private void m39323M() {
        if (this.f2145r) {
            this.f2132e.stop();
            this.f2145r = false;
        }
        this.f2132e.release();
        AbstractC2011i iVar = this.f2133f;
        if (iVar instanceof C1989g) {
            ((C1989g) iVar).m39234e();
        }
        m39317S(EnumC1986e.RELEASED);
    }

    /* renamed from: P */
    private void m39320P() {
        this.f2143p = f2127u;
        this.f2144q = 0L;
        this.f2139l.clear();
        this.f2135h.clear();
        for (C2114c.C2115a<AbstractC2044x0> aVar : this.f2136i) {
            aVar.m38960d();
        }
        this.f2136i.clear();
        this.f2132e.reset();
        this.f2145r = false;
        this.f2146s = false;
        this.f2132e.setCallback(new C1987f());
        this.f2132e.configure(this.f2131d, (Surface) null, (MediaCrypto) null, 1);
        AbstractC2011i iVar = this.f2133f;
        if (iVar instanceof C1989g) {
            ((C1989g) iVar).m39233f();
        }
    }

    /* renamed from: S */
    private void m39317S(EnumC1986e eVar) {
        if (this.f2142o != eVar) {
            String str = this.f2128a;
            C1915r1.m39527a(str, "Transitioning encoder internal state: " + this.f2142o + " --> " + eVar);
            this.f2142o = eVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public void m39316T() {
        C14186f.m1427b(m39297n(), new C1982a(), this.f2134g);
    }

    /* renamed from: o */
    static long m39296o() {
        return TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
    }

    /* renamed from: t */
    static boolean m39291t(MediaCodec.BufferInfo bufferInfo) {
        return (bufferInfo.flags & 4) != 0;
    }

    /* renamed from: v */
    static boolean m39289v(MediaCodec.BufferInfo bufferInfo) {
        return (bufferInfo.flags & 1) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m39288w(C2114c.C2115a aVar) {
        this.f2136i.remove(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m39285z(C2048z0 z0Var) {
        this.f2137j.remove(z0Var);
    }

    /* renamed from: I */
    void m39327I() {
        while (!this.f2136i.isEmpty() && !this.f2135h.isEmpty()) {
            C2114c.C2115a<AbstractC2044x0> poll = this.f2136i.poll();
            try {
                final C2048z0 z0Var = new C2048z0(this.f2132e, this.f2135h.poll().intValue());
                if (poll.m38961c(z0Var)) {
                    this.f2137j.add(z0Var);
                    z0Var.mo39189e().mo1409a(new Runnable() { // from class: androidx.camera.video.internal.encoder.s
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1981a0.this.m39285z(z0Var);
                        }
                    }, this.f2134g);
                } else {
                    z0Var.cancel();
                }
            } catch (MediaCodec.CodecException e) {
                m39293r(e);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public void m39286y(final int i, final String str, final Throwable th2) {
        final AbstractC2018l lVar;
        Executor executor;
        synchronized (this.f2129b) {
            lVar = this.f2140m;
            executor = this.f2141n;
        }
        try {
            executor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.y
                @Override // java.lang.Runnable
                public final void run() {
                    C1981a0.m39335A(AbstractC2018l.this, i, str, th2);
                }
            });
        } catch (RejectedExecutionException e) {
            C1915r1.m39524d(this.f2128a, "Unable to post to the supplied executor.", e);
        }
    }

    /* renamed from: K */
    public void m39325K() {
        this.f2134g.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.n
            @Override // java.lang.Runnable
            public final void run() {
                C1981a0.this.m39334B();
            }
        });
    }

    /* renamed from: L */
    public void m39324L() {
        this.f2134g.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.u
            @Override // java.lang.Runnable
            public final void run() {
                C1981a0.this.m39333C();
            }
        });
    }

    /* renamed from: N */
    public void m39322N() {
        this.f2134g.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.o
            @Override // java.lang.Runnable
            public final void run() {
                C1981a0.this.m39332D();
            }
        });
    }

    /* renamed from: O */
    void m39321O() {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        this.f2132e.setParameters(bundle);
    }

    /* renamed from: Q */
    public void m39319Q(AbstractC2018l lVar, Executor executor) {
        synchronized (this.f2129b) {
            this.f2140m = lVar;
            this.f2141n = executor;
        }
    }

    /* renamed from: R */
    void m39318R(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("drop-input-frames", z ? 1 : 0);
        this.f2132e.setParameters(bundle);
    }

    /* renamed from: U */
    public void m39315U() {
        this.f2134g.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.x
            @Override // java.lang.Runnable
            public final void run() {
                C1981a0.this.m39331E();
            }
        });
    }

    /* renamed from: V */
    public void m39314V() {
        this.f2134g.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.r
            @Override // java.lang.Runnable
            public final void run() {
                C1981a0.this.m39330F();
            }
        });
    }

    /* renamed from: W */
    public void m39313W() {
        this.f2134g.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.w
            @Override // java.lang.Runnable
            public final void run() {
                C1981a0.this.m39329G();
            }
        });
    }

    /* renamed from: X */
    void m39312X(final Runnable runnable) {
        ArrayList arrayList = new ArrayList();
        for (C2007g gVar : this.f2138k) {
            arrayList.add(gVar.m39200g());
        }
        for (AbstractC2044x0 x0Var : this.f2137j) {
            arrayList.add(x0Var.mo39189e());
        }
        C14186f.m1415n(arrayList).mo1409a(new Runnable() { // from class: androidx.camera.video.internal.encoder.v
            @Override // java.lang.Runnable
            public final void run() {
                C1981a0.this.m39328H(runnable);
            }
        }, this.f2134g);
    }

    /* renamed from: Y */
    void m39311Y(long j) {
        while (!this.f2139l.isEmpty()) {
            Range<Long> first = this.f2139l.getFirst();
            if (j > first.getUpper().longValue()) {
                this.f2139l.removeFirst();
                this.f2144q += first.getUpper().longValue() - first.getLower().longValue();
                C1915r1.m39527a(this.f2128a, "Total paused duration = " + C9714k.m15535h(this.f2144q));
            } else {
                return;
            }
        }
    }

    /* renamed from: n */
    AbstractFutureC7576b<AbstractC2044x0> m39297n() {
        switch (C1983b.f2150a[this.f2142o.ordinal()]) {
            case 1:
                return C14186f.m1423f(new IllegalStateException("Encoder is not started yet."));
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                final AtomicReference atomicReference = new AtomicReference();
                AbstractFutureC7576b<AbstractC2044x0> a = C2114c.m38964a(new C2114c.AbstractC0030c() { // from class: androidx.camera.video.internal.encoder.p
                    @Override // androidx.concurrent.futures.C2114c.AbstractC0030c
                    /* renamed from: a */
                    public final Object mo1403a(C2114c.C2115a aVar) {
                        Object obj;
                        obj = atomicReference.set(aVar);
                        return obj;
                    }
                });
                final C2114c.C2115a<AbstractC2044x0> aVar = (C2114c.C2115a) C2517g.m37588g((C2114c.C2115a) atomicReference.get());
                this.f2136i.offer(aVar);
                aVar.m38963a(new Runnable() { // from class: androidx.camera.video.internal.encoder.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1981a0.this.m39288w(aVar);
                    }
                }, this.f2134g);
                m39327I();
                return a;
            case 8:
                return C14186f.m1423f(new IllegalStateException("Encoder is in error state."));
            case 9:
                return C14186f.m1423f(new IllegalStateException("Encoder is released."));
            default:
                throw new IllegalStateException("Unknown state: " + this.f2142o);
        }
    }

    /* renamed from: p */
    public AbstractC2011i m39295p() {
        return this.f2133f;
    }

    /* renamed from: q */
    void m39294q(final int i, final String str, final Throwable th2) {
        switch (C1983b.f2150a[this.f2142o.ordinal()]) {
            case 1:
                m39286y(i, str, th2);
                m39320P();
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                m39317S(EnumC1986e.ERROR);
                m39312X(new Runnable() { // from class: androidx.camera.video.internal.encoder.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1981a0.this.m39286y(i, str, th2);
                    }
                });
                return;
            case 8:
                String str2 = this.f2128a;
                C1915r1.m39516l(str2, "Get more than one error: " + str + "(" + i + ")", th2);
                return;
            default:
                return;
        }
    }

    /* renamed from: r */
    void m39293r(MediaCodec.CodecException codecException) {
        m39294q(1, codecException.getMessage(), codecException);
    }

    /* renamed from: s */
    void m39292s() {
        EnumC1986e eVar = this.f2142o;
        if (eVar == EnumC1986e.PENDING_RELEASE) {
            m39323M();
            return;
        }
        if (!this.f2145r) {
            m39320P();
        }
        m39317S(EnumC1986e.CONFIGURED);
        if (eVar == EnumC1986e.PENDING_START || eVar == EnumC1986e.PENDING_START_PAUSED) {
            m39314V();
            if (eVar == EnumC1986e.PENDING_START_PAUSED) {
                m39325K();
            }
        }
    }

    /* renamed from: u */
    boolean m39290u(long j) {
        for (Range<Long> range : this.f2139l) {
            if (!range.contains((Range<Long>) Long.valueOf(j))) {
                if (j < range.getLower().longValue()) {
                    break;
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
