package com.discord.chat.input.views;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"KEYBOARD_CLOSE_BLUR_DELAY", "", "isScreenReaderOn", "", "Landroid/content/Context;", "chat_input_release"}, k = 2, mv = {1, 8, 0}, xi = 48)

public final class ChatInputRootViewKt {
    public static final long KEYBOARD_CLOSE_BLUR_DELAY = 100;

    public static final boolean isScreenReaderOn(Context context) {
        q.h(context, "<this>");
        Object systemService = context.getSystemService("accessibility");
        q.f(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        if (accessibilityManager.isEnabled()) {
            return !accessibilityManager.getEnabledAccessibilityServiceList(1).isEmpty();
        }
        return false;
    }
}
