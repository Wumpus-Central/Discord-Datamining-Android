package com.google.android.exoplayer2.p049ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.exoplayer2.p049ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p317r8.C12452a;
import p317r8.C12453b;

/* renamed from: com.google.android.exoplayer2.ui.a */
/* loaded from: classes5.dex */
final class C5271a extends View implements SubtitleView.AbstractC5267a {

    /* renamed from: k */
    private final List<C5279f> f9662k;

    /* renamed from: l */
    private List<C12453b> f9663l;

    /* renamed from: m */
    private int f9664m;

    /* renamed from: n */
    private float f9665n;

    /* renamed from: o */
    private C12452a f9666o;

    /* renamed from: p */
    private float f9667p;

    public C5271a(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private static C12453b m29683b(C12453b bVar) {
        C12453b.C0400b o = bVar.m6696a().m6686j(-3.4028235E38f).m6685k(Integer.MIN_VALUE).m6681o(null);
        if (bVar.f28083e == 0) {
            o.m6688h(1.0f - bVar.f28082d, 0);
        } else {
            o.m6688h((-bVar.f28082d) - 1.0f, 1);
        }
        int i = bVar.f28084f;
        if (i == 0) {
            o.m6687i(2);
        } else if (i == 2) {
            o.m6687i(0);
        }
        return o.m6695a();
    }

    @Override // com.google.android.exoplayer2.p049ui.SubtitleView.AbstractC5267a
    /* renamed from: a */
    public void mo29651a(List<C12453b> list, C12452a aVar, float f, int i, float f2) {
        this.f9663l = list;
        this.f9666o = aVar;
        this.f9665n = f;
        this.f9664m = i;
        this.f9667p = f2;
        while (this.f9662k.size() < list.size()) {
            this.f9662k.add(new C5279f(getContext()));
        }
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List<C12453b> list = this.f9663l;
        if (!list.isEmpty()) {
            int height = getHeight();
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int paddingBottom = height - getPaddingBottom();
            if (paddingBottom > paddingTop && width > paddingLeft) {
                int i = paddingBottom - paddingTop;
                float a = C5280g.m29657a(this.f9664m, this.f9665n, height, i);
                if (a > 0.0f) {
                    int size = list.size();
                    int i2 = 0;
                    while (i2 < size) {
                        C12453b bVar = list.get(i2);
                        if (bVar.f28093o != Integer.MIN_VALUE) {
                            bVar = m29683b(bVar);
                        }
                        this.f9662k.get(i2).m29663b(bVar, this.f9666o, a, C5280g.m29657a(bVar.f28091m, bVar.f28092n, height, i), this.f9667p, canvas, paddingLeft, paddingTop, width, paddingBottom);
                        i2++;
                        size = size;
                        i = i;
                        paddingBottom = paddingBottom;
                        width = width;
                    }
                }
            }
        }
    }

    public C5271a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9662k = new ArrayList();
        this.f9663l = Collections.emptyList();
        this.f9664m = 0;
        this.f9665n = 0.0533f;
        this.f9666o = C12452a.f28071g;
        this.f9667p = 0.08f;
    }
}
