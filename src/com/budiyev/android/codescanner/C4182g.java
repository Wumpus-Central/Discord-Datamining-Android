package com.budiyev.android.codescanner;

import android.hardware.Camera;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.budiyev.android.codescanner.g */
/* loaded from: classes.dex */
public final class C4182g {

    /* renamed from: a */
    private final Camera f7086a;

    /* renamed from: b */
    private final Camera.CameraInfo f7087b;

    /* renamed from: c */
    private final C4178f f7088c;

    /* renamed from: d */
    private final C4184i f7089d;

    /* renamed from: e */
    private final C4184i f7090e;

    /* renamed from: f */
    private final C4184i f7091f;

    /* renamed from: g */
    private final int f7092g;

    /* renamed from: h */
    private final boolean f7093h;

    /* renamed from: i */
    private final boolean f7094i;

    /* renamed from: j */
    private final boolean f7095j;

    public C4182g(Camera camera, Camera.CameraInfo cameraInfo, C4178f fVar, C4184i iVar, C4184i iVar2, C4184i iVar3, int i, boolean z, boolean z2) {
        this.f7086a = camera;
        this.f7087b = cameraInfo;
        this.f7088c = fVar;
        this.f7089d = iVar;
        this.f7090e = iVar2;
        this.f7091f = iVar3;
        this.f7092g = i;
        this.f7093h = cameraInfo.facing != 1 ? false : true;
        this.f7094i = z;
        this.f7095j = z2;
    }

    /* renamed from: a */
    public Camera m32427a() {
        return this.f7086a;
    }

    /* renamed from: b */
    public C4178f m32426b() {
        return this.f7088c;
    }

    /* renamed from: c */
    public int m32425c() {
        return this.f7092g;
    }

    /* renamed from: d */
    public C4184i m32424d() {
        return this.f7089d;
    }

    /* renamed from: e */
    public C4184i m32423e() {
        return this.f7090e;
    }

    /* renamed from: f */
    public C4184i m32422f() {
        return this.f7091f;
    }

    /* renamed from: g */
    public boolean m32421g() {
        return this.f7094i;
    }

    /* renamed from: h */
    public boolean m32420h() {
        return this.f7095j;
    }

    /* renamed from: i */
    public void m32419i() {
        this.f7086a.release();
        this.f7088c.m32430l();
    }

    /* renamed from: j */
    public boolean m32418j() {
        return this.f7093h;
    }
}
