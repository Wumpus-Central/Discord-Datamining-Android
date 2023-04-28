package com.facebook.drawee.controller;

import android.content.Context;
import android.graphics.drawable.Animatable;
import com.facebook.common.internal.Supplier;
import com.facebook.datasource.C4780c;
import com.facebook.datasource.C4783e;
import com.facebook.datasource.C4787f;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.interfaces.DraweeController;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import p007a6.C1271b;
import p115g5.AbstractC7415b;
import p293q4.AbstractC11991b;
import p293q4.C11990a;
import p360u4.C13191a;
import p379v4.AbstractC13429b;
import p394w3.C13736i;
import p394w3.C13740j;

/* loaded from: classes7.dex */
public abstract class AbstractDraweeControllerBuilder<BUILDER extends AbstractDraweeControllerBuilder<BUILDER, REQUEST, IMAGE, INFO>, REQUEST, IMAGE, INFO> implements AbstractC13429b {

    /* renamed from: p */
    private static final ControllerListener<Object> f7628p = new C4792a();

    /* renamed from: q */
    private static final NullPointerException f7629q = new NullPointerException("No image request was specified!");

    /* renamed from: r */
    private static final AtomicLong f7630r = new AtomicLong();

    /* renamed from: a */
    private final Context f7631a;

    /* renamed from: b */
    private final Set<ControllerListener> f7632b;

    /* renamed from: c */
    private final Set<AbstractC7415b> f7633c;

    /* renamed from: d */
    private Object f7634d;

    /* renamed from: e */
    private REQUEST f7635e;

    /* renamed from: f */
    private REQUEST f7636f;

    /* renamed from: g */
    private REQUEST[] f7637g;

    /* renamed from: h */
    private boolean f7638h;

    /* renamed from: i */
    private Supplier<DataSource<IMAGE>> f7639i;

    /* renamed from: j */
    private ControllerListener<? super INFO> f7640j;

    /* renamed from: k */
    private boolean f7641k;

    /* renamed from: l */
    private boolean f7642l;

    /* renamed from: m */
    private boolean f7643m;

    /* renamed from: n */
    private String f7644n;

    /* renamed from: o */
    private DraweeController f7645o;

    /* renamed from: com.facebook.drawee.controller.AbstractDraweeControllerBuilder$a */
    /* loaded from: classes7.dex */
    static class C4792a extends C11990a<Object> {
        C4792a() {
        }

