package com.discord.primitives;

import bj.AbstractC2522f0;
import bj.C2500a2;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.InlineClassDescriptor;

@Metadata(m15074d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\nJ&\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002HÖ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015ø\u0001\u0002\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, m15073d2 = {"com/discord/primitives/MessageId.$serializer", "Lbj/f0;", "Lcom/discord/primitives/MessageId;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize-MpY7Jxs", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/String;", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize-Ayv7vGE", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/String;)V", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "primitives_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class MessageId$$serializer implements AbstractC2522f0<MessageId> {
    public static final MessageId$$serializer INSTANCE;
    private static final /* synthetic */ InlineClassDescriptor descriptor;

    static {
        MessageId$$serializer messageId$$serializer = new MessageId$$serializer();
        INSTANCE = messageId$$serializer;
        InlineClassDescriptor inlineClassDescriptor = new InlineClassDescriptor("com.discord.primitives.MessageId", messageId$$serializer);
        inlineClassDescriptor.m13841l("value", false);
        descriptor = inlineClassDescriptor;
    }

    private MessageId$$serializer() {
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{C2500a2.f6719a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return MessageId.m42115boximpl(m42124deserializeMpY7Jxs(decoder));
    }

    /* renamed from: deserialize-MpY7Jxs  reason: not valid java name */
    public String m42124deserializeMpY7Jxs(Decoder decoder) {
        C9677q.m14633g(decoder, "decoder");
        return MessageId.m42116constructorimpl(decoder.mo13900q(getDescriptor()).mo13894z());
    }

    @Override // kotlinx.serialization.KSerializer, p450yi.AbstractC14372h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p450yi.AbstractC14372h
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m42125serializeAyv7vGE(encoder, ((MessageId) obj).m42123unboximpl());
    }

    /* renamed from: serialize-Ayv7vGE  reason: not valid java name */
    public void m42125serializeAyv7vGE(Encoder encoder, String value) {
        C9677q.m14633g(encoder, "encoder");
        C9677q.m14633g(value, "value");
        Encoder j = encoder.mo13879j(getDescriptor());
        if (j != null) {
            j.mo13888F(value);
        }
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC2522f0.C2523a.m33897a(this);
    }
}
