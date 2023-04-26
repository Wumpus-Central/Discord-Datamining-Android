.class public Lcom/facebook/react/bridge/queue/ReactQueueConfigurationImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;


# instance fields
.field private final mJSQueueThread:Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;

.field private final mNativeModulesQueueThread:Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;

.field private final mUIQueueThread:Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;


# direct methods
.method private constructor <init>(Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/bridge/queue/ReactQueueConfigurationImpl;->mUIQueueThread:Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/react/bridge/queue/ReactQueueConfigurationImpl;->mNativeModulesQueueThread:Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/facebook/react/bridge/queue/ReactQueueConfigurationImpl;->mJSQueueThread:Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;

    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
.end method

.method public static create(Lcom/facebook/react/bridge/queue/ReactQueueConfigurationSpec;Lcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;)Lcom/facebook/react/bridge/queue/ReactQueueConfigurationImpl;
    .locals 4

    .line 1
    invoke-static {}, Lcom/facebook/react/common/MapBuilder;->newHashMap()Ljava/util/HashMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lcom/facebook/react/bridge/queue/MessageQueueThreadSpec;->mainThreadSpec()Lcom/facebook/react/bridge/queue/MessageQueueThreadSpec;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1, p1}, Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;->create(Lcom/facebook/react/bridge/queue/MessageQueueThreadSpec;Lcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;)Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/facebook/react/bridge/queue/ReactQueueConfigurationSpec;->getJSQueueThreadSpec()Lcom/facebook/react/bridge/queue/MessageQueueThreadSpec;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;

    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/facebook/react/bridge/queue/ReactQueueConfigurationSpec;->getJSQueueThreadSpec()Lcom/facebook/react/bridge/queue/MessageQueueThreadSpec;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-static {v1, p1}, Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;->create(Lcom/facebook/react/bridge/queue/MessageQueueThreadSpec;Lcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;)Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/bridge/queue/ReactQueueConfigurationSpec;->getNativeModulesQueueThreadSpec()Lcom/facebook/react/bridge/queue/MessageQueueThreadSpec;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;

    .line 45
    .line 46
    if-nez v0, :cond_1

    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/facebook/react/bridge/queue/ReactQueueConfigurationSpec;->getNativeModulesQueueThreadSpec()Lcom/facebook/react/bridge/queue/MessageQueueThreadSpec;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-static {p0, p1}, Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;->create(Lcom/facebook/react/bridge/queue/MessageQueueThreadSpec;Lcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;)Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    :cond_1
    new-instance p0, Lcom/facebook/react/bridge/queue/ReactQueueConfigurationImpl;

    .line 57
    .line 58
    invoke-direct {p0, v2, v0, v1}, Lcom/facebook/react/bridge/queue/ReactQueueConfigurationImpl;-><init>(Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;)V

    .line 59
    .line 60
    .line 61
    return-object p0
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
.end method


# virtual methods
.method public destroy()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/bridge/queue/ReactQueueConfigurationImpl;->mNativeModulesQueueThread:Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;->getLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/facebook/react/bridge/queue/ReactQueueConfigurationImpl;->mNativeModulesQueueThread:Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;->quitSynchronous()V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/bridge/queue/ReactQueueConfigurationImpl;->mJSQueueThread:Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;->getLooper()Landroid/os/Looper;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-eq v0, v1, :cond_1

    .line 29
    .line 30
    iget-object v0, p0, Lcom/facebook/react/bridge/queue/ReactQueueConfigurationImpl;->mJSQueueThread:Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;

    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;->quitSynchronous()V

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
.end method

.method public getJSQueueThread()Lcom/facebook/react/bridge/queue/MessageQueueThread;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/bridge/queue/ReactQueueConfigurationImpl;->mJSQueueThread:Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;

    return-object v0
.end method

.method public getNativeModulesQueueThread()Lcom/facebook/react/bridge/queue/MessageQueueThread;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/bridge/queue/ReactQueueConfigurationImpl;->mNativeModulesQueueThread:Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;

    return-object v0
.end method

.method public getUIQueueThread()Lcom/facebook/react/bridge/queue/MessageQueueThread;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/bridge/queue/ReactQueueConfigurationImpl;->mUIQueueThread:Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;

    return-object v0
.end method
