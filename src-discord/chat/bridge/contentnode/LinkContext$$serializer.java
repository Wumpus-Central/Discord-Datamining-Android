package com.discord.chat.bridge.contentnode;

import bj.f0;
import j$.util.Spliterator;
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

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/contentnode/LinkContext.$serializer", "Lbj/f0;", "Lcom/discord/chat/bridge/contentnode/LinkContext;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class LinkContext$$serializer implements f0<LinkContext> {
    public static final LinkContext$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        LinkContext$$serializer linkContext$$serializer = new LinkContext$$serializer();
        INSTANCE = linkContext$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.contentnode.LinkContext", linkContext$$serializer, 10);
        pluginGeneratedSerialDescriptor.l("usernameOnClick", true);
        pluginGeneratedSerialDescriptor.l("otherUsernameOnClick", true);
        pluginGeneratedSerialDescriptor.l("commandNameOnClick", true);
        pluginGeneratedSerialDescriptor.l("actorHook", true);
        pluginGeneratedSerialDescriptor.l("threadOnClick", true);
        pluginGeneratedSerialDescriptor.l("pinsOnClick", true);
        pluginGeneratedSerialDescriptor.l("webhookNameOnClick", true);
        pluginGeneratedSerialDescriptor.l("handleDelete", true);
        pluginGeneratedSerialDescriptor.l("roleSubscriptionOnClick", true);
        pluginGeneratedSerialDescriptor.l("handleMessage", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LinkContext$$serializer() {
    }

    @Override // bj.f0
    public KSerializer<?>[] childSerializers() {
        UserNameOnClick$$serializer userNameOnClick$$serializer = UserNameOnClick$$serializer.INSTANCE;
        return new KSerializer[]{a.u(userNameOnClick$$serializer), a.u(userNameOnClick$$serializer), a.u(CommandOnClick$$serializer.INSTANCE), a.u(ActorHook$$serializer.INSTANCE), a.u(ThreadOnClick$$serializer.INSTANCE), a.u(PinsOnClick$$serializer.INSTANCE), a.u(WebhookNameOnClick$$serializer.INSTANCE), a.u(HandleDelete$$serializer.INSTANCE), a.u(RoleSubscriptionOnClick$$serializer.INSTANCE), a.u(HandleMessage$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public LinkContext deserialize(Decoder decoder) {
        int i10;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        int i11 = 9;
        Object obj10 = null;
        if (b10.p()) {
            UserNameOnClick$$serializer userNameOnClick$$serializer = UserNameOnClick$$serializer.INSTANCE;
            obj10 = b10.n(descriptor2, 0, userNameOnClick$$serializer, null);
            obj9 = b10.n(descriptor2, 1, userNameOnClick$$serializer, null);
            obj = b10.n(descriptor2, 2, CommandOnClick$$serializer.INSTANCE, null);
            obj4 = b10.n(descriptor2, 3, ActorHook$$serializer.INSTANCE, null);
            obj2 = b10.n(descriptor2, 4, ThreadOnClick$$serializer.INSTANCE, null);
            obj5 = b10.n(descriptor2, 5, PinsOnClick$$serializer.INSTANCE, null);
            obj6 = b10.n(descriptor2, 6, WebhookNameOnClick$$serializer.INSTANCE, null);
            obj7 = b10.n(descriptor2, 7, HandleDelete$$serializer.INSTANCE, null);
            obj3 = b10.n(descriptor2, 8, RoleSubscriptionOnClick$$serializer.INSTANCE, null);
            obj8 = b10.n(descriptor2, 9, HandleMessage$$serializer.INSTANCE, null);
            i10 = 1023;
        } else {
            boolean z10 = true;
            int i12 = 0;
            Object obj11 = null;
            Object obj12 = null;
            Object obj13 = null;
            Object obj14 = null;
            Object obj15 = null;
            Object obj16 = null;
            Object obj17 = null;
            Object obj18 = null;
            Object obj19 = null;
            while (z10) {
                int o10 = b10.o(descriptor2);
                switch (o10) {
                    case -1:
                        z10 = false;
                        i11 = 9;
                        break;
                    case 0:
                        obj10 = b10.n(descriptor2, 0, UserNameOnClick$$serializer.INSTANCE, obj10);
                        i12 |= 1;
                        i11 = 9;
                        break;
                    case 1:
                        obj18 = b10.n(descriptor2, 1, UserNameOnClick$$serializer.INSTANCE, obj18);
                        i12 |= 2;
                        i11 = 9;
                        break;
                    case 2:
                        obj19 = b10.n(descriptor2, 2, CommandOnClick$$serializer.INSTANCE, obj19);
                        i12 |= 4;
                        i11 = 9;
                        break;
                    case 3:
                        obj17 = b10.n(descriptor2, 3, ActorHook$$serializer.INSTANCE, obj17);
                        i12 |= 8;
                        i11 = 9;
                        break;
                    case 4:
                        obj16 = b10.n(descriptor2, 4, ThreadOnClick$$serializer.INSTANCE, obj16);
                        i12 |= 16;
                        i11 = 9;
                        break;
                    case 5:
                        obj15 = b10.n(descriptor2, 5, PinsOnClick$$serializer.INSTANCE, obj15);
                        i12 |= 32;
                        i11 = 9;
                        break;
                    case 6:
                        obj13 = b10.n(descriptor2, 6, WebhookNameOnClick$$serializer.INSTANCE, obj13);
                        i12 |= 64;
                        i11 = 9;
                        break;
                    case 7:
                        obj14 = b10.n(descriptor2, 7, HandleDelete$$serializer.INSTANCE, obj14);
                        i12 |= 128;
                        i11 = 9;
                        continue;
                    case 8:
                        obj12 = b10.n(descriptor2, 8, RoleSubscriptionOnClick$$serializer.INSTANCE, obj12);
                        i12 |= Spliterator.NONNULL;
                        break;
                    case 9:
                        obj11 = b10.n(descriptor2, i11, HandleMessage$$serializer.INSTANCE, obj11);
                        i12 |= 512;
                        break;
                    default:
                        throw new n(o10);
                }
            }
            obj8 = obj11;
            obj3 = obj12;
            obj6 = obj13;
            obj7 = obj14;
            obj5 = obj15;
            obj2 = obj16;
            obj4 = obj17;
            obj = obj19;
            i10 = i12;
            obj9 = obj18;
        }
        b10.c(descriptor2);
        return new LinkContext(i10, (UserNameOnClick) obj10, (UserNameOnClick) obj9, (CommandOnClick) obj, (ActorHook) obj4, (ThreadOnClick) obj2, (PinsOnClick) obj5, (WebhookNameOnClick) obj6, (HandleDelete) obj7, (RoleSubscriptionOnClick) obj3, (HandleMessage) obj8, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, yi.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, LinkContext value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        LinkContext.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // bj.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
