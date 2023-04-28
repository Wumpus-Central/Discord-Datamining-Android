package p415x4;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p057d4.AbstractC6395b;
import p415x4.AbstractC13928a;

/* renamed from: x4.c */
/* loaded from: classes7.dex */
public class C13930c<T extends AbstractC13928a> extends C13929b<T> {

    /* renamed from: e */
    private final AbstractC6395b f31394e;

    /* renamed from: f */
    private final ScheduledExecutorService f31395f;

    /* renamed from: h */
    private long f31397h;

    /* renamed from: k */
    private AbstractC13932b f31400k;

    /* renamed from: g */
    private boolean f31396g = false;

    /* renamed from: i */
    private long f31398i = 2000;

    /* renamed from: j */
    private long f31399j = 1000;

    /* renamed from: l */
    private final Runnable f31401l = new RunnableC13931a();

    /* renamed from: x4.c$a */
    /* loaded from: classes7.dex */
    class RunnableC13931a implements Runnable {
        RunnableC13931a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C13930c.this) {
                C13930c.this.f31396g = false;
                if (!C13930c.this.m2248p()) {
                    C13930c.this.m2247q();
                } else if (C13930c.this.f31400k != null) {
                    C13930c.this.f31400k.mo1337h();
                }
            }
        }
    }

    /* renamed from: x4.c$b */
    /* loaded from: classes7.dex */
    public interface AbstractC13932b {
        /* renamed from: h */
        void mo1337h();
    }

    private C13930c(T t, AbstractC13932b bVar, AbstractC6395b bVar2, ScheduledExecutorService scheduledExecutorService) {
        super(t);
        this.f31400k = bVar;
        this.f31394e = bVar2;
        this.f31395f = scheduledExecutorService;
    }

    /* renamed from: n */
    public static <T extends AbstractC13928a & AbstractC13932b> C13929b<T> m2250n(T t, AbstractC6395b bVar, ScheduledExecutorService scheduledExecutorService) {
        return m2249o(t, (AbstractC13932b) t, bVar, scheduledExecutorService);
    }

    /* renamed from: o */
    public static <T extends AbstractC13928a> C13929b<T> m2249o(T t, AbstractC13932b bVar, AbstractC6395b bVar2, ScheduledExecutorService scheduledExecutorService) {
        return new C13930c(t, bVar, bVar2, scheduledExecutorService);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public boolean m2248p() {
        return this.f31394e.now() - this.f31397h > this.f31398i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public synchronized void m2247q() {
        if (!this.f31396g) {
            this.f31396g = true;
            this.f31395f.schedule(this.f31401l, this.f31399j, TimeUnit.MILLISECONDS);
        }
    }

    @Override // p415x4.C13929b, p415x4.AbstractC13928a
    /* renamed from: g */
    public boolean mo1338g(Drawable drawable, Canvas canvas, int i) {
        this.f31397h = this.f31394e.now();
        boolean g = super.mo1338g(drawable, canvas, i);
        m2247q();
        return g;
    }
}
