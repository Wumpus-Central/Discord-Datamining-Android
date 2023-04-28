package com.discord.chat.bridge.contentnode;

import bj.AbstractC2522f0;
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
import p164j$.util.Spliterator;
import p450yi.C14382n;
import p470zi.C14606a;

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/chat/bridge/contentnode/LinkContext.$serializer", "Lbj/f0;", "Lcom/discord/chat/bridge/contentnode/LinkContext;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class LinkContext$$serializer implements AbstractC2522f0<LinkContext> {
    public static final LinkContext$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        LinkContext$$serializer linkContext$$serializer = new LinkContext$$serializer();
        INSTANCE = linkContext$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.contentnode.LinkContext", linkContext$$serializer, 10);
        pluginGeneratedSerialDescriptor.m13841l("usernameOnClick", true);
        pluginGeneratedSerialDescriptor.m13841l("otherUsernameOnClick", true);
        pluginGeneratedSerialDescriptor.m13841l("commandNameOnClick", true);
        pluginGeneratedSerialDescriptor.m13841l("actorHook", true);
        pluginGeneratedSerialDescriptor.m13841l("threadOnClick", true);
        pluginGeneratedSerialDescriptor.m13841l("pinsOnClick", true);
        pluginGeneratedSerialDescriptor.m13841l("webhookNameOnClick", true);
        pluginGeneratedSerialDescriptor.m13841l("handleDelete", true);
        pluginGeneratedSerialDescriptor.m13841l("roleSubscriptionOnClick", true);
        pluginGeneratedSerialDescriptor.m13841l("handleMessage", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LinkContext$$serializer() {
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] childSerializers() {
        UserNameOnClick$$serializer userNameOnClick$$serializer = UserNameOnClick$$serializer.INSTANCE;
        return new KSerializer[]{C14606a.m13u(userNameOnClick$$serializer), C14606a.m13u(userNameOnClick$$serializer), C14606a.m13u(CommandOnClick$$serializer.INSTANCE), C14606a.m13u(ActorHook$$serializer.INSTANCE), C14606a.m13u(ThreadOnClick$$serializer.INSTANCE), C14606a.m13u(PinsOnClick$$serializer.INSTANCE), C14606a.m13u(WebhookNameOnClick$$serializer.INSTANCE), C14606a.m13u(HandleDelete$$serializer.INSTANCE), C14606a.m13u(RoleSubscriptionOnClick$$serializer.INSTANCE), C14606a.m13u(HandleMessage$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public LinkContext deserialize(Decoder decoder) {
        int i;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        C9677q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC9967c b = decoder.mo13905b(descriptor2);
        int i2 = 9;
        Object obj10 = null;
        if (b.mo13850p()) {
            UserNameOnClick$$serializer userNameOnClick$$serializer = UserNameOnClick$$serializer.INSTANCE;
            obj10 = b.mo13852n(descriptor2, 0, userNameOnClick$$serializer, null);
            obj9 = b.mo13852n(descriptor2, 1, userNameOnClick$$serializer, null);
            obj = b.mo13852n(descriptor2, 2, CommandOnClick$$serializer.INSTANCE, null);
            obj4 = b.mo13852n(descriptor2, 3, ActorHook$$serializer.INSTANCE, null);
            obj2 = b.mo13852n(descriptor2, 4, ThreadOnClick$$serializer.INSTANCE, null);
            obj5 = b.mo13852n(descriptor2, 5, PinsOnClick$$serializer.INSTANCE, null);
            obj6 = b.mo13852n(descriptor2, 6, WebhookNameOnClick$$serializer.INSTANCE, null);
            obj7 = b.mo13852n(descriptor2, 7, HandleDelete$$serializer.INSTANCE, null);
            obj3 = b.mo13852n(descriptor2, 8, RoleSubscriptionOnClick$$serializer.INSTANCE, null);
            obj8 = b.mo13852n(descriptor2, 9, HandleMessage$$serializer.INSTANCE, null);
            i = 1023;
        } else {
            boolean z = true;
            int i3 = 0;
            Object obj11 = null;
            Object obj12 = null;
            Object obj13 = null;
            Object obj14 = null;
            Object obj15 = null;
            Object obj16 = null;
            Object obj17 = null;
            Object obj18 = null;
            Object obj19 = null;
            while (z) {
                int o = b.mo13851o(descriptor2);
                switch (o) {
                    case -1:
                        z = false;
                        i2 = 9;
                        break;
                    case 0:
                        obj10 = b.mo13852n(descriptor2, 0, UserNameOnClick$$serializer.INSTANCE, obj10);
                        i3 |= 1;
                        i2 = 9;
                        break;
                    case 1:
                        obj18 = b.mo13852n(descriptor2, 1, UserNameOnClick$$serializer.INSTANCE, obj18);
                        i3 |= 2;
                        i2 = 9;
                        break;
                    case 2:
                        obj19 = b.mo13852n(descriptor2, 2, CommandOnClick$$serializer.INSTANCE, obj19);
                        i3 |= 4;
                        i2 = 9;
                        break;
                    case 3:
                        obj17 = b.mo13852n(descriptor2, 3, ActorHook$$serializer.INSTANCE, obj17);
                        i3 |= 8;
                        i2 = 9;
                        break;
                    case 4:
                        obj16 = b.mo13852n(descriptor2, 4, ThreadOnClick$$serializer.INSTANCE, obj16);
                        i3 |= 16;
                        i2 = 9;
                        break;
                    case 5:
                        obj15 = b.mo13852n(descriptor2, 5, PinsOnClick$$serializer.INSTANCE, obj15);
                        i3 |= 32;
                        i2 = 9;
                        break;
                    case 6:
                        obj13 = b.mo13852n(descriptor2, 6, WebhookNameOnClick$$serializer.INSTANCE, obj13);
                        i3 |= 64;
                        i2 = 9;
                        break;
                    case 7:
                        obj14 = b.mo13852n(descriptor2, 7, HandleDelete$$serializer.INSTANCE, obj14);
                        i3 |= 128;
                        i2 = 9;
                        continue;
                    case 8:
                        obj12 = b.mo13852n(descriptor2, 8, RoleSubscriptionOnClick$$serializer.INSTANCE, obj12);
                        i3 |= Spliterator.NONNULL;
                        break;
                    case 9:
                        obj11 = b.mo13852n(descriptor2, i2, HandleMessage$$serializer.INSTANCE, obj11);
                        i3 |= 512;
                        break;
                    default:
                        throw new C14382n(o);
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
            i = i3;
            obj9 = obj18;
        }
        b.mo13857c(descriptor2);
        return new LinkContext(i, (UserNameOnClick) obj10, (UserNameOnClick) obj9, (CommandOnClick) obj, (ActorHook) obj4, (ThreadOnClick) obj2, (PinsOnClick) obj5, (WebhookNameOnClick) obj6, (HandleDelete) obj7, (RoleSubscriptionOnClick) obj3, (HandleMessage) obj8, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, p450yi.AbstractC14372h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, LinkContext value) {
        C9677q.m14633g(encoder, "encoder");
        C9677q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        LinkContext.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC2522f0.C2523a.m33897a(this);
    }
}
