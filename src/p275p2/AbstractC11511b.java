package p275p2;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p126h2.C7742c;
import p126h2.C7748e0;
import p126h2.C7762i;
import p147i2.C8210a;
import p167j2.AbstractC9465c;
import p167j2.AbstractC9467e;
import p188k2.AbstractC9721a;
import p188k2.C9730d;
import p188k2.C9734h;
import p188k2.C9743p;
import p223m2.AbstractC10475f;
import p223m2.C10474e;
import p254o2.C11168a;
import p254o2.C11175h;
import p254o2.C11184n;
import p275p2.C11516e;
import p311r2.C12340j;
import p343t2.C12945f;
import p343t2.C12949j;
import p358u2.C13180c;

/* renamed from: p2.b */
/* loaded from: classes.dex */
public abstract class AbstractC11511b implements AbstractC9467e, AbstractC9721a.AbstractC9722b, AbstractC10475f {

    /* renamed from: A */
    private Paint f39036A;

    /* renamed from: C */
    BlurMaskFilter f39038C;

    /* renamed from: g */
    private final Paint f25652g;

    /* renamed from: n */
    private final String f25659n;

    /* renamed from: p */
    final C7748e0 f25661p;

    /* renamed from: q */
    final C11516e f25662q;

    /* renamed from: r */
    private C9734h f25663r;

    /* renamed from: s */
    private C9730d f25664s;

    /* renamed from: t */
    private AbstractC11511b f25665t;

    /* renamed from: u */
    private AbstractC11511b f25666u;

    /* renamed from: v */
    private List<AbstractC11511b> f25667v;

    /* renamed from: x */
    final C9743p f25669x;

    /* renamed from: z */
    private boolean f25671z;

    /* renamed from: a */
    private final Path f25646a = new Path();

    /* renamed from: b */
    private final Matrix f25647b = new Matrix();

    /* renamed from: c */
    private final Matrix f25648c = new Matrix();

    /* renamed from: d */
    private final Paint f25649d = new C8210a(1);

    /* renamed from: e */
    private final Paint f25650e = new C8210a(1, PorterDuff.Mode.DST_IN);

    /* renamed from: f */
    private final Paint f25651f = new C8210a(1, PorterDuff.Mode.DST_OUT);

    /* renamed from: h */
    private final Paint f25653h = new C8210a(PorterDuff.Mode.CLEAR);

    /* renamed from: i */
    private final RectF f25654i = new RectF();

    /* renamed from: j */
    private final RectF f25655j = new RectF();

    /* renamed from: k */
    private final RectF f25656k = new RectF();

    /* renamed from: l */
    private final RectF f25657l = new RectF();

    /* renamed from: m */
    private final RectF f25658m = new RectF();

    /* renamed from: o */
    final Matrix f25660o = new Matrix();

    /* renamed from: w */
    private final List<AbstractC9721a<?, ?>> f25668w = new ArrayList();

    /* renamed from: y */
    private boolean f25670y = true;

