package com.discord.blur;

import com.discord.blur.BlurViewAPI;
import java.util.HashSet;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0006J\u0014\u0010\u000f\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u0005J\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0005J\u0014\u0010\u0013\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\tR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0007\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/discord/blur/BlurViewTargetRegistry;", "", "()V", "registryBlurViewTargets", "Ljava/util/WeakHashMap;", "", "Lcom/discord/blur/BlurViewAPI$Target;", "registryChangeListeners", "Ljava/util/HashSet;", "Lkotlin/Function0;", "", "Lkotlin/collections/HashSet;", "add", "nativeId", "blurViewTarget", "addChangeListener", "onChange", "get", "remove", "removeChangeListener", "blur_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class BlurViewTargetRegistry {
    public static final BlurViewTargetRegistry INSTANCE = new BlurViewTargetRegistry();
    private static final WeakHashMap<String, BlurViewAPI.Target> registryBlurViewTargets = new WeakHashMap<>();
    private static final HashSet<Function0<Unit>> registryChangeListeners = new HashSet<>();

    private BlurViewTargetRegistry() {
    }

    public final void add(String nativeId, BlurViewAPI.Target blurViewTarget) {
        q.h(nativeId, "nativeId");
        q.h(blurViewTarget, "blurViewTarget");
        registryBlurViewTargets.put(nativeId, blurViewTarget);
    }

    public final void addChangeListener(Function0<Unit> onChange) {
        q.h(onChange, "onChange");
        registryChangeListeners.add(onChange);
    }

    public final BlurViewAPI.Target get(String nativeId) {
        q.h(nativeId, "nativeId");
        return registryBlurViewTargets.get(nativeId);
    }

    public final void remove(String nativeId) {
        q.h(nativeId, "nativeId");
        registryBlurViewTargets.remove(nativeId);
    }

    public final void removeChangeListener(Function0<Unit> onChange) {
        q.h(onChange, "onChange");
        registryChangeListeners.remove(onChange);
    }
}
