.class public Lcom/facebook/react/devsupport/RedBoxContentView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/devsupport/RedBoxContentView$OpenStackFrameTask;,
        Lcom/facebook/react/devsupport/RedBoxContentView$StackAdapter;
    }
.end annotation


# instance fields
.field private isReporting:Z

.field private mDevSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

.field private mDismissButton:Landroid/widget/Button;

.field private mLineSeparator:Landroid/view/View;

.field private mLoadingIndicator:Landroid/widget/ProgressBar;

.field private mRedBoxHandler:Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;

.field private mReloadJsButton:Landroid/widget/Button;

.field private mReportButton:Landroid/widget/Button;

.field private mReportButtonOnClickListener:Landroid/view/View$OnClickListener;

.field private mReportCompletedListener:Lcom/facebook/react/devsupport/interfaces/RedBoxHandler$ReportCompletedListener;

.field private mReportTextView:Landroid/widget/TextView;

.field private mStackView:Landroid/widget/ListView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->isReporting:Z

    .line 6
    .line 7
    new-instance p1, Lcom/facebook/react/devsupport/RedBoxContentView$1;

    .line 8
    .line 9
    invoke-direct {p1, p0}, Lcom/facebook/react/devsupport/RedBoxContentView$1;-><init>(Lcom/facebook/react/devsupport/RedBoxContentView;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mReportCompletedListener:Lcom/facebook/react/devsupport/interfaces/RedBoxHandler$ReportCompletedListener;

    .line 13
    .line 14
    new-instance p1, Lcom/facebook/react/devsupport/RedBoxContentView$2;

    .line 15
    .line 16
    invoke-direct {p1, p0}, Lcom/facebook/react/devsupport/RedBoxContentView$2;-><init>(Lcom/facebook/react/devsupport/RedBoxContentView;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mReportButtonOnClickListener:Landroid/view/View$OnClickListener;

    .line 20
    .line 21
    return-void
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

.method static synthetic access$000(Lcom/facebook/react/devsupport/RedBoxContentView;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->isReporting:Z

    return p0
.end method

.method static synthetic access$002(Lcom/facebook/react/devsupport/RedBoxContentView;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->isReporting:Z

    return p1
.end method

.method static synthetic access$100(Lcom/facebook/react/devsupport/RedBoxContentView;)Landroid/widget/Button;
    .locals 0

    iget-object p0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mReportButton:Landroid/widget/Button;

    return-object p0
.end method

.method static synthetic access$200(Lcom/facebook/react/devsupport/RedBoxContentView;)Landroid/widget/ProgressBar;
    .locals 0

    iget-object p0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mLoadingIndicator:Landroid/widget/ProgressBar;

    return-object p0
.end method

.method static synthetic access$300(Lcom/facebook/react/devsupport/RedBoxContentView;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mReportTextView:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic access$400(Lcom/facebook/react/devsupport/RedBoxContentView;)Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;
    .locals 0

    iget-object p0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mRedBoxHandler:Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;

    return-object p0
.end method

.method static synthetic access$500(Lcom/facebook/react/devsupport/RedBoxContentView;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mLineSeparator:Landroid/view/View;

    return-object p0
.end method

.method static synthetic access$600(Lcom/facebook/react/devsupport/RedBoxContentView;)Lcom/facebook/react/devsupport/interfaces/DevSupportManager;
    .locals 0

    iget-object p0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mDevSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    return-object p0
.end method

.method static synthetic access$700(Lcom/facebook/react/devsupport/RedBoxContentView;)Lcom/facebook/react/devsupport/interfaces/RedBoxHandler$ReportCompletedListener;
    .locals 0

    iget-object p0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mReportCompletedListener:Lcom/facebook/react/devsupport/interfaces/RedBoxHandler$ReportCompletedListener;

    return-object p0
.end method


# virtual methods
.method public init()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget v1, Lcom/facebook/react/R$layout;->redbox_view:I

    .line 10
    .line 11
    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    sget v0, Lcom/facebook/react/R$id;->rn_redbox_stack:I

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Landroid/widget/ListView;

    .line 21
    .line 22
    iput-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mStackView:Landroid/widget/ListView;

    .line 23
    .line 24
    invoke-virtual {v0, p0}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 25
    .line 26
    .line 27
    sget v0, Lcom/facebook/react/R$id;->rn_redbox_reload_button:I

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Landroid/widget/Button;

    .line 34
    .line 35
    iput-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mReloadJsButton:Landroid/widget/Button;

    .line 36
    .line 37
    new-instance v1, Lcom/facebook/react/devsupport/RedBoxContentView$3;

    .line 38
    .line 39
    invoke-direct {v1, p0}, Lcom/facebook/react/devsupport/RedBoxContentView$3;-><init>(Lcom/facebook/react/devsupport/RedBoxContentView;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 43
    .line 44
    .line 45
    sget v0, Lcom/facebook/react/R$id;->rn_redbox_dismiss_button:I

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Landroid/widget/Button;

    .line 52
    .line 53
    iput-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mDismissButton:Landroid/widget/Button;

    .line 54
    .line 55
    new-instance v1, Lcom/facebook/react/devsupport/RedBoxContentView$4;

    .line 56
    .line 57
    invoke-direct {v1, p0}, Lcom/facebook/react/devsupport/RedBoxContentView$4;-><init>(Lcom/facebook/react/devsupport/RedBoxContentView;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mRedBoxHandler:Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;

    .line 64
    .line 65
    if-eqz v0, :cond_0

    .line 66
    .line 67
    invoke-interface {v0}, Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;->isReportEnabled()Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_0

    .line 72
    .line 73
    sget v0, Lcom/facebook/react/R$id;->rn_redbox_loading_indicator:I

    .line 74
    .line 75
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, Landroid/widget/ProgressBar;

    .line 80
    .line 81
    iput-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mLoadingIndicator:Landroid/widget/ProgressBar;

    .line 82
    .line 83
    sget v0, Lcom/facebook/react/R$id;->rn_redbox_line_separator:I

    .line 84
    .line 85
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iput-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mLineSeparator:Landroid/view/View;

    .line 90
    .line 91
    sget v0, Lcom/facebook/react/R$id;->rn_redbox_report_label:I

    .line 92
    .line 93
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    check-cast v0, Landroid/widget/TextView;

    .line 98
    .line 99
    iput-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mReportTextView:Landroid/widget/TextView;

    .line 100
    .line 101
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 106
    .line 107
    .line 108
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mReportTextView:Landroid/widget/TextView;

    .line 109
    .line 110
    const/4 v1, 0x0

    .line 111
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setHighlightColor(I)V

    .line 112
    .line 113
    .line 114
    sget v0, Lcom/facebook/react/R$id;->rn_redbox_report_button:I

    .line 115
    .line 116
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    check-cast v0, Landroid/widget/Button;

    .line 121
    .line 122
    iput-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mReportButton:Landroid/widget/Button;

    .line 123
    .line 124
    iget-object v1, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mReportButtonOnClickListener:Landroid/view/View$OnClickListener;

    .line 125
    .line 126
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 127
    .line 128
    .line 129
    :cond_0
    return-void
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
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .line 1
    new-instance p1, Lcom/facebook/react/devsupport/RedBoxContentView$OpenStackFrameTask;

    .line 2
    .line 3
    iget-object p2, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mDevSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 4
    .line 5
    invoke-static {p2}, Lc6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    check-cast p2, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 10
    .line 11
    const/4 p4, 0x0

    .line 12
    invoke-direct {p1, p2, p4}, Lcom/facebook/react/devsupport/RedBoxContentView$OpenStackFrameTask;-><init>(Lcom/facebook/react/devsupport/interfaces/DevSupportManager;Lcom/facebook/react/devsupport/RedBoxContentView$1;)V

    .line 13
    .line 14
    .line 15
    sget-object p2, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    .line 16
    .line 17
    const/4 p4, 0x1

    .line 18
    new-array p4, p4, [Lcom/facebook/react/devsupport/interfaces/StackFrame;

    .line 19
    .line 20
    iget-object p5, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mStackView:Landroid/widget/ListView;

    .line 21
    .line 22
    invoke-virtual {p5}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 23
    .line 24
    .line 25
    move-result-object p5

    .line 26
    invoke-interface {p5, p3}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    check-cast p3, Lcom/facebook/react/devsupport/interfaces/StackFrame;

    .line 31
    .line 32
    const/4 p5, 0x0

    .line 33
    aput-object p3, p4, p5

    .line 34
    .line 35
    invoke-virtual {p1, p2, p4}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 36
    .line 37
    .line 38
    return-void
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
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
.end method

.method public refreshContentView()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mDevSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->getLastErrorTitle()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mDevSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 8
    .line 9
    invoke-interface {v1}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->getLastErrorStack()[Lcom/facebook/react/devsupport/interfaces/StackFrame;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mDevSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 14
    .line 15
    invoke-interface {v2}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->getLastErrorType()Lcom/facebook/react/devsupport/interfaces/ErrorType;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-object v3, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mDevSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 20
    .line 21
    invoke-static {v0, v1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-interface {v3, v4}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->processErrorCustomizers(Landroid/util/Pair;)Landroid/util/Pair;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    iget-object v4, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v4, Ljava/lang/String;

    .line 32
    .line 33
    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v3, [Lcom/facebook/react/devsupport/interfaces/StackFrame;

    .line 36
    .line 37
    invoke-virtual {p0, v4, v3}, Lcom/facebook/react/devsupport/RedBoxContentView;->setExceptionDetails(Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;)V

    .line 38
    .line 39
    .line 40
    iget-object v3, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mDevSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 41
    .line 42
    invoke-interface {v3}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->getRedBoxHandler()Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    if-eqz v3, :cond_0

    .line 47
    .line 48
    invoke-interface {v3, v0, v1, v2}, Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;->handleRedbox(Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;Lcom/facebook/react/devsupport/interfaces/ErrorType;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/facebook/react/devsupport/RedBoxContentView;->resetReporting()V

    .line 52
    .line 53
    .line 54
    :cond_0
    return-void
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
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
.end method

.method public resetReporting()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mRedBoxHandler:Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;->isReportEnabled()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    iput-boolean v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->isReporting:Z

    .line 14
    .line 15
    iget-object v1, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mReportTextView:Landroid/widget/TextView;

    .line 16
    .line 17
    invoke-static {v1}, Lc6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Landroid/widget/TextView;

    .line 22
    .line 23
    const/16 v2, 0x8

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mLoadingIndicator:Landroid/widget/ProgressBar;

    .line 29
    .line 30
    invoke-static {v1}, Lc6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Landroid/widget/ProgressBar;

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mLineSeparator:Landroid/view/View;

    .line 40
    .line 41
    invoke-static {v1}, Lc6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Landroid/view/View;

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mReportButton:Landroid/widget/Button;

    .line 51
    .line 52
    invoke-static {v1}, Lc6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Landroid/widget/Button;

    .line 57
    .line 58
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mReportButton:Landroid/widget/Button;

    .line 62
    .line 63
    invoke-static {v0}, Lc6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    check-cast v0, Landroid/widget/Button;

    .line 68
    .line 69
    const/4 v1, 0x1

    .line 70
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 71
    .line 72
    .line 73
    :cond_1
    :goto_0
    return-void
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
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
.end method

.method public setDevSupportManager(Lcom/facebook/react/devsupport/interfaces/DevSupportManager;)Lcom/facebook/react/devsupport/RedBoxContentView;
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mDevSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    return-object p0
.end method

.method public setExceptionDetails(Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;)V
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mStackView:Landroid/widget/ListView;

    new-instance v1, Lcom/facebook/react/devsupport/RedBoxContentView$StackAdapter;

    invoke-direct {v1, p1, p2}, Lcom/facebook/react/devsupport/RedBoxContentView$StackAdapter;-><init>(Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    return-void
.end method

.method public setRedBoxHandler(Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;)Lcom/facebook/react/devsupport/RedBoxContentView;
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mRedBoxHandler:Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;

    return-object p0
.end method
