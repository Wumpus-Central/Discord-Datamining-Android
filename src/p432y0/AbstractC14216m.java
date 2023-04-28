package p432y0;

import androidx.constraintlayout.solver.widgets.C2125d;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;

/* renamed from: y0.m */
/* loaded from: classes.dex */
public abstract class AbstractC14216m implements AbstractC14204d {

    /* renamed from: a */
    public int f32110a;

    /* renamed from: b */
    ConstraintWidget f32111b;

    /* renamed from: c */
    C14213k f32112c;

    /* renamed from: d */
    protected ConstraintWidget.EnumC2121b f32113d;

    /* renamed from: e */
    C14208g f32114e = new C14208g(this);

    /* renamed from: f */
    public int f32115f = 0;

    /* renamed from: g */
    boolean f32116g = false;

    /* renamed from: h */
    public C14206f f32117h = new C14206f(this);

    /* renamed from: i */
    public C14206f f32118i = new C14206f(this);

    /* renamed from: j */
    protected EnumC14218b f32119j = EnumC14218b.NONE;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y0.m$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C14217a {

        /* renamed from: a */
        static final /* synthetic */ int[] f32120a;

        static {
            int[] iArr = new int[C2125d.EnumC2127b.values().length];
            f32120a = iArr;
            try {
                iArr[C2125d.EnumC2127b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32120a[C2125d.EnumC2127b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32120a[C2125d.EnumC2127b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32120a[C2125d.EnumC2127b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32120a[C2125d.EnumC2127b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: y0.m$b */
    /* loaded from: classes.dex */
    enum EnumC14218b {
        NONE,
        START,
        END,
        CENTER
    }

    public AbstractC14216m(ConstraintWidget constraintWidget) {
        this.f32111b = constraintWidget;
    }

    /* renamed from: l */
    private void m1355l(int i, int i2) {
        AbstractC14216m mVar;
        float f;
        int i3;
        int i4 = this.f32110a;
        if (i4 == 0) {
            this.f32114e.mo1376d(m1360g(i2, i));
        } else if (i4 == 1) {
            this.f32114e.mo1376d(Math.min(m1360g(this.f32114e.f32096m, i), i2));
        } else if (i4 == 2) {
            ConstraintWidget E = this.f32111b.m38942E();
            if (E != null) {
                if (i == 0) {
                    mVar = E.f2527e;
                } else {
                    mVar = E.f2529f;
                }
                C14208g gVar = mVar.f32114e;
                if (gVar.f32084j) {
                    ConstraintWidget constraintWidget = this.f32111b;
                    if (i == 0) {
                        f = constraintWidget.f2551q;
                    } else {
                        f = constraintWidget.f2557t;
                    }
                    this.f32114e.mo1376d(m1360g((int) ((gVar.f32081g * f) + 0.5f), i));
                }
            }
        } else if (i4 == 3) {
            ConstraintWidget constraintWidget2 = this.f32111b;
            AbstractC14216m mVar2 = constraintWidget2.f2527e;
            ConstraintWidget.EnumC2121b bVar = mVar2.f32113d;
            ConstraintWidget.EnumC2121b bVar2 = ConstraintWidget.EnumC2121b.MATCH_CONSTRAINT;
            if (bVar == bVar2 && mVar2.f32110a == 3) {
                C14214l lVar = constraintWidget2.f2529f;
                if (lVar.f32113d == bVar2 && lVar.f32110a == 3) {
                    return;
                }
            }
            if (i == 0) {
                mVar2 = constraintWidget2.f2529f;
            }
            if (mVar2.f32114e.f32084j) {
                float r = constraintWidget2.m38893r();
                if (i == 1) {
                    i3 = (int) ((mVar2.f32114e.f32081g / r) + 0.5f);
                } else {
                    i3 = (int) ((r * mVar2.f32114e.f32081g) + 0.5f);
                }
                this.f32114e.mo1376d(i3);
            }
        }
    }

    @Override // p432y0.AbstractC14204d
    /* renamed from: a */
    public void mo1366a(AbstractC14204d dVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final void m1365b(C14206f fVar, C14206f fVar2, int i) {
        fVar.f32086l.add(fVar2);
        fVar.f32080f = i;
        fVar2.f32085k.add(fVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final void m1364c(C14206f fVar, C14206f fVar2, int i, C14208g gVar) {
        fVar.f32086l.add(fVar2);
        fVar.f32086l.add(this.f32114e);
        fVar.f32082h = i;
        fVar.f32083i = gVar;
        fVar2.f32085k.add(fVar);
        gVar.f32085k.add(fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract void mo1363d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo1362e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract void mo1361f();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public final int m1360g(int i, int i2) {
        int i3;
        if (i2 == 0) {
            ConstraintWidget constraintWidget = this.f32111b;
            int i4 = constraintWidget.f2549p;
            i3 = Math.max(constraintWidget.f2547o, i);
            if (i4 > 0) {
                i3 = Math.min(i4, i);
            }
            if (i3 == i) {
                return i;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.f32111b;
            int i5 = constraintWidget2.f2555s;
            i3 = Math.max(constraintWidget2.f2553r, i);
            if (i5 > 0) {
                i3 = Math.min(i5, i);
            }
            if (i3 == i) {
                return i;
            }
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final C14206f m1359h(C2125d dVar) {
        C2125d dVar2 = dVar.f2603d;
        if (dVar2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = dVar2.f2601b;
        int i = C14217a.f32120a[dVar2.f2602c.ordinal()];
        if (i == 1) {
            return constraintWidget.f2527e.f32117h;
        }
        if (i == 2) {
            return constraintWidget.f2527e.f32118i;
        }
        if (i == 3) {
            return constraintWidget.f2529f.f32117h;
        }
        if (i == 4) {
            return constraintWidget.f2529f.f32107k;
        }
        if (i != 5) {
            return null;
        }
        return constraintWidget.f2529f.f32118i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final C14206f m1358i(C2125d dVar, int i) {
        AbstractC14216m mVar;
        C2125d dVar2 = dVar.f2603d;
        if (dVar2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = dVar2.f2601b;
        if (i == 0) {
            mVar = constraintWidget.f2527e;
        } else {
            mVar = constraintWidget.f2529f;
        }
        int i2 = C14217a.f32120a[dVar2.f2602c.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return mVar.f32118i;
        }
        return mVar.f32117h;
    }

    /* renamed from: j */
    public long mo1357j() {
        C14208g gVar = this.f32114e;
        if (gVar.f32084j) {
            return gVar.f32081g;
        }
        return 0L;
    }

    /* renamed from: k */
    public boolean m1356k() {
        return this.f32116g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public abstract boolean mo1354m();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public void m1353n(AbstractC14204d dVar, C2125d dVar2, C2125d dVar3, int i) {
        float f;
        C14206f h = m1359h(dVar2);
        C14206f h2 = m1359h(dVar3);
        if (h.f32084j && h2.f32084j) {
            int b = h.f32081g + dVar2.m38838b();
            int b2 = h2.f32081g - dVar3.m38838b();
            int i2 = b2 - b;
            if (!this.f32114e.f32084j && this.f32113d == ConstraintWidget.EnumC2121b.MATCH_CONSTRAINT) {
                m1355l(i, i2);
            }
            C14208g gVar = this.f32114e;
            if (gVar.f32084j) {
                if (gVar.f32081g == i2) {
                    this.f32117h.mo1376d(b);
                    this.f32118i.mo1376d(b2);
                    return;
                }
                ConstraintWidget constraintWidget = this.f32111b;
                if (i == 0) {
                    f = constraintWidget.m38887u();
                } else {
                    f = constraintWidget.m38937I();
                }
                if (h == h2) {
                    b = h.f32081g;
                    b2 = h2.f32081g;
                    f = 0.5f;
                }
                this.f32117h.mo1376d((int) (b + 0.5f + (((b2 - b) - this.f32114e.f32081g) * f)));
                this.f32118i.mo1376d(this.f32117h.f32081g + this.f32114e.f32081g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public void m1352o(AbstractC14204d dVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public void m1351p(AbstractC14204d dVar) {
    }
}
