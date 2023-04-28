package com.budiyev.android.codescanner;

import java.lang.Thread;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import p066dd.C6440i;
import p066dd.EnumC6432a;
import p066dd.EnumC6436e;

/* renamed from: com.budiyev.android.codescanner.f */
/* loaded from: classes.dex */
final class C4178f {

    /* renamed from: a */
    private final C6440i f7071a;

    /* renamed from: b */
    private final C4179a f7072b;

    /* renamed from: c */
    private final AbstractC4181c f7073c;

    /* renamed from: d */
    private final Map<EnumC6436e, Object> f7074d;

    /* renamed from: f */
    private volatile AbstractC4176d f7076f;

    /* renamed from: g */
    private volatile C4177e f7077g;

    /* renamed from: e */
    private final Object f7075e = new Object();

    /* renamed from: h */
    private volatile EnumC4180b f7078h = EnumC4180b.INITIALIZED;

    /* renamed from: com.budiyev.android.codescanner.f$a */
    /* loaded from: classes.dex */
    private final class C4179a extends Thread {
        public C4179a() {
            super("cs-decoder");
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0035 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0005 A[SYNTHETIC] */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r4 = this;
                r0 = 10
                android.os.Process.setThreadPriority(r0)
            L_0x0005:
                com.budiyev.android.codescanner.f r0 = com.budiyev.android.codescanner.C4178f.this
                com.budiyev.android.codescanner.f$b r1 = com.budiyev.android.codescanner.C4178f.EnumC4180b.IDLE
                com.budiyev.android.codescanner.C4178f.m32441a(r0, r1)
            L_0x000c:
                com.budiyev.android.codescanner.f r0 = com.budiyev.android.codescanner.C4178f.this     // Catch: m -> 0x0005, all -> 0x0067
                java.lang.Object r0 = com.budiyev.android.codescanner.C4178f.m32440b(r0)     // Catch: m -> 0x0005, all -> 0x0067
                monitor-enter(r0)     // Catch: m -> 0x0005, all -> 0x0067
                com.budiyev.android.codescanner.f r1 = com.budiyev.android.codescanner.C4178f.this     // Catch: all -> 0x0064
                com.budiyev.android.codescanner.e r1 = com.budiyev.android.codescanner.C4178f.m32439c(r1)     // Catch: all -> 0x0064
                if (r1 == 0) goto L_0x0050
                com.budiyev.android.codescanner.f r2 = com.budiyev.android.codescanner.C4178f.this     // Catch: all -> 0x0064
                r3 = 0
                com.budiyev.android.codescanner.C4178f.m32438d(r2, r3)     // Catch: all -> 0x0064
                monitor-exit(r0)     // Catch: all -> 0x0064
                com.budiyev.android.codescanner.f r0 = com.budiyev.android.codescanner.C4178f.this     // Catch: m -> 0x0005, all -> 0x0067
                com.budiyev.android.codescanner.f$b r2 = com.budiyev.android.codescanner.C4178f.EnumC4180b.DECODING     // Catch: m -> 0x0005, all -> 0x0067
                com.budiyev.android.codescanner.C4178f.m32441a(r0, r2)     // Catch: m -> 0x0005, all -> 0x0067
                com.budiyev.android.codescanner.f r0 = com.budiyev.android.codescanner.C4178f.this     // Catch: m -> 0x0005, all -> 0x0067
                dd.i r0 = com.budiyev.android.codescanner.C4178f.m32437e(r0)     // Catch: m -> 0x0005, all -> 0x0067
                com.google.zxing.Result r0 = r1.m32442a(r0)     // Catch: m -> 0x0005, all -> 0x0067
                if (r0 == 0) goto L_0x0005
                com.budiyev.android.codescanner.f r1 = com.budiyev.android.codescanner.C4178f.this
                com.budiyev.android.codescanner.C4178f.m32438d(r1, r3)
                com.budiyev.android.codescanner.f r1 = com.budiyev.android.codescanner.C4178f.this
                com.budiyev.android.codescanner.f$b r2 = com.budiyev.android.codescanner.C4178f.EnumC4180b.DECODED
                boolean r1 = com.budiyev.android.codescanner.C4178f.m32441a(r1, r2)
                if (r1 == 0) goto L_0x0005
                com.budiyev.android.codescanner.f r1 = com.budiyev.android.codescanner.C4178f.this
                com.budiyev.android.codescanner.d r1 = com.budiyev.android.codescanner.C4178f.m32436f(r1)
                if (r1 == 0) goto L_0x0005
                r1.onDecoded(r0)
                goto L_0x0005
            L_0x0050:
                com.budiyev.android.codescanner.f r1 = com.budiyev.android.codescanner.C4178f.this     // Catch: InterruptedException -> 0x005b, all -> 0x0064
                java.lang.Object r1 = com.budiyev.android.codescanner.C4178f.m32440b(r1)     // Catch: InterruptedException -> 0x005b, all -> 0x0064
                r1.wait()     // Catch: InterruptedException -> 0x005b, all -> 0x0064
                monitor-exit(r0)     // Catch: all -> 0x0064
                goto L_0x000c
            L_0x005b:
                com.budiyev.android.codescanner.f r1 = com.budiyev.android.codescanner.C4178f.this     // Catch: all -> 0x0064
                com.budiyev.android.codescanner.f$b r2 = com.budiyev.android.codescanner.C4178f.EnumC4180b.STOPPED     // Catch: all -> 0x0064
                com.budiyev.android.codescanner.C4178f.m32441a(r1, r2)     // Catch: all -> 0x0064
                monitor-exit(r0)     // Catch: all -> 0x0064
                return
            L_0x0064:
                r1 = move-exception
                monitor-exit(r0)     // Catch: all -> 0x0064
                throw r1     // Catch: m -> 0x0005, all -> 0x0067
            L_0x0067:
                r0 = move-exception
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.budiyev.android.codescanner.C4178f.C4179a.run():void");
        }
    }

