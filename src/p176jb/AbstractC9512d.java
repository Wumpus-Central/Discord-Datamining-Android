package p176jb;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import p299qb.C12102a;

/* renamed from: jb.d */
/* loaded from: classes3.dex */
public interface AbstractC9512d {

    /* renamed from: jb.d$b */
    /* loaded from: classes3.dex */
    public static class C9514b implements TypeEvaluator<C9516e> {

        /* renamed from: b */
        public static final TypeEvaluator<C9516e> f21097b = new C9514b();

        /* renamed from: a */
        private final C9516e f21098a = new C9516e();

        /* renamed from: a */
        public C9516e evaluate(float f, C9516e eVar, C9516e eVar2) {
            this.f21098a.m16105a(C12102a.m7836c(eVar.f21101a, eVar2.f21101a, f), C12102a.m7836c(eVar.f21102b, eVar2.f21102b, f), C12102a.m7836c(eVar.f21103c, eVar2.f21103c, f));
            return this.f21098a;
        }
    }

    /* renamed from: jb.d$c */
    /* loaded from: classes3.dex */
    public static class C9515c extends Property<AbstractC9512d, C9516e> {

        /* renamed from: a */
        public static final Property<AbstractC9512d, C9516e> f21099a = new C9515c("circularReveal");

        private C9515c(String str) {
            super(C9516e.class, str);
        }

        /* renamed from: a */
        public C9516e get(AbstractC9512d dVar) {
            return dVar.getRevealInfo();
        }

        /* renamed from: b */
        public void set(AbstractC9512d dVar, C9516e eVar) {
            dVar.setRevealInfo(eVar);
        }
    }

    /* renamed from: jb.d$d */
    /* loaded from: classes3.dex */
    public static class C0287d extends Property<AbstractC9512d, Integer> {

        /* renamed from: a */
        public static final Property<AbstractC9512d, Integer> f21100a = new C0287d("circularRevealScrimColor");

        private C0287d(String str) {
            super(Integer.class, str);
        }

        /* renamed from: a */
        public Integer get(AbstractC9512d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        /* renamed from: b */
        public void set(AbstractC9512d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* renamed from: jb.d$e */
    /* loaded from: classes3.dex */
    public static class C9516e {

        /* renamed from: a */
        public float f21101a;

        /* renamed from: b */
        public float f21102b;

        /* renamed from: c */
        public float f21103c;

        private C9516e() {
        }

        /* renamed from: a */
        public void m16105a(float f, float f2, float f3) {
            this.f21101a = f;
            this.f21102b = f2;
            this.f21103c = f3;
        }

        public C9516e(float f, float f2, float f3) {
            this.f21101a = f;
            this.f21102b = f2;
            this.f21103c = f3;
        }
    }

    /* renamed from: a */
    void mo15204a();

    /* renamed from: b */
    void mo15203b();

    int getCircularRevealScrimColor();

    C9516e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(C9516e eVar);
}
