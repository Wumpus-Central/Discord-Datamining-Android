.class Landroidx/recyclerview/widget/GapWorker$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/GapWorker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Landroidx/recyclerview/widget/GapWorker$b;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroidx/recyclerview/widget/GapWorker$b;Landroidx/recyclerview/widget/GapWorker$b;)I
    .locals 6

    .line 1
    iget-object v0, p1, Landroidx/recyclerview/widget/GapWorker$b;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    move v3, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v3, v1

    .line 10
    :goto_0
    iget-object v4, p2, Landroidx/recyclerview/widget/GapWorker$b;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 11
    .line 12
    if-nez v4, :cond_1

    .line 13
    .line 14
    move v4, v2

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    move v4, v1

    .line 17
    :goto_1
    const/4 v5, -0x1

    .line 18
    if-eq v3, v4, :cond_3

    .line 19
    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_2
    move v2, v5

    .line 24
    :goto_2
    return v2

    .line 25
    :cond_3
    iget-boolean v0, p1, Landroidx/recyclerview/widget/GapWorker$b;->a:Z

    .line 26
    .line 27
    iget-boolean v3, p2, Landroidx/recyclerview/widget/GapWorker$b;->a:Z

    .line 28
    .line 29
    if-eq v0, v3, :cond_5

    .line 30
    .line 31
    if-eqz v0, :cond_4

    .line 32
    .line 33
    move v2, v5

    .line 34
    :cond_4
    return v2

    .line 35
    :cond_5
    iget v0, p2, Landroidx/recyclerview/widget/GapWorker$b;->b:I

    .line 36
    .line 37
    iget v2, p1, Landroidx/recyclerview/widget/GapWorker$b;->b:I

    .line 38
    .line 39
    sub-int/2addr v0, v2

    .line 40
    if-eqz v0, :cond_6

    .line 41
    .line 42
    return v0

    .line 43
    :cond_6
    iget p1, p1, Landroidx/recyclerview/widget/GapWorker$b;->c:I

    .line 44
    .line 45
    iget p2, p2, Landroidx/recyclerview/widget/GapWorker$b;->c:I

    .line 46
    .line 47
    sub-int/2addr p1, p2

    .line 48
    if-eqz p1, :cond_7

    .line 49
    .line 50
    return p1

    .line 51
    :cond_7
    return v1
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
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Landroidx/recyclerview/widget/GapWorker$b;

    check-cast p2, Landroidx/recyclerview/widget/GapWorker$b;

    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/GapWorker$a;->a(Landroidx/recyclerview/widget/GapWorker$b;Landroidx/recyclerview/widget/GapWorker$b;)I

    move-result p1

    return p1
.end method
