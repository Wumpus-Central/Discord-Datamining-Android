.class Landroidx/recyclerview/widget/c$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private final a:[I

.field private final b:I


# direct methods
.method constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-array p1, p1, [I

    .line 5
    .line 6
    iput-object p1, p0, Landroidx/recyclerview/widget/c$c;->a:[I

    .line 7
    .line 8
    array-length p1, p1

    .line 9
    div-int/lit8 p1, p1, 0x2

    .line 10
    .line 11
    iput p1, p0, Landroidx/recyclerview/widget/c$c;->b:I

    .line 12
    .line 13
    return-void
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
.end method


# virtual methods
.method a()[I
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/c$c;->a:[I

    return-object v0
.end method

.method b(I)I
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/c$c;->a:[I

    iget v1, p0, Landroidx/recyclerview/widget/c$c;->b:I

    add-int/2addr p1, v1

    aget p1, v0, p1

    return p1
.end method

.method c(II)V
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/c$c;->a:[I

    iget v1, p0, Landroidx/recyclerview/widget/c$c;->b:I

    add-int/2addr p1, v1

    aput p2, v0, p1

    return-void
.end method
