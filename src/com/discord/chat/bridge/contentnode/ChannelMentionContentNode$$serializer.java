package com.discord.chat.bridge.contentnode;

import bj.AbstractC2522f0;
import bj.C2500a2;
import bj.C2521f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC9967c;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p450yi.C14382n;
import p470zi.C14606a;

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/chat/bridge/contentnode/ChannelMentionContentNode.$serializer", "Lbj/f0;", "Lcom/discord/chat/bridge/contentnode/ChannelMentionContentNode;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ChannelMentionContentNode$$serializer implements AbstractC2522f0<ChannelMentionContentNode> {
    public static final ChannelMentionContentNode$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ChannelMentionContentNode$$serializer channelMentionContentNode$$serializer = new ChannelMentionContentNode$$serializer();
        INSTANCE = channelMentionContentNode$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("channelMention", channelMentionContentNode$$serializer, 6);
        pluginGeneratedSerialDescriptor.m13841l("channelId", false);
        pluginGeneratedSerialDescriptor.m13841l("guildId", true);
        pluginGeneratedSerialDescriptor.m13841l("messageId", true);
        pluginGeneratedSerialDescriptor.m13841l("originalLink", true);
        pluginGeneratedSerialDescriptor.m13841l("inContent", true);
        pluginGeneratedSerialDescriptor.m13841l("content", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ChannelMentionContentNode$$serializer() {
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] childSerializers() {
        C2500a2 a2Var = C2500a2.f6719a;
        ContentNodeSerializer contentNodeSerializer = ContentNodeSerializer.INSTANCE;
        return new KSerializer[]{a2Var, C14606a.m13u(a2Var), C14606a.m13u(a2Var), C14606a.m13u(a2Var), C14606a.m13u(new C2521f(contentNodeSerializer)), C14606a.m13u(new C2521f(contentNodeSerializer))};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ChannelMentionContentNode deserialize(Decoder decoder) {
        String str;
        int i;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        C9677q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC9967c b = decoder.mo13905b(descriptor2);
        boolean z = true;
        String str2 = null;
        if (b.mo13850p()) {
            str = b.mo13853m(descriptor2, 0);
            C2500a2 a2Var = C2500a2.f6719a;
            obj = b.mo13852n(descriptor2, 1, a2Var, null);
            obj2 = b.mo13852n(descriptor2, 2, a2Var, null);
            obj4 = b.mo13852n(descriptor2, 3, a2Var, null);
            ContentNodeSerializer contentNodeSerializer = ContentNodeSerializer.INSTANCE;
            obj3 = b.mo13852n(descriptor2, 4, new C2521f(contentNodeSerializer), null);
            obj5 = b.mo13852n(descriptor2, 5, new C2521f(contentNodeSerializer), null);
            i = 63;
        } else {
            boolean z2 = true;
            int i2 = 0;
            Object obj6 = null;
            Object obj7 = null;
            Object obj8 = null;
            Object obj9 = null;
            Object obj10 = null;
            while (z2) {
                int o = b.mo13851o(descriptor2);
                switch (o) {
                    case -1:
                        z2 = false;
                        z = z;
                        continue;
                    case 0:
                        str2 = b.mo13853m(descriptor2, 0);
                        i2 |= 1;
                        z = z;
                        continue;
                    case 1:
                        obj6 = b.mo13852n(descriptor2, 1, C2500a2.f6719a, obj6);
                        i2 |= 2;
                        z = true;
                        break;
                    case 2:
                        obj7 = b.mo13852n(descriptor2, 2, C2500a2.f6719a, obj7);
                        i2 |= 4;
                        z = true;
                        break;
                    case 3:
                        obj8 = b.mo13852n(descriptor2, 3, C2500a2.f6719a, obj8);
                        i2 |= 8;
                        z = true;
                        break;
                    case 4:
                        obj9 = b.mo13852n(descriptor2, 4, new C2521f(ContentNodeSerializer.INSTANCE), obj9);
                        i2 |= 16;
                        z = true;
                        break;
                    case 5:
                        obj10 = b.mo13852n(descriptor2, 5, new C2521f(ContentNodeSerializer.INSTANCE), obj10);
                        i2 |= 32;
                        z = true;
                        break;
                    default:
                        throw new C14382n(o);
                }
            }
            obj = obj6;
            obj2 = obj7;
            obj4 = obj8;
            obj3 = obj9;
            obj5 = obj10;
            i = i2;
            str = str2;
        }
        b.mo13857c(descriptor2);
        return new ChannelMentionContentNode(i, str, (String) obj, (String) obj2, (String) obj4, (List) obj3, (List) obj5, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, p450yi.AbstractC14372h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, ChannelMentionContentNode value) {
        C9677q.m14633g(encoder, "encoder");
        C9677q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        ChannelMentionContentNode.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC2522f0.C2523a.m33897a(this);
    }
}
