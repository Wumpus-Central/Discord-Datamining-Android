package p448yh;

import p448yh.C14403d;

/* renamed from: yh.c */
/* loaded from: classes8.dex */
public abstract class AbstractC14400c {

    /* renamed from: yh.c$a */
    /* loaded from: classes8.dex */
    public static final class C14401a extends AbstractC14400c {

        /* renamed from: a */
        public static final C14401a f32582a = new C14401a();

        /* renamed from: b */
        private static final int f32583b;

        static {
            C14403d.C14404a aVar = C14403d.f32585c;
            f32583b = (~(aVar.m661i() | aVar.m666d())) & aVar.m668b();
        }

        private C14401a() {
        }

        @Override // p448yh.AbstractC14400c
        /* renamed from: a */
        public int mo684a() {
            return f32583b;
        }
    }

    /* renamed from: yh.c$b */
    /* loaded from: classes8.dex */
    public static final class C14402b extends AbstractC14400c {

        /* renamed from: a */
        public static final C14402b f32584a = new C14402b();

        private C14402b() {
        }

        @Override // p448yh.AbstractC14400c
        /* renamed from: a */
        public int mo684a() {
            return 0;
        }
    }

    /* renamed from: a */
    public abstract int mo684a();

    public String toString() {
        return getClass().getSimpleName();
    }
}
