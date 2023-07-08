package com.discord.chat.bridge.structurabletext;

import com.discord.chat.bridge.contentnode.ContentNodeSerializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import ri.e;
import ri.g;
import si.f;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/discord/chat/bridge/structurabletext/AnnotatedStructurableTextSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AnnotatedStructurableTextSerializer implements KSerializer<AnnotatedStructurableText> {
    public static final AnnotatedStructurableTextSerializer INSTANCE = new AnnotatedStructurableTextSerializer();
    private static final SerialDescriptor descriptor = g.a("AnnotatedStructurableText", e.i.f25631a);

    private AnnotatedStructurableTextSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, pi.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public AnnotatedStructurableText deserialize(Decoder decoder) {
        q.g(decoder, "decoder");
        return new AnnotatedStructurableText((List) decoder.C(new f(ContentNodeSerializer.INSTANCE)));
    }

    public void serialize(Encoder encoder, AnnotatedStructurableText value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        throw new UnsupportedOperationException();
    }
}
