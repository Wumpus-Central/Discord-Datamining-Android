package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.NativeViewHierarchyOptimizer;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import java.util.EnumSet;

/* renamed from: com.th3rdwave.safeareacontext.h */
/* loaded from: classes8.dex */
public class C6357h extends LayoutShadowNode {

    /* renamed from: a */
    private C6355f f12971a;

    /* renamed from: b */
    private float[] f12972b;

    /* renamed from: c */
    private float[] f12973c;

    /* renamed from: d */
    private boolean f12974d = false;

    public C6357h() {
        int[] iArr = ViewProps.PADDING_MARGIN_SPACING_TYPES;
        this.f12972b = new float[iArr.length];
        this.f12973c = new float[iArr.length];
        for (int i = 0; i < ViewProps.PADDING_MARGIN_SPACING_TYPES.length; i++) {
            this.f12972b[i] = Float.NaN;
            this.f12973c[i] = Float.NaN;
        }
    }

    /* renamed from: a */
    private void m25770a(EnumC6356g gVar) {
        if (gVar == EnumC6356g.PADDING) {
            super.setPadding(1, this.f12972b[1]);
            super.setPadding(2, this.f12972b[1]);
            super.setPadding(3, this.f12972b[3]);
            super.setPadding(0, this.f12972b[0]);
            return;
        }
        super.setMargin(1, this.f12973c[1]);
        super.setMargin(2, this.f12973c[1]);
        super.setMargin(3, this.f12973c[3]);
        super.setMargin(0, this.f12973c[0]);
    }

    /* renamed from: b */
    private void m25769b() {
        float[] fArr;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        C6355f fVar = this.f12971a;
        if (fVar != null) {
            EnumC6356g c = fVar.m25771c();
            EnumC6356g gVar = EnumC6356g.PADDING;
            if (c == gVar) {
                fArr = this.f12972b;
            } else {
                fArr = this.f12973c;
            }
            float f8 = fArr[8];
            if (!Float.isNaN(f8)) {
                f3 = f8;
                f2 = f3;
                f = f2;
            } else {
                f8 = 0.0f;
                f3 = 0.0f;
                f2 = 0.0f;
                f = 0.0f;
            }
            float f9 = fArr[7];
            if (!Float.isNaN(f9)) {
                f8 = f9;
                f2 = f8;
            }
            float f10 = fArr[6];
            if (!Float.isNaN(f10)) {
                f3 = f10;
                f = f3;
            }
            float f11 = fArr[1];
            if (!Float.isNaN(f11)) {
                f8 = f11;
            }
            float f12 = fArr[2];
            if (!Float.isNaN(f12)) {
                f3 = f12;
            }
            float f13 = fArr[3];
            if (!Float.isNaN(f13)) {
                f2 = f13;
            }
            float f14 = fArr[0];
            if (!Float.isNaN(f14)) {
                f = f14;
            }
            float pixelFromDIP = PixelUtil.toPixelFromDIP(f8);
            float pixelFromDIP2 = PixelUtil.toPixelFromDIP(f3);
            float pixelFromDIP3 = PixelUtil.toPixelFromDIP(f2);
            float pixelFromDIP4 = PixelUtil.toPixelFromDIP(f);
            EnumSet<EnumC6354e> a = this.f12971a.m25773a();
            EdgeInsets b = this.f12971a.m25772b();
            if (a.contains(EnumC6354e.TOP)) {
                f4 = b.f12939a;
            } else {
                f4 = 0.0f;
            }
            if (a.contains(EnumC6354e.RIGHT)) {
                f5 = b.f12940b;
            } else {
                f5 = 0.0f;
            }
            if (a.contains(EnumC6354e.BOTTOM)) {
                f6 = b.f12941c;
            } else {
                f6 = 0.0f;
            }
            if (a.contains(EnumC6354e.LEFT)) {
                f7 = b.f12942d;
            } else {
                f7 = 0.0f;
            }
            if (this.f12971a.m25771c() == gVar) {
                super.setPadding(1, f4 + pixelFromDIP);
                super.setPadding(2, f5 + pixelFromDIP2);
                super.setPadding(3, f6 + pixelFromDIP3);
                super.setPadding(0, f7 + pixelFromDIP4);
                return;
            }
            super.setMargin(1, f4 + pixelFromDIP);
            super.setMargin(2, f5 + pixelFromDIP2);
            super.setMargin(3, f6 + pixelFromDIP3);
            super.setMargin(0, f7 + pixelFromDIP4);
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void onBeforeLayout(NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer) {
        if (this.f12974d) {
            this.f12974d = false;
            m25769b();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void setLocalData(Object obj) {
        if (obj instanceof C6355f) {
            C6355f fVar = (C6355f) obj;
            C6355f fVar2 = this.f12971a;
            if (!(fVar2 == null || fVar2.m25771c() == fVar.m25771c())) {
                m25770a(this.f12971a.m25771c());
            }
            this.f12971a = fVar;
            this.f12974d = false;
            m25769b();
        }
    }

    @Override // com.facebook.react.uimanager.LayoutShadowNode
    @ReactPropGroup(names = {ViewProps.MARGIN, ViewProps.MARGIN_VERTICAL, ViewProps.MARGIN_HORIZONTAL, ViewProps.MARGIN_START, ViewProps.MARGIN_END, ViewProps.MARGIN_TOP, ViewProps.MARGIN_BOTTOM, ViewProps.MARGIN_LEFT, ViewProps.MARGIN_RIGHT})
    public void setMargins(int i, Dynamic dynamic) {
        float f;
        int i2 = ViewProps.PADDING_MARGIN_SPACING_TYPES[i];
        float[] fArr = this.f12973c;
        if (dynamic.getType() == ReadableType.Number) {
            f = (float) dynamic.asDouble();
        } else {
            f = Float.NaN;
        }
        fArr[i2] = f;
        super.setMargins(i, dynamic);
        this.f12974d = true;
    }

    @Override // com.facebook.react.uimanager.LayoutShadowNode
    @ReactPropGroup(names = {ViewProps.PADDING, ViewProps.PADDING_VERTICAL, ViewProps.PADDING_HORIZONTAL, ViewProps.PADDING_START, ViewProps.PADDING_END, ViewProps.PADDING_TOP, ViewProps.PADDING_BOTTOM, ViewProps.PADDING_LEFT, ViewProps.PADDING_RIGHT})
    public void setPaddings(int i, Dynamic dynamic) {
        float f;
        int i2 = ViewProps.PADDING_MARGIN_SPACING_TYPES[i];
        float[] fArr = this.f12972b;
        if (dynamic.getType() == ReadableType.Number) {
            f = (float) dynamic.asDouble();
        } else {
            f = Float.NaN;
        }
        fArr[i2] = f;
        super.setPaddings(i, dynamic);
        this.f12974d = true;
    }
}
