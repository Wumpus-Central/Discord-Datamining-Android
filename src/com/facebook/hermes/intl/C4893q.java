package com.facebook.hermes.intl;

import android.icu.text.CompactDecimalFormat;
import android.icu.text.DecimalFormat;
import android.icu.text.DecimalFormatSymbols;
import android.icu.text.MeasureFormat;
import android.icu.text.NumberFormat;
import android.icu.text.NumberingSystem;
import android.icu.util.Currency;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import android.icu.util.ULocale;
import com.facebook.hermes.intl.AbstractC4861c;
import java.text.AttributedCharacterIterator;
import java.text.Format;
import java.util.ArrayList;
import java.util.Set;
import p129h5.AbstractC7805b;
import p129h5.C7840i;
import p129h5.C7848j;
import p129h5.C7915x;

/* renamed from: com.facebook.hermes.intl.q */
/* loaded from: classes7.dex */
public class C4893q implements AbstractC4861c {

    /* renamed from: a */
    private Format f8098a;

    /* renamed from: b */
    private NumberFormat f8099b;

    /* renamed from: c */
    private C7915x f8100c;

    /* renamed from: d */
    private AbstractC4861c.EnumC4868h f8101d;

    /* renamed from: e */
    private MeasureUnit f8102e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.hermes.intl.q$a */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class C4894a {

        /* renamed from: a */
        static final /* synthetic */ int[] f8103a;

        static {
            int[] iArr = new int[AbstractC4861c.EnumC4867g.values().length];
            f8103a = iArr;
            try {
                iArr[AbstractC4861c.EnumC4867g.NEVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8103a[AbstractC4861c.EnumC4867g.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8103a[AbstractC4861c.EnumC4867g.EXCEPTZERO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: n */
    public static int m31522n(String str) {
        Currency instance;
        int defaultFractionDigits;
        try {
            instance = Currency.getInstance(str);
            defaultFractionDigits = instance.getDefaultFractionDigits();
            return defaultFractionDigits;
        } catch (IllegalArgumentException unused) {
            throw new C7848j("Invalid currency code !");
        }
    }

    /* renamed from: o */
    private void m31521o(NumberFormat numberFormat, AbstractC7805b<?> bVar, AbstractC4861c.EnumC4868h hVar) {
        this.f8099b = numberFormat;
        this.f8098a = numberFormat;
        this.f8100c = (C7915x) bVar;
        this.f8101d = hVar;
        numberFormat.setRoundingMode(4);
    }

    /* renamed from: p */
    private static MeasureUnit m31520p(String str) {
        Set<MeasureUnit> available;
        String subtype;
        String subtype2;
        String type;
        available = MeasureUnit.getAvailable();
        for (MeasureUnit measureUnit : available) {
            subtype = measureUnit.getSubtype();
            if (!subtype.equals(str)) {
                subtype2 = measureUnit.getSubtype();
                StringBuilder sb2 = new StringBuilder();
                type = measureUnit.getType();
                sb2.append(type);
                sb2.append("-");
                sb2.append(str);
                if (subtype2.equals(sb2.toString())) {
                }
            }
            return measureUnit;
        }
        throw new C7848j("Unknown unit: " + str);
    }

    @Override // com.facebook.hermes.intl.AbstractC4861c
    /* renamed from: a */
    public AttributedCharacterIterator mo31535a(double d) {
        ULocale forLanguageTag;
        NumberFormat instance;
        AttributedCharacterIterator formatToCharacterIterator;
        ULocale uLocale;
        NumberFormat instance2;
        AttributedCharacterIterator formatToCharacterIterator2;
        ULocale forLanguageTag2;
        NumberFormat instance3;
        AttributedCharacterIterator formatToCharacterIterator3;
        try {
            try {
                Format format = this.f8098a;
                if (!(format instanceof MeasureFormat) || this.f8102e == null) {
                    return format.formatToCharacterIterator(Double.valueOf(d));
                }
                return format.formatToCharacterIterator(new Measure(Double.valueOf(d), this.f8102e));
            } catch (RuntimeException unused) {
                forLanguageTag = ULocale.forLanguageTag("en");
                instance = NumberFormat.getInstance(forLanguageTag);
                formatToCharacterIterator = instance.formatToCharacterIterator(Double.valueOf(d));
                return formatToCharacterIterator;
            }
        } catch (NumberFormatException unused2) {
            uLocale = ULocale.getDefault();
            instance2 = NumberFormat.getInstance(uLocale);
            formatToCharacterIterator2 = instance2.formatToCharacterIterator(Double.valueOf(d));
            return formatToCharacterIterator2;
        } catch (Exception unused3) {
            forLanguageTag2 = ULocale.forLanguageTag("en");
            instance3 = NumberFormat.getInstance(forLanguageTag2);
            formatToCharacterIterator3 = instance3.formatToCharacterIterator(Double.valueOf(d));
            return formatToCharacterIterator3;
        }
    }

    @Override // com.facebook.hermes.intl.AbstractC4861c
    /* renamed from: b */
    public String mo31534b(AbstractC7805b<?> bVar) {
        NumberingSystem instance;
        String name;
        instance = NumberingSystem.getInstance((ULocale) bVar.mo21162h());
        name = instance.getName();
        return name;
    }

    @Override // com.facebook.hermes.intl.AbstractC4861c
    /* renamed from: c */
    public String mo31533c(double d) {
        ULocale forLanguageTag;
        NumberFormat instance;
        String format;
        ULocale uLocale;
        NumberFormat instance2;
        String format2;
        try {
            try {
                Format format3 = this.f8098a;
                if (!(format3 instanceof MeasureFormat) || this.f8102e == null) {
                    return format3.format(Double.valueOf(d));
                }
                return format3.format(new Measure(Double.valueOf(d), this.f8102e));
            } catch (NumberFormatException unused) {
                uLocale = ULocale.getDefault();
                instance2 = NumberFormat.getInstance(uLocale);
                format2 = instance2.format(d);
                return format2;
            }
        } catch (RuntimeException unused2) {
            forLanguageTag = ULocale.forLanguageTag("en");
            instance = NumberFormat.getInstance(forLanguageTag);
            format = instance.format(d);
            return format;
        }
    }

    @Override // com.facebook.hermes.intl.AbstractC4861c
    /* renamed from: l */
    public String mo31524l(AttributedCharacterIterator.Attribute attribute, double d) {
        NumberFormat.Field field;
        NumberFormat.Field field2;
        NumberFormat.Field field3;
        NumberFormat.Field field4;
        NumberFormat.Field field5;
        NumberFormat.Field field6;
        NumberFormat.Field field7;
        NumberFormat.Field field8;
        NumberFormat.Field field9;
        NumberFormat.Field field10;
        NumberFormat.Field field11;
        field = NumberFormat.Field.SIGN;
        if (attribute != field) {
            field2 = NumberFormat.Field.INTEGER;
            if (attribute != field2) {
                field3 = NumberFormat.Field.FRACTION;
                if (attribute == field3) {
                    return "fraction";
                }
                field4 = NumberFormat.Field.EXPONENT;
                if (attribute == field4) {
                    return "exponentInteger";
                }
                field5 = NumberFormat.Field.EXPONENT_SIGN;
                if (attribute == field5) {
                    return "exponentMinusSign";
                }
                field6 = NumberFormat.Field.EXPONENT_SYMBOL;
                if (attribute == field6) {
                    return "exponentSeparator";
                }
                field7 = NumberFormat.Field.DECIMAL_SEPARATOR;
                if (attribute == field7) {
                    return "decimal";
                }
                field8 = NumberFormat.Field.GROUPING_SEPARATOR;
                if (attribute == field8) {
                    return "group";
                }
                field9 = NumberFormat.Field.PERCENT;
                if (attribute == field9) {
                    return "percentSign";
                }
                field10 = NumberFormat.Field.PERMILLE;
                if (attribute == field10) {
                    return "permilleSign";
                }
                field11 = NumberFormat.Field.CURRENCY;
                if (attribute == field11) {
                    return "currency";
                }
                if (attribute.toString().equals("android.icu.text.NumberFormat$Field(compact)")) {
                    return "compact";
                }
                return "literal";
            } else if (Double.isNaN(d)) {
                return "nan";
            } else {
                if (Double.isInfinite(d)) {
                    return "infinity";
                }
                return "integer";
            }
        } else if (Double.compare(d, 0.0d) >= 0) {
            return "plusSign";
        } else {
            return "minusSign";
        }
    }

    /* renamed from: m */
    public C4893q mo31526j(AbstractC7805b<?> bVar, String str, AbstractC4861c.EnumC4868h hVar, AbstractC4861c.EnumC4864d dVar, AbstractC4861c.EnumC4865e eVar, AbstractC4861c.EnumC4863b bVar2) {
        NumberingSystem instanceByName;
        NumberFormat instance;
        CompactDecimalFormat.CompactStyle compactStyle;
        CompactDecimalFormat instance2;
        if (!str.isEmpty()) {
            try {
                instanceByName = NumberingSystem.getInstanceByName(C7840i.m21251h(str));
                if (instanceByName != null) {
                    ArrayList<String> arrayList = new ArrayList<>();
                    arrayList.add(C7840i.m21251h(str));
                    bVar.mo21164f("nu", arrayList);
                } else {
                    throw new C7848j("Invalid numbering system: " + str);
                }
            } catch (RuntimeException unused) {
                throw new C7848j("Invalid numbering system: " + str);
            }
        }
        if (eVar == AbstractC4861c.EnumC4865e.COMPACT && (hVar == AbstractC4861c.EnumC4868h.DECIMAL || hVar == AbstractC4861c.EnumC4868h.UNIT)) {
            if (bVar2 == AbstractC4861c.EnumC4863b.SHORT) {
                compactStyle = CompactDecimalFormat.CompactStyle.SHORT;
            } else {
                compactStyle = CompactDecimalFormat.CompactStyle.LONG;
            }
            instance2 = CompactDecimalFormat.getInstance((ULocale) bVar.mo21162h(), compactStyle);
            m31521o(instance2, bVar, hVar);
        } else {
            instance = NumberFormat.getInstance((ULocale) bVar.mo21162h(), hVar.m31617a(eVar, dVar));
            if (eVar == AbstractC4861c.EnumC4865e.ENGINEERING) {
                instance.setMaximumIntegerDigits(3);
            }
            m31521o(instance, bVar, hVar);
        }
        return this;
    }

    /* renamed from: q */
    public C4893q mo31532d(String str, AbstractC4861c.EnumC0117c cVar) {
        Currency instance;
        DecimalFormatSymbols decimalFormatSymbols;
        if (this.f8101d == AbstractC4861c.EnumC4868h.CURRENCY) {
            instance = Currency.getInstance(str);
            this.f8099b.setCurrency(instance);
            if (cVar != AbstractC4861c.EnumC0117c.CODE) {
                str = instance.getName(this.f8100c.mo21162h(), cVar.m31618a(), (boolean[]) null);
            }
            NumberFormat numberFormat = this.f8099b;
            if (numberFormat instanceof DecimalFormat) {
                DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
                decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
                decimalFormatSymbols.setCurrencySymbol(str);
                decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
            }
        }
        return this;
    }

    /* renamed from: r */
    public C4893q mo31528h(AbstractC4861c.EnumC4866f fVar, int i, int i2) {
        if (fVar == AbstractC4861c.EnumC4866f.FRACTION_DIGITS) {
            if (i >= 0) {
                this.f8099b.setMinimumFractionDigits(i);
            }
            if (i2 >= 0) {
                this.f8099b.setMaximumFractionDigits(i2);
            }
            NumberFormat numberFormat = this.f8099b;
            if (numberFormat instanceof DecimalFormat) {
                ((DecimalFormat) numberFormat).setSignificantDigitsUsed(false);
            }
        }
        return this;
    }

    /* renamed from: s */
    public C4893q mo31529g(boolean z) {
        this.f8099b.setGroupingUsed(z);
        return this;
    }

    /* renamed from: t */
    public C4893q mo31530f(int i) {
        if (i != -1) {
            this.f8099b.setMinimumIntegerDigits(i);
        }
        return this;
    }

    /* renamed from: u */
    public C4893q mo31525k(AbstractC4861c.EnumC4867g gVar) {
        DecimalFormatSymbols decimalFormatSymbols;
        String negativePrefix;
        String negativeSuffix;
        char plusSign;
        char plusSign2;
        NumberFormat numberFormat = this.f8099b;
        if (numberFormat instanceof DecimalFormat) {
            DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
            decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
            int i = C4894a.f8103a[gVar.ordinal()];
            if (i == 1) {
                decimalFormat.setPositivePrefix("");
                decimalFormat.setPositiveSuffix("");
                decimalFormat.setNegativePrefix("");
                decimalFormat.setNegativeSuffix("");
            } else if (i == 2 || i == 3) {
                negativePrefix = decimalFormat.getNegativePrefix();
                if (!negativePrefix.isEmpty()) {
                    plusSign2 = decimalFormatSymbols.getPlusSign();
                    decimalFormat.setPositivePrefix(new String(new char[]{plusSign2}));
                }
                negativeSuffix = decimalFormat.getNegativeSuffix();
                if (!negativeSuffix.isEmpty()) {
                    plusSign = decimalFormatSymbols.getPlusSign();
                    decimalFormat.setPositiveSuffix(new String(new char[]{plusSign}));
                }
            }
        }
        return this;
    }

    /* renamed from: v */
    public C4893q mo31531e(AbstractC4861c.EnumC4866f fVar, int i, int i2) {
        int minimumSignificantDigits;
        NumberFormat numberFormat = this.f8099b;
        if ((numberFormat instanceof DecimalFormat) && fVar == AbstractC4861c.EnumC4866f.SIGNIFICANT_DIGITS) {
            DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
            if (i >= 0) {
                decimalFormat.setMinimumSignificantDigits(i);
            }
            if (i2 >= 0) {
                minimumSignificantDigits = decimalFormat.getMinimumSignificantDigits();
                if (i2 >= minimumSignificantDigits) {
                    decimalFormat.setMaximumSignificantDigits(i2);
                } else {
                    throw new C7848j("maximumSignificantDigits should be at least equal to minimumSignificantDigits");
                }
            }
            decimalFormat.setSignificantDigitsUsed(true);
        }
        return this;
    }

    /* renamed from: w */
    public C4893q mo31527i(String str, AbstractC4861c.EnumC4869i iVar) {
        MeasureFormat instance;
        if (this.f8101d == AbstractC4861c.EnumC4868h.UNIT) {
            this.f8102e = m31520p(str);
            instance = MeasureFormat.getInstance(this.f8100c.mo21162h(), iVar.m31616a(), this.f8099b);
            this.f8098a = instance;
        }
        return this;
    }
}
