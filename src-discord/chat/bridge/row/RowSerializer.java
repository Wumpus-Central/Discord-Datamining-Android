package com.discord.chat.bridge.row;

import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.d;
import kotlinx.serialization.json.g;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u0012\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/discord/chat/bridge/row/RowSerializer;", "Lkotlinx/serialization/json/d;", "Lcom/discord/chat/bridge/row/Row;", "Lkotlinx/serialization/json/JsonElement;", "element", "Lkotlinx/serialization/DeserializationStrategy;", "selectDeserializer", "", "CHANGE_TYPE_DELETE", "Ljava/lang/String;", "Lkotlinx/serialization/SealedClassSerializer;", "rowSealedClassSerializer", "Lkotlinx/serialization/SealedClassSerializer;", "getRowSealedClassSerializer$annotations", "()V", "<init>", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class RowSerializer extends d<Row> {
    private static final String CHANGE_TYPE_DELETE = "3";
    public static final RowSerializer INSTANCE = new RowSerializer();
    private static final SealedClassSerializer<Row> rowSealedClassSerializer = new SealedClassSerializer<>("Row", f0.b(Row.class), new KClass[]{f0.b(LoadingRow.class), f0.b(MessageRow.class), f0.b(SeparatorRow.class), f0.b(BlockedGroupRow.class), f0.b(UploadProgressRow.class), f0.b(EmbeddedActivityRow.class)}, new KSerializer[]{LoadingRow.Companion.serializer(), MessageRow.Companion.serializer(), SeparatorRow.Companion.serializer(), BlockedGroupRow.Companion.serializer(), UploadProgressRow.Companion.serializer(), EmbeddedActivityRow.Companion.serializer()});

    private RowSerializer() {
        super(f0.b(Row.class));
    }

    private static /* synthetic */ void getRowSealedClassSerializer$annotations() {
    }

    @Override // kotlinx.serialization.json.d
    protected DeserializationStrategy<Row> selectDeserializer(JsonElement element) {
        String str;
        JsonPrimitive n10;
        q.g(element, "element");
        JsonObject m10 = g.m(element);
        if (m10.containsKey("type")) {
            return rowSealedClassSerializer;
        }
        JsonElement jsonElement = (JsonElement) m10.get("changeType");
        if (jsonElement == null || (n10 = g.n(jsonElement)) == null) {
            str = null;
        } else {
            str = n10.b();
        }
        if (q.b(str, CHANGE_TYPE_DELETE)) {
            return DeleteRow.Companion.serializer();
        }
        throw new IllegalArgumentException("unsupported row json: " + element);
    }
}
