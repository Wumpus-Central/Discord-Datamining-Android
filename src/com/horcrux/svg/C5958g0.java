package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.text.ReactFontManager;
import java.text.Bidi;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.g0 */
/* loaded from: classes6.dex */
public class C5958g0 extends C5986t0 {

    /* renamed from: A */
    private final ArrayList<String> f37617A = new ArrayList<>();

    /* renamed from: B */
    private final ArrayList<Matrix> f37618B = new ArrayList<>();

    /* renamed from: C */
    private final AssetManager f37619C = this.mContext.getResources().getAssets();

    /* renamed from: x */
    private Path f11860x;

    /* renamed from: y */
    String f11861y;

    /* renamed from: z */
    private C5962h0 f11862z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.horcrux.svg.g0$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C5959a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11863a;

        /* renamed from: b */
        static final /* synthetic */ int[] f11864b;

        /* renamed from: c */
        static final /* synthetic */ int[] f11865c;

        static {
            int[] iArr = new int[EnumC5964i0.values().length];
            f11865c = iArr;
            try {
                iArr[EnumC5964i0.baseline.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11865c[EnumC5964i0.textBottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11865c[EnumC5964i0.afterEdge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11865c[EnumC5964i0.textAfterEdge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11865c[EnumC5964i0.alphabetic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11865c[EnumC5964i0.ideographic.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11865c[EnumC5964i0.middle.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11865c[EnumC5964i0.central.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11865c[EnumC5964i0.mathematical.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11865c[EnumC5964i0.hanging.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f11865c[EnumC5964i0.textTop.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f11865c[EnumC5964i0.beforeEdge.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f11865c[EnumC5964i0.textBeforeEdge.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f11865c[EnumC5964i0.bottom.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f11865c[EnumC5964i0.center.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f11865c[EnumC5964i0.top.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            int[] iArr2 = new int[EnumC5977o0.values().length];
            f11864b = iArr2;
            try {
                iArr2[EnumC5977o0.spacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f11864b[EnumC5977o0.spacingAndGlyphs.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr3 = new int[EnumC5973m0.values().length];
            f11863a = iArr3;
            try {
                iArr3[EnumC5973m0.start.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f11863a[EnumC5973m0.middle.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f11863a[EnumC5973m0.end.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    public C5958g0(ReactContext reactContext) {
        super(reactContext);
    }

    /* renamed from: M */
    private void m26792M(Paint paint, C5960h hVar) {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        double d = hVar.f11880n;
        paint.setLetterSpacing((float) (d / (hVar.f11867a * this.mScale)));
        if (d == 0.0d && hVar.f11875i == EnumC5968k0.normal) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            paint.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'hlig', 'cala', " + hVar.f11873g);
        } else {
            paint.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, " + hVar.f11873g);
        }
        if (i >= 26) {
            paint.setFontVariationSettings("'wght' " + hVar.f11872f + hVar.f11874h);
        }
    }

    /* renamed from: N */
    private void m26791N(Paint paint, C5960h hVar) {
        boolean z;
        boolean z2;
        int i = 0;
        if (hVar.f11871e == EnumC5970l0.Bold || hVar.f11872f >= 550) {
            z = true;
        } else {
            z = false;
        }
        if (hVar.f11869c == EnumC5966j0.italic) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            i = 3;
        } else if (z) {
            i = 1;
        } else if (z2) {
            i = 2;
        }
        int i2 = hVar.f11872f;
        String str = hVar.f11868b;
        Typeface typeface = null;
        if (str != null && str.length() > 0) {
            String str2 = "fonts/" + str + ".otf";
            String str3 = "fonts/" + str + ".ttf";
            if (Build.VERSION.SDK_INT >= 26) {
                Typeface.Builder builder = new Typeface.Builder(this.f37619C, str2);
                builder.setFontVariationSettings("'wght' " + i2 + hVar.f11874h);
                builder.setWeight(i2);
                builder.setItalic(z2);
                typeface = builder.build();
                if (typeface == null) {
                    Typeface.Builder builder2 = new Typeface.Builder(this.f37619C, str3);
                    builder2.setFontVariationSettings("'wght' " + i2 + hVar.f11874h);
                    builder2.setWeight(i2);
                    builder2.setItalic(z2);
                    typeface = builder2.build();
                }
            } else {
                try {
                    try {
                        typeface = Typeface.create(Typeface.createFromAsset(this.f37619C, str2), i);
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    typeface = Typeface.create(Typeface.createFromAsset(this.f37619C, str3), i);
                }
            }
        }
        if (typeface == null) {
            try {
                typeface = ReactFontManager.getInstance().getTypeface(str, i, this.f37619C);
            } catch (Exception unused3) {
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            typeface = Typeface.create(typeface, i2, z2);
        }
        paint.setLinearText(true);
        paint.setSubpixelText(true);
        paint.setTypeface(typeface);
        paint.setTextSize((float) (hVar.f11867a * this.mScale));
        paint.setLetterSpacing(0.0f);
    }

    /* renamed from: O */
    private void m26790O(Canvas canvas, Paint paint) {
        Layout.Alignment alignment;
        C5965j e = m26727e();
        mo26603g();
        C5960h b = e.m26750b();
        TextPaint textPaint = new TextPaint(paint);
        m26791N(textPaint, b);
        m26792M(textPaint, b);
        double c = e.m26749c();
        int i = C5959a.f11863a[b.f11876j.ordinal()];
        if (i == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i != 3) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout R = m26787R(textPaint, alignment, true, new SpannableString(this.f11861y), (int) C5992x.m26556a(this.f12047m, canvas.getWidth(), 0.0d, this.mScale, c));
        int lineAscent = R.getLineAscent(0);
        mo26726f();
        canvas.save();
        canvas.translate((float) e.m26740l(0.0d), (float) (e.m26739m() + lineAscent));
        R.draw(canvas);
        canvas.restore();
    }

    /* renamed from: P */
    private double m26789P(SVGLength sVGLength, double d, double d2) {
        return C5992x.m26556a(sVGLength, d, 0.0d, this.mScale, d2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0261  */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.graphics.Path m26788Q(java.lang.String r69, android.graphics.Paint r70, android.graphics.Canvas r71) {
        /*
            Method dump skipped, instructions count: 1380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.C5958g0.m26788Q(java.lang.String, android.graphics.Paint, android.graphics.Canvas):android.graphics.Path");
    }

    /* renamed from: R */
    private StaticLayout m26787R(TextPaint textPaint, Layout.Alignment alignment, boolean z, SpannableString spannableString, int i) {
        return StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, i).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(z).setBreakStrategy(1).setHyphenationFrequency(1).build();
    }

    /* renamed from: S */
    private double m26786S(EnumC5973m0 m0Var, double d) {
        int i = C5959a.f11863a[m0Var.ordinal()];
        if (i == 2) {
            return (-d) / 2.0d;
        }
        if (i != 3) {
            return 0.0d;
        }
        return -d;
    }

    /* renamed from: U */
    private void m26784U() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getClass() == C5962h0.class) {
                this.f11862z = (C5962h0) parent;
                return;
            } else if (!(parent instanceof C5986t0)) {
                return;
            }
        }
    }

    /* renamed from: V */
    public static String m26783V(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        Bidi bidi = new Bidi(str, -2);
        if (bidi.isLeftToRight()) {
            return str;
        }
        int runCount = bidi.getRunCount();
        byte[] bArr = new byte[runCount];
        Integer[] numArr = new Integer[runCount];
        for (int i = 0; i < runCount; i++) {
            bArr[i] = (byte) bidi.getRunLevel(i);
            numArr[i] = Integer.valueOf(i);
        }
        Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
        StringBuilder sb2 = new StringBuilder();
        for (int i2 = 0; i2 < runCount; i2++) {
            int intValue = numArr[i2].intValue();
            int runStart = bidi.getRunStart(intValue);
            int runLimit = bidi.getRunLimit(intValue);
            if ((bArr[intValue] & 1) != 0) {
                while (true) {
                    runLimit--;
                    if (runLimit >= runStart) {
                        sb2.append(str.charAt(runLimit));
                    }
                }
            } else {
                sb2.append((CharSequence) str, runStart, runLimit);
            }
        }
        return sb2.toString();
    }

    /* renamed from: T */
    public void m26785T(String str) {
        this.f11861y = str;
        invalidate();
    }

    @Override // com.horcrux.svg.C5986t0, com.horcrux.svg.VirtualView
    void clearCache() {
        this.f11860x = null;
        super.clearCache();
    }

    @Override // com.horcrux.svg.C5986t0, com.horcrux.svg.C5969l, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f) {
        if (this.f11861y != null) {
            SVGLength sVGLength = this.f12047m;
            if (sVGLength == null || sVGLength.f11767a == 0.0d) {
                int size = this.f37617A.size();
                if (size > 0) {
                    m26791N(paint, m26727e().m26750b());
                    for (int i = 0; i < size; i++) {
                        canvas.save();
                        canvas.concat(this.f37618B.get(i));
                        canvas.drawText(this.f37617A.get(i), 0.0f, 0.0f, paint);
                        canvas.restore();
                    }
                }
                m26729b(canvas, paint, f);
                return;
            }
            if (setupFillPaint(paint, this.fillOpacity * f)) {
                m26790O(canvas, paint);
            }
            if (setupStrokePaint(paint, f * this.strokeOpacity)) {
                m26790O(canvas, paint);
                return;
            }
            return;
        }
        clip(canvas, paint);
        mo26730a(canvas, paint, f);
    }

    @Override // com.horcrux.svg.C5986t0, com.horcrux.svg.C5969l, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = this.f11860x;
        if (path != null) {
            return path;
        }
        if (this.f11861y == null) {
            Path m = m26600m(canvas, paint);
            this.f11860x = m;
            return m;
        }
        m26784U();
        mo26603g();
        this.f11860x = m26788Q(m26783V(this.f11861y), paint, canvas);
        mo26726f();
        return this.f11860x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.C5969l, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public int hitTest(float[] fArr) {
        Region region;
        if (this.f11861y == null) {
            return super.hitTest(fArr);
        }
        if (((VirtualView) this).mPath != null && this.mInvertible && this.mTransformInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            this.mInvTransform.mapPoints(fArr2);
            int round = Math.round(fArr2[0]);
            int round2 = Math.round(fArr2[1]);
            initBounds();
            Region region2 = this.mRegion;
            if ((region2 != null && region2.contains(round, round2)) || ((region = this.mStrokeRegion) != null && region.contains(round, round2))) {
                if (getClipPath() == null || this.mClipRegion.contains(round, round2)) {
                    return getId();
                }
                return -1;
            }
        }
        return -1;
    }

    @Override // com.horcrux.svg.C5986t0, com.horcrux.svg.VirtualView, android.view.View
    public void invalidate() {
        this.f11860x = null;
        super.invalidate();
    }

    @Override // com.horcrux.svg.C5986t0
    /* renamed from: n */
    double mo26599n(Paint paint) {
        if (!Double.isNaN(this.f12057w)) {
            return this.f12057w;
        }
        String str = this.f11861y;
        double d = 0.0d;
        if (str == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof C5986t0) {
                    d += ((C5986t0) childAt).mo26599n(paint);
                }
            }
            this.f12057w = d;
            return d;
        } else if (str.length() == 0) {
            this.f12057w = 0.0d;
            return 0.0d;
        } else {
            C5960h b = m26727e().m26750b();
            m26791N(paint, b);
            m26792M(paint, b);
            double measureText = paint.measureText(str);
            this.f12057w = measureText;
            return measureText;
        }
    }
}
