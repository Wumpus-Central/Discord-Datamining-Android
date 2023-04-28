package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import ca.C3803j;
import com.google.android.gms.tasks.C5474b;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p064db.AbstractC6421a;

/* renamed from: com.google.firebase.messaging.l */
/* loaded from: classes3.dex */
public class C5841l {

    /* renamed from: c */
    private static final Object f11592c = new Object();

    /* renamed from: d */
    private static ServiceConnectionC5829f1 f11593d;

    /* renamed from: a */
    private final Context f11594a;

    /* renamed from: b */
    private final Executor f11595b = new ExecutorC5827f();

    public C5841l(Context context) {
        this.f11594a = context;
    }

    /* renamed from: b */
    public static /* synthetic */ Integer m27118b(Task task) {
        return -1;
    }

    /* renamed from: c */
    public static /* synthetic */ Integer m27117c(Task task) {
        return 403;
    }

    /* renamed from: e */
    private static Task<Integer> m27115e(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        return m27114f(context, "com.google.firebase.MESSAGING_EVENT").m27138c(intent).mo28865h(new ExecutorC5827f(), new AbstractC6421a() { // from class: com.google.firebase.messaging.j
            @Override // p064db.AbstractC6421a
            /* renamed from: a */
            public final Object mo4702a(Task task) {
                return C5841l.m27118b(task);
            }
        });
    }

    /* renamed from: f */
    private static ServiceConnectionC5829f1 m27114f(Context context, String str) {
        ServiceConnectionC5829f1 f1Var;
        synchronized (f11592c) {
            if (f11593d == null) {
                f11593d = new ServiceConnectionC5829f1(context, str);
            }
            f1Var = f11593d;
        }
        return f1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ Integer m27112h(Context context, Intent intent) {
        return Integer.valueOf(C5853q0.m27088b().m27083g(context, intent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ Task m27110j(Context context, Intent intent, Task task) {
        if (!C3803j.m33559h() || ((Integer) task.mo28862k()).intValue() != 402) {
            return task;
        }
        return m27115e(context, intent).mo28865h(new ExecutorC5827f(), new AbstractC6421a() { // from class: com.google.firebase.messaging.k
            @Override // p064db.AbstractC6421a
            /* renamed from: a */
            public final Object mo4702a(Task task2) {
                return C5841l.m27117c(task2);
            }
        });
    }

    /* renamed from: k */
    public Task<Integer> m27109k(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return m27108l(this.f11594a, intent);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: l */
    public Task<Integer> m27108l(final Context context, final Intent intent) {
        boolean z;
        boolean z2 = true;
        if (!C3803j.m33559h() || context.getApplicationInfo().targetSdkVersion < 26) {
            z = false;
        } else {
            z = true;
        }
        if ((intent.getFlags() & 268435456) == 0) {
            z2 = false;
        }
        if (!z || z2) {
            return C5474b.m28895c(this.f11595b, new Callable() { // from class: com.google.firebase.messaging.h
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Integer h;
                    h = C5841l.m27112h(context, intent);
                    return h;
                }
            }).mo28864i(this.f11595b, new AbstractC6421a() { // from class: com.google.firebase.messaging.i
                @Override // p064db.AbstractC6421a
                /* renamed from: a */
                public final Object mo4702a(Task task) {
                    Task j;
                    j = C5841l.m27110j(context, intent, task);
                    return j;
                }
            });
        }
        return m27115e(context, intent);
    }
}
