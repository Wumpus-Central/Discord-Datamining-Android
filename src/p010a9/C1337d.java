package p010a9;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p119g9.C7557q0;

/* renamed from: a9.d */
/* loaded from: classes7.dex */
public final class C1337d {

    /* renamed from: f */
    private int f235f;

    /* renamed from: h */
    private int f237h;

    /* renamed from: o */
    private float f244o;

    /* renamed from: a */
    private String f230a = "";

    /* renamed from: b */
    private String f231b = "";

    /* renamed from: c */
    private Set<String> f232c = Collections.emptySet();

    /* renamed from: d */
    private String f233d = "";

    /* renamed from: e */
    private String f234e = null;

    /* renamed from: g */
    private boolean f236g = false;

    /* renamed from: i */
    private boolean f238i = false;

    /* renamed from: j */
    private int f239j = -1;

    /* renamed from: k */
    private int f240k = -1;

    /* renamed from: l */
    private int f241l = -1;

    /* renamed from: m */
    private int f242m = -1;

    /* renamed from: n */
    private int f243n = -1;

    /* renamed from: p */
    private int f245p = -1;

    /* renamed from: q */
    private boolean f246q = false;

    /* renamed from: z */
    private static int m41306z(int i, String str, String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }

    /* renamed from: a */
    public int m41331a() {
        if (this.f238i) {
            return this.f237h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    /* renamed from: b */
    public boolean m41330b() {
        return this.f246q;
    }

    /* renamed from: c */
    public int m41329c() {
        if (this.f236g) {
            return this.f235f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    /* renamed from: d */
    public String m41328d() {
        return this.f234e;
    }

    /* renamed from: e */
    public float m41327e() {
        return this.f244o;
    }

    /* renamed from: f */
    public int m41326f() {
        return this.f243n;
    }

    /* renamed from: g */
    public int m41325g() {
        return this.f245p;
    }

    /* renamed from: h */
    public int m41324h(String str, String str2, Set<String> set, String str3) {
        if (this.f230a.isEmpty() && this.f231b.isEmpty() && this.f232c.isEmpty() && this.f233d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int z = m41306z(m41306z(m41306z(0, this.f230a, str, 1073741824), this.f231b, str2, 2), this.f233d, str3, 4);
        if (z == -1 || !set.containsAll(this.f232c)) {
            return 0;
        }
        return z + (this.f232c.size() * 4);
    }

    /* renamed from: i */
    public int m41323i() {
        int i;
        int i2 = this.f241l;
        if (i2 == -1 && this.f242m == -1) {
            return -1;
        }
        int i3 = 0;
        if (i2 == 1) {
            i = 1;
        } else {
            i = 0;
        }
        if (this.f242m == 1) {
            i3 = 2;
        }
        return i | i3;
    }

    /* renamed from: j */
    public boolean m41322j() {
        return this.f238i;
    }

    /* renamed from: k */
    public boolean m41321k() {
        return this.f236g;
    }

    /* renamed from: l */
    public boolean m41320l() {
        return this.f239j == 1;
    }

    /* renamed from: m */
    public boolean m41319m() {
        return this.f240k == 1;
    }

    /* renamed from: n */
    public C1337d m41318n(int i) {
        this.f237h = i;
        this.f238i = true;
        return this;
    }

    /* renamed from: o */
    public C1337d m41317o(boolean z) {
        this.f241l = z ? 1 : 0;
        return this;
    }

    /* renamed from: p */
    public C1337d m41316p(boolean z) {
        this.f246q = z;
        return this;
    }

    /* renamed from: q */
    public C1337d m41315q(int i) {
        this.f235f = i;
        this.f236g = true;
        return this;
    }

    /* renamed from: r */
    public C1337d m41314r(String str) {
        this.f234e = C7557q0.m22174U0(str);
        return this;
    }

    /* renamed from: s */
    public C1337d m41313s(boolean z) {
        this.f242m = z ? 1 : 0;
        return this;
    }

    /* renamed from: t */
    public C1337d m41312t(int i) {
        this.f245p = i;
        return this;
    }

    /* renamed from: u */
    public void m41311u(String[] strArr) {
        this.f232c = new HashSet(Arrays.asList(strArr));
    }

    /* renamed from: v */
    public void m41310v(String str) {
        this.f230a = str;
    }

    /* renamed from: w */
    public void m41309w(String str) {
        this.f231b = str;
    }

    /* renamed from: x */
    public void m41308x(String str) {
        this.f233d = str;
    }

    /* renamed from: y */
    public C1337d m41307y(boolean z) {
        this.f240k = z ? 1 : 0;
        return this;
    }
}
