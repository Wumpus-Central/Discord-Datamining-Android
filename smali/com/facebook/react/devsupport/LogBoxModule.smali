.class public Lcom/facebook/react/devsupport/LogBoxModule;
.super Lcom/facebook/fbreact/specs/NativeLogBoxSpec;
.source "SourceFile"


# annotations
.annotation runtime Lcom/facebook/react/module/annotations/ReactModule;
    name = "LogBox"
.end annotation


# static fields
.field public static final NAME:Ljava/lang/String; = "LogBox"


# instance fields
.field private final mDevSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

.field private final mSurfaceDelegate:Lcom/facebook/react/common/SurfaceDelegate;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/devsupport/interfaces/DevSupportManager;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/fbreact/specs/NativeLogBoxSpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lcom/facebook/react/devsupport/LogBoxModule;->mDevSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 5
    .line 6
    const-string p1, "LogBox"

    .line 7
    .line 8
    invoke-interface {p2, p1}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->createSurfaceDelegate(Ljava/lang/String;)Lcom/facebook/react/common/SurfaceDelegate;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iput-object p1, p0, Lcom/facebook/react/devsupport/LogBoxModule;->mSurfaceDelegate:Lcom/facebook/react/common/SurfaceDelegate;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance p1, Lcom/facebook/react/devsupport/LogBoxDialogSurfaceDelegate;

    .line 18
    .line 19
    invoke-direct {p1, p2}, Lcom/facebook/react/devsupport/LogBoxDialogSurfaceDelegate;-><init>(Lcom/facebook/react/devsupport/interfaces/DevSupportManager;)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lcom/facebook/react/devsupport/LogBoxModule;->mSurfaceDelegate:Lcom/facebook/react/common/SurfaceDelegate;

    .line 23
    .line 24
    :goto_0
    new-instance p1, Lcom/facebook/react/devsupport/LogBoxModule$1;

    .line 25
    .line 26
    invoke-direct {p1, p0}, Lcom/facebook/react/devsupport/LogBoxModule$1;-><init>(Lcom/facebook/react/devsupport/LogBoxModule;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 30
    .line 31
    .line 32
    return-void
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
.end method

.method static synthetic access$000(Lcom/facebook/react/devsupport/LogBoxModule;)Lcom/facebook/react/common/SurfaceDelegate;
    .locals 0

    iget-object p0, p0, Lcom/facebook/react/devsupport/LogBoxModule;->mSurfaceDelegate:Lcom/facebook/react/common/SurfaceDelegate;

    return-object p0
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "LogBox"

    return-object v0
.end method

.method public hide()V
    .locals 1

    new-instance v0, Lcom/facebook/react/devsupport/LogBoxModule$3;

    invoke-direct {v0, p0}, Lcom/facebook/react/devsupport/LogBoxModule$3;-><init>(Lcom/facebook/react/devsupport/LogBoxModule;)V

    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public invalidate()V
    .locals 1

    new-instance v0, Lcom/facebook/react/devsupport/LogBoxModule$4;

    invoke-direct {v0, p0}, Lcom/facebook/react/devsupport/LogBoxModule$4;-><init>(Lcom/facebook/react/devsupport/LogBoxModule;)V

    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public show()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/LogBoxModule;->mSurfaceDelegate:Lcom/facebook/react/common/SurfaceDelegate;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/common/SurfaceDelegate;->isContentViewReady()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Lcom/facebook/react/devsupport/LogBoxModule$2;

    .line 11
    .line 12
    invoke-direct {v0, p0}, Lcom/facebook/react/devsupport/LogBoxModule$2;-><init>(Lcom/facebook/react/devsupport/LogBoxModule;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    return-void
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
.end method
