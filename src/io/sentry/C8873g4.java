package io.sentry;

import io.sentry.util.C9111k;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.sentry.g4 */
/* loaded from: classes8.dex */
public final class C8873g4 {

    /* renamed from: a */
    private final Deque<C8874a> f19558a;

    /* renamed from: b */
    private final AbstractC8869g0 f19559b;

    public C8873g4(AbstractC8869g0 g0Var, C8874a aVar) {
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        this.f19558a = linkedBlockingDeque;
        this.f19559b = (AbstractC8869g0) C9111k.m16995a(g0Var, "logger is required");
        linkedBlockingDeque.push((C8874a) C9111k.m16995a(aVar, "rootStackItem is required"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C8874a m17853a() {
        return this.f19558a.peek();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m17852b() {
        synchronized (this.f19558a) {
            if (this.f19558a.size() != 1) {
                this.f19558a.pop();
            } else {
                this.f19559b.mo17722c(EnumC8942n3.WARNING, "Attempt to pop the root scope.", new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m17851c(C8874a aVar) {
        this.f19558a.push(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.sentry.g4$a */
    /* loaded from: classes8.dex */
    public static final class C8874a {

        /* renamed from: a */
        private final C8951o3 f19560a;

        /* renamed from: b */
        private volatile AbstractC8905j0 f19561b;

        /* renamed from: c */
        private volatile Scope f19562c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C8874a(C8951o3 o3Var, AbstractC8905j0 j0Var, Scope scope) {
            this.f19561b = (AbstractC8905j0) C9111k.m16995a(j0Var, "ISentryClient is required.");
            this.f19562c = (Scope) C9111k.m16995a(scope, "Scope is required.");
            this.f19560a = (C8951o3) C9111k.m16995a(o3Var, "Options is required");
        }

        /* renamed from: a */
        public AbstractC8905j0 m17850a() {
            return this.f19561b;
        }

        /* renamed from: b */
        public C8951o3 m17849b() {
            return this.f19560a;
        }

        /* renamed from: c */
        public Scope m17848c() {
            return this.f19562c;
        }

        C8874a(C8874a aVar) {
            this.f19560a = aVar.f19560a;
            this.f19561b = aVar.f19561b;
            this.f19562c = new Scope(aVar.f19562c);
        }
    }

    public C8873g4(C8873g4 g4Var) {
        this(g4Var.f19559b, new C8874a(g4Var.f19558a.getLast()));
        Iterator<C8874a> descendingIterator = g4Var.f19558a.descendingIterator();
        if (descendingIterator.hasNext()) {
            descendingIterator.next();
        }
        while (descendingIterator.hasNext()) {
            m17851c(new C8874a(descendingIterator.next()));
        }
    }
}
