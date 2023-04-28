package com.google.android.exoplayer2.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import p081e9.AbstractC6790t;
import p119g9.C7510a;
import p119g9.C7546m0;
import p119g9.C7557q0;
import p119g9.C7558r;

/* renamed from: com.google.android.exoplayer2.upstream.h */
/* loaded from: classes5.dex */
public final class C5320h implements AbstractC6790t {

    /* renamed from: d */
    public static final C5323c f9874d = m29479h(false, -9223372036854775807L);

    /* renamed from: e */
    public static final C5323c f9875e = m29479h(true, -9223372036854775807L);

    /* renamed from: f */
    public static final C5323c f9876f = new C5323c(2, -9223372036854775807L);

    /* renamed from: g */
    public static final C5323c f9877g = new C5323c(3, -9223372036854775807L);

    /* renamed from: a */
    private final ExecutorService f9878a;

    /* renamed from: b */
    private HandlerC5324d<? extends AbstractC5325e> f9879b;

    /* renamed from: c */
    private IOException f9880c;

    /* renamed from: com.google.android.exoplayer2.upstream.h$b */
    /* loaded from: classes5.dex */
    public interface AbstractC5322b<T extends AbstractC5325e> {
        /* renamed from: i */
        void mo10446i(T t, long j, long j2, boolean z);

        /* renamed from: k */
        void mo10444k(T t, long j, long j2);

        /* renamed from: o */
        C5323c mo10440o(T t, long j, long j2, IOException iOException, int i);
    }

    /* renamed from: com.google.android.exoplayer2.upstream.h$c */
    /* loaded from: classes5.dex */
    public static final class C5323c {

        /* renamed from: a */
        private final int f9881a;

        /* renamed from: b */
        private final long f9882b;

        /* renamed from: c */
        public boolean m29470c() {
            int i = this.f9881a;
            return i == 0 || i == 1;
        }

