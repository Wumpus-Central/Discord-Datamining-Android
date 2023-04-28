package com.facebook.drawee.generic;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.react.views.image.ReactImageView;
import java.util.Arrays;
import java.util.List;
import p394w3.C13740j;

/* loaded from: classes7.dex */
public class GenericDraweeHierarchyBuilder {

    /* renamed from: t */
    public static final ScalingUtils.ScaleType f7805t = ScalingUtils.ScaleType.f7710h;

    /* renamed from: u */
    public static final ScalingUtils.ScaleType f7806u = ScalingUtils.ScaleType.f7711i;

    /* renamed from: a */
    private Resources f7807a;

    /* renamed from: b */
    private int f7808b;

    /* renamed from: c */
    private float f7809c;

    /* renamed from: d */
    private Drawable f7810d;

    /* renamed from: e */
    private ScalingUtils.ScaleType f7811e;

    /* renamed from: f */
    private Drawable f7812f;

    /* renamed from: g */
    private ScalingUtils.ScaleType f7813g;

    /* renamed from: h */
    private Drawable f7814h;

    /* renamed from: i */
    private ScalingUtils.ScaleType f7815i;

    /* renamed from: j */
    private Drawable f7816j;

    /* renamed from: k */
    private ScalingUtils.ScaleType f7817k;

    /* renamed from: l */
    private ScalingUtils.ScaleType f7818l;

    /* renamed from: m */
    private Matrix f7819m;

    /* renamed from: n */
    private PointF f7820n;

    /* renamed from: o */
    private ColorFilter f7821o;

    /* renamed from: p */
    private Drawable f7822p;

    /* renamed from: q */
    private List<Drawable> f7823q;

    /* renamed from: r */
    private Drawable f7824r;

    /* renamed from: s */
    private C4830a f7825s;

    public GenericDraweeHierarchyBuilder(Resources resources) {
        this.f7807a = resources;
        m31736t();
    }

    /* renamed from: L */
    private void m31756L() {
        List<Drawable> list = this.f7823q;
        if (list != null) {
            for (Drawable drawable : list) {
                C13740j.m2834g(drawable);
            }
        }
    }

    /* renamed from: t */
    private void m31736t() {
        this.f7808b = ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS;
        this.f7809c = 0.0f;
        this.f7810d = null;
        ScalingUtils.ScaleType scaleType = f7805t;
        this.f7811e = scaleType;
        this.f7812f = null;
        this.f7813g = scaleType;
        this.f7814h = null;
        this.f7815i = scaleType;
        this.f7816j = null;
        this.f7817k = scaleType;
        this.f7818l = f7806u;
        this.f7819m = null;
        this.f7820n = null;
        this.f7821o = null;
        this.f7822p = null;
        this.f7823q = null;
        this.f7824r = null;
        this.f7825s = null;
    }

    /* renamed from: u */
    public static GenericDraweeHierarchyBuilder m31735u(Resources resources) {
        return new GenericDraweeHierarchyBuilder(resources);
    }

    /* renamed from: A */
    public GenericDraweeHierarchyBuilder m31767A(Drawable drawable) {
        this.f7814h = drawable;
        return this;
    }

    /* renamed from: B */
    public GenericDraweeHierarchyBuilder m31766B(ScalingUtils.ScaleType scaleType) {
        this.f7815i = scaleType;
        return this;
    }

    /* renamed from: C */
    public GenericDraweeHierarchyBuilder m31765C(Drawable drawable) {
        if (drawable == null) {
            this.f7823q = null;
        } else {
            this.f7823q = Arrays.asList(drawable);
        }
        return this;
    }

    /* renamed from: D */
    public GenericDraweeHierarchyBuilder m31764D(Drawable drawable) {
        this.f7810d = drawable;
        return this;
    }

    /* renamed from: E */
    public GenericDraweeHierarchyBuilder m31763E(ScalingUtils.ScaleType scaleType) {
        this.f7811e = scaleType;
        return this;
    }

