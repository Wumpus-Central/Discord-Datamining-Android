package com.facebook.common.references;

import com.facebook.common.references.CloseableReference;
import p005a4.AbstractC1262c;
import p414x3.C13925a;

/* renamed from: com.facebook.common.references.b */
/* loaded from: classes7.dex */
public class C4772b<T> extends CloseableReference<T> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4772b(T t, AbstractC1262c<T> cVar, CloseableReference.AbstractC4770c cVar2, Throwable th2) {
        super(t, cVar, cVar2, th2);
    }

    @Override // com.facebook.common.references.CloseableReference, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.common.references.CloseableReference
    public void finalize() {
        String str;
        try {
            synchronized (this) {
                if (!this.f7580k) {
                    T f = this.f7581l.m41508f();
                    Object[] objArr = new Object[3];
                    objArr[0] = Integer.valueOf(System.identityHashCode(this));
                    objArr[1] = Integer.valueOf(System.identityHashCode(this.f7581l));
                    if (f == null) {
                        str = null;
                    } else {
                        str = f.getClass().getName();
                    }
                    objArr[2] = str;
                    C13925a.m2302J("FinalizerCloseableReference", "Finalized without closing: %x %x (type = %s)", objArr);
                    this.f7581l.m41510d();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.facebook.common.references.CloseableReference
    /* renamed from: l */
    public CloseableReference<T> clone() {
        return this;
    }
}
