package com.discord.chat.presentation.message.view.voicemessages;

import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m15073d2 = {"abs", "", "getAbs", "(B)B", "chat_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class SamplerKt {
    public static final byte getAbs(byte b) {
        if (b == Byte.MIN_VALUE) {
            return Byte.MAX_VALUE;
        }
        boolean z = false;
        if (-127 <= b && b < 1) {
            z = true;
        }
        return z ? (byte) (-b) : b;
    }
}
