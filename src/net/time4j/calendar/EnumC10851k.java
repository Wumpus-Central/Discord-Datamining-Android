package net.time4j.calendar;

import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.AbstractC10880e;
import net.time4j.C10892f0;
import net.time4j.EnumC10882f;
import p143hj.AbstractC8048d;
import p143hj.AbstractC8064i;
import p143hj.AbstractC8077o;
import p143hj.AbstractC8079p;
import p143hj.AbstractC8080q;
import p143hj.AbstractC8091z;
import p143hj.C8087x;
import p161ij.AbstractC8634d;
import p161ij.AbstractC8669t;
import p161ij.C8627a;
import p161ij.C8629b;
import p161ij.EnumC8671v;

/* renamed from: net.time4j.calendar.k */
/* loaded from: classes8.dex */
public enum EnumC10851k implements AbstractC8064i {
    DANGI;
    

    /* renamed from: k */
    private final transient AbstractC8079p<EnumC10851k> f24060k = new C10853b();

    /* renamed from: l */
    private final transient AbstractC8079p<Integer> f24061l = new C10856e();

    /* renamed from: net.time4j.calendar.k$b */
    /* loaded from: classes8.dex */
    private static class C10853b extends AbstractC8634d<EnumC10851k> implements AbstractC8669t<EnumC10851k> {
        private static final long serialVersionUID = -5179188137244162427L;

        private Object readResolve() {
            return EnumC10851k.DANGI.m12012a();
        }

        /* renamed from: A */
        public EnumC10851k mo11059f() {
            return EnumC10851k.DANGI;
        }

        /* renamed from: D */
        public EnumC10851k mo11062T() {
            return EnumC10851k.DANGI;
        }

        /* renamed from: E */
        public EnumC10851k mo11054u(CharSequence charSequence, ParsePosition parsePosition, AbstractC8048d dVar) {
            Locale locale = (Locale) dVar.mo15674c(C8627a.f19054c, Locale.ROOT);
            boolean booleanValue = ((Boolean) dVar.mo15674c(C8627a.f19060i, Boolean.TRUE)).booleanValue();
            boolean booleanValue2 = ((Boolean) dVar.mo15674c(C8627a.f19061j, Boolean.FALSE)).booleanValue();
            int index = parsePosition.getIndex();
            EnumC10851k kVar = EnumC10851k.DANGI;
            String b = kVar.m12011b(locale, (EnumC8671v) dVar.mo15674c(C8627a.f19058g, EnumC8671v.WIDE));
            int max = Math.max(Math.min(b.length() + index, charSequence.length()), index);
            if (max > index) {
                String charSequence2 = charSequence.subSequence(index, max).toString();
                if (booleanValue) {
                    b = b.toLowerCase(locale);
                    charSequence2 = charSequence2.toLowerCase(locale);
                }
                if (b.equals(charSequence2) || (booleanValue2 && b.startsWith(charSequence2))) {
                    parsePosition.setIndex(max);
                    return kVar;
                }
            }
            parsePosition.setErrorIndex(index);
            return null;
        }

        @Override // p143hj.AbstractC8079p
        /* renamed from: M */
        public boolean mo11063M() {
            return true;
        }

        @Override // p143hj.AbstractC8079p
        /* renamed from: U */
        public boolean mo11061U() {
            return false;
        }

        @Override // p143hj.AbstractC8050e, p143hj.AbstractC8079p
        /* renamed from: a */
        public char mo11060a() {
            return 'G';
        }

        @Override // p143hj.AbstractC8079p
        public Class<EnumC10851k> getType() {
            return EnumC10851k.class;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p143hj.AbstractC8050e
        /* renamed from: q */
        public <T extends AbstractC8080q<T>> AbstractC8091z<T, EnumC10851k> mo11057q(C8087x<T> xVar) {
            if (xVar.m20657A(C10892f0.f24173y)) {
                return new C10854c();
            }
            return null;
        }

        @Override // p143hj.AbstractC8050e
        /* renamed from: y */
        protected boolean mo11143y() {
            return true;
        }

        @Override // p161ij.AbstractC8669t
        /* renamed from: z */
        public void mo11052z(AbstractC8077o oVar, Appendable appendable, AbstractC8048d dVar) {
            appendable.append(EnumC10851k.DANGI.m12011b((Locale) dVar.mo15674c(C8627a.f19054c, Locale.ROOT), (EnumC8671v) dVar.mo15674c(C8627a.f19058g, EnumC8671v.WIDE)));
        }

        private C10853b() {
            super("ERA");
        }
    }

    /* renamed from: net.time4j.calendar.k$c */
    /* loaded from: classes8.dex */
    private static class C10854c implements AbstractC8091z<AbstractC8080q<?>, EnumC10851k> {
        private C10854c() {
        }

        /* renamed from: a */
        public AbstractC8079p<?> mo11086b(AbstractC8080q<?> qVar) {
            throw new AbstractMethodError("Never called.");
        }

        /* renamed from: e */
        public AbstractC8079p<?> mo11085c(AbstractC8080q<?> qVar) {
            throw new AbstractMethodError("Never called.");
        }

