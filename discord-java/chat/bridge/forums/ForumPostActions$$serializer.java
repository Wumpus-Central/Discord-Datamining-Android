package com.discord.chat.bridge.forums;

import bj.a2;
import bj.f0;
import bj.h;
import bj.m0;
import com.discord.chat.bridge.reaction.MessageReaction;
import com.discord.chat.bridge.reaction.MessageReaction$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import yi.n;
import zi.a;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/forums/ForumPostActions.$serializer", "Lbj/f0;", "Lcom/discord/chat/bridge/forums/ForumPostActions;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ForumPostActions$$serializer implements f0<ForumPostActions> {
    public static final ForumPostActions$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ForumPostActions$$serializer forumPostActions$$serializer = new ForumPostActions$$serializer();
        INSTANCE = forumPostActions$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.forums.ForumPostActions", forumPostActions$$serializer, 7);
        pluginGeneratedSerialDescriptor.l("numDisplayedReactions", false);
        pluginGeneratedSerialDescriptor.l("isFollowing", false);
        pluginGeneratedSerialDescriptor.l("followIcon", false);
        pluginGeneratedSerialDescriptor.l("followLabel", false);
        pluginGeneratedSerialDescriptor.l("shareIcon", false);
        pluginGeneratedSerialDescriptor.l("shareLabel", false);
        pluginGeneratedSerialDescriptor.l("defaultReaction", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ForumPostActions$$serializer() {
    }

    @Override // bj.f0
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f5917a;
        return new KSerializer[]{m0.f5992a, h.f5959a, a2Var, a2Var, a2Var, a2Var, a.u(MessageReaction$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ForumPostActions deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z10;
        int i10;
        int i11;
        Object obj;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        if (b10.p()) {
            i10 = b10.i(descriptor2, 0);
            z10 = b10.C(descriptor2, 1);
            str4 = b10.m(descriptor2, 2);
            str3 = b10.m(descriptor2, 3);
            str2 = b10.m(descriptor2, 4);
            str = b10.m(descriptor2, 5);
            obj = b10.n(descriptor2, 6, MessageReaction$$serializer.INSTANCE, null);
            i11 = 127;
        } else {
            boolean z11 = true;
            int i12 = 0;
            int i13 = 0;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            Object obj2 = null;
            boolean z12 = false;
            while (z11) {
                int o10 = b10.o(descriptor2);
                switch (o10) {
                    case -1:
                        z11 = false;
                        break;
                    case 0:
                        i12 = b10.i(descriptor2, 0);
                        i13 |= 1;
                        continue;
                    case 1:
                        z12 = b10.C(descriptor2, 1);
                        i13 |= 2;
                        continue;
                    case 2:
                        str5 = b10.m(descriptor2, 2);
                        i13 |= 4;
                        break;
                    case 3:
                        str6 = b10.m(descriptor2, 3);
                        i13 |= 8;
                        break;
                    case 4:
                        str7 = b10.m(descriptor2, 4);
                        i13 |= 16;
                        break;
                    case 5:
                        str8 = b10.m(descriptor2, 5);
                        i13 |= 32;
                        break;
                    case 6:
                        obj2 = b10.n(descriptor2, 6, MessageReaction$$serializer.INSTANCE, obj2);
                        i13 |= 64;
                        break;
                    default:
                        throw new n(o10);
                }
            }
            obj = obj2;
            str = str8;
            str2 = str7;
            str3 = str6;
            str4 = str5;
            z10 = z12;
            i11 = i13;
            i10 = i12;
        }
        b10.c(descriptor2);
        return new ForumPostActions(i11, i10, z10, str4, str3, str2, str, (MessageReaction) obj, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, yi.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, ForumPostActions value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        ForumPostActions.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // bj.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
