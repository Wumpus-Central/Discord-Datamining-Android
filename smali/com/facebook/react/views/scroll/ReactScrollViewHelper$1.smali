.class Lcom/facebook/react/views/scroll/ReactScrollViewHelper$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/uimanager/FabricViewStateManager$StateUpdateCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/views/scroll/ReactScrollViewHelper;->forceUpdateState(Landroid/view/ViewGroup;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic val$scrollAwayPaddingTop:I

.field final synthetic val$scrollX:I

.field final synthetic val$scrollY:I


# direct methods
.method constructor <init>(III)V
    .locals 0

    iput p1, p0, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$1;->val$scrollX:I

    iput p2, p0, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$1;->val$scrollY:I

    iput p3, p0, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$1;->val$scrollAwayPaddingTop:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getStateUpdate()Lcom/facebook/react/bridge/WritableMap;
    .locals 4

    .line 1
    new-instance v0, Lcom/facebook/react/bridge/WritableNativeMap;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$1;->val$scrollX:I

    .line 7
    .line 8
    int-to-float v1, v1

    .line 9
    invoke-static {v1}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    float-to-double v1, v1

    .line 14
    const-string v3, "contentOffsetLeft"

    .line 15
    .line 16
    invoke-interface {v0, v3, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 17
    .line 18
    .line 19
    iget v1, p0, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$1;->val$scrollY:I

    .line 20
    .line 21
    int-to-float v1, v1

    .line 22
    invoke-static {v1}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    float-to-double v1, v1

    .line 27
    const-string v3, "contentOffsetTop"

    .line 28
    .line 29
    invoke-interface {v0, v3, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 30
    .line 31
    .line 32
    iget v1, p0, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$1;->val$scrollAwayPaddingTop:I

    .line 33
    .line 34
    int-to-float v1, v1

    .line 35
    invoke-static {v1}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    float-to-double v1, v1

    .line 40
    const-string v3, "scrollAwayPaddingTop"

    .line 41
    .line 42
    invoke-interface {v0, v3, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 43
    .line 44
    .line 45
    return-object v0
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
.end method