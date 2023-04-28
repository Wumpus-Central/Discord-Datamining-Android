package com.horcrux.svg;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.image.ReactImageView;
import com.facebook.react.views.text.TypefaceStyle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.horcrux.svg.h */
/* loaded from: classes6.dex */
public class C5960h {

    /* renamed from: p */
    static final C5960h f11866p = new C5960h();

    /* renamed from: a */
    final double f11867a;

    /* renamed from: b */
    final String f11868b;

    /* renamed from: c */
    final EnumC5966j0 f11869c;

    /* renamed from: d */
    final ReadableMap f11870d;

    /* renamed from: e */
    EnumC5970l0 f11871e;

    /* renamed from: f */
    int f11872f;

    /* renamed from: g */
    final String f11873g;

    /* renamed from: h */
    final String f11874h;

    /* renamed from: i */
    final EnumC5968k0 f11875i;

    /* renamed from: j */
    final EnumC5973m0 f11876j;

    /* renamed from: k */
    private final EnumC5975n0 f11877k;

    /* renamed from: l */
    final double f11878l;

    /* renamed from: m */
    final double f11879m;

    /* renamed from: n */
    final double f11880n;

    /* renamed from: o */
    final boolean f11881o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.horcrux.svg.h$a */
    /* loaded from: classes6.dex */
    public static class C5961a {

        /* renamed from: a */
        private static final EnumC5970l0[] f11882a;

        /* renamed from: b */
        private static final int[] f11883b = {TypefaceStyle.NORMAL, TypefaceStyle.BOLD, 100, ItemTouchHelper.AbstractC3083c.DEFAULT_DRAG_ANIMATION_DURATION, ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS, TypefaceStyle.NORMAL, 500, 600, TypefaceStyle.BOLD, 800, 900};

        static {
            EnumC5970l0 l0Var = EnumC5970l0.w100;
            EnumC5970l0 l0Var2 = EnumC5970l0.w900;
            f11882a = new EnumC5970l0[]{l0Var, l0Var, EnumC5970l0.w200, EnumC5970l0.w300, EnumC5970l0.Normal, EnumC5970l0.w500, EnumC5970l0.w600, EnumC5970l0.Bold, EnumC5970l0.w800, l0Var2, l0Var2};
        }

        /* renamed from: a */
        private static int m26779a(int i) {
            if (i < 350) {
                return TypefaceStyle.NORMAL;
            }
            if (i < 550) {
                return TypefaceStyle.BOLD;
            }
            if (i < 900) {
                return 900;
            }
            return i;
        }

        /* renamed from: b */
        static int m26778b(EnumC5970l0 l0Var, C5960h hVar) {
            if (l0Var == EnumC5970l0.Bolder) {
                return m26779a(hVar.f11872f);
            }
            if (l0Var == EnumC5970l0.Lighter) {
                return m26777c(hVar.f11872f);
            }
            return f11883b[l0Var.ordinal()];
        }

        /* renamed from: c */
        private static int m26777c(int i) {
            if (i < 100) {
                return i;
            }
            if (i < 550) {
                return 100;
            }
            return i < 750 ? TypefaceStyle.NORMAL : TypefaceStyle.BOLD;
        }

        /* renamed from: d */
        static EnumC5970l0 m26776d(int i) {
            return f11882a[Math.round(i / 100.0f)];
        }
    }

    private C5960h() {
        this.f11870d = null;
        this.f11868b = "";
        this.f11869c = EnumC5966j0.normal;
        this.f11871e = EnumC5970l0.Normal;
        this.f11872f = TypefaceStyle.NORMAL;
        this.f11873g = "";
        this.f11874h = "";
        this.f11875i = EnumC5968k0.normal;
        this.f11876j = EnumC5973m0.start;
        this.f11877k = EnumC5975n0.None;
        this.f11881o = false;
        this.f11878l = 0.0d;
        this.f11867a = 12.0d;
        this.f11879m = 0.0d;
        this.f11880n = 0.0d;
    }

    /* renamed from: a */
    private void m26782a(C5960h hVar, double d) {
        long round = Math.round(d);
        if (round < 1 || round > 1000) {
            m26781b(hVar);
            return;
        }
        int i = (int) round;
        this.f11872f = i;
        this.f11871e = C5961a.m26776d(i);
    }

