package com.discord.chat.presentation.message.view.botuikit;

import com.discord.chat.bridge.botuikit.SelectComponent;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J5\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0005H&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionListener;", "", "onTapButtonActionComponent", "", "customId", "", "applicationId", "Lcom/discord/primitives/ApplicationId;", "indices", "", "", "onTapButtonActionComponent-y43Yjpg", "(Ljava/lang/String;JLjava/util/List;)V", "onTapSelectActionComponent", "selectComponent", "Lcom/discord/chat/bridge/botuikit/SelectComponent;", "openLink", "url", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface ComponentActionListener {
    /* renamed from: onTapButtonActionComponent-y43Yjpg  reason: not valid java name */
    void mo306onTapButtonActionComponenty43Yjpg(String str, long j10, List<Integer> list);

    void onTapSelectActionComponent(SelectComponent selectComponent);

    void openLink(String str);
}
