package com.facebook.drawee.controller;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import com.facebook.datasource.AbstractC4779b;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import java.util.Map;
import java.util.concurrent.Executor;
import p007a6.C1271b;
import p096f5.C7015a;
import p115g5.AbstractC7415b;
import p115g5.C7418d;
import p277p4.AbstractC11528a;
import p277p4.C11531c;
import p277p4.C11533d;
import p293q4.AbstractC11991b;
import p293q4.C11990a;
import p293q4.C11992c;
import p360u4.C13191a;
import p379v4.AbstractC13428a;
import p394w3.C13733f;
import p394w3.C13736i;
import p394w3.C13740j;
import p414x3.C13925a;

/* renamed from: com.facebook.drawee.controller.a */
/* loaded from: classes7.dex */
public abstract class AbstractC4795a<T, INFO> implements DraweeController, AbstractC11528a.AbstractC0367a, C13191a.AbstractC0427a {

    /* renamed from: v */
    private static final Map<String, Object> f7656v = C13733f.m2852of("component_tag", "drawee");

    /* renamed from: w */
    private static final Map<String, Object> f7657w = C13733f.m2851of("origin", "memory_bitmap", "origin_sub", "shortcut");

    /* renamed from: x */
    private static final Class<?> f7658x = AbstractC4795a.class;

    /* renamed from: b */
    private final AbstractC11528a f7660b;

    /* renamed from: c */
    private final Executor f7661c;

    /* renamed from: d */
    private C11533d f7662d;

    /* renamed from: e */
    private C13191a f7663e;

    /* renamed from: f */
    protected ControllerListener<INFO> f7664f;

    /* renamed from: h */
    private AbstractC13428a f7666h;

    /* renamed from: i */
    private Drawable f7667i;

    /* renamed from: j */
    private String f7668j;

    /* renamed from: k */
    private Object f7669k;

    /* renamed from: l */
    private boolean f7670l;

    /* renamed from: m */
    private boolean f7671m;

    /* renamed from: n */
    private boolean f7672n;

    /* renamed from: o */
    private boolean f7673o;

    /* renamed from: p */
    private boolean f7674p;

    /* renamed from: q */
    private String f7675q;

    /* renamed from: r */
    private DataSource<T> f7676r;

    /* renamed from: s */
    private T f7677s;

    /* renamed from: u */
    protected Drawable f7679u;

    /* renamed from: a */
    private final C11531c f7659a = C11531c.m9442a();

    /* renamed from: g */
    protected C7418d<INFO> f7665g = new C7418d<>();

    /* renamed from: t */
    private boolean f7678t = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.drawee.controller.a$a */
    /* loaded from: classes7.dex */
    public class C0112a extends AbstractC4779b<T> {

        /* renamed from: a */
        final /* synthetic */ String f7680a;

        /* renamed from: b */
        final /* synthetic */ boolean f7681b;

        C0112a(String str, boolean z) {
            this.f7680a = str;
            this.f7681b = z;
        }

        @Override // com.facebook.datasource.AbstractC4779b
        public void onFailureImpl(DataSource<T> dataSource) {
            AbstractC4795a.this.m31895J(this.f7680a, dataSource, dataSource.mo32019c(), true);
        }

        @Override // com.facebook.datasource.AbstractC4779b
        public void onNewResultImpl(DataSource<T> dataSource) {
            boolean a = dataSource.mo32020a();
            boolean f = dataSource.mo32016f();
            float e = dataSource.mo32017e();
            T g = dataSource.mo31326g();
            if (g != null) {
                AbstractC4795a.this.m31893L(this.f7680a, dataSource, g, e, a, this.f7681b, f);
            } else if (a) {
                AbstractC4795a.this.m31895J(this.f7680a, dataSource, new NullPointerException(), true);
            }
        }

