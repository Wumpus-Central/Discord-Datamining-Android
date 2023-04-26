.class Lcom/facebook/react/devsupport/RedBoxContentView$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/devsupport/RedBoxContentView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/devsupport/RedBoxContentView;


# direct methods
.method constructor <init>(Lcom/facebook/react/devsupport/RedBoxContentView;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/devsupport/RedBoxContentView$2;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$2;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->access$400(Lcom/facebook/react/devsupport/RedBoxContentView;)Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$2;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->access$400(Lcom/facebook/react/devsupport/RedBoxContentView;)Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;->isReportEnabled()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$2;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 22
    .line 23
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->access$000(Lcom/facebook/react/devsupport/RedBoxContentView;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    goto/16 :goto_0

    .line 30
    .line 31
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$2;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    invoke-static {v0, v1}, Lcom/facebook/react/devsupport/RedBoxContentView;->access$002(Lcom/facebook/react/devsupport/RedBoxContentView;Z)Z

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$2;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 38
    .line 39
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->access$300(Lcom/facebook/react/devsupport/RedBoxContentView;)Landroid/widget/TextView;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, Lc6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Landroid/widget/TextView;

    .line 48
    .line 49
    const-string v1, "Reporting..."

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$2;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 55
    .line 56
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->access$300(Lcom/facebook/react/devsupport/RedBoxContentView;)Landroid/widget/TextView;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {v0}, Lc6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Landroid/widget/TextView;

    .line 65
    .line 66
    const/4 v1, 0x0

    .line 67
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$2;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 71
    .line 72
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->access$200(Lcom/facebook/react/devsupport/RedBoxContentView;)Landroid/widget/ProgressBar;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-static {v0}, Lc6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, Landroid/widget/ProgressBar;

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 83
    .line 84
    .line 85
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$2;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 86
    .line 87
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->access$500(Lcom/facebook/react/devsupport/RedBoxContentView;)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-static {v0}, Lc6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, Landroid/view/View;

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 98
    .line 99
    .line 100
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$2;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 101
    .line 102
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->access$100(Lcom/facebook/react/devsupport/RedBoxContentView;)Landroid/widget/Button;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-static {v0}, Lc6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    check-cast v0, Landroid/widget/Button;

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 113
    .line 114
    .line 115
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$2;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 116
    .line 117
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->access$600(Lcom/facebook/react/devsupport/RedBoxContentView;)Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-interface {v0}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->getLastErrorTitle()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-static {v0}, Lc6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    move-object v3, v0

    .line 130
    check-cast v3, Ljava/lang/String;

    .line 131
    .line 132
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$2;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 133
    .line 134
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->access$600(Lcom/facebook/react/devsupport/RedBoxContentView;)Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-interface {v0}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->getLastErrorStack()[Lcom/facebook/react/devsupport/interfaces/StackFrame;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-static {v0}, Lc6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    move-object v4, v0

    .line 147
    check-cast v4, [Lcom/facebook/react/devsupport/interfaces/StackFrame;

    .line 148
    .line 149
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$2;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 150
    .line 151
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->access$600(Lcom/facebook/react/devsupport/RedBoxContentView;)Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-interface {v0}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->getSourceUrl()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$2;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 160
    .line 161
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->access$400(Lcom/facebook/react/devsupport/RedBoxContentView;)Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    iget-object p1, p0, Lcom/facebook/react/devsupport/RedBoxContentView$2;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 170
    .line 171
    invoke-static {p1}, Lcom/facebook/react/devsupport/RedBoxContentView;->access$700(Lcom/facebook/react/devsupport/RedBoxContentView;)Lcom/facebook/react/devsupport/interfaces/RedBoxHandler$ReportCompletedListener;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    invoke-static {p1}, Lc6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    move-object v6, p1

    .line 180
    check-cast v6, Lcom/facebook/react/devsupport/interfaces/RedBoxHandler$ReportCompletedListener;

    .line 181
    .line 182
    invoke-interface/range {v1 .. v6}, Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;->reportRedbox(Landroid/content/Context;Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;Ljava/lang/String;Lcom/facebook/react/devsupport/interfaces/RedBoxHandler$ReportCompletedListener;)V

    .line 183
    .line 184
    .line 185
    :cond_1
    :goto_0
    return-void
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
.end method
