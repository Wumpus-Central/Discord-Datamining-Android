package com.facebook.hermes.instrumentation;

import com.facebook.soloader.SoLoader;

/* loaded from: classes7.dex */
public class HermesSamplingProfiler {
    static {
        SoLoader.m30787r("jsijniprofiler");
    }

    public static native void disable();

    public static native void dumpSampledTraceToFile(String str);

    public static native void enable();
}
