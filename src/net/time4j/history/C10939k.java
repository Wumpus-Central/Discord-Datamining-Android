package net.time4j.history;

import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.C10892f0;
import p143hj.AbstractC8046c;
import p143hj.AbstractC8048d;
import p143hj.AbstractC8050e;
import p143hj.AbstractC8077o;
import p143hj.AbstractC8079p;
import p143hj.AbstractC8080q;
import p143hj.AbstractC8091z;
import p143hj.C8081r;
import p143hj.C8087x;
import p161ij.AbstractC8634d;
import p161ij.AbstractC8669t;
import p161ij.C8627a;
import p161ij.C8629b;
import p161ij.C8668s;
import p161ij.EnumC8671v;
import p234mj.C10668a;

/* renamed from: net.time4j.history.k */
/* loaded from: classes8.dex */
final class C10939k extends AbstractC8634d<EnumC10937j> implements AbstractC8669t<EnumC10937j> {

    /* renamed from: l */
    private static final Locale f24296l = new Locale("la");
    private static final long serialVersionUID = 5200533417265981438L;
    private final C10929d history;

    /* renamed from: net.time4j.history.k$a */
    /* loaded from: classes8.dex */
    private static class C10940a<C extends AbstractC8080q<C>> implements AbstractC8091z<C, EnumC10937j> {

        /* renamed from: k */
        private final C10929d f24297k;

        C10940a(C10929d dVar) {
            this.f24297k = dVar;
        }

        /* renamed from: a */
        public AbstractC8079p<?> mo11086b(C c) {
            throw new UnsupportedOperationException("Never called.");
        }

        /* renamed from: e */
        public AbstractC8079p<?> mo11085c(C c) {
            throw new UnsupportedOperationException("Never called.");
        }

        /* renamed from: f */
        public EnumC10937j mo11084d(C c) {
            EnumC10937j j = mo11076n(c);
            if (j == EnumC10937j.BC) {
                return EnumC10937j.AD;
            }
            return j;
        }

        /* renamed from: i */
        public EnumC10937j mo11078k(C c) {
            EnumC10937j j = mo11076n(c);
            if (j == EnumC10937j.AD) {
                return EnumC10937j.BC;
            }
            return j;
        }

        /* renamed from: j */
        public EnumC10937j mo11076n(C c) {
            try {
                return this.f24297k.m11577e((C10892f0) c.mo11371r(C10892f0.f24173y)).m11544c();
            } catch (IllegalArgumentException e) {
                throw new C8081r(e.getMessage(), e);
            }
        }

        /* renamed from: o */
        public boolean mo11081h(C c, EnumC10937j jVar) {
            if (jVar == null) {
                return false;
            }
            try {
                if (this.f24297k.m11577e((C10892f0) c.mo11371r(C10892f0.f24173y)).m11544c() == jVar) {
                    return true;
                }
                return false;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }

        /* renamed from: p */
        public C mo11077m(C c, EnumC10937j jVar, boolean z) {
            if (jVar == null) {
                throw new IllegalArgumentException("Missing era value.");
            } else if (this.f24297k.m11577e((C10892f0) c.mo11371r(C10892f0.f24173y)).m11544c() == jVar) {
                return c;
            } else {
                throw new IllegalArgumentException(jVar.name());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10939k(C10929d dVar) {
        super("ERA");
        this.history = dVar;
    }

    /* renamed from: A */
    private C8668s m11526A(AbstractC8048d dVar) {
        AbstractC8046c<EnumC8671v> cVar = C8627a.f19058g;
        EnumC8671v vVar = EnumC8671v.WIDE;
        EnumC8671v vVar2 = (EnumC8671v) dVar.mo15674c(cVar, vVar);
        AbstractC8046c<Boolean> cVar2 = C10668a.f23596c;
        Boolean bool = Boolean.FALSE;
        String str = "w";
        if (((Boolean) dVar.mo15674c(cVar2, bool)).booleanValue()) {
            C8629b c = C8629b.m18469c("historic", f24296l);
            String[] strArr = new String[1];
            if (vVar2 != vVar) {
                str = "a";
            }
            strArr[0] = str;
            return c.m18459m(this, strArr);
        }
        C8629b d = C8629b.m18468d((Locale) dVar.mo15674c(C8627a.f19054c, Locale.ROOT));
        if (!((Boolean) dVar.mo15674c(C10668a.f23595b, bool)).booleanValue()) {
            return d.m18470b(vVar2);
        }
        String[] strArr2 = new String[2];
        if (vVar2 != vVar) {
            str = "a";
        }
        strArr2[0] = str;
        strArr2[1] = "alt";
        return d.m18459m(this, strArr2);
    }

    private Object readResolve() {
        return this.history.m11573i();
    }

    /* renamed from: D */
    public EnumC10937j mo11059f() {
        return EnumC10937j.AD;
    }

    /* renamed from: E */
    public EnumC10937j mo11062T() {
        return EnumC10937j.BC;
    }

    /* renamed from: F */
    public EnumC10937j mo11054u(CharSequence charSequence, ParsePosition parsePosition, AbstractC8048d dVar) {
        return (EnumC10937j) m11526A(dVar).m18412c(charSequence, parsePosition, getType(), dVar);
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
    public Class<EnumC10937j> getType() {
        return EnumC10937j.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p143hj.AbstractC8050e
    /* renamed from: q */
    public <T extends AbstractC8080q<T>> AbstractC8091z<T, EnumC10937j> mo11057q(C8087x<T> xVar) {
        if (xVar.m20657A(C10892f0.f24173y)) {
            return new C10940a(this.history);
        }
        return null;
    }

    @Override // p143hj.AbstractC8050e
    /* renamed from: s */
    protected boolean mo11055s(AbstractC8050e<?> eVar) {
        return this.history.equals(((C10939k) eVar).history);
    }

    @Override // p161ij.AbstractC8669t
    /* renamed from: z */
    public void mo11052z(AbstractC8077o oVar, Appendable appendable, AbstractC8048d dVar) {
        appendable.append(m11526A(dVar).m18409f((Enum) oVar.mo11371r(this)));
    }
}
