package com.discord.primitives;

import bj.a2;
import bj.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.InlineClassDescriptor;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\nJ&\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002HÖ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015ø\u0001\u0002\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"com/discord/primitives/MessageId.$serializer", "Lbj/f0;", "Lcom/discord/primitives/MessageId;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize-MpY7Jxs", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/String;", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize-Ayv7vGE", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/String;)V", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "primitives_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class MessageId$$serializer implements f0<MessageId> {
    public static final MessageId$$serializer INSTANCE;
    private static final /* synthetic */ InlineClassDescriptor descriptor;

    static {
        MessageId$$serializer messageId$$serializer = new MessageId$$serializer();
        INSTANCE = messageId$$serializer;
        InlineClassDescriptor inlineClassDescriptor = new InlineClassDescriptor("com.discord.primitives.MessageId", messageId$$serializer);
        inlineClassDescriptor.l("value", false);
        descriptor = inlineClassDescriptor;
    }

    private MessageId$$serializer() {
    }

    @Override // bj.f0
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a2.f5917a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return MessageId.m558boximpl(m567deserializeMpY7Jxs(decoder));
    }

    /* renamed from: deserialize-MpY7Jxs  reason: not valid java name */
    public String m567deserializeMpY7Jxs(Decoder decoder) {
        q.g(decoder, "decoder");
        return MessageId.m559constructorimpl(decoder.q(getDescriptor()).z());
    }

    @Override // kotlinx.serialization.KSerializer, yi.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // yi.h
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m568serializeAyv7vGE(encoder, ((MessageId) obj).m566unboximpl());
    }

    /* renamed from: serialize-Ayv7vGE  reason: not valid java name */
    public void m568serializeAyv7vGE(Encoder encoder, String value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        Encoder j10 = encoder.j(getDescriptor());
        if (j10 != null) {
            j10.F(value);
        }
    }

    @Override // bj.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}