        /* renamed from: f */
        public EnumC10851k mo11084d(AbstractC8080q<?> qVar) {
            return EnumC10851k.DANGI;
        }

        /* renamed from: i */
        public EnumC10851k mo11078k(AbstractC8080q<?> qVar) {
            return EnumC10851k.DANGI;
        }

        /* renamed from: j */
        public EnumC10851k mo11076n(AbstractC8080q<?> qVar) {
            return EnumC10851k.DANGI;
        }

        /* renamed from: o */
        public boolean mo11081h(AbstractC8080q<?> qVar, EnumC10851k kVar) {
            return kVar == EnumC10851k.DANGI;
        }

        /* renamed from: p */
        public AbstractC8080q<?> mo11077m(AbstractC8080q<?> qVar, EnumC10851k kVar, boolean z) {
            if (mo11081h(qVar, kVar)) {
                return qVar;
            }
            throw new IllegalArgumentException("Invalid Korean era: " + kVar);
        }
    }

    /* renamed from: net.time4j.calendar.k$d */
    /* loaded from: classes8.dex */
    private static class C10855d implements AbstractC8091z<AbstractC8080q<?>, Integer> {
        private C10855d() {
        }

        /* renamed from: f */
        private int m11997f(AbstractC8080q<?> qVar) {
            return ((C10892f0) qVar.mo11371r(C10892f0.f24173y)).mo11643m() + 2333;
        }

        /* renamed from: a */
        public AbstractC8079p<?> mo11086b(AbstractC8080q<?> qVar) {
            throw new AbstractMethodError("Never called.");
        }

        /* renamed from: e */
        public AbstractC8079p<?> mo11085c(AbstractC8080q<?> qVar) {
            throw new AbstractMethodError("Never called.");
        }

        /* renamed from: i */
        public Integer mo11084d(AbstractC8080q<?> qVar) {
            return 1000002332;
        }

        /* renamed from: j */
        public Integer mo11078k(AbstractC8080q<?> qVar) {
            return -999997666;
        }

        /* renamed from: o */
        public Integer mo11076n(AbstractC8080q<?> qVar) {
            return Integer.valueOf(m11997f(qVar));
        }

        /* renamed from: p */
        public boolean mo11081h(AbstractC8080q<?> qVar, Integer num) {
            if (num == null) {
                return false;
            }
            int intValue = mo11078k(qVar).intValue();
            int intValue2 = mo11084d(qVar).intValue();
            if (num.intValue() < intValue || num.intValue() > intValue2) {
                return false;
            }
            return true;
        }

        /* renamed from: q */
        public AbstractC8080q<?> mo11077m(AbstractC8080q<?> qVar, Integer num, boolean z) {
            if (num == null) {
                throw new IllegalArgumentException("Missing year of era.");
            } else if (mo11081h(qVar, num)) {
                int f = m11997f(qVar);
                AbstractC10880e eVar = C10892f0.f24173y;
                return qVar.mo15654D(eVar, (C10892f0) ((C10892f0) qVar.mo11371r(eVar)).m20683K(num.intValue() - f, EnumC10882f.f24151n));
            } else {
                throw new IllegalArgumentException("Invalid year of era: " + num);
            }
        }
    }

    /* renamed from: net.time4j.calendar.k$e */
    /* loaded from: classes8.dex */
    private static class C10856e extends AbstractC8634d<Integer> {
        private static final long serialVersionUID = -7864513245908399367L;

        private Object readResolve() {
            return EnumC10851k.DANGI.m12010c();
        }

        /* renamed from: A */
        public Integer mo11059f() {
            return 5332;
        }

        /* renamed from: D */
        public Integer mo11062T() {
            return 3978;
        }

        @Override // p143hj.AbstractC8079p
        /* renamed from: M */
        public boolean mo11063M() {
            return true;
        }

        @Override // p143hj.AbstractC8079p
        /* renamed from: U */
        public boolean mo11061U() {
            return false;
        }

        @Override // p143hj.AbstractC8050e, p143hj.AbstractC8079p
        /* renamed from: a */
        public char mo11060a() {
            return 'y';
        }

        @Override // p143hj.AbstractC8079p
        public Class<Integer> getType() {
            return Integer.class;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p143hj.AbstractC8050e
        /* renamed from: q */
        public <T extends AbstractC8080q<T>> AbstractC8091z<T, Integer> mo11057q(C8087x<T> xVar) {
            if (xVar.m20657A(C10892f0.f24173y)) {
                return new C10855d();
            }
            return null;
        }

        @Override // p143hj.AbstractC8050e
        /* renamed from: y */
        protected boolean mo11143y() {
            return true;
        }

        private C10856e() {
            super("YEAR_OF_ERA");
        }
    }

    EnumC10851k() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public AbstractC8079p<EnumC10851k> m12012a() {
        return this.f24060k;
    }

    /* renamed from: b */
    public String m12011b(Locale locale, EnumC8671v vVar) {
        return C8629b.m18469c("dangi", locale).m18470b(vVar).m18409f(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public AbstractC8079p<Integer> m12010c() {
        return this.f24061l;
    }
}
