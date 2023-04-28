package p152i7;

import java.util.ArrayDeque;
import p119g9.C7510a;
import p152i7.AbstractC8226j;
import p152i7.C8222g;
import p152i7.C8223h;

/* renamed from: i7.k */
/* loaded from: classes7.dex */
public abstract class AbstractC8228k<I extends C8223h, O extends AbstractC8226j, E extends C8222g> implements AbstractC8220e<I, O, E> {

    /* renamed from: a */
    private final Thread f17813a;

    /* renamed from: b */
    private final Object f17814b = new Object();

    /* renamed from: c */
    private final ArrayDeque<I> f17815c = new ArrayDeque<>();

    /* renamed from: d */
    private final ArrayDeque<O> f17816d = new ArrayDeque<>();

    /* renamed from: e */
    private final I[] f17817e;

    /* renamed from: f */
    private final O[] f17818f;

    /* renamed from: g */
    private int f17819g;

    /* renamed from: h */
    private int f17820h;

    /* renamed from: i */
    private I f17821i;

    /* renamed from: j */
    private E f17822j;

    /* renamed from: k */
    private boolean f17823k;

    /* renamed from: l */
    private boolean f17824l;

    /* renamed from: m */
    private int f17825m;

    /* renamed from: i7.k$a */
    /* loaded from: classes7.dex */
    class C8229a extends Thread {
        C8229a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            AbstractC8228k.this.m20268t();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC8228k(I[] iArr, O[] oArr) {
        this.f17817e = iArr;
        this.f17819g = iArr.length;
        for (int i = 0; i < this.f17819g; i++) {
            this.f17817e[i] = mo6676g();
        }
        this.f17818f = oArr;
        this.f17820h = oArr.length;
        for (int i2 = 0; i2 < this.f17820h; i2++) {
            this.f17818f[i2] = mo6675h();
        }
        C8229a aVar = new C8229a("ExoPlayer:SimpleDecoder");
        this.f17813a = aVar;
        aVar.start();
    }

    /* renamed from: f */
    private boolean m20278f() {
        return !this.f17815c.isEmpty() && this.f17820h > 0;
    }

    /* renamed from: k */
    private boolean m20277k() {
        E e;
        synchronized (this.f17814b) {
            while (!this.f17824l && !m20278f()) {
                this.f17814b.wait();
            }
            if (this.f17824l) {
                return false;
            }
            I removeFirst = this.f17815c.removeFirst();
            O[] oArr = this.f17818f;
            int i = this.f17820h - 1;
            this.f17820h = i;
            O o = oArr[i];
            boolean z = this.f17823k;
            this.f17823k = false;
            if (removeFirst.m20299k()) {
                o.m20304e(4);
            } else {
                if (removeFirst.m20300j()) {
                    o.m20304e(Integer.MIN_VALUE);
                }
                try {
                    e = mo6673j(removeFirst, o, z);
                } catch (OutOfMemoryError e2) {
                    e = mo6674i(e2);
                } catch (RuntimeException e3) {
                    e = mo6674i(e3);
                }
                if (e != null) {
                    synchronized (this.f17814b) {
                        this.f17822j = e;
                    }
                    return false;
                }
            }
            synchronized (this.f17814b) {
                if (this.f17823k) {
                    o.mo5319n();
                } else if (o.m20300j()) {
                    this.f17825m++;
                    o.mo5319n();
                } else {
                    o.f17812m = this.f17825m;
                    this.f17825m = 0;
                    this.f17816d.addLast(o);
                }
                m20271q(removeFirst);
            }
            return true;
        }
    }

    /* renamed from: n */
    private void m20274n() {
        if (m20278f()) {
            this.f17814b.notify();
        }
    }

    /* renamed from: o */
    private void m20273o() {
        E e = this.f17822j;
        if (e != null) {
            throw e;
        }
    }

    /* renamed from: q */
    private void m20271q(I i) {
        i.mo1151f();
        I[] iArr = this.f17817e;
        int i2 = this.f17819g;
        this.f17819g = i2 + 1;
        iArr[i2] = i;
    }

    /* renamed from: s */
    private void m20269s(O o) {
        o.mo1151f();
        O[] oArr = this.f17818f;
        int i = this.f17820h;
        this.f17820h = i + 1;
        oArr[i] = o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public void m20268t() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (m20277k());
    }

    @Override // p152i7.AbstractC8220e
    public final void flush() {
        synchronized (this.f17814b) {
            this.f17823k = true;
            this.f17825m = 0;
            I i = this.f17821i;
            if (i != null) {
                m20271q(i);
                this.f17821i = null;
            }
            while (!this.f17815c.isEmpty()) {
                m20271q(this.f17815c.removeFirst());
            }
            while (!this.f17816d.isEmpty()) {
                this.f17816d.removeFirst().mo5319n();
            }
        }
    }

    /* renamed from: g */
    protected abstract I mo6676g();

    /* renamed from: h */
    protected abstract O mo6675h();

    /* renamed from: i */
    protected abstract E mo6674i(Throwable th2);

    /* renamed from: j */
    protected abstract E mo6673j(I i, O o, boolean z);

    /* renamed from: l */
    public final I mo5332d() {
        boolean z;
        I i;
        synchronized (this.f17814b) {
            m20273o();
            if (this.f17821i == null) {
                z = true;
            } else {
                z = false;
            }
            C7510a.m22366f(z);
            int i2 = this.f17819g;
            if (i2 == 0) {
                i = null;
            } else {
                I[] iArr = this.f17817e;
                int i3 = i2 - 1;
                this.f17819g = i3;
                i = iArr[i3];
            }
            this.f17821i = i;
        }
        return i;
    }

    /* renamed from: m */
    public final O mo5334b() {
        synchronized (this.f17814b) {
            m20273o();
            if (this.f17816d.isEmpty()) {
                return null;
            }
            return this.f17816d.removeFirst();
        }
    }

    /* renamed from: p */
    public final void mo5333c(I i) {
        boolean z;
        synchronized (this.f17814b) {
            m20273o();
            if (i == this.f17821i) {
                z = true;
            } else {
                z = false;
            }
            C7510a.m22371a(z);
            this.f17815c.addLast(i);
            m20274n();
            this.f17821i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public void m20270r(O o) {
        synchronized (this.f17814b) {
            m20269s(o);
            m20274n();
        }
    }

    @Override // p152i7.AbstractC8220e
    public void release() {
        synchronized (this.f17814b) {
            this.f17824l = true;
            this.f17814b.notify();
        }
        try {
            this.f17813a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public final void m20267u(int i) {
        boolean z;
        if (this.f17819g == this.f17817e.length) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22366f(z);
        for (I i2 : this.f17817e) {
            i2.m20285o(i);
        }
    }
}
