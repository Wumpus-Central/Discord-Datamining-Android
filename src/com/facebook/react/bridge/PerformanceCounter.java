package com.facebook.react.bridge;

import java.util.Map;

/* loaded from: classes7.dex */
public interface PerformanceCounter {
    Map<String, Long> getPerformanceCounters();

    void profileNextBatch();
}
