package p210l6;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: l6.b */
/* loaded from: classes7.dex */
public final class C10349b {

    /* renamed from: c */
    private final int f22706c;

    /* renamed from: a */
    private final C10349b f22704a = null;

    /* renamed from: e */
    private boolean f22708e = true;

    /* renamed from: d */
    private final int f22707d = -1;

    /* renamed from: g */
    private boolean f22710g = false;

    /* renamed from: f */
    private int f22709f = 0;

    /* renamed from: b */
    private final AtomicReference<C0323b> f22705b = new AtomicReference<>(C0323b.m13553a(64));

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l6.b$a */
    /* loaded from: classes7.dex */
    public static final class C10350a {
    }

    /* renamed from: l6.b$b */
    /* loaded from: classes7.dex */
    private static final class C0323b {

        /* renamed from: a */
        final int f22711a;

        /* renamed from: b */
        final int f22712b;

        /* renamed from: c */
        final String[] f22713c;

        /* renamed from: d */
        final C10350a[] f22714d;

        public C0323b(int i, int i2, String[] strArr, C10350a[] aVarArr) {
            this.f22711a = i;
            this.f22712b = i2;
            this.f22713c = strArr;
            this.f22714d = aVarArr;
        }

        /* renamed from: a */
        public static C0323b m13553a(int i) {
            return new C0323b(0, 0, new String[i], new C10350a[i >> 1]);
        }
    }

    private C10349b(int i) {
        this.f22706c = i;
    }

    /* renamed from: a */
    public static C10349b m13555a() {
        long currentTimeMillis = System.currentTimeMillis();
        return m13554b((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    /* renamed from: b */
    protected static C10349b m13554b(int i) {
        return new C10349b(i);
    }
}
