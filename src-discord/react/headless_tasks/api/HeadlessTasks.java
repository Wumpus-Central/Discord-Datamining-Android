package com.discord.react.headless_tasks.api;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.discord.react.headless_tasks.service.HeadlessTasksService;
import com.facebook.react.HeadlessJsTaskService;
import com.facebook.react.jstasks.HeadlessJsTaskConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/discord/react/headless_tasks/api/HeadlessTasks;", "", "taskConfig", "Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;", "(Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;)V", "getTaskConfig", "()Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "react_headless_tasks_api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class HeadlessTasks {
    public static final Companion Companion = new Companion(null);
    private static final Class<?> SERVICE_CLASS = HeadlessTasksService.class;
    private static final String TASK_ALLOWED_IN_FOREGROUND_KEY = "intent.discord.headless_tasks_aif";
    private static final String TASK_KEY = "intent.discord.headless_tasks_key";
    private static final String TASK_NAME_KEY = "intent.discord.headless_tasks_name";
    private static final String TASK_PARAMS_KEY = "intent.discord.headless_tasks_params";
    private static final long TASK_TIMEOUT_DEFAULT = 5000;
    private static final String TASK_TIMEOUT_KEY = "intent.discord.headless_tasks_timeout";
    private final HeadlessJsTaskConfig taskConfig;

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J>\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\f2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u0019J6\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\f2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0002R\u001e\u0010\u0003\u001a\u0012\u0012\u0002\b\u0003 \u0005*\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/discord/react/headless_tasks/api/HeadlessTasks$Companion;", "", "()V", "SERVICE_CLASS", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "TASK_ALLOWED_IN_FOREGROUND_KEY", "", "TASK_KEY", "TASK_NAME_KEY", "TASK_PARAMS_KEY", "TASK_TIMEOUT_DEFAULT", "", "TASK_TIMEOUT_KEY", "fromIntent", "Lcom/discord/react/headless_tasks/api/HeadlessTasks;", "intent", "Landroid/content/Intent;", "startHeadlessTask", "", "context", "Landroid/content/Context;", "taskName", "taskTimeout", "taskAllowedInForeground", "", "taskParams", "Landroid/os/Bundle;", "taskInvokingFromBroadcastReceiver", "toIntent", "react_headless_tasks_api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static  void startHeadlessTask$default(Companion companion, Context context, String str, long j10, boolean z10, Bundle bundle, boolean z11, int i10, Object obj) {
            long j11;
            boolean z12;
            Bundle bundle2;
            boolean z13;
            if ((i10 & 4) != 0) {
                j11 = 5000;
            } else {
                j11 = j10;
            }
            if ((i10 & 8) != 0) {
                z12 = true;
            } else {
                z12 = z10;
            }
            if ((i10 & 16) != 0) {
                bundle2 = new Bundle();
            } else {
                bundle2 = bundle;
            }
            if ((i10 & 32) != 0) {
                z13 = false;
            } else {
                z13 = z11;
            }
            companion.startHeadlessTask(context, str, j11, z12, bundle2, z13);
        }

        private final Intent toIntent(Context context, String str, long j10, boolean z10, Bundle bundle) {
            Intent intent = new Intent(context, HeadlessTasks.SERVICE_CLASS);
            intent.putExtra(HeadlessTasks.TASK_KEY, true);
            intent.putExtra(HeadlessTasks.TASK_NAME_KEY, str);
            intent.putExtra(HeadlessTasks.TASK_TIMEOUT_KEY, j10);
            intent.putExtra(HeadlessTasks.TASK_ALLOWED_IN_FOREGROUND_KEY, z10);
            intent.putExtra(HeadlessTasks.TASK_PARAMS_KEY, bundle);
            return intent;
        }

        static  Intent toIntent$default(Companion companion, Context context, String str, long j10, boolean z10, Bundle bundle, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                j10 = HeadlessTasks.TASK_TIMEOUT_DEFAULT;
            }
            if ((i10 & 8) != 0) {
                z10 = true;
            }
            if ((i10 & 16) != 0) {
                bundle = new Bundle();
            }
            return companion.toIntent(context, str, j10, z10, bundle);
        }

        
        
        public final com.discord.react.headless_tasks.api.HeadlessTasks fromIntent(android.content.Intent r9) {
            
            throw new UnsupportedOperationException("Method not decompiled: com.discord.react.headless_tasks.api.HeadlessTasks.Companion.fromIntent(android.content.Intent):com.discord.react.headless_tasks.api.HeadlessTasks");
        }

        public final void startHeadlessTask(Context context, String taskName, long j10, boolean z10, Bundle taskParams, boolean z11) {
            q.h(context, "context");
            q.h(taskName, "taskName");
            q.h(taskParams, "taskParams");
            context.startService(toIntent(context, taskName, j10, z10, taskParams));
            if (z11) {
                HeadlessJsTaskService.acquireWakeLockNow(context);
            }
        }
    }

    static {
        int i10 = HeadlessTasksService.f7426k;
    }

    public HeadlessTasks(HeadlessJsTaskConfig taskConfig) {
        q.h(taskConfig, "taskConfig");
        this.taskConfig = taskConfig;
    }

    public static  HeadlessTasks copy$default(HeadlessTasks headlessTasks, HeadlessJsTaskConfig headlessJsTaskConfig, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            headlessJsTaskConfig = headlessTasks.taskConfig;
        }
        return headlessTasks.copy(headlessJsTaskConfig);
    }

    public final HeadlessJsTaskConfig component1() {
        return this.taskConfig;
    }

    public final HeadlessTasks copy(HeadlessJsTaskConfig taskConfig) {
        q.h(taskConfig, "taskConfig");
        return new HeadlessTasks(taskConfig);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HeadlessTasks) && q.c(this.taskConfig, ((HeadlessTasks) obj).taskConfig);
    }

    public final HeadlessJsTaskConfig getTaskConfig() {
        return this.taskConfig;
    }

    public int hashCode() {
        return this.taskConfig.hashCode();
    }

    public String toString() {
        HeadlessJsTaskConfig headlessJsTaskConfig = this.taskConfig;
        return "HeadlessTasks(taskConfig=" + headlessJsTaskConfig + ")";
    }
}
