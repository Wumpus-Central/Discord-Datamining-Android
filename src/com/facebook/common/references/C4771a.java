package com.facebook.common.references;

import com.facebook.common.references.CloseableReference;
import p005a4.AbstractC1262c;
import p005a4.C1263d;
import p394w3.C13740j;
import p414x3.C13925a;

/* renamed from: com.facebook.common.references.a */
/* loaded from: classes7.dex */
public class C4771a<T> extends CloseableReference<T> {
    private C4771a(C1263d<T> dVar, CloseableReference.AbstractC4770c cVar, Throwable th2) {
        super(dVar, cVar, th2);
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
                    C13925a.m2302J("DefaultCloseableReference", "Finalized without closing: %x %x (type = %s)", objArr);
                    this.f7582m.mo6970a(this.f7581l, this.f7583n);
                    close();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.facebook.common.references.CloseableReference
    /* renamed from: l */
    public CloseableReference<T> clone() {
        Throwable th2;
        C13740j.m2832i(m32037Q());
        C1263d<T> dVar = this.f7581l;
        CloseableReference.AbstractC4770c cVar = this.f7582m;
        if (this.f7583n != null) {
            th2 = new Throwable(this.f7583n);
        } else {
            th2 = null;
        }
        return new C4771a(dVar, cVar, th2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4771a(T t, AbstractC1262c<T> cVar, CloseableReference.AbstractC4770c cVar2, Throwable th2) {
        super(t, cVar, cVar2, th2);
    }
}
