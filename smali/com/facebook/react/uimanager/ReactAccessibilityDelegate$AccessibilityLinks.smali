.class public Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityLinks;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AccessibilityLinks"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityLinks$AccessibleLink;
    }
.end annotation


# instance fields
.field private final mLinks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityLinks$AccessibleLink;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>([Landroid/text/style/ClickableSpan;Landroid/text/Spannable;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    array-length v2, p1

    .line 11
    if-ge v1, v2, :cond_2

    .line 12
    .line 13
    aget-object v2, p1, v1

    .line 14
    .line 15
    invoke-interface {p2, v2}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-interface {p2, v2}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eq v3, v2, :cond_1

    .line 24
    .line 25
    if-ltz v3, :cond_1

    .line 26
    .line 27
    if-ltz v2, :cond_1

    .line 28
    .line 29
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-gt v3, v4, :cond_1

    .line 34
    .line 35
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-le v2, v4, :cond_0

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_0
    new-instance v4, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityLinks$AccessibleLink;

    .line 43
    .line 44
    const/4 v5, 0x0

    .line 45
    invoke-direct {v4, v5}, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityLinks$AccessibleLink;-><init>(Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$1;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {p2, v3, v2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-interface {v5}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    iput-object v5, v4, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityLinks$AccessibleLink;->description:Ljava/lang/String;

    .line 57
    .line 58
    iput v3, v4, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityLinks$AccessibleLink;->start:I

    .line 59
    .line 60
    iput v2, v4, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityLinks$AccessibleLink;->end:I

    .line 61
    .line 62
    array-length v2, p1

    .line 63
    add-int/lit8 v2, v2, -0x1

    .line 64
    .line 65
    sub-int/2addr v2, v1

    .line 66
    iput v2, v4, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityLinks$AccessibleLink;->id:I

    .line 67
    .line 68
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    iput-object v0, p0, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityLinks;->mLinks:Ljava/util/List;

    .line 75
    .line 76
    return-void
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
.method public getLinkById(I)Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityLinks$AccessibleLink;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityLinks;->mLinks:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityLinks$AccessibleLink;

    .line 18
    .line 19
    iget v2, v1, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityLinks$AccessibleLink;->id:I

    .line 20
    .line 21
    if-ne v2, p1, :cond_0

    .line 22
    .line 23
    return-object v1

    .line 24
    :cond_1
    const/4 p1, 0x0

    .line 25
    return-object p1
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

.method public getLinkBySpanPos(II)Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityLinks$AccessibleLink;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityLinks;->mLinks:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityLinks$AccessibleLink;

    .line 18
    .line 19
    iget v2, v1, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityLinks$AccessibleLink;->start:I

    .line 20
    .line 21
    if-ne v2, p1, :cond_0

    .line 22
    .line 23
    iget v2, v1, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityLinks$AccessibleLink;->end:I

    .line 24
    .line 25
    if-ne v2, p2, :cond_0

    .line 26
    .line 27
    return-object v1

    .line 28
    :cond_1
    const/4 p1, 0x0

    .line 29
    return-object p1
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

.method public size()I
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityLinks;->mLinks:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
