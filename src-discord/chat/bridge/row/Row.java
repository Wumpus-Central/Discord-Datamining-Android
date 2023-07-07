package com.discord.chat.bridge.row;

import com.discord.chat.bridge.ChangeType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import qi.f;

@f(with = RowSerializer.class)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0007\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/discord/chat/bridge/row/Row;", "", "()V", "changeType", "Lcom/discord/chat/bridge/ChangeType;", "getChangeType", "()Lcom/discord/chat/bridge/ChangeType;", "index", "", "getIndex", "()I", "Companion", "Lcom/discord/chat/bridge/row/BlockedGroupRow;", "Lcom/discord/chat/bridge/row/DeleteRow;", "Lcom/discord/chat/bridge/row/EmbeddedActivityRow;", "Lcom/discord/chat/bridge/row/LoadingRow;", "Lcom/discord/chat/bridge/row/MessageRow;", "Lcom/discord/chat/bridge/row/SeparatorRow;", "Lcom/discord/chat/bridge/row/UploadProgressRow;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class Row {
    public static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/row/Row$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/row/Row;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Row> serializer() {
            return RowSerializer.INSTANCE;
        }
    }

    private Row() {
    }

    public /* synthetic */ Row(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract ChangeType getChangeType();

    public abstract int getIndex();
}
