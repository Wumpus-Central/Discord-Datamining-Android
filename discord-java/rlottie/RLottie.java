package com.discord.rlottie;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/discord/rlottie/RLottie;", "", "()V", "init", "", "rlottie_release"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes6.dex */
public final class RLottie {
    public static final RLottie INSTANCE = new RLottie();

    private RLottie() {
    }

    public final void init() {
        System.loadLibrary("dsti");
    }
}
