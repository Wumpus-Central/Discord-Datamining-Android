package com.discord.chat.presentation.message.view.voicemessages;

import gf.p;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.e;
import kotlin.jvm.internal.q;
import kotlin.ranges.IntRange;
import wf.j;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/discord/chat/presentation/message/view/voicemessages/Sampler;", "", "()V", "downSample", "", "data", "targetSize", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class Sampler {
    public static final Sampler INSTANCE = new Sampler();

    private Sampler() {
    }

    public final byte[] downSample(byte[] data, int i10) {
        boolean z10;
        IntRange p10;
        byte[] n10;
        q.g(data, "data");
        if (i10 == 0) {
            return new byte[0];
        }
        if (data.length == i10) {
            return data;
        }
        if (data.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new byte[i10];
        }
        if (data.length < i10) {
            n10 = e.n(data, new byte[i10 - data.length]);
            return n10;
        }
        float length = data.length / i10;
        byte[] bArr = new byte[i10];
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            int i13 = i11 + 1;
            int rint = (int) Math.rint(i13 * length);
            p10 = j.p(i12, Math.min(rint, data.length));
            Iterator<Integer> it = p10.iterator();
            int i14 = 0;
            int i15 = 0;
            while (it.hasNext()) {
                i14 += SamplerKt.getAbs(data[((p) it).nextInt()]);
                i15++;
            }
            bArr[i11] = (byte) (i14 / i15);
            i11 = i13;
            i12 = rint;
        }
        return bArr;
    }
}
