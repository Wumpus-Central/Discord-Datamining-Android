package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.u */
/* loaded from: classes6.dex */
public class C5987u extends RenderableView {

    /* renamed from: k */
    private Path f12058k = new Path();

    public C5987u(ReactContext reactContext) {
        super(reactContext);
        C5985t.f12034a = this.mScale;
    }

    /* renamed from: a */
    public void m26586a(String str) {
        C5991w[] wVarArr;
        this.f12058k = C5985t.m26628o(str);
        ArrayList<C5983s> arrayList = C5985t.f12039f;
        this.elements = arrayList;
        Iterator<C5983s> it = arrayList.iterator();
        while (it.hasNext()) {
            for (C5991w wVar : it.next().f12030b) {
                double d = wVar.f12078a;
                float f = this.mScale;
                wVar.f12078a = d * f;
                wVar.f12079b *= f;
            }
        }
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        return this.f12058k;
    }
}
