package io.sentry.transport;

/* renamed from: io.sentry.transport.a0 */
/* loaded from: classes8.dex */
public abstract class AbstractC9059a0 {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.sentry.transport.a0$b */
    /* loaded from: classes8.dex */
    public static final class C9061b extends AbstractC9059a0 {

        /* renamed from: a */
        private final int f19903a;

        C9061b(int i) {
            super();
            this.f19903a = i;
        }

        @Override // io.sentry.transport.AbstractC9059a0
        /* renamed from: c */
        public int mo17158c() {
            return this.f19903a;
        }

        @Override // io.sentry.transport.AbstractC9059a0
        /* renamed from: d */
        public boolean mo17157d() {
            return false;
        }
    }

    /* renamed from: io.sentry.transport.a0$c */
    /* loaded from: classes8.dex */
    private static final class C9062c extends AbstractC9059a0 {

        /* renamed from: a */
        static final C9062c f19904a = new C9062c();

        private C9062c() {
            super();
        }

        @Override // io.sentry.transport.AbstractC9059a0
        /* renamed from: c */
        public int mo17158c() {
            return -1;
        }

        @Override // io.sentry.transport.AbstractC9059a0
        /* renamed from: d */
        public boolean mo17157d() {
            return true;
        }
    }

    private AbstractC9059a0() {
    }

    /* renamed from: a */
    public static AbstractC9059a0 m17161a() {
        return m17160b(-1);
    }

    /* renamed from: b */
    public static AbstractC9059a0 m17160b(int i) {
        return new C9061b(i);
    }

    /* renamed from: e */
    public static AbstractC9059a0 m17159e() {
        return C9062c.f19904a;
    }

    /* renamed from: c */
    public abstract int mo17158c();

    /* renamed from: d */
    public abstract boolean mo17157d();
}
