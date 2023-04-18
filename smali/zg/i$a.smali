.class final Lzg/i$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Llh/f;

.field private final b:Lch/g;


# direct methods
.method public constructor <init>(Llh/f;Lch/g;)V
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lzg/i$a;->a:Llh/f;

    .line 10
    .line 11
    iput-object p2, p0, Lzg/i$a;->b:Lch/g;

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
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method


# virtual methods
.method public final a()Lch/g;
    .locals 1

    iget-object v0, p0, Lzg/i$a;->b:Lch/g;

    return-object v0
.end method

.method public final b()Llh/f;
    .locals 1

    iget-object v0, p0, Lzg/i$a;->a:Llh/f;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lzg/i$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzg/i$a;->a:Llh/f;

    check-cast p1, Lzg/i$a;

    iget-object p1, p1, Lzg/i$a;->a:Llh/f;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lzg/i$a;->a:Llh/f;

    invoke-virtual {v0}, Llh/f;->hashCode()I

    move-result v0

    return v0
.end method
