.class final Lra/b;
.super Lra/b0;
.source "SourceFile"


# static fields
.field static final o:Lra/b0;


# instance fields
.field final transient m:[Ljava/lang/Object;

.field private final transient n:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lra/b;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-direct {v0, v2, v1}, Lra/b;-><init>([Ljava/lang/Object;I)V

    sput-object v0, Lra/b;->o:Lra/b0;

    return-void
.end method

.method constructor <init>([Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Lra/b0;-><init>()V

    iput-object p1, p0, Lra/b;->m:[Ljava/lang/Object;

    iput p2, p0, Lra/b;->n:I

    return-void
.end method


# virtual methods
.method final b([Ljava/lang/Object;I)I
    .locals 2

    iget-object p2, p0, Lra/b;->m:[Ljava/lang/Object;

    const/4 v0, 0x0

    iget v1, p0, Lra/b;->n:I

    invoke-static {p2, v0, p1, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lra/b;->n:I

    return p1
.end method

.method final e()I
    .locals 1

    iget v0, p0, Lra/b;->n:I

    return v0
.end method

.method final f()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lra/b;->n:I

    .line 2
    .line 3
    const-string v1, "index"

    .line 4
    .line 5
    invoke-static {p1, v0, v1}, Lra/t;->a(IILjava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lra/b;->m:[Ljava/lang/Object;

    .line 9
    .line 10
    aget-object p1, v0, p1

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    return-object p1
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
.end method

.method final l()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method final n()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lra/b;->m:[Ljava/lang/Object;

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lra/b;->n:I

    return v0
.end method
