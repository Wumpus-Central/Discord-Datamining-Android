package ye;

import android.net.ConnectivityManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.Locale;
import p465ze.EnumC14626a;
import p465ze.EnumC14627b;

/* renamed from: ye.b */
/* loaded from: classes6.dex */
public abstract class AbstractC14368b {

    /* renamed from: a */
    private final ConnectivityManager f32526a;

    /* renamed from: b */
    private final WifiManager f32527b;

    /* renamed from: c */
    private final TelephonyManager f32528c;

    /* renamed from: d */
    private final ReactApplicationContext f32529d;

    /* renamed from: e */
    public boolean f32530e = false;

    /* renamed from: f */
    private EnumC14627b f32531f = EnumC14627b.UNKNOWN;

    /* renamed from: g */
    private EnumC14626a f32532g = null;

    /* renamed from: h */
    private boolean f32533h = false;

    /* renamed from: i */
    private Boolean f32534i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC14368b(ReactApplicationContext reactApplicationContext) {
        this.f32529d = reactApplicationContext;
        this.f32526a = (ConnectivityManager) reactApplicationContext.getSystemService("connectivity");
        this.f32527b = (WifiManager) reactApplicationContext.getApplicationContext().getSystemService("wifi");
        this.f32528c = (TelephonyManager) reactApplicationContext.getSystemService("phone");
    }

    /* renamed from: b */
    private WritableMap m759b(String str) {
        WifiInfo connectionInfo;
        WritableMap createMap = Arguments.createMap();
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1419358249:
                if (str.equals("ethernet")) {
                    c = 0;
                    break;
                }
                break;
            case -916596374:
                if (str.equals("cellular")) {
                    c = 1;
                    break;
                }
                break;
            case 3649301:
                if (str.equals("wifi")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                try {
                    Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                    while (networkInterfaces.hasMoreElements()) {
                        Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                        while (inetAddresses.hasMoreElements()) {
                            InetAddress nextElement = inetAddresses.nextElement();
                            if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet4Address)) {
                                createMap.putString("ipAddress", nextElement.getHostAddress());
                                createMap.putString("subnet", m755f(nextElement));
                                return createMap;
                            }
                        }
                    }
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                    break;
                }
            case 1:
                EnumC14626a aVar = this.f32532g;
                if (aVar != null) {
                    createMap.putString("cellularGeneration", aVar.f33115k);
                }
                String networkOperatorName = this.f32528c.getNetworkOperatorName();
                if (networkOperatorName != null) {
                    createMap.putString("carrier", networkOperatorName);
                    break;
                }
                break;
            case 2:
                if (C14370d.m751a(m756e()) && (connectionInfo = this.f32527b.getConnectionInfo()) != null) {
                    try {
                        String ssid = connectionInfo.getSSID();
                        if (ssid != null && !ssid.contains("<unknown ssid>")) {
                            createMap.putString("ssid", ssid.replace("\"", ""));
                        }
                    } catch (Exception unused) {
                    }
                    try {
                        String bssid = connectionInfo.getBSSID();
                        if (bssid != null) {
                            createMap.putString("bssid", bssid);
                        }
                    } catch (Exception unused2) {
                    }
                    try {
                        createMap.putInt("strength", WifiManager.calculateSignalLevel(connectionInfo.getRssi(), 100));
                    } catch (Exception unused3) {
                    }
                    try {
                        createMap.putInt("frequency", connectionInfo.getFrequency());
                    } catch (Exception unused4) {
                    }
                    try {
                        byte[] byteArray = BigInteger.valueOf(connectionInfo.getIpAddress()).toByteArray();
                        C14370d.m750b(byteArray);
                        createMap.putString("ipAddress", InetAddress.getByAddress(byteArray).getHostAddress());
                    } catch (Exception unused5) {
                    }
                    try {
                        byte[] byteArray2 = BigInteger.valueOf(connectionInfo.getIpAddress()).toByteArray();
                        C14370d.m750b(byteArray2);
                        createMap.putString("subnet", m755f(InetAddress.getByAddress(byteArray2)));
                        break;
                    } catch (Exception unused6) {
                        break;
                    }
                }
                break;
        }
        return createMap;
    }

    /* renamed from: f */
    private static String m755f(InetAddress inetAddress) {
        int networkPrefixLength = (-1) << (32 - NetworkInterface.getByInetAddress(inetAddress).getInterfaceAddresses().get(1).getNetworkPrefixLength());
        return String.format(Locale.US, "%d.%d.%d.%d", Integer.valueOf((networkPrefixLength >> 24) & 255), Integer.valueOf((networkPrefixLength >> 16) & 255), Integer.valueOf((networkPrefixLength >> 8) & 255), Integer.valueOf(networkPrefixLength & 255));
    }

    /* renamed from: a */
    protected WritableMap m760a(String str) {
        String str2;
        boolean z;
        WritableMap createMap = Arguments.createMap();
        if (C14370d.m751a(m756e())) {
            createMap.putBoolean("isWifiEnabled", this.f32527b.isWifiEnabled());
        }
        if (str != null) {
            str2 = str;
        } else {
            str2 = this.f32531f.f33125k;
        }
        createMap.putString("type", str2);
        boolean z2 = false;
        boolean z3 = true;
        if (this.f32531f.equals(EnumC14627b.NONE) || this.f32531f.equals(EnumC14627b.UNKNOWN)) {
            z = false;
        } else {
            z = true;
        }
        createMap.putBoolean("isConnected", z);
        if (this.f32533h && (str == null || str.equals(this.f32531f.f33125k))) {
            z2 = true;
        }
        createMap.putBoolean("isInternetReachable", z2);
        if (str == null) {
            str = this.f32531f.f33125k;
        }
        WritableMap b = m759b(str);
        if (z) {
            if (m758c() != null) {
                z3 = m758c().isActiveNetworkMetered();
            }
            b.putBoolean("isConnectionExpensive", z3);
        }
        createMap.putMap("details", b);
        return createMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public ConnectivityManager m758c() {
        return this.f32526a;
    }

    /* renamed from: d */
    public void m757d(String str, Promise promise) {
        promise.resolve(m760a(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public ReactApplicationContext m756e() {
        return this.f32529d;
    }

    /* renamed from: g */
    public abstract void mo748g();

    /* renamed from: h */
    protected void m754h() {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) m756e().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("netInfo.networkStatusDidChange", m760a(null));
    }

    /* renamed from: i */
    public void m753i(boolean z) {
        this.f32534i = Boolean.valueOf(z);
        m752k(this.f32531f, this.f32532g, this.f32533h);
    }

    /* renamed from: j */
    public abstract void mo747j();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m752k(EnumC14627b bVar, EnumC14626a aVar, boolean z) {
        boolean z2;
        boolean z3;
        Boolean bool = this.f32534i;
        if (bool != null) {
            z = bool.booleanValue();
        }
        boolean z4 = true;
        if (bVar != this.f32531f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (aVar != this.f32532g) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z == this.f32533h) {
            z4 = false;
        }
        if (z2 || z3 || z4) {
            this.f32531f = bVar;
            this.f32532g = aVar;
            this.f32533h = z;
            if (this.f32530e) {
                m754h();
            }
        }
    }
}
