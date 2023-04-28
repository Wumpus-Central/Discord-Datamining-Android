package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import cd.AbstractC3987i;
import com.discord.nearby.NearbyManager;
import com.google.android.gms.tasks.C5474b;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.AbstractC5801g;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import p064db.AbstractC6421a;
import p136hc.C7984d;
import p321rc.AbstractC12564k;
import p350t9.C13016c;
import p367uc.AbstractC13254d;
import tc.AbstractC13053b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.z */
/* loaded from: classes3.dex */
public class C5872z {

    /* renamed from: a */
    private final C7984d f11662a;

    /* renamed from: b */
    private final C5825e0 f11663b;

    /* renamed from: c */
    private final C13016c f11664c;

    /* renamed from: d */
    private final AbstractC13053b<AbstractC3987i> f11665d;

    /* renamed from: e */
    private final AbstractC13053b<AbstractC12564k> f11666e;

    /* renamed from: f */
    private final AbstractC13254d f11667f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5872z(C7984d dVar, C5825e0 e0Var, AbstractC13053b<AbstractC3987i> bVar, AbstractC13053b<AbstractC12564k> bVar2, AbstractC13254d dVar2) {
        this(dVar, e0Var, new C13016c(dVar.m20967j()), bVar, bVar2, dVar2);
    }

    /* renamed from: b */
    private static String m27031b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: c */
    private Task<String> m27030c(Task<Bundle> task) {
        return task.mo28865h(new ExecutorC5827f(), new AbstractC6421a() { // from class: com.google.firebase.messaging.y
            @Override // p064db.AbstractC6421a
            /* renamed from: a */
            public final Object mo4702a(Task task2) {
                String h;
                h = C5872z.this.m27025h(task2);
                return h;
            }
        });
    }

    /* renamed from: d */
    private String m27029d() {
        try {
            return m27031b(MessageDigest.getInstance("SHA-1").digest(this.f11662a.m20965l().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    /* renamed from: f */
    private String m27027f(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string3 != null) {
                throw new IOException(string3);
            } else {
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static boolean m27026g(String str) {
        if ("SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ String m27025h(Task task) {
        return m27027f((Bundle) task.mo28861l(IOException.class));
    }

    /* renamed from: i */
    private void m27024i(String str, String str2, Bundle bundle) {
        AbstractC12564k.EnumC12565a b;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f11662a.m20964m().m20941c());
        bundle.putString("gmsv", Integer.toString(this.f11663b.m27171d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f11663b.m27174a());
        bundle.putString("app_ver_name", this.f11663b.m27173b());
        bundle.putString("firebase-app-name-hash", m27029d());
        try {
            String b2 = ((AbstractC5801g) C5474b.m28897a(this.f11667f.mo4208a(false))).mo27301b();
            if (!TextUtils.isEmpty(b2)) {
                bundle.putString("Goog-Firebase-Installations-Auth", b2);
            } else {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) C5474b.m28897a(this.f11667f.getId()));
        bundle.putString("cliv", "fcm-23.0.1");
        AbstractC12564k kVar = this.f11666e.get();
        AbstractC3987i iVar = this.f11665d.get();
        if (kVar != null && iVar != null && (b = kVar.mo6549b("fire-iid")) != AbstractC12564k.EnumC12565a.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(b.m6548a()));
            bundle.putString("Firebase-Client", iVar.mo33195a());
        }
    }

    /* renamed from: j */
    private Task<Bundle> m27023j(String str, String str2, Bundle bundle) {
        try {
            m27024i(str, str2, bundle);
            return this.f11664c.m4735a(bundle);
        } catch (InterruptedException | ExecutionException e) {
            return C5474b.m28894d(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Task<String> m27028e() {
        return m27030c(m27023j(C5825e0.m27172c(this.f11662a), "*", new Bundle()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public Task<?> m27022k(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return m27030c(m27023j(str, "/topics/" + str2, bundle));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public Task<?> m27021l(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", NearbyManager.PERMISSION_DENIED);
        return m27030c(m27023j(str, "/topics/" + str2, bundle));
    }

    C5872z(C7984d dVar, C5825e0 e0Var, C13016c cVar, AbstractC13053b<AbstractC3987i> bVar, AbstractC13053b<AbstractC12564k> bVar2, AbstractC13254d dVar2) {
        this.f11662a = dVar;
        this.f11663b = e0Var;
        this.f11664c = cVar;
        this.f11665d = bVar;
        this.f11666e = bVar2;
        this.f11667f = dVar2;
    }
}
