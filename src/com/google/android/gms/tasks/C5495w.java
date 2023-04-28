package com.google.android.gms.tasks;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import p064db.AbstractC6421a;
import p064db.AbstractC6423c;
import p064db.AbstractC6424d;
import p064db.AbstractC6425e;
import p064db.AbstractC6426f;
import p064db.AbstractC6428h;
import p064db.C6422b;
import p064db.C6427g;
import p420x9.C14004p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.tasks.w */
/* loaded from: classes3.dex */
public final class C5495w<TResult> extends Task<TResult> {

    /* renamed from: a */
    private final Object f10414a = new Object();

    /* renamed from: b */
    private final C5492t<TResult> f10415b = new C5492t<>();

    /* renamed from: c */
    private boolean f10416c;

    /* renamed from: d */
    private volatile boolean f10417d;

    /* renamed from: e */
    private TResult f10418e;

    /* renamed from: f */
    private Exception f10419f;

    /* renamed from: v */
    private final void m28851v() {
        C14004p.m2048m(this.f10416c, "Task is not yet complete");
    }

    /* renamed from: w */
    private final void m28850w() {
        if (this.f10417d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* renamed from: x */
    private final void m28849x() {
        if (this.f10416c) {
            throw C6422b.m25578a(this);
        }
    }

    /* renamed from: y */
    private final void m28848y() {
        synchronized (this.f10414a) {
            if (this.f10416c) {
                this.f10415b.m28873b(this);
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: a */
    public final Task<TResult> mo28872a(Executor executor, AbstractC6423c cVar) {
        this.f10415b.m28874a(new C5482j(executor, cVar));
        m28848y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: b */
    public final Task<TResult> mo28871b(AbstractC6424d<TResult> dVar) {
        this.f10415b.m28874a(new C5484l(C5473a.f10373a, dVar));
        m28848y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: c */
    public final Task<TResult> mo28870c(Executor executor, AbstractC6424d<TResult> dVar) {
        this.f10415b.m28874a(new C5484l(executor, dVar));
        m28848y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: d */
    public final Task<TResult> mo28869d(AbstractC6425e eVar) {
        mo28868e(C5473a.f10373a, eVar);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: e */
    public final Task<TResult> mo28868e(Executor executor, AbstractC6425e eVar) {
        this.f10415b.m28874a(new C5486n(executor, eVar));
        m28848y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: f */
    public final Task<TResult> mo28867f(AbstractC6426f<? super TResult> fVar) {
        mo28866g(C5473a.f10373a, fVar);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: g */
    public final Task<TResult> mo28866g(Executor executor, AbstractC6426f<? super TResult> fVar) {
        this.f10415b.m28874a(new C5488p(executor, fVar));
        m28848y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: h */
    public final <TContinuationResult> Task<TContinuationResult> mo28865h(Executor executor, AbstractC6421a<TResult, TContinuationResult> aVar) {
        C5495w wVar = new C5495w();
        this.f10415b.m28874a(new C5478f(executor, aVar, wVar));
        m28848y();
        return wVar;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: i */
    public final <TContinuationResult> Task<TContinuationResult> mo28864i(Executor executor, AbstractC6421a<TResult, Task<TContinuationResult>> aVar) {
        C5495w wVar = new C5495w();
        this.f10415b.m28874a(new C5480h(executor, aVar, wVar));
        m28848y();
        return wVar;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: j */
    public final Exception mo28863j() {
        Exception exc;
        synchronized (this.f10414a) {
            exc = this.f10419f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: k */
    public final TResult mo28862k() {
        TResult tresult;
        synchronized (this.f10414a) {
            m28851v();
            m28850w();
            Exception exc = this.f10419f;
            if (exc == null) {
                tresult = this.f10418e;
            } else {
                throw new C6427g(exc);
            }
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: l */
    public final <X extends Throwable> TResult mo28861l(Class<X> cls) {
        TResult tresult;
        synchronized (this.f10414a) {
            m28851v();
            m28850w();
            if (!cls.isInstance(this.f10419f)) {
                Exception exc = this.f10419f;
                if (exc == null) {
                    tresult = this.f10418e;
                } else {
                    throw new C6427g(exc);
                }
            } else {
                throw cls.cast(this.f10419f);
            }
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: m */
    public final boolean mo28860m() {
        return this.f10417d;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: n */
    public final boolean mo28859n() {
        boolean z;
        synchronized (this.f10414a) {
            z = this.f10416c;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: o */
    public final boolean mo28858o() {
        boolean z;
        synchronized (this.f10414a) {
            z = false;
            if (this.f10416c && !this.f10417d && this.f10419f == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: p */
    public final <TContinuationResult> Task<TContinuationResult> mo28857p(Executor executor, AbstractC6428h<TResult, TContinuationResult> hVar) {
        C5495w wVar = new C5495w();
        this.f10415b.m28874a(new C5490r(executor, hVar, wVar));
        m28848y();
        return wVar;
    }

    /* renamed from: q */
    public final void m28856q(Exception exc) {
        C14004p.m2050k(exc, "Exception must not be null");
        synchronized (this.f10414a) {
            m28849x();
            this.f10416c = true;
            this.f10419f = exc;
        }
        this.f10415b.m28873b(this);
    }

    /* renamed from: r */
    public final void m28855r(TResult tresult) {
        synchronized (this.f10414a) {
            m28849x();
            this.f10416c = true;
            this.f10418e = tresult;
        }
        this.f10415b.m28873b(this);
    }

    /* renamed from: s */
    public final boolean m28854s() {
        synchronized (this.f10414a) {
            if (this.f10416c) {
                return false;
            }
            this.f10416c = true;
            this.f10417d = true;
            this.f10415b.m28873b(this);
            return true;
        }
    }

    /* renamed from: t */
    public final boolean m28853t(Exception exc) {
        C14004p.m2050k(exc, "Exception must not be null");
        synchronized (this.f10414a) {
            if (this.f10416c) {
                return false;
            }
            this.f10416c = true;
            this.f10419f = exc;
            this.f10415b.m28873b(this);
            return true;
        }
    }

    /* renamed from: u */
    public final boolean m28852u(TResult tresult) {
        synchronized (this.f10414a) {
            if (this.f10416c) {
                return false;
            }
            this.f10416c = true;
            this.f10418e = tresult;
            this.f10415b.m28873b(this);
            return true;
        }
    }
}
