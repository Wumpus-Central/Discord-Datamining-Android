package p432y0;

import androidx.constraintlayout.solver.widgets.C2125d;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: y0.c */
/* loaded from: classes.dex */
public class C14203c extends AbstractC14216m {

    /* renamed from: k */
    ArrayList<AbstractC14216m> f32064k = new ArrayList<>();

    /* renamed from: l */
    private int f32065l;

    public C14203c(ConstraintWidget constraintWidget, int i) {
        super(constraintWidget);
        this.f32115f = i;
        m1395q();
    }

    /* renamed from: q */
    private void m1395q() {
        boolean z;
        int i;
        ConstraintWidget constraintWidget = this.f32111b;
        ConstraintWidget F = constraintWidget.m38940F(this.f32115f);
        while (true) {
            constraintWidget = F;
            if (constraintWidget == null) {
                break;
            }
            F = constraintWidget.m38940F(this.f32115f);
        }
        this.f32111b = constraintWidget;
        this.f32064k.add(constraintWidget.m38938H(this.f32115f));
        ConstraintWidget D = constraintWidget.m38944D(this.f32115f);
        while (D != null) {
            this.f32064k.add(D.m38938H(this.f32115f));
            D = D.m38944D(this.f32115f);
        }
        Iterator<AbstractC14216m> it = this.f32064k.iterator();
        while (it.hasNext()) {
            AbstractC14216m next = it.next();
            int i2 = this.f32115f;
            if (i2 == 0) {
                next.f32111b.f2523c = this;
            } else if (i2 == 1) {
                next.f32111b.f2525d = this;
            }
        }
        if (this.f32115f != 0 || !((ConstraintWidgetContainer) this.f32111b.m38942E()).m38861X0()) {
            z = false;
        } else {
            z = true;
        }
        if (z && this.f32064k.size() > 1) {
            ArrayList<AbstractC14216m> arrayList = this.f32064k;
            this.f32111b = arrayList.get(arrayList.size() - 1).f32111b;
        }
        if (this.f32115f == 0) {
            i = this.f32111b.m38885v();
        } else {
            i = this.f32111b.m38936J();
        }
        this.f32065l = i;
    }

    /* renamed from: r */
    private ConstraintWidget m1394r() {
        for (int i = 0; i < this.f32064k.size(); i++) {
            AbstractC14216m mVar = this.f32064k.get(i);
            if (mVar.f32111b.m38933M() != 8) {
                return mVar.f32111b;
            }
        }
        return null;
    }

    /* renamed from: s */
    private ConstraintWidget m1393s() {
        for (int size = this.f32064k.size() - 1; size >= 0; size--) {
            AbstractC14216m mVar = this.f32064k.get(size);
            if (mVar.f32111b.m38933M() != 8) {
                return mVar.f32111b;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01a5, code lost:
        if (r1 != r7) goto L_0x01cd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01cb, code lost:
        if (r1 != r7) goto L_0x01cd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01cd, code lost:
        r13 = r13 + 1;
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01d0, code lost:
        r9.f32114e.mo1376d(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0418, code lost:
        r7 = r7 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00eb  */
    @Override // p432y0.AbstractC14216m, p432y0.AbstractC14204d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo1366a(p432y0.AbstractC14204d r26) {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p432y0.C14203c.mo1366a(y0.d):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p432y0.AbstractC14216m
    /* renamed from: d */
    public void mo1363d() {
        Iterator<AbstractC14216m> it = this.f32064k.iterator();
        while (it.hasNext()) {
            it.next().mo1363d();
        }
        int size = this.f32064k.size();
        if (size >= 1) {
            ConstraintWidget constraintWidget = this.f32064k.get(0).f32111b;
            ConstraintWidget constraintWidget2 = this.f32064k.get(size - 1).f32111b;
            if (this.f32115f == 0) {
                C2125d dVar = constraintWidget.f35339B;
                C2125d dVar2 = constraintWidget2.f35341D;
                C14206f i = m1358i(dVar, 0);
                int b = dVar.m38838b();
                ConstraintWidget r = m1394r();
                if (r != null) {
                    b = r.f35339B.m38838b();
                }
                if (i != null) {
                    m1365b(this.f32117h, i, b);
                }
                C14206f i2 = m1358i(dVar2, 0);
                int b2 = dVar2.m38838b();
                ConstraintWidget s = m1393s();
                if (s != null) {
                    b2 = s.f35341D.m38838b();
                }
                if (i2 != null) {
                    m1365b(this.f32118i, i2, -b2);
                }
            } else {
                C2125d dVar3 = constraintWidget.f35340C;
                C2125d dVar4 = constraintWidget2.f35342E;
                C14206f i3 = m1358i(dVar3, 1);
                int b3 = dVar3.m38838b();
                ConstraintWidget r2 = m1394r();
                if (r2 != null) {
                    b3 = r2.f35340C.m38838b();
                }
                if (i3 != null) {
                    m1365b(this.f32117h, i3, b3);
                }
                C14206f i4 = m1358i(dVar4, 1);
                int b4 = dVar4.m38838b();
                ConstraintWidget s2 = m1393s();
                if (s2 != null) {
                    b4 = s2.f35342E.m38838b();
                }
                if (i4 != null) {
                    m1365b(this.f32118i, i4, -b4);
                }
            }
            this.f32117h.f32075a = this;
            this.f32118i.f32075a = this;
        }
    }

    @Override // p432y0.AbstractC14216m
    /* renamed from: e */
    public void mo1362e() {
        for (int i = 0; i < this.f32064k.size(); i++) {
            this.f32064k.get(i).mo1362e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p432y0.AbstractC14216m
    /* renamed from: f */
    public void mo1361f() {
        this.f32112c = null;
        Iterator<AbstractC14216m> it = this.f32064k.iterator();
        while (it.hasNext()) {
            it.next().mo1361f();
        }
    }

    @Override // p432y0.AbstractC14216m
    /* renamed from: j */
    public long mo1357j() {
        int size = this.f32064k.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            AbstractC14216m mVar = this.f32064k.get(i);
            j = j + mVar.f32117h.f32080f + mVar.mo1357j() + mVar.f32118i.f32080f;
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p432y0.AbstractC14216m
    /* renamed from: m */
    public boolean mo1354m() {
        int size = this.f32064k.size();
        for (int i = 0; i < size; i++) {
            if (!this.f32064k.get(i).mo1354m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String str;
        Iterator<AbstractC14216m> it;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ChainRun ");
        if (this.f32115f == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb2.append(str);
        String sb3 = sb2.toString();
        while (this.f32064k.iterator().hasNext()) {
            sb3 = ((sb3 + "<") + it.next()) + "> ";
        }
        return sb3;
    }
}
