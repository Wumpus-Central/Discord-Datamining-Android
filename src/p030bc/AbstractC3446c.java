package p030bc;

import p163j$.util.function.Predicate;

/* renamed from: bc.c */
/* loaded from: classes3.dex */
public abstract class AbstractC3446c implements AbstractC3459k<Character> {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bc.c$a */
    /* loaded from: classes3.dex */
    public static final class C3447a extends AbstractC3450e {

        /* renamed from: b */
        static final C3447a f5588b = new C3447a();

        private C3447a() {
            super("CharMatcher.any()");
        }

        @Override // p030bc.AbstractC3446c
        /* renamed from: d */
        public int mo34366d(CharSequence charSequence, int i) {
            int length = charSequence.length();
            C3457i.m34350k(i, length);
            if (i == length) {
                return -1;
            }
            return i;
        }

        @Override // p030bc.AbstractC3446c
        /* renamed from: g */
        public boolean mo34365g(char c) {
            return true;
        }

        /* renamed from: j */
        public AbstractC3446c negate() {
            return AbstractC3446c.m34371h();
        }
    }

    /* renamed from: bc.c$b */
    /* loaded from: classes3.dex */
    static abstract class AbstractC3448b extends AbstractC3446c {
        AbstractC3448b() {
        }

        @Override // p030bc.AbstractC3459k
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return AbstractC3446c.super.m34374c(ch2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bc.c$c */
    /* loaded from: classes3.dex */
    public static final class C0082c extends AbstractC3448b {

        /* renamed from: a */
        private final char f5589a;

        C0082c(char c) {
            this.f5589a = c;
        }

        @Override // p030bc.AbstractC3446c
        /* renamed from: g */
        public boolean mo34365g(char c) {
            return c == this.f5589a;
        }

        /* renamed from: j */
        public AbstractC3446c negate() {
            return AbstractC3446c.m34372f(this.f5589a);
        }

        public String toString() {
            String i = AbstractC3446c.m34370i(this.f5589a);
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 18);
            sb2.append("CharMatcher.is('");
            sb2.append(i);
            sb2.append("')");
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bc.c$d */
    /* loaded from: classes3.dex */
    public static final class C3449d extends AbstractC3448b {

        /* renamed from: a */
        private final char f5590a;

        C3449d(char c) {
            this.f5590a = c;
        }

        @Override // p030bc.AbstractC3446c
        /* renamed from: g */
        public boolean mo34365g(char c) {
            return c != this.f5590a;
        }

        /* renamed from: j */
        public AbstractC3446c negate() {
            return AbstractC3446c.m34373e(this.f5590a);
        }

        public String toString() {
            String i = AbstractC3446c.m34370i(this.f5590a);
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 21);
            sb2.append("CharMatcher.isNot('");
            sb2.append(i);
            sb2.append("')");
            return sb2.toString();
        }
    }

    /* renamed from: bc.c$e */
    /* loaded from: classes3.dex */
    static abstract class AbstractC3450e extends AbstractC3448b {

        /* renamed from: a */
        private final String f5591a;

        AbstractC3450e(String str) {
            this.f5591a = (String) C3457i.m34352i(str);
        }

        public final String toString() {
            return this.f5591a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bc.c$f */
    /* loaded from: classes3.dex */
    public static final class C3451f extends AbstractC3450e {

        /* renamed from: b */
        static final C3451f f5592b = new C3451f();

        private C3451f() {
            super("CharMatcher.none()");
        }

        @Override // p030bc.AbstractC3446c
        /* renamed from: d */
        public int mo34366d(CharSequence charSequence, int i) {
            C3457i.m34350k(i, charSequence.length());
            return -1;
        }

        @Override // p030bc.AbstractC3446c
        /* renamed from: g */
        public boolean mo34365g(char c) {
            return false;
        }

        /* renamed from: j */
        public AbstractC3446c negate() {
            return AbstractC3446c.m34375b();
        }
    }

    protected AbstractC3446c() {
    }

    /* renamed from: b */
    public static AbstractC3446c m34375b() {
        return C3447a.f5588b;
    }

    /* renamed from: e */
    public static AbstractC3446c m34373e(char c) {
        return new C0082c(c);
    }

    /* renamed from: f */
    public static AbstractC3446c m34372f(char c) {
        return new C3449d(c);
    }

    /* renamed from: h */
    public static AbstractC3446c m34371h() {
        return C3451f.f5592b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static String m34370i(char c) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Override // p163j$.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return predicate.getClass();
    }

    @Deprecated
    /* renamed from: c */
    public boolean m34374c(Character ch2) {
        return mo34365g(ch2.charValue());
    }

    /* renamed from: d */
    public int mo34366d(CharSequence charSequence, int i) {
        int length = charSequence.length();
        C3457i.m34350k(i, length);
        while (i < length) {
            if (mo34365g(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: g */
    public abstract boolean mo34365g(char c);

    @Override // p163j$.util.function.Predicate
    /* renamed from: or */
    public /* synthetic */ Predicate mo16468or(Predicate predicate) {
        return predicate.getClass();
    }

    @Override // p163j$.util.function.Predicate
    public /* synthetic */ boolean test(Object obj) {
        return C3458j.m34345a(this, obj);
    }
}