    /* renamed from: F */
    public GenericDraweeHierarchyBuilder m31762F(Drawable drawable) {
        if (drawable == null) {
            this.f7824r = null;
        } else {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842919}, drawable);
            this.f7824r = stateListDrawable;
        }
        return this;
    }

    /* renamed from: G */
    public GenericDraweeHierarchyBuilder m31761G(Drawable drawable) {
        this.f7816j = drawable;
        return this;
    }

    /* renamed from: H */
    public GenericDraweeHierarchyBuilder m31760H(ScalingUtils.ScaleType scaleType) {
        this.f7817k = scaleType;
        return this;
    }

    /* renamed from: I */
    public GenericDraweeHierarchyBuilder m31759I(Drawable drawable) {
        this.f7812f = drawable;
        return this;
    }

    /* renamed from: J */
    public GenericDraweeHierarchyBuilder m31758J(ScalingUtils.ScaleType scaleType) {
        this.f7813g = scaleType;
        return this;
    }

    /* renamed from: K */
    public GenericDraweeHierarchyBuilder m31757K(C4830a aVar) {
        this.f7825s = aVar;
        return this;
    }

    /* renamed from: a */
    public GenericDraweeHierarchy m31755a() {
        m31756L();
        return new GenericDraweeHierarchy(this);
    }

    /* renamed from: b */
    public ColorFilter m31754b() {
        return this.f7821o;
    }

    /* renamed from: c */
    public PointF m31753c() {
        return this.f7820n;
    }

    /* renamed from: d */
    public ScalingUtils.ScaleType m31752d() {
        return this.f7818l;
    }

    /* renamed from: e */
    public Drawable m31751e() {
        return this.f7822p;
    }

    /* renamed from: f */
    public float m31750f() {
        return this.f7809c;
    }

    /* renamed from: g */
    public int m31749g() {
        return this.f7808b;
    }

    /* renamed from: h */
    public Drawable m31748h() {
        return this.f7814h;
    }

    /* renamed from: i */
    public ScalingUtils.ScaleType m31747i() {
        return this.f7815i;
    }

    /* renamed from: j */
    public List<Drawable> m31746j() {
        return this.f7823q;
    }

    /* renamed from: k */
    public Drawable m31745k() {
        return this.f7810d;
    }

    /* renamed from: l */
    public ScalingUtils.ScaleType m31744l() {
        return this.f7811e;
    }

    /* renamed from: m */
    public Drawable m31743m() {
        return this.f7824r;
    }

    /* renamed from: n */
    public Drawable m31742n() {
        return this.f7816j;
    }

    /* renamed from: o */
    public ScalingUtils.ScaleType m31741o() {
        return this.f7817k;
    }

    /* renamed from: p */
    public Resources m31740p() {
        return this.f7807a;
    }

    /* renamed from: q */
    public Drawable m31739q() {
        return this.f7812f;
    }

    /* renamed from: r */
    public ScalingUtils.ScaleType m31738r() {
        return this.f7813g;
    }

    /* renamed from: s */
    public C4830a m31737s() {
        return this.f7825s;
    }

    /* renamed from: v */
    public GenericDraweeHierarchyBuilder m31734v(ColorFilter colorFilter) {
        this.f7821o = colorFilter;
        return this;
    }

    /* renamed from: w */
    public GenericDraweeHierarchyBuilder m31733w(ScalingUtils.ScaleType scaleType) {
        this.f7818l = scaleType;
        this.f7819m = null;
        return this;
    }

    /* renamed from: x */
    public GenericDraweeHierarchyBuilder m31732x(Drawable drawable) {
        this.f7822p = drawable;
        return this;
    }

    /* renamed from: y */
    public GenericDraweeHierarchyBuilder m31731y(float f) {
        this.f7809c = f;
        return this;
    }

    /* renamed from: z */
    public GenericDraweeHierarchyBuilder m31730z(int i) {
        this.f7808b = i;
        return this;
    }
}
