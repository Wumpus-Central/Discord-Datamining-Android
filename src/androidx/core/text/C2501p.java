package androidx.core.text;

import java.util.Locale;

/* renamed from: androidx.core.text.p */
/* loaded from: classes.dex */
public final class C2501p {

    /* renamed from: c */
    public static final AbstractC2500o f3468c;

    /* renamed from: d */
    public static final AbstractC2500o f3469d;

    /* renamed from: a */
    public static final AbstractC2500o f3466a = new C2506e(null, false);

    /* renamed from: b */
    public static final AbstractC2500o f3467b = new C2506e(null, true);

    /* renamed from: e */
    public static final AbstractC2500o f3470e = new C2506e(C2502a.f3472b, false);

    /* renamed from: f */
    public static final AbstractC2500o f3471f = C2507f.f3477b;

    /* renamed from: androidx.core.text.p$a */
    /* loaded from: classes.dex */
    private static class C2502a implements AbstractC2504c {

        /* renamed from: b */
        static final C2502a f3472b = new C2502a(true);

        /* renamed from: a */
        private final boolean f3473a;

        private C2502a(boolean z) {
            this.f3473a = z;
        }

        @Override // androidx.core.text.C2501p.AbstractC2504c
        /* renamed from: a */
        public int mo37614a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int a = C2501p.m37616a(Character.getDirectionality(charSequence.charAt(i)));
                if (a != 0) {
                    if (a != 1) {
                        continue;
                        i++;
                        z = z;
                    } else if (!this.f3473a) {
                        return 1;
                    }
                } else if (this.f3473a) {
                    return 0;
                }
                z = true;
                i++;
                z = z;
            }
            if (z) {
                return this.f3473a ? 1 : 0;
            }
            return 2;
        }
    }

    /* renamed from: androidx.core.text.p$b */
    /* loaded from: classes.dex */
    private static class C2503b implements AbstractC2504c {

        /* renamed from: a */
        static final C2503b f3474a = new C2503b();

        private C2503b() {
        }

        @Override // androidx.core.text.C2501p.AbstractC2504c
        /* renamed from: a */
        public int mo37614a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = C2501p.m37615b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.text.p$c */
    /* loaded from: classes.dex */
    public interface AbstractC2504c {
        /* renamed from: a */
        int mo37614a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: androidx.core.text.p$d */
    /* loaded from: classes.dex */
    private static abstract class AbstractC2505d implements AbstractC2500o {

        /* renamed from: a */
        private final AbstractC2504c f3475a;

        AbstractC2505d(AbstractC2504c cVar) {
            this.f3475a = cVar;
        }

        /* renamed from: b */
        private boolean m37613b(CharSequence charSequence, int i, int i2) {
            int a = this.f3475a.mo37614a(charSequence, i, i2);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return mo37612a();
            }
            return false;
        }

        /* renamed from: a */
        protected abstract boolean mo37612a();

        @Override // androidx.core.text.AbstractC2500o
        public boolean isRtl(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            } else if (this.f3475a == null) {
                return mo37612a();
            } else {
                return m37613b(charSequence, i, i2);
            }
        }
    }

    /* renamed from: androidx.core.text.p$e */
    /* loaded from: classes.dex */
    private static class C2506e extends AbstractC2505d {

        /* renamed from: b */
        private final boolean f3476b;

        C2506e(AbstractC2504c cVar, boolean z) {
            super(cVar);
            this.f3476b = z;
        }

        @Override // androidx.core.text.C2501p.AbstractC2505d
        /* renamed from: a */
        protected boolean mo37612a() {
            return this.f3476b;
        }
    }

    /* renamed from: androidx.core.text.p$f */
    /* loaded from: classes.dex */
    private static class C2507f extends AbstractC2505d {

        /* renamed from: b */
        static final C2507f f3477b = new C2507f();

        C2507f() {
            super(null);
        }

        @Override // androidx.core.text.C2501p.AbstractC2505d
        /* renamed from: a */
        protected boolean mo37612a() {
            return C2508q.m37611a(Locale.getDefault()) == 1;
        }
    }

    static {
        C2503b bVar = C2503b.f3474a;
        f3468c = new C2506e(bVar, false);
        f3469d = new C2506e(bVar, true);
    }

    /* renamed from: a */
    static int m37616a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    static int m37615b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
