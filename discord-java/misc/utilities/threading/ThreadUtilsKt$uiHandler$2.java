package com.discord.misc.utilities.threading;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/os/Handler;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
final class ThreadUtilsKt$uiHandler$2 extends s implements Function0<Handler> {
    public static final ThreadUtilsKt$uiHandler$2 INSTANCE = new ThreadUtilsKt$uiHandler$2();

    ThreadUtilsKt$uiHandler$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Handler invoke() {
        return new Handler(Looper.getMainLooper());
    }
}
