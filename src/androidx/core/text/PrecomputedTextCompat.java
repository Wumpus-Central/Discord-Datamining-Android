package androidx.core.text;

import android.os.Build;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.core.util.C2513d;

/* loaded from: classes.dex */
public class PrecomputedTextCompat implements Spannable {

    /* renamed from: n */
    private static final Object f3436n = new Object();

    /* renamed from: k */
    private final Spannable f3437k;

    /* renamed from: l */
    private final Params f3438l;

    /* renamed from: m */
    private final PrecomputedText f3439m;

    /* renamed from: a */
    public Params m37663a() {
        return this.f3438l;
    }

    /* renamed from: b */
    public PrecomputedText m37662b() {
        Spannable spannable = this.f3437k;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.f3437k.charAt(i);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f3437k.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f3437k.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f3437k.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        Object[] spans;
        if (Build.VERSION.SDK_INT < 29) {
            return (T[]) this.f3437k.getSpans(i, i2, cls);
        }
        spans = this.f3439m.getSpans(i, i2, cls);
        return (T[]) spans;
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f3437k.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f3437k.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f3439m.removeSpan(obj);
        } else {
            this.f3437k.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f3439m.setSpan(obj, i, i2, i3);
        } else {
            this.f3437k.setSpan(obj, i, i2, i3);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.f3437k.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f3437k.toString();
    }

    /* loaded from: classes.dex */
    public static final class Params {

        /* renamed from: a */
        private final TextPaint f3440a;

        /* renamed from: b */
        private final TextDirectionHeuristic f3441b;

        /* renamed from: c */
        private final int f3442c;

        /* renamed from: d */
        private final int f3443d;

        /* renamed from: e */
        final PrecomputedText.Params f3444e;

        /* renamed from: androidx.core.text.PrecomputedTextCompat$Params$a */
        /* loaded from: classes.dex */
        public static class C2484a {

            /* renamed from: a */
            private final TextPaint f3445a;

            /* renamed from: c */
            private int f3447c = 1;

            /* renamed from: d */
            private int f3448d = 1;

            /* renamed from: b */
            private TextDirectionHeuristic f3446b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C2484a(TextPaint textPaint) {
                this.f3445a = textPaint;
            }

            /* renamed from: a */
            public Params m37656a() {
                return new Params(this.f3445a, this.f3446b, this.f3447c, this.f3448d);
            }

            /* renamed from: b */
            public C2484a m37655b(int i) {
                this.f3447c = i;
                return this;
            }

            /* renamed from: c */
            public C2484a m37654c(int i) {
                this.f3448d = i;
                return this;
            }

            /* renamed from: d */
            public C2484a m37653d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f3446b = textDirectionHeuristic;
                return this;
            }
        }

