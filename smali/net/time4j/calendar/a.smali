.class abstract Lnet/time4j/calendar/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/u;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<C:",
        "Lnet/time4j/calendar/f<",
        "*TC;>;>",
        "Ljava/lang/Object;",
        "Lfj/u<",
        "TC;>;"
    }
.end annotation


# instance fields
.field private final k:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TC;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TC;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/time4j/calendar/a;->k:Ljava/lang/Class;

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
.method public a()Lfj/f0;
    .locals 1

    sget-object v0, Lfj/f0;->a:Lfj/f0;

    return-object v0
.end method

.method public b(Lnet/time4j/calendar/f;Lfj/d;)Lfj/o;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;",
            "Lfj/d;",
            ")",
            "Lfj/o;"
        }
    .end annotation

    return-object p1
.end method

.method public d()Lfj/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfj/x<",
            "*>;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public g(Lfj/y;Ljava/util/Locale;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "chinese"

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, Lnet/time4j/calendar/service/a;->a(Ljava/lang/String;Lfj/y;Ljava/util/Locale;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method public j()I
    .locals 1

    const/16 v0, 0x64

    return v0
.end method

.method public bridge synthetic k(Ljava/lang/Object;Lfj/d;)Lfj/o;
    .locals 0

    check-cast p1, Lnet/time4j/calendar/f;

    invoke-virtual {p0, p1, p2}, Lnet/time4j/calendar/a;->b(Lnet/time4j/calendar/f;Lfj/d;)Lfj/o;

    move-result-object p1

    return-object p1
.end method
