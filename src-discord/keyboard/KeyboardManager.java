package com.discord.keyboard;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u0015\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\b\fJ\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/discord/keyboard/KeyboardManager;", "", "()V", "keyboardListeners", "", "Lcom/discord/keyboard/KeyboardEvent;", "addKeyboardListener", "", "listener", "onKeyboardChanged", "opened", "", "onKeyboardChanged$keyboard_release", "removeKeyboardListener", "keyboard_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class KeyboardManager {
    public static final KeyboardManager INSTANCE = new KeyboardManager();
    private static final List<KeyboardEvent> keyboardListeners = new ArrayList();

    private KeyboardManager() {
    }

    public final synchronized void addKeyboardListener(KeyboardEvent listener) {
        q.g(listener, "listener");
        keyboardListeners.add(listener);
    }

    public final synchronized void onKeyboardChanged$keyboard_release(boolean z10) {
        for (KeyboardEvent keyboardEvent : keyboardListeners) {
            keyboardEvent.onKeyboardStateChanged(z10);
        }
    }

    public final synchronized void removeKeyboardListener(KeyboardEvent listener) {
        q.g(listener, "listener");
        keyboardListeners.remove(listener);
    }
}
