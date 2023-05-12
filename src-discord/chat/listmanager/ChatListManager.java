package com.discord.chat.listmanager;

import com.discord.chat.bridge.ChangeType;
import com.discord.chat.bridge.row.BlockedGroupContent;
import com.discord.chat.bridge.row.BlockedGroupRow;
import com.discord.chat.bridge.row.DeleteRow;
import com.discord.chat.bridge.row.EmbeddedActivityRow;
import com.discord.chat.bridge.row.LoadingActionType;
import com.discord.chat.bridge.row.LoadingRow;
import com.discord.chat.bridge.row.MessageRow;
import com.discord.chat.bridge.row.MessageRowKt;
import com.discord.chat.bridge.row.Row;
import com.discord.chat.bridge.row.SeparatorRow;
import com.discord.chat.bridge.row.UploadProgressRow;
import com.discord.chat.bridge.spoiler.SpoilerManager;
import com.discord.chat.listmanager.ChatListAction;
import com.discord.chat.listmanager.ListOperation;
import com.discord.chat.presentation.list.item.BlockedGroupChatListItem;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.discord.chat.presentation.list.item.DeserializationErrorChatListItem;
import com.discord.chat.presentation.list.item.EmbeddedActivityChatListItem;
import com.discord.chat.presentation.list.item.LoadingChatListItem;
import com.discord.chat.presentation.list.item.MessageItem;
import com.discord.chat.presentation.list.item.SeparatorChatListItem;
import com.discord.chat.presentation.root.MessageContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.j;
import kotlin.collections.k;
import kotlin.collections.p;
import kotlin.collections.r;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.m;
import kotlinx.coroutines.k0;
import kotlinx.coroutines.l;
import kotlinx.coroutines.y0;
import ui.e;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001$B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0002J\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018J\u0016\u0010\u001a\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0002J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u001cJ\u0010\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\rH\u0002J\u0014\u0010\u001f\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0013J\u001a\u0010 \u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010!\u001a\u00020\nH\u0002J\f\u0010\"\u001a\u00020#*\u00020\nH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/discord/chat/listmanager/ChatListManager;", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "isDisabled", "", "publishScope", "rows", "", "Lcom/discord/chat/bridge/row/Row;", "updatesFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/discord/chat/listmanager/ChatListUpdate;", "clearRows", "", "createNewRows", "Lcom/discord/chat/listmanager/ChatListManager$RowsModificationResult;", "updates", "", "getRowCount", "", "handleError", "errorJson", "", "causeMessage", "modifyExistingRows", "observeUpdates", "Lkotlinx/coroutines/flow/Flow;", "publishUpdate", "update", "updateRows", "insert", "row", "toChatListItem", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "RowsModificationResult", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChatListManager {
    private boolean isDisabled;
    private final CoroutineScope publishScope;
    private List<Row> rows;
    private final MutableSharedFlow<ChatListUpdate> updatesFlow = m.a(1, 3, e.SUSPEND);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/discord/chat/listmanager/ChatListManager$RowsModificationResult;", "", "rows", "", "Lcom/discord/chat/bridge/row/Row;", "didInsertAtBottom", "", "listOperations", "Lcom/discord/chat/listmanager/ListOperation;", "(Ljava/util/List;ZLjava/util/List;)V", "getDidInsertAtBottom", "()Z", "getListOperations", "()Ljava/util/List;", "getRows", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class RowsModificationResult {
        private final boolean didInsertAtBottom;
        private final List<ListOperation> listOperations;
        private final List<Row> rows;

        /* JADX WARN: Multi-variable type inference failed */
        public RowsModificationResult(List<? extends Row> rows, boolean z10, List<? extends ListOperation> list) {
            q.g(rows, "rows");
            this.rows = rows;
            this.didInsertAtBottom = z10;
            this.listOperations = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RowsModificationResult copy$default(RowsModificationResult rowsModificationResult, List list, boolean z10, List list2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = rowsModificationResult.rows;
            }
            if ((i10 & 2) != 0) {
                z10 = rowsModificationResult.didInsertAtBottom;
            }
            if ((i10 & 4) != 0) {
                list2 = rowsModificationResult.listOperations;
            }
            return rowsModificationResult.copy(list, z10, list2);
        }

        public final List<Row> component1() {
            return this.rows;
        }

        public final boolean component2() {
            return this.didInsertAtBottom;
        }

        public final List<ListOperation> component3() {
            return this.listOperations;
        }

        public final RowsModificationResult copy(List<? extends Row> rows, boolean z10, List<? extends ListOperation> list) {
            q.g(rows, "rows");
            return new RowsModificationResult(rows, z10, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RowsModificationResult)) {
                return false;
            }
            RowsModificationResult rowsModificationResult = (RowsModificationResult) obj;
            return q.b(this.rows, rowsModificationResult.rows) && this.didInsertAtBottom == rowsModificationResult.didInsertAtBottom && q.b(this.listOperations, rowsModificationResult.listOperations);
        }

        public final boolean getDidInsertAtBottom() {
            return this.didInsertAtBottom;
        }

        public final List<ListOperation> getListOperations() {
            return this.listOperations;
        }

        public final List<Row> getRows() {
            return this.rows;
        }

        public int hashCode() {
            int hashCode = this.rows.hashCode() * 31;
            boolean z10 = this.didInsertAtBottom;
            if (z10) {
                z10 = true;
            }
            int i10 = z10 ? 1 : 0;
            int i11 = z10 ? 1 : 0;
            int i12 = z10 ? 1 : 0;
            int i13 = (hashCode + i10) * 31;
            List<ListOperation> list = this.listOperations;
            return i13 + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            List<Row> list = this.rows;
            boolean z10 = this.didInsertAtBottom;
            List<ListOperation> list2 = this.listOperations;
            return "RowsModificationResult(rows=" + list + ", didInsertAtBottom=" + z10 + ", listOperations=" + list2 + ")";
        }
    }

    public ChatListManager(CoroutineScope coroutineScope) {
        q.g(coroutineScope, "coroutineScope");
        this.publishScope = k0.i(coroutineScope, y0.a());
    }

    private final RowsModificationResult createNewRows(List<? extends Row> list) {
        List<Row> F0;
        boolean z10;
        boolean z11 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((Row) it.next()).getChangeType() == ChangeType.DELETE) {
                        z10 = true;
                        continue;
                    } else {
                        z10 = false;
                        continue;
                    }
                    if (z10) {
                        z11 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (!z11) {
            F0 = r.F0(list);
            this.rows = F0;
            return new RowsModificationResult(list, true, null);
        }
        throw new IllegalArgumentException("Deletes are not expected or allowed during syncs.".toString());
    }

    private final void insert(List<Row> list, Row row) {
        if (!(row instanceof DeleteRow)) {
            list.add(row.getIndex(), row);
            return;
        }
        throw new IllegalStateException("Unexpected delete during insert.".toString());
    }

    private final RowsModificationResult modifyExistingRows(List<? extends Row> list) {
        boolean z10;
        List<Row> F;
        boolean z11;
        Object U;
        boolean z12;
        boolean z13;
        boolean z14;
        List<Row> list2 = this.rows;
        q.d(list2);
        ListOperationsBuilder listOperationsBuilder = new ListOperationsBuilder();
        ArrayList<Row> arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z15 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((Row) next).getChangeType() != ChangeType.INSERT) {
                z15 = false;
            }
            if (z15) {
                arrayList.add(next);
            }
        }
        loop1: while (true) {
            z10 = false;
            for (Row row : arrayList) {
                insert(list2, row);
                listOperationsBuilder.add(new ListOperation.Insert(row.getIndex()));
                if (z10 || row.getIndex() == 0) {
                    z10 = true;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            Row row2 = (Row) obj;
            if (row2.getChangeType() == ChangeType.DELETE || row2.getChangeType() == ChangeType.UPDATE) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                arrayList2.add(obj);
            }
        }
        F = p.F(arrayList2);
        for (Row row3 : F) {
            if (row3 instanceof DeleteRow) {
                list2.remove(row3.getIndex());
                listOperationsBuilder.add(new ListOperation.Remove(row3.getIndex()));
            } else {
                if ((row3 instanceof LoadingRow) && ((LoadingRow) row3).getButton().getAction().getType() == LoadingActionType.LOAD_MORE_AFTER && row3.getIndex() == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                U = r.U(list2);
                Row row4 = (Row) U;
                if (!(row4 instanceof LoadingRow) || !((LoadingRow) row4).isLoading()) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (!z11 || !z12) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (z13) {
                    list2.add(1, row3);
                    list2.remove(0);
                    listOperationsBuilder.add(new ListOperation.Insert(1));
                    listOperationsBuilder.add(new ListOperation.Remove(0));
                } else {
                    list2.set(row3.getIndex(), row3);
                    listOperationsBuilder.add(new ListOperation.Change(row3.getIndex()));
                }
            }
        }
        return new RowsModificationResult(list2, z10, listOperationsBuilder.build());
    }

    private final void publishUpdate(ChatListUpdate chatListUpdate) {
        l.d(this.publishScope, null, null, new ChatListManager$publishUpdate$1(this, chatListUpdate, null), 3, null);
    }

    private final ChatListItem toChatListItem(Row row) {
        int t10;
        List F;
        ChatListItem chatListMessageItem;
        ChatListItem separatorChatListItem;
        if (row instanceof MessageRow) {
            return MessageRowKt.toChatListMessageItem((MessageRow) row);
        }
        if (row instanceof UploadProgressRow) {
            separatorChatListItem = new MessageItem(((UploadProgressRow) row).getMessage(), null, null, false, false, null, null, false, 254, null);
        } else if (row instanceof EmbeddedActivityRow) {
            EmbeddedActivityRow embeddedActivityRow = (EmbeddedActivityRow) row;
            separatorChatListItem = new EmbeddedActivityChatListItem(embeddedActivityRow.getContent(), embeddedActivityRow.getAvatarUrls(), embeddedActivityRow.getButtonText(), embeddedActivityRow.getEmbeddedActivityKey(), embeddedActivityRow.getDismissButtonAccessibilityLabel());
        } else if (row instanceof LoadingRow) {
            LoadingRow loadingRow = (LoadingRow) row;
            separatorChatListItem = new LoadingChatListItem(loadingRow.getButton(), loadingRow.isLoading());
        } else if (row instanceof SeparatorRow) {
            SeparatorRow separatorRow = (SeparatorRow) row;
            int color = separatorRow.getColor();
            String text = separatorRow.getText();
            String text2 = separatorRow.getText();
            separatorChatListItem = new SeparatorChatListItem(color, text, "separator: " + text2);
        } else if (row instanceof BlockedGroupRow) {
            BlockedGroupRow blockedGroupRow = (BlockedGroupRow) row;
            String text3 = blockedGroupRow.getText();
            String context = blockedGroupRow.getButton().getAction().getContext();
            int color2 = blockedGroupRow.getColor();
            int backgroundColor = blockedGroupRow.getBackgroundColor();
            int borderColor = blockedGroupRow.getBorderColor();
            boolean revealed = blockedGroupRow.getRevealed();
            List<BlockedGroupContent> content = blockedGroupRow.getContent();
            if (content == null) {
                content = j.i();
            }
            t10 = k.t(content, 10);
            ArrayList arrayList = new ArrayList(t10);
            for (BlockedGroupContent blockedGroupContent : content) {
                chatListMessageItem = MessageRowKt.toChatListMessageItem(blockedGroupContent.getMessage(), (r18 & 1) != 0 ? null : null, new MessageContext(false, false, null, null, null, null, null, false, false, false, false, false, 4095, null), (r18 & 4) != 0, (r18 & 8) != 0 ? false : false, (r18 & 16) != 0 ? false : false, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null);
                arrayList.add(chatListMessageItem);
            }
            F = p.F(arrayList);
            return new BlockedGroupChatListItem(text3, context, color2, backgroundColor, borderColor, revealed, F);
        } else {
            throw new IllegalStateException("Unknown row type.".toString());
        }
        return separatorChatListItem;
    }

    public final void clearRows() {
        boolean z10;
        List i10;
        List<Row> list = this.rows;
        if (list == null || list.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            SpoilerManager.INSTANCE.reset();
            i10 = j.i();
            publishUpdate(new ChatListUpdate(i10, ChatListAction.Clear.INSTANCE, null));
        }
        this.rows = null;
    }

    public final int getRowCount() {
        List<Row> list = this.rows;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final void handleError(String errorJson, String causeMessage) {
        List o10;
        q.g(errorJson, "errorJson");
        q.g(causeMessage, "causeMessage");
        o10 = j.o(new DeserializationErrorChatListItem("error-id", errorJson, causeMessage));
        publishUpdate(new ChatListUpdate(o10, ChatListAction.Noop.INSTANCE, null));
        this.isDisabled = true;
    }

    public final Flow<ChatListUpdate> observeUpdates() {
        return this.updatesFlow;
    }

    public final void updateRows(List<? extends Row> updates) {
        RowsModificationResult rowsModificationResult;
        int t10;
        boolean z10;
        boolean z11;
        Row row;
        MessageRow messageRow;
        boolean z12;
        MessageRow messageRow2;
        boolean z13;
        Boolean jumped;
        q.g(updates, "updates");
        if (!this.isDisabled) {
            if (this.rows != null) {
                rowsModificationResult = modifyExistingRows(updates);
            } else {
                rowsModificationResult = createNewRows(updates);
            }
            List<Row> component1 = rowsModificationResult.component1();
            boolean component2 = rowsModificationResult.component2();
            List<ListOperation> component3 = rowsModificationResult.component3();
            t10 = k.t(component1, 10);
            ArrayList arrayList = new ArrayList(t10);
            int i10 = 0;
            ChatListAction chatListAction = null;
            for (Object obj : component1) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    j.s();
                }
                Row row2 = (Row) obj;
                boolean z14 = row2 instanceof MessageRow;
                if (z14) {
                    z10 = q.b(((MessageRow) row2).getScrollTo(), Boolean.TRUE);
                } else if (row2 instanceof SeparatorRow) {
                    z10 = q.b(((SeparatorRow) row2).getScrollTo(), Boolean.TRUE);
                } else {
                    z10 = false;
                }
                if (!z10 || row2.getChangeType() == ChangeType.DELETE) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z11 || !updates.contains(row2)) {
                    row = row2;
                } else {
                    if (z14) {
                        messageRow = (MessageRow) row2;
                    } else {
                        messageRow = null;
                    }
                    if (messageRow == null || (jumped = messageRow.getJumped()) == null) {
                        z12 = false;
                    } else {
                        z12 = jumped.booleanValue();
                    }
                    if (z14) {
                        messageRow2 = (MessageRow) row2;
                    } else {
                        messageRow2 = null;
                    }
                    if (messageRow2 != null) {
                        z13 = messageRow2.isHighlight();
                    } else {
                        z13 = false;
                    }
                    row = row2;
                    chatListAction = new ChatListAction.ScrollTo(i10, z12, false, z13, 4, null);
                }
                arrayList.add(toChatListItem(row));
                i10 = i11;
            }
            if (chatListAction == null) {
                if (component2) {
                    chatListAction = ChatListAction.StickToBottomIfAtBottom.INSTANCE;
                } else {
                    chatListAction = ChatListAction.Noop.INSTANCE;
                }
            }
            publishUpdate(new ChatListUpdate(arrayList, chatListAction, component3));
        }
    }
}
