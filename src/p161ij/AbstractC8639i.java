package p161ij;

import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* renamed from: ij.i */
/* loaded from: classes8.dex */
public interface AbstractC8639i {

    /* renamed from: a */
    public static final AbstractC8639i f19111a = new C8640a();

    /* renamed from: ij.i$a */
    /* loaded from: classes8.dex */
    static class C8640a implements AbstractC8639i {
        C8640a() {
        }

        /* renamed from: g */
        private DecimalFormatSymbols m18440g(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }

        @Override // p161ij.AbstractC8639i
        /* renamed from: a */
        public Locale[] mo10676a() {
            return DecimalFormatSymbols.getAvailableLocales();
        }

        @Override // p161ij.AbstractC8639i
        /* renamed from: b */
        public char mo10675b(Locale locale) {
            return m18440g(locale).getDecimalSeparator();
        }

        @Override // p161ij.AbstractC8639i
        /* renamed from: c */
        public String mo10674c(Locale locale) {
            if (locale.getLanguage().equals("ar")) {
                return "\u200f+";
            }
            return String.valueOf('+');
        }

        @Override // p161ij.AbstractC8639i
        /* renamed from: d */
        public EnumC8641j mo10673d(Locale locale) {
            return EnumC8641j.f19112k;
        }

        @Override // p161ij.AbstractC8639i
        /* renamed from: e */
        public String mo10672e(Locale locale) {
            if (locale.getLanguage().equals("ar")) {
                return "\u200f-";
            }
            return String.valueOf(m18440g(locale).getMinusSign());
        }

        @Override // p161ij.AbstractC8639i
        /* renamed from: f */
        public char mo10671f(Locale locale) {
            return m18440g(locale).getZeroDigit();
        }
    }

    /* renamed from: a */
    Locale[] mo10676a();

    /* renamed from: b */
    char mo10675b(Locale locale);

    /* renamed from: c */
    String mo10674c(Locale locale);

    /* renamed from: d */
    EnumC8641j mo10673d(Locale locale);

    /* renamed from: e */
    String mo10672e(Locale locale);

    /* renamed from: f */
    char mo10671f(Locale locale);
}
