package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.collection.C2094a;
import com.google.android.gms.tasks.C5474b;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.y0 */
/* loaded from: classes3.dex */
public class C5871y0 {

    /* renamed from: i */
    private static final long f11653i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a */
    private final Context f11654a;

    /* renamed from: b */
    private final C5825e0 f11655b;

    /* renamed from: c */
    private final C5872z f11656c;

    /* renamed from: d */
    private final FirebaseMessaging f11657d;

    /* renamed from: f */
    private final ScheduledExecutorService f11659f;

    /* renamed from: h */
    private final C5867w0 f11661h;

    /* renamed from: e */
    private final Map<String, ArrayDeque<TaskCompletionSource<Void>>> f11658e = new C2094a();

    /* renamed from: g */
    private boolean f11660g = false;

    private C5871y0(FirebaseMessaging firebaseMessaging, C5825e0 e0Var, C5867w0 w0Var, C5872z zVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f11657d = firebaseMessaging;
        this.f11655b = e0Var;
        this.f11661h = w0Var;
        this.f11656c = zVar;
        this.f11654a = context;
        this.f11659f = scheduledExecutorService;
    }

    /* renamed from: b */
    private static <T> void m27048b(Task<T> task) {
        Throwable e;
        try {
            C5474b.m28896b(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            e = e2;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e3);
            }
        } catch (TimeoutException e4) {
            e = e4;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    /* renamed from: c */
    private void m27047c(String str) {
        m27048b(this.f11656c.m27022k(this.f11657d.m27269i(), str));
    }

    /* renamed from: d */
    private void m27046d(String str) {
        m27048b(this.f11656c.m27021l(this.f11657d.m27269i(), str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static Task<C5871y0> m27045e(final FirebaseMessaging firebaseMessaging, final C5825e0 e0Var, final C5872z zVar, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return C5474b.m28895c(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.x0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C5871y0 i;
                i = C5871y0.m27041i(context, scheduledExecutorService, firebaseMessaging, e0Var, zVar);
                return i;
            }
        });
    }

    /* renamed from: g */
    static boolean m27043g() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ C5871y0 m27041i(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, C5825e0 e0Var, C5872z zVar) {
        return new C5871y0(firebaseMessaging, e0Var, C5867w0.m27053a(context, scheduledExecutorService), zVar, context, scheduledExecutorService);
    }

    /* renamed from: j */
    private void m27040j(C5865v0 v0Var) {
        synchronized (this.f11658e) {
            String e = v0Var.m27054e();
            if (this.f11658e.containsKey(e)) {
                ArrayDeque<TaskCompletionSource<Void>> arrayDeque = this.f11658e.get(e);
                TaskCompletionSource<Void> poll = arrayDeque.poll();
                if (poll != null) {
                    poll.m28900c(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.f11658e.remove(e);
                }
            }
        }
    }

    /* renamed from: n */
    private void m27036n() {
        if (!m27042h()) {
            m27033q(0L);
        }
    }

    /* renamed from: f */
    boolean m27044f() {
        return this.f11661h.m27052b() != null;
    }

    /* renamed from: h */
    synchronized boolean m27042h() {
        return this.f11660g;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079 A[Catch: IOException -> 0x00a2, TryCatch #0 {IOException -> 0x00a2, blocks: (B:3:0x0003, B:8:0x0015, B:11:0x001f, B:18:0x0030, B:20:0x0036, B:21:0x0050, B:23:0x005d, B:24:0x0079, B:26:0x0086), top: B:40:0x0003 }] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean m27039k(com.google.firebase.messaging.C5865v0 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "FirebaseMessaging"
            r1 = 0
            java.lang.String r2 = r7.m27057b()     // Catch: IOException -> 0x00a2
            int r3 = r2.hashCode()     // Catch: IOException -> 0x00a2
            r4 = 83
            r5 = 1
            if (r3 == r4) goto L_0x001f
            r4 = 85
            if (r3 == r4) goto L_0x0015
            goto L_0x0029
        L_0x0015:
            java.lang.String r3 = "U"
            boolean r2 = r2.equals(r3)     // Catch: IOException -> 0x00a2
            if (r2 == 0) goto L_0x0029
            r2 = r5
            goto L_0x002a
        L_0x001f:
            java.lang.String r3 = "S"
            boolean r2 = r2.equals(r3)     // Catch: IOException -> 0x00a2
            if (r2 == 0) goto L_0x0029
            r2 = r1
            goto L_0x002a
        L_0x0029:
            r2 = -1
        L_0x002a:
            java.lang.String r3 = " succeeded."
            if (r2 == 0) goto L_0x0079
            if (r2 == r5) goto L_0x0050
            boolean r2 = m27043g()     // Catch: IOException -> 0x00a2
            if (r2 == 0) goto L_0x00a1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: IOException -> 0x00a2
            r2.<init>()     // Catch: IOException -> 0x00a2
            java.lang.String r3 = "Unknown topic operation"
            r2.append(r3)     // Catch: IOException -> 0x00a2
            r2.append(r7)     // Catch: IOException -> 0x00a2
            java.lang.String r7 = "."
            r2.append(r7)     // Catch: IOException -> 0x00a2
            java.lang.String r7 = r2.toString()     // Catch: IOException -> 0x00a2
            android.util.Log.d(r0, r7)     // Catch: IOException -> 0x00a2
            goto L_0x00a1
        L_0x0050:
            java.lang.String r2 = r7.m27056c()     // Catch: IOException -> 0x00a2
            r6.m27046d(r2)     // Catch: IOException -> 0x00a2
            boolean r2 = m27043g()     // Catch: IOException -> 0x00a2
            if (r2 == 0) goto L_0x00a1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: IOException -> 0x00a2
            r2.<init>()     // Catch: IOException -> 0x00a2
            java.lang.String r4 = "Unsubscribe from topic: "
            r2.append(r4)     // Catch: IOException -> 0x00a2
            java.lang.String r7 = r7.m27056c()     // Catch: IOException -> 0x00a2
            r2.append(r7)     // Catch: IOException -> 0x00a2
            r2.append(r3)     // Catch: IOException -> 0x00a2
            java.lang.String r7 = r2.toString()     // Catch: IOException -> 0x00a2
            android.util.Log.d(r0, r7)     // Catch: IOException -> 0x00a2
            goto L_0x00a1
        L_0x0079:
            java.lang.String r2 = r7.m27056c()     // Catch: IOException -> 0x00a2
            r6.m27047c(r2)     // Catch: IOException -> 0x00a2
            boolean r2 = m27043g()     // Catch: IOException -> 0x00a2
            if (r2 == 0) goto L_0x00a1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: IOException -> 0x00a2
            r2.<init>()     // Catch: IOException -> 0x00a2
            java.lang.String r4 = "Subscribe to topic: "
            r2.append(r4)     // Catch: IOException -> 0x00a2
            java.lang.String r7 = r7.m27056c()     // Catch: IOException -> 0x00a2
            r2.append(r7)     // Catch: IOException -> 0x00a2
            r2.append(r3)     // Catch: IOException -> 0x00a2
            java.lang.String r7 = r2.toString()     // Catch: IOException -> 0x00a2
            android.util.Log.d(r0, r7)     // Catch: IOException -> 0x00a2
        L_0x00a1:
            return r5
        L_0x00a2:
            r7 = move-exception
            java.lang.String r2 = "SERVICE_NOT_AVAILABLE"
            java.lang.String r3 = r7.getMessage()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x00c9
            java.lang.String r2 = "INTERNAL_SERVER_ERROR"
            java.lang.String r3 = r7.getMessage()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00bc
            goto L_0x00c9
        L_0x00bc:
            java.lang.String r2 = r7.getMessage()
            if (r2 != 0) goto L_0x00c8
            java.lang.String r7 = "Topic operation failed without exception message. Will retry Topic operation."
            android.util.Log.e(r0, r7)
            return r1
        L_0x00c8:
            throw r7
        L_0x00c9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Topic operation failed: "
            r2.append(r3)
            java.lang.String r7 = r7.getMessage()
            r2.append(r7)
            java.lang.String r7 = ". Will retry Topic operation."
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            android.util.Log.e(r0, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C5871y0.m27039k(com.google.firebase.messaging.v0):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m27038l(Runnable runnable, long j) {
        this.f11659f.schedule(runnable, j, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public synchronized void m27037m(boolean z) {
        this.f11660g = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m27035o() {
        if (m27044f()) {
            m27036n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
        if (m27043g() == false) goto L_0x0016;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
        return true;
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m27034p() {
        /*
            r2 = this;
        L_0x0000:
            monitor-enter(r2)
            com.google.firebase.messaging.w0 r0 = r2.f11661h     // Catch: all -> 0x002b
            com.google.firebase.messaging.v0 r0 = r0.m27052b()     // Catch: all -> 0x002b
            if (r0 != 0) goto L_0x0019
            boolean r0 = m27043g()     // Catch: all -> 0x002b
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch: all -> 0x002b
        L_0x0016:
            monitor-exit(r2)     // Catch: all -> 0x002b
            r0 = 1
            return r0
        L_0x0019:
            monitor-exit(r2)     // Catch: all -> 0x002b
            boolean r1 = r2.m27039k(r0)
            if (r1 != 0) goto L_0x0022
            r0 = 0
            return r0
        L_0x0022:
            com.google.firebase.messaging.w0 r1 = r2.f11661h
            r1.m27050d(r0)
            r2.m27040j(r0)
            goto L_0x0000
        L_0x002b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: all -> 0x002b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C5871y0.m27034p():boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m27033q(long j) {
        m27038l(new RunnableC5873z0(this, this.f11654a, this.f11655b, Math.min(Math.max(30L, 2 * j), f11653i)), j);
        m27037m(true);
    }
}
