package p321rc;

import android.content.Context;
import android.util.Base64OutputStream;
import androidx.core.p018os.C2461v;
import cd.AbstractC3987i;
import com.google.android.gms.tasks.C5474b;
import com.google.android.gms.tasks.Task;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import p136hc.C7984d;
import p177jc.AbstractC9528e;
import p177jc.AbstractC9534h;
import p177jc.C9523d;
import p177jc.C9548q;
import p321rc.AbstractC12564k;
import tc.AbstractC13053b;

/* renamed from: rc.g */
/* loaded from: classes3.dex */
public class C12559g implements AbstractC12563j, AbstractC12564k {

    /* renamed from: f */
    private static final ThreadFactory f28243f = new ThreadFactory() { // from class: rc.b
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread m;
            m = C12559g.m6553m(runnable);
            return m;
        }
    };

    /* renamed from: a */
    private final AbstractC13053b<C12566l> f28244a;

    /* renamed from: b */
    private final Context f28245b;

    /* renamed from: c */
    private final AbstractC13053b<AbstractC3987i> f28246c;

    /* renamed from: d */
    private final Set<AbstractC12560h> f28247d;

    /* renamed from: e */
    private final Executor f28248e;

    private C12559g(final Context context, final String str, Set<AbstractC12560h> set, AbstractC13053b<AbstractC3987i> bVar) {
        this(new AbstractC13053b() { // from class: rc.f
            @Override // tc.AbstractC13053b
            public final Object get() {
                C12566l k;
                k = C12559g.m6555k(context, str);
                return k;
            }
        }, set, new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f28243f), bVar, context);
    }

    /* renamed from: h */
    public static C9523d<C12559g> m6558h() {
        return C9523d.m16091d(C12559g.class, AbstractC12563j.class, AbstractC12564k.class).m16077b(C9548q.m16018i(Context.class)).m16077b(C9548q.m16018i(C7984d.class)).m16077b(C9548q.m16016k(AbstractC12560h.class)).m16077b(C9548q.m16017j(AbstractC3987i.class)).m16074e(new AbstractC9534h() { // from class: rc.e
            @Override // p177jc.AbstractC9534h
            /* renamed from: a */
            public final Object mo4207a(AbstractC9528e eVar) {
                C12559g i;
                i = C12559g.m6557i(eVar);
                return i;
            }
        }).m16075d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ C12559g m6557i(AbstractC9528e eVar) {
        return new C12559g((Context) eVar.mo16062a(Context.class), ((C7984d) eVar.mo16062a(C7984d.class)).m20963n(), eVar.mo16060c(AbstractC12560h.class), eVar.mo16059d(AbstractC3987i.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ String m6556j() {
        String byteArrayOutputStream;
        synchronized (this) {
            C12566l lVar = this.f28244a.get();
            List<AbstractC12567m> c = lVar.m6545c();
            lVar.m6546b();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < c.size(); i++) {
                AbstractC12567m mVar = c.get(i);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", mVar.mo6533c());
                jSONObject.put("dates", new JSONArray((Collection) mVar.mo6534b()));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put("version", "2");
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
            try {
                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                gZIPOutputStream.close();
                base64OutputStream.close();
                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
            } catch (Throwable th2) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        return byteArrayOutputStream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static /* synthetic */ C12566l m6555k(Context context, String str) {
        return new C12566l(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ Void m6554l() {
        synchronized (this) {
            this.f28244a.get().m6537k(System.currentTimeMillis(), this.f28246c.get().mo33195a());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static /* synthetic */ Thread m6553m(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }

    @Override // p321rc.AbstractC12563j
    /* renamed from: a */
    public Task<String> mo6550a() {
        if (!C2461v.m37712a(this.f28245b)) {
            return C5474b.m28893e("");
        }
        return C5474b.m28895c(this.f28248e, new Callable() { // from class: rc.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String j;
                j = C12559g.this.m6556j();
                return j;
            }
        });
    }

    @Override // p321rc.AbstractC12564k
    /* renamed from: b */
    public synchronized AbstractC12564k.EnumC12565a mo6549b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        C12566l lVar = this.f28244a.get();
        if (lVar.m6539i(currentTimeMillis)) {
            lVar.m6541g();
            return AbstractC12564k.EnumC12565a.GLOBAL;
        }
        return AbstractC12564k.EnumC12565a.NONE;
    }

    /* renamed from: n */
    public Task<Void> m6552n() {
        if (this.f28247d.size() <= 0) {
            return C5474b.m28893e(null);
        }
        if (!C2461v.m37712a(this.f28245b)) {
            return C5474b.m28893e(null);
        }
        return C5474b.m28895c(this.f28248e, new Callable() { // from class: rc.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void l;
                l = C12559g.this.m6554l();
                return l;
            }
        });
    }

    C12559g(AbstractC13053b<C12566l> bVar, Set<AbstractC12560h> set, Executor executor, AbstractC13053b<AbstractC3987i> bVar2, Context context) {
        this.f28244a = bVar;
        this.f28247d = set;
        this.f28248e = executor;
        this.f28246c = bVar2;
        this.f28245b = context;
    }
}
