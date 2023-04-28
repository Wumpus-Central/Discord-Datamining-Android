package p445yd;

import com.facebook.react.uimanager.ViewDefaults;
import p066dd.C6437f;
import p137hd.C7997b;

/* renamed from: yd.j */
/* loaded from: classes3.dex */
public final class C14363j {

    /* renamed from: e */
    private static final int[] f32513e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};

    /* renamed from: f */
    private static final C14363j[] f32514f = m777b();

    /* renamed from: a */
    private final int f32515a;

    /* renamed from: b */
    private final int[] f32516b;

    /* renamed from: c */
    private final C14365b[] f32517c;

    /* renamed from: d */
    private final int f32518d;

    /* renamed from: yd.j$a */
    /* loaded from: classes3.dex */
    public static final class C14364a {

        /* renamed from: a */
        private final int f32519a;

        /* renamed from: b */
        private final int f32520b;

        C14364a(int i, int i2) {
            this.f32519a = i;
            this.f32520b = i2;
        }

        /* renamed from: a */
        public int m768a() {
            return this.f32519a;
        }

        /* renamed from: b */
        public int m767b() {
            return this.f32520b;
        }
    }

    /* renamed from: yd.j$b */
    /* loaded from: classes3.dex */
    public static final class C14365b {

        /* renamed from: a */
        private final int f32521a;

        /* renamed from: b */
        private final C14364a[] f32522b;

        C14365b(int i, C14364a... aVarArr) {
            this.f32521a = i;
            this.f32522b = aVarArr;
        }

        /* renamed from: a */
        public C14364a[] m766a() {
            return this.f32522b;
        }

        /* renamed from: b */
        public int m765b() {
            return this.f32521a;
        }
    }

    private C14363j(int i, int[] iArr, C14365b... bVarArr) {
        C14364a[] a;
        this.f32515a = i;
        this.f32516b = iArr;
        this.f32517c = bVarArr;
        int b = bVarArr[0].m765b();
        int i2 = 0;
        for (C14364a aVar : bVarArr[0].m766a()) {
            i2 += aVar.m768a() * (aVar.m767b() + b);
        }
        this.f32518d = i2;
    }

    /* renamed from: b */
    private static C14363j[] m777b() {
        return new C14363j[]{new C14363j(1, new int[0], new C14365b(7, new C14364a(1, 19)), new C14365b(10, new C14364a(1, 16)), new C14365b(13, new C14364a(1, 13)), new C14365b(17, new C14364a(1, 9))), new C14363j(2, new int[]{6, 18}, new C14365b(10, new C14364a(1, 34)), new C14365b(16, new C14364a(1, 28)), new C14365b(22, new C14364a(1, 22)), new C14365b(28, new C14364a(1, 16))), new C14363j(3, new int[]{6, 22}, new C14365b(15, new C14364a(1, 55)), new C14365b(26, new C14364a(1, 44)), new C14365b(18, new C14364a(2, 17)), new C14365b(22, new C14364a(2, 13))), new C14363j(4, new int[]{6, 26}, new C14365b(20, new C14364a(1, 80)), new C14365b(18, new C14364a(2, 32)), new C14365b(26, new C14364a(2, 24)), new C14365b(16, new C14364a(4, 9))), new C14363j(5, new int[]{6, 30}, new C14365b(26, new C14364a(1, 108)), new C14365b(24, new C14364a(2, 43)), new C14365b(18, new C14364a(2, 15), new C14364a(2, 16)), new C14365b(22, new C14364a(2, 11), new C14364a(2, 12))), new C14363j(6, new int[]{6, 34}, new C14365b(18, new C14364a(2, 68)), new C14365b(16, new C14364a(4, 27)), new C14365b(24, new C14364a(4, 19)), new C14365b(28, new C14364a(4, 15))), new C14363j(7, new int[]{6, 22, 38}, new C14365b(20, new C14364a(2, 78)), new C14365b(18, new C14364a(4, 31)), new C14365b(18, new C14364a(2, 14), new C14364a(4, 15)), new C14365b(26, new C14364a(4, 13), new C14364a(1, 14))), new C14363j(8, new int[]{6, 24, 42}, new C14365b(24, new C14364a(2, 97)), new C14365b(22, new C14364a(2, 38), new C14364a(2, 39)), new C14365b(22, new C14364a(4, 18), new C14364a(2, 19)), new C14365b(26, new C14364a(4, 14), new C14364a(2, 15))), new C14363j(9, new int[]{6, 26, 46}, new C14365b(30, new C14364a(2, 116)), new C14365b(22, new C14364a(3, 36), new C14364a(2, 37)), new C14365b(20, new C14364a(4, 16), new C14364a(4, 17)), new C14365b(24, new C14364a(4, 12), new C14364a(4, 13))), new C14363j(10, new int[]{6, 28, 50}, new C14365b(18, new C14364a(2, 68), new C14364a(2, 69)), new C14365b(26, new C14364a(4, 43), new C14364a(1, 44)), new C14365b(24, new C14364a(6, 19), new C14364a(2, 20)), new C14365b(28, new C14364a(6, 15), new C14364a(2, 16))), new C14363j(11, new int[]{6, 30, 54}, new C14365b(20, new C14364a(4, 81)), new C14365b(30, new C14364a(1, 50), new C14364a(4, 51)), new C14365b(28, new C14364a(4, 22), new C14364a(4, 23)), new C14365b(24, new C14364a(3, 12), new C14364a(8, 13))), new C14363j(12, new int[]{6, 32, 58}, new C14365b(24, new C14364a(2, 92), new C14364a(2, 93)), new C14365b(22, new C14364a(6, 36), new C14364a(2, 37)), new C14365b(26, new C14364a(4, 20), new C14364a(6, 21)), new C14365b(28, new C14364a(7, 14), new C14364a(4, 15))), new C14363j(13, new int[]{6, 34, 62}, new C14365b(26, new C14364a(4, 107)), new C14365b(22, new C14364a(8, 37), new C14364a(1, 38)), new C14365b(24, new C14364a(8, 20), new C14364a(4, 21)), new C14365b(22, new C14364a(12, 11), new C14364a(4, 12))), new C14363j(14, new int[]{6, 26, 46, 66}, new C14365b(30, new C14364a(3, 115), new C14364a(1, 116)), new C14365b(24, new C14364a(4, 40), new C14364a(5, 41)), new C14365b(20, new C14364a(11, 16), new C14364a(5, 17)), new C14365b(24, new C14364a(11, 12), new C14364a(5, 13))), new C14363j(15, new int[]{6, 26, 48, 70}, new C14365b(22, new C14364a(5, 87), new C14364a(1, 88)), new C14365b(24, new C14364a(5, 41), new C14364a(5, 42)), new C14365b(30, new C14364a(5, 24), new C14364a(7, 25)), new C14365b(24, new C14364a(11, 12), new C14364a(7, 13))), new C14363j(16, new int[]{6, 26, 50, 74}, new C14365b(24, new C14364a(5, 98), new C14364a(1, 99)), new C14365b(28, new C14364a(7, 45), new C14364a(3, 46)), new C14365b(24, new C14364a(15, 19), new C14364a(2, 20)), new C14365b(30, new C14364a(3, 15), new C14364a(13, 16))), new C14363j(17, new int[]{6, 30, 54, 78}, new C14365b(28, new C14364a(1, 107), new C14364a(5, 108)), new C14365b(28, new C14364a(10, 46), new C14364a(1, 47)), new C14365b(28, new C14364a(1, 22), new C14364a(15, 23)), new C14365b(28, new C14364a(2, 14), new C14364a(17, 15))), new C14363j(18, new int[]{6, 30, 56, 82}, new C14365b(30, new C14364a(5, 120), new C14364a(1, 121)), new C14365b(26, new C14364a(9, 43), new C14364a(4, 44)), new C14365b(28, new C14364a(17, 22), new C14364a(1, 23)), new C14365b(28, new C14364a(2, 14), new C14364a(19, 15))), new C14363j(19, new int[]{6, 30, 58, 86}, new C14365b(28, new C14364a(3, 113), new C14364a(4, 114)), new C14365b(26, new C14364a(3, 44), new C14364a(11, 45)), new C14365b(26, new C14364a(17, 21), new C14364a(4, 22)), new C14365b(26, new C14364a(9, 13), new C14364a(16, 14))), new C14363j(20, new int[]{6, 34, 62, 90}, new C14365b(28, new C14364a(3, 107), new C14364a(5, 108)), new C14365b(26, new C14364a(3, 41), new C14364a(13, 42)), new C14365b(30, new C14364a(15, 24), new C14364a(5, 25)), new C14365b(28, new C14364a(15, 15), new C14364a(10, 16))), new C14363j(21, new int[]{6, 28, 50, 72, 94}, new C14365b(28, new C14364a(4, 116), new C14364a(4, 117)), new C14365b(26, new C14364a(17, 42)), new C14365b(28, new C14364a(17, 22), new C14364a(6, 23)), new C14365b(30, new C14364a(19, 16), new C14364a(6, 17))), new C14363j(22, new int[]{6, 26, 50, 74, 98}, new C14365b(28, new C14364a(2, 111), new C14364a(7, 112)), new C14365b(28, new C14364a(17, 46)), new C14365b(30, new C14364a(7, 24), new C14364a(16, 25)), new C14365b(24, new C14364a(34, 13))), new C14363j(23, new int[]{6, 30, 54, 78, 102}, new C14365b(30, new C14364a(4, 121), new C14364a(5, 122)), new C14365b(28, new C14364a(4, 47), new C14364a(14, 48)), new C14365b(30, new C14364a(11, 24), new C14364a(14, 25)), new C14365b(30, new C14364a(16, 15), new C14364a(14, 16))), new C14363j(24, new int[]{6, 28, 54, 80, 106}, new C14365b(30, new C14364a(6, 117), new C14364a(4, 118)), new C14365b(28, new C14364a(6, 45), new C14364a(14, 46)), new C14365b(30, new C14364a(11, 24), new C14364a(16, 25)), new C14365b(30, new C14364a(30, 16), new C14364a(2, 17))), new C14363j(25, new int[]{6, 32, 58, 84, 110}, new C14365b(26, new C14364a(8, 106), new C14364a(4, 107)), new C14365b(28, new C14364a(8, 47), new C14364a(13, 48)), new C14365b(30, new C14364a(7, 24), new C14364a(22, 25)), new C14365b(30, new C14364a(22, 15), new C14364a(13, 16))), new C14363j(26, new int[]{6, 30, 58, 86, 114}, new C14365b(28, new C14364a(10, 114), new C14364a(2, 115)), new C14365b(28, new C14364a(19, 46), new C14364a(4, 47)), new C14365b(28, new C14364a(28, 22), new C14364a(6, 23)), new C14365b(30, new C14364a(33, 16), new C14364a(4, 17))), new C14363j(27, new int[]{6, 34, 62, 90, 118}, new C14365b(30, new C14364a(8, 122), new C14364a(4, 123)), new C14365b(28, new C14364a(22, 45), new C14364a(3, 46)), new C14365b(30, new C14364a(8, 23), new C14364a(26, 24)), new C14365b(30, new C14364a(12, 15), new C14364a(28, 16))), new C14363j(28, new int[]{6, 26, 50, 74, 98, 122}, new C14365b(30, new C14364a(3, 117), new C14364a(10, 118)), new C14365b(28, new C14364a(3, 45), new C14364a(23, 46)), new C14365b(30, new C14364a(4, 24), new C14364a(31, 25)), new C14365b(30, new C14364a(11, 15), new C14364a(31, 16))), new C14363j(29, new int[]{6, 30, 54, 78, 102, 126}, new C14365b(30, new C14364a(7, 116), new C14364a(7, 117)), new C14365b(28, new C14364a(21, 45), new C14364a(7, 46)), new C14365b(30, new C14364a(1, 23), new C14364a(37, 24)), new C14365b(30, new C14364a(19, 15), new C14364a(26, 16))), new C14363j(30, new int[]{6, 26, 52, 78, 104, 130}, new C14365b(30, new C14364a(5, 115), new C14364a(10, 116)), new C14365b(28, new C14364a(19, 47), new C14364a(10, 48)), new C14365b(30, new C14364a(15, 24), new C14364a(25, 25)), new C14365b(30, new C14364a(23, 15), new C14364a(25, 16))), new C14363j(31, new int[]{6, 30, 56, 82, 108, 134}, new C14365b(30, new C14364a(13, 115), new C14364a(3, 116)), new C14365b(28, new C14364a(2, 46), new C14364a(29, 47)), new C14365b(30, new C14364a(42, 24), new C14364a(1, 25)), new C14365b(30, new C14364a(23, 15), new C14364a(28, 16))), new C14363j(32, new int[]{6, 34, 60, 86, 112, 138}, new C14365b(30, new C14364a(17, 115)), new C14365b(28, new C14364a(10, 46), new C14364a(23, 47)), new C14365b(30, new C14364a(10, 24), new C14364a(35, 25)), new C14365b(30, new C14364a(19, 15), new C14364a(35, 16))), new C14363j(33, new int[]{6, 30, 58, 86, 114, 142}, new C14365b(30, new C14364a(17, 115), new C14364a(1, 116)), new C14365b(28, new C14364a(14, 46), new C14364a(21, 47)), new C14365b(30, new C14364a(29, 24), new C14364a(19, 25)), new C14365b(30, new C14364a(11, 15), new C14364a(46, 16))), new C14363j(34, new int[]{6, 34, 62, 90, 118, 146}, new C14365b(30, new C14364a(13, 115), new C14364a(6, 116)), new C14365b(28, new C14364a(14, 46), new C14364a(23, 47)), new C14365b(30, new C14364a(44, 24), new C14364a(7, 25)), new C14365b(30, new C14364a(59, 16), new C14364a(1, 17))), new C14363j(35, new int[]{6, 30, 54, 78, 102, 126, 150}, new C14365b(30, new C14364a(12, 121), new C14364a(7, 122)), new C14365b(28, new C14364a(12, 47), new C14364a(26, 48)), new C14365b(30, new C14364a(39, 24), new C14364a(14, 25)), new C14365b(30, new C14364a(22, 15), new C14364a(41, 16))), new C14363j(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new C14365b(30, new C14364a(6, 121), new C14364a(14, 122)), new C14365b(28, new C14364a(6, 47), new C14364a(34, 48)), new C14365b(30, new C14364a(46, 24), new C14364a(10, 25)), new C14365b(30, new C14364a(2, 15), new C14364a(64, 16))), new C14363j(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new C14365b(30, new C14364a(17, 122), new C14364a(4, 123)), new C14365b(28, new C14364a(29, 46), new C14364a(14, 47)), new C14365b(30, new C14364a(49, 24), new C14364a(10, 25)), new C14365b(30, new C14364a(24, 15), new C14364a(46, 16))), new C14363j(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new C14365b(30, new C14364a(4, 122), new C14364a(18, 123)), new C14365b(28, new C14364a(13, 46), new C14364a(32, 47)), new C14365b(30, new C14364a(48, 24), new C14364a(14, 25)), new C14365b(30, new C14364a(42, 15), new C14364a(32, 16))), new C14363j(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new C14365b(30, new C14364a(20, 117), new C14364a(4, 118)), new C14365b(28, new C14364a(40, 47), new C14364a(7, 48)), new C14365b(30, new C14364a(43, 24), new C14364a(22, 25)), new C14365b(30, new C14364a(10, 15), new C14364a(67, 16))), new C14363j(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new C14365b(30, new C14364a(19, 118), new C14364a(6, 119)), new C14365b(28, new C14364a(18, 47), new C14364a(31, 48)), new C14365b(30, new C14364a(34, 24), new C14364a(34, 25)), new C14365b(30, new C14364a(20, 15), new C14364a(61, 16)))};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C14363j m776c(int i) {
        int i2 = ViewDefaults.NUMBER_OF_LINES;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = f32513e;
            if (i3 < iArr.length) {
                int i5 = iArr[i3];
                if (i5 == i) {
                    return m770i(i3 + 7);
                }
                int e = C14360g.m782e(i, i5);
                if (e < i2) {
                    i4 = i3 + 7;
                    i2 = e;
                }
                i3++;
            } else if (i2 <= 3) {
                return m770i(i4);
            } else {
                return null;
            }
        }
    }

    /* renamed from: g */
    public static C14363j m772g(int i) {
        if (i % 4 == 1) {
            try {
                return m770i((i - 17) / 4);
            } catch (IllegalArgumentException unused) {
                throw C6437f.m25561a();
            }
        } else {
            throw C6437f.m25561a();
        }
    }

    /* renamed from: i */
    public static C14363j m770i(int i) {
        if (i > 0 && i <= 40) {
            return f32514f[i - 1];
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C7997b m778a() {
        int e = m774e();
        C7997b bVar = new C7997b(e);
        bVar.m20914q(0, 0, 9, 9);
        int i = e - 8;
        bVar.m20914q(i, 0, 8, 9);
        bVar.m20914q(0, i, 9, 8);
        int length = this.f32516b.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = this.f32516b[i2] - 2;
            for (int i4 = 0; i4 < length; i4++) {
                if (!((i2 == 0 && (i4 == 0 || i4 == length - 1)) || (i2 == length - 1 && i4 == 0))) {
                    bVar.m20914q(this.f32516b[i4] - 2, i3, 5, 5);
                }
            }
        }
        int i5 = e - 17;
        bVar.m20914q(6, 9, 1, i5);
        bVar.m20914q(9, 6, i5, 1);
        if (this.f32515a > 6) {
            int i6 = e - 11;
            bVar.m20914q(i6, 0, 3, 6);
            bVar.m20914q(0, i6, 6, 3);
        }
        return bVar;
    }

    /* renamed from: d */
    public int[] m775d() {
        return this.f32516b;
    }

    /* renamed from: e */
    public int m774e() {
        return (this.f32515a * 4) + 17;
    }

    /* renamed from: f */
    public C14365b m773f(EnumC14359f fVar) {
        return this.f32517c[fVar.ordinal()];
    }

    /* renamed from: h */
    public int m771h() {
        return this.f32518d;
    }

    /* renamed from: j */
    public int m769j() {
        return this.f32515a;
    }

    public String toString() {
        return String.valueOf(this.f32515a);
    }
}
