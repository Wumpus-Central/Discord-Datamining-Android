.class public final Li0/p;
.super Li0/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li0/p$b;,
        Li0/p$a;
    }
.end annotation


# instance fields
.field private final a:Li0/p$b;


# direct methods
.method constructor <init>(Li0/p$b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Li0/s;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "FileOutputOptionsInternal can\'t be null."

    .line 5
    .line 6
    invoke-static {p1, v0}, Landroidx/core/util/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Li0/p;->a:Li0/p$b;

    .line 10
    .line 11
    return-void
    .line 12
    .line 13
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
.method public a()J
    .locals 2

    iget-object v0, p0, Li0/p;->a:Li0/p$b;

    invoke-virtual {v0}, Li0/p$b;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method public b()Ljava/io/File;
    .locals 1

    iget-object v0, p0, Li0/p;->a:Li0/p$b;

    invoke-virtual {v0}, Li0/p$b;->a()Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, Li0/p;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_1
    iget-object v0, p0, Li0/p;->a:Li0/p$b;

    .line 12
    .line 13
    check-cast p1, Li0/p;

    .line 14
    .line 15
    iget-object p1, p1, Li0/p;->a:Li0/p$b;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
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

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Li0/p;->a:Li0/p$b;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Li0/p;->a:Li0/p$b;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FileOutputOptionsInternal"

    const-string v2, "FileOutputOptions"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
