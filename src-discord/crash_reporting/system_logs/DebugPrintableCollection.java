package com.discord.crash_reporting.system_logs;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import com.discord.crash_reporting.system_logs.HistoricalProcessExitReason;
import com.facebook.react.bridge.BaseJavaModule;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB\u0005¢\u0006\u0002\u0010\u0002J \u0010\n\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001a\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\n\u0010\u0016\u001a\u00060\u0017j\u0002`\u0018J\b\u0010\u0019\u001a\u00020\u0010H\u0002R\u001e\u0010\u0003\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00060\u0005j\u0002`\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/discord/crash_reporting/system_logs/DebugPrintableCollection;", "", "()V", "collection", "", "", "Lcom/discord/crash_reporting/system_logs/DebugPrintableId;", "Lcom/discord/crash_reporting/system_logs/DebugPrintableCollection$DebugPrintableRef;", "idCounter", BaseJavaModule.METHOD_TYPE_SYNC, "add", "ref", "Lcom/discord/crash_reporting/system_logs/DebugPrintable;", "tag", "", "addSystemEntry", "", "context", "Landroid/content/Context;", "dp", "Lcom/discord/crash_reporting/system_logs/DebugPrintBuilder;", "debugPrint", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "removeDeadReferencesLocked", "Companion", "DebugPrintableRef", "crash_reporting_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class DebugPrintableCollection {
    public static final Companion Companion = new Companion(null);
    private static final int maxDebugPrintableStringLength = 524288;
    private long idCounter = 1;
    private final Map<Long, DebugPrintableRef> collection = new LinkedHashMap();
    private final Object sync = new Object();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/discord/crash_reporting/system_logs/DebugPrintableCollection$Companion;", "", "()V", "maxDebugPrintableStringLength", "", "libdiscordVersion", "", "context", "Landroid/content/Context;", "crash_reporting_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String libdiscordVersion(Context context) {
            ApplicationInfo applicationInfo;
            String string;
            q.h(context, "context");
            if (Build.VERSION.SDK_INT >= 33) {
                applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L));
            } else {
                applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            }
            Bundle bundle = applicationInfo.metaData;
            if (bundle == null || (string = bundle.getString("libdiscord_version")) == null) {
                return "Unknown libdiscord version";
            }
            return string;
        }
    }

    
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/discord/crash_reporting/system_logs/DebugPrintableCollection$DebugPrintableRef;", "", "tag", "", "reference", "Ljava/lang/ref/WeakReference;", "Lcom/discord/crash_reporting/system_logs/DebugPrintable;", "(Ljava/lang/String;Ljava/lang/ref/WeakReference;)V", "getReference", "()Ljava/lang/ref/WeakReference;", "getTag", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "crash_reporting_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class DebugPrintableRef {
        private final WeakReference<DebugPrintable> reference;
        private final String tag;

        public DebugPrintableRef(String str, WeakReference<DebugPrintable> reference) {
            q.h(reference, "reference");
            this.tag = str;
            this.reference = reference;
        }

        
        public static  DebugPrintableRef copy$default(DebugPrintableRef debugPrintableRef, String str, WeakReference weakReference, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = debugPrintableRef.tag;
            }
            if ((i10 & 2) != 0) {
                weakReference = debugPrintableRef.reference;
            }
            return debugPrintableRef.copy(str, weakReference);
        }

        public final String component1() {
            return this.tag;
        }

        public final WeakReference<DebugPrintable> component2() {
            return this.reference;
        }

        public final DebugPrintableRef copy(String str, WeakReference<DebugPrintable> reference) {
            q.h(reference, "reference");
            return new DebugPrintableRef(str, reference);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DebugPrintableRef)) {
                return false;
            }
            DebugPrintableRef debugPrintableRef = (DebugPrintableRef) obj;
            return q.c(this.tag, debugPrintableRef.tag) && q.c(this.reference, debugPrintableRef.reference);
        }

        public final WeakReference<DebugPrintable> getReference() {
            return this.reference;
        }

        public final String getTag() {
            return this.tag;
        }

        public int hashCode() {
            String str = this.tag;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.reference.hashCode();
        }

        public String toString() {
            String str = this.tag;
            WeakReference<DebugPrintable> weakReference = this.reference;
            return "DebugPrintableRef(tag=" + str + ", reference=" + weakReference + ")";
        }
    }

    private final long add(DebugPrintable debugPrintable, String str) {
        long j10;
        synchronized (this.sync) {
            j10 = this.idCounter;
            this.idCounter = j10 + 1;
            long j11 = 0;
            while (this.collection.containsKey(Long.valueOf(j10))) {
                j10 = this.idCounter;
                this.idCounter = j10 + 1;
                j11++;
                if (j11 < 0) {
                    break;
                }
            }
            this.collection.put(Long.valueOf(j10), new DebugPrintableRef(str, new WeakReference(debugPrintable)));
            removeDeadReferencesLocked();
        }
        return j10;
    }

    static  long add$default(DebugPrintableCollection debugPrintableCollection, DebugPrintable debugPrintable, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return debugPrintableCollection.add(debugPrintable, str);
    }

    private final void addSystemEntry(Context context, DebugPrintBuilder debugPrintBuilder) {
        debugPrintBuilder.appendLine("System:");
        debugPrintBuilder.appendKeyValue("libdiscordVersion", Companion.libdiscordVersion(context));
        debugPrintBuilder.appendKeyValue("SDK_INT", Integer.valueOf(Build.VERSION.SDK_INT));
        HistoricalProcessExitReason.Reason lastReason = HistoricalProcessExitReason.INSTANCE.lastReason(context);
        if (lastReason != null) {
            debugPrintBuilder.appendKeyValue("exit_reason", lastReason.getReason());
            String description = lastReason.getDescription();
            if (description != null) {
                debugPrintBuilder.appendKeyValue("exit_description", description);
            }
        }
        DebugPrintBuilder.appendLine$default(debugPrintBuilder, null, 1, null);
    }

    private final void removeDeadReferencesLocked() {
        ArrayList<Number> arrayList = new ArrayList();
        for (Map.Entry<Long, DebugPrintableRef> entry : this.collection.entrySet()) {
            long longValue = entry.getKey().longValue();
            if (entry.getValue().getReference().get() == null) {
                arrayList.add(Long.valueOf(longValue));
            }
        }
        for (Number number : arrayList) {
            this.collection.remove(Long.valueOf(number.longValue()));
        }
    }

    public final void debugPrint(Context context, StringBuilder sb2) {
        q.h(context, "context");
        q.h(sb2, "sb");
        DebugPrintBuilder debugPrintBuilder = new DebugPrintBuilder(sb2);
        synchronized (this.sync) {
            addSystemEntry(context, debugPrintBuilder);
            Iterator<Map.Entry<Long, DebugPrintableRef>> it = this.collection.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Long, DebugPrintableRef> next = it.next();
                long longValue = next.getKey().longValue();
                DebugPrintableRef value = next.getValue();
                DebugPrintable debugPrintable = value.getReference().get();
                if (debugPrintable != null) {
                    q.g(debugPrintable, "printableRef.reference.get() ?: continue");
                    sb2.append(longValue);
                    if (value.getTag() != null) {
                        sb2.append(' ');
                        sb2.append(value.getTag());
                    }
                    sb2.append(":");
                    q.g(sb2, "append(value)");
                    sb2.append('\n');
                    q.g(sb2, "append('\\n')");
                    try {
                        debugPrintable.debugPrint(debugPrintBuilder);
                    } catch (Exception e10) {
                        sb2.append("Exception: " + e10);
                    }
                    sb2.append('\n');
                    q.g(sb2, "append('\\n')");
                    if (sb2.length() > maxDebugPrintableStringLength) {
                        sb2.delete(maxDebugPrintableStringLength, sb2.length() - 1);
                        sb2.append(" {truncated}");
                        break;
                    }
                }
            }
            Unit unit = Unit.f21213a;
        }
    }
}
