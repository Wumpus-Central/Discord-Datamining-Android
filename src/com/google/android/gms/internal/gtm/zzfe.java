package com.google.android.gms.internal.gtm;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.Map;
import p163j$.util.Spliterator;
import p213l9.C10373n;
import p420x9.C14004p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfe extends zzbs {
    private static final byte[] zza = ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE.getBytes();
    private final String zzb = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", "GoogleAnalytics", zzbt.zza, Build.VERSION.RELEASE, zzfs.zzd(Locale.getDefault()), Build.MODEL, Build.ID);
    private final zzfo zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfe(zzbv zzbvVar) {
        super(zzbvVar);
        this.zzc = new zzfo(zzbvVar.zzr());
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzg(java.net.URL r6, byte[] r7) {
        /*
            r5 = this;
            java.lang.String r0 = "Error closing http post connection output stream"
            p420x9.C14004p.m2051j(r6)
            p420x9.C14004p.m2051j(r7)
            int r1 = r7.length
            java.lang.String r2 = "POST bytes, url"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r5.zzH(r2, r3, r6)
            boolean r2 = com.google.android.gms.internal.gtm.zzbr.zzV()
            if (r2 == 0) goto L_0x0022
            java.lang.String r2 = new java.lang.String
            r2.<init>(r7)
            java.lang.String r3 = "Post payload\n"
            r5.zzP(r3, r2)
        L_0x0022:
            r2 = 0
            android.content.Context r3 = r5.zzo()     // Catch: all -> 0x006e, IOException -> 0x0072
            r3.getPackageName()     // Catch: all -> 0x006e, IOException -> 0x0072
            java.net.HttpURLConnection r6 = r5.zzb(r6)     // Catch: all -> 0x006e, IOException -> 0x0072
            r3 = 1
            r6.setDoOutput(r3)     // Catch: all -> 0x0067, IOException -> 0x0069
            r6.setFixedLengthStreamingMode(r1)     // Catch: all -> 0x0067, IOException -> 0x0069
            r6.connect()     // Catch: all -> 0x0067, IOException -> 0x0069
            java.io.OutputStream r2 = r6.getOutputStream()     // Catch: all -> 0x0067, IOException -> 0x0069
            r2.write(r7)     // Catch: all -> 0x0067, IOException -> 0x0069
            r5.zzk(r6)     // Catch: all -> 0x0067, IOException -> 0x0069
            int r7 = r6.getResponseCode()     // Catch: all -> 0x0067, IOException -> 0x0069
            r1 = 200(0xc8, float:2.8E-43)
            if (r7 != r1) goto L_0x0052
            com.google.android.gms.internal.gtm.zzbq r7 = r5.zzs()     // Catch: all -> 0x0067, IOException -> 0x0069
            r7.zzi()     // Catch: all -> 0x0067, IOException -> 0x0069
            r7 = r1
        L_0x0052:
            java.lang.String r1 = "POST status"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)     // Catch: all -> 0x0067, IOException -> 0x0069
            r5.zzG(r1, r3)     // Catch: all -> 0x0067, IOException -> 0x0069
            r2.close()     // Catch: IOException -> 0x005f
            goto L_0x0063
        L_0x005f:
            r1 = move-exception
            r5.zzK(r0, r1)
        L_0x0063:
            r6.disconnect()
            return r7
        L_0x0067:
            r7 = move-exception
            goto L_0x008f
        L_0x0069:
            r7 = move-exception
            r4 = r2
            r2 = r6
            r6 = r4
            goto L_0x0075
        L_0x006e:
            r6 = move-exception
            r7 = r6
            r6 = r2
            goto L_0x008f
        L_0x0072:
            r6 = move-exception
            r7 = r6
            r6 = r2
        L_0x0075:
            java.lang.String r1 = "Network POST connection error"
            r5.zzS(r1, r7)     // Catch: all -> 0x008b
            if (r6 == 0) goto L_0x0084
            r6.close()     // Catch: IOException -> 0x0080
            goto L_0x0084
        L_0x0080:
            r6 = move-exception
            r5.zzK(r0, r6)
        L_0x0084:
            if (r2 == 0) goto L_0x0089
            r2.disconnect()
        L_0x0089:
            r6 = 0
            return r6
        L_0x008b:
            r7 = move-exception
            r4 = r2
            r2 = r6
            r6 = r4
        L_0x008f:
            if (r2 == 0) goto L_0x0099
            r2.close()     // Catch: IOException -> 0x0095
            goto L_0x0099
        L_0x0095:
            r1 = move-exception
            r5.zzK(r0, r1)
        L_0x0099:
            if (r6 == 0) goto L_0x009e
            r6.disconnect()
        L_0x009e:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfe.zzg(java.net.URL, byte[]):int");
    }

    private final URL zzh() {
        String str;
        zzw();
        String zzi = zzct.zzi();
        zzw();
        String zzb = zzeu.zzt.zzb();
        if (zzb.length() != 0) {
            str = zzi.concat(zzb);
        } else {
            str = new String(zzi);
        }
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            zzK("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    private final URL zzi(zzex zzexVar) {
        String str;
        String str2;
        if (zzexVar.zzh()) {
            zzw();
            String zzi = zzct.zzi();
            zzw();
            String zzj = zzct.zzj();
            if (zzj.length() != 0) {
                str = zzi.concat(zzj);
            } else {
                str2 = new String(zzi);
                str = str2;
            }
        } else {
            zzw();
            String zzk = zzct.zzk();
            zzw();
            String zzj2 = zzct.zzj();
            if (zzj2.length() != 0) {
                str = zzk.concat(zzj2);
            } else {
                str2 = new String(zzk);
                str = str2;
            }
        }
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            zzK("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    private final URL zzj(zzex zzexVar, String str) {
        String str2;
        if (zzexVar.zzh()) {
            zzw();
            String zzi = zzct.zzi();
            zzw();
            String zzj = zzct.zzj();
            int length = zzi.length();
            StringBuilder sb2 = new StringBuilder(length + 1 + zzj.length() + str.length());
            sb2.append(zzi);
            sb2.append(zzj);
            sb2.append("?");
            sb2.append(str);
            str2 = sb2.toString();
        } else {
            zzw();
            String zzk = zzct.zzk();
            zzw();
            String zzj2 = zzct.zzj();
            int length2 = zzk.length();
            StringBuilder sb3 = new StringBuilder(length2 + 1 + zzj2.length() + str.length());
            sb3.append(zzk);
            sb3.append(zzj2);
            sb3.append("?");
            sb3.append(str);
            str2 = sb3.toString();
        }
        try {
            return new URL(str2);
        } catch (MalformedURLException e) {
            zzK("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    private final void zzk(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        Throwable th2;
        try {
            inputStream = httpURLConnection.getInputStream();
            try {
                do {
                } while (inputStream.read(new byte[Spliterator.IMMUTABLE]) > 0);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    zzK("Error closing http connection input stream", e);
                }
            } catch (Throwable th3) {
                th2 = th3;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e2) {
                        zzK("Error closing http connection input stream", e2);
                    }
                }
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            inputStream = null;
        }
    }

    private static final void zzl(StringBuilder sb2, String str, String str2) {
        if (sb2.length() != 0) {
            sb2.append('&');
        }
        sb2.append(URLEncoder.encode(str, "UTF-8"));
        sb2.append('=');
        sb2.append(URLEncoder.encode(str2, "UTF-8"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zza(zzex zzexVar, boolean z) {
        String str;
        C14004p.m2051j(zzexVar);
        StringBuilder sb2 = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : zzexVar.zzg().entrySet()) {
                String key = entry.getKey();
                if (!"ht".equals(key) && !"qt".equals(key) && !"AppUID".equals(key) && !"z".equals(key) && !"_gmsv".equals(key)) {
                    zzl(sb2, key, entry.getValue());
                }
            }
            zzl(sb2, "ht", String.valueOf(zzexVar.zzd()));
            zzl(sb2, "qt", String.valueOf(zzC().mo33581a() - zzexVar.zzd()));
            zzw();
            if (z) {
                long zzc = zzexVar.zzc();
                if (zzc != 0) {
                    str = String.valueOf(zzc);
                } else {
                    str = String.valueOf(zzexVar.zzb());
                }
                zzl(sb2, "z", str);
            }
            return sb2.toString();
        } catch (UnsupportedEncodingException e) {
            zzK("Failed to encode name or value", e);
            return null;
        }
    }

    final HttpURLConnection zzb(URL url) {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            zzw();
            httpURLConnection.setConnectTimeout(zzeu.zzE.zzb().intValue());
            zzw();
            httpURLConnection.setReadTimeout(zzeu.zzF.zzb().intValue());
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestProperty("User-Agent", this.zzb);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain http connection");
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0322 A[EDGE_INSN: B:166:0x0322->B:144:0x0322 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0225  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<java.lang.Long> zzc(java.util.List<com.google.android.gms.internal.gtm.zzex> r20) {
        /*
            Method dump skipped, instructions count: 803
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfe.zzc(java.util.List):java.util.List");
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    protected final void zzd() {
        zzP("Network initialized. User agent", this.zzb);
    }

    public final boolean zze() {
        NetworkInfo networkInfo;
        C10373n.m13537d();
        zzW();
        try {
            networkInfo = ((ConnectivityManager) zzo().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        zzO("No network connectivity");
        return false;
    }
}