    /* renamed from: com.budiyev.android.codescanner.f$b */
    /* loaded from: classes.dex */
    public enum EnumC4180b {
        INITIALIZED,
        IDLE,
        DECODING,
        DECODED,
        STOPPED
    }

    /* renamed from: com.budiyev.android.codescanner.f$c */
    /* loaded from: classes.dex */
    public interface AbstractC4181c {
        /* renamed from: a */
        boolean mo32428a(EnumC4180b bVar);
    }

    public C4178f(AbstractC4181c cVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, List<EnumC6432a> list, AbstractC4176d dVar) {
        C6440i iVar = new C6440i();
        this.f7071a = iVar;
        C4179a aVar = new C4179a();
        this.f7072b = aVar;
        aVar.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        EnumMap enumMap = new EnumMap(EnumC6436e.class);
        this.f7074d = enumMap;
        enumMap.put((EnumMap) EnumC6436e.POSSIBLE_FORMATS, (EnumC6436e) list);
        iVar.m25552d(enumMap);
        this.f7076f = dVar;
        this.f7073c = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public boolean m32431k(EnumC4180b bVar) {
        this.f7078h = bVar;
        return this.f7073c.mo32428a(bVar);
    }

    /* renamed from: g */
    public void m32435g(C4177e eVar) {
        synchronized (this.f7075e) {
            if (this.f7078h != EnumC4180b.STOPPED) {
                this.f7077g = eVar;
                this.f7075e.notify();
            }
        }
    }

    /* renamed from: h */
    public EnumC4180b m32434h() {
        return this.f7078h;
    }

    /* renamed from: i */
    public void m32433i(AbstractC4176d dVar) {
        this.f7076f = dVar;
    }

    /* renamed from: j */
    public void m32432j(List<EnumC6432a> list) {
        this.f7074d.put(EnumC6436e.POSSIBLE_FORMATS, list);
        this.f7071a.m25552d(this.f7074d);
    }

    /* renamed from: l */
    public void m32430l() {
        this.f7072b.interrupt();
        this.f7077g = null;
    }

    /* renamed from: m */
    public void m32429m() {
        if (this.f7078h == EnumC4180b.INITIALIZED) {
            this.f7072b.start();
            return;
        }
        throw new IllegalStateException("Illegal decoder state");
    }
}
