package p432y0;

import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y0.k */
/* loaded from: classes.dex */
public class C14213k {

    /* renamed from: h */
    public static int f32099h;

    /* renamed from: c */
    AbstractC14216m f32102c;

    /* renamed from: d */
    AbstractC14216m f32103d;

    /* renamed from: f */
    int f32105f;

    /* renamed from: g */
    int f32106g;

    /* renamed from: a */
    public int f32100a = 0;

    /* renamed from: b */
    public boolean f32101b = false;

    /* renamed from: e */
    ArrayList<AbstractC14216m> f32104e = new ArrayList<>();

    public C14213k(AbstractC14216m mVar, int i) {
        this.f32102c = null;
        this.f32103d = null;
        int i2 = f32099h;
        this.f32105f = i2;
        f32099h = i2 + 1;
        this.f32102c = mVar;
        this.f32103d = mVar;
        this.f32106g = i;
    }

    /* renamed from: c */
    private long m1369c(C14206f fVar, long j) {
        AbstractC14216m mVar = fVar.f32078d;
        if (mVar instanceof C14210i) {
            return j;
        }
        int size = fVar.f32085k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            AbstractC14204d dVar = fVar.f32085k.get(i);
            if (dVar instanceof C14206f) {
                C14206f fVar2 = (C14206f) dVar;
                if (fVar2.f32078d != mVar) {
                    j2 = Math.min(j2, m1369c(fVar2, fVar2.f32080f + j));
                }
            }
        }
        if (fVar != mVar.f32118i) {
            return j2;
        }
        long j3 = j - mVar.mo1357j();
        return Math.min(Math.min(j2, m1369c(mVar.f32117h, j3)), j3 - mVar.f32117h.f32080f);
    }

    /* renamed from: d */
    private long m1368d(C14206f fVar, long j) {
        AbstractC14216m mVar = fVar.f32078d;
        if (mVar instanceof C14210i) {
            return j;
        }
        int size = fVar.f32085k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            AbstractC14204d dVar = fVar.f32085k.get(i);
            if (dVar instanceof C14206f) {
                C14206f fVar2 = (C14206f) dVar;
                if (fVar2.f32078d != mVar) {
                    j2 = Math.max(j2, m1368d(fVar2, fVar2.f32080f + j));
                }
            }
        }
        if (fVar != mVar.f32117h) {
            return j2;
        }
        long j3 = j + mVar.mo1357j();
        return Math.max(Math.max(j2, m1368d(mVar.f32118i, j3)), j3 - mVar.f32118i.f32080f);
    }

    /* renamed from: a */
    public void m1371a(AbstractC14216m mVar) {
        this.f32104e.add(mVar);
        this.f32103d = mVar;
    }

    /* renamed from: b */
    public long m1370b(ConstraintWidgetContainer constraintWidgetContainer, int i) {
        AbstractC14216m mVar;
        AbstractC14216m mVar2;
        int i2;
        long j;
        AbstractC14216m mVar3;
        C14206f fVar;
        C14206f fVar2;
        AbstractC14216m mVar4;
        AbstractC14216m mVar5 = this.f32102c;
        long j2 = 0;
        if (mVar5 instanceof C14203c) {
            if (((C14203c) mVar5).f32115f != i) {
                return 0L;
            }
        } else if (i == 0) {
            if (!(mVar5 instanceof C14211j)) {
                return 0L;
            }
        } else if (!(mVar5 instanceof C14214l)) {
            return 0L;
        }
        if (i == 0) {
            mVar = constraintWidgetContainer.f2527e;
        } else {
            mVar = constraintWidgetContainer.f2529f;
        }
        C14206f fVar3 = mVar.f32117h;
        if (i == 0) {
            mVar2 = constraintWidgetContainer.f2527e;
        } else {
            mVar2 = constraintWidgetContainer.f2529f;
        }
        C14206f fVar4 = mVar2.f32118i;
        boolean contains = mVar5.f32117h.f32086l.contains(fVar3);
        boolean contains2 = this.f32102c.f32118i.f32086l.contains(fVar4);
        long j3 = this.f32102c.mo1357j();
        if (contains && contains2) {
            long d = m1368d(this.f32102c.f32117h, 0L);
            long c = m1369c(this.f32102c.f32118i, 0L);
            long j4 = d - j3;
            AbstractC14216m mVar6 = this.f32102c;
            int i3 = mVar6.f32118i.f32080f;
            if (j4 >= (-i3)) {
                j4 += i3;
            }
            int i4 = mVar6.f32117h.f32080f;
            long j5 = ((-c) - j3) - i4;
            if (j5 >= i4) {
                j5 -= i4;
            }
            float m = mVar6.f32111b.m38903m(i);
            if (m > 0.0f) {
                j2 = (((float) j5) / m) + (((float) j4) / (1.0f - m));
            }
            float f = (float) j2;
            long j6 = (f * m) + 0.5f + j3 + (f * (1.0f - m)) + 0.5f;
            j = mVar4.f32117h.f32080f + j6;
            i2 = this.f32102c.f32118i.f32080f;
        } else if (contains) {
            return Math.max(m1368d(this.f32102c.f32117h, fVar2.f32080f), this.f32102c.f32117h.f32080f + j3);
        } else if (contains2) {
            return Math.max(-m1369c(this.f32102c.f32118i, fVar.f32080f), (-this.f32102c.f32118i.f32080f) + j3);
        } else {
            j = mVar3.f32117h.f32080f + this.f32102c.mo1357j();
            i2 = this.f32102c.f32118i.f32080f;
        }
        return j - i2;
    }
}
