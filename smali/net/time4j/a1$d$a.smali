.class Lnet/time4j/a1$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/v;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/time4j/a1$d;-><init>(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lfj/v<",
        "Lnet/time4j/h0;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Lnet/time4j/a1$d;


# direct methods
.method constructor <init>(Lnet/time4j/a1$d;)V
    .locals 0

    iput-object p1, p0, Lnet/time4j/a1$d$a;->k:Lnet/time4j/a1$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lnet/time4j/h0;)Lnet/time4j/h0;
    .locals 3

    .line 1
    invoke-static {}, Lnet/time4j/a1;->O()Lfj/m0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lnet/time4j/a1$d$a;->k:Lnet/time4j/a1$d;

    .line 6
    .line 7
    invoke-static {v1}, Lnet/time4j/a1$d;->b(Lnet/time4j/a1$d;)J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    invoke-interface {v0, p1, v1, v2}, Lfj/m0;->b(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lnet/time4j/h0;

    .line 16
    .line 17
    return-object p1
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

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/h0;

    invoke-virtual {p0, p1}, Lnet/time4j/a1$d$a;->a(Lnet/time4j/h0;)Lnet/time4j/h0;

    move-result-object p1

    return-object p1
.end method
