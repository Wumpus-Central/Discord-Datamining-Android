.class Lnet/time4j/a0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/i0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lfj/i0<",
        "Lnet/time4j/a0;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lnet/time4j/a0$a;)V
    .locals 0

    invoke-direct {p0}, Lnet/time4j/a0$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lnet/time4j/a0;Lnet/time4j/a0;)I
    .locals 0

    invoke-virtual {p1, p2}, Lnet/time4j/a0;->b0(Lnet/time4j/a0;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lnet/time4j/a0;

    check-cast p2, Lnet/time4j/a0;

    invoke-virtual {p0, p1, p2}, Lnet/time4j/a0$b;->a(Lnet/time4j/a0;Lnet/time4j/a0;)I

    move-result p1

    return p1
.end method
