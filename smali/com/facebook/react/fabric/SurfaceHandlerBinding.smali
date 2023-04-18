.class public Lcom/facebook/react/fabric/SurfaceHandlerBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/fabric/SurfaceHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/fabric/SurfaceHandlerBinding$DisplayModeTypeDef;
    }
.end annotation


# static fields
.field public static final DISPLAY_MODE_HIDDEN:I = 0x2

.field public static final DISPLAY_MODE_SUSPENDED:I = 0x1

.field public static final DISPLAY_MODE_VISIBLE:I

.field private static final NO_SURFACE_ID:I


# instance fields
.field private final mHybridData:Lcom/facebook/jni/HybridData;
    .annotation build Ld6/a;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lcom/facebook/react/fabric/FabricSoLoader;->staticInit()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-static {v0, p1}, Lcom/facebook/react/fabric/SurfaceHandlerBinding;->initHybrid(ILjava/lang/String;)Lcom/facebook/jni/HybridData;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lcom/facebook/react/fabric/SurfaceHandlerBinding;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 10
    .line 11
    return-void
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
.end method

.method private native getModuleNameNative()Ljava/lang/String;
.end method

.method private native getSurfaceIdNative()I
.end method

.method private static native initHybrid(ILjava/lang/String;)Lcom/facebook/jni/HybridData;
.end method

.method private native isRunningNative()Z
.end method

.method private native setDisplayModeNative(I)V
.end method

.method private native setLayoutConstraintsNative(FFFFFFZZF)V
.end method

.method private native setPropsNative(Lcom/facebook/react/bridge/NativeMap;)V
.end method

.method private native setSurfaceIdNative(I)V
.end method

.method private native startNative()V
.end method

.method private native stopNative()V
.end method


# virtual methods
.method public getModuleName()Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Lcom/facebook/react/fabric/SurfaceHandlerBinding;->getModuleNameNative()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSurfaceId()I
    .locals 1

    invoke-direct {p0}, Lcom/facebook/react/fabric/SurfaceHandlerBinding;->getSurfaceIdNative()I

    move-result v0

    return v0
.end method

.method public isRunning()Z
    .locals 1

    invoke-direct {p0}, Lcom/facebook/react/fabric/SurfaceHandlerBinding;->isRunningNative()Z

    move-result v0

    return v0
.end method

.method public setLayoutConstraints(IIIIZZF)V
    .locals 10

    .line 1
    invoke-static {p1}, Lcom/facebook/react/fabric/mounting/a;->b(I)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    div-float v1, v0, p7

    .line 6
    .line 7
    invoke-static {p1}, Lcom/facebook/react/fabric/mounting/a;->a(I)F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    div-float v2, v0, p7

    .line 12
    .line 13
    invoke-static {p2}, Lcom/facebook/react/fabric/mounting/a;->b(I)F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    div-float v3, v0, p7

    .line 18
    .line 19
    invoke-static {p2}, Lcom/facebook/react/fabric/mounting/a;->a(I)F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    div-float v4, v0, p7

    .line 24
    .line 25
    move v0, p3

    .line 26
    int-to-float v0, v0

    .line 27
    div-float v5, v0, p7

    .line 28
    .line 29
    move v0, p4

    .line 30
    int-to-float v0, v0

    .line 31
    div-float v6, v0, p7

    .line 32
    .line 33
    move-object v0, p0

    .line 34
    move v7, p5

    .line 35
    move/from16 v8, p6

    .line 36
    .line 37
    move/from16 v9, p7

    .line 38
    .line 39
    invoke-direct/range {v0 .. v9}, Lcom/facebook/react/fabric/SurfaceHandlerBinding;->setLayoutConstraintsNative(FFFFFFZZF)V

    .line 40
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
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
.end method

.method public setMountable(Z)V
    .locals 0

    xor-int/lit8 p1, p1, 0x1

    invoke-direct {p0, p1}, Lcom/facebook/react/fabric/SurfaceHandlerBinding;->setDisplayModeNative(I)V

    return-void
.end method

.method public setProps(Lcom/facebook/react/bridge/NativeMap;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/react/fabric/SurfaceHandlerBinding;->setPropsNative(Lcom/facebook/react/bridge/NativeMap;)V

    return-void
.end method

.method public setSurfaceId(I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/react/fabric/SurfaceHandlerBinding;->setSurfaceIdNative(I)V

    return-void
.end method

.method public start()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/fabric/SurfaceHandlerBinding;->startNative()V

    return-void
.end method

.method public stop()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/fabric/SurfaceHandlerBinding;->stopNative()V

    return-void
.end method
