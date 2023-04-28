package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.s0 */
/* loaded from: classes3.dex */
final class C5857s0 {

    /* renamed from: a */
    private final SharedPreferences f11614a;

    /* renamed from: b */
    private final String f11615b;

    /* renamed from: c */
    private final String f11616c;

    /* renamed from: e */
    private final Executor f11618e;

    /* renamed from: d */
    final ArrayDeque<String> f11617d = new ArrayDeque<>();

    /* renamed from: f */
    private boolean f11619f = false;

    private C5857s0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f11614a = sharedPreferences;
        this.f11615b = str;
        this.f11616c = str2;
        this.f11618e = executor;
    }

    /* renamed from: b */
    private boolean m27081b(boolean z) {
        if (z && !this.f11619f) {
            m27074i();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C5857s0 m27080c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        C5857s0 s0Var = new C5857s0(sharedPreferences, str, str2, executor);
        s0Var.m27079d();
        return s0Var;
    }

    /* renamed from: d */
    private void m27079d() {
        synchronized (this.f11617d) {
            this.f11617d.clear();
            String string = this.f11614a.getString(this.f11615b, "");
            if (!TextUtils.isEmpty(string) && string.contains(this.f11616c)) {
                String[] split = string.split(this.f11616c, -1);
                if (split.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f11617d.add(str);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m27075h() {
        synchronized (this.f11617d) {
            this.f11614a.edit().putString(this.f11615b, m27076g()).commit();
        }
    }

    /* renamed from: i */
    private void m27074i() {
        this.f11618e.execute(new Runnable() { // from class: com.google.firebase.messaging.r0
            @Override // java.lang.Runnable
            public final void run() {
                C5857s0.this.m27075h();
            }
        });
    }

    /* renamed from: e */
    public String m27078e() {
        String peek;
        synchronized (this.f11617d) {
            peek = this.f11617d.peek();
        }
        return peek;
    }

    /* renamed from: f */
    public boolean m27077f(Object obj) {
        boolean b;
        synchronized (this.f11617d) {
            b = m27081b(this.f11617d.remove(obj));
        }
        return b;
    }

    /* renamed from: g */
    public String m27076g() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = this.f11617d.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(this.f11616c);
        }
        return sb2.toString();
    }
}
