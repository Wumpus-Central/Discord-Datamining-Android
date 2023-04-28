package com.google.android.flexbox;

import android.view.View;
import com.facebook.react.uimanager.ViewDefaults;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.flexbox.c */
/* loaded from: classes5.dex */
public class C5348c {

    /* renamed from: e */
    int f9977e;

    /* renamed from: f */
    int f9978f;

    /* renamed from: g */
    int f9979g;

    /* renamed from: h */
    int f9980h;

    /* renamed from: i */
    int f9981i;

    /* renamed from: j */
    float f9982j;

    /* renamed from: k */
    float f9983k;

    /* renamed from: l */
    int f9984l;

    /* renamed from: m */
    int f9985m;

    /* renamed from: o */
    int f9987o;

    /* renamed from: p */
    int f9988p;

    /* renamed from: q */
    boolean f9989q;

    /* renamed from: r */
    boolean f9990r;

    /* renamed from: a */
    int f9973a = ViewDefaults.NUMBER_OF_LINES;

    /* renamed from: b */
    int f9974b = ViewDefaults.NUMBER_OF_LINES;

    /* renamed from: c */
    int f9975c = Integer.MIN_VALUE;

    /* renamed from: d */
    int f9976d = Integer.MIN_VALUE;

    /* renamed from: n */
    List<Integer> f9986n = new ArrayList();

    /* renamed from: a */
    public int m29262a() {
        return this.f9979g;
    }

    /* renamed from: b */
    public int m29261b() {
        return this.f9980h;
    }

    /* renamed from: c */
    public int m29260c() {
        return this.f9980h - this.f9981i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m29259d(View view, int i, int i2, int i3, int i4) {
        AbstractC5347b bVar = (AbstractC5347b) view.getLayoutParams();
        this.f9973a = Math.min(this.f9973a, (view.getLeft() - bVar.mo29275F()) - i);
        this.f9974b = Math.min(this.f9974b, (view.getTop() - bVar.mo29268k()) - i2);
        this.f9975c = Math.max(this.f9975c, view.getRight() + bVar.mo29274K() + i3);
        this.f9976d = Math.max(this.f9976d, view.getBottom() + bVar.mo29276E() + i4);
    }
}