        Params(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            PrecomputedText.Params.Builder breakStrategy;
            PrecomputedText.Params.Builder hyphenationFrequency;
            PrecomputedText.Params.Builder textDirection;
            PrecomputedText.Params build;
            if (Build.VERSION.SDK_INT >= 29) {
                breakStrategy = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i);
                hyphenationFrequency = breakStrategy.setHyphenationFrequency(i2);
                textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
                build = textDirection.build();
                this.f3444e = build;
            } else {
                this.f3444e = null;
            }
            this.f3440a = textPaint;
            this.f3441b = textDirectionHeuristic;
            this.f3442c = i;
            this.f3443d = i2;
        }

        /* renamed from: a */
        public boolean m37661a(Params params) {
            LocaleList textLocales;
            LocaleList textLocales2;
            boolean equals;
            int i = Build.VERSION.SDK_INT;
            if (this.f3442c != params.m37660b() || this.f3443d != params.m37659c() || this.f3440a.getTextSize() != params.m37657e().getTextSize() || this.f3440a.getTextScaleX() != params.m37657e().getTextScaleX() || this.f3440a.getTextSkewX() != params.m37657e().getTextSkewX() || this.f3440a.getLetterSpacing() != params.m37657e().getLetterSpacing() || !TextUtils.equals(this.f3440a.getFontFeatureSettings(), params.m37657e().getFontFeatureSettings()) || this.f3440a.getFlags() != params.m37657e().getFlags()) {
                return false;
            }
            if (i >= 24) {
                textLocales = this.f3440a.getTextLocales();
                textLocales2 = params.m37657e().getTextLocales();
                equals = textLocales.equals(textLocales2);
                if (!equals) {
                    return false;
                }
            } else if (!this.f3440a.getTextLocale().equals(params.m37657e().getTextLocale())) {
                return false;
            }
            if (this.f3440a.getTypeface() == null) {
                if (params.m37657e().getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.f3440a.getTypeface().equals(params.m37657e().getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        /* renamed from: b */
        public int m37660b() {
            return this.f3442c;
        }

        /* renamed from: c */
        public int m37659c() {
            return this.f3443d;
        }

        /* renamed from: d */
        public TextDirectionHeuristic m37658d() {
            return this.f3441b;
        }

        /* renamed from: e */
        public TextPaint m37657e() {
            return this.f3440a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            if (m37661a(params) && this.f3441b == params.m37658d()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            LocaleList textLocales;
            if (Build.VERSION.SDK_INT < 24) {
                return C2513d.m37600b(Float.valueOf(this.f3440a.getTextSize()), Float.valueOf(this.f3440a.getTextScaleX()), Float.valueOf(this.f3440a.getTextSkewX()), Float.valueOf(this.f3440a.getLetterSpacing()), Integer.valueOf(this.f3440a.getFlags()), this.f3440a.getTextLocale(), this.f3440a.getTypeface(), Boolean.valueOf(this.f3440a.isElegantTextHeight()), this.f3441b, Integer.valueOf(this.f3442c), Integer.valueOf(this.f3443d));
            }
            textLocales = this.f3440a.getTextLocales();
            return C2513d.m37600b(Float.valueOf(this.f3440a.getTextSize()), Float.valueOf(this.f3440a.getTextScaleX()), Float.valueOf(this.f3440a.getTextSkewX()), Float.valueOf(this.f3440a.getLetterSpacing()), Integer.valueOf(this.f3440a.getFlags()), textLocales, this.f3440a.getTypeface(), Boolean.valueOf(this.f3440a.isElegantTextHeight()), this.f3441b, Integer.valueOf(this.f3442c), Integer.valueOf(this.f3443d));
        }

        public String toString() {
            String fontVariationSettings;
            LocaleList textLocales;
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f3440a.getTextSize());
            sb2.append(", textScaleX=" + this.f3440a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f3440a.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            sb2.append(", letterSpacing=" + this.f3440a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f3440a.isElegantTextHeight());
            if (i >= 24) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(", textLocale=");
                textLocales = this.f3440a.getTextLocales();
                sb3.append(textLocales);
                sb2.append(sb3.toString());
            } else {
                sb2.append(", textLocale=" + this.f3440a.getTextLocale());
            }
            sb2.append(", typeface=" + this.f3440a.getTypeface());
            if (i >= 26) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(", variationSettings=");
                fontVariationSettings = this.f3440a.getFontVariationSettings();
                sb4.append(fontVariationSettings);
                sb2.append(sb4.toString());
            }
            sb2.append(", textDir=" + this.f3441b);
            sb2.append(", breakStrategy=" + this.f3442c);
            sb2.append(", hyphenationFrequency=" + this.f3443d);
            sb2.append("}");
            return sb2.toString();
        }

        public Params(PrecomputedText.Params params) {
            TextPaint textPaint;
            TextDirectionHeuristic textDirection;
            int breakStrategy;
            int hyphenationFrequency;
            textPaint = params.getTextPaint();
            this.f3440a = textPaint;
            textDirection = params.getTextDirection();
            this.f3441b = textDirection;
            breakStrategy = params.getBreakStrategy();
            this.f3442c = breakStrategy;
            hyphenationFrequency = params.getHyphenationFrequency();
            this.f3443d = hyphenationFrequency;
            this.f3444e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