        @Override // p293q4.C11990a, com.facebook.drawee.controller.ControllerListener
        public void onFinalImageSet(String str, Object obj, Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.drawee.controller.AbstractDraweeControllerBuilder$b */
    /* loaded from: classes7.dex */
    public class C4793b implements Supplier<DataSource<IMAGE>> {

        /* renamed from: a */
        final /* synthetic */ DraweeController f7646a;

        /* renamed from: b */
        final /* synthetic */ String f7647b;

        /* renamed from: c */
        final /* synthetic */ Object f7648c;

        /* renamed from: d */
        final /* synthetic */ Object f7649d;

        /* renamed from: e */
        final /* synthetic */ EnumC4794c f7650e;

        C4793b(DraweeController draweeController, String str, Object obj, Object obj2, EnumC4794c cVar) {
            this.f7646a = draweeController;
            this.f7647b = str;
            this.f7648c = obj;
            this.f7649d = obj2;
            this.f7650e = cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public DataSource<IMAGE> get() {
            return AbstractDraweeControllerBuilder.this.mo31923i(this.f7646a, this.f7647b, this.f7648c, this.f7649d, this.f7650e);
        }

        public String toString() {
            return C13736i.m2846c(this).m2844b("request", this.f7648c.toString()).toString();
        }
    }

    /* renamed from: com.facebook.drawee.controller.AbstractDraweeControllerBuilder$c */
    /* loaded from: classes7.dex */
    public enum EnumC4794c {
        FULL_FETCH,
        DISK_CACHE,
        BITMAP_MEMORY_CACHE
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractDraweeControllerBuilder(Context context, Set<ControllerListener> set, Set<AbstractC7415b> set2) {
        this.f7631a = context;
        this.f7632b = set;
        this.f7633c = set2;
        m31913s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public static String m31927e() {
        return String.valueOf(f7630r.getAndIncrement());
    }

    /* renamed from: s */
    private void m31913s() {
        this.f7634d = null;
        this.f7635e = null;
        this.f7636f = null;
        this.f7637g = null;
        this.f7638h = true;
        this.f7640j = null;
        this.f7641k = false;
        this.f7642l = false;
        this.f7645o = null;
        this.f7644n = null;
    }

    /* renamed from: A */
    public BUILDER m31936A(Object obj) {
        this.f7634d = obj;
        return m31914r();
    }

    /* renamed from: B */
    public BUILDER m31935B(String str) {
        this.f7644n = str;
        return m31914r();
    }

    /* renamed from: C */
    public BUILDER m31934C(ControllerListener<? super INFO> controllerListener) {
        this.f7640j = controllerListener;
        return m31914r();
    }

    /* renamed from: D */
    public BUILDER m31933D(REQUEST request) {
        this.f7635e = request;
        return m31914r();
    }

    /* renamed from: E */
    public BUILDER m31932E(REQUEST request) {
        this.f7636f = request;
        return m31914r();
    }

    /* renamed from: F */
    public BUILDER mo3741b(DraweeController draweeController) {
        this.f7645o = draweeController;
        return m31914r();
    }

    /* renamed from: G */
    protected void m31930G() {
        boolean z;
        boolean z2 = false;
        if (this.f7637g == null || this.f7635e == null) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2831j(z, "Cannot specify both ImageRequest and FirstAvailableImageRequests!");
        if (this.f7639i == null || (this.f7637g == null && this.f7635e == null && this.f7636f == null)) {
            z2 = true;
        }
        C13740j.m2831j(z2, "Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
    }

    /* renamed from: c */
    public AbstractC4795a build() {
        REQUEST request;
        m31930G();
        if (this.f7635e == null && this.f7637g == null && (request = this.f7636f) != null) {
            this.f7635e = request;
            this.f7636f = null;
        }
        return m31928d();
    }

    /* renamed from: d */
    protected AbstractC4795a m31928d() {
        if (C1271b.m41491d()) {
            C1271b.m41494a("AbstractDraweeControllerBuilder#buildController");
        }
        AbstractC4795a w = mo31909w();
        w.m31877b0(m31915q());
        w.m31881X(m31925g());
        m31924h();
        w.m31879Z(null);
        m31910v(w);
        m31912t(w);
        if (C1271b.m41491d()) {
            C1271b.m41493b();
        }
        return w;
    }

    /* renamed from: f */
    public Object m31926f() {
        return this.f7634d;
    }

    /* renamed from: g */
    public String m31925g() {
        return this.f7644n;
    }

    /* renamed from: h */
    public AbstractC11991b m31924h() {
        return null;
    }

    /* renamed from: i */
    protected abstract DataSource<IMAGE> mo31923i(DraweeController draweeController, String str, REQUEST request, Object obj, EnumC4794c cVar);

    /* renamed from: j */
    protected Supplier<DataSource<IMAGE>> m31922j(DraweeController draweeController, String str, REQUEST request) {
        return m31921k(draweeController, str, request, EnumC4794c.FULL_FETCH);
    }

    /* renamed from: k */
    protected Supplier<DataSource<IMAGE>> m31921k(DraweeController draweeController, String str, REQUEST request, EnumC4794c cVar) {
        return new C4793b(draweeController, str, request, m31926f(), cVar);
    }

    /* renamed from: l */
    protected Supplier<DataSource<IMAGE>> m31920l(DraweeController draweeController, String str, REQUEST[] requestArr, boolean z) {
        ArrayList arrayList = new ArrayList(requestArr.length * 2);
        if (z) {
            for (REQUEST request : requestArr) {
                arrayList.add(m31921k(draweeController, str, request, EnumC4794c.BITMAP_MEMORY_CACHE));
            }
        }
        for (REQUEST request2 : requestArr) {
            arrayList.add(m31922j(draweeController, str, request2));
        }
        return C4783e.m31997b(arrayList);
    }

    /* renamed from: m */
    public REQUEST[] m31919m() {
        return this.f7637g;
    }

    /* renamed from: n */
    public REQUEST m31918n() {
        return this.f7635e;
    }

    /* renamed from: o */
    public REQUEST m31917o() {
        return this.f7636f;
    }

    /* renamed from: p */
    public DraweeController m31916p() {
        return this.f7645o;
    }

    /* renamed from: q */
    public boolean m31915q() {
        return this.f7643m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public final BUILDER m31914r() {
        return this;
    }

    /* renamed from: t */
    protected void m31912t(AbstractC4795a aVar) {
        Set<ControllerListener> set = this.f7632b;
        if (set != null) {
            for (ControllerListener controllerListener : set) {
                aVar.m31870j(controllerListener);
            }
        }
        Set<AbstractC7415b> set2 = this.f7633c;
        if (set2 != null) {
            for (AbstractC7415b bVar : set2) {
                aVar.m31869k(bVar);
            }
        }
        ControllerListener<? super INFO> controllerListener2 = this.f7640j;
        if (controllerListener2 != null) {
            aVar.m31870j(controllerListener2);
        }
        if (this.f7642l) {
            aVar.m31870j(f7628p);
        }
    }

    /* renamed from: u */
    protected void m31911u(AbstractC4795a aVar) {
        if (aVar.m31859u() == null) {
            aVar.m31878a0(C13191a.m4373c(this.f7631a));
        }
    }

    /* renamed from: v */
    protected void m31910v(AbstractC4795a aVar) {
        if (this.f7641k) {
            aVar.m31904A().m9437d(this.f7641k);
            m31911u(aVar);
        }
    }

    /* renamed from: w */
    protected abstract AbstractC4795a mo31909w();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public Supplier<DataSource<IMAGE>> m31908x(DraweeController draweeController, String str) {
        Supplier<DataSource<IMAGE>> supplier;
        Supplier<DataSource<IMAGE>> supplier2 = this.f7639i;
        if (supplier2 != null) {
            return supplier2;
        }
        REQUEST request = this.f7635e;
        if (request != null) {
            supplier = m31922j(draweeController, str, request);
        } else {
            REQUEST[] requestArr = this.f7637g;
            if (requestArr != null) {
                supplier = m31920l(draweeController, str, requestArr, this.f7638h);
            } else {
                supplier = null;
            }
        }
        if (!(supplier == null || this.f7636f == null)) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(supplier);
            arrayList.add(m31922j(draweeController, str, this.f7636f));
            supplier = C4787f.m31982c(arrayList, false);
        }
        if (supplier == null) {
            return C4780c.m32001a(f7629q);
        }
        return supplier;
    }

    /* renamed from: y */
    public BUILDER m31907y() {
        m31913s();
        return m31914r();
    }

    /* renamed from: z */
    public BUILDER m31906z(boolean z) {
        this.f7642l = z;
        return m31914r();
    }
}