    /* renamed from: b */
    private void m26781b(C5960h hVar) {
        this.f11872f = hVar.f11872f;
        this.f11871e = hVar.f11871e;
    }

    /* renamed from: c */
    private double m26780c(ReadableMap readableMap, String str, double d, double d2, double d3) {
        if (readableMap.getType(str) == ReadableType.Number) {
            return readableMap.getDouble(str);
        }
        return C5992x.m26555b(readableMap.getString(str), d3, d, d2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5960h(ReadableMap readableMap, C5960h hVar, double d) {
        String str;
        String str2;
        EnumC5968k0 k0Var;
        EnumC5973m0 m0Var;
        EnumC5975n0 n0Var;
        double d2;
        double d3;
        double d4 = hVar.f11867a;
        if (readableMap.hasKey(ViewProps.FONT_SIZE)) {
            this.f11867a = m26780c(readableMap, ViewProps.FONT_SIZE, 1.0d, d4, d4);
        } else {
            this.f11867a = d4;
        }
        if (!readableMap.hasKey(ViewProps.FONT_WEIGHT)) {
            m26781b(hVar);
        } else if (readableMap.getType(ViewProps.FONT_WEIGHT) == ReadableType.Number) {
            m26782a(hVar, readableMap.getDouble(ViewProps.FONT_WEIGHT));
        } else {
            String string = readableMap.getString(ViewProps.FONT_WEIGHT);
            if (EnumC5970l0.m26721b(string)) {
                int b = C5961a.m26778b(EnumC5970l0.m26722a(string), hVar);
                this.f11872f = b;
                this.f11871e = C5961a.m26776d(b);
            } else if (string != null) {
                m26782a(hVar, Double.parseDouble(string));
            } else {
                m26781b(hVar);
            }
        }
        this.f11870d = readableMap.hasKey("fontData") ? readableMap.getMap("fontData") : hVar.f11870d;
        this.f11868b = readableMap.hasKey(ViewProps.FONT_FAMILY) ? readableMap.getString(ViewProps.FONT_FAMILY) : hVar.f11868b;
        this.f11869c = readableMap.hasKey(ViewProps.FONT_STYLE) ? EnumC5966j0.valueOf(readableMap.getString(ViewProps.FONT_STYLE)) : hVar.f11869c;
        if (readableMap.hasKey("fontFeatureSettings")) {
            str = readableMap.getString("fontFeatureSettings");
        } else {
            str = hVar.f11873g;
        }
        this.f11873g = str;
        if (readableMap.hasKey("fontVariationSettings")) {
            str2 = readableMap.getString("fontVariationSettings");
        } else {
            str2 = hVar.f11874h;
        }
        this.f11874h = str2;
        if (readableMap.hasKey("fontVariantLigatures")) {
            k0Var = EnumC5968k0.valueOf(readableMap.getString("fontVariantLigatures"));
        } else {
            k0Var = hVar.f11875i;
        }
        this.f11875i = k0Var;
        if (readableMap.hasKey("textAnchor")) {
            m0Var = EnumC5973m0.valueOf(readableMap.getString("textAnchor"));
        } else {
            m0Var = hVar.f11876j;
        }
        this.f11876j = m0Var;
        if (readableMap.hasKey("textDecoration")) {
            n0Var = EnumC5975n0.m26690a(readableMap.getString("textDecoration"));
        } else {
            n0Var = hVar.f11877k;
        }
        this.f11877k = n0Var;
        boolean hasKey = readableMap.hasKey("kerning");
        this.f11881o = hasKey || hVar.f11881o;
        this.f11878l = hasKey ? m26780c(readableMap, "kerning", d, this.f11867a, 0.0d) : hVar.f11878l;
        if (readableMap.hasKey("wordSpacing")) {
            d2 = m26780c(readableMap, "wordSpacing", d, this.f11867a, 0.0d);
        } else {
            d2 = hVar.f11879m;
        }
        this.f11879m = d2;
        if (readableMap.hasKey(ViewProps.LETTER_SPACING)) {
            d3 = m26780c(readableMap, ViewProps.LETTER_SPACING, d, this.f11867a, 0.0d);
        } else {
            d3 = hVar.f11880n;
        }
        this.f11880n = d3;
    }
}