        @Override // com.facebook.datasource.AbstractC4779b, com.facebook.datasource.AbstractC4782d
        public void onProgressUpdate(DataSource<T> dataSource) {
            boolean a = dataSource.mo32020a();
            AbstractC4795a.this.m31892M(this.f7680a, dataSource, dataSource.mo32017e(), a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.drawee.controller.a$b */
    /* loaded from: classes7.dex */
    public static class C4796b<INFO> extends C11992c<INFO> {
        private C4796b() {
        }

        /* renamed from: d */
        public static <INFO> C4796b<INFO> m31853d(ControllerListener<? super INFO> controllerListener, ControllerListener<? super INFO> controllerListener2) {
            if (C1271b.m41491d()) {
                C1271b.m41494a("AbstractDraweeController#createInternal");
            }
            C4796b<INFO> bVar = new C4796b<>();
            bVar.m8057a(controllerListener);
            bVar.m8057a(controllerListener2);
            if (C1271b.m41491d()) {
                C1271b.m41493b();
            }
            return bVar;
        }
    }

    public AbstractC4795a(AbstractC11528a aVar, Executor executor, String str, Object obj) {
        this.f7660b = aVar;
        this.f7661c = executor;
        m31903B(str, obj);
    }

    /* renamed from: B */
    private synchronized void m31903B(String str, Object obj) {
        AbstractC11528a aVar;
        if (C1271b.m41491d()) {
            C1271b.m41494a("AbstractDraweeController#init");
        }
        this.f7659a.m9441b(C11531c.EnumC11532a.ON_INIT_CONTROLLER);
        if (!this.f7678t && (aVar = this.f7660b) != null) {
            aVar.mo9449a(this);
        }
        this.f7670l = false;
        this.f7672n = false;
        m31890O();
        this.f7674p = false;
        C11533d dVar = this.f7662d;
        if (dVar != null) {
            dVar.m9440a();
        }
        C13191a aVar2 = this.f7663e;
        if (aVar2 != null) {
            aVar2.m4375a();
            this.f7663e.m4370f(this);
        }
        ControllerListener<INFO> controllerListener = this.f7664f;
        if (controllerListener instanceof C4796b) {
            ((C4796b) controllerListener).m8056b();
        } else {
            this.f7664f = null;
        }
        AbstractC13428a aVar3 = this.f7666h;
        if (aVar3 != null) {
            aVar3.reset();
            this.f7666h.mo3743f(null);
            this.f7666h = null;
        }
        this.f7667i = null;
        if (C13925a.m2276v(2)) {
            C13925a.m2272z(f7658x, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.f7668j, str);
        }
        this.f7668j = str;
        this.f7669k = obj;
        if (C1271b.m41491d()) {
            C1271b.m41493b();
        }
    }

    /* renamed from: D */
    private boolean m31901D(String str, DataSource<T> dataSource) {
        if (dataSource == null && this.f7676r == null) {
            return true;
        }
        if (!str.equals(this.f7668j) || dataSource != this.f7676r || !this.f7671m) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    private void m31900E(String str, Throwable th2) {
        if (C13925a.m2276v(2)) {
            C13925a.m2311A(f7658x, "controller %x %s: %s: failure: %s", Integer.valueOf(System.identityHashCode(this)), this.f7668j, str, th2);
        }
    }

    /* renamed from: F */
    private void m31899F(String str, T t) {
        if (C13925a.m2276v(2)) {
            C13925a.m2310B(f7658x, "controller %x %s: %s: image: %s %x", Integer.valueOf(System.identityHashCode(this)), this.f7668j, str, m31857w(t), Integer.valueOf(mo31856x(t)));
        }
    }

    /* renamed from: G */
    private AbstractC7415b.C7416a m31898G(DataSource<T> dataSource, INFO info, Uri uri) {
        Map<String, Object> map;
        if (dataSource == null) {
            map = null;
        } else {
            map = dataSource.getExtras();
        }
        return m31897H(map, mo31896I(info), uri);
    }

    /* renamed from: H */
    private AbstractC7415b.C7416a m31897H(Map<String, Object> map, Map<String, Object> map2, Uri uri) {
        PointF pointF;
        String str;
        AbstractC13428a aVar = this.f7666h;
        if (aVar instanceof GenericDraweeHierarchy) {
            str = String.valueOf(((GenericDraweeHierarchy) aVar).m31781m());
            pointF = ((GenericDraweeHierarchy) this.f7666h).m31782l();
        } else {
            str = null;
            pointF = null;
        }
        return C7015a.m23647a(f7656v, f7657w, map, m31860t(), str, pointF, map2, m31865o(), uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public void m31895J(String str, DataSource<T> dataSource, Throwable th2, boolean z) {
        C11531c.EnumC11532a aVar;
        Drawable drawable;
        if (C1271b.m41491d()) {
            C1271b.m41494a("AbstractDraweeController#onFailureInternal");
        }
        if (!m31901D(str, dataSource)) {
            m31900E("ignore_old_datasource @ onFailure", th2);
            dataSource.close();
            if (C1271b.m41491d()) {
                C1271b.m41493b();
                return;
            }
            return;
        }
        C11531c cVar = this.f7659a;
        if (z) {
            aVar = C11531c.EnumC11532a.ON_DATASOURCE_FAILURE;
        } else {
            aVar = C11531c.EnumC11532a.ON_DATASOURCE_FAILURE_INT;
        }
        cVar.m9441b(aVar);
        if (z) {
            m31900E("final_failed @ onFailure", th2);
            this.f7676r = null;
            this.f7673o = true;
            if (this.f7674p && (drawable = this.f7679u) != null) {
                this.f7666h.mo3744e(drawable, 1.0f, true);
            } else if (m31875d0()) {
                this.f7666h.mo3747a(th2);
            } else {
                this.f7666h.mo3746b(th2);
            }
            m31887R(th2, dataSource);
        } else {
            m31900E("intermediate_failed @ onFailure", th2);
            m31886S(th2);
        }
        if (C1271b.m41491d()) {
            C1271b.m41493b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public void m31893L(String str, DataSource<T> dataSource, T t, float f, boolean z, boolean z2, boolean z3) {
        C11531c.EnumC11532a aVar;
        try {
            if (C1271b.m41491d()) {
                C1271b.m41494a("AbstractDraweeController#onNewResultInternal");
            }
            if (!m31901D(str, dataSource)) {
                m31899F("ignore_old_datasource @ onNewResult", t);
                mo31889P(t);
                dataSource.close();
                if (C1271b.m41491d()) {
                    C1271b.m41493b();
                    return;
                }
                return;
            }
            C11531c cVar = this.f7659a;
            if (z) {
                aVar = C11531c.EnumC11532a.ON_DATASOURCE_RESULT;
            } else {
                aVar = C11531c.EnumC11532a.ON_DATASOURCE_RESULT_INT;
            }
            cVar.m9441b(aVar);
            try {
                Drawable l = mo31868l(t);
                T t2 = this.f7677s;
                Drawable drawable = this.f7679u;
                this.f7677s = t;
                this.f7679u = l;
                if (z) {
                    m31899F("set_final_result @ onNewResult", t);
                    this.f7676r = null;
                    this.f7666h.mo3744e(l, 1.0f, z2);
                    m31882W(str, t, dataSource);
                } else if (z3) {
                    m31899F("set_temporary_result @ onNewResult", t);
                    this.f7666h.mo3744e(l, 1.0f, z2);
                    m31882W(str, t, dataSource);
                } else {
                    m31899F("set_intermediate_result @ onNewResult", t);
                    this.f7666h.mo3744e(l, f, z2);
                    m31885T(str, t);
                }
                if (!(drawable == null || drawable == l)) {
                    mo31891N(drawable);
                }
                if (!(t2 == null || t2 == t)) {
                    m31899F("release_previous_result @ onNewResult", t2);
                    mo31889P(t2);
                }
                if (C1271b.m41491d()) {
                    C1271b.m41493b();
                }
            } catch (Exception e) {
                m31899F("drawable_failed @ onNewResult", t);
                mo31889P(t);
                m31895J(str, dataSource, e, z);
                if (C1271b.m41491d()) {
                    C1271b.m41493b();
                }
            }
        } catch (Throwable th2) {
            if (C1271b.m41491d()) {
                C1271b.m41493b();
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public void m31892M(String str, DataSource<T> dataSource, float f, boolean z) {
        if (!m31901D(str, dataSource)) {
            m31900E("ignore_old_datasource @ onProgress", null);
            dataSource.close();
        } else if (!z) {
            this.f7666h.mo3745c(f, false);
        }
    }

    /* renamed from: O */
    private void m31890O() {
        Map<String, Object> map;
        boolean z = this.f7671m;
        this.f7671m = false;
        this.f7673o = false;
        DataSource<T> dataSource = this.f7676r;
        Map<String, Object> map2 = null;
        if (dataSource != null) {
            map = dataSource.getExtras();
            this.f7676r.close();
            this.f7676r = null;
        } else {
            map = null;
        }
        Drawable drawable = this.f7679u;
        if (drawable != null) {
            mo31891N(drawable);
        }
        if (this.f7675q != null) {
            this.f7675q = null;
        }
        this.f7679u = null;
        T t = this.f7677s;
        if (t != null) {
            Map<String, Object> I = mo31896I(mo31855y(t));
            m31899F("release", this.f7677s);
            mo31889P(this.f7677s);
            this.f7677s = null;
            map2 = I;
        }
        if (z) {
            m31884U(map, map2);
        }
    }

    /* renamed from: R */
    private void m31887R(Throwable th2, DataSource<T> dataSource) {
        AbstractC7415b.C7416a G = m31898G(dataSource, null, null);
        m31864p().onFailure(this.f7668j, th2);
        m31863q().mo10512l(this.f7668j, th2, G);
    }

    /* renamed from: S */
    private void m31886S(Throwable th2) {
        m31864p().onIntermediateImageFailed(this.f7668j, th2);
        m31863q().mo22717h(this.f7668j);
    }

    /* renamed from: T */
    private void m31885T(String str, T t) {
        INFO y = mo31855y(t);
        m31864p().onIntermediateImageSet(str, y);
        m31863q().onIntermediateImageSet(str, y);
    }

    /* renamed from: U */
    private void m31884U(Map<String, Object> map, Map<String, Object> map2) {
        m31864p().onRelease(this.f7668j);
        m31863q().mo10514g(this.f7668j, m31897H(map, map2, null));
    }

    /* renamed from: W */
    private void m31882W(String str, T t, DataSource<T> dataSource) {
        INFO y = mo31855y(t);
        m31864p().onFinalImageSet(str, y, m31867m());
        m31863q().mo10513i(str, y, m31898G(dataSource, y, null));
    }

    /* renamed from: d0 */
    private boolean m31875d0() {
        C11533d dVar;
        return this.f7673o && (dVar = this.f7662d) != null && dVar.m9436e();
    }

    /* renamed from: t */
    private Rect m31860t() {
        AbstractC13428a aVar = this.f7666h;
        if (aVar == null) {
            return null;
        }
        return aVar.getBounds();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A */
    public C11533d m31904A() {
        if (this.f7662d == null) {
            this.f7662d = new C11533d();
        }
        return this.f7662d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: C */
    public void m31902C(String str, Object obj) {
        m31903B(str, obj);
        this.f7678t = false;
    }

    /* renamed from: I */
    public abstract Map<String, Object> mo31896I(INFO info);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: K */
    public void mo31894K(String str, T t) {
    }

    /* renamed from: N */
    protected abstract void mo31891N(Drawable drawable);

    /* renamed from: P */
    protected abstract void mo31889P(T t);

    /* renamed from: Q */
    public void m31888Q(AbstractC7415b<INFO> bVar) {
        this.f7665g.m22714r(bVar);
    }

    /* renamed from: V */
    protected void m31883V(DataSource<T> dataSource, INFO info) {
        m31864p().onSubmit(this.f7668j, this.f7669k);
        m31863q().mo10515b(this.f7668j, this.f7669k, m31898G(dataSource, info, mo31854z()));
    }

    /* renamed from: X */
    public void m31881X(String str) {
        this.f7675q = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Y */
    public void m31880Y(Drawable drawable) {
        this.f7667i = drawable;
        AbstractC13428a aVar = this.f7666h;
        if (aVar != null) {
            aVar.mo3743f(drawable);
        }
    }

    /* renamed from: Z */
    public void m31879Z(AbstractC11991b bVar) {
    }

    @Override // com.facebook.drawee.interfaces.DraweeController
    /* renamed from: a */
    public void mo31697a() {
        if (C1271b.m41491d()) {
            C1271b.m41494a("AbstractDraweeController#onDetach");
        }
        if (C13925a.m2276v(2)) {
            C13925a.m2273y(f7658x, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(this)), this.f7668j);
        }
        this.f7659a.m9441b(C11531c.EnumC11532a.ON_DETACH_CONTROLLER);
        this.f7670l = false;
        this.f7660b.mo9448d(this);
        if (C1271b.m41491d()) {
            C1271b.m41493b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a0 */
    public void m31878a0(C13191a aVar) {
        this.f7663e = aVar;
        if (aVar != null) {
            aVar.m4370f(this);
        }
    }

    @Override // com.facebook.drawee.interfaces.DraweeController
    /* renamed from: b */
    public boolean mo31696b(MotionEvent motionEvent) {
        if (C13925a.m2276v(2)) {
            C13925a.m2272z(f7658x, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.f7668j, motionEvent);
        }
        C13191a aVar = this.f7663e;
        if (aVar == null) {
            return false;
        }
        if (!aVar.m4374b() && !m31876c0()) {
            return false;
        }
        this.f7663e.m4372d(motionEvent);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b0 */
    public void m31877b0(boolean z) {
        this.f7674p = z;
    }

    @Override // p360u4.C13191a.AbstractC0427a
    /* renamed from: c */
    public boolean mo4369c() {
        if (C13925a.m2276v(2)) {
            C13925a.m2273y(f7658x, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(this)), this.f7668j);
        }
        if (!m31875d0()) {
            return false;
        }
        this.f7662d.m9439b();
        this.f7666h.reset();
        m31874e0();
        return true;
    }

    /* renamed from: c0 */
    protected boolean m31876c0() {
        return m31875d0();
    }

    @Override // com.facebook.drawee.interfaces.DraweeController
    /* renamed from: d */
    public void mo31695d() {
        String str;
        if (C1271b.m41491d()) {
            C1271b.m41494a("AbstractDraweeController#onAttach");
        }
        if (C13925a.m2276v(2)) {
            Class<?> cls = f7658x;
            Integer valueOf = Integer.valueOf(System.identityHashCode(this));
            String str2 = this.f7668j;
            if (this.f7671m) {
                str = "request already submitted";
            } else {
                str = "request needs submit";
            }
            C13925a.m2272z(cls, "controller %x %s: onAttach: %s", valueOf, str2, str);
        }
        this.f7659a.m9441b(C11531c.EnumC11532a.ON_ATTACH_CONTROLLER);
        C13740j.m2834g(this.f7666h);
        this.f7660b.mo9449a(this);
        this.f7670l = true;
        if (!this.f7671m) {
            m31874e0();
        }
        if (C1271b.m41491d()) {
            C1271b.m41493b();
        }
    }

    @Override // com.facebook.drawee.interfaces.DraweeController
    /* renamed from: e */
    public void mo31694e(DraweeHierarchy draweeHierarchy) {
        C11531c.EnumC11532a aVar;
        if (C13925a.m2276v(2)) {
            C13925a.m2272z(f7658x, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.f7668j, draweeHierarchy);
        }
        C11531c cVar = this.f7659a;
        if (draweeHierarchy != null) {
            aVar = C11531c.EnumC11532a.ON_SET_HIERARCHY;
        } else {
            aVar = C11531c.EnumC11532a.ON_CLEAR_HIERARCHY;
        }
        cVar.m9441b(aVar);
        if (this.f7671m) {
            this.f7660b.mo9449a(this);
            release();
        }
        AbstractC13428a aVar2 = this.f7666h;
        if (aVar2 != null) {
            aVar2.mo3743f(null);
            this.f7666h = null;
        }
        if (draweeHierarchy != null) {
            C13740j.m2839b(Boolean.valueOf(draweeHierarchy instanceof AbstractC13428a));
            AbstractC13428a aVar3 = (AbstractC13428a) draweeHierarchy;
            this.f7666h = aVar3;
            aVar3.mo3743f(this.f7667i);
        }
    }

    /* renamed from: e0 */
    protected void m31874e0() {
        if (C1271b.m41491d()) {
            C1271b.m41494a("AbstractDraweeController#submitRequest");
        }
        T n = mo31866n();
        if (n != null) {
            if (C1271b.m41491d()) {
                C1271b.m41494a("AbstractDraweeController#submitRequest->cache");
            }
            this.f7676r = null;
            this.f7671m = true;
            this.f7673o = false;
            this.f7659a.m9441b(C11531c.EnumC11532a.ON_SUBMIT_CACHE_HIT);
            m31883V(this.f7676r, mo31855y(n));
            mo31894K(this.f7668j, n);
            m31893L(this.f7668j, this.f7676r, n, 1.0f, true, true, true);
            if (C1271b.m41491d()) {
                C1271b.m41493b();
            }
            if (C1271b.m41491d()) {
                C1271b.m41493b();
                return;
            }
            return;
        }
        this.f7659a.m9441b(C11531c.EnumC11532a.ON_DATASOURCE_SUBMIT);
        this.f7666h.mo3745c(0.0f, true);
        this.f7671m = true;
        this.f7673o = false;
        DataSource<T> s = mo31861s();
        this.f7676r = s;
        m31883V(s, null);
        if (C13925a.m2276v(2)) {
            C13925a.m2272z(f7658x, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.f7668j, Integer.valueOf(System.identityHashCode(this.f7676r)));
        }
        this.f7676r.mo32018d(new C0112a(this.f7668j, this.f7676r.mo31971b()), this.f7661c);
        if (C1271b.m41491d()) {
            C1271b.m41493b();
        }
    }

    @Override // com.facebook.drawee.interfaces.DraweeController
    /* renamed from: f */
    public DraweeHierarchy mo31693f() {
        return this.f7666h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public void m31870j(ControllerListener<? super INFO> controllerListener) {
        C13740j.m2834g(controllerListener);
        ControllerListener<INFO> controllerListener2 = this.f7664f;
        if (controllerListener2 instanceof C4796b) {
            ((C4796b) controllerListener2).m8057a(controllerListener);
        } else if (controllerListener2 != null) {
            this.f7664f = C4796b.m31853d(controllerListener2, controllerListener);
        } else {
            this.f7664f = controllerListener;
        }
    }

    /* renamed from: k */
    public void m31869k(AbstractC7415b<INFO> bVar) {
        this.f7665g.m22716n(bVar);
    }

    /* renamed from: l */
    protected abstract Drawable mo31868l(T t);

    /* renamed from: m */
    public Animatable m31867m() {
        Drawable drawable = this.f7679u;
        if (drawable instanceof Animatable) {
            return (Animatable) drawable;
        }
        return null;
    }

    /* renamed from: n */
    protected T mo31866n() {
        return null;
    }

    /* renamed from: o */
    public Object m31865o() {
        return this.f7669k;
    }

    /* renamed from: p */
    protected ControllerListener<INFO> m31864p() {
        ControllerListener<INFO> controllerListener = this.f7664f;
        if (controllerListener == null) {
            return C11990a.m8058a();
        }
        return controllerListener;
    }

    /* renamed from: q */
    protected AbstractC7415b<INFO> m31863q() {
        return this.f7665g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public Drawable m31862r() {
        return this.f7667i;
    }

    @Override // p277p4.AbstractC11528a.AbstractC0367a
    public void release() {
        this.f7659a.m9441b(C11531c.EnumC11532a.ON_RELEASE_CONTROLLER);
        C11533d dVar = this.f7662d;
        if (dVar != null) {
            dVar.m9438c();
        }
        C13191a aVar = this.f7663e;
        if (aVar != null) {
            aVar.m4371e();
        }
        AbstractC13428a aVar2 = this.f7666h;
        if (aVar2 != null) {
            aVar2.reset();
        }
        m31890O();
    }

    /* renamed from: s */
    protected abstract DataSource<T> mo31861s();

    public String toString() {
        return C13736i.m2846c(this).m2843c("isAttached", this.f7670l).m2843c("isRequestSubmitted", this.f7671m).m2843c("hasFetchFailed", this.f7673o).m2845a("fetchedImage", mo31856x(this.f7677s)).m2844b("events", this.f7659a.toString()).toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public C13191a m31859u() {
        return this.f7663e;
    }

    /* renamed from: v */
    public String m31858v() {
        return this.f7668j;
    }

    /* renamed from: w */
    protected String m31857w(T t) {
        return t != null ? t.getClass().getSimpleName() : "<null>";
    }

    /* renamed from: x */
    protected int mo31856x(T t) {
        return System.identityHashCode(t);
    }

    /* renamed from: y */
    protected abstract INFO mo31855y(T t);

    /* renamed from: z */
    protected Uri mo31854z() {
        return null;
    }
}