        private C5323c(int i, long j) {
            this.f9881a = i;
            this.f9882b = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.exoplayer2.upstream.h$d */
    /* loaded from: classes5.dex */
    public final class HandlerC5324d<T extends AbstractC5325e> extends Handler implements Runnable {

        /* renamed from: k */
        public final int f9883k;

        /* renamed from: l */
        private final T f9884l;

        /* renamed from: m */
        private final long f9885m;

        /* renamed from: n */
        private AbstractC5322b<T> f9886n;

        /* renamed from: o */
        private IOException f9887o;

        /* renamed from: p */
        private int f9888p;

        /* renamed from: q */
        private Thread f9889q;

        /* renamed from: r */
        private boolean f9890r;

        /* renamed from: s */
        private volatile boolean f9891s;

        public HandlerC5324d(Looper looper, T t, AbstractC5322b<T> bVar, int i, long j) {
            super(looper);
            this.f9884l = t;
            this.f9886n = bVar;
            this.f9883k = i;
            this.f9885m = j;
        }

        /* renamed from: b */
        private void m29468b() {
            this.f9887o = null;
            C5320h.this.f9878a.execute((Runnable) C7510a.m22367e(C5320h.this.f9879b));
        }

        /* renamed from: c */
        private void m29467c() {
            C5320h.this.f9879b = null;
        }

        /* renamed from: d */
        private long m29466d() {
            return Math.min((this.f9888p - 1) * RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, 5000);
        }

        /* renamed from: a */
        public void m29469a(boolean z) {
            this.f9891s = z;
            this.f9887o = null;
            if (hasMessages(0)) {
                this.f9890r = true;
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f9890r = true;
                    this.f9884l.mo12496c();
                    Thread thread = this.f9889q;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z) {
                m29467c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ((AbstractC5322b) C7510a.m22367e(this.f9886n)).mo10446i(this.f9884l, elapsedRealtime, elapsedRealtime - this.f9885m, true);
                this.f9886n = null;
            }
        }

        /* renamed from: e */
        public void m29465e(int i) {
            IOException iOException = this.f9887o;
            if (iOException != null && this.f9888p > i) {
                throw iOException;
            }
        }

        /* renamed from: f */
        public void m29464f(long j) {
            boolean z;
            if (C5320h.this.f9879b == null) {
                z = true;
            } else {
                z = false;
            }
            C7510a.m22366f(z);
            C5320h.this.f9879b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                m29468b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            long j;
            if (!this.f9891s) {
                int i = message.what;
                if (i == 0) {
                    m29468b();
                } else if (i != 3) {
                    m29467c();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j2 = elapsedRealtime - this.f9885m;
                    AbstractC5322b bVar = (AbstractC5322b) C7510a.m22367e(this.f9886n);
                    if (this.f9890r) {
                        bVar.mo10446i(this.f9884l, elapsedRealtime, j2, false);
                        return;
                    }
                    int i2 = message.what;
                    if (i2 == 1) {
                        try {
                            bVar.mo10444k(this.f9884l, elapsedRealtime, j2);
                        } catch (RuntimeException e) {
                            C7558r.m22108d("LoadTask", "Unexpected exception handling load completed", e);
                            C5320h.this.f9880c = new C0147h(e);
                        }
                    } else if (i2 == 2) {
                        IOException iOException = (IOException) message.obj;
                        this.f9887o = iOException;
                        int i3 = this.f9888p + 1;
                        this.f9888p = i3;
                        C5323c o = bVar.mo10440o(this.f9884l, elapsedRealtime, j2, iOException, i3);
                        if (o.f9881a == 3) {
                            C5320h.this.f9880c = this.f9887o;
                        } else if (o.f9881a != 2) {
                            if (o.f9881a == 1) {
                                this.f9888p = 1;
                            }
                            if (o.f9882b != -9223372036854775807L) {
                                j = o.f9882b;
                            } else {
                                j = m29466d();
                            }
                            m29464f(j);
                        }
                    }
                } else {
                    throw ((Error) message.obj);
                }
            }
        }

        /* JADX WARN: Finally extract failed */
        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            try {
                synchronized (this) {
                    if (!this.f9890r) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f9889q = Thread.currentThread();
                }
                if (z) {
                    C7546m0.m22245a("load:" + this.f9884l.getClass().getSimpleName());
                    try {
                        this.f9884l.mo12497a();
                        C7546m0.m22243c();
                    } catch (Throwable th2) {
                        C7546m0.m22243c();
                        throw th2;
                    }
                }
                synchronized (this) {
                    this.f9889q = null;
                    Thread.interrupted();
                }
                if (!this.f9891s) {
                    sendEmptyMessage(1);
                }
            } catch (IOException e) {
                if (!this.f9891s) {
                    obtainMessage(2, e).sendToTarget();
                }
            } catch (Error e2) {
                C7558r.m22108d("LoadTask", "Unexpected error loading stream", e2);
                if (!this.f9891s) {
                    obtainMessage(3, e2).sendToTarget();
                }
                throw e2;
            } catch (Exception e3) {
                C7558r.m22108d("LoadTask", "Unexpected exception loading stream", e3);
                if (!this.f9891s) {
                    obtainMessage(2, new C0147h(e3)).sendToTarget();
                }
            } catch (OutOfMemoryError e4) {
                C7558r.m22108d("LoadTask", "OutOfMemory error loading stream", e4);
                if (!this.f9891s) {
                    obtainMessage(2, new C0147h(e4)).sendToTarget();
                }
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.h$e */
    /* loaded from: classes5.dex */
    public interface AbstractC5325e {
        /* renamed from: a */
        void mo12497a();

        /* renamed from: c */
        void mo12496c();
    }

    /* renamed from: com.google.android.exoplayer2.upstream.h$f */
    /* loaded from: classes5.dex */
    public interface AbstractC5326f {
        /* renamed from: p */
        void mo12402p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.upstream.h$g */
    /* loaded from: classes5.dex */
    public static final class RunnableC5327g implements Runnable {

        /* renamed from: k */
        private final AbstractC5326f f9893k;

        public RunnableC5327g(AbstractC5326f fVar) {
            this.f9893k = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9893k.mo12402p();
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.h$h */
    /* loaded from: classes5.dex */
    public static final class C0147h extends IOException {
        public C0147h(Throwable th2) {
            super("Unexpected " + th2.getClass().getSimpleName() + ": " + th2.getMessage(), th2);
        }
    }

    public C5320h(String str) {
        this.f9878a = C7557q0.m22116x0(str);
    }

    /* renamed from: h */
    public static C5323c m29479h(boolean z, long j) {
        return new C5323c(z ? 1 : 0, j);
    }

    @Override // p081e9.AbstractC6790t
    /* renamed from: a */
    public void mo24321a() {
        m29476k(Integer.MIN_VALUE);
    }

    /* renamed from: f */
    public void m29481f() {
        ((HandlerC5324d) C7510a.m22364h(this.f9879b)).m29469a(false);
    }

    /* renamed from: g */
    public void m29480g() {
        this.f9880c = null;
    }

    /* renamed from: i */
    public boolean m29478i() {
        return this.f9880c != null;
    }

    /* renamed from: j */
    public boolean m29477j() {
        return this.f9879b != null;
    }

    /* renamed from: k */
    public void m29476k(int i) {
        IOException iOException = this.f9880c;
        if (iOException == null) {
            HandlerC5324d<? extends AbstractC5325e> dVar = this.f9879b;
            if (dVar != null) {
                if (i == Integer.MIN_VALUE) {
                    i = dVar.f9883k;
                }
                dVar.m29465e(i);
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: l */
    public void m29475l() {
        m29474m(null);
    }

    /* renamed from: m */
    public void m29474m(AbstractC5326f fVar) {
        HandlerC5324d<? extends AbstractC5325e> dVar = this.f9879b;
        if (dVar != null) {
            dVar.m29469a(true);
        }
        if (fVar != null) {
            this.f9878a.execute(new RunnableC5327g(fVar));
        }
        this.f9878a.shutdown();
    }

    /* renamed from: n */
    public <T extends AbstractC5325e> long m29473n(T t, AbstractC5322b<T> bVar, int i) {
        this.f9880c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new HandlerC5324d((Looper) C7510a.m22364h(Looper.myLooper()), t, bVar, i, elapsedRealtime).m29464f(0L);
        return elapsedRealtime;
    }
}
