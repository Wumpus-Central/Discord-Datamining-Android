.class Lcom/facebook/react/views/scroll/ReactScrollView$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/views/scroll/ReactScrollView;->handlePostTouchScrolling(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private mRunning:Z

.field private mSnappingToPage:Z

.field private mStableFrames:I

.field final synthetic this$0:Lcom/facebook/react/views/scroll/ReactScrollView;


# direct methods
.method constructor <init>(Lcom/facebook/react/views/scroll/ReactScrollView;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/scroll/ReactScrollView$1;->this$0:Lcom/facebook/react/views/scroll/ReactScrollView;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/ReactScrollView$1;->mSnappingToPage:Z

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Lcom/facebook/react/views/scroll/ReactScrollView$1;->mRunning:Z

    .line 11
    .line 12
    iput p1, p0, Lcom/facebook/react/views/scroll/ReactScrollView$1;->mStableFrames:I

    .line 13
    .line 14
    return-void
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
.method public run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/ReactScrollView$1;->this$0:Lcom/facebook/react/views/scroll/ReactScrollView;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/react/views/scroll/ReactScrollView;->access$000(Lcom/facebook/react/views/scroll/ReactScrollView;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-wide/16 v1, 0x14

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/facebook/react/views/scroll/ReactScrollView$1;->this$0:Lcom/facebook/react/views/scroll/ReactScrollView;

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/facebook/react/views/scroll/ReactScrollView;->access$002(Lcom/facebook/react/views/scroll/ReactScrollView;Z)Z

    .line 16
    .line 17
    .line 18
    iput v3, p0, Lcom/facebook/react/views/scroll/ReactScrollView$1;->mStableFrames:I

    .line 19
    .line 20
    iput-boolean v4, p0, Lcom/facebook/react/views/scroll/ReactScrollView$1;->mRunning:Z

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/scroll/ReactScrollView$1;->this$0:Lcom/facebook/react/views/scroll/ReactScrollView;

    .line 24
    .line 25
    invoke-static {v0}, Lcom/facebook/react/views/scroll/ReactScrollViewHelper;->updateFabricScrollState(Landroid/view/ViewGroup;)Z

    .line 26
    .line 27
    .line 28
    iget v0, p0, Lcom/facebook/react/views/scroll/ReactScrollView$1;->mStableFrames:I

    .line 29
    .line 30
    add-int/2addr v0, v4

    .line 31
    iput v0, p0, Lcom/facebook/react/views/scroll/ReactScrollView$1;->mStableFrames:I

    .line 32
    .line 33
    const/4 v5, 0x3

    .line 34
    if-ge v0, v5, :cond_1

    .line 35
    .line 36
    move v0, v4

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move v0, v3

    .line 39
    :goto_0
    iput-boolean v0, p0, Lcom/facebook/react/views/scroll/ReactScrollView$1;->mRunning:Z

    .line 40
    .line 41
    iget-object v0, p0, Lcom/facebook/react/views/scroll/ReactScrollView$1;->this$0:Lcom/facebook/react/views/scroll/ReactScrollView;

    .line 42
    .line 43
    invoke-static {v0}, Lcom/facebook/react/views/scroll/ReactScrollView;->access$100(Lcom/facebook/react/views/scroll/ReactScrollView;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/ReactScrollView$1;->mSnappingToPage:Z

    .line 50
    .line 51
    if-nez v0, :cond_2

    .line 52
    .line 53
    iput-boolean v4, p0, Lcom/facebook/react/views/scroll/ReactScrollView$1;->mSnappingToPage:Z

    .line 54
    .line 55
    iget-object v0, p0, Lcom/facebook/react/views/scroll/ReactScrollView$1;->this$0:Lcom/facebook/react/views/scroll/ReactScrollView;

    .line 56
    .line 57
    invoke-static {v0, v3}, Lcom/facebook/react/views/scroll/ReactScrollView;->access$200(Lcom/facebook/react/views/scroll/ReactScrollView;I)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lcom/facebook/react/views/scroll/ReactScrollView$1;->this$0:Lcom/facebook/react/views/scroll/ReactScrollView;

    .line 61
    .line 62
    invoke-static {v0, p0, v1, v2}, Landroidx/core/view/w0;->j0(Landroid/view/View;Ljava/lang/Runnable;J)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    iget-object v0, p0, Lcom/facebook/react/views/scroll/ReactScrollView$1;->this$0:Lcom/facebook/react/views/scroll/ReactScrollView;

    .line 67
    .line 68
    invoke-static {v0}, Lcom/facebook/react/views/scroll/ReactScrollView;->access$300(Lcom/facebook/react/views/scroll/ReactScrollView;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    iget-object v0, p0, Lcom/facebook/react/views/scroll/ReactScrollView$1;->this$0:Lcom/facebook/react/views/scroll/ReactScrollView;

    .line 75
    .line 76
    invoke-static {v0}, Lcom/facebook/react/views/scroll/ReactScrollViewHelper;->emitScrollMomentumEndEvent(Landroid/view/ViewGroup;)V

    .line 77
    .line 78
    .line 79
    :cond_3
    iget-object v0, p0, Lcom/facebook/react/views/scroll/ReactScrollView$1;->this$0:Lcom/facebook/react/views/scroll/ReactScrollView;

    .line 80
    .line 81
    invoke-static {v0}, Lcom/facebook/react/views/scroll/ReactScrollView;->access$400(Lcom/facebook/react/views/scroll/ReactScrollView;)V

    .line 82
    .line 83
    .line 84
    :goto_1
    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/ReactScrollView$1;->mRunning:Z

    .line 85
    .line 86
    if-eqz v0, :cond_4

    .line 87
    .line 88
    iget-object v0, p0, Lcom/facebook/react/views/scroll/ReactScrollView$1;->this$0:Lcom/facebook/react/views/scroll/ReactScrollView;

    .line 89
    .line 90
    invoke-static {v0, p0, v1, v2}, Landroidx/core/view/w0;->j0(Landroid/view/View;Ljava/lang/Runnable;J)V

    .line 91
    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_4
    iget-object v0, p0, Lcom/facebook/react/views/scroll/ReactScrollView$1;->this$0:Lcom/facebook/react/views/scroll/ReactScrollView;

    .line 95
    .line 96
    const/4 v1, 0x0

    .line 97
    invoke-static {v0, v1}, Lcom/facebook/react/views/scroll/ReactScrollView;->access$502(Lcom/facebook/react/views/scroll/ReactScrollView;Ljava/lang/Runnable;)Ljava/lang/Runnable;

    .line 98
    .line 99
    .line 100
    :goto_2
    return-void
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
