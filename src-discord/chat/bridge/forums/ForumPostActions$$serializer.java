package com.discord.chat.bridge.forums;

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
import pi.n;
import qi.a;
import si.a2;
import si.f0;
import si.h;
import si.m0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/forums/ForumPostActions.$serializer", "Lsi/f0;", "Lcom/discord/chat/bridge/forums/ForumPostActions;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ForumPostActions$$serializer implements f0<ForumPostActions> {
    public static final ForumPostActions$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ForumPostActions$$serializer forumPostActions$$serializer = new ForumPostActions$$serializer();
        INSTANCE = forumPostActions$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.forums.ForumPostActions", forumPostActions$$serializer, 8);
        pluginGeneratedSerialDescriptor.l("numDisplayedReactions", false);
        pluginGeneratedSerialDescriptor.l("isFollowing", false);
        pluginGeneratedSerialDescriptor.l("followIcon", true);
        pluginGeneratedSerialDescriptor.l("followLabel", false);
        pluginGeneratedSerialDescriptor.l("shareIcon", true);
        pluginGeneratedSerialDescriptor.l("shareLabel", false);
        pluginGeneratedSerialDescriptor.l("defaultReaction", true);
        pluginGeneratedSerialDescriptor.l("sharePrompt", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ForumPostActions$$serializer() {
    }

    @Override // si.f0
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f26230a;
        return new KSerializer[]{m0.f26305a, h.f26272a, a.u(a2Var), a2Var, a.u(a2Var), a2Var, a.u(MessageReaction$$serializer.INSTANCE), a.u(PostSharePrompt$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ForumPostActions deserialize(Decoder decoder) {
        String str;
        String str2;
        boolean z10;
        int i10;
        int i11;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        char c10;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c11 = decoder.c(descriptor2);
        int i12 = 7;
        if (c11.y()) {
            i10 = c11.k(descriptor2, 0);
            z10 = c11.s(descriptor2, 1);
            a2 a2Var = a2.f26230a;
            obj = c11.v(descriptor2, 2, a2Var, null);
            str2 = c11.t(descriptor2, 3);
            obj2 = c11.v(descriptor2, 4, a2Var, null);
            str = c11.t(descriptor2, 5);
            obj3 = c11.v(descriptor2, 6, MessageReaction$$serializer.INSTANCE, null);
            obj4 = c11.v(descriptor2, 7, PostSharePrompt$$serializer.INSTANCE, null);
            i11 = 255;
        } else {
            boolean z11 = true;
            int i13 = 0;
            int i14 = 0;
            Object obj5 = null;
            Object obj6 = null;
            str2 = null;
            Object obj7 = null;
            str = null;
            Object obj8 = null;
            boolean z12 = false;
            while (z11) {
                int x10 = c11.x(descriptor2);
                switch (x10) {
                    case -1:
                        z11 = false;
                    case 0:
                        i13 = c11.k(descriptor2, 0);
                        i14 |= 1;
                        i12 = 7;
                    case 1:
                        c10 = 2;
                        z12 = c11.s(descriptor2, 1);
                        i14 |= 2;
                        i12 = 7;
                    case 2:
                        c10 = 2;
                        obj6 = c11.v(descriptor2, 2, a2.f26230a, obj6);
                        i14 |= 4;
                        i12 = 7;
                    case 3:
                        str2 = c11.t(descriptor2, 3);
                        i14 |= 8;
                    case 4:
                        obj7 = c11.v(descriptor2, 4, a2.f26230a, obj7);
                        i14 |= 16;
                    case 5:
                        str = c11.t(descriptor2, 5);
                        i14 |= 32;
                    case 6:
                        obj8 = c11.v(descriptor2, 6, MessageReaction$$serializer.INSTANCE, obj8);
                        i14 |= 64;
                    case 7:
                        obj5 = c11.v(descriptor2, i12, PostSharePrompt$$serializer.INSTANCE, obj5);
                        i14 |= 128;
                    default:
                        throw new n(x10);
                }
            }
            obj4 = obj5;
            obj3 = obj8;
            i11 = i14;
            obj = obj6;
            obj2 = obj7;
            z10 = z12;
            i10 = i13;
        }
        c11.b(descriptor2);
        return new ForumPostActions(i11, i10, z10, (String) obj, str2, (String) obj2, str, (MessageReaction) obj3, (PostSharePrompt) obj4, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, pi.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, ForumPostActions value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder c10 = encoder.c(descriptor2);
        ForumPostActions.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override // si.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
