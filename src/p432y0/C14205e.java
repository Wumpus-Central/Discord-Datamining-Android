package p432y0;

import androidx.constraintlayout.solver.widgets.C2125d;
import androidx.constraintlayout.solver.widgets.C2128e;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p411x0.C13920b;
import p432y0.C14201b;

/* renamed from: y0.e */
/* loaded from: classes.dex */
public class C14205e {

    /* renamed from: a */
    private ConstraintWidgetContainer f32066a;

    /* renamed from: d */
    private ConstraintWidgetContainer f32069d;

    /* renamed from: b */
    private boolean f32067b = true;

    /* renamed from: c */
    private boolean f32068c = true;

    /* renamed from: e */
    private ArrayList<AbstractC14216m> f32070e = new ArrayList<>();

    /* renamed from: f */
    private ArrayList<C14213k> f32071f = new ArrayList<>();

    /* renamed from: g */
    private C14201b.AbstractC0461b f32072g = null;

    /* renamed from: h */
    private C14201b.C14202a f32073h = new C14201b.C14202a();

    /* renamed from: i */
    ArrayList<C14213k> f32074i = new ArrayList<>();

    public C14205e(ConstraintWidgetContainer constraintWidgetContainer) {
        this.f32066a = constraintWidgetContainer;
        this.f32069d = constraintWidgetContainer;
    }

