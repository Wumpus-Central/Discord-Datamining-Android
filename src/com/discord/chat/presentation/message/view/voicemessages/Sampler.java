package com.discord.chat.presentation.message.view.voicemessages;

import eg.C6884j;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C9897e;
import kotlin.jvm.internal.C9971q;
import kotlin.ranges.IntRange;
import p267of.AbstractC11283p;

@Metadata(m15074d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m15073d2 = {"Lcom/discord/chat/presentation/message/view/voicemessages/Sampler;", "", "()V", "downSample", "", "data", "targetSize", "", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class Sampler {
    public static final Sampler INSTANCE = new Sampler();

    private Sampler() {
    }

    public final byte[] downSample(byte[] data, int i) {
        boolean z;
        IntRange q;
        byte[] n;
        C9971q.m14633g(data, "data");
        if (i == 0) {
            return new byte[0];
        }
        if (data.length == i) {
            return data;
        }
        if (data.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new byte[i];
        }
        if (data.length < i) {
            n = C9897e.m14981n(data, new byte[i - data.length]);
            return n;
        }
        float length = data.length / i;
        byte[] bArr = new byte[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = i2 + 1;
            int rint = (int) Math.rint(i4 * length);
            q = C6884j.m23947q(i3, Math.min(rint, data.length));
            Iterator<Integer> it = q.iterator();
            int i5 = 0;
            int i6 = 0;
            while (it.hasNext()) {
                i5 += SamplerKt.getAbs(data[((AbstractC11283p) it).nextInt()]);
                i6++;
            }
            bArr[i2] = (byte) (i5 / i6);
            i2 = i4;
            i3 = rint;
        }
        return bArr;
    }
}
