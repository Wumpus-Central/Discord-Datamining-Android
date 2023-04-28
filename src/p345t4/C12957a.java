package p345t4;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.C4830a;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import p007a6.C1271b;

/* renamed from: t4.a */
/* loaded from: classes7.dex */
public class C12957a {
    /* renamed from: a */
    private static Drawable m4951a(Context context, TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        return context.getResources().getDrawable(resourceId);
    }

    /* renamed from: b */
    private static C4830a m4950b(GenericDraweeHierarchyBuilder genericDraweeHierarchyBuilder) {
        if (genericDraweeHierarchyBuilder.m31737s() == null) {
            genericDraweeHierarchyBuilder.m31757K(new C4830a());
        }
        return genericDraweeHierarchyBuilder.m31737s();
    }

    /* renamed from: c */
    private static ScalingUtils.ScaleType m4949c(TypedArray typedArray, int i) {
        switch (typedArray.getInt(i, -2)) {
            case -1:
                return null;
            case 0:
                return ScalingUtils.ScaleType.f7703a;
            case 1:
                return ScalingUtils.ScaleType.f7706d;
            case 2:
                return ScalingUtils.ScaleType.f7707e;
            case 3:
                return ScalingUtils.ScaleType.f7708f;
            case 4:
                return ScalingUtils.ScaleType.f7709g;
            case 5:
                return ScalingUtils.ScaleType.f7710h;
            case 6:
                return ScalingUtils.ScaleType.f7711i;
            case 7:
                return ScalingUtils.ScaleType.f7712j;
            case 8:
                return ScalingUtils.ScaleType.f7713k;
            default:
                throw new RuntimeException("XML attribute not specified!");
        }
    }

    /* renamed from: d */
    public static GenericDraweeHierarchyBuilder m4948d(Context context, AttributeSet attributeSet) {
        if (C1271b.m41491d()) {
            C1271b.m41494a("GenericDraweeHierarchyBuilder#inflateBuilder");
        }
        GenericDraweeHierarchyBuilder e = m4947e(new GenericDraweeHierarchyBuilder(context.getResources()), context, attributeSet);
        if (C1271b.m41491d()) {
            C1271b.m41493b();
        }
        return e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x01c4, code lost:
        if (r13 != false) goto L_0x01e0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01de, code lost:
        if (r15 != false) goto L_0x01e0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01e0, code lost:
        r4 = true;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.drawee.generic.GenericDraweeHierarchyBuilder m4947e(com.facebook.drawee.generic.GenericDraweeHierarchyBuilder r17, android.content.Context r18, android.util.AttributeSet r19) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p345t4.C12957a.m4947e(com.facebook.drawee.generic.GenericDraweeHierarchyBuilder, android.content.Context, android.util.AttributeSet):com.facebook.drawee.generic.GenericDraweeHierarchyBuilder");
    }
}
