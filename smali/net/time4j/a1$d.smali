.class Lnet/time4j/a1$d;
.super Lnet/time4j/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/a1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnet/time4j/o<",
        "Lnet/time4j/f0;",
        ">;"
    }
.end annotation


# instance fields
.field private final m:J

.field private final n:Lfj/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/v<",
            "Lnet/time4j/h0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(J)V
    .locals 2

    .line 2
    sget-object v0, Lnet/time4j/a1;->q:Lnet/time4j/a1;

    const/16 v1, 0x8

    invoke-direct {p0, v0, v1}, Lnet/time4j/o;-><init>(Lfj/p;I)V

    .line 3
    iput-wide p1, p0, Lnet/time4j/a1$d;->m:J

    .line 4
    new-instance p1, Lnet/time4j/a1$d$a;

    invoke-direct {p1, p0}, Lnet/time4j/a1$d$a;-><init>(Lnet/time4j/a1$d;)V

    iput-object p1, p0, Lnet/time4j/a1$d;->n:Lfj/v;

    return-void
.end method

.method synthetic constructor <init>(JLnet/time4j/a1$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lnet/time4j/a1$d;-><init>(J)V

    return-void
.end method

.method static synthetic b(Lnet/time4j/a1$d;)J
    .locals 2

    iget-wide v0, p0, Lnet/time4j/a1$d;->m:J

    return-wide v0
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/f0;

    invoke-virtual {p0, p1}, Lnet/time4j/a1$d;->c(Lnet/time4j/f0;)Lnet/time4j/f0;

    move-result-object p1

    return-object p1
.end method

.method public c(Lnet/time4j/f0;)Lnet/time4j/f0;
    .locals 3

    .line 1
    invoke-static {}, Lnet/time4j/a1;->O()Lfj/m0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-wide v1, p0, Lnet/time4j/a1$d;->m:J

    .line 6
    .line 7
    invoke-interface {v0, p1, v1, v2}, Lfj/m0;->b(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lnet/time4j/f0;

    .line 12
    .line 13
    return-object p1
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
