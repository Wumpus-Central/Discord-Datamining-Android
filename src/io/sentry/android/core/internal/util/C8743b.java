package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import io.sentry.AbstractC8869g0;
import io.sentry.EnumC8942n3;
import io.sentry.android.core.C8715f0;

/* renamed from: io.sentry.android.core.internal.util.b */
/* loaded from: classes8.dex */
public final class C8743b {

    /* renamed from: io.sentry.android.core.internal.util.b$a */
    /* loaded from: classes8.dex */
    public enum EnumC8744a {
        CONNECTED,
        NOT_CONNECTED,
        NO_PERMISSION,
        UNKNOWN
    }

    /* renamed from: a */
    private static EnumC8744a m18224a(Context context, ConnectivityManager connectivityManager, AbstractC8869g0 g0Var) {
        if (!C8748f.m18212a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            g0Var.mo17722c(EnumC8942n3.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return EnumC8744a.NO_PERMISSION;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            g0Var.mo17722c(EnumC8942n3.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
            return EnumC8744a.NOT_CONNECTED;
        } else if (activeNetworkInfo.isConnected()) {
            return EnumC8744a.CONNECTED;
        } else {
            return EnumC8744a.NOT_CONNECTED;
        }
    }

    /* renamed from: b */
    public static EnumC8744a m18223b(Context context, AbstractC8869g0 g0Var) {
        ConnectivityManager d = m18221d(context, g0Var);
        if (d == null) {
            return EnumC8744a.UNKNOWN;
        }
        return m18224a(context, d, g0Var);
    }

    @SuppressLint({"ObsoleteSdkInt", "MissingPermission", "NewApi"})
    /* renamed from: c */
    public static String m18222c(Context context, AbstractC8869g0 g0Var, C8715f0 f0Var) {
        boolean z;
        ConnectivityManager d = m18221d(context, g0Var);
        if (d == null) {
            return null;
        }
        boolean z2 = false;
        if (!C8748f.m18212a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            g0Var.mo17722c(EnumC8942n3.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return null;
        }
        boolean z3 = true;
        if (f0Var.m18303d() >= 23) {
            Network activeNetwork = d.getActiveNetwork();
            if (activeNetwork == null) {
                g0Var.mo17722c(EnumC8942n3.INFO, "Network is null and cannot check network status", new Object[0]);
                return null;
            }
            NetworkCapabilities networkCapabilities = d.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities == null) {
                g0Var.mo17722c(EnumC8942n3.INFO, "NetworkCapabilities is null and cannot check network type", new Object[0]);
                return null;
            }
            boolean hasTransport = networkCapabilities.hasTransport(3);
            z = networkCapabilities.hasTransport(1);
            z3 = networkCapabilities.hasTransport(0);
            z2 = hasTransport;
        } else {
            NetworkInfo activeNetworkInfo = d.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                g0Var.mo17722c(EnumC8942n3.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
                return null;
            }
            int type = activeNetworkInfo.getType();
            if (type == 0) {
                z = false;
            } else if (type != 1) {
                if (type != 9) {
                    z = false;
                } else {
                    z = false;
                    z2 = true;
                }
                z3 = z;
            } else {
                z = true;
                z3 = false;
            }
        }
        if (z2) {
            return "ethernet";
        }
        if (z) {
            return "wifi";
        }
        if (z3) {
            return "cellular";
        }
        return null;
    }

    /* renamed from: d */
    private static ConnectivityManager m18221d(Context context, AbstractC8869g0 g0Var) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            g0Var.mo17722c(EnumC8942n3.INFO, "ConnectivityManager is null and cannot check network status", new Object[0]);
        }
        return connectivityManager;
    }
}
