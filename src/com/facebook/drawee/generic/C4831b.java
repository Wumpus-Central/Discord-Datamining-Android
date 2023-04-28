package com.facebook.drawee.generic;

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import com.facebook.drawee.drawable.AbstractC4812c;
import com.facebook.drawee.drawable.AbstractC4819i;
import com.facebook.drawee.drawable.C4816f;
import com.facebook.drawee.drawable.C4820j;
import com.facebook.drawee.drawable.C4821k;
import com.facebook.drawee.drawable.C4825m;
import com.facebook.drawee.drawable.C4826n;
import com.facebook.drawee.drawable.RoundedColorDrawable;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.C4830a;
import p007a6.C1271b;
import p394w3.C13740j;
import p414x3.C13925a;

/* renamed from: com.facebook.drawee.generic.b */
/* loaded from: classes7.dex */
public class C4831b {

    /* renamed from: a */
    private static final Drawable f7838a = new ColorDrawable(0);

    /* renamed from: a */
    private static Drawable m31708a(Drawable drawable, C4830a aVar, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            C4820j jVar = new C4820j(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint());
            m31707b(jVar, aVar);
            return jVar;
        } else if (drawable instanceof NinePatchDrawable) {
            C4825m mVar = new C4825m((NinePatchDrawable) drawable);
            m31707b(mVar, aVar);
            return mVar;
        } else if (drawable instanceof ColorDrawable) {
            RoundedColorDrawable f = RoundedColorDrawable.m31847f((ColorDrawable) drawable);
            m31707b(f, aVar);
            return f;
        } else {
            C13925a.m2302J("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        }
    }

    /* renamed from: b */
    static void m31707b(AbstractC4819i iVar, C4830a aVar) {
        iVar.mo31807a(aVar.m31721i());
        iVar.mo31801g(aVar.m31726d());
        iVar.setBorder(aVar.m31728b(), aVar.m31727c());
        iVar.mo31806b(aVar.m31723g());
        iVar.mo31803e(aVar.m31719k());
        iVar.mo31804d(aVar.m31722h());
    }

    /* renamed from: c */
    static AbstractC4812c m31706c(AbstractC4812c cVar) {
        while (true) {
            Drawable drawable = cVar.getDrawable();
            if (drawable == cVar || !(drawable instanceof AbstractC4812c)) {
                break;
            }
            cVar = (AbstractC4812c) drawable;
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static Drawable m31705d(Drawable drawable, C4830a aVar, Resources resources) {
        try {
            if (C1271b.m41491d()) {
                C1271b.m41494a("WrappingUtils#maybeApplyLeafRounding");
            }
            if (!(drawable == null || aVar == null || aVar.m31720j() != C4830a.EnumC0114a.BITMAP_ONLY)) {
                if (drawable instanceof C4816f) {
                    AbstractC4812c c = m31706c((C4816f) drawable);
                    c.setDrawable(m31708a(c.setDrawable(f7838a), aVar, resources));
                    return drawable;
                }
                Drawable a = m31708a(drawable, aVar, resources);
                if (C1271b.m41491d()) {
                    C1271b.m41493b();
                }
                return a;
            }
            if (C1271b.m41491d()) {
                C1271b.m41493b();
            }
            return drawable;
        } finally {
            if (C1271b.m41491d()) {
                C1271b.m41493b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static Drawable m31704e(Drawable drawable, C4830a aVar) {
        try {
            if (C1271b.m41491d()) {
                C1271b.m41494a("WrappingUtils#maybeWrapWithRoundedOverlayColor");
            }
            if (!(drawable == null || aVar == null || aVar.m31720j() != C4830a.EnumC0114a.OVERLAY_COLOR)) {
                C4821k kVar = new C4821k(drawable);
                m31707b(kVar, aVar);
                kVar.m31809i(aVar.m31724f());
                return kVar;
            }
            if (C1271b.m41491d()) {
                C1271b.m41493b();
            }
            return drawable;
        } finally {
            if (C1271b.m41491d()) {
                C1271b.m41493b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static Drawable m31703f(Drawable drawable, ScalingUtils.ScaleType scaleType) {
        return m31702g(drawable, scaleType, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static Drawable m31702g(Drawable drawable, ScalingUtils.ScaleType scaleType, PointF pointF) {
        if (C1271b.m41491d()) {
            C1271b.m41494a("WrappingUtils#maybeWrapWithScaleType");
        }
        if (drawable == null || scaleType == null) {
            if (C1271b.m41491d()) {
                C1271b.m41493b();
            }
            return drawable;
        }
        C4826n nVar = new C4826n(drawable, scaleType);
        if (pointF != null) {
            nVar.m31793l(pointF);
        }
        if (C1271b.m41491d()) {
            C1271b.m41493b();
        }
        return nVar;
    }

    /* renamed from: h */
    static void m31701h(AbstractC4819i iVar) {
        iVar.mo31807a(false);
        iVar.mo31805c(0.0f);
        iVar.setBorder(0, 0.0f);
        iVar.mo31806b(0.0f);
        iVar.mo31803e(false);
        iVar.mo31804d(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static void m31700i(AbstractC4812c cVar, C4830a aVar, Resources resources) {
        AbstractC4812c c = m31706c(cVar);
        Drawable drawable = c.getDrawable();
        if (aVar == null || aVar.m31720j() != C4830a.EnumC0114a.BITMAP_ONLY) {
            if (drawable instanceof AbstractC4819i) {
                m31701h((AbstractC4819i) drawable);
            }
        } else if (drawable instanceof AbstractC4819i) {
            m31707b((AbstractC4819i) drawable, aVar);
        } else if (drawable != null) {
            c.setDrawable(f7838a);
            c.setDrawable(m31708a(drawable, aVar, resources));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static void m31699j(AbstractC4812c cVar, C4830a aVar) {
        Drawable drawable = cVar.getDrawable();
        if (aVar == null || aVar.m31720j() != C4830a.EnumC0114a.OVERLAY_COLOR) {
            if (drawable instanceof C4821k) {
                Drawable drawable2 = f7838a;
                cVar.setDrawable(((C4821k) drawable).setCurrent(drawable2));
                drawable2.setCallback(null);
            }
        } else if (drawable instanceof C4821k) {
            C4821k kVar = (C4821k) drawable;
            m31707b(kVar, aVar);
            kVar.m31809i(aVar.m31724f());
        } else {
            cVar.setDrawable(m31704e(cVar.setDrawable(f7838a), aVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static C4826n m31698k(AbstractC4812c cVar, ScalingUtils.ScaleType scaleType) {
        Drawable f = m31703f(cVar.setDrawable(f7838a), scaleType);
        cVar.setDrawable(f);
        C13740j.m2833h(f, "Parent has no child drawable!");
        return (C4826n) f;
    }
}
