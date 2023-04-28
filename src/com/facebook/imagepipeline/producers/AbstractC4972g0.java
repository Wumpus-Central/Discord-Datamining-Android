package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.imagepipeline.common.Priority;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import p007a6.C1271b;
import p076e4.EnumC6704e;
import p394w3.C13740j;
import p394w3.C13742l;

/* renamed from: com.facebook.imagepipeline.producers.g0 */
/* loaded from: classes7.dex */
public abstract class AbstractC4972g0<K, T extends Closeable> implements AbstractC5001l0<T> {

    /* renamed from: a */
    final Map<K, AbstractC4972g0<K, T>.C4974b> f8430a;

    /* renamed from: b */
    private final AbstractC5001l0<T> f8431b;

    /* renamed from: c */
    private final boolean f8432c;

    /* renamed from: d */
    private final String f8433d;

    /* renamed from: e */
    private final String f8434e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.producers.g0$b */
    /* loaded from: classes7.dex */
    public class C4974b {

        /* renamed from: a */
        private final K f8435a;

        /* renamed from: b */
        private final CopyOnWriteArraySet<Pair<Consumer<T>, ProducerContext>> f8436b = C13742l.m2829a();

        /* renamed from: c */
        private T f8437c;

        /* renamed from: d */
        private float f8438d;

        /* renamed from: e */
        private int f8439e;

        /* renamed from: f */
        private C4963d f8440f;

        /* renamed from: g */
        private AbstractC4972g0<K, T>.C4974b.C0123b f8441g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.facebook.imagepipeline.producers.g0$b$a */
        /* loaded from: classes7.dex */
        public class C4975a extends C4965e {

            /* renamed from: a */
            final /* synthetic */ Pair f8443a;

            C4975a(Pair pair) {
                this.f8443a = pair;
            }

