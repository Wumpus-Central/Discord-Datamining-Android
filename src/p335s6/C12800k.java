package p335s6;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: s6.k */
/* loaded from: classes7.dex */
class C12800k implements AbstractC12792e {

    /* renamed from: a */
    private final C12801a f28730a;

    /* renamed from: b */
    private final C12798i f28731b;

    /* renamed from: c */
    private final Map<String, AbstractC12803m> f28732c;

    /* renamed from: s6.k$a */
    /* loaded from: classes7.dex */
    static class C12801a {

        /* renamed from: a */
        private final Context f28733a;

        /* renamed from: b */
        private Map<String, String> f28734b = null;

        C12801a(Context context) {
            this.f28733a = context;
        }

        /* renamed from: a */
        private Map<String, String> m5456a(Context context) {
            Bundle d = m5453d(context);
            if (d == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : d.keySet()) {
                Object obj = d.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String trim = str2.trim();
                        if (!trim.isEmpty()) {
                            hashMap.put(trim, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        /* renamed from: c */
        private Map<String, String> m5454c() {
            if (this.f28734b == null) {
                this.f28734b = m5456a(this.f28733a);
            }
            return this.f28734b;
        }

        /* renamed from: d */
        private static Bundle m5453d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        /* renamed from: b */
        AbstractC12791d m5455b(String str) {
            String str2 = m5454c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (AbstractC12791d) Class.forName(str2).asSubclass(AbstractC12791d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str2), e);
                return null;
            } catch (IllegalAccessException e2) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e2);
                return null;
            } catch (InstantiationException e3) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e3);
                return null;
            } catch (NoSuchMethodException e4) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e4);
                return null;
            } catch (InvocationTargetException e5) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e5);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12800k(Context context, C12798i iVar) {
        this(new C12801a(context), iVar);
    }

    @Override // p335s6.AbstractC12792e
    /* renamed from: a */
    public synchronized AbstractC12803m mo5457a(String str) {
        if (this.f28732c.containsKey(str)) {
            return this.f28732c.get(str);
        }
        AbstractC12791d b = this.f28730a.m5455b(str);
        if (b == null) {
            return null;
        }
        AbstractC12803m create = b.create(this.f28731b.m5461a(str));
        this.f28732c.put(str, create);
        return create;
    }

    C12800k(C12801a aVar, C12798i iVar) {
        this.f28732c = new HashMap();
        this.f28730a = aVar;
        this.f28731b = iVar;
    }
}
