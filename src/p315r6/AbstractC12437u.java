package p315r6;

import android.content.Context;
import java.io.Closeable;
import p008a7.AbstractC1282d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r6.u */
/* loaded from: classes7.dex */
public abstract class AbstractC12437u implements Closeable {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r6.u$a */
    /* loaded from: classes7.dex */
    public interface AbstractC12438a {
        /* renamed from: a */
        AbstractC12438a mo6777a(Context context);

        AbstractC12437u build();
    }

    /* renamed from: b */
    abstract AbstractC1282d mo6779b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        mo6779b().close();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract C12436t mo6778g();
}
