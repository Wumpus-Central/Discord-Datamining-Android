package ye;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import com.facebook.react.bridge.ReactApplicationContext;
import p465ze.EnumC14626a;
import p465ze.EnumC14627b;

/* renamed from: ye.a */
/* loaded from: classes6.dex */
public class C14366a extends AbstractC14368b {

    /* renamed from: j */
    private final C14367b f32523j = new C14367b();

    /* renamed from: ye.a$b */
    /* loaded from: classes6.dex */
    private class C14367b extends BroadcastReceiver {

        /* renamed from: a */
        private boolean f32524a;

        private C14367b() {
            this.f32524a = false;
        }

        /* renamed from: a */
        public boolean m762a() {
            return this.f32524a;
        }

        /* renamed from: b */
        public void m761b(boolean z) {
            this.f32524a = z;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action != null && action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                C14366a.this.m763m();
            }
        }
    }

    public C14366a(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    /* renamed from: m */
    public void m763m() {
        NetworkInfo activeNetworkInfo;
        EnumC14627b bVar = EnumC14627b.UNKNOWN;
        EnumC14626a aVar = null;
        boolean z = false;
        try {
            activeNetworkInfo = m758c().getActiveNetworkInfo();
        } catch (SecurityException unused) {
            bVar = EnumC14627b.UNKNOWN;
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z = activeNetworkInfo.isConnected();
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type == 1) {
                    bVar = EnumC14627b.WIFI;
                } else if (type != 4) {
                    if (type == 9) {
                        bVar = EnumC14627b.ETHERNET;
                    } else if (type == 17) {
                        bVar = EnumC14627b.VPN;
                    } else if (type == 6) {
                        bVar = EnumC14627b.WIMAX;
                    } else if (type == 7) {
                        bVar = EnumC14627b.BLUETOOTH;
                    }
                }
                m752k(bVar, aVar, z);
            }
            bVar = EnumC14627b.CELLULAR;
            aVar = EnumC14626a.m81a(activeNetworkInfo);
            m752k(bVar, aVar, z);
        }
        bVar = EnumC14627b.NONE;
        m752k(bVar, aVar, z);
    }

    @Override // ye.AbstractC14368b
    /* renamed from: g */
    public void mo748g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        m756e().registerReceiver(this.f32523j, intentFilter);
        this.f32523j.m761b(true);
        m763m();
    }

    @Override // ye.AbstractC14368b
    /* renamed from: j */
    public void mo747j() {
        if (this.f32523j.m762a()) {
            m756e().unregisterReceiver(this.f32523j);
            this.f32523j.m761b(false);
        }
    }
}
