package ca;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import p420x9.C14004p;

/* renamed from: ca.k */
/* loaded from: classes5.dex */
public class C3804k {

    /* renamed from: a */
    private static String f6298a;

    /* renamed from: b */
    private static int f6299b;

    /* renamed from: a */
    public static String m33555a() {
        BufferedReader bufferedReader;
        Throwable th2;
        if (f6298a == null) {
            int i = f6299b;
            if (i == 0) {
                i = Process.myPid();
                f6299b = i;
            }
            String str = null;
            str = null;
            BufferedReader bufferedReader2 = null;
            str = null;
            if (i > 0) {
                try {
                    StringBuilder sb2 = new StringBuilder(25);
                    sb2.append("/proc/");
                    sb2.append(i);
                    sb2.append("/cmdline");
                    String sb3 = sb2.toString();
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        bufferedReader = new BufferedReader(new FileReader(sb3));
                        try {
                            String readLine = bufferedReader.readLine();
                            C14004p.m2051j(readLine);
                            str = readLine.trim();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            th2 = th3;
                            bufferedReader2 = bufferedReader;
                            C3802i.m33567b(bufferedReader2);
                            throw th2;
                        }
                    } finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                } catch (IOException unused2) {
                    bufferedReader = null;
                } catch (Throwable th4) {
                    th2 = th4;
                }
                C3802i.m33567b(bufferedReader);
            }
            f6298a = str;
        }
        return f6298a;
    }
}