    /* renamed from: B */
    float f39037B = 0.0f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p2.b$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C11512a {

        /* renamed from: a */
        static final /* synthetic */ int[] f25672a;

        /* renamed from: b */
        static final /* synthetic */ int[] f25673b;

        static {
            int[] iArr = new int[C11175h.EnumC11176a.values().length];
            f25673b = iArr;
            try {
                iArr[C11175h.EnumC11176a.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25673b[C11175h.EnumC11176a.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25673b[C11175h.EnumC11176a.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25673b[C11175h.EnumC11176a.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[C11516e.EnumC11517a.values().length];
            f25672a = iArr2;
            try {
                iArr2[C11516e.EnumC11517a.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f25672a[C11516e.EnumC11517a.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f25672a[C11516e.EnumC11517a.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f25672a[C11516e.EnumC11517a.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f25672a[C11516e.EnumC11517a.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f25672a[C11516e.EnumC11517a.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f25672a[C11516e.EnumC11517a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC11511b(C7748e0 e0Var, C11516e eVar) {
        C8210a aVar = new C8210a(1);
        this.f25652g = aVar;
        this.f25661p = e0Var;
        this.f25662q = eVar;
        this.f25659n = eVar.m9493i() + "#draw";
        if (eVar.m9494h() == C11516e.EnumC11518b.INVERT) {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        C9743p b = eVar.m9479w().m12634b();
        this.f25669x = b;
        b.m15459b(this);
        if (eVar.m9495g() != null && !eVar.m9495g().isEmpty()) {
            C9734h hVar = new C9734h(eVar.m9495g());
            this.f25663r = hVar;
            for (AbstractC9721a<C11184n, Path> aVar2 : hVar.m15479a()) {
                aVar2.m15511a(this);
            }
            for (AbstractC9721a<Integer, Integer> aVar3 : this.f25663r.m15477c()) {
                m9519j(aVar3);
                aVar3.m15511a(this);
            }
        }
        m9525O();
    }

    /* renamed from: C */
    private void m9534C(RectF rectF, Matrix matrix) {
        this.f25656k.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (m9536A()) {
            int size = this.f25663r.m15478b().size();
            for (int i = 0; i < size; i++) {
                C11175h hVar = this.f25663r.m15478b().get(i);
                Path h = this.f25663r.m15479a().get(i).mo15449h();
                if (h != null) {
                    this.f25646a.set(h);
                    this.f25646a.transform(matrix);
                    int i2 = C11512a.f25673b[hVar.m10589a().ordinal()];
                    if (i2 != 1 && i2 != 2) {
                        if ((i2 != 3 && i2 != 4) || !hVar.m10586d()) {
                            this.f25646a.computeBounds(this.f25658m, false);
                            if (i == 0) {
                                this.f25656k.set(this.f25658m);
                            } else {
                                RectF rectF2 = this.f25656k;
                                rectF2.set(Math.min(rectF2.left, this.f25658m.left), Math.min(this.f25656k.top, this.f25658m.top), Math.max(this.f25656k.right, this.f25658m.right), Math.max(this.f25656k.bottom, this.f25658m.bottom));
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            if (!rectF.intersect(this.f25656k)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
    }

    /* renamed from: D */
    private void m9533D(RectF rectF, Matrix matrix) {
        if (m9535B() && this.f25662q.m9494h() != C11516e.EnumC11518b.INVERT) {
            this.f25657l.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f25665t.mo9457f(this.f25657l, matrix, true);
            if (!rectF.intersect(this.f25657l)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
    }

    /* renamed from: E */
    private void m9532E() {
        this.f25661p.invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ void m9531F() {
        m9526N(this.f25664s.m15486p() == 1.0f);
    }

    /* renamed from: G */
    private void m9530G(float f) {
        this.f25661p.m21527G().m21390n().m21367a(this.f25662q.m9493i(), f);
    }

    /* renamed from: N */
    private void m9526N(boolean z) {
        if (z != this.f25670y) {
            this.f25670y = z;
            m9532E();
        }
    }

    /* renamed from: O */
    private void m9525O() {
        boolean z = true;
        if (!this.f25662q.m9497e().isEmpty()) {
            C9730d dVar = new C9730d(this.f25662q.m9497e());
            this.f25664s = dVar;
            dVar.m15505l();
            this.f25664s.m15511a(new AbstractC9721a.AbstractC9722b() { // from class: p2.a
                @Override // p188k2.AbstractC9721a.AbstractC9722b
                /* renamed from: a */
                public final void mo9524a() {
                    AbstractC11511b.this.m9531F();
                }
            });
            if (this.f25664s.mo15449h().floatValue() != 1.0f) {
                z = false;
            }
            m9526N(z);
            m9519j(this.f25664s);
            return;
        }
        m9526N(true);
    }

    /* renamed from: k */
    private void m9518k(Canvas canvas, Matrix matrix, AbstractC9721a<C11184n, Path> aVar, AbstractC9721a<Integer, Integer> aVar2) {
        this.f25646a.set(aVar.mo15449h());
        this.f25646a.transform(matrix);
        this.f25649d.setAlpha((int) (aVar2.mo15449h().intValue() * 2.55f));
        canvas.drawPath(this.f25646a, this.f25649d);
    }

    /* renamed from: l */
    private void m9517l(Canvas canvas, Matrix matrix, AbstractC9721a<C11184n, Path> aVar, AbstractC9721a<Integer, Integer> aVar2) {
        C12949j.m4959m(canvas, this.f25654i, this.f25650e);
        this.f25646a.set(aVar.mo15449h());
        this.f25646a.transform(matrix);
        this.f25649d.setAlpha((int) (aVar2.mo15449h().intValue() * 2.55f));
        canvas.drawPath(this.f25646a, this.f25649d);
        canvas.restore();
    }

    /* renamed from: m */
    private void m9516m(Canvas canvas, Matrix matrix, AbstractC9721a<C11184n, Path> aVar, AbstractC9721a<Integer, Integer> aVar2) {
        C12949j.m4959m(canvas, this.f25654i, this.f25649d);
        canvas.drawRect(this.f25654i, this.f25649d);
        this.f25646a.set(aVar.mo15449h());
        this.f25646a.transform(matrix);
        this.f25649d.setAlpha((int) (aVar2.mo15449h().intValue() * 2.55f));
        canvas.drawPath(this.f25646a, this.f25651f);
        canvas.restore();
    }

    /* renamed from: n */
    private void m9515n(Canvas canvas, Matrix matrix, AbstractC9721a<C11184n, Path> aVar, AbstractC9721a<Integer, Integer> aVar2) {
        C12949j.m4959m(canvas, this.f25654i, this.f25650e);
        canvas.drawRect(this.f25654i, this.f25649d);
        this.f25651f.setAlpha((int) (aVar2.mo15449h().intValue() * 2.55f));
        this.f25646a.set(aVar.mo15449h());
        this.f25646a.transform(matrix);
        canvas.drawPath(this.f25646a, this.f25651f);
        canvas.restore();
    }

    /* renamed from: o */
    private void m9514o(Canvas canvas, Matrix matrix, AbstractC9721a<C11184n, Path> aVar, AbstractC9721a<Integer, Integer> aVar2) {
        C12949j.m4959m(canvas, this.f25654i, this.f25651f);
        canvas.drawRect(this.f25654i, this.f25649d);
        this.f25651f.setAlpha((int) (aVar2.mo15449h().intValue() * 2.55f));
        this.f25646a.set(aVar.mo15449h());
        this.f25646a.transform(matrix);
        canvas.drawPath(this.f25646a, this.f25651f);
        canvas.restore();
    }

    /* renamed from: p */
    private void m9513p(Canvas canvas, Matrix matrix) {
        C7742c.m21543a("Layer#saveLayer");
        C12949j.m4958n(canvas, this.f25654i, this.f25650e, 19);
        if (Build.VERSION.SDK_INT < 28) {
            m9509t(canvas);
        }
        C7742c.m21542b("Layer#saveLayer");
        for (int i = 0; i < this.f25663r.m15478b().size(); i++) {
            C11175h hVar = this.f25663r.m15478b().get(i);
            AbstractC9721a<C11184n, Path> aVar = this.f25663r.m15479a().get(i);
            AbstractC9721a<Integer, Integer> aVar2 = this.f25663r.m15477c().get(i);
            int i2 = C11512a.f25673b[hVar.m10589a().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == 0) {
                        this.f25649d.setColor(-16777216);
                        this.f25649d.setAlpha(255);
                        canvas.drawRect(this.f25654i, this.f25649d);
                    }
                    if (hVar.m10586d()) {
                        m9514o(canvas, matrix, aVar, aVar2);
                    } else {
                        m9512q(canvas, matrix, aVar);
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        if (hVar.m10586d()) {
                            m9516m(canvas, matrix, aVar, aVar2);
                        } else {
                            m9518k(canvas, matrix, aVar, aVar2);
                        }
                    }
                } else if (hVar.m10586d()) {
                    m9515n(canvas, matrix, aVar, aVar2);
                } else {
                    m9517l(canvas, matrix, aVar, aVar2);
                }
            } else if (m9511r()) {
                this.f25649d.setAlpha(255);
                canvas.drawRect(this.f25654i, this.f25649d);
            }
        }
        C7742c.m21543a("Layer#restoreLayer");
        canvas.restore();
        C7742c.m21542b("Layer#restoreLayer");
    }

    /* renamed from: q */
    private void m9512q(Canvas canvas, Matrix matrix, AbstractC9721a<C11184n, Path> aVar) {
        this.f25646a.set(aVar.mo15449h());
        this.f25646a.transform(matrix);
        canvas.drawPath(this.f25646a, this.f25651f);
    }

    /* renamed from: r */
    private boolean m9511r() {
        if (this.f25663r.m15479a().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.f25663r.m15478b().size(); i++) {
            if (this.f25663r.m15478b().get(i).m10589a() != C11175h.EnumC11176a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: s */
    private void m9510s() {
        if (this.f25667v == null) {
            if (this.f25666u == null) {
                this.f25667v = Collections.emptyList();
                return;
            }
            this.f25667v = new ArrayList();
            for (AbstractC11511b bVar = this.f25666u; bVar != null; bVar = bVar.f25666u) {
                this.f25667v.add(bVar);
            }
        }
    }

    /* renamed from: t */
    private void m9509t(Canvas canvas) {
        C7742c.m21543a("Layer#clearLayer");
        RectF rectF = this.f25654i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f25653h);
        C7742c.m21542b("Layer#clearLayer");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public static AbstractC11511b m9508v(C11513c cVar, C11516e eVar, C7748e0 e0Var, C7762i iVar) {
        switch (C11512a.f25672a[eVar.m9496f().ordinal()]) {
            case 1:
                return new C11520g(e0Var, eVar, cVar);
            case 2:
                return new C11513c(e0Var, eVar, iVar.m21389o(eVar.m9489m()), iVar);
            case 3:
                return new C11521h(e0Var, eVar);
            case 4:
                return new C11515d(e0Var, eVar);
            case 5:
                return new C11519f(e0Var, eVar);
            case 6:
                return new C11522i(e0Var, eVar);
            default:
                C12945f.m5009c("Unknown layer type " + eVar.m9496f());
                return null;
        }
    }

    /* renamed from: A */
    boolean m9536A() {
        C9734h hVar = this.f25663r;
        return hVar != null && !hVar.m15479a().isEmpty();
    }

    /* renamed from: B */
    boolean m9535B() {
        return this.f25665t != null;
    }

    /* renamed from: H */
    public void m9529H(AbstractC9721a<?, ?> aVar) {
        this.f25668w.remove(aVar);
    }

    /* renamed from: I */
    void mo9476I(C10474e eVar, int i, List<C10474e> list, C10474e eVar2) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public void m9528J(AbstractC11511b bVar) {
        this.f25665t = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo9505K(boolean z) {
        if (z && this.f39036A == null) {
            this.f39036A = new C8210a();
        }
        this.f25671z = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public void m9527L(AbstractC11511b bVar) {
        this.f25666u = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo9504M(float f) {
        this.f25669x.m15451j(f);
        if (this.f25663r != null) {
            for (int i = 0; i < this.f25663r.m15479a().size(); i++) {
                this.f25663r.m15479a().get(i).mo15446m(f);
            }
        }
        C9730d dVar = this.f25664s;
        if (dVar != null) {
            dVar.mo15446m(f);
        }
        AbstractC11511b bVar = this.f25665t;
        if (bVar != null) {
            bVar.mo9504M(f);
        }
        for (int i2 = 0; i2 < this.f25668w.size(); i2++) {
            this.f25668w.get(i2).mo15446m(f);
        }
    }

    @Override // p188k2.AbstractC9721a.AbstractC9722b
    /* renamed from: a */
    public void mo9524a() {
        m9532E();
    }

    @Override // p167j2.AbstractC9465c
    /* renamed from: b */
    public void mo9523b(List<AbstractC9465c> list, List<AbstractC9465c> list2) {
    }

    @Override // p223m2.AbstractC10475f
    /* renamed from: c */
    public <T> void mo9460c(T t, C13180c<T> cVar) {
        this.f25669x.m15458c(t, cVar);
    }

    @Override // p167j2.AbstractC9467e
    /* renamed from: f */
    public void mo9457f(RectF rectF, Matrix matrix, boolean z) {
        this.f25654i.set(0.0f, 0.0f, 0.0f, 0.0f);
        m9510s();
        this.f25660o.set(matrix);
        if (z) {
            List<AbstractC11511b> list = this.f25667v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f25660o.preConcat(this.f25667v.get(size).f25669x.m15455f());
                }
            } else {
                AbstractC11511b bVar = this.f25666u;
                if (bVar != null) {
                    this.f25660o.preConcat(bVar.f25669x.m15455f());
                }
            }
        }
        this.f25660o.preConcat(this.f25669x.m15455f());
    }

    @Override // p167j2.AbstractC9465c
    public String getName() {
        return this.f25662q.m9493i();
    }

    @Override // p167j2.AbstractC9467e
    /* renamed from: h */
    public void mo9521h(Canvas canvas, Matrix matrix, int i) {
        int i2;
        Paint paint;
        C7742c.m21543a(this.f25659n);
        if (!this.f25670y || this.f25662q.m9478x()) {
            C7742c.m21542b(this.f25659n);
            return;
        }
        m9510s();
        C7742c.m21543a("Layer#parentMatrix");
        this.f25647b.reset();
        this.f25647b.set(matrix);
        for (int size = this.f25667v.size() - 1; size >= 0; size--) {
            this.f25647b.preConcat(this.f25667v.get(size).f25669x.m15455f());
        }
        C7742c.m21542b("Layer#parentMatrix");
        if (this.f25669x.m15453h() == null) {
            i2 = 100;
        } else {
            i2 = this.f25669x.m15453h().mo15449h().intValue();
        }
        int i3 = (int) ((((i / 255.0f) * i2) / 100.0f) * 255.0f);
        if (m9535B() || m9536A()) {
            C7742c.m21543a("Layer#computeBounds");
            mo9457f(this.f25654i, this.f25647b, false);
            m9533D(this.f25654i, matrix);
            this.f25647b.preConcat(this.f25669x.m15455f());
            m9534C(this.f25654i, this.f25647b);
            this.f25655j.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
            canvas.getMatrix(this.f25648c);
            if (!this.f25648c.isIdentity()) {
                Matrix matrix2 = this.f25648c;
                matrix2.invert(matrix2);
                this.f25648c.mapRect(this.f25655j);
            }
            if (!this.f25654i.intersect(this.f25655j)) {
                this.f25654i.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            C7742c.m21542b("Layer#computeBounds");
            if (this.f25654i.width() >= 1.0f && this.f25654i.height() >= 1.0f) {
                C7742c.m21543a("Layer#saveLayer");
                this.f25649d.setAlpha(255);
                C12949j.m4959m(canvas, this.f25654i, this.f25649d);
                C7742c.m21542b("Layer#saveLayer");
                m9509t(canvas);
                C7742c.m21543a("Layer#drawLayer");
                mo9456u(canvas, this.f25647b, i3);
                C7742c.m21542b("Layer#drawLayer");
                if (m9536A()) {
                    m9513p(canvas, this.f25647b);
                }
                if (m9535B()) {
                    C7742c.m21543a("Layer#drawMatte");
                    C7742c.m21543a("Layer#saveLayer");
                    C12949j.m4958n(canvas, this.f25654i, this.f25652g, 19);
                    C7742c.m21542b("Layer#saveLayer");
                    m9509t(canvas);
                    this.f25665t.mo9521h(canvas, matrix, i3);
                    C7742c.m21543a("Layer#restoreLayer");
                    canvas.restore();
                    C7742c.m21542b("Layer#restoreLayer");
                    C7742c.m21542b("Layer#drawMatte");
                }
                C7742c.m21543a("Layer#restoreLayer");
                canvas.restore();
                C7742c.m21542b("Layer#restoreLayer");
            }
            if (this.f25671z && (paint = this.f39036A) != null) {
                paint.setStyle(Paint.Style.STROKE);
                this.f39036A.setColor(-251901);
                this.f39036A.setStrokeWidth(4.0f);
                canvas.drawRect(this.f25654i, this.f39036A);
                this.f39036A.setStyle(Paint.Style.FILL);
                this.f39036A.setColor(1357638635);
                canvas.drawRect(this.f25654i, this.f39036A);
            }
            m9530G(C7742c.m21542b(this.f25659n));
            return;
        }
        this.f25647b.preConcat(this.f25669x.m15455f());
        C7742c.m21543a("Layer#drawLayer");
        mo9456u(canvas, this.f25647b, i3);
        C7742c.m21542b("Layer#drawLayer");
        m9530G(C7742c.m21542b(this.f25659n));
    }

    @Override // p223m2.AbstractC10475f
    /* renamed from: i */
    public void mo9520i(C10474e eVar, int i, List<C10474e> list, C10474e eVar2) {
        AbstractC11511b bVar = this.f25665t;
        if (bVar != null) {
            C10474e a = eVar2.m13096a(bVar.getName());
            if (eVar.m13094c(this.f25665t.getName(), i)) {
                list.add(a.m13088i(this.f25665t));
            }
            if (eVar.m13089h(getName(), i)) {
                this.f25665t.mo9476I(eVar, eVar.m13092e(this.f25665t.getName(), i) + i, list, a);
            }
        }
        if (eVar.m13090g(getName(), i)) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.m13096a(getName());
                if (eVar.m13094c(getName(), i)) {
                    list.add(eVar2.m13088i(this));
                }
            }
            if (eVar.m13089h(getName(), i)) {
                mo9476I(eVar, i + eVar.m13092e(getName(), i), list, eVar2);
            }
        }
    }

    /* renamed from: j */
    public void m9519j(AbstractC9721a<?, ?> aVar) {
        if (aVar != null) {
            this.f25668w.add(aVar);
        }
    }

    /* renamed from: u */
    abstract void mo9456u(Canvas canvas, Matrix matrix, int i);

    /* renamed from: w */
    public C11168a mo9475w() {
        return this.f25662q.m9501a();
    }

    /* renamed from: x */
    public BlurMaskFilter m9507x(float f) {
        if (this.f39037B == f) {
            return this.f39038C;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.f39038C = blurMaskFilter;
        this.f39037B = f;
        return blurMaskFilter;
    }

    /* renamed from: y */
    public C12340j mo9474y() {
        return this.f25662q.m9499c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public C11516e m9506z() {
        return this.f25662q;
    }
}
