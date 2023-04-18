.class public final Le0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/g1;
.implements Le0/i;


# instance fields
.field private final a:Landroidx/camera/extensions/impl/PreviewExtenderImpl;

.field private final b:Landroidx/camera/extensions/impl/RequestUpdateProcessorImpl;

.field private c:Le0/h;


# direct methods
.method public constructor <init>(Landroidx/camera/extensions/impl/PreviewExtenderImpl;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Le0/h;

    .line 5
    .line 6
    invoke-direct {v0}, Le0/h;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Le0/d;->c:Le0/h;

    .line 10
    .line 11
    invoke-interface {p1}, Landroidx/camera/extensions/impl/PreviewExtenderImpl;->getProcessorType()Landroidx/camera/extensions/impl/PreviewExtenderImpl$ProcessorType;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, Landroidx/camera/extensions/impl/PreviewExtenderImpl$ProcessorType;->PROCESSOR_TYPE_REQUEST_UPDATE_ONLY:Landroidx/camera/extensions/impl/PreviewExtenderImpl$ProcessorType;

    .line 16
    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    const-string v1, "AdaptingRequestUpdateProcess can only adapt extender with PROCESSOR_TYPE_REQUEST_UPDATE_ONLY ProcessorType."

    .line 23
    .line 24
    invoke-static {v0, v1}, Landroidx/core/util/g;->b(ZLjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Le0/d;->a:Landroidx/camera/extensions/impl/PreviewExtenderImpl;

    .line 28
    .line 29
    invoke-interface {p1}, Landroidx/camera/extensions/impl/PreviewExtenderImpl;->getProcessor()Landroidx/camera/extensions/impl/ProcessorImpl;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Landroidx/camera/extensions/impl/RequestUpdateProcessorImpl;

    .line 34
    .line 35
    iput-object p1, p0, Le0/d;->b:Landroidx/camera/extensions/impl/RequestUpdateProcessorImpl;

    .line 36
    .line 37
    return-void
    .line 38
    .line 39
    .line 40
.end method


# virtual methods
.method public a(Landroidx/camera/core/k1;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Le0/d;->c:Le0/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Le0/h;->c()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    :try_start_0
    invoke-static {p1}, Lw/u;->a(Landroidx/camera/core/k1;)Lw/t;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, Lp/a;->a(Lw/t;)Landroid/hardware/camera2/CaptureResult;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    instance-of v0, p1, Landroid/hardware/camera2/TotalCaptureResult;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget-object v0, p0, Le0/d;->b:Landroidx/camera/extensions/impl/RequestUpdateProcessorImpl;

    .line 24
    .line 25
    check-cast p1, Landroid/hardware/camera2/TotalCaptureResult;

    .line 26
    .line 27
    invoke-interface {v0, p1}, Landroidx/camera/extensions/impl/RequestUpdateProcessorImpl;->process(Landroid/hardware/camera2/TotalCaptureResult;)Landroidx/camera/extensions/impl/CaptureStageImpl;

    .line 28
    .line 29
    .line 30
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    move v1, p1

    .line 35
    :cond_1
    iget-object p1, p0, Le0/d;->c:Le0/h;

    .line 36
    .line 37
    invoke-virtual {p1}, Le0/h;->a()V

    .line 38
    .line 39
    .line 40
    return v1

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    iget-object v0, p0, Le0/d;->c:Le0/h;

    .line 43
    .line 44
    invoke-virtual {v0}, Le0/h;->a()V

    .line 45
    .line 46
    .line 47
    throw p1
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
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Le0/d;->c:Le0/h;

    invoke-virtual {v0}, Le0/h;->b()V

    return-void
.end method
