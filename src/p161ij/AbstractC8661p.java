package p161ij;

import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import net.time4j.base.AbstractC10814d;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: ij.p */
/* loaded from: classes8.dex */
public abstract class AbstractC8661p {

    /* renamed from: a */
    private static final AbstractC8661p f19141a;

    /* renamed from: b */
    private static final AbstractC8661p f19142b;

    /* renamed from: c */
    private static final AbstractC8661p f19143c;

    /* renamed from: d */
    private static final AbstractC8661p f19144d;

    /* renamed from: e */
    private static final Map<String, AbstractC8661p> f19145e = new ConcurrentHashMap();

    /* renamed from: f */
    private static final Map<String, AbstractC8661p> f19146f = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ij.p$a */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C8662a {

        /* renamed from: a */
        static final /* synthetic */ int[] f19147a;

        static {
            int[] iArr = new int[EnumC8656k.values().length];
            f19147a = iArr;
            try {
                iArr[EnumC8656k.CARDINALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19147a[EnumC8656k.ORDINALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: ij.p$b */
    /* loaded from: classes8.dex */
    private static class C8663b implements AbstractC8660o {
        private C8663b() {
        }

        /* synthetic */ C8663b(C8662a aVar) {
            this();
        }

        @Override // p161ij.AbstractC8660o
        /* renamed from: a */
        public AbstractC8661p mo10719a(Locale locale, EnumC8656k kVar) {
            boolean equals = locale.getLanguage().equals("en");
            int i = C8662a.f19147a[kVar.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new UnsupportedOperationException(kVar.name());
                } else if (equals) {
                    return AbstractC8661p.f19143c;
                } else {
                    return AbstractC8661p.f19144d;
                }
            } else if (equals) {
                return AbstractC8661p.f19141a;
            } else {
                return AbstractC8661p.f19142b;
            }
        }
    }

    /* renamed from: ij.p$c */
    /* loaded from: classes8.dex */
    private static class C8664c extends AbstractC8661p {

        /* renamed from: g */
        private final EnumC8656k f19148g;

        /* renamed from: h */
        private final boolean f19149h;

        /* synthetic */ C8664c(EnumC8656k kVar, boolean z, C8662a aVar) {
            this(kVar, z);
        }

        private C8664c(EnumC8656k kVar, boolean z) {
            this.f19148g = kVar;
            this.f19149h = z;
        }
    }

    /* renamed from: ij.p$d */
    /* loaded from: classes8.dex */
    private static class C8665d {

        /* renamed from: a */
        private static final AbstractC8660o f19150a;

        static {
            AbstractC8660o oVar;
            Iterator it = AbstractC10814d.m12187c().mo12183g(AbstractC8660o.class).iterator();
            if (it.hasNext()) {
                oVar = (AbstractC8660o) it.next();
            } else {
                oVar = null;
            }
            if (oVar == null) {
                oVar = new C8663b(null);
            }
            f19150a = oVar;
        }
    }

    static {
        EnumC8656k kVar = EnumC8656k.CARDINALS;
        f19141a = new C8664c(kVar, true, null);
        f19142b = new C8664c(kVar, false, null);
        EnumC8656k kVar2 = EnumC8656k.ORDINALS;
        f19143c = new C8664c(kVar2, true, null);
        f19144d = new C8664c(kVar2, false, null);
    }

    /* renamed from: e */
    private static Map<String, AbstractC8661p> m18419e(EnumC8656k kVar) {
        int i = C8662a.f19147a[kVar.ordinal()];
        if (i == 1) {
            return f19145e;
        }
        if (i == 2) {
            return f19146f;
        }
        throw new UnsupportedOperationException(kVar.name());
    }

    /* renamed from: f */
    public static AbstractC8661p m18418f(Locale locale, EnumC8656k kVar) {
        Map<String, AbstractC8661p> e = m18419e(kVar);
        AbstractC8661p pVar = null;
        if (!e.isEmpty()) {
            if (!locale.getCountry().equals("")) {
                pVar = e.get(m18417g(locale));
            }
            if (pVar == null) {
                pVar = e.get(locale.getLanguage());
            }
        }
        if (pVar == null) {
            return C8665d.f19150a.mo10719a(locale, kVar);
        }
        return pVar;
    }

    /* renamed from: g */
    private static String m18417g(Locale locale) {
        return locale.getLanguage() + '_' + locale.getCountry();
    }
}
