.class Lcom/facebook/react/devsupport/RedBoxContentView$StackAdapter;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/devsupport/RedBoxContentView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "StackAdapter"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/devsupport/RedBoxContentView$StackAdapter$FrameViewHolder;
    }
.end annotation


# static fields
.field private static final VIEW_TYPE_COUNT:I = 0x2

.field private static final VIEW_TYPE_STACKFRAME:I = 0x1

.field private static final VIEW_TYPE_TITLE:I


# instance fields
.field private final mStack:[Lcom/facebook/react/devsupport/interfaces/StackFrame;

.field private final mTitle:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/devsupport/RedBoxContentView$StackAdapter;->mTitle:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/react/devsupport/RedBoxContentView$StackAdapter;->mStack:[Lcom/facebook/react/devsupport/interfaces/StackFrame;

    .line 7
    .line 8
    invoke-static {p1}, Lc6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    invoke-static {p2}, Lc6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
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
.end method


# virtual methods
.method public areAllItemsEnabled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getCount()I
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$StackAdapter;->mStack:[Lcom/facebook/react/devsupport/interfaces/StackFrame;

    array-length v0, v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/facebook/react/devsupport/RedBoxContentView$StackAdapter;->mTitle:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$StackAdapter;->mStack:[Lcom/facebook/react/devsupport/interfaces/StackFrame;

    add-int/lit8 p1, p1, -0x1

    aget-object p1, v0, p1

    :goto_0
    return-object p1
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :goto_0
    return p1
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_2

    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    check-cast p2, Landroid/widget/TextView;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    sget p2, Lcom/facebook/react/R$layout;->redbox_item_title:I

    .line 18
    .line 19
    invoke-virtual {p1, p2, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    move-object p2, p1

    .line 24
    check-cast p2, Landroid/widget/TextView;

    .line 25
    .line 26
    :goto_0
    iget-object p1, p0, Lcom/facebook/react/devsupport/RedBoxContentView$StackAdapter;->mTitle:Ljava/lang/String;

    .line 27
    .line 28
    if-nez p1, :cond_1

    .line 29
    .line 30
    const-string p1, "<unknown title>"

    .line 31
    .line 32
    :cond_1
    const-string p3, "\\x1b\\[[0-9;]*m"

    .line 33
    .line 34
    const-string v0, ""

    .line 35
    .line 36
    invoke-virtual {p1, p3, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 41
    .line 42
    .line 43
    return-object p2

    .line 44
    :cond_2
    if-nez p2, :cond_3

    .line 45
    .line 46
    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    sget v1, Lcom/facebook/react/R$layout;->redbox_item_frame:I

    .line 55
    .line 56
    invoke-virtual {p2, v1, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    new-instance p3, Lcom/facebook/react/devsupport/RedBoxContentView$StackAdapter$FrameViewHolder;

    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    invoke-direct {p3, p2, v0}, Lcom/facebook/react/devsupport/RedBoxContentView$StackAdapter$FrameViewHolder;-><init>(Landroid/view/View;Lcom/facebook/react/devsupport/RedBoxContentView$1;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :cond_3
    iget-object p3, p0, Lcom/facebook/react/devsupport/RedBoxContentView$StackAdapter;->mStack:[Lcom/facebook/react/devsupport/interfaces/StackFrame;

    .line 70
    .line 71
    add-int/lit8 p1, p1, -0x1

    .line 72
    .line 73
    aget-object p1, p3, p1

    .line 74
    .line 75
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p3

    .line 79
    check-cast p3, Lcom/facebook/react/devsupport/RedBoxContentView$StackAdapter$FrameViewHolder;

    .line 80
    .line 81
    invoke-static {p3}, Lcom/facebook/react/devsupport/RedBoxContentView$StackAdapter$FrameViewHolder;->access$900(Lcom/facebook/react/devsupport/RedBoxContentView$StackAdapter$FrameViewHolder;)Landroid/widget/TextView;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-interface {p1}, Lcom/facebook/react/devsupport/interfaces/StackFrame;->getMethod()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 90
    .line 91
    .line 92
    invoke-static {p3}, Lcom/facebook/react/devsupport/RedBoxContentView$StackAdapter$FrameViewHolder;->access$1000(Lcom/facebook/react/devsupport/RedBoxContentView$StackAdapter$FrameViewHolder;)Landroid/widget/TextView;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-static {p1}, Lcom/facebook/react/devsupport/StackTraceHelper;->formatFrameSource(Lcom/facebook/react/devsupport/interfaces/StackFrame;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 101
    .line 102
    .line 103
    invoke-static {p3}, Lcom/facebook/react/devsupport/RedBoxContentView$StackAdapter$FrameViewHolder;->access$900(Lcom/facebook/react/devsupport/RedBoxContentView$StackAdapter$FrameViewHolder;)Landroid/widget/TextView;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-interface {p1}, Lcom/facebook/react/devsupport/interfaces/StackFrame;->isCollapsed()Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-eqz v1, :cond_4

    .line 112
    .line 113
    const v1, -0x555556

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_4
    const/4 v1, -0x1

    .line 118
    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 119
    .line 120
    .line 121
    invoke-static {p3}, Lcom/facebook/react/devsupport/RedBoxContentView$StackAdapter$FrameViewHolder;->access$1000(Lcom/facebook/react/devsupport/RedBoxContentView$StackAdapter$FrameViewHolder;)Landroid/widget/TextView;

    .line 122
    .line 123
    .line 124
    move-result-object p3

    .line 125
    invoke-interface {p1}, Lcom/facebook/react/devsupport/interfaces/StackFrame;->isCollapsed()Z

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    if-eqz p1, :cond_5

    .line 130
    .line 131
    const p1, -0x7f7f80

    .line 132
    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_5
    const p1, -0x4c4c4d

    .line 136
    .line 137
    .line 138
    :goto_2
    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 139
    .line 140
    .line 141
    return-object p2
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

.method public getViewTypeCount()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public isEnabled(I)Z
    .locals 0

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
