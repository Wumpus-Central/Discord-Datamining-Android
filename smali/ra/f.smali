.class final Lra/f;
.super Lra/b0;
.source "SourceFile"


# instance fields
.field private final transient m:[Ljava/lang/Object;

.field private final transient n:I

.field private final transient o:I


# direct methods
.method constructor <init>([Ljava/lang/Object;II)V
    .locals 0

    invoke-direct {p0}, Lra/b0;-><init>()V

    iput-object p1, p0, Lra/f;->m:[Ljava/lang/Object;

    iput p2, p0, Lra/f;->n:I

    iput p3, p0, Lra/f;->o:I

    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lra/f;->o:I

    .line 2
    .line 3
    const-string v1, "index"

    .line 4
    .line 5
    invoke-static {p1, v0, v1}, Lra/t;->a(IILjava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lra/f;->m:[Ljava/lang/Object;

    .line 9
    .line 10
    add-int/2addr p1, p1

    .line 11
    iget v1, p0, Lra/f;->n:I

    .line 12
    .line 13
    add-int/2addr p1, v1

    .line 14
    aget-object p1, v0, p1

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    return-object p1
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method final l()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lra/f;->o:I

    return v0
.end method
