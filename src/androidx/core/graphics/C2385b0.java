package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.core.content.res.C2359e;
import androidx.core.provider.C2476g;
import java.io.IOException;

/* renamed from: androidx.core.graphics.b0 */
/* loaded from: classes.dex */
public class C2385b0 extends C2388c0 {
    /* JADX WARN: Incorrect condition in loop: B:12:0x0027 */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.graphics.fonts.Font m37917g(android.graphics.fonts.FontFamily r6, int r7) {
        /*
            r5 = this;
            android.graphics.fonts.FontStyle r0 = new android.graphics.fonts.FontStyle
            r1 = r7 & 1
            if (r1 == 0) goto L_0x0009
            r1 = 700(0x2bc, float:9.81E-43)
            goto L_0x000b
        L_0x0009:
            r1 = 400(0x190, float:5.6E-43)
        L_0x000b:
            r7 = r7 & 2
            r2 = 0
            r3 = 1
            if (r7 == 0) goto L_0x0013
            r7 = r3
            goto L_0x0014
        L_0x0013:
            r7 = r2
        L_0x0014:
            r0.<init>(r1, r7)
            android.graphics.fonts.Font r7 = androidx.core.graphics.C2421o.m37762a(r6, r2)
            android.graphics.fonts.FontStyle r1 = androidx.core.graphics.C2431y.m37752a(r7)
            int r1 = m37916h(r0, r1)
        L_0x0023:
            int r2 = androidx.core.graphics.C2422p.m37761a(r6)
            if (r3 >= r2) goto L_0x003c
            android.graphics.fonts.Font r2 = androidx.core.graphics.C2421o.m37762a(r6, r3)
            android.graphics.fonts.FontStyle r4 = androidx.core.graphics.C2431y.m37752a(r2)
            int r4 = m37916h(r0, r4)
            if (r4 >= r1) goto L_0x0039
            r7 = r2
            r1 = r4
        L_0x0039:
            int r3 = r3 + 1
            goto L_0x0023
        L_0x003c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.C2385b0.m37917g(android.graphics.fonts.FontFamily, int):android.graphics.fonts.Font");
    }

    /* renamed from: h */
    private static int m37916h(FontStyle fontStyle, FontStyle fontStyle2) {
        int weight;
        int weight2;
        int slant;
        int slant2;
        int i;
        weight = fontStyle.getWeight();
        weight2 = fontStyle2.getWeight();
        int abs = Math.abs(weight - weight2) / 100;
        slant = fontStyle.getSlant();
        slant2 = fontStyle2.getSlant();
        if (slant == slant2) {
            i = 0;
        } else {
            i = 2;
        }
        return abs + i;
    }

    @Override // androidx.core.graphics.C2388c0
    /* renamed from: a */
    public Typeface mo37780a(Context context, C2359e.C2362c cVar, Resources resources, int i) {
        C2359e.C2363d[] a;
        FontFamily build;
        FontStyle style;
        Typeface.CustomFallbackBuilder style2;
        Typeface build2;
        Font.Builder weight;
        int i2;
        Font.Builder slant;
        Font.Builder ttcIndex;
        Font.Builder fontVariationSettings;
        Font build3;
        try {
            FontFamily.Builder builder = null;
            for (C2359e.C2363d dVar : cVar.m38007a()) {
                try {
                    weight = new Font.Builder(resources, dVar.m38005b()).setWeight(dVar.m38002e());
                    if (dVar.m38001f()) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    slant = weight.setSlant(i2);
                    ttcIndex = slant.setTtcIndex(dVar.m38004c());
                    fontVariationSettings = ttcIndex.setFontVariationSettings(dVar.m38003d());
                    build3 = fontVariationSettings.build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build3);
                    } else {
                        builder.addFont(build3);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            build = builder.build();
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(build);
            style = m37917g(build, i).getStyle();
            style2 = customFallbackBuilder.setStyle(style);
            build2 = style2.build();
            return build2;
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // androidx.core.graphics.C2388c0
    /* renamed from: b */
    public Typeface mo37779b(Context context, CancellationSignal cancellationSignal, C2476g.C2478b[] bVarArr, int i) {
        FontFamily build;
        FontStyle style;
        Typeface.CustomFallbackBuilder style2;
        Typeface build2;
        ParcelFileDescriptor openFileDescriptor;
        Font.Builder weight;
        int i2;
        Font.Builder slant;
        Font.Builder ttcIndex;
        Font build3;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (C2476g.C2478b bVar : bVarArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(bVar.m37671d(), "r", cancellationSignal);
                } catch (IOException unused) {
                }
                if (openFileDescriptor != null) {
                    try {
                        weight = new Font.Builder(openFileDescriptor).setWeight(bVar.m37670e());
                        if (bVar.m37669f()) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        slant = weight.setSlant(i2);
                        ttcIndex = slant.setTtcIndex(bVar.m37672c());
                        build3 = ttcIndex.build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build3);
                        } else {
                            builder.addFont(build3);
                        }
                    } catch (Throwable th2) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                        break;
                    }
                } else if (openFileDescriptor == null) {
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            build = builder.build();
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(build);
            style = m37917g(build, i).getStyle();
            style2 = customFallbackBuilder.setStyle(style);
            build2 = style2.build();
            return build2;
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // androidx.core.graphics.C2388c0
    /* renamed from: d */
    public Typeface mo37778d(Context context, Resources resources, int i, String str, int i2) {
        Font build;
        FontFamily build2;
        FontStyle style;
        Typeface.CustomFallbackBuilder style2;
        Typeface build3;
        try {
            build = new Font.Builder(resources, i).build();
            build2 = new FontFamily.Builder(build).build();
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(build2);
            style = build.getStyle();
            style2 = customFallbackBuilder.setStyle(style);
            build3 = style2.build();
            return build3;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.graphics.C2388c0
    /* renamed from: f */
    public C2476g.C2478b mo37911f(C2476g.C2478b[] bVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
