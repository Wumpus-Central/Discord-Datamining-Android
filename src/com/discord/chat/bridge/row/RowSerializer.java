package com.discord.chat.bridge.row;

import kotlin.Metadata;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.json.AbstractC10272d;
import kotlinx.serialization.json.C10274f;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

@Metadata(m15074d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u0012\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m15073d2 = {"Lcom/discord/chat/bridge/row/RowSerializer;", "Lkotlinx/serialization/json/d;", "Lcom/discord/chat/bridge/row/Row;", "Lkotlinx/serialization/json/JsonElement;", "element", "Lkotlinx/serialization/DeserializationStrategy;", "selectDeserializer", "", "CHANGE_TYPE_DELETE", "Ljava/lang/String;", "Lkotlinx/serialization/SealedClassSerializer;", "rowSealedClassSerializer", "Lkotlinx/serialization/SealedClassSerializer;", "getRowSealedClassSerializer$annotations", "()V", "<init>", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class RowSerializer extends AbstractC10272d<Row> {
    private static final String CHANGE_TYPE_DELETE = "3";
    public static final RowSerializer INSTANCE = new RowSerializer();
    private static final SealedClassSerializer<Row> rowSealedClassSerializer = new SealedClassSerializer<>("Row", C9951f0.m14684b(Row.class), new KClass[]{C9951f0.m14684b(LoadingRow.class), C9951f0.m14684b(MessageRow.class), C9951f0.m14684b(SeparatorRow.class), C9951f0.m14684b(BlockedGroupRow.class), C9951f0.m14684b(UploadProgressRow.class), C9951f0.m14684b(EmbeddedActivityRow.class)}, new KSerializer[]{LoadingRow.Companion.serializer(), MessageRow.Companion.serializer(), SeparatorRow.Companion.serializer(), BlockedGroupRow.Companion.serializer(), UploadProgressRow.Companion.serializer(), EmbeddedActivityRow.Companion.serializer()});

    private RowSerializer() {
        super(C9951f0.m14684b(Row.class));
    }

    private static /* synthetic */ void getRowSealedClassSerializer$annotations() {
    }

    @Override // kotlinx.serialization.json.AbstractC10272d
    protected DeserializationStrategy<Row> selectDeserializer(JsonElement element) {
        String str;
        JsonPrimitive k;
        C9971q.m14633g(element, "element");
        JsonObject j = C10274f.m13719j(element);
        if (j.containsKey("type")) {
            return rowSealedClassSerializer;
        }
        JsonElement jsonElement = (JsonElement) j.get("changeType");
        if (jsonElement == null || (k = C10274f.m13718k(jsonElement)) == null) {
            str = null;
        } else {
            str = k.mo13692a();
        }
        if (C9971q.m14638b(str, CHANGE_TYPE_DELETE)) {
            return DeleteRow.Companion.serializer();
        }
        throw new IllegalArgumentException("unsupported row json: " + element);
    }
}
