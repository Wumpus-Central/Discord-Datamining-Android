package com.discord.react.headless_tasks.service;

import android.content.Intent;
import com.discord.react.headless_tasks.api.HeadlessTasks;
import com.facebook.react.HeadlessJsTaskService;
import com.facebook.react.jstasks.HeadlessJsTaskConfig;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u0007"}, d2 = {"Lcom/discord/react/headless_tasks/service/HeadlessTasksService;", "Lcom/facebook/react/HeadlessJsTaskService;", "()V", "getTaskConfig", "Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;", "intent", "Landroid/content/Intent;", "react_headless_tasks_service_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class HeadlessTasksService extends HeadlessJsTaskService {

    
    public static final  int f7268j = 0;

    @Override 
    protected HeadlessJsTaskConfig getTaskConfig(Intent intent) {
        HeadlessTasks fromIntent = HeadlessTasks.Companion.fromIntent(intent);
        if (fromIntent != null) {
            return fromIntent.getTaskConfig();
        }
        return null;
    }
}
