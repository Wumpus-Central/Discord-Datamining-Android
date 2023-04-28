package com.facebook.hermes.intl;

import com.facebook.hermes.intl.AbstractC4861c;
import java.math.RoundingMode;
import java.text.AttributedCharacterIterator;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import p129h5.AbstractC7805b;
import p129h5.C7848j;

/* renamed from: com.facebook.hermes.intl.p */
/* loaded from: classes7.dex */
public class C4891p implements AbstractC4861c {

    /* renamed from: a */
    private Format f8093a;

    /* renamed from: b */
    private DecimalFormat f8094b;

    /* renamed from: c */
    private C4877h f8095c;

    /* renamed from: d */
    private AbstractC4861c.EnumC4868h f8096d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.hermes.intl.p$a */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class C4892a {

        /* renamed from: a */
        static final /* synthetic */ int[] f8097a;

        static {
            int[] iArr = new int[AbstractC4861c.EnumC0117c.values().length];
            f8097a = iArr;
            try {
                iArr[AbstractC4861c.EnumC0117c.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8097a[AbstractC4861c.EnumC0117c.CODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8097a[AbstractC4861c.EnumC0117c.SYMBOL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8097a[AbstractC4861c.EnumC0117c.NARROWSYMBOL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: n */
    public static int m31544n(String str) {
        try {
            return Currency.getInstance(str).getDefaultFractionDigits();
        } catch (IllegalArgumentException unused) {
            throw new C7848j("Invalid currency code !");
        }
    }

    /* renamed from: o */
    private void m31543o(DecimalFormat decimalFormat, AbstractC7805b<?> bVar, AbstractC4861c.EnumC4868h hVar) {
        this.f8094b = decimalFormat;
        this.f8093a = decimalFormat;
        this.f8095c = (C4877h) bVar;
        this.f8096d = hVar;
    }

    @Override // com.facebook.hermes.intl.AbstractC4861c
    /* renamed from: a */
    public AttributedCharacterIterator mo31535a(double d) {
        return this.f8093a.formatToCharacterIterator(Double.valueOf(d));
    }

    @Override // com.facebook.hermes.intl.AbstractC4861c
    /* renamed from: b */
    public String mo31534b(AbstractC7805b<?> bVar) {
        return "latn";
    }

    @Override // com.facebook.hermes.intl.AbstractC4861c
    /* renamed from: c */
    public String mo31533c(double d) {
        return this.f8093a.format(Double.valueOf(d));
    }

    @Override // com.facebook.hermes.intl.AbstractC4861c
    /* renamed from: l */
    public String mo31524l(AttributedCharacterIterator.Attribute attribute, double d) {
        return "literal";
    }

    /* renamed from: m */
    public C4891p mo31526j(AbstractC7805b<?> bVar, String str, AbstractC4861c.EnumC4868h hVar, AbstractC4861c.EnumC4864d dVar, AbstractC4861c.EnumC4865e eVar, AbstractC4861c.EnumC4863b bVar2) {
        NumberFormat instance = NumberFormat.getInstance((Locale) bVar.mo21162h());
        instance.setRoundingMode(RoundingMode.HALF_UP);
        m31543o((DecimalFormat) instance, bVar, hVar);
        return this;
    }

    /* renamed from: p */
    public C4891p mo31532d(String str, AbstractC4861c.EnumC0117c cVar) {
        if (this.f8096d == AbstractC4861c.EnumC4868h.CURRENCY) {
            Currency instance = Currency.getInstance(str);
            this.f8094b.setCurrency(instance);
            int i = C4892a.f8097a[cVar.ordinal()];
            if (i == 1) {
                str = instance.getDisplayName(this.f8095c.mo21162h());
            } else if (i != 2) {
                str = instance.getSymbol(this.f8095c.mo21162h());
            }
            DecimalFormatSymbols decimalFormatSymbols = this.f8094b.getDecimalFormatSymbols();
            decimalFormatSymbols.setCurrencySymbol(str);
            this.f8094b.setDecimalFormatSymbols(decimalFormatSymbols);
            this.f8094b.getDecimalFormatSymbols().setCurrencySymbol(str);
        }
        return this;
    }

    /* renamed from: q */
    public C4891p mo31528h(AbstractC4861c.EnumC4866f fVar, int i, int i2) {
        if (fVar == AbstractC4861c.EnumC4866f.FRACTION_DIGITS) {
            if (i >= 0) {
                this.f8094b.setMinimumFractionDigits(i);
            }
            if (i2 >= 0) {
                this.f8094b.setMaximumFractionDigits(i2);
            }
        }
        return this;
    }

    /* renamed from: r */
    public C4891p mo31529g(boolean z) {
        this.f8094b.setGroupingUsed(z);
        return this;
    }

    /* renamed from: s */
    public C4891p mo31530f(int i) {
        if (i != -1) {
            this.f8094b.setMinimumIntegerDigits(i);
        }
        return this;
    }

    /* renamed from: t */
    public C4891p mo31525k(AbstractC4861c.EnumC4867g gVar) {
        if (gVar == AbstractC4861c.EnumC4867g.NEVER) {
            this.f8094b.setPositivePrefix("");
            this.f8094b.setPositiveSuffix("");
            this.f8094b.setNegativePrefix("");
            this.f8094b.setNegativeSuffix("");
        }
        return this;
    }

    /* renamed from: u */
    public C4891p mo31531e(AbstractC4861c.EnumC4866f fVar, int i, int i2) {
        return this;
    }

    /* renamed from: v */
    public C4891p mo31527i(String str, AbstractC4861c.EnumC4869i iVar) {
        return this;
    }
}
