package p432y0;

import java.util.ArrayList;
import java.util.List;

/* renamed from: y0.f */
/* loaded from: classes.dex */
public class C14206f implements AbstractC14204d {

    /* renamed from: d */
    AbstractC14216m f32078d;

    /* renamed from: f */
    int f32080f;

    /* renamed from: g */
    public int f32081g;

    /* renamed from: a */
    public AbstractC14204d f32075a = null;

    /* renamed from: b */
    public boolean f32076b = false;

    /* renamed from: c */
    public boolean f32077c = false;

    /* renamed from: e */
    EnumC14207a f32079e = EnumC14207a.UNKNOWN;

    /* renamed from: h */
    int f32082h = 1;

    /* renamed from: i */
    C14208g f32083i = null;

    /* renamed from: j */
    public boolean f32084j = false;

    /* renamed from: k */
    List<AbstractC14204d> f32085k = new ArrayList();

    /* renamed from: l */
    List<C14206f> f32086l = new ArrayList();

    /* renamed from: y0.f$a */
    /* loaded from: classes.dex */
    enum EnumC14207a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public C14206f(AbstractC14216m mVar) {
        this.f32078d = mVar;
    }

    @Override // p432y0.AbstractC14204d
    /* renamed from: a */
    public void mo1366a(AbstractC14204d dVar) {
        for (C14206f fVar : this.f32086l) {
            if (!fVar.f32084j) {
                return;
            }
        }
        this.f32077c = true;
        AbstractC14204d dVar2 = this.f32075a;
        if (dVar2 != null) {
            dVar2.mo1366a(this);
        }
        if (this.f32076b) {
            this.f32078d.mo1366a(this);
            return;
        }
        C14206f fVar2 = null;
        int i = 0;
        for (C14206f fVar3 : this.f32086l) {
            if (!(fVar3 instanceof C14208g)) {
                i++;
                fVar2 = fVar3;
            }
        }
        if (fVar2 != null && i == 1 && fVar2.f32084j) {
            C14208g gVar = this.f32083i;
            if (gVar != null) {
                if (gVar.f32084j) {
                    this.f32080f = this.f32082h * gVar.f32081g;
                } else {
                    return;
                }
            }
            mo1376d(fVar2.f32081g + this.f32080f);
        }
        AbstractC14204d dVar3 = this.f32075a;
        if (dVar3 != null) {
            dVar3.mo1366a(this);
        }
    }

    /* renamed from: b */
    public void m1378b(AbstractC14204d dVar) {
        this.f32085k.add(dVar);
        if (this.f32084j) {
            dVar.mo1366a(dVar);
        }
    }

    /* renamed from: c */
    public void m1377c() {
        this.f32086l.clear();
        this.f32085k.clear();
        this.f32084j = false;
        this.f32081g = 0;
        this.f32077c = false;
        this.f32076b = false;
    }

    /* renamed from: d */
    public void mo1376d(int i) {
        if (!this.f32084j) {
            this.f32084j = true;
            this.f32081g = i;
            for (AbstractC14204d dVar : this.f32085k) {
                dVar.mo1366a(dVar);
            }
        }
    }

    public String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f32078d.f32111b.m38897p());
        sb2.append(":");
        sb2.append(this.f32079e);
        sb2.append("(");
        if (this.f32084j) {
            obj = Integer.valueOf(this.f32081g);
        } else {
            obj = "unresolved";
        }
        sb2.append(obj);
        sb2.append(") <t=");
        sb2.append(this.f32086l.size());
        sb2.append(":d=");
        sb2.append(this.f32085k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
