package p317r8;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import p119g9.C7557q0;

/* renamed from: r8.a */
/* loaded from: classes7.dex */
public final class C12452a {

    /* renamed from: g */
    public static final C12452a f28071g = new C12452a(-1, -16777216, 0, 0, -1, null);

    /* renamed from: a */
    public final int f28072a;

    /* renamed from: b */
    public final int f28073b;

    /* renamed from: c */
    public final int f28074c;

    /* renamed from: d */
    public final int f28075d;

    /* renamed from: e */
    public final int f28076e;

    /* renamed from: f */
    public final Typeface f28077f;

    public C12452a(int i, int i2, int i3, int i4, int i5, Typeface typeface) {
        this.f28072a = i;
        this.f28073b = i2;
        this.f28074c = i3;
        this.f28075d = i4;
        this.f28076e = i5;
        this.f28077f = typeface;
    }

    /* renamed from: a */
    public static C12452a m6699a(CaptioningManager.CaptionStyle captionStyle) {
        if (C7557q0.f16368a >= 21) {
            return m6697c(captionStyle);
        }
        return m6698b(captionStyle);
    }

    /* renamed from: b */
    private static C12452a m6698b(CaptioningManager.CaptionStyle captionStyle) {
        return new C12452a(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    /* renamed from: c */
    private static C12452a m6697c(CaptioningManager.CaptionStyle captionStyle) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (captionStyle.hasForegroundColor()) {
            i = captionStyle.foregroundColor;
        } else {
            i = f28071g.f28072a;
        }
        if (captionStyle.hasBackgroundColor()) {
            i2 = captionStyle.backgroundColor;
        } else {
            i2 = f28071g.f28073b;
        }
        if (captionStyle.hasWindowColor()) {
            i3 = captionStyle.windowColor;
        } else {
            i3 = f28071g.f28074c;
        }
        if (captionStyle.hasEdgeType()) {
            i4 = captionStyle.edgeType;
        } else {
            i4 = f28071g.f28075d;
        }
        if (captionStyle.hasEdgeColor()) {
            i5 = captionStyle.edgeColor;
        } else {
            i5 = f28071g.f28076e;
        }
        return new C12452a(i, i2, i3, i4, i5, captionStyle.getTypeface());
    }
}
