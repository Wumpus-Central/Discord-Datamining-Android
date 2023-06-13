package com.discord.chat.presentation.list.delegate;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.blockedmessage.BlockedMessageGroupView;
import com.discord.misc.utilities.size.SizeUtilsKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"setupLayout", "", "Lcom/discord/chat/presentation/blockedmessage/BlockedMessageGroupView;", "chat_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BlockedGroupDelegateKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupLayout(BlockedMessageGroupView blockedMessageGroupView) {
        RecyclerView.i iVar = new RecyclerView.i(-1, -2);
        int dpToPx = SizeUtilsKt.getDpToPx(8);
        iVar.setMargins(dpToPx, 0, dpToPx, 0);
        blockedMessageGroupView.setLayoutParams(iVar);
    }
}
