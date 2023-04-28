package p415x4;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p415x4.AbstractC13928a;

/* renamed from: x4.b */
/* loaded from: classes7.dex */
public class C13929b<T extends AbstractC13928a> implements AbstractC13928a {

    /* renamed from: a */
    private T f31390a;

    /* renamed from: b */
    private int f31391b = -1;

    /* renamed from: c */
    private ColorFilter f31392c;

    /* renamed from: d */
    private Rect f31393d;

    public C13929b(T t) {
        this.f31390a = t;
    }

    @Override // p415x4.AbstractC13933d
    /* renamed from: a */
    public int mo1344a() {
        T t = this.f31390a;
        if (t == null) {
            return 0;
        }
        return t.mo1344a();
    }

    @Override // p415x4.AbstractC13933d
    /* renamed from: b */
    public int mo1343b() {
        T t = this.f31390a;
        if (t == null) {
            return 0;
        }
        return t.mo1343b();
    }

    @Override // p415x4.AbstractC13928a
    /* renamed from: c */
    public int mo1342c() {
        T t = this.f31390a;
        if (t == null) {
            return -1;
        }
        return t.mo1342c();
    }

    @Override // p415x4.AbstractC13928a
    public void clear() {
        T t = this.f31390a;
        if (t != null) {
            t.clear();
        }
    }

    @Override // p415x4.AbstractC13928a
    /* renamed from: d */
    public void mo1341d(Rect rect) {
        T t = this.f31390a;
        if (t != null) {
            t.mo1341d(rect);
        }
        this.f31393d = rect;
    }

    @Override // p415x4.AbstractC13928a
    /* renamed from: e */
    public int mo1340e() {
        T t = this.f31390a;
        if (t == null) {
            return -1;
        }
        return t.mo1340e();
    }

    @Override // p415x4.AbstractC13928a
    /* renamed from: f */
    public void mo1339f(ColorFilter colorFilter) {
        T t = this.f31390a;
        if (t != null) {
            t.mo1339f(colorFilter);
        }
        this.f31392c = colorFilter;
    }

    @Override // p415x4.AbstractC13928a
    /* renamed from: g */
    public boolean mo1338g(Drawable drawable, Canvas canvas, int i) {
        T t = this.f31390a;
        return t != null && t.mo1338g(drawable, canvas, i);
    }

    @Override // p415x4.AbstractC13933d
    /* renamed from: i */
    public int mo1336i(int i) {
        T t = this.f31390a;
        if (t == null) {
            return 0;
        }
        return t.mo1336i(i);
    }

    @Override // p415x4.AbstractC13928a
    /* renamed from: j */
    public void mo1335j(int i) {
        T t = this.f31390a;
        if (t != null) {
            t.mo1335j(i);
        }
        this.f31391b = i;
    }
}
