package com.facebook.drawee.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import p007a6.C1271b;
import p345t4.C12957a;

/* renamed from: com.facebook.drawee.view.b */
/* loaded from: classes7.dex */
public class C4838b extends C4837a<GenericDraweeHierarchy> {
    public C4838b(Context context, GenericDraweeHierarchy genericDraweeHierarchy) {
        super(context);
        setHierarchy(genericDraweeHierarchy);
    }

    protected void inflateHierarchy(Context context, AttributeSet attributeSet) {
        if (C1271b.m41491d()) {
            C1271b.m41494a("GenericDraweeView#inflateHierarchy");
        }
        GenericDraweeHierarchyBuilder d = C12957a.m4948d(context, attributeSet);
        setAspectRatio(d.m31750f());
        setHierarchy(d.m31755a());
        if (C1271b.m41491d()) {
            C1271b.m41493b();
        }
    }

    public C4838b(Context context) {
        super(context);
        inflateHierarchy(context, null);
    }

    public C4838b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflateHierarchy(context, attributeSet);
    }

    public C4838b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflateHierarchy(context, attributeSet);
    }

    @TargetApi(21)
    public C4838b(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        inflateHierarchy(context, attributeSet);
    }
}
