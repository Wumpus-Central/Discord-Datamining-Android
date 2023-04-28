package p200kf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/* renamed from: kf.e */
/* loaded from: classes8.dex */
public class C9858e {
    /* renamed from: a */
    public static void m15184a(String str, String str2) {
        Throwable th2;
        FileChannel fileChannel;
        FileChannel channel;
        if (!str.equalsIgnoreCase(str2)) {
            FileChannel fileChannel2 = null;
            try {
                channel = new FileInputStream(new File(str)).getChannel();
            } catch (Throwable th3) {
                th2 = th3;
                fileChannel = null;
            }
            try {
                fileChannel2 = new FileOutputStream(new File(str2)).getChannel();
                channel.transferTo(0L, channel.size(), fileChannel2);
                channel.close();
                channel.close();
                if (fileChannel2 != null) {
                    fileChannel2.close();
                }
            } catch (Throwable th4) {
                th2 = th4;
                fileChannel2 = channel;
                fileChannel = fileChannel2;
                if (fileChannel2 != null) {
                    fileChannel2.close();
                }
                if (fileChannel != null) {
                    fileChannel.close();
                }
                throw th2;
            }
        }
    }
}
