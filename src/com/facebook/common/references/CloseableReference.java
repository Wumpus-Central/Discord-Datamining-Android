package com.facebook.common.references;

import android.graphics.Bitmap;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p005a4.AbstractC1260a;
import p005a4.AbstractC1262c;
import p005a4.C1263d;
import p394w3.C13729b;
import p394w3.C13740j;
import p414x3.C13925a;

/* loaded from: classes7.dex */
public abstract class CloseableReference<T> implements Cloneable, Closeable {

    /* renamed from: p */
    private static int f7577p;

    /* renamed from: k */
    protected boolean f7580k = false;

    /* renamed from: l */
    protected final C1263d<T> f7581l;

    /* renamed from: m */
    protected final AbstractC4770c f7582m;

    /* renamed from: n */
    protected final Throwable f7583n;

    /* renamed from: o */
    private static Class<CloseableReference> f7576o = CloseableReference.class;

    /* renamed from: q */
    private static final AbstractC1262c<Closeable> f7578q = new C4768a();

    /* renamed from: r */
    private static final AbstractC4770c f7579r = new C4769b();

    /* renamed from: com.facebook.common.references.CloseableReference$a */
    /* loaded from: classes7.dex */
    static class C4768a implements AbstractC1262c<Closeable> {
        C4768a() {
        }

        /* renamed from: a */
        public void release(Closeable closeable) {
            try {
                C13729b.m2857a(closeable, true);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: com.facebook.common.references.CloseableReference$b */
    /* loaded from: classes7.dex */
    static class C4769b implements AbstractC4770c {
        C4769b() {
        }

        @Override // com.facebook.common.references.CloseableReference.AbstractC4770c
        /* renamed from: a */
        public void mo6970a(C1263d<Object> dVar, Throwable th2) {
            String str;
            Object f = dVar.m41508f();
            Class cls = CloseableReference.f7576o;
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(System.identityHashCode(this));
            objArr[1] = Integer.valueOf(System.identityHashCode(dVar));
            if (f == null) {
                str = null;
            } else {
                str = f.getClass().getName();
            }
            objArr[2] = str;
            C13925a.m2306F(cls, "Finalized without closing: %x %x (type = %s)", objArr);
        }

        @Override // com.facebook.common.references.CloseableReference.AbstractC4770c
        /* renamed from: b */
        public boolean mo6969b() {
            return false;
        }
    }

    /* renamed from: com.facebook.common.references.CloseableReference$c */
    /* loaded from: classes7.dex */
    public interface AbstractC4770c {
        /* renamed from: a */
        void mo6970a(C1263d<Object> dVar, Throwable th2);

        /* renamed from: b */
        boolean mo6969b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public CloseableReference(C1263d<T> dVar, AbstractC4770c cVar, Throwable th2) {
        this.f7581l = (C1263d) C13740j.m2834g(dVar);
        dVar.m41512b();
        this.f7582m = cVar;
        this.f7583n = th2;
    }

    /* renamed from: R */
    public static boolean m32036R(CloseableReference<?> closeableReference) {
        return closeableReference != null && closeableReference.m32037Q();
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/io/Closeable;>(TT;)Lcom/facebook/common/references/CloseableReference<TT;>; */
    /* renamed from: S */
    public static CloseableReference m32035S(Closeable closeable) {
        return m32033Y(closeable, f7578q);
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/io/Closeable;>(TT;Lcom/facebook/common/references/CloseableReference$c;)Lcom/facebook/common/references/CloseableReference<TT;>; */
    /* renamed from: U */
    public static CloseableReference m32034U(Closeable closeable, AbstractC4770c cVar) {
        Throwable th2 = null;
        if (closeable == null) {
            return null;
        }
        AbstractC1262c<Closeable> cVar2 = f7578q;
        if (cVar.mo6969b()) {
            th2 = new Throwable();
        }
        return m32031f0(closeable, cVar2, cVar, th2);
    }

    /* renamed from: Y */
    public static <T> CloseableReference<T> m32033Y(T t, AbstractC1262c<T> cVar) {
        return m32032b0(t, cVar, f7579r);
    }

    /* renamed from: b0 */
    public static <T> CloseableReference<T> m32032b0(T t, AbstractC1262c<T> cVar, AbstractC4770c cVar2) {
        Throwable th2 = null;
        if (t == null) {
            return null;
        }
        if (cVar2.mo6969b()) {
            th2 = new Throwable();
        }
        return m32031f0(t, cVar, cVar2, th2);
    }

    /* renamed from: f0 */
    public static <T> CloseableReference<T> m32031f0(T t, AbstractC1262c<T> cVar, AbstractC4770c cVar2, Throwable th2) {
        if (t == null) {
            return null;
        }
        if ((t instanceof Bitmap) || (t instanceof AbstractC1260a)) {
            int i = f7577p;
            if (i == 1) {
                return new C4772b(t, cVar, cVar2, th2);
            }
            if (i == 2) {
                return new C4774d(t, cVar, cVar2, th2);
            }
            if (i == 3) {
                return new C4773c(t, cVar, cVar2, th2);
            }
        }
        return new C4771a(t, cVar, cVar2, th2);
    }

    /* renamed from: j0 */
    public static void m32029j0(int i) {
        f7577p = i;
    }

    /* renamed from: r */
    public static <T> CloseableReference<T> m32027r(CloseableReference<T> closeableReference) {
        if (closeableReference != null) {
            return closeableReference.m32028n();
        }
        return null;
    }

    /* renamed from: s */
    public static <T> List<CloseableReference<T>> m32026s(Collection<CloseableReference<T>> collection) {
        if (collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (CloseableReference<T> closeableReference : collection) {
            arrayList.add(m32027r(closeableReference));
        }
        return arrayList;
    }

    /* renamed from: t */
    public static void m32025t(CloseableReference<?> closeableReference) {
        if (closeableReference != null) {
            closeableReference.close();
        }
    }

    /* renamed from: w0 */
    public static boolean m32024w0() {
        return f7577p == 3;
    }

    /* renamed from: z */
    public static void m32023z(Iterable<? extends CloseableReference<?>> iterable) {
        if (iterable != null) {
            Iterator<? extends CloseableReference<?>> it = iterable.iterator();
            while (it.hasNext()) {
                m32025t((CloseableReference) it.next());
            }
        }
    }

    /* renamed from: C */
    public synchronized T m32039C() {
        boolean z;
        if (!this.f7580k) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2832i(z);
        return (T) C13740j.m2834g(this.f7581l.m41508f());
    }

    /* renamed from: H */
    public int m32038H() {
        if (m32037Q()) {
            return System.identityHashCode(this.f7581l.m41508f());
        }
        return 0;
    }

    /* renamed from: Q */
    public synchronized boolean m32037Q() {
        return !this.f7580k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (!this.f7580k) {
                this.f7580k = true;
                this.f7581l.m41510d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void finalize() {
        try {
            synchronized (this) {
                if (!this.f7580k) {
                    this.f7582m.mo6970a(this.f7581l, this.f7583n);
                    close();
                }
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: l */
    public abstract CloseableReference<T> clone();

    /* renamed from: n */
    public synchronized CloseableReference<T> m32028n() {
        if (!m32037Q()) {
            return null;
        }
        return clone();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public CloseableReference(T t, AbstractC1262c<T> cVar, AbstractC4770c cVar2, Throwable th2) {
        this.f7581l = new C1263d<>(t, cVar);
        this.f7582m = cVar2;
        this.f7583n = th2;
    }
}
