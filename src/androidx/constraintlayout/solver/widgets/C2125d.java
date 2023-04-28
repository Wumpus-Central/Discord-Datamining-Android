package androidx.constraintlayout.solver.widgets;

import java.util.HashSet;
import java.util.Iterator;
import p391w0.C13713c;
import p391w0.C13722h;

/* renamed from: androidx.constraintlayout.solver.widgets.d */
/* loaded from: classes.dex */
public class C2125d {

    /* renamed from: b */
    public final ConstraintWidget f2601b;

    /* renamed from: c */
    public final EnumC2127b f2602c;

    /* renamed from: d */
    public C2125d f2603d;

    /* renamed from: g */
    C13722h f2606g;

    /* renamed from: a */
    private HashSet<C2125d> f2600a = null;

    /* renamed from: e */
    public int f2604e = 0;

    /* renamed from: f */
    int f2605f = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.solver.widgets.d$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2126a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2607a;

        static {
            int[] iArr = new int[EnumC2127b.values().length];
            f2607a = iArr;
            try {
                iArr[EnumC2127b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2607a[EnumC2127b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2607a[EnumC2127b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2607a[EnumC2127b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2607a[EnumC2127b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2607a[EnumC2127b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2607a[EnumC2127b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2607a[EnumC2127b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2607a[EnumC2127b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: androidx.constraintlayout.solver.widgets.d$b */
    /* loaded from: classes.dex */
    public enum EnumC2127b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C2125d(ConstraintWidget constraintWidget, EnumC2127b bVar) {
        this.f2601b = constraintWidget;
        this.f2602c = bVar;
    }

    /* renamed from: a */
    public boolean m38839a(C2125d dVar, int i, int i2, boolean z) {
        if (dVar == null) {
            m38829k();
            return true;
        } else if (!z && !m38830j(dVar)) {
            return false;
        } else {
            this.f2603d = dVar;
            if (dVar.f2600a == null) {
                dVar.f2600a = new HashSet<>();
            }
            this.f2603d.f2600a.add(this);
            if (i > 0) {
                this.f2604e = i;
            } else {
                this.f2604e = 0;
            }
            this.f2605f = i2;
            return true;
        }
    }

    /* renamed from: b */
    public int m38838b() {
        C2125d dVar;
        if (this.f2601b.m38933M() == 8) {
            return 0;
        }
        if (this.f2605f <= -1 || (dVar = this.f2603d) == null || dVar.f2601b.m38933M() != 8) {
            return this.f2604e;
        }
        return this.f2605f;
    }

    /* renamed from: c */
    public final C2125d m38837c() {
        switch (C2126a.f2607a[this.f2602c.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f2601b.f35341D;
            case 3:
                return this.f2601b.f35339B;
            case 4:
                return this.f2601b.f35342E;
            case 5:
                return this.f2601b.f35340C;
            default:
                throw new AssertionError(this.f2602c.name());
        }
    }

    /* renamed from: d */
    public ConstraintWidget m38836d() {
        return this.f2601b;
    }

    /* renamed from: e */
    public C13722h m38835e() {
        return this.f2606g;
    }

    /* renamed from: f */
    public C2125d m38834f() {
        return this.f2603d;
    }

    /* renamed from: g */
    public EnumC2127b m38833g() {
        return this.f2602c;
    }

    /* renamed from: h */
    public boolean m38832h() {
        HashSet<C2125d> hashSet = this.f2600a;
        if (hashSet == null) {
            return false;
        }
        Iterator<C2125d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().m38837c().m38831i()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public boolean m38831i() {
        return this.f2603d != null;
    }

    /* renamed from: j */
    public boolean m38830j(C2125d dVar) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (dVar == null) {
            return false;
        }
        EnumC2127b g = dVar.m38833g();
        EnumC2127b bVar = this.f2602c;
        if (g != bVar) {
            switch (C2126a.f2607a[bVar.ordinal()]) {
                case 1:
                    if (g == EnumC2127b.BASELINE || g == EnumC2127b.CENTER_X || g == EnumC2127b.CENTER_Y) {
                        return false;
                    }
                    return true;
                case 2:
                case 3:
                    if (g == EnumC2127b.LEFT || g == EnumC2127b.RIGHT) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!(dVar.m38836d() instanceof C2128e)) {
                        return z;
                    }
                    if (z || g == EnumC2127b.CENTER_X) {
                        z3 = true;
                    }
                    return z3;
                case 4:
                case 5:
                    if (g == EnumC2127b.TOP || g == EnumC2127b.BOTTOM) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!(dVar.m38836d() instanceof C2128e)) {
                        return z2;
                    }
                    if (z2 || g == EnumC2127b.CENTER_Y) {
                        z3 = true;
                    }
                    return z3;
                case 6:
                case 7:
                case 8:
                case 9:
                    return false;
                default:
                    throw new AssertionError(this.f2602c.name());
            }
        } else if (bVar != EnumC2127b.BASELINE || (dVar.m38836d().m38929Q() && m38836d().m38929Q())) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: k */
    public void m38829k() {
        HashSet<C2125d> hashSet;
        C2125d dVar = this.f2603d;
        if (!(dVar == null || (hashSet = dVar.f2600a) == null)) {
            hashSet.remove(this);
        }
        this.f2603d = null;
        this.f2604e = 0;
        this.f2605f = -1;
    }

    /* renamed from: l */
    public void m38828l(C13713c cVar) {
        C13722h hVar = this.f2606g;
        if (hVar == null) {
            this.f2606g = new C13722h(C13722h.EnumC13723a.UNRESTRICTED, null);
        } else {
            hVar.m2883d();
        }
    }

    public String toString() {
        return this.f2601b.m38897p() + ":" + this.f2602c.toString();
    }
}
