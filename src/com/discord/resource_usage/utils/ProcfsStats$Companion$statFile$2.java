package com.discord.resource_usage.utils;

import android.os.Process;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9679s;

@Metadata(m15074d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m15073d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes6.dex */
final class ProcfsStats$Companion$statFile$2 extends AbstractC9679s implements Function0<File> {
    public static final ProcfsStats$Companion$statFile$2 INSTANCE = new ProcfsStats$Companion$statFile$2();

    ProcfsStats$Companion$statFile$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final File invoke() {
        int myPid = Process.myPid();
        return new File("/proc/" + myPid + "/stat");
    }
}
