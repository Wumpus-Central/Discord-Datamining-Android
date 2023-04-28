package com.facebook.common.references;

import com.facebook.common.references.CloseableReference;
import p005a4.AbstractC1262c;

/* renamed from: com.facebook.common.references.c */
/* loaded from: classes7.dex */
public class C4773c<T> extends CloseableReference<T> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4773c(T t, AbstractC1262c<T> cVar, CloseableReference.AbstractC4770c cVar2, Throwable th2) {
        super(t, cVar, cVar2, th2);
    }

    @Override // com.facebook.common.references.CloseableReference, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.facebook.common.references.CloseableReference
    /* renamed from: l */
    public CloseableReference<T> clone() {
        return this;
    }
}
