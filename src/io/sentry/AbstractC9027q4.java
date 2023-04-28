package io.sentry;

import java.lang.Thread;

/* renamed from: io.sentry.q4 */
/* loaded from: classes8.dex */
interface AbstractC9027q4 {

    /* renamed from: io.sentry.q4$a */
    /* loaded from: classes8.dex */
    public static final class C9028a implements AbstractC9027q4 {

        /* renamed from: a */
        private static final C9028a f19854a = new C9028a();

        private C9028a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public static AbstractC9027q4 m17200c() {
            return f19854a;
        }

        @Override // io.sentry.AbstractC9027q4
        /* renamed from: a */
        public void mo17202a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        }

        @Override // io.sentry.AbstractC9027q4
        /* renamed from: b */
        public Thread.UncaughtExceptionHandler mo17201b() {
            return Thread.getDefaultUncaughtExceptionHandler();
        }
    }

    /* renamed from: a */
    void mo17202a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler);

    /* renamed from: b */
    Thread.UncaughtExceptionHandler mo17201b();
}
