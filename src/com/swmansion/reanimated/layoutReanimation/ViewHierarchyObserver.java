package com.swmansion.reanimated.layoutReanimation;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes8.dex */
public interface ViewHierarchyObserver {
    void onViewCreate(View view, ViewGroup viewGroup, Snapshot snapshot);

    void onViewRemoval(View view, ViewGroup viewGroup, Snapshot snapshot, Runnable runnable);

    void onViewUpdate(View view, Snapshot snapshot, Snapshot snapshot2);
}
