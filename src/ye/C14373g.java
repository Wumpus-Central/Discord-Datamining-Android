package ye;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.facebook.react.bridge.ReactApplicationContext;
import p465ze.EnumC14626a;
import p465ze.EnumC14627b;

@TargetApi(24)
/* renamed from: ye.g */
/* loaded from: classes6.dex */
public class C14373g extends AbstractC14368b {

    /* renamed from: k */
    private Network f32537k = null;

    /* renamed from: l */
    private NetworkCapabilities f32538l = null;

    /* renamed from: j */
    private final C14375b f32536j = new C14375b();

    /* renamed from: ye.g$b */
    /* loaded from: classes6.dex */
    private class C14375b extends ConnectivityManager.NetworkCallback {
        private C14375b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            C14373g.this.f32537k = network;
            C14373g.this.m741q(ItemTouchHelper.AbstractC3083c.DEFAULT_SWIPE_ANIMATION_DURATION);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            C14373g.this.f32537k = network;
            C14373g.this.f32538l = networkCapabilities;
            C14373g.this.m739s();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            if (C14373g.this.f32537k != null) {
                C14373g.this.f32537k = network;
            }
            C14373g.this.m741q(ItemTouchHelper.AbstractC3083c.DEFAULT_SWIPE_ANIMATION_DURATION);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLosing(Network network, int i) {
            C14373g.this.f32537k = network;
            C14373g.this.m739s();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            C14373g.this.f32537k = null;
            C14373g.this.f32538l = null;
            C14373g.this.m739s();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            C14373g.this.f32537k = null;
            C14373g.this.f32538l = null;
            C14373g.this.m739s();
        }
    }

    public C14373g(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public void m741q(int i) {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: ye.f
            @Override // java.lang.Runnable
            public final void run() {
                C14373g.this.m740r();
            }
        }, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m740r() {
        this.f32538l = m758c().getNetworkCapabilities(this.f32537k);
        m739s();
    }

    @Override // ye.AbstractC14368b
    @SuppressLint({"MissingPermission"})
    /* renamed from: g */
    public void mo748g() {
        try {
            this.f32537k = m758c().getActiveNetwork();
            m741q(0);
            m758c().registerDefaultNetworkCallback(this.f32536j);
        } catch (SecurityException unused) {
        }
    }

    @Override // ye.AbstractC14368b
    /* renamed from: j */
    public void mo747j() {
        try {
            m758c().unregisterNetworkCallback(this.f32536j);
        } catch (IllegalArgumentException | SecurityException unused) {
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: s */
    void m739s() {
        NetworkInfo networkInfo;
        boolean z;
        EnumC14627b bVar = EnumC14627b.UNKNOWN;
        Network network = this.f32537k;
        NetworkCapabilities networkCapabilities = this.f32538l;
        EnumC14626a aVar = null;
        boolean z2 = false;
        if (networkCapabilities != null) {
            if (networkCapabilities.hasTransport(2)) {
                bVar = EnumC14627b.BLUETOOTH;
            } else if (networkCapabilities.hasTransport(0)) {
                bVar = EnumC14627b.CELLULAR;
            } else if (networkCapabilities.hasTransport(3)) {
                bVar = EnumC14627b.ETHERNET;
            } else if (networkCapabilities.hasTransport(1)) {
                bVar = EnumC14627b.WIFI;
            } else if (networkCapabilities.hasTransport(4)) {
                bVar = EnumC14627b.VPN;
            }
            if (network != null) {
                networkInfo = m758c().getNetworkInfo(network);
            } else {
                networkInfo = null;
            }
            if (Build.VERSION.SDK_INT >= 28) {
                z = !networkCapabilities.hasCapability(21);
            } else if (network == null || networkInfo == null || networkInfo.getDetailedState().equals(NetworkInfo.DetailedState.CONNECTED)) {
                z = false;
            } else {
                z = true;
            }
            if (networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16) && !z) {
                z2 = true;
            }
            if (network != null && bVar == EnumC14627b.CELLULAR && z2) {
                aVar = EnumC14626a.m81a(networkInfo);
            }
        } else {
            bVar = EnumC14627b.NONE;
        }
        m752k(bVar, aVar, z2);
    }
}
