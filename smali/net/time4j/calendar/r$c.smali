.class Lnet/time4j/calendar/r$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/v;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/calendar/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lfj/q<",
        "TT;>;>",
        "Ljava/lang/Object;",
        "Lfj/v<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final k:Z


# direct methods
.method constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lnet/time4j/calendar/r$c;->k:Z

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
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
.end method


# virtual methods
.method public a(Lfj/q;)Lfj/q;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)TT;"
        }
    .end annotation

    .line 1
    sget-object v0, Lfj/a0;->k:Lfj/a0;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/Long;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    iget-boolean v3, p0, Lnet/time4j/calendar/r$c;->k:Z

    .line 14
    .line 15
    const-wide/16 v4, 0x7

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    sub-long/2addr v1, v4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    add-long/2addr v1, v4

    .line 22
    :goto_0
    invoke-virtual {p1, v0, v1, v2}, Lfj/q;->D(Lfj/p;J)Lfj/q;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
    .line 27
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/r$c;->a(Lfj/q;)Lfj/q;

    move-result-object p1

    return-object p1
.end method
