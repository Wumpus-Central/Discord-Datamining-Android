package p315r6;

import java.util.concurrent.Executor;
import p362u6.AbstractC13194b;
import p362u6.C13196d;

/* renamed from: r6.k */
/* loaded from: classes7.dex */
public final class C12423k implements AbstractC13194b<Executor> {

    /* renamed from: r6.k$a */
    /* loaded from: classes7.dex */
    private static final class C12424a {

        /* renamed from: a */
        private static final C12423k f27967a = new C12423k();
    }

    /* renamed from: a */
    public static C12423k m6821a() {
        return C12424a.f27967a;
    }

    /* renamed from: b */
    public static Executor m6820b() {
        return (Executor) C13196d.m4360c(AbstractC12422j.m6822a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public Executor get() {
        return m6820b();
    }
}
