.class Lcom/facebook/react/modules/network/NetworkingModule$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/modules/network/ProgressListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/modules/network/NetworkingModule$1;->intercept(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field last:J

.field final synthetic this$1:Lcom/facebook/react/modules/network/NetworkingModule$1;


# direct methods
.method constructor <init>(Lcom/facebook/react/modules/network/NetworkingModule$1;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/facebook/react/modules/network/NetworkingModule$1$1;->this$1:Lcom/facebook/react/modules/network/NetworkingModule$1;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    iput-wide v0, p0, Lcom/facebook/react/modules/network/NetworkingModule$1$1;->last:J

    .line 11
    .line 12
    return-void
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
.end method


# virtual methods
.method public onProgress(JJZ)V
    .locals 8

    .line 1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    if-nez p5, :cond_0

    .line 6
    .line 7
    iget-wide v2, p0, Lcom/facebook/react/modules/network/NetworkingModule$1$1;->last:J

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, Lcom/facebook/react/modules/network/NetworkingModule;->access$000(JJ)Z

    .line 10
    .line 11
    .line 12
    move-result p5

    .line 13
    if-nez p5, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object p5, p0, Lcom/facebook/react/modules/network/NetworkingModule$1$1;->this$1:Lcom/facebook/react/modules/network/NetworkingModule$1;

    .line 17
    .line 18
    iget-object p5, p5, Lcom/facebook/react/modules/network/NetworkingModule$1;->val$responseType:Ljava/lang/String;

    .line 19
    .line 20
    const-string v2, "text"

    .line 21
    .line 22
    invoke-virtual {p5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p5

    .line 26
    if-eqz p5, :cond_1

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    iget-object p5, p0, Lcom/facebook/react/modules/network/NetworkingModule$1$1;->this$1:Lcom/facebook/react/modules/network/NetworkingModule$1;

    .line 30
    .line 31
    iget-object v2, p5, Lcom/facebook/react/modules/network/NetworkingModule$1;->val$eventEmitter:Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;

    .line 32
    .line 33
    iget v3, p5, Lcom/facebook/react/modules/network/NetworkingModule$1;->val$requestId:I

    .line 34
    .line 35
    move-wide v4, p1

    .line 36
    move-wide v6, p3

    .line 37
    invoke-static/range {v2 .. v7}, Lcom/facebook/react/modules/network/ResponseUtil;->onDataReceivedProgress(Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;IJJ)V

    .line 38
    .line 39
    .line 40
    iput-wide v0, p0, Lcom/facebook/react/modules/network/NetworkingModule$1$1;->last:J

    .line 41
    .line 42
    return-void
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