            @Override // com.facebook.imagepipeline.producers.C4965e, com.facebook.imagepipeline.producers.AbstractC5008m0
            /* renamed from: a */
            public void mo30969a() {
                C4963d.m31153r(C4974b.this.m31106r());
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC5008m0
            /* renamed from: b */
            public void mo30945b() {
                boolean remove;
                List list;
                List list2;
                List list3;
                C4963d dVar;
                synchronized (C4974b.this) {
                    remove = C4974b.this.f8436b.remove(this.f8443a);
                    list = null;
                    if (!remove) {
                        dVar = null;
                        list3 = null;
                    } else if (C4974b.this.f8436b.isEmpty()) {
                        dVar = C4974b.this.f8440f;
                        list3 = null;
                    } else {
                        List s = C4974b.this.m31105s();
                        list3 = C4974b.this.m31104t();
                        list2 = C4974b.this.m31106r();
                        dVar = null;
                        list = s;
                    }
                    list2 = list3;
                }
                C4963d.m31152s(list);
                C4963d.m31151t(list3);
                C4963d.m31153r(list2);
                if (dVar != null) {
                    if (!AbstractC4972g0.this.f8432c || dVar.mo31157n()) {
                        dVar.m31150u();
                    } else {
                        C4963d.m31151t(dVar.m31146y(Priority.LOW));
                    }
                }
                if (remove) {
                    ((Consumer) this.f8443a.first).mo31200a();
                }
            }

            @Override // com.facebook.imagepipeline.producers.C4965e, com.facebook.imagepipeline.producers.AbstractC5008m0
            /* renamed from: c */
            public void mo31004c() {
                C4963d.m31151t(C4974b.this.m31104t());
            }

            @Override // com.facebook.imagepipeline.producers.C4965e, com.facebook.imagepipeline.producers.AbstractC5008m0
            /* renamed from: d */
            public void mo31003d() {
                C4963d.m31152s(C4974b.this.m31105s());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.facebook.imagepipeline.producers.g0$b$b */
        /* loaded from: classes7.dex */
        public class C0123b extends AbstractC4954b<T> {
            private C0123b() {
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC4954b
            /* renamed from: f */
            protected void mo30932f() {
                try {
                    if (C1271b.m41491d()) {
                        C1271b.m41494a("MultiplexProducer#onCancellation");
                    }
                    C4974b.this.m31111m(this);
                } finally {
                    if (C1271b.m41491d()) {
                        C1271b.m41493b();
                    }
                }
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC4954b
            /* renamed from: g */
            protected void mo30913g(Throwable th2) {
                try {
                    if (C1271b.m41491d()) {
                        C1271b.m41494a("MultiplexProducer#onFailure");
                    }
                    C4974b.this.m31110n(this, th2);
                } finally {
                    if (C1271b.m41491d()) {
                        C1271b.m41493b();
                    }
                }
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC4954b
            /* renamed from: i */
            protected void mo31001i(float f) {
                try {
                    if (C1271b.m41491d()) {
                        C1271b.m41494a("MultiplexProducer#onProgressUpdate");
                    }
                    C4974b.this.m31108p(this, f);
                } finally {
                    if (C1271b.m41491d()) {
                        C1271b.m41493b();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            /* renamed from: o */
            public void mo30912h(T t, int i) {
                try {
                    if (C1271b.m41491d()) {
                        C1271b.m41494a("MultiplexProducer#onNewResult");
                    }
                    C4974b.this.m31109o(this, t, i);
                } finally {
                    if (C1271b.m41491d()) {
                        C1271b.m41493b();
                    }
                }
            }
        }

        public C4974b(K k) {
            this.f8435a = k;
        }

        /* renamed from: g */
        private void m31117g(Pair<Consumer<T>, ProducerContext> pair, ProducerContext producerContext) {
            producerContext.mo31168c(new C4975a(pair));
        }

        /* renamed from: i */
        private void m31115i(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        /* renamed from: j */
        private synchronized boolean m31114j() {
            Iterator<Pair<Consumer<T>, ProducerContext>> it = this.f8436b.iterator();
            while (it.hasNext()) {
                if (((ProducerContext) it.next().second).mo31162i()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: k */
        private synchronized boolean m31113k() {
            Iterator<Pair<Consumer<T>, ProducerContext>> it = this.f8436b.iterator();
            while (it.hasNext()) {
                if (!((ProducerContext) it.next().second).mo31157n()) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: l */
        private synchronized Priority m31112l() {
            Priority priority;
            priority = Priority.LOW;
            Iterator<Pair<Consumer<T>, ProducerContext>> it = this.f8436b.iterator();
            while (it.hasNext()) {
                priority = Priority.m31499a(priority, ((ProducerContext) it.next().second).mo31161j());
            }
            return priority;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: q */
        public void m31107q(EnumC6704e eVar) {
            boolean z;
            synchronized (this) {
                boolean z2 = true;
                if (this.f8440f == null) {
                    z = true;
                } else {
                    z = false;
                }
                C13740j.m2839b(Boolean.valueOf(z));
                if (this.f8441g != null) {
                    z2 = false;
                }
                C13740j.m2839b(Boolean.valueOf(z2));
                if (this.f8436b.isEmpty()) {
                    AbstractC4972g0.this.m31124k(this.f8435a, this);
                    return;
                }
                ProducerContext producerContext = (ProducerContext) this.f8436b.iterator().next().second;
                C4963d dVar = new C4963d(producerContext.mo31159l(), producerContext.getId(), producerContext.mo31163h(), producerContext.mo31170a(), producerContext.mo31155p(), m31113k(), m31114j(), m31112l(), producerContext.mo31167d());
                this.f8440f = dVar;
                dVar.mo31158m(producerContext.getExtras());
                if (eVar.m24611b()) {
                    this.f8440f.mo31169b("started_as_prefetch", Boolean.valueOf(eVar.m24612a()));
                }
                AbstractC4972g0<K, T>.C4974b.C0123b bVar = new C0123b();
                this.f8441g = bVar;
                AbstractC4972g0.this.f8431b.mo30917b(bVar, this.f8440f);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r */
        public synchronized List<AbstractC5008m0> m31106r() {
            C4963d dVar = this.f8440f;
            if (dVar == null) {
                return null;
            }
            return dVar.m31148w(m31114j());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public synchronized List<AbstractC5008m0> m31105s() {
            C4963d dVar = this.f8440f;
            if (dVar == null) {
                return null;
            }
            return dVar.m31147x(m31113k());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public synchronized List<AbstractC5008m0> m31104t() {
            C4963d dVar = this.f8440f;
            if (dVar == null) {
                return null;
            }
            return dVar.m31146y(m31112l());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: h */
        public boolean m31116h(Consumer<T> consumer, ProducerContext producerContext) {
            Pair<Consumer<T>, ProducerContext> create = Pair.create(consumer, producerContext);
            synchronized (this) {
                if (AbstractC4972g0.this.m31125i(this.f8435a) != this) {
                    return false;
                }
                this.f8436b.add(create);
                List<AbstractC5008m0> s = m31105s();
                List<AbstractC5008m0> t = m31104t();
                List<AbstractC5008m0> r = m31106r();
                Closeable closeable = this.f8437c;
                float f = this.f8438d;
                int i = this.f8439e;
                C4963d.m31152s(s);
                C4963d.m31151t(t);
                C4963d.m31153r(r);
                synchronized (create) {
                    synchronized (this) {
                        if (closeable != this.f8437c) {
                            closeable = null;
                        } else if (closeable != null) {
                            closeable = AbstractC4972g0.this.mo30968g(closeable);
                        }
                    }
                    if (closeable != null) {
                        if (f > 0.0f) {
                            consumer.mo31198c(f);
                        }
                        consumer.mo31199b(closeable, i);
                        m31115i(closeable);
                    }
                }
                m31117g(create, producerContext);
                return true;
            }
        }

        /* renamed from: m */
        public void m31111m(AbstractC4972g0<K, T>.C4974b.C0123b bVar) {
            synchronized (this) {
                if (this.f8441g == bVar) {
                    this.f8441g = null;
                    this.f8440f = null;
                    m31115i(this.f8437c);
                    this.f8437c = null;
                    m31107q(EnumC6704e.UNSET);
                }
            }
        }

        /* renamed from: n */
        public void m31110n(AbstractC4972g0<K, T>.C4974b.C0123b bVar, Throwable th2) {
            synchronized (this) {
                if (this.f8441g == bVar) {
                    Iterator<Pair<Consumer<T>, ProducerContext>> it = this.f8436b.iterator();
                    this.f8436b.clear();
                    AbstractC4972g0.this.m31124k(this.f8435a, this);
                    m31115i(this.f8437c);
                    this.f8437c = null;
                    while (it.hasNext()) {
                        Pair<Consumer<T>, ProducerContext> next = it.next();
                        synchronized (next) {
                            ((ProducerContext) next.second).mo31163h().mo2240k((ProducerContext) next.second, AbstractC4972g0.this.f8433d, th2, null);
                            ((Consumer) next.first).onFailure(th2);
                        }
                    }
                }
            }
        }

        /* renamed from: o */
        public void m31109o(AbstractC4972g0<K, T>.C4974b.C0123b bVar, T t, int i) {
            synchronized (this) {
                if (this.f8441g == bVar) {
                    m31115i(this.f8437c);
                    this.f8437c = null;
                    Iterator<Pair<Consumer<T>, ProducerContext>> it = this.f8436b.iterator();
                    int size = this.f8436b.size();
                    if (AbstractC4954b.m31196e(i)) {
                        this.f8437c = (T) AbstractC4972g0.this.mo30968g(t);
                        this.f8439e = i;
                    } else {
                        this.f8436b.clear();
                        AbstractC4972g0.this.m31124k(this.f8435a, this);
                    }
                    while (it.hasNext()) {
                        Pair<Consumer<T>, ProducerContext> next = it.next();
                        synchronized (next) {
                            if (AbstractC4954b.m31197d(i)) {
                                ((ProducerContext) next.second).mo31163h().mo2241j((ProducerContext) next.second, AbstractC4972g0.this.f8433d, null);
                                C4963d dVar = this.f8440f;
                                if (dVar != null) {
                                    ((ProducerContext) next.second).mo31158m(dVar.getExtras());
                                }
                                ((ProducerContext) next.second).mo31169b(AbstractC4972g0.this.f8434e, Integer.valueOf(size));
                            }
                            ((Consumer) next.first).mo31199b(t, i);
                        }
                    }
                }
            }
        }

        /* renamed from: p */
        public void m31108p(AbstractC4972g0<K, T>.C4974b.C0123b bVar, float f) {
            synchronized (this) {
                if (this.f8441g == bVar) {
                    this.f8438d = f;
                    Iterator<Pair<Consumer<T>, ProducerContext>> it = this.f8436b.iterator();
                    while (it.hasNext()) {
                        Pair<Consumer<T>, ProducerContext> next = it.next();
                        synchronized (next) {
                            ((Consumer) next.first).mo31198c(f);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC4972g0(AbstractC5001l0<T> l0Var, String str, String str2) {
        this(l0Var, str, str2, false);
    }

    /* renamed from: h */
    private synchronized AbstractC4972g0<K, T>.C4974b m31126h(K k) {
        AbstractC4972g0<K, T>.C4974b bVar;
        bVar = new C4974b(k);
        this.f8430a.put(k, bVar);
        return bVar;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5001l0
    /* renamed from: b */
    public void mo30917b(Consumer<T> consumer, ProducerContext producerContext) {
        AbstractC4972g0<K, T>.C4974b i;
        boolean z;
        try {
            if (C1271b.m41491d()) {
                C1271b.m41494a("MultiplexProducer#produceResults");
            }
            producerContext.mo31163h().mo2244d(producerContext, this.f8433d);
            K j = mo30967j(producerContext);
            do {
                synchronized (this) {
                    i = m31125i(j);
                    if (i == null) {
                        i = m31126h(j);
                        z = true;
                    } else {
                        z = false;
                    }
                }
            } while (!i.m31116h(consumer, producerContext));
            if (z) {
                i.m31107q(EnumC6704e.m24610c(producerContext.mo31157n()));
            }
        } finally {
            if (C1271b.m41491d()) {
                C1271b.m41493b();
            }
        }
    }

    /* renamed from: g */
    protected abstract T mo30968g(T t);

    /* renamed from: i */
    protected synchronized AbstractC4972g0<K, T>.C4974b m31125i(K k) {
        return this.f8430a.get(k);
    }

    /* renamed from: j */
    protected abstract K mo30967j(ProducerContext producerContext);

    /* renamed from: k */
    protected synchronized void m31124k(K k, AbstractC4972g0<K, T>.C4974b bVar) {
        if (this.f8430a.get(k) == bVar) {
            this.f8430a.remove(k);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC4972g0(AbstractC5001l0<T> l0Var, String str, String str2, boolean z) {
        this.f8431b = l0Var;
        this.f8430a = new HashMap();
        this.f8432c = z;
        this.f8433d = str;
        this.f8434e = str2;
    }
}
