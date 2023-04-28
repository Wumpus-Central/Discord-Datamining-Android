package com.google.android.gms.tasks;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.tasks.t */
/* loaded from: classes3.dex */
public final class C5492t<TResult> {

    /* renamed from: a */
    private final Object f10410a = new Object();

    /* renamed from: b */
    private Queue<AbstractC5491s<TResult>> f10411b;

    /* renamed from: c */
    private boolean f10412c;

    /* renamed from: a */
    public final void m28874a(AbstractC5491s<TResult> sVar) {
        synchronized (this.f10410a) {
            if (this.f10411b == null) {
                this.f10411b = new ArrayDeque();
            }
            this.f10411b.add(sVar);
        }
    }

    /* renamed from: b */
    public final void m28873b(Task<TResult> task) {
        AbstractC5491s<TResult> poll;
        synchronized (this.f10410a) {
            if (this.f10411b != null && !this.f10412c) {
                this.f10412c = true;
                while (true) {
                    synchronized (this.f10410a) {
                        poll = this.f10411b.poll();
                        if (poll == null) {
                            this.f10412c = false;
                            return;
                        }
                    }
                    poll.mo28875b(task);
                }
            }
        }
    }
}
