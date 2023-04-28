package com.facebook.common.references;

import com.facebook.common.references.CloseableReference;
import p005a4.AbstractC1262c;
import p005a4.C1263d;
import p394w3.C13740j;

/* renamed from: com.facebook.common.references.d */
/* loaded from: classes7.dex */
public class C4774d<T> extends CloseableReference<T> {
    private C4774d(C1263d<T> dVar, CloseableReference.AbstractC4770c cVar, Throwable th2) {
        super(dVar, cVar, th2);
    }

    @Override // com.facebook.common.references.CloseableReference
    /* renamed from: l */
    public CloseableReference<T> clone() {
        C13740j.m2832i(m32037Q());
        return new C4774d(this.f7581l, this.f7582m, this.f7583n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4774d(T t, AbstractC1262c<T> cVar, CloseableReference.AbstractC4770c cVar2, Throwable th2) {
        super(t, cVar, cVar2, th2);
    }
}
