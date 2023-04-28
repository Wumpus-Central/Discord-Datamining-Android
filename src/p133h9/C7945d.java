package p133h9;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import p119g9.C7510a;
import p119g9.C7543l;
import p119g9.C7558r;
import p119g9.RunnableC7534i;

/* renamed from: h9.d */
/* loaded from: classes5.dex */
public final class C7945d extends Surface {

    /* renamed from: n */
    private static int f17053n;

    /* renamed from: o */
    private static boolean f17054o;

    /* renamed from: k */
    public final boolean f17055k;

    /* renamed from: l */
    private final HandlerThreadC7947b f17056l;

    /* renamed from: m */
    private boolean f17057m;

    /* renamed from: h9.d$b */
    /* loaded from: classes5.dex */
    private static class HandlerThreadC7947b extends HandlerThread implements Handler.Callback {

        /* renamed from: k */
        private RunnableC7534i f17058k;

        /* renamed from: l */
        private Handler f17059l;

        /* renamed from: m */
        private Error f17060m;

        /* renamed from: n */
        private RuntimeException f17061n;

        /* renamed from: o */
        private C7945d f17062o;

        public HandlerThreadC7947b() {
            super("ExoPlayer:DummySurface");
        }

        /* renamed from: b */
        private void m21072b(int i) {
            boolean z;
            C7510a.m22367e(this.f17058k);
            this.f17058k.m22295h(i);
            SurfaceTexture g = this.f17058k.m22296g();
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f17062o = new C7945d(this, g, z);
        }

        /* renamed from: d */
        private void m21070d() {
            C7510a.m22367e(this.f17058k);
            this.f17058k.m22294i();
        }

        /* renamed from: a */
        public C7945d m21073a(int i) {
            boolean z;
            start();
            this.f17059l = new Handler(getLooper(), this);
            this.f17058k = new RunnableC7534i(this.f17059l);
            synchronized (this) {
                z = false;
                this.f17059l.obtainMessage(1, i, 0).sendToTarget();
                while (this.f17062o == null && this.f17061n == null && this.f17060m == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f17061n;
            if (runtimeException == null) {
                Error error = this.f17060m;
                if (error == null) {
                    return (C7945d) C7510a.m22367e(this.f17062o);
                }
                throw error;
            }
            throw runtimeException;
        }

        /* renamed from: c */
        public void m21071c() {
            C7510a.m22367e(this.f17059l);
            this.f17059l.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            try {
                if (i == 1) {
                    try {
                        m21072b(message.arg1);
                        synchronized (this) {
                            notify();
                        }
                    } catch (Error e) {
                        C7558r.m22108d("DummySurface", "Failed to initialize dummy surface", e);
                        this.f17060m = e;
                        synchronized (this) {
                            notify();
                        }
                    } catch (RuntimeException e2) {
                        C7558r.m22108d("DummySurface", "Failed to initialize dummy surface", e2);
                        this.f17061n = e2;
                        synchronized (this) {
                            notify();
                        }
                    }
                    return true;
                } else if (i != 2) {
                    return true;
                } else {
                    try {
                        m21070d();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
            } catch (Throwable th2) {
                synchronized (this) {
                    notify();
                    throw th2;
                }
            }
        }
    }

    /* renamed from: a */
    private static int m21076a(Context context) {
        if (!C7543l.m22268h(context)) {
            return 0;
        }
        if (C7543l.m22267i()) {
            return 1;
        }
        return 2;
    }

    /* renamed from: b */
    public static synchronized boolean m21075b(Context context) {
        boolean z;
        synchronized (C7945d.class) {
            z = true;
            if (!f17054o) {
                f17053n = m21076a(context);
                f17054o = true;
            }
            if (f17053n == 0) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: e */
    public static C7945d m21074e(Context context, boolean z) {
        boolean z2;
        int i = 0;
        if (!z || m21075b(context)) {
            z2 = true;
        } else {
            z2 = false;
        }
        C7510a.m22366f(z2);
        HandlerThreadC7947b bVar = new HandlerThreadC7947b();
        if (z) {
            i = f17053n;
        }
        return bVar.m21073a(i);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f17056l) {
            if (!this.f17057m) {
                this.f17056l.m21071c();
                this.f17057m = true;
            }
        }
    }

    private C7945d(HandlerThreadC7947b bVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f17056l = bVar;
        this.f17055k = z;
    }
}
