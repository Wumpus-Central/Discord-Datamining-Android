.class final Lcom/facebook/react/uimanager/UIViewOperationQueue$UpdateLayoutOperation;
.super Lcom/facebook/react/uimanager/UIViewOperationQueue$ViewOperation;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/UIViewOperationQueue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "UpdateLayoutOperation"
.end annotation


# instance fields
.field private final mHeight:I

.field private final mParentTag:I

.field private final mWidth:I

.field private final mX:I

.field private final mY:I

.field final synthetic this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;


# direct methods
.method public constructor <init>(Lcom/facebook/react/uimanager/UIViewOperationQueue;IIIIII)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$UpdateLayoutOperation;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 2
    .line 3
    invoke-direct {p0, p1, p3}, Lcom/facebook/react/uimanager/UIViewOperationQueue$ViewOperation;-><init>(Lcom/facebook/react/uimanager/UIViewOperationQueue;I)V

    .line 4
    .line 5
    .line 6
    iput p2, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$UpdateLayoutOperation;->mParentTag:I

    .line 7
    .line 8
    iput p4, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$UpdateLayoutOperation;->mX:I

    .line 9
    .line 10
    iput p5, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$UpdateLayoutOperation;->mY:I

    .line 11
    .line 12
    iput p6, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$UpdateLayoutOperation;->mWidth:I

    .line 13
    .line 14
    iput p7, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$UpdateLayoutOperation;->mHeight:I

    .line 15
    .line 16
    const-string p1, "updateLayout"

    .line 17
    .line 18
    iget p2, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$ViewOperation;->mTag:I

    .line 19
    .line 20
    const-wide/16 p3, 0x0

    .line 21
    .line 22
    invoke-static {p3, p4, p1, p2}, Lg6/a;->j(JLjava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    return-void
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


# virtual methods
.method public execute()V
    .locals 8

    .line 1
    const-string v0, "updateLayout"

    .line 2
    .line 3
    iget v1, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$ViewOperation;->mTag:I

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    invoke-static {v2, v3, v0, v1}, Lg6/a;->d(JLjava/lang/String;I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$UpdateLayoutOperation;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 11
    .line 12
    invoke-static {v0}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->access$000(Lcom/facebook/react/uimanager/UIViewOperationQueue;)Lcom/facebook/react/uimanager/NativeViewHierarchyManager;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget v2, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$UpdateLayoutOperation;->mParentTag:I

    .line 17
    .line 18
    iget v3, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$ViewOperation;->mTag:I

    .line 19
    .line 20
    iget v4, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$UpdateLayoutOperation;->mX:I

    .line 21
    .line 22
    iget v5, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$UpdateLayoutOperation;->mY:I

    .line 23
    .line 24
    iget v6, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$UpdateLayoutOperation;->mWidth:I

    .line 25
    .line 26
    iget v7, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$UpdateLayoutOperation;->mHeight:I

    .line 27
    .line 28
    invoke-virtual/range {v1 .. v7}, Lcom/facebook/react/uimanager/NativeViewHierarchyManager;->updateLayout(IIIIII)V

    .line 29
    .line 30
    .line 31
    return-void
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
