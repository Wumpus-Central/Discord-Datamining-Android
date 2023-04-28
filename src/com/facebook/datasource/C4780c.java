package com.facebook.datasource;

import com.facebook.common.internal.Supplier;

/* renamed from: com.facebook.datasource.c */
/* loaded from: classes7.dex */
public class C4780c {

    /* renamed from: com.facebook.datasource.c$a */
    /* loaded from: classes7.dex */
    static class C4781a implements Supplier<DataSource<T>> {

        /* renamed from: a */
        final /* synthetic */ Throwable f7602a;

        C4781a(Throwable th2) {
            this.f7602a = th2;
        }

        /* renamed from: a */
        public DataSource<T> get() {
            return C4780c.m32000b(this.f7602a);
        }
    }

    /* renamed from: a */
    public static <T> Supplier<DataSource<T>> m32001a(Throwable th2) {
        return new C4781a(th2);
    }

    /* renamed from: b */
    public static <T> DataSource<T> m32000b(Throwable th2) {
        C4789g x = C4789g.m31966x();
        x.mo31967p(th2);
        return x;
    }
}