    /* renamed from: a */
    private void m1392a(C14206f fVar, int i, int i2, C14206f fVar2, ArrayList<C14213k> arrayList, C14213k kVar) {
        AbstractC14216m mVar = fVar.f32078d;
        if (mVar.f32112c == null) {
            ConstraintWidgetContainer constraintWidgetContainer = this.f32066a;
            if (!(mVar == constraintWidgetContainer.f2527e || mVar == constraintWidgetContainer.f2529f)) {
                if (kVar == null) {
                    kVar = new C14213k(mVar, i2);
                    arrayList.add(kVar);
                }
                mVar.f32112c = kVar;
                kVar.m1371a(mVar);
                for (AbstractC14204d dVar : mVar.f32117h.f32085k) {
                    if (dVar instanceof C14206f) {
                        m1392a((C14206f) dVar, i, 0, fVar2, arrayList, kVar);
                    }
                }
                for (AbstractC14204d dVar2 : mVar.f32118i.f32085k) {
                    if (dVar2 instanceof C14206f) {
                        m1392a((C14206f) dVar2, i, 1, fVar2, arrayList, kVar);
                    }
                }
                if (i == 1 && (mVar instanceof C14214l)) {
                    for (AbstractC14204d dVar3 : ((C14214l) mVar).f32107k.f32085k) {
                        if (dVar3 instanceof C14206f) {
                            m1392a((C14206f) dVar3, i, 2, fVar2, arrayList, kVar);
                        }
                    }
                }
                for (C14206f fVar3 : mVar.f32117h.f32086l) {
                    if (fVar3 == fVar2) {
                        kVar.f32101b = true;
                    }
                    m1392a(fVar3, i, 0, fVar2, arrayList, kVar);
                }
                for (C14206f fVar4 : mVar.f32118i.f32086l) {
                    if (fVar4 == fVar2) {
                        kVar.f32101b = true;
                    }
                    m1392a(fVar4, i, 1, fVar2, arrayList, kVar);
                }
                if (i == 1 && (mVar instanceof C14214l)) {
                    for (C14206f fVar5 : ((C14214l) mVar).f32107k.f32086l) {
                        m1392a(fVar5, i, 2, fVar2, arrayList, kVar);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private boolean m1391b(ConstraintWidgetContainer constraintWidgetContainer) {
        ConstraintWidget.EnumC2121b[] bVarArr;
        ConstraintWidget.EnumC2121b bVar;
        ConstraintWidget.EnumC2121b bVar2;
        ConstraintWidget.EnumC2121b bVar3;
        ConstraintWidget.EnumC2121b bVar4;
        int i;
        ConstraintWidget.EnumC2121b bVar5;
        int i2;
        ConstraintWidget.EnumC2121b bVar6;
        Iterator<ConstraintWidget> it = constraintWidgetContainer.f31384w0.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            ConstraintWidget.EnumC2121b[] bVarArr2 = next.f35350M;
            ConstraintWidget.EnumC2121b bVar7 = bVarArr2[0];
            ConstraintWidget.EnumC2121b bVar8 = bVarArr2[1];
            if (next.m38933M() == 8) {
                next.f2519a = true;
            } else {
                if (next.f2551q < 1.0f && bVar7 == ConstraintWidget.EnumC2121b.MATCH_CONSTRAINT) {
                    next.f2541l = 2;
                }
                if (next.f2557t < 1.0f && bVar8 == ConstraintWidget.EnumC2121b.MATCH_CONSTRAINT) {
                    next.f2543m = 2;
                }
                if (next.m38893r() > 0.0f) {
                    ConstraintWidget.EnumC2121b bVar9 = ConstraintWidget.EnumC2121b.MATCH_CONSTRAINT;
                    if (bVar7 == bVar9 && (bVar8 == ConstraintWidget.EnumC2121b.WRAP_CONTENT || bVar8 == ConstraintWidget.EnumC2121b.FIXED)) {
                        next.f2541l = 3;
                    } else if (bVar8 == bVar9 && (bVar7 == ConstraintWidget.EnumC2121b.WRAP_CONTENT || bVar7 == ConstraintWidget.EnumC2121b.FIXED)) {
                        next.f2543m = 3;
                    } else if (bVar7 == bVar9 && bVar8 == bVar9) {
                        if (next.f2541l == 0) {
                            next.f2541l = 3;
                        }
                        if (next.f2543m == 0) {
                            next.f2543m = 3;
                        }
                    }
                }
                ConstraintWidget.EnumC2121b bVar10 = ConstraintWidget.EnumC2121b.MATCH_CONSTRAINT;
                if (bVar7 == bVar10 && next.f2541l == 1 && (next.f35339B.f2603d == null || next.f35341D.f2603d == null)) {
                    bVar7 = ConstraintWidget.EnumC2121b.WRAP_CONTENT;
                }
                if (bVar8 == bVar10 && next.f2543m == 1 && (next.f35340C.f2603d == null || next.f35342E.f2603d == null)) {
                    bVar8 = ConstraintWidget.EnumC2121b.WRAP_CONTENT;
                }
                C14211j jVar = next.f2527e;
                jVar.f32113d = bVar7;
                int i3 = next.f2541l;
                jVar.f32110a = i3;
                C14214l lVar = next.f2529f;
                lVar.f32113d = bVar8;
                int i4 = next.f2543m;
                lVar.f32110a = i4;
                ConstraintWidget.EnumC2121b bVar11 = ConstraintWidget.EnumC2121b.MATCH_PARENT;
                if ((bVar7 == bVar11 || bVar7 == ConstraintWidget.EnumC2121b.FIXED || bVar7 == ConstraintWidget.EnumC2121b.WRAP_CONTENT) && (bVar8 == bVar11 || bVar8 == ConstraintWidget.EnumC2121b.FIXED || bVar8 == ConstraintWidget.EnumC2121b.WRAP_CONTENT)) {
                    int N = next.m38932N();
                    if (bVar7 == bVar11) {
                        i = (constraintWidgetContainer.m38932N() - next.f35339B.f2604e) - next.f35341D.f2604e;
                        bVar5 = ConstraintWidget.EnumC2121b.FIXED;
                    } else {
                        i = N;
                        bVar5 = bVar7;
                    }
                    int t = next.m38889t();
                    if (bVar8 == bVar11) {
                        i2 = (constraintWidgetContainer.m38889t() - next.f35340C.f2604e) - next.f35342E.f2604e;
                        bVar6 = ConstraintWidget.EnumC2121b.FIXED;
                    } else {
                        i2 = t;
                        bVar6 = bVar8;
                    }
                    m1381l(next, bVar5, i, bVar6, i2);
                    next.f2527e.f32114e.mo1376d(next.m38932N());
                    next.f2529f.f32114e.mo1376d(next.m38889t());
                    next.f2519a = true;
                } else {
                    if (bVar7 == bVar10 && (bVar8 == (bVar4 = ConstraintWidget.EnumC2121b.WRAP_CONTENT) || bVar8 == ConstraintWidget.EnumC2121b.FIXED)) {
                        if (i3 == 3) {
                            if (bVar8 == bVar4) {
                                m1381l(next, bVar4, 0, bVar4, 0);
                            }
                            int t2 = next.m38889t();
                            ConstraintWidget.EnumC2121b bVar12 = ConstraintWidget.EnumC2121b.FIXED;
                            m1381l(next, bVar12, (int) ((t2 * next.f35354Q) + 0.5f), bVar12, t2);
                            next.f2527e.f32114e.mo1376d(next.m38932N());
                            next.f2529f.f32114e.mo1376d(next.m38889t());
                            next.f2519a = true;
                        } else if (i3 == 1) {
                            m1381l(next, bVar4, 0, bVar8, 0);
                            next.f2527e.f32114e.f32096m = next.m38932N();
                        } else if (i3 == 2) {
                            ConstraintWidget.EnumC2121b bVar13 = constraintWidgetContainer.f35350M[0];
                            ConstraintWidget.EnumC2121b bVar14 = ConstraintWidget.EnumC2121b.FIXED;
                            if (bVar13 == bVar14 || bVar13 == bVar11) {
                                m1381l(next, bVar14, (int) ((next.f2551q * constraintWidgetContainer.m38932N()) + 0.5f), bVar8, next.m38889t());
                                next.f2527e.f32114e.mo1376d(next.m38932N());
                                next.f2529f.f32114e.mo1376d(next.m38889t());
                                next.f2519a = true;
                            }
                        } else {
                            C2125d[] dVarArr = next.f35347J;
                            if (dVarArr[0].f2603d == null || dVarArr[1].f2603d == null) {
                                m1381l(next, bVar4, 0, bVar8, 0);
                                next.f2527e.f32114e.mo1376d(next.m38932N());
                                next.f2529f.f32114e.mo1376d(next.m38889t());
                                next.f2519a = true;
                            }
                        }
                    }
                    if (bVar8 == bVar10 && (bVar7 == (bVar3 = ConstraintWidget.EnumC2121b.WRAP_CONTENT) || bVar7 == ConstraintWidget.EnumC2121b.FIXED)) {
                        if (i4 == 3) {
                            if (bVar7 == bVar3) {
                                m1381l(next, bVar3, 0, bVar3, 0);
                            }
                            int N2 = next.m38932N();
                            float f = next.f35354Q;
                            if (next.m38891s() == -1) {
                                f = 1.0f / f;
                            }
                            ConstraintWidget.EnumC2121b bVar15 = ConstraintWidget.EnumC2121b.FIXED;
                            m1381l(next, bVar15, N2, bVar15, (int) ((N2 * f) + 0.5f));
                            next.f2527e.f32114e.mo1376d(next.m38932N());
                            next.f2529f.f32114e.mo1376d(next.m38889t());
                            next.f2519a = true;
                        } else if (i4 == 1) {
                            m1381l(next, bVar7, 0, bVar3, 0);
                            next.f2529f.f32114e.f32096m = next.m38889t();
                        } else if (i4 == 2) {
                            ConstraintWidget.EnumC2121b bVar16 = constraintWidgetContainer.f35350M[1];
                            ConstraintWidget.EnumC2121b bVar17 = ConstraintWidget.EnumC2121b.FIXED;
                            if (bVar16 == bVar17 || bVar16 == bVar11) {
                                m1381l(next, bVar7, next.m38932N(), bVar17, (int) ((next.f2557t * constraintWidgetContainer.m38889t()) + 0.5f));
                                next.f2527e.f32114e.mo1376d(next.m38932N());
                                next.f2529f.f32114e.mo1376d(next.m38889t());
                                next.f2519a = true;
                            }
                        } else {
                            C2125d[] dVarArr2 = next.f35347J;
                            if (dVarArr2[2].f2603d == null || dVarArr2[3].f2603d == null) {
                                m1381l(next, bVar3, 0, bVar8, 0);
                                next.f2527e.f32114e.mo1376d(next.m38932N());
                                next.f2529f.f32114e.mo1376d(next.m38889t());
                                next.f2519a = true;
                            }
                        }
                    }
                    if (bVar7 == bVar10 && bVar8 == bVar10) {
                        if (i3 == 1 || i4 == 1) {
                            ConstraintWidget.EnumC2121b bVar18 = ConstraintWidget.EnumC2121b.WRAP_CONTENT;
                            m1381l(next, bVar18, 0, bVar18, 0);
                            next.f2527e.f32114e.f32096m = next.m38932N();
                            next.f2529f.f32114e.f32096m = next.m38889t();
                        } else if (i4 == 2 && i3 == 2 && ((bVar = (bVarArr = constraintWidgetContainer.f35350M)[0]) == (bVar2 = ConstraintWidget.EnumC2121b.FIXED) || bVar == bVar2)) {
                            ConstraintWidget.EnumC2121b bVar19 = bVarArr[1];
                            if (bVar19 == bVar2 || bVar19 == bVar2) {
                                m1381l(next, bVar2, (int) ((next.f2551q * constraintWidgetContainer.m38932N()) + 0.5f), bVar2, (int) ((next.f2557t * constraintWidgetContainer.m38889t()) + 0.5f));
                                next.f2527e.f32114e.mo1376d(next.m38932N());
                                next.f2529f.f32114e.mo1376d(next.m38889t());
                                next.f2519a = true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    private int m1388e(ConstraintWidgetContainer constraintWidgetContainer, int i) {
        int size = this.f32074i.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, this.f32074i.get(i2).m1370b(constraintWidgetContainer, i));
        }
        return (int) j;
    }

    /* renamed from: i */
    private void m1384i(AbstractC14216m mVar, int i, ArrayList<C14213k> arrayList) {
        for (AbstractC14204d dVar : mVar.f32117h.f32085k) {
            if (dVar instanceof C14206f) {
                m1392a((C14206f) dVar, i, 0, mVar.f32118i, arrayList, null);
            } else if (dVar instanceof AbstractC14216m) {
                m1392a(((AbstractC14216m) dVar).f32117h, i, 0, mVar.f32118i, arrayList, null);
            }
        }
        for (AbstractC14204d dVar2 : mVar.f32118i.f32085k) {
            if (dVar2 instanceof C14206f) {
                m1392a((C14206f) dVar2, i, 1, mVar.f32117h, arrayList, null);
            } else if (dVar2 instanceof AbstractC14216m) {
                m1392a(((AbstractC14216m) dVar2).f32118i, i, 1, mVar.f32117h, arrayList, null);
            }
        }
        if (i == 1) {
            for (AbstractC14204d dVar3 : ((C14214l) mVar).f32107k.f32085k) {
                if (dVar3 instanceof C14206f) {
                    m1392a((C14206f) dVar3, i, 2, null, arrayList, null);
                }
            }
        }
    }

    /* renamed from: l */
    private void m1381l(ConstraintWidget constraintWidget, ConstraintWidget.EnumC2121b bVar, int i, ConstraintWidget.EnumC2121b bVar2, int i2) {
        C14201b.C14202a aVar = this.f32073h;
        aVar.f32054a = bVar;
        aVar.f32055b = bVar2;
        aVar.f32056c = i;
        aVar.f32057d = i2;
        this.f32072g.mo1396b(constraintWidget, aVar);
        constraintWidget.m38947B0(this.f32073h.f32058e);
        constraintWidget.m38915e0(this.f32073h.f32059f);
        constraintWidget.m38917d0(this.f32073h.f32061h);
        constraintWidget.m38923Y(this.f32073h.f32060g);
    }

    /* renamed from: c */
    public void m1390c() {
        m1389d(this.f32070e);
        this.f32074i.clear();
        C14213k.f32099h = 0;
        m1384i(this.f32066a.f2527e, 0, this.f32074i);
        m1384i(this.f32066a.f2529f, 1, this.f32074i);
        this.f32067b = false;
    }

    /* renamed from: d */
    public void m1389d(ArrayList<AbstractC14216m> arrayList) {
        arrayList.clear();
        this.f32069d.f2527e.mo1361f();
        this.f32069d.f2529f.mo1361f();
        arrayList.add(this.f32069d.f2527e);
        arrayList.add(this.f32069d.f2529f);
        Iterator<ConstraintWidget> it = this.f32069d.f31384w0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (next instanceof C2128e) {
                arrayList.add(new C14209h(next));
            } else {
                if (next.m38926T()) {
                    if (next.f2523c == null) {
                        next.f2523c = new C14203c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f2523c);
                } else {
                    arrayList.add(next.f2527e);
                }
                if (next.m38924V()) {
                    if (next.f2525d == null) {
                        next.f2525d = new C14203c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f2525d);
                } else {
                    arrayList.add(next.f2529f);
                }
                if (next instanceof C13920b) {
                    arrayList.add(new C14210i(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<AbstractC14216m> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().mo1361f();
        }
        Iterator<AbstractC14216m> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC14216m next2 = it3.next();
            if (next2.f32111b != this.f32069d) {
                next2.mo1363d();
            }
        }
    }

    /* renamed from: f */
    public boolean m1387f(boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.f32067b || this.f32068c) {
            Iterator<ConstraintWidget> it = this.f32066a.f31384w0.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                next.f2519a = false;
                next.f2527e.m1372r();
                next.f2529f.m1367q();
            }
            ConstraintWidgetContainer constraintWidgetContainer = this.f32066a;
            constraintWidgetContainer.f2519a = false;
            constraintWidgetContainer.f2527e.m1372r();
            this.f32066a.f2529f.m1367q();
            this.f32068c = false;
        }
        if (m1391b(this.f32069d)) {
            return false;
        }
        this.f32066a.m38945C0(0);
        this.f32066a.m38943D0(0);
        ConstraintWidget.EnumC2121b q = this.f32066a.m38895q(0);
        ConstraintWidget.EnumC2121b q2 = this.f32066a.m38895q(1);
        if (this.f32067b) {
            m1390c();
        }
        int O = this.f32066a.m38931O();
        int P = this.f32066a.m38930P();
        this.f32066a.f2527e.f32117h.mo1376d(O);
        this.f32066a.f2529f.f32117h.mo1376d(P);
        m1380m();
        ConstraintWidget.EnumC2121b bVar = ConstraintWidget.EnumC2121b.WRAP_CONTENT;
        if (q == bVar || q2 == bVar) {
            if (z4) {
                Iterator<AbstractC14216m> it2 = this.f32070e.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!it2.next().mo1354m()) {
                            z4 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z4 && q == ConstraintWidget.EnumC2121b.WRAP_CONTENT) {
                this.f32066a.m38909i0(ConstraintWidget.EnumC2121b.FIXED);
                ConstraintWidgetContainer constraintWidgetContainer2 = this.f32066a;
                constraintWidgetContainer2.m38947B0(m1388e(constraintWidgetContainer2, 0));
                ConstraintWidgetContainer constraintWidgetContainer3 = this.f32066a;
                constraintWidgetContainer3.f2527e.f32114e.mo1376d(constraintWidgetContainer3.m38932N());
            }
            if (z4 && q2 == ConstraintWidget.EnumC2121b.WRAP_CONTENT) {
                this.f32066a.m38880x0(ConstraintWidget.EnumC2121b.FIXED);
                ConstraintWidgetContainer constraintWidgetContainer4 = this.f32066a;
                constraintWidgetContainer4.m38915e0(m1388e(constraintWidgetContainer4, 1));
                ConstraintWidgetContainer constraintWidgetContainer5 = this.f32066a;
                constraintWidgetContainer5.f2529f.f32114e.mo1376d(constraintWidgetContainer5.m38889t());
            }
        }
        ConstraintWidgetContainer constraintWidgetContainer6 = this.f32066a;
        ConstraintWidget.EnumC2121b bVar2 = constraintWidgetContainer6.f35350M[0];
        ConstraintWidget.EnumC2121b bVar3 = ConstraintWidget.EnumC2121b.FIXED;
        if (bVar2 == bVar3 || bVar2 == ConstraintWidget.EnumC2121b.MATCH_PARENT) {
            int N = constraintWidgetContainer6.m38932N() + O;
            this.f32066a.f2527e.f32118i.mo1376d(N);
            this.f32066a.f2527e.f32114e.mo1376d(N - O);
            m1380m();
            ConstraintWidgetContainer constraintWidgetContainer7 = this.f32066a;
            ConstraintWidget.EnumC2121b bVar4 = constraintWidgetContainer7.f35350M[1];
            if (bVar4 == bVar3 || bVar4 == ConstraintWidget.EnumC2121b.MATCH_PARENT) {
                int t = constraintWidgetContainer7.m38889t() + P;
                this.f32066a.f2529f.f32118i.mo1376d(t);
                this.f32066a.f2529f.f32114e.mo1376d(t - P);
            }
            m1380m();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator<AbstractC14216m> it3 = this.f32070e.iterator();
        while (it3.hasNext()) {
            AbstractC14216m next2 = it3.next();
            if (next2.f32111b != this.f32066a || next2.f32116g) {
                next2.mo1362e();
            }
        }
        Iterator<AbstractC14216m> it4 = this.f32070e.iterator();
        while (it4.hasNext()) {
            AbstractC14216m next3 = it4.next();
            if (z2 || next3.f32111b != this.f32066a) {
                if (!next3.f32117h.f32084j || ((!next3.f32118i.f32084j && !(next3 instanceof C14209h)) || (!next3.f32114e.f32084j && !(next3 instanceof C14203c) && !(next3 instanceof C14209h)))) {
                    z3 = false;
                    break;
                }
            }
        }
        this.f32066a.m38909i0(q);
        this.f32066a.m38880x0(q2);
        return z3;
    }

    /* renamed from: g */
    public boolean m1386g(boolean z) {
        if (this.f32067b) {
            Iterator<ConstraintWidget> it = this.f32066a.f31384w0.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                next.f2519a = false;
                C14211j jVar = next.f2527e;
                jVar.f32114e.f32084j = false;
                jVar.f32116g = false;
                jVar.m1372r();
                C14214l lVar = next.f2529f;
                lVar.f32114e.f32084j = false;
                lVar.f32116g = false;
                lVar.m1367q();
            }
            ConstraintWidgetContainer constraintWidgetContainer = this.f32066a;
            constraintWidgetContainer.f2519a = false;
            C14211j jVar2 = constraintWidgetContainer.f2527e;
            jVar2.f32114e.f32084j = false;
            jVar2.f32116g = false;
            jVar2.m1372r();
            C14214l lVar2 = this.f32066a.f2529f;
            lVar2.f32114e.f32084j = false;
            lVar2.f32116g = false;
            lVar2.m1367q();
            m1390c();
        }
        if (m1391b(this.f32069d)) {
            return false;
        }
        this.f32066a.m38945C0(0);
        this.f32066a.m38943D0(0);
        this.f32066a.f2527e.f32117h.mo1376d(0);
        this.f32066a.f2529f.f32117h.mo1376d(0);
        return true;
    }

    /* renamed from: h */
    public boolean m1385h(boolean z, int i) {
        boolean z2;
        ConstraintWidget.EnumC2121b bVar;
        boolean z3 = true;
        boolean z4 = z & true;
        ConstraintWidget.EnumC2121b q = this.f32066a.m38895q(0);
        ConstraintWidget.EnumC2121b q2 = this.f32066a.m38895q(1);
        int O = this.f32066a.m38931O();
        int P = this.f32066a.m38930P();
        if (z4 && (q == (bVar = ConstraintWidget.EnumC2121b.WRAP_CONTENT) || q2 == bVar)) {
            Iterator<AbstractC14216m> it = this.f32070e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC14216m next = it.next();
                if (next.f32115f == i && !next.mo1354m()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && q == ConstraintWidget.EnumC2121b.WRAP_CONTENT) {
                    this.f32066a.m38909i0(ConstraintWidget.EnumC2121b.FIXED);
                    ConstraintWidgetContainer constraintWidgetContainer = this.f32066a;
                    constraintWidgetContainer.m38947B0(m1388e(constraintWidgetContainer, 0));
                    ConstraintWidgetContainer constraintWidgetContainer2 = this.f32066a;
                    constraintWidgetContainer2.f2527e.f32114e.mo1376d(constraintWidgetContainer2.m38932N());
                }
            } else if (z4 && q2 == ConstraintWidget.EnumC2121b.WRAP_CONTENT) {
                this.f32066a.m38880x0(ConstraintWidget.EnumC2121b.FIXED);
                ConstraintWidgetContainer constraintWidgetContainer3 = this.f32066a;
                constraintWidgetContainer3.m38915e0(m1388e(constraintWidgetContainer3, 1));
                ConstraintWidgetContainer constraintWidgetContainer4 = this.f32066a;
                constraintWidgetContainer4.f2529f.f32114e.mo1376d(constraintWidgetContainer4.m38889t());
            }
        }
        if (i == 0) {
            ConstraintWidgetContainer constraintWidgetContainer5 = this.f32066a;
            ConstraintWidget.EnumC2121b bVar2 = constraintWidgetContainer5.f35350M[0];
            if (bVar2 == ConstraintWidget.EnumC2121b.FIXED || bVar2 == ConstraintWidget.EnumC2121b.MATCH_PARENT) {
                int N = constraintWidgetContainer5.m38932N() + O;
                this.f32066a.f2527e.f32118i.mo1376d(N);
                this.f32066a.f2527e.f32114e.mo1376d(N - O);
                z2 = true;
            }
            z2 = false;
        } else {
            ConstraintWidgetContainer constraintWidgetContainer6 = this.f32066a;
            ConstraintWidget.EnumC2121b bVar3 = constraintWidgetContainer6.f35350M[1];
            if (bVar3 == ConstraintWidget.EnumC2121b.FIXED || bVar3 == ConstraintWidget.EnumC2121b.MATCH_PARENT) {
                int t = constraintWidgetContainer6.m38889t() + P;
                this.f32066a.f2529f.f32118i.mo1376d(t);
                this.f32066a.f2529f.f32114e.mo1376d(t - P);
                z2 = true;
            }
            z2 = false;
        }
        m1380m();
        Iterator<AbstractC14216m> it2 = this.f32070e.iterator();
        while (it2.hasNext()) {
            AbstractC14216m next2 = it2.next();
            if (next2.f32115f == i && (next2.f32111b != this.f32066a || next2.f32116g)) {
                next2.mo1362e();
            }
        }
        Iterator<AbstractC14216m> it3 = this.f32070e.iterator();
        while (it3.hasNext()) {
            AbstractC14216m next3 = it3.next();
            if (next3.f32115f == i && (z2 || next3.f32111b != this.f32066a)) {
                if (!next3.f32117h.f32084j || !next3.f32118i.f32084j || (!(next3 instanceof C14203c) && !next3.f32114e.f32084j)) {
                    z3 = false;
                    break;
                }
            }
        }
        this.f32066a.m38909i0(q);
        this.f32066a.m38880x0(q2);
        return z3;
    }

    /* renamed from: j */
    public void m1383j() {
        this.f32067b = true;
    }

    /* renamed from: k */
    public void m1382k() {
        this.f32068c = true;
    }

    /* renamed from: m */
    public void m1380m() {
        boolean z;
        C14208g gVar;
        Iterator<ConstraintWidget> it = this.f32066a.f31384w0.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (!next.f2519a) {
                ConstraintWidget.EnumC2121b[] bVarArr = next.f35350M;
                boolean z2 = false;
                ConstraintWidget.EnumC2121b bVar = bVarArr[0];
                ConstraintWidget.EnumC2121b bVar2 = bVarArr[1];
                int i = next.f2541l;
                int i2 = next.f2543m;
                ConstraintWidget.EnumC2121b bVar3 = ConstraintWidget.EnumC2121b.WRAP_CONTENT;
                if (bVar == bVar3 || (bVar == ConstraintWidget.EnumC2121b.MATCH_CONSTRAINT && i == 1)) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVar2 == bVar3 || (bVar2 == ConstraintWidget.EnumC2121b.MATCH_CONSTRAINT && i2 == 1)) {
                    z2 = true;
                }
                C14208g gVar2 = next.f2527e.f32114e;
                boolean z3 = gVar2.f32084j;
                C14208g gVar3 = next.f2529f.f32114e;
                boolean z4 = gVar3.f32084j;
                if (z3 && z4) {
                    ConstraintWidget.EnumC2121b bVar4 = ConstraintWidget.EnumC2121b.FIXED;
                    m1381l(next, bVar4, gVar2.f32081g, bVar4, gVar3.f32081g);
                    next.f2519a = true;
                } else if (z3 && z2) {
                    m1381l(next, ConstraintWidget.EnumC2121b.FIXED, gVar2.f32081g, bVar3, gVar3.f32081g);
                    if (bVar2 == ConstraintWidget.EnumC2121b.MATCH_CONSTRAINT) {
                        next.f2529f.f32114e.f32096m = next.m38889t();
                    } else {
                        next.f2529f.f32114e.mo1376d(next.m38889t());
                        next.f2519a = true;
                    }
                } else if (z4 && z) {
                    m1381l(next, bVar3, gVar2.f32081g, ConstraintWidget.EnumC2121b.FIXED, gVar3.f32081g);
                    if (bVar == ConstraintWidget.EnumC2121b.MATCH_CONSTRAINT) {
                        next.f2527e.f32114e.f32096m = next.m38932N();
                    } else {
                        next.f2527e.f32114e.mo1376d(next.m38932N());
                        next.f2519a = true;
                    }
                }
                if (next.f2519a && (gVar = next.f2529f.f32108l) != null) {
                    gVar.mo1376d(next.m38905l());
                }
            }
        }
    }

    /* renamed from: n */
    public void m1379n(C14201b.AbstractC0461b bVar) {
        this.f32072g = bVar;
    }
}
