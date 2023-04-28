package com.discord.foreground_service.service;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\b\u0018\u0000 \"2\u00020\u0001:\u0003!\"#B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\nHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006$"}, m15073d2 = {"Lcom/discord/foreground_service/service/ServiceNotificationConfiguration;", "", "title", "", "content", "priority", "Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Priority;", "contentAction", "Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Action;", "auxiliaryActions", "", "(Ljava/lang/String;Ljava/lang/String;Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Priority;Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Action;Ljava/util/List;)V", "getAuxiliaryActions", "()Ljava/util/List;", "getContent", "()Ljava/lang/String;", "getContentAction", "()Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Action;", "getPriority", "()Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Priority;", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Action", "Companion", "Priority", "foreground_service_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class ServiceNotificationConfiguration {
    public static final Companion Companion = new Companion(null);
    private final List<Action> auxiliaryActions;
    private final String content;
    private final Action contentAction;
    private final Priority priority;
    private final String title;

    @Metadata(m15074d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J?\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, m15073d2 = {"Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Action;", "", "tag", "", "taskName", "title", "data", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getData", "()Ljava/util/Map;", "getTag", "()Ljava/lang/String;", "getTaskName", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "foreground_service_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Action {
        private final Map<String, String> data;
        private final String tag;
        private final String taskName;
        private final String title;

        public Action(String tag, String taskName, String str, Map<String, String> data) {
            C9971q.m14633g(tag, "tag");
            C9971q.m14633g(taskName, "taskName");
            C9971q.m14633g(data, "data");
            this.tag = tag;
            this.taskName = taskName;
            this.title = str;
            this.data = data;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Action copy$default(Action action, String str, String str2, String str3, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = action.tag;
            }
            if ((i & 2) != 0) {
                str2 = action.taskName;
            }
            if ((i & 4) != 0) {
                str3 = action.title;
            }
            if ((i & 8) != 0) {
                map = action.data;
            }
            return action.copy(str, str2, str3, map);
        }

        public final String component1() {
            return this.tag;
        }

        public final String component2() {
            return this.taskName;
        }

        public final String component3() {
            return this.title;
        }

        public final Map<String, String> component4() {
            return this.data;
        }

        public final Action copy(String tag, String taskName, String str, Map<String, String> data) {
            C9971q.m14633g(tag, "tag");
            C9971q.m14633g(taskName, "taskName");
            C9971q.m14633g(data, "data");
            return new Action(tag, taskName, str, data);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return C9971q.m14638b(this.tag, action.tag) && C9971q.m14638b(this.taskName, action.taskName) && C9971q.m14638b(this.title, action.title) && C9971q.m14638b(this.data, action.data);
        }

        public final Map<String, String> getData() {
            return this.data;
        }

        public final String getTag() {
            return this.tag;
        }

        public final String getTaskName() {
            return this.taskName;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = ((this.tag.hashCode() * 31) + this.taskName.hashCode()) * 31;
            String str = this.title;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.data.hashCode();
        }

        public String toString() {
            String str = this.tag;
            String str2 = this.taskName;
            String str3 = this.title;
            Map<String, String> map = this.data;
            return "Action(tag=" + str + ", taskName=" + str2 + ", title=" + str3 + ", data=" + map + ")";
        }
    }

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m15073d2 = {"Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Companion;", "", "()V", "foreground_service_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Priority;", "", "(Ljava/lang/String;I)V", "HIGH", "MEDIUM", "LOW", "foreground_service_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public enum Priority {
        HIGH,
        MEDIUM,
        LOW
    }

    public ServiceNotificationConfiguration(String title, String str, Priority priority, Action action, List<Action> auxiliaryActions) {
        C9971q.m14633g(title, "title");
        C9971q.m14633g(priority, "priority");
        C9971q.m14633g(auxiliaryActions, "auxiliaryActions");
        this.title = title;
        this.content = str;
        this.priority = priority;
        this.contentAction = action;
        this.auxiliaryActions = auxiliaryActions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ServiceNotificationConfiguration copy$default(ServiceNotificationConfiguration serviceNotificationConfiguration, String str, String str2, Priority priority, Action action, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serviceNotificationConfiguration.title;
        }
        if ((i & 2) != 0) {
            str2 = serviceNotificationConfiguration.content;
        }
        if ((i & 4) != 0) {
            priority = serviceNotificationConfiguration.priority;
        }
        if ((i & 8) != 0) {
            action = serviceNotificationConfiguration.contentAction;
        }
        if ((i & 16) != 0) {
            list = serviceNotificationConfiguration.auxiliaryActions;
        }
        return serviceNotificationConfiguration.copy(str, str2, priority, action, list);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.content;
    }

    public final Priority component3() {
        return this.priority;
    }

    public final Action component4() {
        return this.contentAction;
    }

    public final List<Action> component5() {
        return this.auxiliaryActions;
    }

    public final ServiceNotificationConfiguration copy(String title, String str, Priority priority, Action action, List<Action> auxiliaryActions) {
        C9971q.m14633g(title, "title");
        C9971q.m14633g(priority, "priority");
        C9971q.m14633g(auxiliaryActions, "auxiliaryActions");
        return new ServiceNotificationConfiguration(title, str, priority, action, auxiliaryActions);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceNotificationConfiguration)) {
            return false;
        }
        ServiceNotificationConfiguration serviceNotificationConfiguration = (ServiceNotificationConfiguration) obj;
        return C9971q.m14638b(this.title, serviceNotificationConfiguration.title) && C9971q.m14638b(this.content, serviceNotificationConfiguration.content) && this.priority == serviceNotificationConfiguration.priority && C9971q.m14638b(this.contentAction, serviceNotificationConfiguration.contentAction) && C9971q.m14638b(this.auxiliaryActions, serviceNotificationConfiguration.auxiliaryActions);
    }

    public final List<Action> getAuxiliaryActions() {
        return this.auxiliaryActions;
    }

    public final String getContent() {
        return this.content;
    }

    public final Action getContentAction() {
        return this.contentAction;
    }

    public final Priority getPriority() {
        return this.priority;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.content;
        int i = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.priority.hashCode()) * 31;
        Action action = this.contentAction;
        if (action != null) {
            i = action.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.auxiliaryActions.hashCode();
    }

    public String toString() {
        String str = this.title;
        String str2 = this.content;
        Priority priority = this.priority;
        Action action = this.contentAction;
        List<Action> list = this.auxiliaryActions;
        return "ServiceNotificationConfiguration(title=" + str + ", content=" + str2 + ", priority=" + priority + ", contentAction=" + action + ", auxiliaryActions=" + list + ")";
    }
}
