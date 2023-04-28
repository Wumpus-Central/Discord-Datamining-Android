package com.discord.notifications.api;

import com.discord.primitives.ChannelId;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p327ri.C12586t;
import p327ri.C12588v;
import p470zi.C14606a;

@Metadata(m15074d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000J!\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016ø\u0001\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, m15073d2 = {"Lcom/discord/notifications/api/ChannelListSerializer;", "Lkotlinx/serialization/KSerializer;", "", "Lcom/discord/primitives/ChannelId;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "notification_api_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class ChannelListSerializer implements KSerializer<List<? extends ChannelId>> {
    public static final ChannelListSerializer INSTANCE = new ChannelListSerializer();

    private ChannelListSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, p450yi.AbstractC14372h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return C14606a.m26h(ChannelId.Companion.serializer()).getDescriptor();
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public List<ChannelId> deserialize(Decoder decoder) {
        List<String> z0;
        Long o;
        C9677q.m14633g(decoder, "decoder");
        z0 = C12588v.m5660z0(decoder.mo13894z(), new String[]{","}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        for (String str : z0) {
            o = C12586t.m5745o(str);
            ChannelId channelId = o != null ? ChannelId.m42089boximpl(ChannelId.m42090constructorimpl(o.longValue())) : null;
            if (channelId != null) {
                arrayList.add(channelId);
            }
        }
        return arrayList;
    }

    public void serialize(Encoder encoder, List<ChannelId> value) {
        C9677q.m14633g(encoder, "encoder");
        C9677q.m14633g(value, "value");
        throw new UnsupportedOperationException();
    }
}
